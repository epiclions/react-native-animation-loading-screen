package ceoepiclions.reactnativeanimationloadingscreen.animationloadingscreen

import android.graphics.Color
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

@ReactModule(name = AnimationLoadingScreenManager.reactClass)
class AnimationLoadingScreenManager : SimpleViewManager<AnimationLoadingScreen>() {

  companion object {
    const val reactClass = "RNALSAnimationLoadingScreen"
  }

  override fun getName(): String {
    return reactClass
  }

  override fun createViewInstance(reactContext: ThemedReactContext): AnimationLoadingScreen {
    return AnimationLoadingScreen(reactContext)
  }

  @ReactProp(name = "color", customType = "Color", defaultInt = Color.RED)
  fun setColor(view: AnimationLoadingScreen, color: Int) {
    view.setColor(color)
  }
}
