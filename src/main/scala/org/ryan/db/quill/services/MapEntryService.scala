package org.ryan.db.quill.services

import io.getquill._
import org.ryan.db.entity.{MapEntries, MapEntry}

object MapEntryService {
  lazy val ctx = new CassandraAsyncContext(LowerCase, "ctx")

  import ctx._

  def context = ctx

  def selectAll = quote {
    query[MapEntry]
  }

  def selectByKey = quote {
    (key: String) =>
      query[MapEntry].filter(_.key == key)
  }

}
