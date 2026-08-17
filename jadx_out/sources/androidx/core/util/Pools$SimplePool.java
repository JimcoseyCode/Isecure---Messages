package androidx.core.util;

import H0.e;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class Pools$SimplePool implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f16445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16446b;

    public Pools$SimplePool(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f16445a = new Object[i10];
    }

    private final boolean a(Object obj) {
        int i10 = this.f16446b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f16445a[i11] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // H0.e
    public Object acquire() {
        int i10 = this.f16446b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f16445a[i11];
        AbstractC2855l.e(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f16445a[i11] = null;
        this.f16446b--;
        return obj;
    }

    @Override // H0.e
    public boolean release(Object instance) {
        AbstractC2855l.g(instance, "instance");
        if (a(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.f16446b;
        Object[] objArr = this.f16445a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.f16446b = i10 + 1;
        return true;
    }
}
