package u6;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32720d;

    public l(int i10, int i11, int i12, boolean z10) {
        this.f32717a = i10;
        this.f32718b = i11;
        this.f32719c = i12;
        this.f32720d = z10;
    }

    public final int a() {
        return this.f32718b;
    }

    public final int b() {
        return this.f32719c;
    }

    public final boolean c() {
        return this.f32720d;
    }

    public final int d() {
        return this.f32717a;
    }

    public final void e(boolean z10) {
        this.f32720d = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f32717a == lVar.f32717a && this.f32718b == lVar.f32718b && this.f32719c == lVar.f32719c && this.f32720d == lVar.f32720d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f32717a) * 31) + Integer.hashCode(this.f32718b)) * 31) + Integer.hashCode(this.f32719c)) * 31) + Boolean.hashCode(this.f32720d);
    }

    public String toString() {
        return "KeyboardAnimationCallbackConfig(persistentInsetTypes=" + this.f32717a + ", deferredInsetTypes=" + this.f32718b + ", dispatchMode=" + this.f32719c + ", hasTranslucentNavigationBar=" + this.f32720d + ")";
    }
}
