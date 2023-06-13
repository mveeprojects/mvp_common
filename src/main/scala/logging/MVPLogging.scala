package logging

import org.slf4j.{Logger, LoggerFactory}

trait MVPLogging {
  val logger: Logger = LoggerFactory.getLogger(this.getClass.getName)
}
