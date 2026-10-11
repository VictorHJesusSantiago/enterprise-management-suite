package io.aerodyne.enterprise.generated.invoices;

public final class InvoicesCapability026 {
    public static final String MODULE = "invoices";
    public static final String CODE = "INVOICES-026";
    public static final String AREA = "Invoice processing";

    private InvoicesCapability026() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 026";
    }

    public static boolean requiresAudit() {
        return false;
    }
}