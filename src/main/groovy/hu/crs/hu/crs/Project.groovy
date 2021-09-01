package hu.crs.hu.crs

class Project {
    def name
    def version
    Dependencies dependencies = new Dependencies()

    void dependencies(@DelegatesTo(value = Dependencies, strategy = Closure.DELEGATE_FIRST) Closure closure) {
        closure.delegate = dependencies
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
    }

    @Override
    String toString() {
        return "Project{" +
                "name=" + name +
                ", version=" + version +
                ", dependencies=" + dependencies +
                '}';
    }
}
