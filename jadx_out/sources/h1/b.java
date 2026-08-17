package H1;

import android.graphics.Bitmap;
import s1.InterfaceC3316a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC3316a.InterfaceC0355a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.d f3645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y1.b f3646b;

    public b(y1.d dVar, y1.b bVar) {
        this.f3645a = dVar;
        this.f3646b = bVar;
    }

    @Override // s1.InterfaceC3316a.InterfaceC0355a
    public Bitmap a(int i10, int i11, Bitmap.Config config) {
        return this.f3645a.e(i10, i11, config);
    }

    @Override // s1.InterfaceC3316a.InterfaceC0355a
    public int[] b(int i10) {
        y1.b bVar = this.f3646b;
        return bVar == null ? new int[i10] : (int[]) bVar.d(i10, int[].class);
    }

    @Override // s1.InterfaceC3316a.InterfaceC0355a
    public void c(Bitmap bitmap) {
        this.f3645a.c(bitmap);
    }

    @Override // s1.InterfaceC3316a.InterfaceC0355a
    public void d(byte[] bArr) {
        y1.b bVar = this.f3646b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // s1.InterfaceC3316a.InterfaceC0355a
    public byte[] e(int i10) {
        y1.b bVar = this.f3646b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.d(i10, byte[].class);
    }

    @Override // s1.InterfaceC3316a.InterfaceC0355a
    public void f(int[] iArr) {
        y1.b bVar = this.f3646b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}
