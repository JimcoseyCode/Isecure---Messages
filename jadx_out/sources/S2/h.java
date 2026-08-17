package s2;

import W2.x;
import android.content.res.Resources;
import c2.n;
import c3.InterfaceC1844a;
import java.util.concurrent.Executor;
import v2.AbstractC3419a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f32267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC3419a f32268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1844a f32269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC1844a f32270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Executor f32271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x f32272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c2.f f32273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n f32274h;

    public void a(Resources resources, AbstractC3419a abstractC3419a, InterfaceC1844a interfaceC1844a, InterfaceC1844a interfaceC1844a2, Executor executor, x xVar, c2.f fVar, n nVar) {
        this.f32267a = resources;
        this.f32268b = abstractC3419a;
        this.f32269c = interfaceC1844a;
        this.f32270d = interfaceC1844a2;
        this.f32271e = executor;
        this.f32272f = xVar;
        this.f32273g = fVar;
        this.f32274h = nVar;
    }

    protected C3321e b(Resources resources, AbstractC3419a abstractC3419a, InterfaceC1844a interfaceC1844a, InterfaceC1844a interfaceC1844a2, Executor executor, x xVar, c2.f fVar) {
        return new C3321e(resources, abstractC3419a, interfaceC1844a, interfaceC1844a2, executor, xVar, fVar);
    }

    public C3321e c() {
        C3321e c3321eB = b(this.f32267a, this.f32268b, this.f32269c, this.f32270d, this.f32271e, this.f32272f, this.f32273g);
        n nVar = this.f32274h;
        if (nVar != null) {
            c3321eB.B0(((Boolean) nVar.get()).booleanValue());
        }
        return c3321eB;
    }
}
