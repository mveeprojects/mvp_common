package metrics

import kamon.Kamon
import kamon.metric.Gauge
import metrics.KamonMetrics.myCustomMetric

trait KamonMetrics {
  def initialiseKamon(): Unit = Kamon.init()
  def incrementMyCustomMetric: Gauge = {
    println("Incrementing myCustomMetric")
    myCustomMetric.increment()
  }
}

object KamonMetrics {
  val myCustomMetric: Gauge = Kamon.gauge("my-custom-metric").withoutTags()
}
