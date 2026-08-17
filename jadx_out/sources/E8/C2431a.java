package e8;

import B7.d;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import j7.K;
import j8.C2810e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: renamed from: e8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2431a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0258a f25943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2810e f25944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f25945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f25946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f25947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f25948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f25949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f25950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f25951i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: e8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class EnumC0258a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0259a f25952h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final Map f25953i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final EnumC0258a f25954j = new EnumC0258a("UNKNOWN", 0, 0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final EnumC0258a f25955k = new EnumC0258a("CLASS", 1, 1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final EnumC0258a f25956l = new EnumC0258a("FILE_FACADE", 2, 2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final EnumC0258a f25957m = new EnumC0258a("SYNTHETIC_CLASS", 3, 3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final EnumC0258a f25958n = new EnumC0258a("MULTIFILE_CLASS", 4, 4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final EnumC0258a f25959o = new EnumC0258a("MULTIFILE_CLASS_PART", 5, 5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ EnumC0258a[] f25960p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f25961q;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f25962g;

        /* JADX INFO: renamed from: e8.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0259a {
            public /* synthetic */ C0259a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EnumC0258a a(int i10) {
                EnumC0258a enumC0258a = (EnumC0258a) EnumC0258a.f25953i.get(Integer.valueOf(i10));
                return enumC0258a == null ? EnumC0258a.f25954j : enumC0258a;
            }

            private C0259a() {
            }
        }

        static {
            EnumC0258a[] enumC0258aArrH = h();
            f25960p = enumC0258aArrH;
            f25961q = AbstractC3083a.a(enumC0258aArrH);
            f25952h = new C0259a(null);
            EnumC0258a[] enumC0258aArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(d.d(K.e(enumC0258aArrValues.length), 16));
            for (EnumC0258a enumC0258a : enumC0258aArrValues) {
                linkedHashMap.put(Integer.valueOf(enumC0258a.f25962g), enumC0258a);
            }
            f25953i = linkedHashMap;
        }

        private EnumC0258a(String str, int i10, int i11) {
            this.f25962g = i11;
        }

        private static final /* synthetic */ EnumC0258a[] h() {
            return new EnumC0258a[]{f25954j, f25955k, f25956l, f25957m, f25958n, f25959o};
        }

        public static final EnumC0258a k(int i10) {
            return f25952h.a(i10);
        }

        public static EnumC0258a valueOf(String str) {
            return (EnumC0258a) Enum.valueOf(EnumC0258a.class, str);
        }

        public static EnumC0258a[] values() {
            return (EnumC0258a[]) f25960p.clone();
        }
    }

    public C2431a(EnumC0258a kind, C2810e metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10, String str2, byte[] bArr) {
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(metadataVersion, "metadataVersion");
        this.f25943a = kind;
        this.f25944b = metadataVersion;
        this.f25945c = strArr;
        this.f25946d = strArr2;
        this.f25947e = strArr3;
        this.f25948f = str;
        this.f25949g = i10;
        this.f25950h = str2;
        this.f25951i = bArr;
    }

    private final boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public final String[] a() {
        return this.f25945c;
    }

    public final String[] b() {
        return this.f25946d;
    }

    public final EnumC0258a c() {
        return this.f25943a;
    }

    public final C2810e d() {
        return this.f25944b;
    }

    public final String e() {
        String str = this.f25948f;
        if (this.f25943a == EnumC0258a.f25959o) {
            return str;
        }
        return null;
    }

    public final List f() {
        String[] strArr = this.f25945c;
        if (this.f25943a != EnumC0258a.f25958n) {
            strArr = null;
        }
        List listE = strArr != null ? AbstractC2793j.e(strArr) : null;
        return listE == null ? AbstractC2800q.j() : listE;
    }

    public final String[] g() {
        return this.f25947e;
    }

    public final boolean i() {
        return h(this.f25949g, 2);
    }

    public final boolean j() {
        return h(this.f25949g, 16) && !h(this.f25949g, 32);
    }

    public String toString() {
        return this.f25943a + " version=" + this.f25944b;
    }
}
