package org.ryan

import monix.execution.Scheduler.Implicits.global
import monix.eval.Task
import monix.reactive.Observable
import org.ryan.db.phantom.services.MapEntryService

import scala.concurrent.Await
import scala.concurrent.duration._
import scala.util.Success

object Bootstrap {

  def main(args: Array[String]): Unit = {

    val mapEntries = MapEntryService.selectAll

    mapEntries.onComplete {
      case Success(result) => result.foreach{ entry =>
        println(s"${entry.key} : ${entry.value}")
      }
    }


//    val task = Task(MapEntryService.selectAll)
//
//    val future = task.runToFuture
//
//    Await.result(future, 5.seconds)
//
//    val tick = {
//      Observable.interval(1.second)
//        .filter(_ % 2 == 0)
//        .map(_ * 2)
//        .flatMap(x => Observable.fromIterable(Seq(x,x)))
//        .take(5)
//        .dump("Out")
//    }
//    val cancelable = tick.subscribe()
  }
}
