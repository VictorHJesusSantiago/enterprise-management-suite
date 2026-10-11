package io.aerodyne.enterprise.generated.invoices;

public final class InvoicesCapability018 {
    public static final String MODULE = "invoices";
    public static final String CODE = "INVOICES-018";
    public static final String AREA = "Invoice processing";

    private InvoicesCapability018() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 018";
    }

    public static boolean requiresAudit() {
        return true;
    }
}