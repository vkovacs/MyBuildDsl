package hu.crs.hu.crs

class Dependencies {
    List<Dependency> dependencies = new ArrayList<>()

    void implementation(String groupId, String artifactId, String version) {
        dependencies << new Dependency(groupId, artifactId, version)
    }

    @Override
    public String toString() {
        return "Dependencies{" +
                "dependencies=" + dependencies +
                '}';
    }
}
