package metrics

import kamon.Kamon
import kamon.metric.Counter
import metrics.KamonMetrics.myCustomMetric

trait KamonMetrics extends MyMetrics {
  def initialiseMetrics: Unit = Kamon.init()
  def incrementMyCustomMetric: Unit = {
    println("Incrementing myCustomMetric")
    myCustomMetric.increment()
  }
}

object KamonMetrics {
  val myCustomMetric: Counter = Kamon.counter("my-custom-metric").withoutTags()
}
