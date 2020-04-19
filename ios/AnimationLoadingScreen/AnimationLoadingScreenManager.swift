import Foundation

@objc (RNALSAnimationLoadingScreenManager)
class AnimationLoadingScreenManager: RCTViewManager {

  override func view() -> UIView! {
    return AnimationLoadingScreen()
  }
}
