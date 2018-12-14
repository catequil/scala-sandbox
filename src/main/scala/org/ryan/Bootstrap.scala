package org.ryan

import monix.execution.Scheduler.Implicits.global

import monix.eval.Task
import monix.reactive.Observable

import scala.concurrent.Await
import scala.concurrent.duration._

object Bootstrap {

  def main(args: Array[String]): Unit = {

    val task = Task { 1 + 1 }

    val future = task.runToFuture

    Await.result(future, 5.seconds)

    val tick = {
      Observable.interval(1.second)
        .filter(_ % 2 == 0)
        .map(_ * 2)
        .flatMap(x => Observable.fromIterable(Seq(x,x)))
        .take(5)
        .dump("Out")
    }
    val cancelable = tick.subscribe()
  }
}
