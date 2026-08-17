package W6;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f12127a;

    public b(boolean z10) {
        this.f12127a = z10;
    }

    public boolean b() {
        return this.f12127a;
    }

    @Override // W6.a
    public void disable() {
        this.f12127a = false;
    }

    @Override // W6.a
    public void enable() {
        this.f12127a = true;
    }

    public /* synthetic */ b(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
