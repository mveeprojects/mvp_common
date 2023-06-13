# Config

Common code for config (using pureconfig).

```scala
import config.HTTPPureConfig
import logging.MVPLogging
...

object Main extends App with HTTPPureConfig with MVPLogging {
  Http()
    .newServerAt(httpConfig.http.hostname, httpConfig.http.port)
    .bindFlow(route)
    .onComplete {
      case Success(_) =>
        logger.info(s"App running (${httpConfig.http.hostname}:${httpConfig.http.port})")
      case Failure(ex) => logger.error(s"App failed to start:\n${ex.getMessage}")
    }
}
```
