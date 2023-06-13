# mvp_common

Common code that I frequently use in my projects, consolidated into a library for ease of use and central dependency management.

---------

## Packages

### Config

Configuration classes written using PureConfig to consume common configuration items from application.conf.

### Logging

Logging trait to add a class-specific logger.

### Metrics

Metrics implementations under a common trait. Currently this is only Kamon, however DropWizard/other is a work in progress.

---------

## Usage

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


---------

## Resources
- https://stackoverflow.com/questions/35148590/how-to-make-a-scala-library
- https://stackoverflow.com/questions/24842257/how-do-i-create-a-custom-scala-library-using-sbt
- https://stackoverflow.com/questions/50145278/scala-create-and-use-local-library
