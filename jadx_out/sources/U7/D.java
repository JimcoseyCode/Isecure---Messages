package U7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2852i;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f11378d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final D f11379e = new D(B.b(null, 1, null), a.f11383g);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G f11380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f11381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11382c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class a extends AbstractC2852i implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f11383g = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final C7.f getOwner() {
            return kotlin.jvm.internal.D.d(B.class, "compiler.common.jvm");
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final O invoke(k8.c p02) {
            AbstractC2855l.g(p02, "p0");
            return B.d(p02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final D a() {
            return D.f11379e;
        }

        private b() {
        }
    }

    public D(G jsr305, Function1 getReportLevelForAnnotation) {
        AbstractC2855l.g(jsr305, "jsr305");
        AbstractC2855l.g(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f11380a = jsr305;
        this.f11381b = getReportLevelForAnnotation;
        this.f11382c = jsr305.f() || getReportLevelForAnnotation.invoke(B.e()) == O.f11452i;
    }

    public final boolean b() {
        return this.f11382c;
    }

    public final Function1 c() {
        return this.f11381b;
    }

    public final G d() {
        return this.f11380a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f11380a + ", getReportLevelForAnnotation=" + this.f11381b + ')';
    }
}
