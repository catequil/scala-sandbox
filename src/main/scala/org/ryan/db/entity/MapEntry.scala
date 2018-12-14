package org.ryan.db.entity

import com.outworkers.phantom.dsl._

case class MapEntry(key: String, value: String)

abstract class MapEntries extends Table[MapEntries, MapEntry] {
  object key extends StringColumn with PartitionKey
  object value extends StringColumn
}


