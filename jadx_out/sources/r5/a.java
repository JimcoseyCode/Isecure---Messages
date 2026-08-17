package R5;

import N5.b;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Class f10036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Type f10037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f10038c;

    a(Type type) {
        Type typeB = b.b((Type) N5.a.b(type));
        this.f10037b = typeB;
        this.f10036a = b.k(typeB);
        this.f10038c = typeB.hashCode();
    }

    public static a a(Class cls) {
        return new a(cls);
    }

    public static a b(Type type) {
        return new a(type);
    }

    public final Class c() {
        return this.f10036a;
    }

    public final Type d() {
        return this.f10037b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.f10037b, ((a) obj).f10037b);
    }

    public final int hashCode() {
        return this.f10038c;
    }

    public final String toString() {
        return b.u(this.f10037b);
    }
}
