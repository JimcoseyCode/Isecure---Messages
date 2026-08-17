package E;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;
import y.V;

/* JADX INFO: renamed from: E.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0447g extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V.e f963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Matrix f965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f970k;

    C0447g(Executor executor, V.e eVar, V.f fVar, V.g gVar, V.g gVar2, Rect rect, Matrix matrix, int i10, int i11, int i12, boolean z10, List list) {
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f962c = executor;
        this.f963d = eVar;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f964e = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f965f = matrix;
        this.f966g = i10;
        this.f967h = i11;
        this.f968i = i12;
        this.f969j = z10;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f970k = list;
    }

    public boolean equals(Object obj) {
        V.e eVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            if (this.f962c.equals(i0Var.g()) && ((eVar = this.f963d) != null ? eVar.equals(i0Var.j()) : i0Var.j() == null)) {
                i0Var.l();
                i0Var.m();
                i0Var.o();
                if (this.f964e.equals(i0Var.i()) && this.f965f.equals(i0Var.p()) && this.f966g == i0Var.n() && this.f967h == i0Var.k() && this.f968i == i0Var.h() && this.f969j == i0Var.t() && this.f970k.equals(i0Var.q())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // E.i0
    Executor g() {
        return this.f962c;
    }

    @Override // E.i0
    int h() {
        return this.f968i;
    }

    public int hashCode() {
        int iHashCode = (this.f962c.hashCode() ^ 1000003) * 1000003;
        V.e eVar = this.f963d;
        return ((((((((((((((iHashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1525764945) ^ this.f964e.hashCode()) * 1000003) ^ this.f965f.hashCode()) * 1000003) ^ this.f966g) * 1000003) ^ this.f967h) * 1000003) ^ this.f968i) * 1000003) ^ (this.f969j ? 1231 : 1237)) * 1000003) ^ this.f970k.hashCode();
    }

    @Override // E.i0
    public Rect i() {
        return this.f964e;
    }

    @Override // E.i0
    public V.e j() {
        return this.f963d;
    }

    @Override // E.i0
    public int k() {
        return this.f967h;
    }

    @Override // E.i0
    public V.f l() {
        return null;
    }

    @Override // E.i0
    public V.g m() {
        return null;
    }

    @Override // E.i0
    public int n() {
        return this.f966g;
    }

    @Override // E.i0
    public V.g o() {
        return null;
    }

    @Override // E.i0
    Matrix p() {
        return this.f965f;
    }

    @Override // E.i0
    List q() {
        return this.f970k;
    }

    @Override // E.i0
    boolean t() {
        return this.f969j;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.f962c + ", inMemoryCallback=" + this.f963d + ", onDiskCallback=" + ((Object) null) + ", outputFileOptions=" + ((Object) null) + ", secondaryOutputFileOptions=" + ((Object) null) + ", cropRect=" + this.f964e + ", sensorToBufferTransform=" + this.f965f + ", rotationDegrees=" + this.f966g + ", jpegQuality=" + this.f967h + ", captureMode=" + this.f968i + ", simultaneousCapture=" + this.f969j + ", sessionConfigCameraCaptureCallbacks=" + this.f970k + "}";
    }
}
