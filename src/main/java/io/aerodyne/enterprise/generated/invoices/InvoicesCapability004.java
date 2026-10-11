package io.aerodyne.enterprise.generated.invoices;

public final class InvoicesCapability004 {
    public static final String MODULE = "invoices";
    public static final String CODE = "INVOICES-004";
    public static final String AREA = "Invoice processing";

    private InvoicesCapability004() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 004";
    }

    public static boolean requiresAudit() {
        return false;
    }
}