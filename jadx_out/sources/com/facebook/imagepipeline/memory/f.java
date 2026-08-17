package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import c2.k;
import com.facebook.imagepipeline.memory.a;
import f2.InterfaceC2603d;
import g3.E;
import g3.F;
import g3.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f19888k;

    f(InterfaceC2603d interfaceC2603d, E e10, F f10) {
        super(interfaceC2603d, e10, f10);
        SparseIntArray sparseIntArray = (SparseIntArray) k.g(e10.f28167c);
        this.f19888k = new int[sparseIntArray.size()];
        int i10 = 0;
        while (true) {
            int[] iArr = this.f19888k;
            if (i10 >= iArr.length) {
                s();
                return;
            } else {
                iArr[i10] = sparseIntArray.keyAt(i10);
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void k(v vVar) {
        k.g(vVar);
        vVar.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int o(v vVar) {
        k.g(vVar);
        return vVar.b();
    }

    int C() {
        return this.f19888k[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean u(v vVar) {
        k.g(vVar);
        return !vVar.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int n(int i10) {
        if (i10 <= 0) {
            throw new a.b(Integer.valueOf(i10));
        }
        for (int i11 : this.f19888k) {
            if (i11 >= i10) {
                return i11;
            }
        }
        return i10;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int p(int i10) {
        return i10;
    }
}
