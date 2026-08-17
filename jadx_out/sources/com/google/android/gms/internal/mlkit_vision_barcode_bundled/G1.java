package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class G1 implements Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f21727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AbstractC2161m0 f21728h;

    /* synthetic */ G1(AbstractC2171o0 abstractC2171o0, F1 f12) {
        if (!(abstractC2171o0 instanceof I1)) {
            this.f21727g = null;
            this.f21728h = (AbstractC2161m0) abstractC2171o0;
            return;
        }
        I1 i12 = (I1) abstractC2171o0;
        ArrayDeque arrayDeque = new ArrayDeque(i12.s());
        this.f21727g = arrayDeque;
        arrayDeque.push(i12);
        this.f21728h = c(i12.f21734j);
    }

    private final AbstractC2161m0 c(AbstractC2171o0 abstractC2171o0) {
        while (abstractC2171o0 instanceof I1) {
            I1 i12 = (I1) abstractC2171o0;
            this.f21727g.push(i12);
            abstractC2171o0 = i12.f21734j;
        }
        return (AbstractC2161m0) abstractC2171o0;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC2161m0 next() {
        AbstractC2161m0 abstractC2161m0C;
        AbstractC2161m0 abstractC2161m0 = this.f21728h;
        if (abstractC2161m0 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f21727g;
            abstractC2161m0C = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            abstractC2161m0C = c(((I1) this.f21727g.pop()).f21735k);
        } while (abstractC2161m0C.q() == 0);
        this.f21728h = abstractC2161m0C;
        return abstractC2161m0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21728h != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
