package io.aerodyne.enterprise.generated.contracts;

public final class ContractsCapability005 {
    public static final String MODULE = "contracts";
    public static final String CODE = "CONTRACTS-005";
    public static final String AREA = "Contract governance";

    private ContractsCapability005() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 005";
    }

    public static boolean requiresAudit() {
        return false;
    }
}