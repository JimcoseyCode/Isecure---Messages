package com.swmansion.rnscreens;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.LayoutShadowNode;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends LayoutShadowNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ReactContext f25088a;

    public b0(ReactContext context) {
        AbstractC2855l.g(context, "context");
        this.f25088a = context;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(Object obj) {
        super.setLocalData(obj);
    }
}
