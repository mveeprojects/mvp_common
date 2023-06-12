# mvp_common

Example of writing a library in Scala. To be extended in the future with common code.

### Build library and publish locally
```shell
sbt publishLocal
```

### Add library dependency to another project
```shell
libraryDependencies ++= Seq(
  "mveeprojects" %% "mvp_common" % "0.1"
)
```

### Use as required
```scala
object Main extends App with MyTrait {
  override val saySomething = "Hi!"
  printSomething
}
```

## Resources:
- https://stackoverflow.com/questions/35148590/how-to-make-a-scala-library
- https://stackoverflow.com/questions/24842257/how-do-i-create-a-custom-scala-library-using-sbt
- https://stackoverflow.com/questions/50145278/scala-create-and-use-local-library
