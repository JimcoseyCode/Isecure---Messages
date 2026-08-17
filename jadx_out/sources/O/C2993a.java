package o;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import o.C2998f;
import z0.C3665a;

/* JADX INFO: renamed from: o.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C2993a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BiometricPrompt$AuthenticationCallback f30218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C3665a.c f30219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final d f30220c;

    /* JADX INFO: renamed from: o.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0330a extends C3665a.c {
        C0330a() {
        }

        @Override // z0.C3665a.c
        public void a(int i10, CharSequence charSequence) {
            C2993a.this.f30220c.a(i10, charSequence);
        }

        @Override // z0.C3665a.c
        public void b() {
            C2993a.this.f30220c.b();
        }

        @Override // z0.C3665a.c
        public void c(int i10, CharSequence charSequence) {
            C2993a.this.f30220c.c(charSequence);
        }

        @Override // z0.C3665a.c
        public void d(C3665a.d dVar) {
            C2993a.this.f30220c.d(new C2998f.b(dVar != null ? i.c(dVar.a()) : null, 2));
        }
    }

    /* JADX INFO: renamed from: o.a$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c {
        static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    /* JADX INFO: renamed from: o.a$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class d {
        d() {
        }

        abstract void a(int i10, CharSequence charSequence);

        abstract void b();

        abstract void c(CharSequence charSequence);

        abstract void d(C2998f.b bVar);
    }

    C2993a(d dVar) {
        this.f30220c = dVar;
    }

    BiometricPrompt$AuthenticationCallback a() {
        if (this.f30218a == null) {
            this.f30218a = b.a(this.f30220c);
        }
        return this.f30218a;
    }

    C3665a.c b() {
        if (this.f30219b == null) {
            this.f30219b = new C0330a();
        }
        return this.f30219b;
    }

    /* JADX INFO: renamed from: o.a$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b {
        static BiometricPrompt$AuthenticationCallback a(d dVar) {
            return new C0331a(dVar);
        }

        /* JADX INFO: renamed from: o.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0331a extends BiometricPrompt$AuthenticationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f30222a;

            C0331a(d dVar) {
                this.f30222a = dVar;
            }

            public void onAuthenticationError(int i10, CharSequence charSequence) {
                this.f30222a.a(i10, charSequence);
            }

            public void onAuthenticationFailed() {
                this.f30222a.b();
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                C2998f.c cVarB = authenticationResult != null ? i.b(authenticationResult.getCryptoObject()) : null;
                int i10 = Build.VERSION.SDK_INT;
                int iA = -1;
                if (i10 >= 30) {
                    if (authenticationResult != null) {
                        iA = c.a(authenticationResult);
                    }
                } else if (i10 != 29) {
                    iA = 2;
                }
                this.f30222a.d(new C2998f.b(cVarB, iA));
            }

            public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            }
        }
    }
}
