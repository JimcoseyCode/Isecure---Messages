package com.swmansion.worklets.runloop;

import com.facebook.jni.HybridData;
import q3.InterfaceC3112a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class AnimationFrameCallback {

    @InterfaceC3112a
    private final HybridData mHybridData;

    @InterfaceC3112a
    private AnimationFrameCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void onAnimationFrame(double d10);
}
