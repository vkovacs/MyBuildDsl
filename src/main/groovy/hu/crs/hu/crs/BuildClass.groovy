package hu.crs.hu.crs

//http://docs.groovy-lang.org/docs/latest/html/documentation/core-domain-specific-languages.html#TheDelegatesToannotation-DSLsmadeeasy
class Build {
    def myProject = new Project()

    static void main(String[] args) {
        new Build().build();
    }

    void project(Closure closure) {
        def code = closure.rehydrate(myProject, this, this)
        code.resolveStrategy = Closure.DELEGATE_ONLY
        code()
    }

    void build() {
        project {
            name = "asd"
            version = "1.0.0"
        }

        println myProject
    }

}
