package io.aerodyne.enterprise.generated.projects;

public final class ProjectsCapability002 {
    public static final String MODULE = "projects";
    public static final String CODE = "PROJECTS-002";
    public static final String AREA = "Project delivery";

    private ProjectsCapability002() {
    }

    public static String module() {
        return MODULE;
    }

    public static String code() {
        return CODE;
    }

    public static String label() {
        return AREA + " capability 002";
    }

    public static boolean requiresAudit() {
        return false;
    }
}