package org.ryan.db.phantom

import com.datastax.driver.core.SocketOptions
import com.outworkers.phantom.dsl._

object PhantomConnector {
  val default: CassandraConnection = ContactPoint.local
    .withClusterBuilder(_.withSocketOptions(
      new SocketOptions()
        .setConnectTimeoutMillis(20000)
        .setReadTimeoutMillis(20000)
    )
    ).noHeartbeat().keySpace(
      KeySpace("ryan").ifNotExists().option(
        replication eqs SimpleStrategy.replication_factor(1)
    )
  )
}
