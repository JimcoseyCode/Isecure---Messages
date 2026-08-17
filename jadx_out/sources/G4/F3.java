package G4;

import com.facebook.react.uimanager.ViewDefaults;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class F3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f2274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f2275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EnumC0674m4 f2276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f2277d;

    public final F3 a(Boolean bool) {
        this.f2277d = bool;
        return this;
    }

    public final F3 b(Long l10) {
        this.f2275b = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final F3 c(EnumC0674m4 enumC0674m4) {
        this.f2276c = enumC0674m4;
        return this;
    }

    public final F3 d(Integer num) {
        this.f2274a = Integer.valueOf(num.intValue() & ViewDefaults.NUMBER_OF_LINES);
        return this;
    }

    public final H3 e() {
        return new H3(this, null);
    }
}
