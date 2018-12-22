package org.ryan

import monix.execution.Scheduler.Implicits.global
import monix.eval.Task
import monix.reactive.Observable
import org.ryan.db.QuillConnector
import org.ryan.db.entity.MapEntry
import org.ryan.db.quill.services.MapEntryService

import scala.concurrent.Await
import scala.concurrent.duration._
import scala.util.{Failure, Success}

object Bootstrap {

  def main(args: Array[String]): Unit = {

//    //Datastax driver
//    val session = Connector.session
//
//    session.prepareAsync("select key, value from mapentry").

//    //Quill
//    import MapEntryService.ctx._
//
//    val mapEntries = run(MapEntryService.selectAll)
//
//    mapEntries.onComplete {
//      case Success(result) => result.foreach{ entry =>
//        println(s"${entry.key} : ${entry.value}")
//      }
//    }
//
//    val mapEntries2 = run(MapEntryService.selectByKey("key3"))
//
//    mapEntries2.onComplete{
//      case Success(result) => println(result.head.value)
//      case Failure(exception) => println("Unknown value")
//    }

//    //Phantom
//    val mapEntries = MapEntryService.selectAll
//
//    mapEntries.onComplete {
//      case Success(result) => result.foreach{ entry =>
//        println(s"${entry.key} : ${entry.value}")
//      }
//    }
//
//    val mapEntries2 = MapEntryService.selectByKey("key4")
//
//    mapEntries2.onComplete{
//      case Success(result) => println(result.get.value)
//      case Failure(exception) => println("Unknown value")
//    }

    System.exit(0)
  }
}
