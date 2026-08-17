package o;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import z0.C3665a;

/* JADX INFO: renamed from: o.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2997e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f30247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BiometricManager f30248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3665a f30249c;

    /* JADX INFO: renamed from: o.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {
        static int a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        static BiometricManager b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: o.e$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b {
        static int a(BiometricManager biometricManager, int i10) {
            return biometricManager.canAuthenticate(i10);
        }
    }

    /* JADX INFO: renamed from: o.e$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f30250a;

        c(Context context) {
            this.f30250a = context.getApplicationContext();
        }

        @Override // o.C2997e.d
        public BiometricManager a() {
            return a.b(this.f30250a);
        }

        @Override // o.C2997e.d
        public boolean b() {
            return m.a(this.f30250a) != null;
        }

        @Override // o.C2997e.d
        public boolean c() {
            return n.a(this.f30250a);
        }

        @Override // o.C2997e.d
        public boolean d() {
            return m.b(this.f30250a);
        }

        @Override // o.C2997e.d
        public boolean e() {
            return j.a(this.f30250a, Build.MODEL);
        }

        @Override // o.C2997e.d
        public C3665a f() {
            return C3665a.c(this.f30250a);
        }
    }

    /* JADX INFO: renamed from: o.e$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface d {
        BiometricManager a();

        boolean b();

        boolean c();

        boolean d();

        boolean e();

        C3665a f();
    }

    C2997e(d dVar) {
        this.f30247a = dVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f30248b = i10 >= 29 ? dVar.a() : null;
        this.f30249c = i10 <= 29 ? dVar.f() : null;
    }

    private int b(int i10) {
        if (!AbstractC2994b.e(i10)) {
            return -2;
        }
        if (i10 == 0 || !this.f30247a.b()) {
            return 12;
        }
        if (AbstractC2994b.c(i10)) {
            return this.f30247a.d() ? 0 : 11;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 29) {
            return AbstractC2994b.f(i10) ? f() : e();
        }
        if (i11 != 28) {
            return c();
        }
        if (this.f30247a.c()) {
            return d();
        }
        return 12;
    }

    private int c() {
        C3665a c3665a = this.f30249c;
        if (c3665a == null) {
            return 1;
        }
        if (c3665a.f()) {
            return !this.f30249c.e() ? 11 : 0;
        }
        return 12;
    }

    private int d() {
        return !this.f30247a.d() ? c() : c() == 0 ? 0 : -1;
    }

    private int e() {
        BiometricPrompt.CryptoObject cryptoObjectD;
        Method methodC = a.c();
        if (methodC != null && (cryptoObjectD = i.d(i.a())) != null) {
            try {
                Object objInvoke = methodC.invoke(this.f30248b, cryptoObjectD);
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
        int iF = f();
        return (this.f30247a.e() || iF != 0) ? iF : d();
    }

    private int f() {
        BiometricManager biometricManager = this.f30248b;
        if (biometricManager == null) {
            return 1;
        }
        return a.a(biometricManager);
    }

    public static C2997e g(Context context) {
        return new C2997e(new c(context));
    }

    public int a(int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            return b(i10);
        }
        BiometricManager biometricManager = this.f30248b;
        if (biometricManager == null) {
            return 1;
        }
        return b.a(biometricManager, i10);
    }
}
