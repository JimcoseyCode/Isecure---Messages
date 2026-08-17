package o;

import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import androidx.fragment.app.AbstractActivityC1749q;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.U;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: renamed from: o.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2998f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FragmentManager f30251a;

    /* JADX INFO: renamed from: o.f$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f30252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f30253b;

        b(c cVar, int i10) {
            this.f30252a = cVar;
            this.f30253b = i10;
        }

        public int a() {
            return this.f30253b;
        }

        public c b() {
            return this.f30252a;
        }
    }

    /* JADX INFO: renamed from: o.f$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f30258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f30259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CharSequence f30260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final CharSequence f30261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f30262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f30263f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f30264g;

        /* JADX INFO: renamed from: o.f$d$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private CharSequence f30265a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private CharSequence f30266b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private CharSequence f30267c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private CharSequence f30268d = null;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f30269e = true;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f30270f = false;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f30271g = 0;

            public d a() {
                if (TextUtils.isEmpty(this.f30265a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!AbstractC2994b.e(this.f30271g)) {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + AbstractC2994b.a(this.f30271g));
                }
                int i10 = this.f30271g;
                boolean zC = i10 != 0 ? AbstractC2994b.c(i10) : this.f30270f;
                if (TextUtils.isEmpty(this.f30268d) && !zC) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (TextUtils.isEmpty(this.f30268d) || !zC) {
                    return new d(this.f30265a, this.f30266b, this.f30267c, this.f30268d, this.f30269e, this.f30270f, this.f30271g);
                }
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }

            public a b(CharSequence charSequence) {
                this.f30268d = charSequence;
                return this;
            }

            public a c(CharSequence charSequence) {
                this.f30265a = charSequence;
                return this;
            }
        }

        d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z10, boolean z11, int i10) {
            this.f30258a = charSequence;
            this.f30259b = charSequence2;
            this.f30260c = charSequence3;
            this.f30261d = charSequence4;
            this.f30262e = z10;
            this.f30263f = z11;
            this.f30264g = i10;
        }

        public int a() {
            return this.f30264g;
        }

        public CharSequence b() {
            return this.f30260c;
        }

        public CharSequence c() {
            CharSequence charSequence = this.f30261d;
            return charSequence != null ? charSequence : PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }

        public CharSequence d() {
            return this.f30259b;
        }

        public CharSequence e() {
            return this.f30258a;
        }

        public boolean f() {
            return this.f30262e;
        }

        public boolean g() {
            return this.f30263f;
        }
    }

    public C2998f(AbstractActivityC1749q abstractActivityC1749q, Executor executor, a aVar) {
        if (abstractActivityC1749q == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        f(abstractActivityC1749q.getSupportFragmentManager(), e(abstractActivityC1749q), executor, aVar);
    }

    private void b(d dVar, c cVar) {
        FragmentManager fragmentManager = this.f30251a;
        if (fragmentManager == null || fragmentManager.Q0()) {
            return;
        }
        d(this.f30251a).w(dVar, cVar);
    }

    private static C2996d c(FragmentManager fragmentManager) {
        return (C2996d) fragmentManager.j0("androidx.biometric.BiometricFragment");
    }

    private static C2996d d(FragmentManager fragmentManager) {
        C2996d c2996dC = c(fragmentManager);
        if (c2996dC != null) {
            return c2996dC;
        }
        C2996d c2996dL = C2996d.L();
        fragmentManager.o().e(c2996dL, "androidx.biometric.BiometricFragment").i();
        fragmentManager.e0();
        return c2996dL;
    }

    private static g e(AbstractActivityC1749q abstractActivityC1749q) {
        if (abstractActivityC1749q != null) {
            return (g) new U(abstractActivityC1749q).b(g.class);
        }
        return null;
    }

    private void f(FragmentManager fragmentManager, g gVar, Executor executor, a aVar) {
        this.f30251a = fragmentManager;
        if (gVar != null) {
            if (executor != null) {
                gVar.O(executor);
            }
            gVar.N(aVar);
        }
    }

    public void a(d dVar, c cVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("CryptoObject cannot be null.");
        }
        int iB = AbstractC2994b.b(dVar, cVar);
        if (AbstractC2994b.f(iB)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && AbstractC2994b.c(iB)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        b(dVar, cVar);
    }

    /* JADX INFO: renamed from: o.f$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Signature f30254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Cipher f30255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Mac f30256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final IdentityCredential f30257d;

        public c(Signature signature) {
            this.f30254a = signature;
            this.f30255b = null;
            this.f30256c = null;
            this.f30257d = null;
        }

        public Cipher a() {
            return this.f30255b;
        }

        public IdentityCredential b() {
            return this.f30257d;
        }

        public Mac c() {
            return this.f30256c;
        }

        public Signature d() {
            return this.f30254a;
        }

        public c(Cipher cipher) {
            this.f30254a = null;
            this.f30255b = cipher;
            this.f30256c = null;
            this.f30257d = null;
        }

        public c(Mac mac) {
            this.f30254a = null;
            this.f30255b = null;
            this.f30256c = mac;
            this.f30257d = null;
        }

        public c(IdentityCredential identityCredential) {
            this.f30254a = null;
            this.f30255b = null;
            this.f30256c = null;
            this.f30257d = identityCredential;
        }
    }

    /* JADX INFO: renamed from: o.f$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a {
        public void onAuthenticationFailed() {
        }

        public void onAuthenticationSucceeded(b bVar) {
        }

        public void onAuthenticationError(int i10, CharSequence charSequence) {
        }
    }
}
