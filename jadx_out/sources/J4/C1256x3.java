package J4;

import com.facebook.react.uimanager.ViewDefaults;

/* JADX INFO: renamed from: J4.x3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1256x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f6478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EnumC1263y3 f6479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EnumC1221s3 f6480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f6481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f6482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f6483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f6484g;

    public final C1256x3 b(Long l10) {
        this.f6478a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1256x3 c(Integer num) {
        this.f6481d = Integer.valueOf(num.intValue() & ViewDefaults.NUMBER_OF_LINES);
        return this;
    }

    public final C1256x3 d(EnumC1221s3 enumC1221s3) {
        this.f6480c = enumC1221s3;
        return this;
    }

    public final C1256x3 e(Integer num) {
        this.f6483f = Integer.valueOf(num.intValue() & ViewDefaults.NUMBER_OF_LINES);
        return this;
    }

    public final C1256x3 f(EnumC1263y3 enumC1263y3) {
        this.f6479b = enumC1263y3;
        return this;
    }

    public final C1256x3 g(Integer num) {
        this.f6482e = Integer.valueOf(num.intValue() & ViewDefaults.NUMBER_OF_LINES);
        return this;
    }

    public final C1256x3 h(Integer num) {
        this.f6484g = Integer.valueOf(num.intValue() & ViewDefaults.NUMBER_OF_LINES);
        return this;
    }

    public final A3 j() {
        return new A3(this, null);
    }
}
