package x1;

import B1.n;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import v1.EnumC3417a;
import x1.InterfaceC3522f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class w implements InterfaceC3522f, d.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3522f.a f33472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C3523g f33473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33475j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private v1.f f33476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f33477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile n.a f33479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private File f33480o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private x f33481p;

    w(C3523g c3523g, InterfaceC3522f.a aVar) {
        this.f33473h = c3523g;
        this.f33472g = aVar;
    }

    private boolean d() {
        return this.f33478m < this.f33477l.size();
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void a(Exception exc) {
        this.f33472g.j(this.f33481p, exc, this.f33479n.f301c, EnumC3417a.RESOURCE_DISK_CACHE);
    }

    @Override // x1.InterfaceC3522f
    public boolean b() {
        R1.b.a("ResourceCacheGenerator.startNext");
        try {
            List listC = this.f33473h.c();
            boolean z10 = false;
            if (listC.isEmpty()) {
                R1.b.e();
                return false;
            }
            List listM = this.f33473h.m();
            if (listM.isEmpty()) {
                if (File.class.equals(this.f33473h.r())) {
                    R1.b.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f33473h.i() + " to " + this.f33473h.r());
            }
            while (true) {
                if (this.f33477l != null && d()) {
                    this.f33479n = null;
                    while (!z10 && d()) {
                        List list = this.f33477l;
                        int i10 = this.f33478m;
                        this.f33478m = i10 + 1;
                        this.f33479n = ((B1.n) list.get(i10)).buildLoadData(this.f33480o, this.f33473h.t(), this.f33473h.f(), this.f33473h.k());
                        if (this.f33479n != null && this.f33473h.u(this.f33479n.f301c.getDataClass())) {
                            this.f33479n.f301c.loadData(this.f33473h.l(), this);
                            z10 = true;
                        }
                    }
                    R1.b.e();
                    return z10;
                }
                int i11 = this.f33475j + 1;
                this.f33475j = i11;
                if (i11 >= listM.size()) {
                    int i12 = this.f33474i + 1;
                    this.f33474i = i12;
                    if (i12 >= listC.size()) {
                        R1.b.e();
                        return false;
                    }
                    this.f33475j = 0;
                }
                v1.f fVar = (v1.f) listC.get(this.f33474i);
                Class cls = (Class) listM.get(this.f33475j);
                this.f33481p = new x(this.f33473h.b(), fVar, this.f33473h.p(), this.f33473h.t(), this.f33473h.f(), this.f33473h.s(cls), cls, this.f33473h.k());
                File fileA = this.f33473h.d().a(this.f33481p);
                this.f33480o = fileA;
                if (fileA != null) {
                    this.f33476k = fVar;
                    this.f33477l = this.f33473h.j(fileA);
                    this.f33478m = 0;
                }
            }
        } catch (Throwable th) {
            R1.b.e();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Object obj) {
        this.f33472g.h(this.f33476k, obj, this.f33479n.f301c, EnumC3417a.RESOURCE_DISK_CACHE, this.f33481p);
    }

    @Override // x1.InterfaceC3522f
    public void cancel() {
        n.a aVar = this.f33479n;
        if (aVar != null) {
            aVar.f301c.cancel();
        }
    }
}
