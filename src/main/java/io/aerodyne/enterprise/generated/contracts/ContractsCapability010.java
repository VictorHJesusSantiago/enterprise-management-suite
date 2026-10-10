package io.aerodyne.enterprise.generated.contracts;

public final class ContractsCapability010 {
    public static final String MODULE = "contracts";
    public static final String CODE = "CONTRACTS-010";
    public static final String AREA = "Contract governance";

    private ContractsCapability010() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 010";
    }

    public static boolean requiresAudit() {
        return false;
    }
}