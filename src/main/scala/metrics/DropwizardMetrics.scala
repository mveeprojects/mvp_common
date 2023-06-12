package metrics

import metrics.DropwizardMetrics.myCustomMetric
import nl.grons.metrics4.scala._

trait DropwizardMetrics extends MyMetrics {

  def initialiseMetrics: Unit = ()

  def incrementMyCustomMetric: Unit = {
    println("Incrementing myCustomMetric")
    myCustomMetric.inc()
  }
}

object DropwizardMetrics extends DefaultInstrumented {
  val myCustomMetric: Counter = metrics.counter("my-custom-metric")
}
