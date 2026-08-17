package x0;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f33236e = new e(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33240d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private e(int i10, int i11, int i12, int i13) {
        this.f33237a = i10;
        this.f33238b = i11;
        this.f33239c = i12;
        this.f33240d = i13;
    }

    public static e a(e eVar, e eVar2) {
        return c(eVar.f33237a + eVar2.f33237a, eVar.f33238b + eVar2.f33238b, eVar.f33239c + eVar2.f33239c, eVar.f33240d + eVar2.f33240d);
    }

    public static e b(e eVar, e eVar2) {
        return c(Math.max(eVar.f33237a, eVar2.f33237a), Math.max(eVar.f33238b, eVar2.f33238b), Math.max(eVar.f33239c, eVar2.f33239c), Math.max(eVar.f33240d, eVar2.f33240d));
    }

    public static e c(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f33236e : new e(i10, i11, i12, i13);
    }

    public static e d(Rect rect) {
        return c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static e e(e eVar, e eVar2) {
        return c(eVar.f33237a - eVar2.f33237a, eVar.f33238b - eVar2.f33238b, eVar.f33239c - eVar2.f33239c, eVar.f33240d - eVar2.f33240d);
    }

    public static e f(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f33240d == eVar.f33240d && this.f33237a == eVar.f33237a && this.f33239c == eVar.f33239c && this.f33238b == eVar.f33238b;
    }

    public Insets g() {
        return a.a(this.f33237a, this.f33238b, this.f33239c, this.f33240d);
    }

    public int hashCode() {
        return (((((this.f33237a * 31) + this.f33238b) * 31) + this.f33239c) * 31) + this.f33240d;
    }

    public String toString() {
        return "Insets{left=" + this.f33237a + ", top=" + this.f33238b + ", right=" + this.f33239c + ", bottom=" + this.f33240d + '}';
    }
}
