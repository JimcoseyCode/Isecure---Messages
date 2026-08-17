package U1;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f10880c = new e(null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f10881d = new e(a.none, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f10882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f10883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f10884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f10885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f10886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f10887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f10888k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f10889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f10890b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum b {
        meet,
        slice
    }

    static {
        a aVar = a.xMidYMid;
        b bVar = b.meet;
        f10882e = new e(aVar, bVar);
        a aVar2 = a.xMinYMin;
        f10883f = new e(aVar2, bVar);
        f10884g = new e(a.xMaxYMax, bVar);
        f10885h = new e(a.xMidYMin, bVar);
        f10886i = new e(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        f10887j = new e(aVar, bVar2);
        f10888k = new e(aVar2, bVar2);
    }

    e(a aVar, b bVar) {
        this.f10889a = aVar;
        this.f10890b = bVar;
    }

    public a a() {
        return this.f10889a;
    }

    public b b() {
        return this.f10890b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f10889a == eVar.f10889a && this.f10890b == eVar.f10890b;
    }

    public String toString() {
        return this.f10889a + " " + this.f10890b;
    }
}
