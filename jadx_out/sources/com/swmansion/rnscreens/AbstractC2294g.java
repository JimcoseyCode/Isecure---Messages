package com.swmansion.rnscreens;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.swmansion.rnscreens.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2294g extends ViewGroup {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f25126l = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private StateWrapper f25127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f25128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f25129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f25130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f25131k;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.g$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AbstractC2294g(Context context) {
        super(context);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        float dIPFromPixel = PixelUtil.toDIPFromPixel(i10);
        float dIPFromPixel2 = PixelUtil.toDIPFromPixel(i11);
        float dIPFromPixel3 = PixelUtil.toDIPFromPixel(i12);
        float dIPFromPixel4 = PixelUtil.toDIPFromPixel(i13);
        if (Math.abs(this.f25128h - dIPFromPixel) >= 0.9f || Math.abs(this.f25129i - dIPFromPixel2) >= 0.9f || Math.abs(this.f25130j - dIPFromPixel3) >= 0.9f || Math.abs(this.f25131k - dIPFromPixel4) >= 0.9f) {
            this.f25128h = dIPFromPixel;
            this.f25129i = dIPFromPixel2;
            this.f25130j = dIPFromPixel3;
            this.f25131k = dIPFromPixel4;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", dIPFromPixel);
            writableNativeMap.putDouble("frameHeight", dIPFromPixel2);
            writableNativeMap.putDouble("contentOffsetX", dIPFromPixel3);
            writableNativeMap.putDouble("contentOffsetY", dIPFromPixel4);
            StateWrapper stateWrapper = this.f25127g;
            if (stateWrapper != null) {
                stateWrapper.updateState(writableNativeMap);
            }
        }
    }

    protected final void b(int i10, int i11, int i12, int i13) {
        a(i10, i11, i12, i13);
    }

    public final void setStateWrapper(StateWrapper stateWrapper) {
        this.f25127g = stateWrapper;
    }
}
