package com.facebook.drawee.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import c2.i;
import c2.k;
import com.facebook.drawee.drawable.E;
import com.facebook.drawee.drawable.F;
import d2.AbstractC2325a;
import v2.C3421c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b implements F {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private B2.b f19832j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19829g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19830h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19831i = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private B2.a f19833k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C3421c f19834l = C3421c.a();

    public b(B2.b bVar) {
        if (bVar != null) {
            q(bVar);
        }
    }

    private void a() {
        if (this.f19829g) {
            return;
        }
        this.f19834l.b(C3421c.a.ON_ATTACH_CONTROLLER);
        this.f19829g = true;
        B2.a aVar = this.f19833k;
        if (aVar == null || aVar.d() == null) {
            return;
        }
        this.f19833k.g();
    }

    private void b() {
        if (this.f19830h && this.f19831i) {
            a();
        } else {
            e();
        }
    }

    public static b c(B2.b bVar, Context context) {
        b bVar2 = new b(bVar);
        bVar2.n(context);
        return bVar2;
    }

    private void e() {
        if (this.f19829g) {
            this.f19834l.b(C3421c.a.ON_DETACH_CONTROLLER);
            this.f19829g = false;
            if (j()) {
                this.f19833k.c();
            }
        }
    }

    private void r(F f10) {
        Object objH = h();
        if (objH instanceof E) {
            ((E) objH).g(f10);
        }
    }

    @Override // com.facebook.drawee.drawable.F
    public void d(boolean z10) {
        if (this.f19831i == z10) {
            return;
        }
        this.f19834l.b(z10 ? C3421c.a.ON_DRAWABLE_SHOW : C3421c.a.ON_DRAWABLE_HIDE);
        this.f19831i = z10;
        b();
    }

    public B2.a f() {
        return this.f19833k;
    }

    public B2.b g() {
        return (B2.b) k.g(this.f19832j);
    }

    public Drawable h() {
        B2.b bVar = this.f19832j;
        if (bVar == null) {
            return null;
        }
        return bVar.e();
    }

    public boolean i() {
        return this.f19832j != null;
    }

    public boolean j() {
        B2.a aVar = this.f19833k;
        return aVar != null && aVar.d() == this.f19832j;
    }

    public void k() {
        this.f19834l.b(C3421c.a.ON_HOLDER_ATTACH);
        this.f19830h = true;
        b();
    }

    public void l() {
        this.f19834l.b(C3421c.a.ON_HOLDER_DETACH);
        this.f19830h = false;
        b();
    }

    public boolean m(MotionEvent motionEvent) {
        if (j()) {
            return this.f19833k.e(motionEvent);
        }
        return false;
    }

    public void o() {
        p(null);
    }

    @Override // com.facebook.drawee.drawable.F
    public void onDraw() {
        if (this.f19829g) {
            return;
        }
        AbstractC2325a.G(C3421c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f19833k)), toString());
        this.f19830h = true;
        this.f19831i = true;
        b();
    }

    public void p(B2.a aVar) {
        boolean z10 = this.f19829g;
        if (z10) {
            e();
        }
        if (j()) {
            this.f19834l.b(C3421c.a.ON_CLEAR_OLD_CONTROLLER);
            this.f19833k.b(null);
        }
        this.f19833k = aVar;
        if (aVar != null) {
            this.f19834l.b(C3421c.a.ON_SET_CONTROLLER);
            this.f19833k.b(this.f19832j);
        } else {
            this.f19834l.b(C3421c.a.ON_CLEAR_CONTROLLER);
        }
        if (z10) {
            a();
        }
    }

    public void q(B2.b bVar) {
        this.f19834l.b(C3421c.a.ON_SET_HIERARCHY);
        boolean zJ = j();
        r(null);
        B2.b bVar2 = (B2.b) k.g(bVar);
        this.f19832j = bVar2;
        Drawable drawableE = bVar2.e();
        d(drawableE == null || drawableE.isVisible());
        r(this);
        if (zJ) {
            this.f19833k.b(bVar);
        }
    }

    public String toString() {
        return i.b(this).c("controllerAttached", this.f19829g).c("holderAttached", this.f19830h).c("drawableVisible", this.f19831i).b("events", this.f19834l.toString()).toString();
    }

    public void n(Context context) {
    }
}
