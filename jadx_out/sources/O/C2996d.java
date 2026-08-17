package o;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.AbstractActivityC1749q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.B;
import androidx.lifecycle.U;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import o.C2998f;
import z0.C3665a;

/* JADX INFO: renamed from: o.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2996d extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Handler f30225g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    o.g f30226h;

    /* JADX INFO: renamed from: o.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f30227g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ CharSequence f30228h;

        a(int i10, CharSequence charSequence) {
            this.f30227g = i10;
            this.f30228h = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2996d.this.f30226h.l().onAuthenticationError(this.f30227g, this.f30228h);
        }
    }

    /* JADX INFO: renamed from: o.d$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2996d.this.f30226h.l().onAuthenticationFailed();
        }
    }

    /* JADX INFO: renamed from: o.d$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements B {
        c() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(C2998f.b bVar) {
            if (bVar != null) {
                C2996d.this.P(bVar);
                C2996d.this.f30226h.K(null);
            }
        }
    }

    /* JADX INFO: renamed from: o.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0332d implements B {
        C0332d() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(C2995c c2995c) {
            if (c2995c != null) {
                C2996d.this.M(c2995c.b(), c2995c.c());
                C2996d.this.f30226h.H(null);
            }
        }
    }

    /* JADX INFO: renamed from: o.d$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e implements B {
        e() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(CharSequence charSequence) {
            if (charSequence != null) {
                C2996d.this.O(charSequence);
                C2996d.this.f30226h.H(null);
            }
        }
    }

    /* JADX INFO: renamed from: o.d$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class f implements B {
        f() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                C2996d.this.N();
                C2996d.this.f30226h.I(false);
            }
        }
    }

    /* JADX INFO: renamed from: o.d$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class g implements B {
        g() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                if (C2996d.this.I()) {
                    C2996d.this.R();
                } else {
                    C2996d.this.Q();
                }
                C2996d.this.f30226h.Y(false);
            }
        }
    }

    /* JADX INFO: renamed from: o.d$h */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class h implements B {
        h() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                C2996d.this.z(1);
                C2996d.this.dismiss();
                C2996d.this.f30226h.S(false);
            }
        }
    }

    /* JADX INFO: renamed from: o.d$i */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2996d.this.f30226h.T(false);
        }
    }

    /* JADX INFO: renamed from: o.d$j */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class j implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f30238g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ CharSequence f30239h;

        j(int i10, CharSequence charSequence) {
            this.f30238g = i10;
            this.f30239h = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2996d.this.S(this.f30238g, this.f30239h);
        }
    }

    /* JADX INFO: renamed from: o.d$k */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class k implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ C2998f.b f30241g;

        k(C2998f.b bVar) {
            this.f30241g = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2996d.this.f30226h.l().onAuthenticationSucceeded(this.f30241g);
        }
    }

    /* JADX INFO: renamed from: o.d$l */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class l {
        static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: o.d$m */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class m {
        static void a(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        static void b(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        static BiometricPrompt c(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        static BiometricPrompt.Builder d(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        static void e(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void h(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* JADX INFO: renamed from: o.d$n */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class n {
        static void a(BiometricPrompt.Builder builder, boolean z10) {
            builder.setConfirmationRequired(z10);
        }

        static void b(BiometricPrompt.Builder builder, boolean z10) {
            builder.setDeviceCredentialAllowed(z10);
        }
    }

    /* JADX INFO: renamed from: o.d$o */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class o {
        static void a(BiometricPrompt.Builder builder, int i10) {
            builder.setAllowedAuthenticators(i10);
        }
    }

    /* JADX INFO: renamed from: o.d$p */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class p implements Executor {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Handler f30243g = new Handler(Looper.getMainLooper());

        p() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f30243g.post(runnable);
        }
    }

    /* JADX INFO: renamed from: o.d$q */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class q implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WeakReference f30244g;

        q(C2996d c2996d) {
            this.f30244g = new WeakReference(c2996d);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f30244g.get() != null) {
                ((C2996d) this.f30244g.get()).a0();
            }
        }
    }

    /* JADX INFO: renamed from: o.d$r */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class r implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WeakReference f30245g;

        r(o.g gVar) {
            this.f30245g = new WeakReference(gVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f30245g.get() != null) {
                ((o.g) this.f30245g.get()).R(false);
            }
        }
    }

    /* JADX INFO: renamed from: o.d$s */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class s implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WeakReference f30246g;

        s(o.g gVar) {
            this.f30246g = new WeakReference(gVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f30246g.get() != null) {
                ((o.g) this.f30246g.get()).X(false);
            }
        }
    }

    private static int A(C3665a c3665a) {
        if (c3665a.f()) {
            return !c3665a.e() ? 11 : 0;
        }
        return 12;
    }

    private void B() {
        if (getActivity() == null) {
            return;
        }
        o.g gVar = (o.g) new U(getActivity()).b(o.g.class);
        this.f30226h = gVar;
        gVar.i().h(this, new c());
        this.f30226h.g().h(this, new C0332d());
        this.f30226h.h().h(this, new e());
        this.f30226h.x().h(this, new f());
        this.f30226h.F().h(this, new g());
        this.f30226h.C().h(this, new h());
    }

    private void C() {
        this.f30226h.b0(false);
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            o.l lVar = (o.l) parentFragmentManager.j0("androidx.biometric.FingerprintDialogFragment");
            if (lVar != null) {
                if (lVar.isAdded()) {
                    lVar.dismissAllowingStateLoss();
                } else {
                    parentFragmentManager.o().n(lVar).i();
                }
            }
        }
    }

    private int D() {
        Context context = getContext();
        return (context == null || !o.j.f(context, Build.MODEL)) ? 2000 : 0;
    }

    private void E(int i10) {
        if (i10 == -1) {
            V(new C2998f.b(null, 1));
        } else {
            S(10, getString(u.f30340l));
        }
    }

    private boolean F() {
        AbstractActivityC1749q activity = getActivity();
        return activity != null && activity.isChangingConfigurations();
    }

    private boolean G() {
        AbstractActivityC1749q activity = getActivity();
        return (activity == null || this.f30226h.n() == null || !o.j.g(activity, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    private boolean H() {
        return Build.VERSION.SDK_INT == 28 && !o.n.a(getContext());
    }

    private boolean J() {
        return Build.VERSION.SDK_INT < 28 || G() || H();
    }

    private void K() {
        AbstractActivityC1749q activity = getActivity();
        if (activity == null) {
            return;
        }
        KeyguardManager keyguardManagerA = o.m.a(activity);
        if (keyguardManagerA == null) {
            S(12, getString(u.f30339k));
            return;
        }
        CharSequence charSequenceW = this.f30226h.w();
        CharSequence charSequenceV = this.f30226h.v();
        CharSequence charSequenceO = this.f30226h.o();
        if (charSequenceV == null) {
            charSequenceV = charSequenceO;
        }
        Intent intentA = l.a(keyguardManagerA, charSequenceW, charSequenceV);
        if (intentA == null) {
            S(14, getString(u.f30338j));
            return;
        }
        this.f30226h.P(true);
        if (J()) {
            C();
        }
        intentA.setFlags(134742016);
        startActivityForResult(intentA, 1);
    }

    static C2996d L() {
        return new C2996d();
    }

    private void T(int i10, CharSequence charSequence) {
        if (!this.f30226h.A() && this.f30226h.y()) {
            this.f30226h.L(false);
            this.f30226h.m().execute(new a(i10, charSequence));
        }
    }

    private void U() {
        if (this.f30226h.y()) {
            this.f30226h.m().execute(new b());
        }
    }

    private void V(C2998f.b bVar) {
        W(bVar);
        dismiss();
    }

    private void W(C2998f.b bVar) {
        if (this.f30226h.y()) {
            this.f30226h.L(false);
            this.f30226h.m().execute(new k(bVar));
        }
    }

    private void X() {
        BiometricPrompt.Builder builderD = m.d(requireContext().getApplicationContext());
        CharSequence charSequenceW = this.f30226h.w();
        CharSequence charSequenceV = this.f30226h.v();
        CharSequence charSequenceO = this.f30226h.o();
        if (charSequenceW != null) {
            m.h(builderD, charSequenceW);
        }
        if (charSequenceV != null) {
            m.g(builderD, charSequenceV);
        }
        if (charSequenceO != null) {
            m.e(builderD, charSequenceO);
        }
        CharSequence charSequenceU = this.f30226h.u();
        if (!TextUtils.isEmpty(charSequenceU)) {
            m.f(builderD, charSequenceU, this.f30226h.m(), this.f30226h.t());
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            n.a(builderD, this.f30226h.z());
        }
        int iE = this.f30226h.e();
        if (i10 >= 30) {
            o.a(builderD, iE);
        } else if (i10 >= 29) {
            n.b(builderD, AbstractC2994b.c(iE));
        }
        x(m.c(builderD), getContext());
    }

    private void Y() {
        Context applicationContext = requireContext().getApplicationContext();
        C3665a c3665aC = C3665a.c(applicationContext);
        int iA = A(c3665aC);
        if (iA != 0) {
            S(iA, o.k.a(applicationContext, iA));
            return;
        }
        if (isAdded()) {
            this.f30226h.T(true);
            if (!o.j.f(applicationContext, Build.MODEL)) {
                this.f30225g.postDelayed(new i(), 500L);
                o.l.B().show(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.f30226h.M(0);
            y(c3665aC, applicationContext);
        }
    }

    private void Z(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(u.f30330b);
        }
        this.f30226h.W(2);
        this.f30226h.U(charSequence);
    }

    boolean I() {
        return Build.VERSION.SDK_INT <= 28 && AbstractC2994b.c(this.f30226h.e());
    }

    void M(int i10, CharSequence charSequence) {
        if (!o.k.b(i10)) {
            i10 = 8;
        }
        Context context = getContext();
        if (Build.VERSION.SDK_INT < 29 && o.k.c(i10) && context != null && o.m.b(context) && AbstractC2994b.c(this.f30226h.e())) {
            K();
            return;
        }
        if (!J()) {
            if (charSequence == null) {
                charSequence = getString(u.f30330b) + " " + i10;
            }
            S(i10, charSequence);
            return;
        }
        if (charSequence == null) {
            charSequence = o.k.a(getContext(), i10);
        }
        if (i10 == 5) {
            int iJ = this.f30226h.j();
            if (iJ == 0 || iJ == 3) {
                T(i10, charSequence);
            }
            dismiss();
            return;
        }
        if (this.f30226h.D()) {
            S(i10, charSequence);
        } else {
            Z(charSequence);
            this.f30225g.postDelayed(new j(i10, charSequence), D());
        }
        this.f30226h.T(true);
    }

    void N() {
        if (J()) {
            Z(getString(u.f30337i));
        }
        U();
    }

    void O(CharSequence charSequence) {
        if (J()) {
            Z(charSequence);
        }
    }

    void P(C2998f.b bVar) {
        V(bVar);
    }

    void Q() {
        CharSequence charSequenceU = this.f30226h.u();
        if (charSequenceU == null) {
            charSequenceU = getString(u.f30330b);
        }
        S(13, charSequenceU);
        z(2);
    }

    void R() {
        K();
    }

    void S(int i10, CharSequence charSequence) {
        T(i10, charSequence);
        dismiss();
    }

    void a0() {
        if (this.f30226h.G() || getContext() == null) {
            return;
        }
        this.f30226h.b0(true);
        this.f30226h.L(true);
        if (J()) {
            Y();
        } else {
            X();
        }
    }

    void dismiss() {
        this.f30226h.b0(false);
        C();
        if (!this.f30226h.A() && isAdded()) {
            getParentFragmentManager().o().n(this).i();
        }
        Context context = getContext();
        if (context == null || !o.j.e(context, Build.MODEL)) {
            return;
        }
        this.f30226h.R(true);
        this.f30225g.postDelayed(new r(this.f30226h), 600L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            this.f30226h.P(false);
            E(i11);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        B();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && AbstractC2994b.c(this.f30226h.e())) {
            this.f30226h.X(true);
            this.f30225g.postDelayed(new s(this.f30226h), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.f30226h.A() || F()) {
            return;
        }
        z(0);
    }

    void w(C2998f.d dVar, C2998f.c cVar) {
        AbstractActivityC1749q activity = getActivity();
        if (activity == null) {
            return;
        }
        this.f30226h.a0(dVar);
        int iB = AbstractC2994b.b(dVar, cVar);
        if (Build.VERSION.SDK_INT < 30 && iB == 15 && cVar == null) {
            this.f30226h.Q(o.i.a());
        } else {
            this.f30226h.Q(cVar);
        }
        if (I()) {
            this.f30226h.Z(getString(u.f30329a));
        } else {
            this.f30226h.Z(null);
        }
        if (I() && C2997e.g(activity).a(255) != 0) {
            this.f30226h.L(true);
            K();
        } else if (this.f30226h.B()) {
            this.f30225g.postDelayed(new q(this), 600L);
        } else {
            a0();
        }
    }

    void x(BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject cryptoObjectD = o.i.d(this.f30226h.n());
        CancellationSignal cancellationSignalB = this.f30226h.k().b();
        p pVar = new p();
        BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallbackA = this.f30226h.f().a();
        try {
            if (cryptoObjectD == null) {
                m.b(biometricPrompt, cancellationSignalB, pVar, biometricPrompt$AuthenticationCallbackA);
            } else {
                m.a(biometricPrompt, cryptoObjectD, cancellationSignalB, pVar, biometricPrompt$AuthenticationCallbackA);
            }
        } catch (NullPointerException unused) {
            S(1, context != null ? context.getString(u.f30330b) : PointerEventHelper.POINTER_TYPE_UNKNOWN);
        }
    }

    void y(C3665a c3665a, Context context) {
        try {
            c3665a.a(o.i.e(this.f30226h.n()), 0, this.f30226h.k().c(), this.f30226h.f().b(), null);
        } catch (NullPointerException unused) {
            S(1, o.k.a(context, 1));
        }
    }

    void z(int i10) {
        if (i10 == 3 || !this.f30226h.E()) {
            if (J()) {
                this.f30226h.M(i10);
                if (i10 == 1) {
                    T(10, o.k.a(getContext(), 10));
                }
            }
            this.f30226h.k().a();
        }
    }
}
