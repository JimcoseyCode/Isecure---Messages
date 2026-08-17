package o0;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class i implements Comparable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static int f30401x = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f30403h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f30407l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    a f30411p;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f30404i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f30405j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30406k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f30408m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float[] f30409n = new float[9];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float[] f30410o = new float[9];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    C3000b[] f30412q = new C3000b[16];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f30413r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f30414s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f30415t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f30416u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    float f30417v = 0.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    HashSet f30418w = null;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f30411p = aVar;
    }

    static void k() {
        f30401x++;
    }

    public final void h(C3000b c3000b) {
        int i10 = 0;
        while (true) {
            int i11 = this.f30413r;
            if (i10 >= i11) {
                C3000b[] c3000bArr = this.f30412q;
                if (i11 >= c3000bArr.length) {
                    this.f30412q = (C3000b[]) Arrays.copyOf(c3000bArr, c3000bArr.length * 2);
                }
                C3000b[] c3000bArr2 = this.f30412q;
                int i12 = this.f30413r;
                c3000bArr2[i12] = c3000b;
                this.f30413r = i12 + 1;
                return;
            }
            if (this.f30412q[i10] == c3000b) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f30404i - iVar.f30404i;
    }

    public final void m(C3000b c3000b) {
        int i10 = this.f30413r;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f30412q[i11] == c3000b) {
                while (i11 < i10 - 1) {
                    C3000b[] c3000bArr = this.f30412q;
                    int i12 = i11 + 1;
                    c3000bArr[i11] = c3000bArr[i12];
                    i11 = i12;
                }
                this.f30413r--;
                return;
            }
            i11++;
        }
    }

    public void p() {
        this.f30403h = null;
        this.f30411p = a.UNKNOWN;
        this.f30406k = 0;
        this.f30404i = -1;
        this.f30405j = -1;
        this.f30407l = 0.0f;
        this.f30408m = false;
        this.f30415t = false;
        this.f30416u = -1;
        this.f30417v = 0.0f;
        int i10 = this.f30413r;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f30412q[i11] = null;
        }
        this.f30413r = 0;
        this.f30414s = 0;
        this.f30402g = false;
        Arrays.fill(this.f30410o, 0.0f);
    }

    public void q(d dVar, float f10) {
        this.f30407l = f10;
        this.f30408m = true;
        this.f30415t = false;
        this.f30416u = -1;
        this.f30417v = 0.0f;
        int i10 = this.f30413r;
        this.f30405j = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f30412q[i11].A(dVar, this, false);
        }
        this.f30413r = 0;
    }

    public void r(a aVar, String str) {
        this.f30411p = aVar;
    }

    public final void s(d dVar, C3000b c3000b) {
        int i10 = this.f30413r;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f30412q[i11].B(dVar, c3000b, false);
        }
        this.f30413r = 0;
    }

    public String toString() {
        if (this.f30403h != null) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN + this.f30403h;
        }
        return PointerEventHelper.POINTER_TYPE_UNKNOWN + this.f30404i;
    }
}
