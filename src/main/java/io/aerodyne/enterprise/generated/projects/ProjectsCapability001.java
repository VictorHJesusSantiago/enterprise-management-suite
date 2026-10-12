package io.aerodyne.enterprise.generated.projects;

public final class ProjectsCapability001 {
    public static final String MODULE = "projects";
    public static final String CODE = "PROJECTS-001";
    public static final String AREA = "Project delivery";

    private ProjectsCapability001() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 001";
    }

    public static boolean requiresAudit() {
        return false;
    }
}