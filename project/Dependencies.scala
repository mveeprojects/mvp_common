import sbt._

object Dependencies {

  val kamon  = "2.6.0"
  val kanela = "1.0.17"

  val kamonMetricsDependencies: Seq[ModuleID] = Seq(
    "io.kamon" %% "kamon-core"           % kamon,
    "io.kamon" %% "kamon-akka-http"      % kamon,
    "io.kamon" %% "kamon-system-metrics" % kamon,
    "io.kamon" %% "kamon-prometheus"     % kamon,
    "io.kamon"  % "kanela-agent"         % kanela
  )
}
