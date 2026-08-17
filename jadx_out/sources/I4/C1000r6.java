package I4;

import com.facebook.react.uimanager.ViewDefaults;

/* JADX INFO: renamed from: I4.r6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1000r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EnumC1011s6 f4866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f4867b;

    public final C1000r6 a(EnumC1011s6 enumC1011s6) {
        this.f4866a = enumC1011s6;
        return this;
    }

    public final C1000r6 b(Integer num) {
        this.f4867b = Integer.valueOf(num.intValue() & ViewDefaults.NUMBER_OF_LINES);
        return this;
    }

    public final C1033u6 d() {
        return new C1033u6(this, null);
    }
}
