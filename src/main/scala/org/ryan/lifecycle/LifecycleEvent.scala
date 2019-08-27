package org.ryan.lifecycle

trait LifecycleEvent {
  def state: LifecycleState
  def next: LifecycleEvent

  def execute(action: (String) => Unit, moduleName: String): LifecycleEvent = {
    action(moduleName)
    next
  }
}
