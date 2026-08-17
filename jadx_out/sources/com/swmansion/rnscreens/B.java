package com.swmansion.rnscreens;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class B extends ReactViewGroup {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f24984g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        void a(boolean z10, int i10, int i11, int i12, int i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(ReactContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
    }

    public final a getDelegate$react_native_screens_release() {
        return this.f24984g;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a aVar = this.f24984g;
        if (aVar != null) {
            aVar.a(z10, i10, i11, i12, i13);
        }
    }

    public final void setDelegate$react_native_screens_release(a aVar) {
        this.f24984g = aVar;
    }
}
