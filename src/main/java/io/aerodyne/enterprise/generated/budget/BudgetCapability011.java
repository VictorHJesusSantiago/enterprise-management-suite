package io.aerodyne.enterprise.generated.budget;

public final class BudgetCapability011 {
    public static final String MODULE = "budget";
    public static final String CODE = "BUDGET-011";
    public static final String AREA = "Budget planning and control";

    private BudgetCapability011() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 011";
    }

    public static boolean requiresAudit() {
        return false;
    }
}