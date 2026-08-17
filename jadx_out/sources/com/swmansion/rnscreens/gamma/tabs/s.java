package com.swmansion.rnscreens.gamma.tabs;

import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends P6.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ReactContext reactContext, int i10) {
        super(reactContext, i10);
        AbstractC2855l.g(reactContext, "reactContext");
    }

    public final void h(String tabKey, int i10, boolean z10) {
        AbstractC2855l.g(tabKey, "tabKey");
        e().dispatchEvent(new S6.e(f(), g(), tabKey, i10, z10));
    }
}
