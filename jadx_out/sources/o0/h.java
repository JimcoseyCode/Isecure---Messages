package o0;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Arrays;
import java.util.Comparator;
import o0.C3000b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class h extends C3000b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i[] f30392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i[] f30393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f30394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b f30395k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    c f30396l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f30404i - iVar2.f30404i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f30398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h f30399b;

        public b(h hVar) {
            this.f30399b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f30398a.f30402g) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f30410o[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f30398a.f30410o[i10] = f12;
                    } else {
                        this.f30398a.f30410o[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f30398a.f30410o;
                float f13 = fArr[i11] + (iVar.f30410o[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f30398a.f30410o[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f30398a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f30398a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f30398a.f30410o[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.f30410o[i10];
                float f11 = this.f30398a.f30410o[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f30398a.f30410o, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f30398a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f30398a.f30410o[i10] + " ";
                }
            }
            return str + "] " + this.f30398a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f30391g = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        this.f30392h = new i[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        this.f30393i = new i[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        this.f30394j = 0;
        this.f30395k = new b(this);
        this.f30396l = cVar;
    }

    private final void F(i iVar) {
        int i10;
        int i11 = this.f30394j + 1;
        i[] iVarArr = this.f30392h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f30392h = iVarArr2;
            this.f30393i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f30392h;
        int i12 = this.f30394j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f30394j = i13;
        if (i13 > 1 && iVarArr3[i12].f30404i > iVar.f30404i) {
            int i14 = 0;
            while (true) {
                i10 = this.f30394j;
                if (i14 >= i10) {
                    break;
                }
                this.f30393i[i14] = this.f30392h[i14];
                i14++;
            }
            Arrays.sort(this.f30393i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f30394j; i15++) {
                this.f30392h[i15] = this.f30393i[i15];
            }
        }
        iVar.f30402g = true;
        iVar.h(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f30394j) {
            if (this.f30392h[i10] == iVar) {
                while (true) {
                    int i11 = this.f30394j;
                    if (i10 >= i11 - 1) {
                        this.f30394j = i11 - 1;
                        iVar.f30402g = false;
                        return;
                    } else {
                        i[] iVarArr = this.f30392h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // o0.C3000b
    public void B(d dVar, C3000b c3000b, boolean z10) {
        i iVar = c3000b.f30353a;
        if (iVar == null) {
            return;
        }
        C3000b.a aVar = c3000b.f30357e;
        int iB = aVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            i iVarD = aVar.d(i10);
            float f10 = aVar.f(i10);
            this.f30395k.b(iVarD);
            if (this.f30395k.a(iVar, f10)) {
                F(iVarD);
            }
            this.f30354b += c3000b.f30354b * f10;
        }
        G(iVar);
    }

    @Override // o0.C3000b, o0.d.a
    public void a(i iVar) {
        this.f30395k.b(iVar);
        this.f30395k.e();
        iVar.f30410o[iVar.f30406k] = 1.0f;
        F(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // o0.C3000b, o0.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i b(d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f30394j; i11++) {
            i iVar = this.f30392h[i11];
            if (!zArr[iVar.f30404i]) {
                this.f30395k.b(iVar);
                if (i10 == -1) {
                    if (this.f30395k.c()) {
                        i10 = i11;
                    }
                } else if (this.f30395k.d(this.f30392h[i10])) {
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f30392h[i10];
    }

    @Override // o0.C3000b, o0.d.a
    public void clear() {
        this.f30394j = 0;
        this.f30354b = 0.0f;
    }

    @Override // o0.C3000b, o0.d.a
    public boolean isEmpty() {
        return this.f30394j == 0;
    }

    @Override // o0.C3000b
    public String toString() {
        String str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " goal -> (" + this.f30354b + ") : ";
        for (int i10 = 0; i10 < this.f30394j; i10++) {
            this.f30395k.b(this.f30392h[i10]);
            str = str + this.f30395k + " ";
        }
        return str;
    }
}
