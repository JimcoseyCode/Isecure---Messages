package P;

import R.d;
import R.e;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import y.AbstractC3583h0;
import y.C3563H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Thread f8759c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected EGLConfig f8763g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Surface f8765i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AtomicBoolean f8757a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Map f8758b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected EGLDisplay f8760d = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected EGLContext f8761e = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int[] f8762f = R.d.f9915a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected EGLSurface f8764h = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected Map f8766j = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected d.f f8767k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected d.e f8768l = d.e.UNKNOWN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8769m = -1;

    private void a(int i10) {
        GLES20.glActiveTexture(33984);
        R.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, i10);
        R.d.g("glBindTexture");
    }

    private void b(C3563H c3563h, e.a aVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f8760d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f8760d, iArr, 0, iArr, 1)) {
            this.f8760d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (aVar != null) {
            aVar.c(iArr[0] + "." + iArr[1]);
        }
        int i10 = c3563h.d() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f8760d, new int[]{12324, i10, 12323, i10, 12322, i10, 12321, c3563h.d() ? 2 : 8, 12325, 0, 12326, 0, 12352, c3563h.d() ? 64 : 4, 12610, c3563h.d() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f8760d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, c3563h.d() ? 3 : 2, 12344}, 0);
        R.d.f("eglCreateContext");
        this.f8763g = eGLConfig;
        this.f8761e = eGLContextEglCreateContext;
        EGL14.eglQueryContext(this.f8760d, eGLContextEglCreateContext, 12440, new int[1], 0);
    }

    private void d() {
        EGLDisplay eGLDisplay = this.f8760d;
        EGLConfig eGLConfig = this.f8763g;
        Objects.requireNonNull(eGLConfig);
        this.f8764h = R.d.n(eGLDisplay, eGLConfig, 1, 1);
    }

    private H0.d e(C3563H c3563h) {
        R.d.i(this.f8757a, false);
        try {
            b(c3563h, null);
            d();
            i(this.f8764h);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.f8760d, 12373);
            if (strGlGetString == null) {
                strGlGetString = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
            if (strEglQueryString == null) {
                strEglQueryString = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
            return new H0.d(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e10) {
            AbstractC3583h0.m("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e10.getMessage(), e10);
            return new H0.d(PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN);
        } finally {
            l();
        }
    }

    private void l() {
        Iterator it = this.f8766j.values().iterator();
        while (it.hasNext()) {
            ((d.f) it.next()).b();
        }
        this.f8766j = Collections.EMPTY_MAP;
        this.f8767k = null;
        if (!Objects.equals(this.f8760d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f8760d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (R.g gVar : this.f8758b.values()) {
                if (!Objects.equals(gVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f8760d, gVar.a())) {
                    R.d.e("eglDestroySurface");
                }
            }
            this.f8758b.clear();
            if (!Objects.equals(this.f8764h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f8760d, this.f8764h);
                this.f8764h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f8761e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f8760d, this.f8761e);
                this.f8761e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f8760d);
            this.f8760d = EGL14.EGL_NO_DISPLAY;
        }
        this.f8763g = null;
        this.f8769m = -1;
        this.f8768l = d.e.UNKNOWN;
        this.f8765i = null;
        this.f8759c = null;
    }

    private void q(ByteBuffer byteBuffer, Size size, float[] fArr) {
        H0.g.b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        H0.g.b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int iU = R.d.u();
        GLES20.glActiveTexture(33985);
        R.d.g("glActiveTexture");
        GLES20.glBindTexture(3553, iU);
        R.d.g("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        R.d.g("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int iT = R.d.t();
        GLES20.glBindFramebuffer(36160, iT);
        R.d.g("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iU, 0);
        R.d.g("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        R.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, this.f8769m);
        R.d.g("glBindTexture");
        this.f8765i = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        d.f fVar = (d.f) H0.g.g(this.f8767k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        R.d.g("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        R.d.g("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        R.d.s(iU);
        R.d.r(iT);
        a(this.f8769m);
    }

    protected R.g c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f8760d;
            EGLConfig eGLConfig = this.f8763g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceQ = R.d.q(eGLDisplay, eGLConfig, surface, this.f8762f);
            Size sizeX = R.d.x(this.f8760d, eGLSurfaceQ);
            return R.g.d(eGLSurfaceQ, sizeX.getWidth(), sizeX.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            AbstractC3583h0.m("OpenGlRenderer", "Failed to create EGL surface: " + e10.getMessage(), e10);
            return null;
        }
    }

    protected R.g f(Surface surface) {
        H0.g.j(this.f8758b.containsKey(surface), "The surface is not registered.");
        R.g gVar = (R.g) this.f8758b.get(surface);
        Objects.requireNonNull(gVar);
        return gVar;
    }

    public int g() {
        R.d.i(this.f8757a, true);
        R.d.h(this.f8759c);
        return this.f8769m;
    }

    public R.e h(C3563H c3563h, Map map) throws Throwable {
        R.d.i(this.f8757a, false);
        e.a aVarA = R.e.a();
        try {
            if (c3563h.d()) {
                H0.d dVarE = e(c3563h);
                String str = (String) H0.g.g((String) dVarE.f3634a);
                String str2 = (String) H0.g.g((String) dVarE.f3635b);
                if (!str.contains("GL_EXT_YUV_target")) {
                    AbstractC3583h0.l("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    c3563h = C3563H.f33650d;
                }
                this.f8762f = R.d.k(str2, c3563h);
                aVarA.d(str);
                aVarA.b(str2);
            }
            b(c3563h, aVarA);
            d();
            i(this.f8764h);
            aVarA.e(R.d.w());
            this.f8766j = R.d.o(c3563h, map);
            int iP = R.d.p();
            this.f8769m = iP;
            s(iP);
            this.f8759c = Thread.currentThread();
            this.f8757a.set(true);
            return aVarA.a();
        } catch (IllegalArgumentException e10) {
            e = e10;
            l();
            throw e;
        } catch (IllegalStateException e11) {
            e = e11;
            l();
            throw e;
        }
    }

    protected void i(EGLSurface eGLSurface) {
        H0.g.g(this.f8760d);
        H0.g.g(this.f8761e);
        if (!EGL14.eglMakeCurrent(this.f8760d, eGLSurface, eGLSurface, this.f8761e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void j(Surface surface) {
        R.d.i(this.f8757a, true);
        R.d.h(this.f8759c);
        if (this.f8758b.containsKey(surface)) {
            return;
        }
        this.f8758b.put(surface, R.d.f9926l);
    }

    public void k() {
        if (this.f8757a.getAndSet(false)) {
            R.d.h(this.f8759c);
            l();
        }
    }

    protected void m(Surface surface, boolean z10) {
        if (this.f8765i == surface) {
            this.f8765i = null;
            i(this.f8764h);
        }
        R.g gVar = z10 ? (R.g) this.f8758b.remove(surface) : (R.g) this.f8758b.put(surface, R.d.f9926l);
        if (gVar == null || gVar == R.d.f9926l) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f8760d, gVar.a());
        } catch (RuntimeException e10) {
            AbstractC3583h0.m("OpenGlRenderer", "Failed to destroy EGL surface: " + e10.getMessage(), e10);
        }
    }

    public void n(long j10, float[] fArr, Surface surface) {
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
        if (surface != this.f8765i) {
            i(gVarF.a());
            this.f8765i = surface;
            GLES20.glViewport(0, 0, gVarF.c(), gVarF.b());
            GLES20.glScissor(0, 0, gVarF.c(), gVarF.b());
        }
        d.f fVar = (d.f) H0.g.g(this.f8767k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        R.d.g("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f8760d, gVarF.a(), j10);
        if (EGL14.eglSwapBuffers(this.f8760d, gVarF.a())) {
            return;
        }
        AbstractC3583h0.l("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }

    public void o(d.e eVar) {
        R.d.i(this.f8757a, true);
        R.d.h(this.f8759c);
        if (this.f8768l != eVar) {
            this.f8768l = eVar;
            s(this.f8769m);
        }
    }

    public Bitmap p(Size size, float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        q(byteBufferAllocateDirect, size, fArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, byteBufferAllocateDirect, size.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public void r(Surface surface) {
        R.d.i(this.f8757a, true);
        R.d.h(this.f8759c);
        m(surface, true);
    }

    protected void s(int i10) {
        d.f fVar = (d.f) this.f8766j.get(this.f8768l);
        if (fVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f8768l);
        }
        if (this.f8767k != fVar) {
            this.f8767k = fVar;
            fVar.f();
            Objects.toString(this.f8768l);
            Objects.toString(this.f8767k);
        }
        a(i10);
    }
}
