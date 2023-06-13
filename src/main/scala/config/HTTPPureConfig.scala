package config

import config.HTTPPureConfig.Config
import pureconfig.ConfigSource
import pureconfig.generic.auto._

/*
  # Example config (application.conf)
  http {
    hostname = "0.0.0.0"
    port = 8080
  }
 */

trait HTTPPureConfig {
  val httpConfig: Config = ConfigSource.default.loadOrThrow[Config]
}

object HTTPPureConfig {
  case class HttpConfig(hostname: String, port: Int)
  case class Config(http: HttpConfig)
}
