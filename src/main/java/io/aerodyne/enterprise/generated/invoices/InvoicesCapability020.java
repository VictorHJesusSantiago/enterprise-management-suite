package io.aerodyne.enterprise.generated.invoices;

public final class InvoicesCapability020 {
    public static final String MODULE = "invoices";
    public static final String CODE = "INVOICES-020";
    public static final String AREA = "Invoice processing";

    private InvoicesCapability020() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 020";
    }

    public static boolean requiresAudit() {
        return false;
    }
}