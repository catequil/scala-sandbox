package org.ryan.lifecycle

import monix.eval.Task

trait LifecycleModule {
  def name: String
  def start(event: LifecycleEvent): LifecycleEvent
  def stop(event: LifecycleEvent): LifecycleEvent
}
