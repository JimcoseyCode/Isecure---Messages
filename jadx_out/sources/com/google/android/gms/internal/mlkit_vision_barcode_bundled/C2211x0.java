package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2211x0 implements InterfaceC2163m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2207w0 f22437a;

    private C2211x0(AbstractC2207w0 abstractC2207w0) {
        byte[] bArr = X0.f22317b;
        this.f22437a = abstractC2207w0;
        abstractC2207w0.f22436a = this;
    }

    public static C2211x0 L(AbstractC2207w0 abstractC2207w0) {
        C2211x0 c2211x0 = abstractC2207w0.f22436a;
        return c2211x0 != null ? c2211x0 : new C2211x0(abstractC2207w0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void A(int i10, Object obj) {
        if (obj instanceof AbstractC2171o0) {
            this.f22437a.s(i10, (AbstractC2171o0) obj);
        } else {
            this.f22437a.r(i10, (InterfaceC2186r1) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void B(int i10, int i11) {
        this.f22437a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void C(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                AbstractC2207w0 abstractC2207w0 = this.f22437a;
                long jLongValue = ((Long) list.get(i11)).longValue();
                abstractC2207w0.x(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        this.f22437a.u(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iB += AbstractC2207w0.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f22437a.w(iB);
        while (i11 < list.size()) {
            AbstractC2207w0 abstractC2207w02 = this.f22437a;
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            abstractC2207w02.y((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void D(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22437a.l(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.f22437a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f22437a.w(i12);
        while (i11 < list.size()) {
            this.f22437a.m(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void E(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof H0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f22437a.j(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            this.f22437a.u(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f22437a.w(i12);
            while (i11 < list.size()) {
                this.f22437a.k(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        H0 h02 = (H0) list;
        if (!z10) {
            while (i11 < h02.size()) {
                this.f22437a.j(i10, Float.floatToRawIntBits(h02.o(i11)));
                i11++;
            }
            return;
        }
        this.f22437a.u(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < h02.size(); i15++) {
            h02.o(i15);
            i14 += 4;
        }
        this.f22437a.w(i14);
        while (i11 < h02.size()) {
            this.f22437a.k(Float.floatToRawIntBits(h02.o(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void F(int i10, int i11) {
        this.f22437a.v(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void G(int i10, long j10) {
        this.f22437a.l(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void H(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f22437a.t(i10, (String) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void I(int i10, long j10) {
        this.f22437a.x(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void J(int i10) {
        this.f22437a.u(i10, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void K(int i10) {
        this.f22437a.u(i10, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void a(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f22437a.i(i10, (AbstractC2171o0) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void b(int i10, String str) {
        this.f22437a.t(i10, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void c(int i10, int i11) {
        this.f22437a.v(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void d(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof Q0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f22437a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f22437a.u(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f22437a.w(i12);
            while (i11 < list.size()) {
                this.f22437a.k(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        Q0 q02 = (Q0) list;
        if (!z10) {
            while (i11 < q02.size()) {
                this.f22437a.j(i10, q02.o(i11));
                i11++;
            }
            return;
        }
        this.f22437a.u(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < q02.size(); i15++) {
            q02.o(i15);
            i14 += 4;
        }
        this.f22437a.w(i14);
        while (i11 < q02.size()) {
            this.f22437a.k(q02.o(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void e(int i10, int i11) {
        this.f22437a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void f(int i10, boolean z10) {
        this.f22437a.h(i10, z10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void g(int i10, Object obj, J1 j12) {
        this.f22437a.q(i10, (InterfaceC2186r1) obj, j12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void h(int i10, long j10) {
        this.f22437a.x(i10, j10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22437a.h(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f22437a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        this.f22437a.w(i12);
        while (i11 < list.size()) {
            this.f22437a.g(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void j(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof Q0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f22437a.v(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f22437a.u(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += AbstractC2207w0.a(((Integer) list.get(i12)).intValue());
            }
            this.f22437a.w(iA);
            while (i11 < list.size()) {
                this.f22437a.w(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        Q0 q02 = (Q0) list;
        if (!z10) {
            while (i11 < q02.size()) {
                this.f22437a.v(i10, q02.o(i11));
                i11++;
            }
            return;
        }
        this.f22437a.u(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < q02.size(); i13++) {
            iA2 += AbstractC2207w0.a(q02.o(i13));
        }
        this.f22437a.w(iA2);
        while (i11 < q02.size()) {
            this.f22437a.w(q02.o(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void k(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof Q0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f22437a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f22437a.u(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f22437a.w(i12);
            while (i11 < list.size()) {
                this.f22437a.k(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        Q0 q02 = (Q0) list;
        if (!z10) {
            while (i11 < q02.size()) {
                this.f22437a.j(i10, q02.o(i11));
                i11++;
            }
            return;
        }
        this.f22437a.u(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < q02.size(); i15++) {
            q02.o(i15);
            i14 += 4;
        }
        this.f22437a.w(i14);
        while (i11 < q02.size()) {
            this.f22437a.k(q02.o(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22437a.l(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f22437a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f22437a.w(i12);
        while (i11 < list.size()) {
            this.f22437a.m(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof Q0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f22437a.n(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f22437a.u(i10, 2);
            int iB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iB += AbstractC2207w0.b(((Integer) list.get(i12)).intValue());
            }
            this.f22437a.w(iB);
            while (i11 < list.size()) {
                this.f22437a.o(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        Q0 q02 = (Q0) list;
        if (!z10) {
            while (i11 < q02.size()) {
                this.f22437a.n(i10, q02.o(i11));
                i11++;
            }
            return;
        }
        this.f22437a.u(i10, 2);
        int iB2 = 0;
        for (int i13 = 0; i13 < q02.size(); i13++) {
            iB2 += AbstractC2207w0.b(q02.o(i13));
        }
        this.f22437a.w(iB2);
        while (i11 < q02.size()) {
            this.f22437a.o(q02.o(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void n(int i10, long j10) {
        this.f22437a.l(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void o(int i10, int i11) {
        this.f22437a.n(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void p(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof Q0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f22437a.n(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f22437a.u(i10, 2);
            int iB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iB += AbstractC2207w0.b(((Integer) list.get(i12)).intValue());
            }
            this.f22437a.w(iB);
            while (i11 < list.size()) {
                this.f22437a.o(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        Q0 q02 = (Q0) list;
        if (!z10) {
            while (i11 < q02.size()) {
                this.f22437a.n(i10, q02.o(i11));
                i11++;
            }
            return;
        }
        this.f22437a.u(i10, 2);
        int iB2 = 0;
        for (int i13 = 0; i13 < q02.size(); i13++) {
            iB2 += AbstractC2207w0.b(q02.o(i13));
        }
        this.f22437a.w(iB2);
        while (i11 < q02.size()) {
            this.f22437a.o(q02.o(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void q(int i10, int i11) {
        this.f22437a.n(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof Q0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    AbstractC2207w0 abstractC2207w0 = this.f22437a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    abstractC2207w0.v(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            this.f22437a.u(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iA += AbstractC2207w0.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f22437a.w(iA);
            while (i11 < list.size()) {
                AbstractC2207w0 abstractC2207w02 = this.f22437a;
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                abstractC2207w02.w((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        Q0 q02 = (Q0) list;
        if (!z10) {
            while (i11 < q02.size()) {
                AbstractC2207w0 abstractC2207w03 = this.f22437a;
                int iO = q02.o(i11);
                abstractC2207w03.v(i10, (iO >> 31) ^ (iO + iO));
                i11++;
            }
            return;
        }
        this.f22437a.u(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < q02.size(); i13++) {
            int iO2 = q02.o(i13);
            iA2 += AbstractC2207w0.a((iO2 >> 31) ^ (iO2 + iO2));
        }
        this.f22437a.w(iA2);
        while (i11 < q02.size()) {
            AbstractC2207w0 abstractC2207w04 = this.f22437a;
            int iO3 = q02.o(i11);
            abstractC2207w04.w((iO3 >> 31) ^ (iO3 + iO3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void s(int i10, AbstractC2171o0 abstractC2171o0) {
        this.f22437a.i(i10, abstractC2171o0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void t(int i10, double d10) {
        this.f22437a.l(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void u(int i10, long j10) {
        this.f22437a.x(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void v(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22437a.x(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f22437a.u(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB += AbstractC2207w0.b(((Long) list.get(i12)).longValue());
        }
        this.f22437a.w(iB);
        while (i11 < list.size()) {
            this.f22437a.y(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void w(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22437a.l(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f22437a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f22437a.w(i12);
        while (i11 < list.size()) {
            this.f22437a.m(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void x(int i10, Object obj, J1 j12) {
        AbstractC2207w0 abstractC2207w0 = this.f22437a;
        abstractC2207w0.u(i10, 3);
        j12.c((InterfaceC2186r1) obj, abstractC2207w0.f22436a);
        abstractC2207w0.u(i10, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void y(int i10, float f10) {
        this.f22437a.j(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2163m2
    public final void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22437a.x(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f22437a.u(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB += AbstractC2207w0.b(((Long) list.get(i12)).longValue());
        }
        this.f22437a.w(iB);
        while (i11 < list.size()) {
            this.f22437a.y(((Long) list.get(i11)).longValue());
            i11++;
        }
    }
}
