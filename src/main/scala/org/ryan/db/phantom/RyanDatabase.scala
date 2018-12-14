package org.ryan.db.phantom

import com.outworkers.phantom.dsl._
import org.ryan.db.entity.MapEntries

class RyanDatabase(override val connector: CassandraConnection) extends Database[RyanDatabase](connector) {
  object mapEntries extends MapEntries with Connector
}

object RyanDB extends RyanDatabase(PhantomConnector.default)
