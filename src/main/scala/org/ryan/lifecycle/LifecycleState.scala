package org.ryan.lifecycle

trait LifecycleState

case class OnStart() extends LifecycleState
case class OnReady() extends LifecycleState
case class OnStop() extends LifecycleState
case class OnStopped() extends LifecycleState
