package org.ryan.db.phantom.services

import org.ryan.db.phantom.RyanDB
import org.ryan.db.entity.MapEntry

import com.outworkers.phantom.dsl._
import scala.concurrent.Future

trait MapEntryService extends RyanDB.Connector {
  def selectAll: Future[List[MapEntry]] = {
    RyanDB.mapEntries.select.fetch()
  }

  def selectByKey(key: String): Future[Option[MapEntry]] = {
    RyanDB.mapEntries.select.where(_.key eqs key).one()
  }
}

object MapEntryService extends MapEntryService {

}
