package x1;

import B1.n;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import v1.EnumC3417a;
import x1.InterfaceC3522f;

/* JADX INFO: renamed from: x1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3519c implements InterfaceC3522f, d.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f33278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C3523g f33279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3522f.a f33280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33281j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private v1.f f33282k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f33283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile n.a f33285n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private File f33286o;

    C3519c(C3523g c3523g, InterfaceC3522f.a aVar) {
        this(c3523g.c(), c3523g, aVar);
    }

    private boolean d() {
        return this.f33284m < this.f33283l.size();
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void a(Exception exc) {
        this.f33280i.j(this.f33282k, exc, this.f33285n.f301c, EnumC3417a.DATA_DISK_CACHE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (d() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.f33283l;
        r3 = r7.f33284m;
        r7.f33284m = r3 + 1;
        r7.f33285n = ((B1.n) r0.get(r3)).buildLoadData(r7.f33286o, r7.f33279h.t(), r7.f33279h.f(), r7.f33279h.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.f33285n == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f33279h.u(r7.f33285n.f301c.getDataClass()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.f33285n.f301c.loadData(r7.f33279h.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.f33285n = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    @Override // x1.InterfaceC3522f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b() {
        R1.b.a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z10 = false;
                if (this.f33283l != null && d()) {
                    break;
                }
                int i10 = this.f33281j + 1;
                this.f33281j = i10;
                if (i10 >= this.f33278g.size()) {
                    return false;
                }
                v1.f fVar = (v1.f) this.f33278g.get(this.f33281j);
                File fileA = this.f33279h.d().a(new C3520d(fVar, this.f33279h.p()));
                this.f33286o = fileA;
                if (fileA != null) {
                    this.f33282k = fVar;
                    this.f33283l = this.f33279h.j(fileA);
                    this.f33284m = 0;
                }
            } finally {
                R1.b.e();
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Object obj) {
        this.f33280i.h(this.f33282k, obj, this.f33285n.f301c, EnumC3417a.DATA_DISK_CACHE, this.f33282k);
    }

    @Override // x1.InterfaceC3522f
    public void cancel() {
        n.a aVar = this.f33285n;
        if (aVar != null) {
            aVar.f301c.cancel();
        }
    }

    C3519c(List list, C3523g c3523g, InterfaceC3522f.a aVar) {
        this.f33281j = -1;
        this.f33278g = list;
        this.f33279h = c3523g;
        this.f33280i = aVar;
    }
}
