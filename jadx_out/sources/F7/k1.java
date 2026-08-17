package F7;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f2078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ClassLoader f2080c;

    public k1(ClassLoader classLoader) {
        AbstractC2855l.g(classLoader, "classLoader");
        this.f2078a = new WeakReference(classLoader);
        this.f2079b = System.identityHashCode(classLoader);
        this.f2080c = classLoader;
    }

    public final void a(ClassLoader classLoader) {
        this.f2080c = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k1) && this.f2078a.get() == ((k1) obj).f2078a.get();
    }

    public int hashCode() {
        return this.f2079b;
    }

    public String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f2078a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
