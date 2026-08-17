package k4;

/* JADX INFO: renamed from: k4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2828a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29125a = 1;

    public C2828a a(Object obj) {
        this.f29125a = (this.f29125a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f29125a;
    }

    public final C2828a c(boolean z10) {
        this.f29125a = (this.f29125a * 31) + (z10 ? 1 : 0);
        return this;
    }
}
