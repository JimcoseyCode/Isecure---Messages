package E1;

import Q1.k;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b implements v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f1070g;

    public b(byte[] bArr) {
        this.f1070g = (byte[]) k.e(bArr);
    }

    @Override // x1.v
    public Class a() {
        return byte[].class;
    }

    @Override // x1.v
    public int b() {
        return this.f1070g.length;
    }

    @Override // x1.v
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f1070g;
    }

    @Override // x1.v
    public void recycle() {
    }
}
