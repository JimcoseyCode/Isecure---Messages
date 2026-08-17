package r0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o0.i;
import s0.o;

/* JADX INFO: renamed from: r0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3241d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3242e f31618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f31619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3241d f31620f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    o0.i f31623i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet f31615a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31621g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f31622h = androidx.customview.widget.a.INVALID_ID;

    /* JADX INFO: renamed from: r0.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31624a;

        static {
            int[] iArr = new int[b.values().length];
            f31624a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31624a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31624a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31624a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31624a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31624a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31624a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31624a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31624a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: r0.d$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C3241d(C3242e c3242e, b bVar) {
        this.f31618d = c3242e;
        this.f31619e = bVar;
    }

    public boolean a(C3241d c3241d, int i10) {
        return b(c3241d, i10, androidx.customview.widget.a.INVALID_ID, false);
    }

    public boolean b(C3241d c3241d, int i10, int i11, boolean z10) {
        if (c3241d == null) {
            q();
            return true;
        }
        if (!z10 && !p(c3241d)) {
            return false;
        }
        this.f31620f = c3241d;
        if (c3241d.f31615a == null) {
            c3241d.f31615a = new HashSet();
        }
        HashSet hashSet = this.f31620f.f31615a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f31621g = i10;
        this.f31622h = i11;
        return true;
    }

    public void c(int i10, ArrayList arrayList, o oVar) {
        HashSet hashSet = this.f31615a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                s0.i.a(((C3241d) it.next()).f31618d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet d() {
        return this.f31615a;
    }

    public int e() {
        if (this.f31617c) {
            return this.f31616b;
        }
        return 0;
    }

    public int f() {
        C3241d c3241d;
        if (this.f31618d.S() == 8) {
            return 0;
        }
        return (this.f31622h == Integer.MIN_VALUE || (c3241d = this.f31620f) == null || c3241d.f31618d.S() != 8) ? this.f31621g : this.f31622h;
    }

    public final C3241d g() {
        switch (a.f31624a[this.f31619e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f31618d.f31659P;
            case 3:
                return this.f31618d.f31657N;
            case 4:
                return this.f31618d.f31660Q;
            case 5:
                return this.f31618d.f31658O;
            default:
                throw new AssertionError(this.f31619e.name());
        }
    }

    public C3242e h() {
        return this.f31618d;
    }

    public o0.i i() {
        return this.f31623i;
    }

    public C3241d j() {
        return this.f31620f;
    }

    public b k() {
        return this.f31619e;
    }

    public boolean l() {
        HashSet hashSet = this.f31615a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C3241d) it.next()).g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet hashSet = this.f31615a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f31617c;
    }

    public boolean o() {
        return this.f31620f != null;
    }

    public boolean p(C3241d c3241d) {
        if (c3241d == null) {
            return false;
        }
        b bVarK = c3241d.k();
        b bVar = this.f31619e;
        if (bVarK == bVar) {
            return bVar != b.BASELINE || (c3241d.h().W() && h().W());
        }
        switch (a.f31624a[bVar.ordinal()]) {
            case 1:
                return (bVarK == b.BASELINE || bVarK == b.CENTER_X || bVarK == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z10 = bVarK == b.LEFT || bVarK == b.RIGHT;
                return c3241d.h() instanceof C3245h ? z10 || bVarK == b.CENTER_X : z10;
            case 4:
            case 5:
                boolean z11 = bVarK == b.TOP || bVarK == b.BOTTOM;
                return c3241d.h() instanceof C3245h ? z11 || bVarK == b.CENTER_Y : z11;
            case 6:
                return (bVarK == b.LEFT || bVarK == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f31619e.name());
        }
    }

    public void q() {
        HashSet hashSet;
        C3241d c3241d = this.f31620f;
        if (c3241d != null && (hashSet = c3241d.f31615a) != null) {
            hashSet.remove(this);
            if (this.f31620f.f31615a.size() == 0) {
                this.f31620f.f31615a = null;
            }
        }
        this.f31615a = null;
        this.f31620f = null;
        this.f31621g = 0;
        this.f31622h = androidx.customview.widget.a.INVALID_ID;
        this.f31617c = false;
        this.f31616b = 0;
    }

    public void r() {
        this.f31617c = false;
        this.f31616b = 0;
    }

    public void s(o0.c cVar) {
        o0.i iVar = this.f31623i;
        if (iVar == null) {
            this.f31623i = new o0.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.p();
        }
    }

    public void t(int i10) {
        this.f31616b = i10;
        this.f31617c = true;
    }

    public String toString() {
        return this.f31618d.t() + ":" + this.f31619e.toString();
    }

    public void u(int i10) {
        if (o()) {
            this.f31622h = i10;
        }
    }
}
