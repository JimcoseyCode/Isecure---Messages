package Q;

import P.x;
import R.d;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Map;
import y.AbstractC3583h0;
import y.C3561F;
import y.C3563H;
import y.w0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends x {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f8933n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f8934o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C3561F f8935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C3561F f8936q;

    public c(C3561F c3561f, C3561F c3561f2) {
        this.f8935p = c3561f;
        this.f8936q = c3561f2;
    }

    private static float[] u(Size size, Size size2, C3561F c3561f) {
        float[] fArrL = R.d.l();
        float[] fArrL2 = R.d.l();
        float[] fArrL3 = R.d.l();
        Matrix.scaleM(fArrL, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        if (((Float) c3561f.c().f3634a).floatValue() != 0.0f || ((Float) c3561f.c().f3635b).floatValue() != 0.0f) {
            Matrix.translateM(fArrL2, 0, ((Float) c3561f.b().f3634a).floatValue() / ((Float) c3561f.c().f3634a).floatValue(), ((Float) c3561f.b().f3635b).floatValue() / ((Float) c3561f.c().f3635b).floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArrL3, 0, fArrL, 0, fArrL2, 0);
        return fArrL3;
    }

    private void w(R.g gVar, w0 w0Var, SurfaceTexture surfaceTexture, C3561F c3561f, int i10, boolean z10) {
        s(i10);
        GLES20.glViewport(0, 0, gVar.c(), gVar.b());
        GLES20.glScissor(0, 0, gVar.c(), gVar.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        w0Var.v(fArr2, fArr, z10);
        d.f fVar = (d.f) H0.g.g(this.f8767k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr2);
        }
        fVar.e(u(new Size((int) (gVar.c() * ((Float) c3561f.c().f3634a).floatValue()), (int) (gVar.b() * ((Float) c3561f.c().f3635b).floatValue())), new Size(gVar.c(), gVar.b()), c3561f));
        fVar.d(c3561f.a());
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        R.d.g("glDrawArrays");
        GLES20.glDisable(3042);
    }

    @Override // P.x
    public R.e h(C3563H c3563h, Map map) throws Throwable {
        R.e eVarH = super.h(c3563h, map);
        this.f8933n = R.d.p();
        this.f8934o = R.d.p();
        return eVarH;
    }

    @Override // P.x
    public void k() {
        super.k();
        this.f8933n = -1;
        this.f8934o = -1;
    }

    public int t(boolean z10) {
        R.d.i(this.f8757a, true);
        R.d.h(this.f8759c);
        return z10 ? this.f8933n : this.f8934o;
    }

    public void v(long j10, Surface surface, w0 w0Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        R.d.i(this.f8757a, true);
        R.d.h(this.f8759c);
        R.g gVarF = f(surface);
        if (gVarF == R.d.f9926l) {
            gVarF = c(surface);
            if (gVarF == null) {
                return;
            } else {
                this.f8758b.put(surface, gVarF);
            }
        }
        R.g gVar = gVarF;
        if (surface != this.f8765i) {
            i(gVar.a());
            this.f8765i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        w(gVar, w0Var, surfaceTexture, this.f8935p, this.f8933n, true);
        w(gVar, w0Var, surfaceTexture2, this.f8936q, this.f8934o, false);
        EGLExt.eglPresentationTimeANDROID(this.f8760d, gVar.a(), j10);
        if (EGL14.eglSwapBuffers(this.f8760d, gVar.a())) {
            return;
        }
        AbstractC3583h0.l("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }
}
