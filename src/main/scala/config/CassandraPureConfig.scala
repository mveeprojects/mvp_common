package config

import config.CassandraPureConfig.Config
import pureconfig.ConfigSource
import pureconfig.generic.auto._

/*
  # Example config (application.conf)
  cassandra {
    host = "localhost"
    host = ${?cassandra_host}
    port = 9042
    datacentre = "datacenter1"
    keyspace = "testkeyspace"
    replicas = 1
    tablename = "test_table"
  }
 */

trait CassandraPureConfig {
  val cassandraConfig: Config = ConfigSource.default.loadOrThrow[Config]
}

object CassandraPureConfig {

  case class CassandraConfig(
      host: String,
      port: Int,
      datacentre: String,
      keyspace: String,
      replicas: Int,
      tablename: String
  )

  case class Config(cassandra: CassandraConfig)
}
