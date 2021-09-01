package hu.crs.hu.crs
//http://docs.groovy-lang.org/docs/latest/html/documentation/core-domain-specific-languages.html#TheDelegatesToannotation-DSLsmadeeasy
class Build {
    static def myProject = new Project()

    static void project(@DelegatesTo(value = Project, strategy = Closure.DELEGATE_FIRST) Closure closure) {
        def code = closure.rehydrate(myProject, this, this)
        code.resolveStrategy = Closure.DELEGATE_FIRST
        code()
    }
}
