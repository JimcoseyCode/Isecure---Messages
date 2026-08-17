package X2;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f12438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f12439h = new f("LOW", 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f12440i = new f("MEDIUM", 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f12441j = new f("HIGH", 2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ f[] f12442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12443l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(f priority1, f priority2) {
            AbstractC2855l.g(priority1, "priority1");
            AbstractC2855l.g(priority2, "priority2");
            return priority1.ordinal() > priority2.ordinal() ? priority1 : priority2;
        }

        private a() {
        }
    }

    static {
        f[] fVarArrH = h();
        f12442k = fVarArrH;
        f12443l = AbstractC3083a.a(fVarArrH);
        f12438g = new a(null);
    }

    private f(String str, int i10) {
    }

    private static final /* synthetic */ f[] h() {
        return new f[]{f12439h, f12440i, f12441j};
    }

    public static final f j(f fVar, f fVar2) {
        return f12438g.a(fVar, fVar2);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f12442k.clone();
    }
}
