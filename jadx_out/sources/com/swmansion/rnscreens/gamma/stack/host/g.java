package com.swmansion.rnscreens.gamma.stack.host;

import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.swmansion.rnscreens.gamma.stack.screen.d f25145a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.swmansion.rnscreens.gamma.stack.screen.d fragment) {
        super(null);
        AbstractC2855l.g(fragment, "fragment");
        this.f25145a = fragment;
    }

    @Override // com.swmansion.rnscreens.gamma.stack.host.b
    public void a(FragmentManager fragmentManager, c executor) {
        AbstractC2855l.g(fragmentManager, "fragmentManager");
        AbstractC2855l.g(executor, "executor");
        executor.i(fragmentManager, this);
    }

    public final com.swmansion.rnscreens.gamma.stack.screen.d b() {
        return this.f25145a;
    }
}
