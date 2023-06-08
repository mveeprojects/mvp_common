# Metrics

Below is an example of an Akka HTTP app extending the KamonMetrics trait in this package.
- Kamon metrics initialised on server startup, custom metric is incremented each time `localhost:8080/` is called.
- Metrics are surfaced to `localhost:9095/metrics` (default).

```scala
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Directives.{complete, get, _}
import akka.http.scaladsl.server.Route
import metrics.KamonMetrics

import scala.concurrent.ExecutionContext
import scala.util.{Failure, Success}

object Main extends App with KamonMetrics {

  implicit val system: ActorSystem        = ActorSystem("my-actor-system")
  implicit val executor: ExecutionContext = system.dispatcher

  val route: Route = concat(
    get {
      pathSingleSlash {
        incrementMyCustomMetric
        complete(StatusCodes.OK)
      }
    }
  )

  Http()
    .newServerAt("localhost", 8080)
    .bindFlow(route)
    .onComplete {
      case Success(_) =>
        initialiseKamon()
        println("App running")
      case Failure(ex) => println(s"App failed to start:\n${ex.getMessage}")
    }
}
```
