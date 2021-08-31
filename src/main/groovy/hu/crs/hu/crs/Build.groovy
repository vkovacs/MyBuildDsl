package hu.crs.hu.crs

class Build {
    def project = new Project()

    static void main(String[] args) {
        new Build().build();
    }

    void build() {
        project.name = "asd"
        project.version = "1.0.0"

        println project
    }

}
