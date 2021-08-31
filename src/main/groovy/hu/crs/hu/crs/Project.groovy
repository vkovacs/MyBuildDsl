package hu.crs.hu.crs

class Project {
    def name
    def version
    List<Dependency> dependencies = new ArrayList<>()

    void dependencies(Dependency... dependencies) {
        for (Dependency dependency : dependencies) {
            this.dependencies.add(dependency)
        }
    }

    List<Dependency> getDependencies() {
        return dependencies
    }

    void setDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies
    }


    @Override
    public String toString() {
        return "Project{" +
                "name=" + name +
                ", version=" + version +
                ", dependencies=" + dependencies +
                '}';
    }
}
