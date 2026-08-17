package com.swmansion.rnscreens.gamma.stack.host;

import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.swmansion.rnscreens.gamma.stack.screen.d f25138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25141d;

    public /* synthetic */ a(com.swmansion.rnscreens.gamma.stack.screen.d dVar, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, i10, z10, (i11 & 8) != 0 ? true : z11);
    }

    @Override // com.swmansion.rnscreens.gamma.stack.host.b
    public void a(FragmentManager fragmentManager, c executor) {
        AbstractC2855l.g(fragmentManager, "fragmentManager");
        AbstractC2855l.g(executor, "executor");
        executor.e(fragmentManager, this);
    }

    public final boolean b() {
        return this.f25140c;
    }

    public final boolean c() {
        return this.f25141d;
    }

    public final int d() {
        return this.f25139b;
    }

    public final com.swmansion.rnscreens.gamma.stack.screen.d e() {
        return this.f25138a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.swmansion.rnscreens.gamma.stack.screen.d fragment, int i10, boolean z10, boolean z11) {
        super(null);
        AbstractC2855l.g(fragment, "fragment");
        this.f25138a = fragment;
        this.f25139b = i10;
        this.f25140c = z10;
        this.f25141d = z11;
    }
}
