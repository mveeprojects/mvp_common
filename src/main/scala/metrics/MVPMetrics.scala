package metrics

trait MVPMetrics {
  def initialiseMetrics(): Unit
  def incrementMyCustomMetric(): Unit
}
