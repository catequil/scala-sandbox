package org.ryan.lifecycle

case class LifecycleManager(modules: List[LifecycleModule])

object Boot {

  def main(args: Array[String]): Unit = {
    import LifecycleManager._

    val lifecycleModules: List[LifecycleModule] = List(new LifecycleRestModule, new LifecycleReplicator)

    val lifecycleManager = new LifecycleManager(lifecycleModules)
    lifecycleManager.modules.foreach{ module =>
      val onStart = module.start(new LifecycleOnStart)
      onStart.execute(sayCompletedOnReady, module.name)

    }

    lifecycleManager.modules.foreach{ module =>
      val onStop = module.stop(new LifecycleOnStop)
      onStop.execute(sayCompletedOnStopped, module.name)

    }

  }
}

class LifecycleRestModule extends LifecycleModule {
  import LifecycleManager._

  override def start(event: LifecycleEvent): LifecycleEvent = {
    event.execute(sayCompletedOnStart, name)
  }

  override def stop(event: LifecycleEvent): LifecycleEvent = {
    event.execute(sayCompletedOnStop, name)
  }

  override def name: String = "Rest Server"
}

class LifecycleReplicator extends LifecycleModule {
  import LifecycleManager._

  override def start(event: LifecycleEvent): LifecycleEvent = {
    event.execute(sayCompletedOnStart, name)
  }

  override def stop(event: LifecycleEvent): LifecycleEvent = {
    event.execute(sayCompletedOnStop, name)
  }

  override def name: String = "Cassandra Replicator"
}

object LifecycleManager {

  def sayCompletedOnStart(name: String): Unit = {
    println(s"Completed OnStart of $name")
  }

  def sayCompletedOnStop(name: String): Unit = {
    println(s"Completed OnStop of $name")
  }

  def sayCompletedOnReady(name: String): Unit = {
    println(s"Completed OnReady of $name")
  }

  def sayCompletedOnStopped(name: String): Unit = {
    println(s"Completed OnStopped of $name")
  }
}
