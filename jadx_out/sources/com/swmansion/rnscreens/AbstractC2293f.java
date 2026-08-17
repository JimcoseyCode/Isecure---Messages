package com.swmansion.rnscreens;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ViewProps;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.swmansion.rnscreens.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2293f extends ViewGroup {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f25118l = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private StateWrapper f25119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f25120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f25121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f25122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f25123k;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.f$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AbstractC2293f(Context context) {
        super(context);
    }

    private final void b(int i10, int i11, int i12, int i13) {
        float dIPFromPixel = PixelUtil.toDIPFromPixel(i10);
        float dIPFromPixel2 = PixelUtil.toDIPFromPixel(i11);
        float dIPFromPixel3 = PixelUtil.toDIPFromPixel(i12);
        float dIPFromPixel4 = PixelUtil.toDIPFromPixel(i13);
        if (Math.abs(this.f25120h - dIPFromPixel) >= 0.9f || Math.abs(this.f25121i - dIPFromPixel2) >= 0.9f || Math.abs(this.f25122j - dIPFromPixel3) >= 0.9f || Math.abs(this.f25123k - dIPFromPixel4) >= 0.9f) {
            this.f25120h = dIPFromPixel;
            this.f25121i = dIPFromPixel2;
            this.f25122j = dIPFromPixel3;
            this.f25123k = dIPFromPixel4;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", dIPFromPixel);
            writableNativeMap.putDouble("frameHeight", dIPFromPixel2);
            writableNativeMap.putDouble(ViewProps.PADDING_START, dIPFromPixel3);
            writableNativeMap.putDouble(ViewProps.PADDING_END, dIPFromPixel4);
            StateWrapper stateWrapper = this.f25119g;
            if (stateWrapper != null) {
                stateWrapper.updateState(writableNativeMap);
            }
        }
    }

    public final void a(int i10, int i11, int i12, int i13) {
        b(i10, i11, i12, i13);
    }

    public final void setStateWrapper(StateWrapper stateWrapper) {
        this.f25119g = stateWrapper;
    }
}
