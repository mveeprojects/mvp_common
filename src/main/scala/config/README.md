# Config

Common code for config (using pureconfig).

```scala
...
import config.AppConfig
...

object Main extends App with AppConfig {
  Http()
    .newServerAt(httpConfig.http.hostname, httpConfig.http.port)
    .bindFlow(route)
    .onComplete {
      case Success(_) =>
        Kamon.init
        logger.info(s"App running (${httpConfig.http.hostname}:${httpConfig.http.port})")
      case Failure(ex) => logger.error(s"App failed to start:\n${ex.getMessage}")
    }
}
```
