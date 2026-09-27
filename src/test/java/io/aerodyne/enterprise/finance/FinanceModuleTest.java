package io.aerodyne.enterprise.finance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class FinanceModuleTest {
    @Test
    void serviceOpensValidRecordsUnderReview() {
        FinanceRepository repository = new FinanceRepository();
        FinanceService service = new FinanceService(repository);

        FinanceRecord record = service.open(
                "fin-1",
                "Supplier settlement",
                "Treasury",
                new BigDecimal("1250.75"),
                LocalDate.of(2026, 9, 30));

        assertEquals(FinanceStatus.UNDER_REVIEW, record.status());
        assertEquals(1, repository.count());
        assertEquals(record, service.list().getFirst());
    }

    @Test
    void validatorRejectsBlankBusinessFields() {
        FinanceRepository repository = new FinanceRepository();
        FinanceService service = new FinanceService(repository);

        IllegalArgumentException failure = assertThrows(
                IllegalArgumentException.class,
                () -> service.open("fin-2", " ", "", BigDecimal.TEN, LocalDate.now()));

        assertTrue(failure.getMessage().contains("title"));
        assertTrue(failure.getMessage().contains("owner"));
        assertEquals(0, repository.count());
    }

    @Test
    void workflowAdvancesOnlyApprovedReviews() {
        FinanceWorkflow workflow = new FinanceWorkflow();

        assertEquals(FinanceStatus.UNDER_REVIEW, workflow.next(FinanceStatus.DRAFT, false));
        assertEquals(FinanceStatus.UNDER_REVIEW, workflow.next(FinanceStatus.UNDER_REVIEW, false));
        assertEquals(FinanceStatus.APPROVED, workflow.next(FinanceStatus.UNDER_REVIEW, true));
        assertEquals(FinanceStatus.POSTED, workflow.next(FinanceStatus.APPROVED, true));
    }

    @Test
    void reportSummarizesRecordCountAndAmount() {
        FinanceRepository repository = new FinanceRepository();
        FinanceService service = new FinanceService(repository);

        service.open("fin-3", "Invoice batch", "Accounts payable", new BigDecimal("200.00"), LocalDate.now());
        service.open("fin-4", "Tax reserve", "Controllership", new BigDecimal("50.25"), LocalDate.now());

        FinanceReport report = FinanceReport.from(service.list());

        assertEquals(2, report.totalRecords());
        assertEquals(new BigDecimal("250.25"), report.totalAmount());
        assertEquals("financeiro e tesouraria", report.description());
    }
}
