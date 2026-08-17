package V7;

import C8.AbstractC0407d0;
import L7.h0;
import b8.InterfaceC1817a;
import b8.InterfaceC1818b;
import expo.modules.notifications.service.NotificationsService;
import j7.AbstractC2800q;
import j7.K;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class c implements W7.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f11811f = {D.k(new v(D.b(c.class), NotificationsService.EVENT_TYPE_KEY, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k8.c f11812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0 f11813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B8.i f11814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1818b f11815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f11816e;

    public c(X7.k c10, InterfaceC1817a interfaceC1817a, k8.c fqName) {
        h0 NO_SOURCE;
        Collection arguments;
        AbstractC2855l.g(c10, "c");
        AbstractC2855l.g(fqName, "fqName");
        this.f11812a = fqName;
        if (interfaceC1817a == null || (NO_SOURCE = c10.a().t().a(interfaceC1817a)) == null) {
            NO_SOURCE = h0.f7335a;
            AbstractC2855l.f(NO_SOURCE, "NO_SOURCE");
        }
        this.f11813b = NO_SOURCE;
        this.f11814c = c10.e().e(new b(c10, this));
        this.f11815d = (interfaceC1817a == null || (arguments = interfaceC1817a.getArguments()) == null) ? null : (InterfaceC1818b) AbstractC2800q.f0(arguments);
        boolean z10 = false;
        if (interfaceC1817a != null && interfaceC1817a.e()) {
            z10 = true;
        }
        this.f11816e = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC0407d0 h(X7.k kVar, c cVar) {
        AbstractC0407d0 abstractC0407d0R = kVar.d().n().o(cVar.d()).r();
        AbstractC2855l.f(abstractC0407d0R, "getDefaultType(...)");
        return abstractC0407d0R;
    }

    @Override // M7.c
    public Map a() {
        return K.i();
    }

    protected final InterfaceC1818b c() {
        return this.f11815d;
    }

    @Override // M7.c
    public k8.c d() {
        return this.f11812a;
    }

    @Override // W7.g
    public boolean e() {
        return this.f11816e;
    }

    @Override // M7.c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC0407d0 getType() {
        return (AbstractC0407d0) B8.m.a(this.f11814c, this, f11811f[0]);
    }

    @Override // M7.c
    public h0 g() {
        return this.f11813b;
    }
}
