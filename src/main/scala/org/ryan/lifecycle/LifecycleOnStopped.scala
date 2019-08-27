package org.ryan.lifecycle

class LifecycleOnStopped extends LifecycleEvent {
  override def state: LifecycleState = OnStopped()

  override def next: LifecycleEvent = new LifecycleOnStart
}
