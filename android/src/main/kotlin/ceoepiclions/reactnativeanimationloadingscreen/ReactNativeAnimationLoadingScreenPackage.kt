package ceoepiclions.reactnativeanimationloadingscreen

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager

import ceoepiclions.reactnativeanimationloadingscreen.animationloadingscreen.AnimationLoadingScreenManager

class ReactNativeAnimationLoadingScreenPackage : ReactPackage {
  override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
    return listOf()
  }

  override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
    return listOf(
      AnimationLoadingScreenManager()
    )
  }
}
