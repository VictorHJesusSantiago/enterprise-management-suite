package io.aerodyne.enterprise.generated.contracts;

public final class ContractsCapability006 {
    public static final String MODULE = "contracts";
    public static final String CODE = "CONTRACTS-006";
    public static final String AREA = "Contract governance";

    private ContractsCapability006() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 006";
    }

    public static boolean requiresAudit() {
        return true;
    }
}