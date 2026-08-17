package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.a;
import f2.InterfaceC2600a;
import f2.InterfaceC2603d;
import g3.E;
import g3.F;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e extends a implements InterfaceC2600a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f19887k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC2603d memoryTrimmableRegistry, E poolParams, F poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        AbstractC2855l.g(memoryTrimmableRegistry, "memoryTrimmableRegistry");
        AbstractC2855l.g(poolParams, "poolParams");
        AbstractC2855l.g(poolStatsTracker, "poolStatsTracker");
        SparseIntArray sparseIntArray = poolParams.f28167c;
        if (sparseIntArray != null) {
            this.f19887k = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f19887k[i10] = sparseIntArray.keyAt(i10);
            }
        } else {
            this.f19887k = new int[0];
        }
        s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public byte[] g(int i10) {
        return new byte[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void k(byte[] value) {
        AbstractC2855l.g(value, "value");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int o(byte[] value) {
        AbstractC2855l.g(value, "value");
        return value.length;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int n(int i10) {
        if (i10 <= 0) {
            throw new a.b(Integer.valueOf(i10));
        }
        for (int i11 : this.f19887k) {
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
