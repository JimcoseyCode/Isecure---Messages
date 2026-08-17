package com.facebook.yoga;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class YogaNodeJNIBase extends r implements Cloneable {
    private float[] arr;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private YogaNodeJNIBase f20737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f20738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f20739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private o f20740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f20741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected long f20742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Object f20743m;
    private int mLayoutDirection;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20744n;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20745a;

        static {
            int[] iArr = new int[j.values().length];
            f20745a = iArr;
            try {
                iArr[j.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20745a[j.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20745a[j.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20745a[j.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20745a[j.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20745a[j.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private YogaNodeJNIBase(long j10) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f20744n = true;
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f20742l = j10;
    }

    private void q0(r rVar) {
        r0();
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List list = this.f20739i;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i10);
        this.f20739i.add(i10, yogaNodeJNIBase);
        yogaNodeJNIBase.f20737g = this;
        return yogaNodeJNIBase.f20742l;
    }

    private static YogaValue v0(long j10) {
        return new YogaValue(Float.intBitsToFloat((int) j10), (int) (j10 >> 32));
    }

    @Override // com.facebook.yoga.r
    public void A(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f20742l, jVar.k(), f10);
    }

    @Override // com.facebook.yoga.r
    public void B(Object obj) {
        this.f20743m = obj;
    }

    @Override // com.facebook.yoga.r
    public void C(h hVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f20742l, hVar.k());
    }

    @Override // com.facebook.yoga.r
    public void D(i iVar) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f20742l, iVar.j());
    }

    @Override // com.facebook.yoga.r
    public void E(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f20742l, f10);
    }

    @Override // com.facebook.yoga.r
    public void F(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f20742l, f10);
    }

    @Override // com.facebook.yoga.r
    public void G() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f20742l);
    }

    @Override // com.facebook.yoga.r
    public void H(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f20742l, f10);
    }

    @Override // com.facebook.yoga.r
    public void I(l lVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f20742l, lVar.j());
    }

    @Override // com.facebook.yoga.r
    public void J(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f20742l, f10);
    }

    @Override // com.facebook.yoga.r
    public void K(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f20742l, f10);
    }

    @Override // com.facebook.yoga.r
    public void L(m mVar, float f10) {
        YogaNative.jni_YGNodeStyleSetGapJNI(this.f20742l, mVar.j(), f10);
    }

    @Override // com.facebook.yoga.r
    public void M(m mVar, float f10) {
        YogaNative.jni_YGNodeStyleSetGapPercentJNI(this.f20742l, mVar.j(), f10);
    }

    @Override // com.facebook.yoga.r
    public void N(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f20742l, f10);
    }

    @Override // com.facebook.yoga.r
    public void O() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f20742l);
    }

    @Override // com.facebook.yoga.r
    public void P(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f20742l, f10);
    }

    @Override // com.facebook.yoga.r
    public void Q(n nVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f20742l, nVar.j());
    }

    @Override // com.facebook.yoga.r
    public void R(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f20742l, jVar.k(), f10);
    }

    @Override // com.facebook.yoga.r
    public void S(j jVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f20742l, jVar.k());
    }

    @Override // com.facebook.yoga.r
    public void T(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f20742l, jVar.k(), f10);
    }

    @Override // com.facebook.yoga.r
    public void U(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f20742l, f10);
    }

    @Override // com.facebook.yoga.r
    public void V(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f20742l, f10);
    }

    @Override // com.facebook.yoga.r
    public void W(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f20742l, f10);
    }

    @Override // com.facebook.yoga.r
    public void Y(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f20742l, f10);
    }

    @Override // com.facebook.yoga.r
    public void Z(o oVar) {
        this.f20740j = oVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f20742l, oVar != null);
    }

    @Override // com.facebook.yoga.r
    public void a(r rVar, int i10) {
        if (rVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) rVar;
            if (yogaNodeJNIBase.f20737g != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.f20739i == null) {
                this.f20739i = new ArrayList(4);
            }
            this.f20739i.add(i10, yogaNodeJNIBase);
            yogaNodeJNIBase.f20737g = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.f20742l, yogaNodeJNIBase.f20742l, i10);
        }
    }

    @Override // com.facebook.yoga.r
    public void a0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f20742l, f10);
    }

    @Override // com.facebook.yoga.r
    public void b(float f10, float f11) {
        q0(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i10);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f20739i;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.q0(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].f20742l;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f20742l, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.r
    public void b0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f20742l, f10);
    }

    public final float baseline(float f10, float f11) {
        return this.f20741k.a(this, f10, f11);
    }

    @Override // com.facebook.yoga.r
    public void c() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f20742l);
    }

    @Override // com.facebook.yoga.r
    public void c0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f20742l, f10);
    }

    @Override // com.facebook.yoga.r
    public void d0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f20742l, f10);
    }

    @Override // com.facebook.yoga.r
    public float e() {
        return YogaNative.jni_YGNodeStyleGetFlexJNI(this.f20742l);
    }

    @Override // com.facebook.yoga.r
    public void e0(u uVar) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f20742l, uVar.j());
    }

    @Override // com.facebook.yoga.r
    public YogaValue f() {
        return v0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f20742l));
    }

    @Override // com.facebook.yoga.r
    public void f0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f20742l, jVar.k(), f10);
    }

    @Override // com.facebook.yoga.r
    public h g() {
        float[] fArr = this.arr;
        return h.j(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.r
    public void g0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f20742l, jVar.k(), f10);
    }

    @Override // com.facebook.yoga.r
    public float h() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void h0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f20742l, jVar.k(), f10);
    }

    @Override // com.facebook.yoga.r
    public float i(j jVar) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        float f10 = fArr[0];
        if ((((int) f10) & 2) != 2) {
            return 0.0f;
        }
        int i10 = (((int) f10) & 1) != 1 ? 4 : 0;
        int i11 = 10 - i10;
        switch (a.f20745a[jVar.ordinal()]) {
            case 1:
                return this.arr[i11];
            case 2:
                return this.arr[11 - i10];
            case 3:
                return this.arr[12 - i10];
            case 4:
                return this.arr[13 - i10];
            case 5:
                return g() == h.RTL ? this.arr[12 - i10] : this.arr[i11];
            case 6:
                return g() == h.RTL ? this.arr[i11] : this.arr[12 - i10];
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.r
    public void i0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f20742l, jVar.k(), f10);
    }

    @Override // com.facebook.yoga.r
    public float j() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void j0(v vVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f20742l, vVar.j());
    }

    @Override // com.facebook.yoga.r
    public float k() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public float l() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public YogaValue m(j jVar) {
        return v0(YogaNative.jni_YGNodeStyleGetPaddingJNI(this.f20742l, jVar.k()));
    }

    @Override // com.facebook.yoga.r
    public void m0(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f20742l, f10);
    }

    public final long measure(float f10, int i10, float f11, int i11) {
        if (q()) {
            return this.f20740j.measure(this, f10, p.j(i10), f11, p.j(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.r
    public YogaValue n() {
        return v0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f20742l));
    }

    @Override // com.facebook.yoga.r
    public void n0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f20742l);
    }

    @Override // com.facebook.yoga.r
    public boolean o() {
        float[] fArr = this.arr;
        return fArr != null ? (((int) fArr[0]) & 16) == 16 : this.f20744n;
    }

    @Override // com.facebook.yoga.r
    public void o0(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f20742l, f10);
    }

    @Override // com.facebook.yoga.r
    public boolean p() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f20742l);
    }

    @Override // com.facebook.yoga.r
    public void p0(x xVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f20742l, xVar.j());
    }

    @Override // com.facebook.yoga.r
    public boolean q() {
        return this.f20740j != null;
    }

    @Override // com.facebook.yoga.r
    public void r() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f20744n = false;
    }

    public Object r0() {
        return this.f20743m;
    }

    @Override // com.facebook.yoga.r
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase t(int i10) {
        List list = this.f20739i;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) list.remove(i10);
        yogaNodeJNIBase.f20737g = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.f20742l, yogaNodeJNIBase.f20742l);
        return yogaNodeJNIBase;
    }

    @Override // com.facebook.yoga.r
    public void u() {
        this.f20740j = null;
        this.f20741k = null;
        this.f20743m = null;
        this.arr = null;
        this.f20744n = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f20742l);
    }

    @Override // com.facebook.yoga.r
    public void v(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f20742l, aVar.j());
    }

    @Override // com.facebook.yoga.r
    public void w(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f20742l, aVar.j());
    }

    @Override // com.facebook.yoga.r
    public void x(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f20742l, aVar.j());
    }

    @Override // com.facebook.yoga.r
    public void y(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f20742l, f10);
    }

    @Override // com.facebook.yoga.r
    public void z(b bVar) {
        this.f20741k = bVar;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.f20742l, bVar != null);
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    YogaNodeJNIBase(c cVar) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((e) cVar).f20767c));
        this.f20738h = cVar;
    }
}
