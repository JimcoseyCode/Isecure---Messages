package o4;

import P4.AbstractC1378l;
import P4.C1379m;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C2098b;
import com.google.android.gms.common.api.internal.n;
import java.util.Collections;
import o4.C3008a;
import p4.AbstractServiceConnectionC3060g;
import p4.BinderC3077x;
import p4.C3054a;
import p4.C3055b;
import p4.C3068o;
import p4.InterfaceC3063j;
import r4.AbstractC3268i;
import r4.C3262c;

/* JADX INFO: renamed from: o4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3012e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3008a f30484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3008a.d f30485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3055b f30486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Looper f30487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f30488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f30489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3063j f30490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final C2098b f30491j;

    /* JADX INFO: renamed from: o4.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f30492c = new C0337a().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC3063j f30493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Looper f30494b;

        /* JADX INFO: renamed from: o4.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static class C0337a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private InterfaceC3063j f30495a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Looper f30496b;

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.f30495a == null) {
                    this.f30495a = new C3054a();
                }
                if (this.f30496b == null) {
                    this.f30496b = Looper.getMainLooper();
                }
                return new a(this.f30495a, this.f30496b);
            }
        }

        private a(InterfaceC3063j interfaceC3063j, Account account, Looper looper) {
            this.f30493a = interfaceC3063j;
            this.f30494b = looper;
        }
    }

    private AbstractC3012e(Context context, Activity activity, C3008a c3008a, C3008a.d dVar, a aVar) {
        AbstractC3268i.l(context, "Null context is not permitted.");
        AbstractC3268i.l(c3008a, "Api must not be null.");
        AbstractC3268i.l(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) AbstractC3268i.l(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f30482a = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : g(context);
        this.f30483b = attributionTag;
        this.f30484c = c3008a;
        this.f30485d = dVar;
        this.f30487f = aVar.f30494b;
        C3055b c3055bA = C3055b.a(c3008a, dVar, attributionTag);
        this.f30486e = c3055bA;
        this.f30489h = new C3068o(this);
        C2098b c2098bT = C2098b.t(context2);
        this.f30491j = c2098bT;
        this.f30488g = c2098bT.k();
        this.f30490i = aVar.f30493a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.h.u(activity, c2098bT, c3055bA);
        }
        c2098bT.D(this);
    }

    private final AbstractC1378l m(int i10, com.google.android.gms.common.api.internal.d dVar) {
        C1379m c1379m = new C1379m();
        this.f30491j.z(this, i10, dVar, c1379m, this.f30490i);
        return c1379m.a();
    }

    protected C3262c.a d() {
        C3262c.a aVar = new C3262c.a();
        aVar.d(null);
        aVar.c(Collections.EMPTY_SET);
        aVar.e(this.f30482a.getClass().getName());
        aVar.b(this.f30482a.getPackageName());
        return aVar;
    }

    public AbstractC1378l e(com.google.android.gms.common.api.internal.d dVar) {
        return m(2, dVar);
    }

    public AbstractC1378l f(com.google.android.gms.common.api.internal.d dVar) {
        return m(0, dVar);
    }

    protected String g(Context context) {
        return null;
    }

    public final C3055b h() {
        return this.f30486e;
    }

    protected String i() {
        return this.f30483b;
    }

    public final int j() {
        return this.f30488g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C3008a.f k(Looper looper, n nVar) {
        C3262c c3262cA = d().a();
        C3008a.f fVarA = ((C3008a.AbstractC0335a) AbstractC3268i.k(this.f30484c.a())).a(this.f30482a, looper, c3262cA, this.f30485d, nVar, nVar);
        String strI = i();
        if (strI != null && (fVarA instanceof com.google.android.gms.common.internal.b)) {
            ((com.google.android.gms.common.internal.b) fVarA).O(strI);
        }
        if (strI == null || !(fVarA instanceof AbstractServiceConnectionC3060g)) {
            return fVarA;
        }
        android.support.v4.media.session.b.a(fVarA);
        throw null;
    }

    public final BinderC3077x l(Context context, Handler handler) {
        return new BinderC3077x(context, handler, d().a());
    }

    public AbstractC3012e(Context context, C3008a c3008a, C3008a.d dVar, a aVar) {
        this(context, null, c3008a, dVar, aVar);
    }
}
