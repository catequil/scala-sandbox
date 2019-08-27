package org.ryan.lifecycle

class LifecycleOnReady extends LifecycleEvent {
  override def state: LifecycleState = OnReady()

  override def next: LifecycleEvent = new LifecycleOnStop
}
