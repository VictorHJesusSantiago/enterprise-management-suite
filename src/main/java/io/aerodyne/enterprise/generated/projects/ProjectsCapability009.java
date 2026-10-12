package io.aerodyne.enterprise.generated.projects;

public final class ProjectsCapability009 {
    public static final String MODULE = "projects";
    public static final String CODE = "PROJECTS-009";
    public static final String AREA = "Project delivery";

    private ProjectsCapability009() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 009";
    }

    public static boolean requiresAudit() {
        return true;
    }
}