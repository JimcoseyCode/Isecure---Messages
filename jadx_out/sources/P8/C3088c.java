package p8;

import C8.B0;
import C8.N0;
import C8.S;
import D8.g;
import D8.n;
import I7.i;
import L7.InterfaceC1283h;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: p8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3088c implements InterfaceC3087b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B0 f30674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f30675b;

    public C3088c(B0 projection) {
        AbstractC2855l.g(projection, "projection");
        this.f30674a = projection;
        getProjection().a();
        N0 n02 = N0.f592k;
    }

    public Void a() {
        return null;
    }

    public final n b() {
        return this.f30675b;
    }

    @Override // C8.v0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C3088c o(g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        B0 b0O = getProjection().o(kotlinTypeRefiner);
        AbstractC2855l.f(b0O, "refine(...)");
        return new C3088c(b0O);
    }

    public final void d(n nVar) {
        this.f30675b = nVar;
    }

    @Override // C8.v0
    public Collection g() {
        S type = getProjection().a() == N0.f594m ? getProjection().getType() : n().I();
        AbstractC2855l.d(type);
        return AbstractC2800q.e(type);
    }

    @Override // C8.v0
    public List getParameters() {
        return AbstractC2800q.j();
    }

    @Override // p8.InterfaceC3087b
    public B0 getProjection() {
        return this.f30674a;
    }

    @Override // C8.v0
    public i n() {
        i iVarN = getProjection().getType().K0().n();
        AbstractC2855l.f(iVarN, "getBuiltIns(...)");
        return iVarN;
    }

    @Override // C8.v0
    public /* bridge */ /* synthetic */ InterfaceC1283h p() {
        return (InterfaceC1283h) a();
    }

    @Override // C8.v0
    public boolean q() {
        return false;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + getProjection() + ')';
    }
}
