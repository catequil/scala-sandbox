package org.ryan.db

import com.datastax.driver.core.{Session, Cluster}


trait CassandraConnector {

  val cluster = Connector.cluster
  implicit lazy val session = Connector.session
}

object Connector {
  val keySpace = "ryan"
  val cluster = Cluster.builder().addContactPoint("localhost").build()
  val session = cluster.connect(keySpace)

}
