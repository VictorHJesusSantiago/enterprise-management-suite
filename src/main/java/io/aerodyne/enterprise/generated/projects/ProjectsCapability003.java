package io.aerodyne.enterprise.generated.projects;

public final class ProjectsCapability003 {
    public static final String MODULE = "projects";
    public static final String CODE = "PROJECTS-003";
    public static final String AREA = "Project delivery";

    private ProjectsCapability003() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 003";
    }

    public static boolean requiresAudit() {
        return true;
    }
}