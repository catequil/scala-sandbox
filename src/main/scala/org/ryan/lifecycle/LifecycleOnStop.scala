package org.ryan.lifecycle

class LifecycleOnStop extends LifecycleEvent {
  override def state: LifecycleState = OnStop()

  override def next: LifecycleEvent = new LifecycleOnStopped
}
