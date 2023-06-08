# mvpcommon

Example of writing a library in Scala. To be extended in the future with common code.

### Build library and publish locally
```shell
sbt publishLocal
```

### Add library dependency to another project
```shell
libraryDependencies ++= Seq(
  "mveeprojects" %% "mvpcommon" % "0.1"
)
```

### Use as required
```scala
object Main extends App with MyTrait {
  override val saySomething = "Hi!"
  printSomething
}
```

**Note:** It is not necessary to rebuild projects using this library as a dependency each time the library is republished.

