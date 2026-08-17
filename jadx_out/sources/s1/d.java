package s1;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewDefaults;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f32208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f32209c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f32207a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32210d = 0;

    private boolean b() {
        return this.f32209c.f32195b != 0;
    }

    private int d() {
        try {
            return this.f32208b.get() & 255;
        } catch (Exception unused) {
            this.f32209c.f32195b = 1;
            return 0;
        }
    }

    private void e() {
        this.f32209c.f32197d.f32183a = n();
        this.f32209c.f32197d.f32184b = n();
        this.f32209c.f32197d.f32185c = n();
        this.f32209c.f32197d.f32186d = n();
        int iD = d();
        boolean z10 = (iD & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        b bVar = this.f32209c.f32197d;
        bVar.f32187e = (iD & 64) != 0;
        if (z10) {
            bVar.f32193k = g(iPow);
        } else {
            bVar.f32193k = null;
        }
        this.f32209c.f32197d.f32192j = this.f32208b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f32209c;
        cVar.f32196c++;
        cVar.f32198e.add(cVar.f32197d);
    }

    private void f() {
        int iD = d();
        this.f32210d = iD;
        if (iD <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                int i11 = this.f32210d;
                if (i10 >= i11) {
                    return;
                }
                int i12 = i11 - i10;
                this.f32208b.get(this.f32207a, i10, i12);
                i10 += i12;
            } catch (Exception unused) {
                this.f32209c.f32195b = 1;
                return;
            }
        }
    }

    private int[] g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f32208b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & 255);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            this.f32209c.f32195b = 1;
            return iArr;
        }
    }

    private void h() {
        i(ViewDefaults.NUMBER_OF_LINES);
    }

    private void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f32209c.f32196c <= i10) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 == 1) {
                    q();
                } else if (iD2 == 249) {
                    this.f32209c.f32197d = new b();
                    j();
                } else if (iD2 == 254) {
                    q();
                } else if (iD2 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb.append((char) this.f32207a[i11]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (iD == 44) {
                c cVar = this.f32209c;
                if (cVar.f32197d == null) {
                    cVar.f32197d = new b();
                }
                e();
            } else if (iD != 59) {
                this.f32209c.f32195b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void j() {
        d();
        int iD = d();
        b bVar = this.f32209c.f32197d;
        int i10 = (iD & 28) >> 2;
        bVar.f32189g = i10;
        if (i10 == 0) {
            bVar.f32189g = 1;
        }
        bVar.f32188f = (iD & 1) != 0;
        int iN = n();
        if (iN < 2) {
            iN = 10;
        }
        b bVar2 = this.f32209c.f32197d;
        bVar2.f32191i = iN * 10;
        bVar2.f32190h = d();
        d();
    }

    private void k() {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb.append((char) d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f32209c.f32195b = 1;
            return;
        }
        l();
        if (!this.f32209c.f32201h || b()) {
            return;
        }
        c cVar = this.f32209c;
        cVar.f32194a = g(cVar.f32202i);
        c cVar2 = this.f32209c;
        cVar2.f32205l = cVar2.f32194a[cVar2.f32203j];
    }

    private void l() {
        this.f32209c.f32199f = n();
        this.f32209c.f32200g = n();
        int iD = d();
        c cVar = this.f32209c;
        cVar.f32201h = (iD & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
        cVar.f32202i = (int) Math.pow(2.0d, (iD & 7) + 1);
        this.f32209c.f32203j = d();
        this.f32209c.f32204k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f32207a;
            if (bArr[0] == 1) {
                this.f32209c.f32206m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f32210d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f32208b.getShort();
    }

    private void o() {
        this.f32208b = null;
        Arrays.fill(this.f32207a, (byte) 0);
        this.f32209c = new c();
        this.f32210d = 0;
    }

    private void q() {
        int iD;
        do {
            iD = d();
            this.f32208b.position(Math.min(this.f32208b.position() + iD, this.f32208b.limit()));
        } while (iD > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f32208b = null;
        this.f32209c = null;
    }

    public c c() {
        if (this.f32208b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f32209c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f32209c;
            if (cVar.f32196c < 0) {
                cVar.f32195b = 1;
            }
        }
        return this.f32209c;
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f32208b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f32208b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
