package j8;

import h8.AbstractC2708a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2810e extends AbstractC2708a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f28942h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C2810e f28943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C2810e f28944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C2810e f28945k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f28946g;

    /* JADX INFO: renamed from: j8.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C2810e c2810e = new C2810e(2, 0, 0);
        f28943i = c2810e;
        f28944j = c2810e.m();
        f28945k = new C2810e(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2810e(int[] versionArray, boolean z10) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        AbstractC2855l.g(versionArray, "versionArray");
        this.f28946g = z10;
    }

    private final boolean i(C2810e c2810e) {
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !l(c2810e);
    }

    private final boolean l(C2810e c2810e) {
        if (a() > c2810e.a()) {
            return true;
        }
        return a() >= c2810e.a() && b() > c2810e.b();
    }

    public final boolean h(C2810e metadataVersionFromLanguageVersion) {
        AbstractC2855l.g(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        if (a() == 2 && b() == 0) {
            C2810e c2810e = f28943i;
            if (c2810e.a() == 1 && c2810e.b() == 8) {
                return true;
            }
        }
        return i(metadataVersionFromLanguageVersion.k(this.f28946g));
    }

    public final boolean j() {
        return this.f28946g;
    }

    public final C2810e k(boolean z10) {
        C2810e c2810e = z10 ? f28943i : f28944j;
        return c2810e.l(this) ? c2810e : this;
    }

    public final C2810e m() {
        return (a() == 1 && b() == 9) ? new C2810e(2, 0, 0) : new C2810e(a(), b() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2810e(int... numbers) {
        this(numbers, false);
        AbstractC2855l.g(numbers, "numbers");
    }
}
