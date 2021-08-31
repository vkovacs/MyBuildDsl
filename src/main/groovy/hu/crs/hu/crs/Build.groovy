package hu.crs.hu.crs
//http://docs.groovy-lang.org/docs/latest/html/documentation/core-domain-specific-languages.html#TheDelegatesToannotation-DSLsmadeeasy
class Build {
    static def myProject = new Project()

    static void project(Closure closure) {
        def code = closure.rehydrate(myProject, this, this)
        code.resolveStrategy = Closure.DELEGATE_ONLY
        code()
    }
}
