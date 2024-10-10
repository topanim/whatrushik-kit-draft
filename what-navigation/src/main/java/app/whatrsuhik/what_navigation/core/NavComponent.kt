package app.whatrsuhik.what_navigation.core

import app.whatrsuhik.what_foundation.core.UIComponent

interface NavComponent<P : NavProvider> : UIComponent {
    val data: P
}