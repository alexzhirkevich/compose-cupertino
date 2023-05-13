package moe.tlaster.precompose.lifecycle

class LifecycleRegistry : Lifecycle {
    private val observers = arrayListOf<LifecycleObserver>()
    override var currentState: Lifecycle.State = Lifecycle.State.Initialized
        set(value) {
            if (field == Lifecycle.State.Destroyed || value == Lifecycle.State.Initialized) {
                return
            }
            field = value
            dispatchState(value)
        }

    private fun dispatchState(value: Lifecycle.State) {
        observers.toMutableList().forEach {
            it.onStateChanged(value)
        }
    }

    override fun removeObserver(observer: LifecycleObserver) {
        observers.remove(observer)
    }

    override fun addObserver(observer: LifecycleObserver) {
        observers.add(observer)
        observer.onStateChanged(currentState)
    }

    override fun hasObserver(): Boolean {
        return observers.isNotEmpty()
    }
}
