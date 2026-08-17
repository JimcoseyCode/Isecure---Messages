package I4;

import com.facebook.react.uimanager.ViewDefaults;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0831c1 f4677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f4678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0957n6 f4679c;

    public final Z0 a(Integer num) {
        this.f4678b = Integer.valueOf(num.intValue() & ViewDefaults.NUMBER_OF_LINES);
        return this;
    }

    public final Z0 b(C0957n6 c0957n6) {
        this.f4679c = c0957n6;
        return this;
    }

    public final Z0 c(C0831c1 c0831c1) {
        this.f4677a = c0831c1;
        return this;
    }

    public final C0853e1 e() {
        return new C0853e1(this, null);
    }
}
