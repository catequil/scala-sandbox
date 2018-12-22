package org.ryan.db

import com.datastax.driver.core.Cluster


trait CassandraQuillConnector {

  val cluster = QuillConnector.cluster
  implicit lazy val session = QuillConnector.session
}

object QuillConnector {
  val keySpace = "ryan"
  val cluster = Cluster.builder().addContactPoint("localhost").build()
  val session = cluster.connect(keySpace)

}
