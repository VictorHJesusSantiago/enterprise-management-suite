package io.aerodyne.enterprise.generated.invoices;

public final class InvoicesCapability014 {
    public static final String MODULE = "invoices";
    public static final String CODE = "INVOICES-014";
    public static final String AREA = "Invoice processing";

    private InvoicesCapability014() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 014";
    }

    public static boolean requiresAudit() {
        return false;
    }
}