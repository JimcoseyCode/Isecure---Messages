package M1;

import H1.i;
import Q1.k;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.bitmap.AbstractC1944n;
import com.bumptech.glide.load.resource.bitmap.C1933c;
import com.bumptech.glide.load.resource.bitmap.C1942l;
import com.bumptech.glide.load.resource.bitmap.C1949t;
import com.bumptech.glide.load.resource.bitmap.C1951v;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Map;
import v1.EnumC3418b;
import v1.l;
import x1.AbstractC3526j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Resources.Theme f7377A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f7378B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f7379C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f7380D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f7382F;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7383g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f7387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f7388l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f7389m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7390n;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f7395s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Drawable f7397u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f7398v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f7402z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f7384h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AbstractC3526j f7385i = AbstractC3526j.f33376e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.g f7386j = com.bumptech.glide.g.NORMAL;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f7391o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f7392p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f7393q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private v1.f f7394r = P1.b.b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f7396t = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private v1.h f7399w = new v1.h();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map f7400x = new Q1.b();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Class f7401y = Object.class;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f7381E = true;

    private boolean J(int i10) {
        return K(this.f7383g, i10);
    }

    private static boolean K(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private a S(AbstractC1944n abstractC1944n, l lVar) {
        return T(abstractC1944n, lVar, true);
    }

    private a T(AbstractC1944n abstractC1944n, l lVar, boolean z10) {
        a aVarB0 = z10 ? b0(abstractC1944n, lVar) : P(abstractC1944n, lVar);
        aVarB0.f7381E = true;
        return aVarB0;
    }

    public final Resources.Theme A() {
        return this.f7377A;
    }

    public final Map B() {
        return this.f7400x;
    }

    public final boolean C() {
        return this.f7382F;
    }

    public final boolean D() {
        return this.f7379C;
    }

    protected final boolean E() {
        return this.f7378B;
    }

    public final boolean F(a aVar) {
        return Float.compare(aVar.f7384h, this.f7384h) == 0 && this.f7388l == aVar.f7388l && Q1.l.e(this.f7387k, aVar.f7387k) && this.f7390n == aVar.f7390n && Q1.l.e(this.f7389m, aVar.f7389m) && this.f7398v == aVar.f7398v && Q1.l.e(this.f7397u, aVar.f7397u) && this.f7391o == aVar.f7391o && this.f7392p == aVar.f7392p && this.f7393q == aVar.f7393q && this.f7395s == aVar.f7395s && this.f7396t == aVar.f7396t && this.f7379C == aVar.f7379C && this.f7380D == aVar.f7380D && this.f7385i.equals(aVar.f7385i) && this.f7386j == aVar.f7386j && this.f7399w.equals(aVar.f7399w) && this.f7400x.equals(aVar.f7400x) && this.f7401y.equals(aVar.f7401y) && Q1.l.e(this.f7394r, aVar.f7394r) && Q1.l.e(this.f7377A, aVar.f7377A);
    }

    public final boolean G() {
        return this.f7391o;
    }

    public final boolean H() {
        return J(8);
    }

    boolean I() {
        return this.f7381E;
    }

    public final boolean L() {
        return this.f7395s;
    }

    public final boolean M() {
        return Q1.l.u(this.f7393q, this.f7392p);
    }

    public a N() {
        this.f7402z = true;
        return U();
    }

    public a O(boolean z10) {
        if (this.f7378B) {
            return clone().O(z10);
        }
        this.f7380D = z10;
        this.f7383g |= 524288;
        return V();
    }

    final a P(AbstractC1944n abstractC1944n, l lVar) {
        if (this.f7378B) {
            return clone().P(abstractC1944n, lVar);
        }
        h(abstractC1944n);
        return e0(lVar, false);
    }

    public a Q(int i10, int i11) {
        if (this.f7378B) {
            return clone().Q(i10, i11);
        }
        this.f7393q = i10;
        this.f7392p = i11;
        this.f7383g |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        return V();
    }

    public a R(com.bumptech.glide.g gVar) {
        if (this.f7378B) {
            return clone().R(gVar);
        }
        this.f7386j = (com.bumptech.glide.g) k.e(gVar);
        this.f7383g |= 8;
        return V();
    }

    protected final a V() {
        if (this.f7402z) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return U();
    }

    public a W(v1.g gVar, Object obj) {
        if (this.f7378B) {
            return clone().W(gVar, obj);
        }
        k.e(gVar);
        k.e(obj);
        this.f7399w.d(gVar, obj);
        return V();
    }

    public a Y(v1.f fVar) {
        if (this.f7378B) {
            return clone().Y(fVar);
        }
        this.f7394r = (v1.f) k.e(fVar);
        this.f7383g |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        return V();
    }

    public a Z(float f10) {
        if (this.f7378B) {
            return clone().Z(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f7384h = f10;
        this.f7383g |= 2;
        return V();
    }

    public a a(a aVar) {
        if (this.f7378B) {
            return clone().a(aVar);
        }
        if (K(aVar.f7383g, 2)) {
            this.f7384h = aVar.f7384h;
        }
        if (K(aVar.f7383g, 262144)) {
            this.f7379C = aVar.f7379C;
        }
        if (K(aVar.f7383g, 1048576)) {
            this.f7382F = aVar.f7382F;
        }
        if (K(aVar.f7383g, 4)) {
            this.f7385i = aVar.f7385i;
        }
        if (K(aVar.f7383g, 8)) {
            this.f7386j = aVar.f7386j;
        }
        if (K(aVar.f7383g, 16)) {
            this.f7387k = aVar.f7387k;
            this.f7388l = 0;
            this.f7383g &= -33;
        }
        if (K(aVar.f7383g, 32)) {
            this.f7388l = aVar.f7388l;
            this.f7387k = null;
            this.f7383g &= -17;
        }
        if (K(aVar.f7383g, 64)) {
            this.f7389m = aVar.f7389m;
            this.f7390n = 0;
            this.f7383g &= -129;
        }
        if (K(aVar.f7383g, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) {
            this.f7390n = aVar.f7390n;
            this.f7389m = null;
            this.f7383g &= -65;
        }
        if (K(aVar.f7383g, 256)) {
            this.f7391o = aVar.f7391o;
        }
        if (K(aVar.f7383g, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING)) {
            this.f7393q = aVar.f7393q;
            this.f7392p = aVar.f7392p;
        }
        if (K(aVar.f7383g, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET)) {
            this.f7394r = aVar.f7394r;
        }
        if (K(aVar.f7383g, 4096)) {
            this.f7401y = aVar.f7401y;
        }
        if (K(aVar.f7383g, 8192)) {
            this.f7397u = aVar.f7397u;
            this.f7398v = 0;
            this.f7383g &= -16385;
        }
        if (K(aVar.f7383g, 16384)) {
            this.f7398v = aVar.f7398v;
            this.f7397u = null;
            this.f7383g &= -8193;
        }
        if (K(aVar.f7383g, 32768)) {
            this.f7377A = aVar.f7377A;
        }
        if (K(aVar.f7383g, 65536)) {
            this.f7396t = aVar.f7396t;
        }
        if (K(aVar.f7383g, 131072)) {
            this.f7395s = aVar.f7395s;
        }
        if (K(aVar.f7383g, 2048)) {
            this.f7400x.putAll(aVar.f7400x);
            this.f7381E = aVar.f7381E;
        }
        if (K(aVar.f7383g, 524288)) {
            this.f7380D = aVar.f7380D;
        }
        if (!this.f7396t) {
            this.f7400x.clear();
            int i10 = this.f7383g;
            this.f7395s = false;
            this.f7383g = i10 & (-133121);
            this.f7381E = true;
        }
        this.f7383g |= aVar.f7383g;
        this.f7399w.c(aVar.f7399w);
        return V();
    }

    public a a0(boolean z10) {
        if (this.f7378B) {
            return clone().a0(true);
        }
        this.f7391o = !z10;
        this.f7383g |= 256;
        return V();
    }

    public a b() {
        if (this.f7402z && !this.f7378B) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f7378B = true;
        return N();
    }

    final a b0(AbstractC1944n abstractC1944n, l lVar) {
        if (this.f7378B) {
            return clone().b0(abstractC1944n, lVar);
        }
        h(abstractC1944n);
        return d0(lVar);
    }

    public a c() {
        return S(AbstractC1944n.CENTER_INSIDE, new C1942l());
    }

    a c0(Class cls, l lVar, boolean z10) {
        if (this.f7378B) {
            return clone().c0(cls, lVar, z10);
        }
        k.e(cls);
        k.e(lVar);
        this.f7400x.put(cls, lVar);
        int i10 = this.f7383g;
        this.f7396t = true;
        this.f7383g = 67584 | i10;
        this.f7381E = false;
        if (z10) {
            this.f7383g = i10 | 198656;
            this.f7395s = true;
        }
        return V();
    }

    public a d0(l lVar) {
        return e0(lVar, true);
    }

    @Override // 
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            v1.h hVar = new v1.h();
            aVar.f7399w = hVar;
            hVar.c(this.f7399w);
            Q1.b bVar = new Q1.b();
            aVar.f7400x = bVar;
            bVar.putAll(this.f7400x);
            aVar.f7402z = false;
            aVar.f7378B = false;
            return aVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    a e0(l lVar, boolean z10) {
        if (this.f7378B) {
            return clone().e0(lVar, z10);
        }
        C1951v c1951v = new C1951v(lVar, z10);
        c0(Bitmap.class, lVar, z10);
        c0(Drawable.class, c1951v, z10);
        c0(BitmapDrawable.class, c1951v.b(), z10);
        c0(H1.c.class, new H1.f(lVar), z10);
        return V();
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return F((a) obj);
        }
        return false;
    }

    public a f(Class cls) {
        if (this.f7378B) {
            return clone().f(cls);
        }
        this.f7401y = (Class) k.e(cls);
        this.f7383g |= 4096;
        return V();
    }

    public a f0(boolean z10) {
        if (this.f7378B) {
            return clone().f0(z10);
        }
        this.f7382F = z10;
        this.f7383g |= 1048576;
        return V();
    }

    public a g(AbstractC3526j abstractC3526j) {
        if (this.f7378B) {
            return clone().g(abstractC3526j);
        }
        this.f7385i = (AbstractC3526j) k.e(abstractC3526j);
        this.f7383g |= 4;
        return V();
    }

    public a h(AbstractC1944n abstractC1944n) {
        return W(AbstractC1944n.OPTION, (AbstractC1944n) k.e(abstractC1944n));
    }

    public int hashCode() {
        return Q1.l.p(this.f7377A, Q1.l.p(this.f7394r, Q1.l.p(this.f7401y, Q1.l.p(this.f7400x, Q1.l.p(this.f7399w, Q1.l.p(this.f7386j, Q1.l.p(this.f7385i, Q1.l.q(this.f7380D, Q1.l.q(this.f7379C, Q1.l.q(this.f7396t, Q1.l.q(this.f7395s, Q1.l.o(this.f7393q, Q1.l.o(this.f7392p, Q1.l.q(this.f7391o, Q1.l.p(this.f7397u, Q1.l.o(this.f7398v, Q1.l.p(this.f7389m, Q1.l.o(this.f7390n, Q1.l.p(this.f7387k, Q1.l.o(this.f7388l, Q1.l.m(this.f7384h)))))))))))))))))))));
    }

    public a i(int i10) {
        return W(C1933c.f19235b, Integer.valueOf(i10));
    }

    public a j(EnumC3418b enumC3418b) {
        k.e(enumC3418b);
        return W(C1949t.f19264f, enumC3418b).W(i.f3684a, enumC3418b);
    }

    public final AbstractC3526j k() {
        return this.f7385i;
    }

    public final int l() {
        return this.f7388l;
    }

    public final Drawable m() {
        return this.f7387k;
    }

    public final Drawable n() {
        return this.f7397u;
    }

    public final int o() {
        return this.f7398v;
    }

    public final boolean p() {
        return this.f7380D;
    }

    public final v1.h q() {
        return this.f7399w;
    }

    public final int r() {
        return this.f7392p;
    }

    public final int t() {
        return this.f7393q;
    }

    public final Drawable u() {
        return this.f7389m;
    }

    public final int v() {
        return this.f7390n;
    }

    public final com.bumptech.glide.g w() {
        return this.f7386j;
    }

    public final Class x() {
        return this.f7401y;
    }

    public final v1.f y() {
        return this.f7394r;
    }

    public final float z() {
        return this.f7384h;
    }

    private a U() {
        return this;
    }
}
