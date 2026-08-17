package r;

import F.InterfaceC0513v0;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.lifecycle.AbstractC1776x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import t.C3346f;
import y.AbstractC3583h0;
import y.AbstractC3599t;

/* JADX INFO: renamed from: r.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3153b0 implements F.L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s.E f31203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x.h f31204c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C3232y f31206e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final H.u f31211j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final F.g1 f31213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC0513v0 f31214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final s.S f31215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final K.m f31216o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f31205d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private H.u f31207f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private H.u f31208g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private H.u f31209h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private H.u f31210i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f31212k = null;

    public C3153b0(String str, s.S s10, K.m mVar) {
        String str2 = (String) H0.g.g(str);
        this.f31202a = str2;
        this.f31215n = s10;
        s.E eC = s10.c(str2);
        this.f31203b = eC;
        this.f31204c = new x.h(this);
        F.g1 g1VarA = androidx.camera.camera2.internal.compat.quirk.a.a(str, eC);
        this.f31213l = g1VarA;
        this.f31214m = new N0(str, g1VarA);
        this.f31211j = new H.u(AbstractC3599t.a(AbstractC3599t.b.CLOSED));
        this.f31216o = mVar;
    }

    private void H() {
        I();
    }

    private void I() {
        String str;
        int iE = E();
        if (iE == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (iE == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (iE == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (iE == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (iE != 4) {
            str = "Unknown value: " + iE;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        AbstractC3583h0.e("Camera2CameraInfo", "Device Level: " + str);
    }

    @Override // F.L
    public Set A() {
        HashSet hashSet = new HashSet();
        int[] iArr = (int[]) this.f31203b.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i10 : iArr) {
                hashSet.add(Integer.valueOf(i10));
            }
        }
        return hashSet;
    }

    public x.h B() {
        return this.f31204c;
    }

    public s.E C() {
        return this.f31203b;
    }

    int D() {
        Integer num = (Integer) this.f31203b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        H0.g.g(num);
        return num.intValue();
    }

    int E() {
        Integer num = (Integer) this.f31203b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        H0.g.g(num);
        return num.intValue();
    }

    public boolean F() {
        return U1.b(this.f31203b);
    }

    void G(C3232y c3232y) {
        synchronized (this.f31205d) {
            try {
                this.f31206e = c3232y;
                H.u uVar = this.f31210i;
                if (uVar != null) {
                    uVar.t(c3232y.W().h());
                }
                H.u uVar2 = this.f31207f;
                if (uVar2 != null) {
                    uVar2.t(this.f31206e.U().g());
                }
                H.u uVar3 = this.f31208g;
                if (uVar3 != null) {
                    uVar3.t(this.f31206e.U().h());
                }
                H.u uVar4 = this.f31209h;
                if (uVar4 != null) {
                    uVar4.t(this.f31206e.J().c());
                }
                List<Pair> list = this.f31212k;
                if (list != null) {
                    for (Pair pair : list) {
                        this.f31206e.C((Executor) pair.second, (F.r) pair.first);
                    }
                    this.f31212k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        H();
    }

    void J(AbstractC1776x abstractC1776x) {
        this.f31211j.t(abstractC1776x);
    }

    @Override // y.InterfaceC3597q
    public int a() {
        return p(0);
    }

    @Override // F.L
    public Set b() {
        return C3346f.a(this.f31203b).c();
    }

    @Override // y.InterfaceC3597q
    public AbstractC1776x c() {
        return this.f31211j;
    }

    @Override // F.L
    public Set d() {
        int[] iArrE = this.f31203b.e().e();
        if (iArrE == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i10 : iArrE) {
            hashSet.add(Integer.valueOf(i10));
        }
        return hashSet;
    }

    @Override // F.L
    public boolean e() {
        int[] iArr = (int[]) this.f31203b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // F.L
    public String f() {
        return this.f31202a;
    }

    @Override // F.L
    public List h(Range range) {
        Size[] sizeArrD;
        try {
            sizeArrD = this.f31203b.e().d(range);
        } catch (IllegalArgumentException e10) {
            AbstractC3583h0.m("Camera2CameraInfo", "Can't get high speed resolutions for " + range, e10);
            sizeArrD = null;
        }
        return sizeArrD != null ? Arrays.asList(sizeArrD) : Collections.EMPTY_LIST;
    }

    @Override // F.L
    public Rect i() {
        Rect rect = (Rect) this.f31203b.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : (Rect) H0.g.g(rect);
    }

    @Override // F.L
    public boolean j() {
        return M2.a(this.f31203b, 9);
    }

    @Override // y.InterfaceC3597q
    public int k() {
        Integer num = (Integer) this.f31203b.a(CameraCharacteristics.LENS_FACING);
        H0.g.b(num != null, "Unable to get the lens facing of the camera.");
        return R1.a(num.intValue());
    }

    @Override // F.L
    public void l(F.r rVar) {
        synchronized (this.f31205d) {
            try {
                C3232y c3232y = this.f31206e;
                if (c3232y != null) {
                    c3232y.h0(rVar);
                    return;
                }
                List list = this.f31212k;
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == rVar) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F.L
    public F.v1 m() {
        Integer num = (Integer) this.f31203b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        H0.g.g(num);
        return num.intValue() != 1 ? F.v1.UPTIME : F.v1.REALTIME;
    }

    @Override // y.InterfaceC3597q
    public String n() {
        return E() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // F.L
    public List o(int i10) {
        Size[] sizeArrA = this.f31203b.e().a(i10);
        return sizeArrA != null ? Arrays.asList(sizeArrA) : Collections.EMPTY_LIST;
    }

    @Override // y.InterfaceC3597q
    public int p(int i10) {
        return H.c.a(H.c.b(i10), D(), 1 == k());
    }

    @Override // F.L
    public Object r() {
        return this.f31203b.j();
    }

    @Override // y.InterfaceC3597q
    public boolean s() {
        s.E e10 = this.f31203b;
        Objects.requireNonNull(e10);
        return v.g.a(new C3149a0(e10));
    }

    @Override // F.L
    public InterfaceC0513v0 u() {
        return this.f31214m;
    }

    @Override // F.L
    public List v() {
        Size[] sizeArrC = this.f31203b.e().c();
        return sizeArrC != null ? Arrays.asList(sizeArrC) : Collections.EMPTY_LIST;
    }

    @Override // F.L
    public F.g1 w() {
        return this.f31213l;
    }

    @Override // F.L
    public List x(int i10) {
        Size[] sizeArrG = this.f31203b.e().g(i10);
        return sizeArrG != null ? Arrays.asList(sizeArrG) : Collections.EMPTY_LIST;
    }

    @Override // y.InterfaceC3597q
    public AbstractC1776x y() {
        synchronized (this.f31205d) {
            try {
                C3232y c3232y = this.f31206e;
                if (c3232y == null) {
                    if (this.f31210i == null) {
                        this.f31210i = new H.u(E2.f(this.f31203b));
                    }
                    return this.f31210i;
                }
                H.u uVar = this.f31210i;
                if (uVar != null) {
                    return uVar;
                }
                return c3232y.W().h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F.L
    public void z(Executor executor, F.r rVar) {
        synchronized (this.f31205d) {
            try {
                C3232y c3232y = this.f31206e;
                if (c3232y != null) {
                    c3232y.C(executor, rVar);
                    return;
                }
                if (this.f31212k == null) {
                    this.f31212k = new ArrayList();
                }
                this.f31212k.add(new Pair(rVar, executor));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
