package g3;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import f2.InterfaceC2600a;
import f2.InterfaceC2603d;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2666B f28156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.f f28157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f28158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.f f28159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.d f28160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.f f28161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f2.i f28162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f2.l f28163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC2600a f28164i;

    public D(C2666B c2666b) {
        this.f28156a = (C2666B) c2.k.g(c2666b);
    }

    private com.facebook.imagepipeline.memory.f a() {
        if (this.f28157b == null) {
            try {
                this.f28157b = (com.facebook.imagepipeline.memory.f) AshmemMemoryChunkPool.class.getConstructor(InterfaceC2603d.class, E.class, F.class).newInstance(this.f28156a.i(), this.f28156a.g(), this.f28156a.h());
            } catch (ClassNotFoundException unused) {
                this.f28157b = null;
            } catch (IllegalAccessException unused2) {
                this.f28157b = null;
            } catch (InstantiationException unused3) {
                this.f28157b = null;
            } catch (NoSuchMethodException unused4) {
                this.f28157b = null;
            } catch (InvocationTargetException unused5) {
                this.f28157b = null;
            }
        }
        return this.f28157b;
    }

    private com.facebook.imagepipeline.memory.f f(int i10) {
        if (i10 == 0) {
            return g();
        }
        if (i10 == 1) {
            return c();
        }
        if (i10 == 2) {
            return a();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i b() {
        if (this.f28158c == null) {
            String strE = this.f28156a.e();
            switch (strE.hashCode()) {
                case -1868884870:
                    if (!strE.equals("legacy_default_params")) {
                        this.f28158c = new com.facebook.imagepipeline.memory.c(this.f28156a.i(), this.f28156a.c(), this.f28156a.d(), this.f28156a.l());
                    } else {
                        this.f28158c = new com.facebook.imagepipeline.memory.c(this.f28156a.i(), n.a(), this.f28156a.d(), this.f28156a.l());
                    }
                    break;
                case -1106578487:
                    strE.equals("legacy");
                    this.f28158c = new com.facebook.imagepipeline.memory.c(this.f28156a.i(), this.f28156a.c(), this.f28156a.d(), this.f28156a.l());
                    break;
                case -404562712:
                    if (strE.equals("experimental")) {
                        this.f28158c = new t(this.f28156a.b(), this.f28156a.a(), z.h(), this.f28156a.m() ? this.f28156a.i() : null);
                        break;
                    }
                    break;
                case -402149703:
                    if (strE.equals("dummy_with_tracking")) {
                        this.f28158c = new s();
                        break;
                    }
                    break;
                case 95945896:
                    if (strE.equals("dummy")) {
                        this.f28158c = new r();
                        break;
                    }
                    break;
            }
        }
        return this.f28158c;
    }

    public com.facebook.imagepipeline.memory.f c() {
        if (this.f28159d == null) {
            try {
                this.f28159d = (com.facebook.imagepipeline.memory.f) BufferMemoryChunkPool.class.getConstructor(InterfaceC2603d.class, E.class, F.class).newInstance(this.f28156a.i(), this.f28156a.g(), this.f28156a.h());
            } catch (ClassNotFoundException unused) {
                this.f28159d = null;
            } catch (IllegalAccessException unused2) {
                this.f28159d = null;
            } catch (InstantiationException unused3) {
                this.f28159d = null;
            } catch (NoSuchMethodException unused4) {
                this.f28159d = null;
            } catch (InvocationTargetException unused5) {
                this.f28159d = null;
            }
        }
        return this.f28159d;
    }

    public com.facebook.imagepipeline.memory.d d() {
        if (this.f28160e == null) {
            this.f28160e = new com.facebook.imagepipeline.memory.d(this.f28156a.i(), this.f28156a.f());
        }
        return this.f28160e;
    }

    public int e() {
        return this.f28156a.f().f28171g;
    }

    public com.facebook.imagepipeline.memory.f g() {
        if (this.f28161f == null) {
            try {
                this.f28161f = (com.facebook.imagepipeline.memory.f) NativeMemoryChunkPool.class.getConstructor(InterfaceC2603d.class, E.class, F.class).newInstance(this.f28156a.i(), this.f28156a.g(), this.f28156a.h());
            } catch (ClassNotFoundException e10) {
                AbstractC2325a.n("PoolFactory", PointerEventHelper.POINTER_TYPE_UNKNOWN, e10);
                this.f28161f = null;
            } catch (IllegalAccessException e11) {
                AbstractC2325a.n("PoolFactory", PointerEventHelper.POINTER_TYPE_UNKNOWN, e11);
                this.f28161f = null;
            } catch (InstantiationException e12) {
                AbstractC2325a.n("PoolFactory", PointerEventHelper.POINTER_TYPE_UNKNOWN, e12);
                this.f28161f = null;
            } catch (NoSuchMethodException e13) {
                AbstractC2325a.n("PoolFactory", PointerEventHelper.POINTER_TYPE_UNKNOWN, e13);
                this.f28161f = null;
            } catch (InvocationTargetException e14) {
                AbstractC2325a.n("PoolFactory", PointerEventHelper.POINTER_TYPE_UNKNOWN, e14);
                this.f28161f = null;
            }
        }
        return this.f28161f;
    }

    public f2.i h() {
        return i(!Y2.z.a() ? 1 : 0);
    }

    public f2.i i(int i10) {
        if (this.f28162g == null) {
            com.facebook.imagepipeline.memory.f fVarF = f(i10);
            c2.k.h(fVarF, "failed to get pool for chunk type: " + i10);
            this.f28162g = new y(fVarF, j());
        }
        return this.f28162g;
    }

    public f2.l j() {
        if (this.f28163h == null) {
            this.f28163h = new f2.l(k());
        }
        return this.f28163h;
    }

    public InterfaceC2600a k() {
        if (this.f28164i == null) {
            this.f28164i = new com.facebook.imagepipeline.memory.e(this.f28156a.i(), this.f28156a.j(), this.f28156a.k());
        }
        return this.f28164i;
    }
}
