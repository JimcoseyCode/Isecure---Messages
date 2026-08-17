package F;

import android.util.Size;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import j7.AbstractC2800q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1644e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p1 f1645f = p1.f1605h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b[] f1646g = {b.f1655k, b.f1657m, b.f1658n, b.f1660p, b.f1661q, b.f1654j};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f1647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map f1648i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f1649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f1650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p1 f1651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1652d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ r1 c(a aVar, d dVar, b bVar, p1 p1Var, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                p1Var = r1.f1645f;
            }
            return aVar.b(dVar, bVar, p1Var);
        }

        public static /* synthetic */ r1 g(a aVar, int i10, Size size, s1 s1Var, int i11, c cVar, p1 p1Var, int i12, Object obj) {
            if ((i12 & 8) != 0) {
                i11 = 0;
            }
            int i13 = i11;
            if ((i12 & 16) != 0) {
                cVar = c.f1673h;
            }
            c cVar2 = cVar;
            if ((i12 & 32) != 0) {
                p1Var = r1.f1645f;
            }
            return aVar.f(i10, size, s1Var, i13, cVar2, p1Var);
        }

        public final r1 a(d type, b size) {
            AbstractC2855l.g(type, "type");
            AbstractC2855l.g(size, "size");
            return c(this, type, size, null, 4, null);
        }

        public final r1 b(d type, b size, p1 streamUseCase) {
            AbstractC2855l.g(type, "type");
            AbstractC2855l.g(size, "size");
            AbstractC2855l.g(streamUseCase, "streamUseCase");
            return new r1(type, size, streamUseCase);
        }

        public final d d(int i10) {
            d dVar = (d) r1.f1648i.get(Integer.valueOf(i10));
            return dVar == null ? d.f1676g : dVar;
        }

        public final r1 e(int i10, Size size, s1 surfaceSizeDefinition) {
            AbstractC2855l.g(size, "size");
            AbstractC2855l.g(surfaceSizeDefinition, "surfaceSizeDefinition");
            return g(this, i10, size, surfaceSizeDefinition, 0, null, null, 56, null);
        }

        public final r1 f(int i10, Size size, s1 surfaceSizeDefinition, int i11, c configSource, p1 streamUseCase) {
            AbstractC2855l.g(size, "size");
            AbstractC2855l.g(surfaceSizeDefinition, "surfaceSizeDefinition");
            AbstractC2855l.g(configSource, "configSource");
            AbstractC2855l.g(streamUseCase, "streamUseCase");
            d dVarD = d(i10);
            b bVar = b.f1667w;
            int iC = O.d.c(size);
            if (i11 == 1) {
                if (iC <= O.d.c(surfaceSizeDefinition.m(i10))) {
                    bVar = b.f1655k;
                } else if (iC <= O.d.c(surfaceSizeDefinition.k(i10))) {
                    bVar = b.f1659o;
                }
            } else if (configSource == c.f1672g) {
                Size sizeG = surfaceSizeDefinition.g(i10);
                b[] bVarArr = r1.f1646g;
                int length = bVarArr.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    b bVar2 = bVarArr[i12];
                    if (AbstractC2855l.b(size, bVar2.k())) {
                        bVar = bVar2;
                        break;
                    }
                    i12++;
                }
                if (bVar == b.f1667w && AbstractC2855l.b(size, sizeG)) {
                    bVar = b.f1663s;
                }
            } else if (iC <= O.d.c(surfaceSizeDefinition.b())) {
                bVar = b.f1653i;
            } else if (iC <= O.d.c(surfaceSizeDefinition.i())) {
                bVar = b.f1656l;
            } else if (iC <= O.d.c(surfaceSizeDefinition.j())) {
                bVar = b.f1662r;
            } else {
                Size sizeG2 = surfaceSizeDefinition.g(i10);
                Size sizeO = surfaceSizeDefinition.o(i10);
                if ((sizeG2 == null || iC <= O.d.c(sizeG2)) && i11 != 2) {
                    bVar = b.f1663s;
                } else if (sizeO != null && iC <= O.d.c(sizeO)) {
                    bVar = b.f1666v;
                }
            }
            return b(dVarD, bVar, streamUseCase);
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f1656l;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f1662r;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final /* synthetic */ b[] f1668x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f1669y;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f1670g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Size f1671h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f1653i = new b("VGA", 0, 0, new Size(640, 480));

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f1654j = new b("X_VGA", 1, 1, new Size(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 768));

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f1655k = new b("S720P_16_9", 2, 2, new Size(1280, 720));

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f1657m = new b("S1080P_4_3", 4, 4, new Size(1440, 1080));

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f1658n = new b("S1080P_16_9", 5, 5, new Size(1920, 1080));

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f1659o = new b("S1440P_4_3", 6, 6, new Size(1920, 1440));

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f1660p = new b("S1440P_16_9", 7, 7, new Size(2560, 1440));

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f1661q = new b("UHD", 8, 8, new Size(3840, 2160));

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f1663s = new b("MAXIMUM", 10, 10, null, 2, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f1664t = new b("MAXIMUM_4_3", 11, 11, null, 2, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final b f1665u = new b("MAXIMUM_16_9", 12, 12, null, 2, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f1666v = new b("ULTRA_MAXIMUM", 13, 13, null, 2, null);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f1667w = new b("NOT_SUPPORT", 14, 14, null, 2, null);

        static {
            int i10 = 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            Size size = null;
            f1656l = new b("PREVIEW", 3, 3, size, i10, defaultConstructorMarker);
            f1662r = new b("RECORD", 9, 9, size, i10, defaultConstructorMarker);
            b[] bVarArrH = h();
            f1668x = bVarArrH;
            f1669y = AbstractC3083a.a(bVarArrH);
        }

        private b(String str, int i10, int i11, Size size) {
            this.f1670g = i11;
            this.f1671h = size;
        }

        private static final /* synthetic */ b[] h() {
            return new b[]{f1653i, f1654j, f1655k, f1656l, f1657m, f1658n, f1659o, f1660p, f1661q, f1662r, f1663s, f1664t, f1665u, f1666v, f1667w};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f1668x.clone();
        }

        public final int j() {
            return this.f1670g;
        }

        public final Size k() {
            return this.f1671h;
        }

        /* synthetic */ b(String str, int i10, int i11, Size size, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, i11, (i12 & 2) != 0 ? null : size);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f1672g = new c("FEATURE_COMBINATION_TABLE", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final c f1673h = new c("CAPTURE_SESSION_TABLES", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ c[] f1674i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f1675j;

        static {
            c[] cVarArrH = h();
            f1674i = cVarArrH;
            f1675j = AbstractC3083a.a(cVarArrH);
        }

        private c(String str, int i10) {
        }

        private static final /* synthetic */ c[] h() {
            return new c[]{f1672g, f1673h};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f1674i.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f1676g = new d("PRIV", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final d f1677h = new d("YUV", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final d f1678i = new d("JPEG", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final d f1679j = new d("JPEG_R", 3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final d f1680k = new d("RAW", 4);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ d[] f1681l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f1682m;

        static {
            d[] dVarArrH = h();
            f1681l = dVarArrH;
            f1682m = AbstractC3083a.a(dVarArrH);
        }

        private d(String str, int i10) {
        }

        private static final /* synthetic */ d[] h() {
            return new d[]{f1676g, f1677h, f1678i, f1679j, f1680k};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f1681l.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1683a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f1656l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f1662r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f1663s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f1664t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.f1665u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.f1666v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.f1667w.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f1683a = iArr;
        }
    }

    static {
        Map mapL = j7.K.l(i7.t.a(d.f1677h, 35), i7.t.a(d.f1678i, 256), i7.t.a(d.f1679j, 4101), i7.t.a(d.f1680k, 32), i7.t.a(d.f1676g, 34));
        f1647h = mapL;
        Set<Map.Entry> setEntrySet = mapL.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(B7.d.d(j7.K.e(AbstractC2800q.u(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (d) entry.getKey());
        }
        f1648i = linkedHashMap;
    }

    public r1(d configType, b configSize, p1 streamUseCase) {
        AbstractC2855l.g(configType, "configType");
        AbstractC2855l.g(configSize, "configSize");
        AbstractC2855l.g(streamUseCase, "streamUseCase");
        this.f1649a = configType;
        this.f1650b = configSize;
        this.f1651c = streamUseCase;
        Integer num = (Integer) f1647h.get(configType);
        this.f1652d = num != null ? num.intValue() : 0;
    }

    public static final r1 c(d dVar, b bVar) {
        return f1644e.a(dVar, bVar);
    }

    public static final r1 d(d dVar, b bVar, p1 p1Var) {
        return f1644e.b(dVar, bVar, p1Var);
    }

    public static final d f(int i10) {
        return f1644e.d(i10);
    }

    public static final r1 k(int i10, Size size, s1 s1Var) {
        return f1644e.e(i10, size, s1Var);
    }

    public static final r1 l(int i10, Size size, s1 s1Var, int i11, c cVar, p1 p1Var) {
        return f1644e.f(i10, size, s1Var, i11, cVar, p1Var);
    }

    public final b e() {
        return this.f1650b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return this.f1649a == r1Var.f1649a && this.f1650b == r1Var.f1650b && this.f1651c == r1Var.f1651c;
    }

    public final int g() {
        return this.f1652d;
    }

    public final Size h(s1 definition) {
        Size sizeI;
        AbstractC2855l.g(definition, "definition");
        switch (e.f1683a[this.f1650b.ordinal()]) {
            case 1:
                sizeI = definition.i();
                break;
            case 2:
                sizeI = definition.j();
                break;
            case 3:
                sizeI = definition.g(this.f1652d);
                break;
            case 4:
                sizeI = definition.e(this.f1652d);
                break;
            case 5:
                sizeI = definition.c(this.f1652d);
                break;
            case 6:
                sizeI = definition.o(this.f1652d);
                break;
            case 7:
                throw new IllegalStateException("Not supported config size");
            default:
                sizeI = this.f1650b.k();
                break;
        }
        AbstractC2855l.d(sizeI);
        return sizeI;
    }

    public int hashCode() {
        return (((this.f1649a.hashCode() * 31) + this.f1650b.hashCode()) * 31) + this.f1651c.hashCode();
    }

    public final p1 i() {
        return this.f1651c;
    }

    public final boolean j(r1 other) {
        p1 p1Var;
        AbstractC2855l.g(other, "other");
        if (other.f1650b.j() > this.f1650b.j() || other.f1649a != this.f1649a) {
            return false;
        }
        p1 p1Var2 = this.f1651c;
        p1 p1Var3 = p1.f1605h;
        return p1Var2 == p1Var3 || (p1Var = other.f1651c) == p1Var3 || p1Var == p1Var2;
    }

    public String toString() {
        return "SurfaceConfig(configType=" + this.f1649a + ", configSize=" + this.f1650b + ", streamUseCase=" + this.f1651c + ')';
    }
}
