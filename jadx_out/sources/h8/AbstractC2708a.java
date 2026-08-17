package h8;

import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: h8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2708a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0286a f28509f = new C0286a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f28510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f28513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f28514e;

    /* JADX INFO: renamed from: h8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0286a {
        public /* synthetic */ C0286a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0286a() {
        }
    }

    public AbstractC2708a(int... numbers) {
        List listJ;
        AbstractC2855l.g(numbers, "numbers");
        this.f28510a = numbers;
        Integer numM = AbstractC2793j.M(numbers, 0);
        this.f28511b = numM != null ? numM.intValue() : -1;
        Integer numM2 = AbstractC2793j.M(numbers, 1);
        this.f28512c = numM2 != null ? numM2.intValue() : -1;
        Integer numM3 = AbstractC2793j.M(numbers, 2);
        this.f28513d = numM3 != null ? numM3.intValue() : -1;
        if (numbers.length <= 3) {
            listJ = AbstractC2800q.j();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
            }
            listJ = AbstractC2800q.P0(AbstractC2793j.d(numbers).subList(3, numbers.length));
        }
        this.f28514e = listJ;
    }

    public final int a() {
        return this.f28511b;
    }

    public final int b() {
        return this.f28512c;
    }

    public final boolean c(int i10, int i11, int i12) {
        int i13 = this.f28511b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f28512c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f28513d >= i12;
    }

    public final boolean d(AbstractC2708a version) {
        AbstractC2855l.g(version, "version");
        return c(version.f28511b, version.f28512c, version.f28513d);
    }

    public final boolean e(int i10, int i11, int i12) {
        int i13 = this.f28511b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f28512c;
        if (i14 < i11) {
            return true;
        }
        return i14 <= i11 && this.f28513d <= i12;
    }

    public boolean equals(Object obj) {
        if (obj == null || !AbstractC2855l.b(getClass(), obj.getClass())) {
            return false;
        }
        AbstractC2708a abstractC2708a = (AbstractC2708a) obj;
        return this.f28511b == abstractC2708a.f28511b && this.f28512c == abstractC2708a.f28512c && this.f28513d == abstractC2708a.f28513d && AbstractC2855l.b(this.f28514e, abstractC2708a.f28514e);
    }

    protected final boolean f(AbstractC2708a ourVersion) {
        AbstractC2855l.g(ourVersion, "ourVersion");
        int i10 = this.f28511b;
        return i10 == 0 ? ourVersion.f28511b == 0 && this.f28512c == ourVersion.f28512c : i10 == ourVersion.f28511b && this.f28512c <= ourVersion.f28512c;
    }

    public final int[] g() {
        return this.f28510a;
    }

    public int hashCode() {
        int i10 = this.f28511b;
        int i11 = i10 + (i10 * 31) + this.f28512c;
        int i12 = i11 + (i11 * 31) + this.f28513d;
        return i12 + (i12 * 31) + this.f28514e.hashCode();
    }

    public String toString() {
        int[] iArrG = g();
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArrG) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : AbstractC2800q.o0(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
