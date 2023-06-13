# Config

Common code for config (using pureconfig).

```scala
import config.HTTPPureConfig
...

object Main extends App with HTTPPureConfig {
  Http()
    .newServerAt(httpConfig.http.hostname, httpConfig.http.port)
    .bindFlow(route)
    .onComplete {
      case Success(_) =>
        println(s"App running (${httpConfig.http.hostname}:${httpConfig.http.port})")
      case Failure(ex) => println(s"App failed to start:\n${ex.getMessage}")
    }
}
```
