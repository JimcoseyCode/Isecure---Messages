package com.facebook.react.devsupport.perfmonitor;

import i7.C2735B;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2853j;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* synthetic */ class PerfMonitorOverlayManager$enable$1$1 extends AbstractC2853j implements InterfaceC3487a {
    PerfMonitorOverlayManager$enable$1$1(Object obj) {
        super(0, obj, PerfMonitorOverlayManager.class, "handleRecordingButtonPress", "handleRecordingButtonPress()V", 0);
    }

    @Override // w7.InterfaceC3487a
    public /* bridge */ /* synthetic */ Object invoke() {
        m7invoke();
        return C2735B.f28704a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m7invoke() {
        ((PerfMonitorOverlayManager) this.receiver).handleRecordingButtonPress();
    }
}
