package com.google.android.gms.common.api.internal;

import P4.C1379m;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import expo.modules.kotlin.activityresult.DataPersistorKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import m0.C2892a;
import o4.AbstractC3012e;
import o4.C3008a;
import o4.f;
import p4.AbstractC3059f;
import p4.AbstractC3071r;
import p4.AbstractC3073t;
import p4.BinderC3077x;
import p4.C3055b;
import r4.AbstractC3267h;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements f.a, f.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3008a.f f21070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3055b f21071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f21072f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final BinderC3077x f21076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f21077k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ C2098b f21081o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f21069c = new LinkedList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f21073g = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f21074h = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f21078l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ConnectionResult f21079m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f21080n = 0;

    public n(C2098b c2098b, AbstractC3012e abstractC3012e) {
        this.f21081o = c2098b;
        C3008a.f fVarK = abstractC3012e.k(c2098b.f21048n.getLooper(), this);
        this.f21070d = fVarK;
        this.f21071e = abstractC3012e.h();
        this.f21072f = new g();
        this.f21075i = abstractC3012e.j();
        if (fVarK.o()) {
            this.f21076j = abstractC3012e.l(c2098b.f21039e, c2098b.f21048n);
        } else {
            this.f21076j = null;
        }
    }

    static /* bridge */ /* synthetic */ void B(n nVar, o oVar) {
        if (nVar.f21078l.contains(oVar) && !nVar.f21077k) {
            if (nVar.f21070d.i()) {
                nVar.j();
            } else {
                nVar.E();
            }
        }
    }

    static /* bridge */ /* synthetic */ void C(n nVar, o oVar) {
        Feature[] featureArrG;
        if (nVar.f21078l.remove(oVar)) {
            nVar.f21081o.f21048n.removeMessages(15, oVar);
            nVar.f21081o.f21048n.removeMessages(16, oVar);
            Feature feature = oVar.f21083b;
            ArrayList arrayList = new ArrayList(nVar.f21069c.size());
            for (x xVar : nVar.f21069c) {
                if ((xVar instanceof AbstractC3071r) && (featureArrG = ((AbstractC3071r) xVar).g(nVar)) != null && y4.b.b(featureArrG, feature)) {
                    arrayList.add(xVar);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                x xVar2 = (x) arrayList.get(i10);
                nVar.f21069c.remove(xVar2);
                xVar2.b(new o4.i(feature));
            }
        }
    }

    private final Feature e(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] featureArrM = this.f21070d.m();
            if (featureArrM == null) {
                featureArrM = new Feature[0];
            }
            C2892a c2892a = new C2892a(featureArrM.length);
            for (Feature feature : featureArrM) {
                c2892a.put(feature.e(), Long.valueOf(feature.s()));
            }
            for (Feature feature2 : featureArr) {
                Long l10 = (Long) c2892a.get(feature2.e());
                if (l10 == null || l10.longValue() < feature2.s()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final void g(ConnectionResult connectionResult) {
        Iterator it = this.f21073g.iterator();
        if (!it.hasNext()) {
            this.f21073g.clear();
            return;
        }
        android.support.v4.media.session.b.a(it.next());
        if (AbstractC3267h.a(connectionResult, ConnectionResult.f20991k)) {
            this.f21070d.e();
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Status status) {
        AbstractC3268i.d(this.f21081o.f21048n);
        i(status, null, false);
    }

    private final void i(Status status, Exception exc, boolean z10) {
        AbstractC3268i.d(this.f21081o.f21048n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f21069c.iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            if (!z10 || xVar.f21107a == 2) {
                if (status != null) {
                    xVar.a(status);
                } else {
                    xVar.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void j() {
        ArrayList arrayList = new ArrayList(this.f21069c);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = (x) arrayList.get(i10);
            if (!this.f21070d.i()) {
                return;
            }
            if (p(xVar)) {
                this.f21069c.remove(xVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        D();
        g(ConnectionResult.f20991k);
        o();
        Iterator it = this.f21074h.values().iterator();
        while (it.hasNext()) {
            AbstractC3073t abstractC3073t = (AbstractC3073t) it.next();
            if (e(abstractC3073t.f30646a.b()) != null) {
                it.remove();
            } else {
                try {
                    abstractC3073t.f30646a.c(this.f21070d, new C1379m());
                } catch (DeadObjectException unused) {
                    c(3);
                    this.f21070d.c("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        j();
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(int i10) {
        D();
        this.f21077k = true;
        this.f21072f.c(i10, this.f21070d.n());
        C3055b c3055b = this.f21071e;
        C2098b c2098b = this.f21081o;
        c2098b.f21048n.sendMessageDelayed(Message.obtain(c2098b.f21048n, 9, c3055b), 5000L);
        C3055b c3055b2 = this.f21071e;
        C2098b c2098b2 = this.f21081o;
        c2098b2.f21048n.sendMessageDelayed(Message.obtain(c2098b2.f21048n, 11, c3055b2), 120000L);
        this.f21081o.f21041g.c();
        Iterator it = this.f21074h.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3073t) it.next()).f30648c.run();
        }
    }

    private final void m() {
        this.f21081o.f21048n.removeMessages(12, this.f21071e);
        C3055b c3055b = this.f21071e;
        C2098b c2098b = this.f21081o;
        c2098b.f21048n.sendMessageDelayed(c2098b.f21048n.obtainMessage(12, c3055b), this.f21081o.f21035a);
    }

    private final void n(x xVar) {
        xVar.d(this.f21072f, a());
        try {
            xVar.c(this);
        } catch (DeadObjectException unused) {
            c(1);
            this.f21070d.c("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void o() {
        if (this.f21077k) {
            C2098b c2098b = this.f21081o;
            c2098b.f21048n.removeMessages(11, this.f21071e);
            C2098b c2098b2 = this.f21081o;
            c2098b2.f21048n.removeMessages(9, this.f21071e);
            this.f21077k = false;
        }
    }

    private final boolean p(x xVar) {
        if (!(xVar instanceof AbstractC3071r)) {
            n(xVar);
            return true;
        }
        AbstractC3071r abstractC3071r = (AbstractC3071r) xVar;
        Feature featureE = e(abstractC3071r.g(this));
        if (featureE == null) {
            n(xVar);
            return true;
        }
        this.f21070d.getClass();
        featureE.e();
        featureE.s();
        if (!this.f21081o.f21049o || !abstractC3071r.f(this)) {
            abstractC3071r.b(new o4.i(featureE));
            return true;
        }
        o oVar = new o(this.f21071e, featureE, null);
        int iIndexOf = this.f21078l.indexOf(oVar);
        if (iIndexOf >= 0) {
            o oVar2 = (o) this.f21078l.get(iIndexOf);
            this.f21081o.f21048n.removeMessages(15, oVar2);
            C2098b c2098b = this.f21081o;
            c2098b.f21048n.sendMessageDelayed(Message.obtain(c2098b.f21048n, 15, oVar2), 5000L);
            return false;
        }
        this.f21078l.add(oVar);
        C2098b c2098b2 = this.f21081o;
        c2098b2.f21048n.sendMessageDelayed(Message.obtain(c2098b2.f21048n, 15, oVar), 5000L);
        C2098b c2098b3 = this.f21081o;
        c2098b3.f21048n.sendMessageDelayed(Message.obtain(c2098b3.f21048n, 16, oVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (q(connectionResult)) {
            return false;
        }
        this.f21081o.e(connectionResult, this.f21075i);
        return false;
    }

    private final boolean q(ConnectionResult connectionResult) {
        synchronized (C2098b.f21033r) {
            try {
                C2098b c2098b = this.f21081o;
                if (c2098b.f21045k == null || !c2098b.f21046l.contains(this.f21071e)) {
                    return false;
                }
                this.f21081o.f21045k.s(connectionResult, this.f21075i);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean r(boolean z10) {
        AbstractC3268i.d(this.f21081o.f21048n);
        if (!this.f21070d.i() || !this.f21074h.isEmpty()) {
            return false;
        }
        if (!this.f21072f.e()) {
            this.f21070d.c("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        m();
        return false;
    }

    public final void D() {
        AbstractC3268i.d(this.f21081o.f21048n);
        this.f21079m = null;
    }

    public final void E() {
        AbstractC3268i.d(this.f21081o.f21048n);
        if (this.f21070d.i() || this.f21070d.d()) {
            return;
        }
        try {
            C2098b c2098b = this.f21081o;
            int iB = c2098b.f21041g.b(c2098b.f21039e, this.f21070d);
            if (iB != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iB, null);
                this.f21070d.getClass();
                connectionResult.toString();
                H(connectionResult, null);
                return;
            }
            C2098b c2098b2 = this.f21081o;
            C3008a.f fVar = this.f21070d;
            q qVar = new q(c2098b2, fVar, this.f21071e);
            if (fVar.o()) {
                ((BinderC3077x) AbstractC3268i.k(this.f21076j)).A(qVar);
            }
            try {
                this.f21070d.f(qVar);
            } catch (SecurityException e10) {
                H(new ConnectionResult(10), e10);
            }
        } catch (IllegalStateException e11) {
            H(new ConnectionResult(10), e11);
        }
    }

    public final void F(x xVar) {
        AbstractC3268i.d(this.f21081o.f21048n);
        if (this.f21070d.i()) {
            if (p(xVar)) {
                m();
                return;
            } else {
                this.f21069c.add(xVar);
                return;
            }
        }
        this.f21069c.add(xVar);
        ConnectionResult connectionResult = this.f21079m;
        if (connectionResult == null || !connectionResult.k0()) {
            E();
        } else {
            H(this.f21079m, null);
        }
    }

    final void G() {
        this.f21080n++;
    }

    public final void H(ConnectionResult connectionResult, Exception exc) {
        AbstractC3268i.d(this.f21081o.f21048n);
        BinderC3077x binderC3077x = this.f21076j;
        if (binderC3077x != null) {
            binderC3077x.B();
        }
        D();
        this.f21081o.f21041g.c();
        g(connectionResult);
        if ((this.f21070d instanceof t4.e) && connectionResult.e() != 24) {
            this.f21081o.f21036b = true;
            C2098b c2098b = this.f21081o;
            c2098b.f21048n.sendMessageDelayed(c2098b.f21048n.obtainMessage(19), DataPersistorKt.EXPIRATION_TIME);
        }
        if (connectionResult.e() == 4) {
            h(C2098b.f21032q);
            return;
        }
        if (this.f21069c.isEmpty()) {
            this.f21079m = connectionResult;
            return;
        }
        if (exc != null) {
            AbstractC3268i.d(this.f21081o.f21048n);
            i(null, exc, false);
            return;
        }
        if (!this.f21081o.f21049o) {
            h(C2098b.f(this.f21071e, connectionResult));
            return;
        }
        i(C2098b.f(this.f21071e, connectionResult), null, true);
        if (this.f21069c.isEmpty() || q(connectionResult) || this.f21081o.e(connectionResult, this.f21075i)) {
            return;
        }
        if (connectionResult.e() == 18) {
            this.f21077k = true;
        }
        if (!this.f21077k) {
            h(C2098b.f(this.f21071e, connectionResult));
            return;
        }
        C2098b c2098b2 = this.f21081o;
        c2098b2.f21048n.sendMessageDelayed(Message.obtain(c2098b2.f21048n, 9, this.f21071e), 5000L);
    }

    public final void I(ConnectionResult connectionResult) {
        AbstractC3268i.d(this.f21081o.f21048n);
        C3008a.f fVar = this.f21070d;
        fVar.c("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        H(connectionResult, null);
    }

    public final void J() {
        AbstractC3268i.d(this.f21081o.f21048n);
        if (this.f21077k) {
            E();
        }
    }

    public final void K() {
        AbstractC3268i.d(this.f21081o.f21048n);
        h(C2098b.f21031p);
        this.f21072f.d();
        for (AbstractC3059f abstractC3059f : (AbstractC3059f[]) this.f21074h.keySet().toArray(new AbstractC3059f[0])) {
            F(new w(abstractC3059f, new C1379m()));
        }
        g(new ConnectionResult(4));
        if (this.f21070d.i()) {
            this.f21070d.h(new m(this));
        }
    }

    public final void L() {
        AbstractC3268i.d(this.f21081o.f21048n);
        if (this.f21077k) {
            o();
            C2098b c2098b = this.f21081o;
            h(c2098b.f21040f.g(c2098b.f21039e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f21070d.c("Timing out connection while resuming.");
        }
    }

    public final boolean a() {
        return this.f21070d.o();
    }

    public final boolean b() {
        return r(true);
    }

    @Override // p4.InterfaceC3056c
    public final void c(int i10) {
        if (Looper.myLooper() == this.f21081o.f21048n.getLooper()) {
            l(i10);
        } else {
            this.f21081o.f21048n.post(new k(this, i10));
        }
    }

    @Override // p4.InterfaceC3061h
    public final void d(ConnectionResult connectionResult) {
        H(connectionResult, null);
    }

    @Override // p4.InterfaceC3056c
    public final void f(Bundle bundle) {
        if (Looper.myLooper() == this.f21081o.f21048n.getLooper()) {
            k();
        } else {
            this.f21081o.f21048n.post(new j(this));
        }
    }

    public final int s() {
        return this.f21075i;
    }

    final int t() {
        return this.f21080n;
    }

    public final C3008a.f v() {
        return this.f21070d;
    }

    public final Map x() {
        return this.f21074h;
    }
}
