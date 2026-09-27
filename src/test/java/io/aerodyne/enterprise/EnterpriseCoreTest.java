package io.aerodyne.enterprise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class EnterpriseCoreTest {
    @Test
    void enterpriseRecordUsesSafeDefaults() {
        EnterpriseRecord record = new EnterpriseRecord("er-1", "Monthly close", "Finance", null, null);

        assertEquals(BigDecimal.ZERO, record.amount());
        assertNotNull(record.dueDate());
    }

    @Test
    void auditTrailNowCapturesActorAndTimestamp() {
        AuditTrail event = AuditTrail.now("finance", "open", "victor");

        assertEquals("finance", event.module());
        assertEquals("open", event.action());
        assertEquals("victor", event.actor());
        assertNotNull(event.happenedAt());
    }
}
