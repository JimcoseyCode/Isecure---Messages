package d;

import e.C2383e;
import e.C2385g;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25539c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f25542f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2385g.InterfaceC0255g f25537a = C2385g.c.f25807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25538b = C2383e.f25800b.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C2385g.b f25540d = C2385g.b.C0254b.f25805a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f25545c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f25547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f25548f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C2385g.InterfaceC0255g f25543a = C2385g.c.f25807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25544b = C2383e.f25800b.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C2385g.b f25546d = C2385g.b.C0254b.f25805a;

        public final g a() {
            g gVar = new g();
            gVar.m(this.f25543a);
            gVar.k(this.f25544b);
            gVar.n(this.f25545c);
            gVar.j(this.f25546d);
            gVar.i(this.f25547e);
            gVar.h(this.f25548f);
            gVar.l(null);
            return gVar;
        }

        public final a b(C2385g.b defaultTab) {
            AbstractC2855l.g(defaultTab, "defaultTab");
            this.f25546d = defaultTab;
            return this;
        }

        public final a c(C2385g.InterfaceC0255g mediaType) {
            AbstractC2855l.g(mediaType, "mediaType");
            this.f25543a = mediaType;
            return this;
        }

        public final a d(boolean z10) {
            this.f25545c = z10;
            return this;
        }
    }

    public final long a() {
        return this.f25542f;
    }

    public final C2385g.b b() {
        return this.f25540d;
    }

    public final int c() {
        return this.f25538b;
    }

    public final C2385g.e d() {
        return null;
    }

    public final C2385g.InterfaceC0255g e() {
        return this.f25537a;
    }

    public final boolean f() {
        return this.f25541e;
    }

    public final boolean g() {
        return this.f25539c;
    }

    public final void h(long j10) {
        this.f25542f = j10;
    }

    public final void i(boolean z10) {
        this.f25541e = z10;
    }

    public final void j(C2385g.b bVar) {
        AbstractC2855l.g(bVar, "<set-?>");
        this.f25540d = bVar;
    }

    public final void k(int i10) {
        this.f25538b = i10;
    }

    public final void m(C2385g.InterfaceC0255g interfaceC0255g) {
        AbstractC2855l.g(interfaceC0255g, "<set-?>");
        this.f25537a = interfaceC0255g;
    }

    public final void n(boolean z10) {
        this.f25539c = z10;
    }

    public final void l(C2385g.e eVar) {
    }
}
