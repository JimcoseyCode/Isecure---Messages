package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import x7.InterfaceC3550a;

/* JADX INFO: renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C2844a implements Iterator, InterfaceC3550a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object[] f29385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29386h;

    public C2844a(Object[] array) {
        AbstractC2855l.g(array, "array");
        this.f29385g = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f29386h < this.f29385g.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f29385g;
            int i10 = this.f29386h;
            this.f29386h = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f29386h--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
