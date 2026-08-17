package V7;

import I7.o;
import b8.InterfaceC1817a;
import i7.t;
import j7.K;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f11832h = {D.k(new v(D.b(l.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final B8.i f11833g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC1817a annotation, X7.k c10) {
        super(c10, annotation, o.a.f5164L);
        AbstractC2855l.g(annotation, "annotation");
        AbstractC2855l.g(c10, "c");
        this.f11833g = c10.e().e(new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map j(l lVar) {
        q8.g gVarB = f.f11823a.b(lVar.c());
        Map mapF = gVarB != null ? K.f(t.a(d.f11817a.c(), gVarB)) : null;
        return mapF == null ? K.i() : mapF;
    }

    @Override // V7.c, M7.c
    public Map a() {
        return (Map) B8.m.a(this.f11833g, this, f11832h[0]);
    }
}
