package org.ryan.lifecycle

class LifecycleOnStart extends LifecycleEvent {
  override def state: LifecycleState = OnStart()

  override def next: LifecycleEvent = new LifecycleOnReady
}
