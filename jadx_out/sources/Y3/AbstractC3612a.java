package y3;

/* JADX INFO: renamed from: y3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3612a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static InterfaceC3613b f33930a;

    public static void a(InterfaceC3613b interfaceC3613b) {
        synchronized (AbstractC3612a.class) {
            try {
                if (f33930a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                f33930a = interfaceC3613b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(InterfaceC3613b interfaceC3613b) {
        if (c()) {
            return;
        }
        a(interfaceC3613b);
    }

    public static boolean c() {
        boolean z10;
        synchronized (AbstractC3612a.class) {
            z10 = f33930a != null;
        }
        return z10;
    }

    public static boolean d(String str) {
        return e(str, 0);
    }

    public static boolean e(String str, int i10) {
        InterfaceC3613b interfaceC3613b;
        synchronized (AbstractC3612a.class) {
            interfaceC3613b = f33930a;
            if (interfaceC3613b == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return interfaceC3613b.a(str, i10);
    }
}
