package V0;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f11616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f11617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f11620e = d.a();

    protected int a(int i10) {
        return i10 + this.f11617b.getInt(i10);
    }

    protected int b(int i10) {
        if (i10 < this.f11619d) {
            return this.f11617b.getShort(this.f11618c + i10);
        }
        return 0;
    }

    protected void c(int i10, ByteBuffer byteBuffer) {
        this.f11617b = byteBuffer;
        if (byteBuffer == null) {
            this.f11616a = 0;
            this.f11618c = 0;
            this.f11619d = 0;
        } else {
            this.f11616a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f11618c = i11;
            this.f11619d = this.f11617b.getShort(i11);
        }
    }

    protected int d(int i10) {
        int i11 = i10 + this.f11616a;
        return i11 + this.f11617b.getInt(i11) + 4;
    }

    protected int e(int i10) {
        int i11 = i10 + this.f11616a;
        return this.f11617b.getInt(i11 + this.f11617b.getInt(i11));
    }
}
