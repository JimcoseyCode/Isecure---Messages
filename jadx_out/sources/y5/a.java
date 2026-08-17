package Y5;

import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f12945g;

    public a(String str, int i10) {
        super(AbstractC3268i.f(str, "Provided message must not be empty."));
        this.f12945g = i10;
    }

    public int a() {
        return this.f12945g;
    }

    public a(String str, int i10, Throwable th) {
        super(AbstractC3268i.f(str, "Provided message must not be empty."), th);
        this.f12945g = i10;
    }
}
