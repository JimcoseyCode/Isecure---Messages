package C7;

import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface j extends b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f513g = new a("INSTANCE", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f514h = new a("EXTENSION_RECEIVER", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f515i = new a("VALUE", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ a[] f516j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f517k;

        static {
            a[] aVarArrH = h();
            f516j = aVarArrH;
            f517k = AbstractC3083a.a(aVarArrH);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] h() {
            return new a[]{f513g, f514h, f515i};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f516j.clone();
        }
    }

    boolean a();

    boolean d();

    int getIndex();

    a getKind();

    String getName();

    o getType();
}
