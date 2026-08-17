package V7;

import I7.o;
import b8.InterfaceC1817a;
import b8.InterfaceC1818b;
import b8.InterfaceC1821e;
import b8.InterfaceC1829m;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f11835h = {D.k(new v(D.b(n.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final B8.i f11836g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InterfaceC1817a annotation, X7.k c10) {
        super(c10, annotation, o.a.f5156H);
        AbstractC2855l.g(annotation, "annotation");
        AbstractC2855l.g(c10, "c");
        this.f11836g = c10.e().e(new m(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map j(n nVar) {
        InterfaceC1818b interfaceC1818bC = nVar.c();
        q8.g gVarD = interfaceC1818bC instanceof InterfaceC1821e ? f.f11823a.d(((InterfaceC1821e) nVar.c()).e()) : interfaceC1818bC instanceof InterfaceC1829m ? f.f11823a.d(AbstractC2800q.e(nVar.c())) : null;
        Map mapF = gVarD != null ? K.f(t.a(d.f11817a.d(), gVarD)) : null;
        return mapF == null ? K.i() : mapF;
    }

    @Override // V7.c, M7.c
    public Map a() {
        return (Map) B8.m.a(this.f11836g, this, f11835h[0]);
    }
}
