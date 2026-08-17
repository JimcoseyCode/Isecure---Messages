package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class P1 implements Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22297g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Iterator f22299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ T1 f22300j;

    /* synthetic */ P1(T1 t12, O1 o12) {
        this.f22300j = t12;
    }

    private final Iterator b() {
        if (this.f22299i == null) {
            this.f22299i = this.f22300j.f22309i.entrySet().iterator();
        }
        return this.f22299i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f22297g + 1;
        T1 t12 = this.f22300j;
        if (i10 >= t12.f22308h) {
            return !t12.f22309i.isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f22298h = true;
        int i10 = this.f22297g + 1;
        this.f22297g = i10;
        T1 t12 = this.f22300j;
        return i10 < t12.f22308h ? (N1) t12.f22307g[i10] : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f22298h) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f22298h = false;
        this.f22300j.o();
        int i10 = this.f22297g;
        T1 t12 = this.f22300j;
        if (i10 >= t12.f22308h) {
            b().remove();
        } else {
            this.f22297g = i10 - 1;
            t12.m(i10);
        }
    }
}
