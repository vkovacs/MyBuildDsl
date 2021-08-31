package hu.crs.hu.crs

import static hu.crs.hu.crs.Build.project

// https://dzone.com/articles/groovy-dsl-simple-example
project {
    name = "asd"
    version = "1.0.0"

    dependencies =
            [new Dependency("groupId0", "name0", "version0"),
             new Dependency("groupId1", "name1", "version1")]
}

println Build.myProject