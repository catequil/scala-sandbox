package org.ryan.db.phantom.services

import org.ryan.db.phantom.RyanDB
import org.ryan.db.entity.MapEntry

import scala.concurrent.Future

trait MapEntryService extends RyanDB.Connector {
  def selectAll: Future[List[MapEntry]] = {
    RyanDB.mapEntries.select(_.key, _.value).fetch()
  }
}
