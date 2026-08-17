package com.swmansion.rnscreens;

import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;

/* JADX INFO: renamed from: com.swmansion.rnscreens.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2295h extends ViewGroup {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private StateWrapper f25272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f25273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f25274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f25275j;

    public AbstractC2295h(ReactContext reactContext) {
        super(reactContext);
    }

    protected final void b(int i10, int i11, int i12) {
        c(i10, i11, i12);
    }

    public final void c(int i10, int i11, int i12) {
        float dIPFromPixel = PixelUtil.toDIPFromPixel(i10);
        float dIPFromPixel2 = PixelUtil.toDIPFromPixel(i11);
        float dIPFromPixel3 = PixelUtil.toDIPFromPixel(i12);
        if (Math.abs(this.f25273h - dIPFromPixel) >= 0.9f || Math.abs(this.f25274i - dIPFromPixel2) >= 0.9f || Math.abs(this.f25275j - dIPFromPixel3) >= 0.9f) {
            this.f25273h = dIPFromPixel;
            this.f25274i = dIPFromPixel2;
            this.f25275j = dIPFromPixel3;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", dIPFromPixel);
            writableNativeMap.putDouble("frameHeight", dIPFromPixel2);
            writableNativeMap.putDouble("contentOffsetX", 0.0d);
            writableNativeMap.putDouble("contentOffsetY", dIPFromPixel3);
            StateWrapper stateWrapper = this.f25272g;
            if (stateWrapper != null) {
                stateWrapper.updateState(writableNativeMap);
            }
        }
    }

    public final void setStateWrapper(StateWrapper stateWrapper) {
        this.f25272g = stateWrapper;
    }
}
