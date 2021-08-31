package hu.crs.hu.crs

class Project {
    def name
    def version


    @Override
    String toString() {
        return "Project{" +
                "name=" + name +
                ", version=" + version +
                '}';
    }
}
