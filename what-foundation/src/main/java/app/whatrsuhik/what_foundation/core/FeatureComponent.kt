package app.whatrsuhik.what_foundation.core

abstract class FeatureComponent<Ctrl : UIController<*, *, Event>, Event : Any> : UIComponent {
    protected abstract val controller: Ctrl
    protected val listener: (Event) -> Unit by lazy { controller::obtainEvent }
}