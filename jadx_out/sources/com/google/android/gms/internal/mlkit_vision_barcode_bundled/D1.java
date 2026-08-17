package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f21666a = new ArrayDeque();

    /* synthetic */ D1(C1 c12) {
    }

    static /* bridge */ /* synthetic */ AbstractC2171o0 a(D1 d12, AbstractC2171o0 abstractC2171o0, AbstractC2171o0 abstractC2171o02) {
        d12.b(abstractC2171o0);
        d12.b(abstractC2171o02);
        AbstractC2171o0 i12 = (AbstractC2171o0) d12.f21666a.pop();
        while (!d12.f21666a.isEmpty()) {
            i12 = new I1((AbstractC2171o0) d12.f21666a.pop(), i12);
        }
        return i12;
    }

    private final void b(AbstractC2171o0 abstractC2171o0) {
        H1 h12;
        if (!abstractC2171o0.t()) {
            if (!(abstractC2171o0 instanceof I1)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(abstractC2171o0.getClass())));
            }
            I1 i12 = (I1) abstractC2171o0;
            b(i12.f21734j);
            b(i12.f21735k);
            return;
        }
        int iC = c(abstractC2171o0.q());
        ArrayDeque arrayDeque = this.f21666a;
        int iJ = I1.J(iC + 1);
        if (arrayDeque.isEmpty() || ((AbstractC2171o0) this.f21666a.peek()).q() >= iJ) {
            this.f21666a.push(abstractC2171o0);
            return;
        }
        int iJ2 = I1.J(iC);
        AbstractC2171o0 i13 = (AbstractC2171o0) this.f21666a.pop();
        while (true) {
            h12 = null;
            if (this.f21666a.isEmpty() || ((AbstractC2171o0) this.f21666a.peek()).q() >= iJ2) {
                break;
            } else {
                i13 = new I1((AbstractC2171o0) this.f21666a.pop(), i13);
            }
        }
        I1 i14 = new I1(i13, abstractC2171o0);
        while (!this.f21666a.isEmpty()) {
            int iC2 = c(i14.q()) + 1;
            ArrayDeque arrayDeque2 = this.f21666a;
            if (((AbstractC2171o0) arrayDeque2.peek()).q() >= I1.J(iC2)) {
                break;
            } else {
                i14 = new I1((AbstractC2171o0) this.f21666a.pop(), i14);
            }
        }
        this.f21666a.push(i14);
    }

    private static final int c(int i10) {
        int iBinarySearch = Arrays.binarySearch(I1.f21732n, i10);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
