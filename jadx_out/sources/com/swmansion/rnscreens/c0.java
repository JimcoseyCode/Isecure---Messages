package com.swmansion.rnscreens;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f25090a;

    public final void a(a0 config, C2311y c2311y) {
        AbstractC2855l.g(config, "config");
        int height = config.h() ? 0 : config.getToolbar().getHeight();
        Integer num = this.f25090a;
        if (num != null && height == num.intValue()) {
            return;
        }
        this.f25090a = Integer.valueOf(height);
        if (c2311y != null) {
            c2311y.t(height);
        }
    }
}
