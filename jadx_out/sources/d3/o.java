package d3;

import com.facebook.react.uimanager.ViewDefaults;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class o implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f25593d = d(ViewDefaults.NUMBER_OF_LINES, true, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f25594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f25595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f25596c;

    private o(int i10, boolean z10, boolean z11) {
        this.f25594a = i10;
        this.f25595b = z10;
        this.f25596c = z11;
    }

    public static p d(int i10, boolean z10, boolean z11) {
        return new o(i10, z10, z11);
    }

    @Override // d3.p
    public boolean a() {
        return this.f25596c;
    }

    @Override // d3.p
    public boolean b() {
        return this.f25595b;
    }

    @Override // d3.p
    public int c() {
        return this.f25594a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f25594a == oVar.f25594a && this.f25595b == oVar.f25595b && this.f25596c == oVar.f25596c;
    }

    public int hashCode() {
        return (this.f25594a ^ (this.f25595b ? 4194304 : 0)) ^ (this.f25596c ? 8388608 : 0);
    }
}
