package V7;

import I7.o;
import b8.InterfaceC1817a;
import i7.t;
import j7.K;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.v;
import q8.x;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f11827h = {D.k(new v(D.b(h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final B8.i f11828g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC1817a interfaceC1817a, X7.k c10) {
        super(c10, interfaceC1817a, o.a.f5231y);
        AbstractC2855l.g(c10, "c");
        this.f11828g = c10.e().e(g.f11826g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map j() {
        return K.f(t.a(d.f11817a.b(), new x("Deprecated in Java")));
    }

    @Override // V7.c, M7.c
    public Map a() {
        return (Map) B8.m.a(this.f11828g, this, f11827h[0]);
    }
}
