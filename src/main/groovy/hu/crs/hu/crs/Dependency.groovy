package hu.crs.hu.crs

class Dependency {
    String groupId
    String artifactId
    String version

    Dependency(String groupId, String artifactId, String version) {
        this.groupId = groupId
        this.artifactId = artifactId
        this.version = version
    }


    @Override
    public String toString() {
        return "Dependency{" +
                "groupId='" + groupId + '\'' +
                ", artifactId='" + artifactId + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
