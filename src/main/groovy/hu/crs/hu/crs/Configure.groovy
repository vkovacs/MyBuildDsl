package hu.crs.hu.crs

import static hu.crs.hu.crs.Build.project

// https://dzone.com/articles/groovy-dsl-simple-example
// https://www.youtube.com/watch?v=i9pNYW1Pg9A
// https://groovy-lang.org/closures.html#_delegate_of_a_closure
project {
    name = "asd"
    version = "1.0.0"

    dependencies {
        implementation"groupId0", "name0", "version0"
        implementation"groupId1", "name1", "version1"
    }
}
println Build.myProject