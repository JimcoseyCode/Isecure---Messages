package h3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f28289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f28290b;

    public f(boolean z10, boolean z11) {
        this.f28289a = z10;
        this.f28290b = z11;
    }

    public final boolean a() {
        return this.f28289a;
    }

    public final boolean b() {
        return this.f28290b;
    }

    public /* synthetic */ f(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }
}
