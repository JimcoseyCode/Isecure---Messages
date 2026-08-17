package g0;

import F.V0;
import F.v1;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.concurrent.futures.c;
import b0.c;
import g0.C2628I;
import g0.InterfaceC2646l;
import h0.AbstractC2687a;
import i0.C2720h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import m5.InterfaceFutureC2904a;
import n.InterfaceC2955a;
import y.AbstractC3583h0;

/* JADX INFO: renamed from: g0.I, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2628I implements InterfaceC2646l {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final Range f27897H = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Future f27904G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f27905a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f27907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2648n f27908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final MediaFormat f27909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final MediaCodec f27910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final InterfaceC2646l.b f27911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g0 f27912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Executor f27913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceFutureC2904a f27914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c.a f27915k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final v1 f27921q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final p0 f27922r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rational f27923s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f27924t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    f f27927w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f27906b = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Queue f27916l = new ArrayDeque();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Queue f27917m = new ArrayDeque();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f27918n = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final Set f27919o = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final Deque f27920p = new ArrayDeque();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    InterfaceC2647m f27925u = InterfaceC2647m.f28075a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    Executor f27926v = I.c.b();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    Range f27928x = f27897H;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    long f27929y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f27930z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    Long f27898A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    Future f27899B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private g f27900C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f27901D = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f27902E = false;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    boolean f27903F = false;

    /* JADX INFO: renamed from: g0.I$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends k0 {
        b(MediaCodec mediaCodec, int i10) {
            super(mediaCodec, i10);
        }

        @Override // g0.k0, g0.i0
        public void e(long j10) {
            C2628I c2628i = C2628I.this;
            if (!c2628i.f27907c) {
                j10 = c2628i.e0(j10);
            }
            super.e(j10);
        }
    }

    /* JADX INFO: renamed from: g0.I$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2955a f27934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f27935b;

        c(InterfaceC2955a interfaceC2955a, p0 p0Var) {
            this.f27934a = interfaceC2955a;
            this.f27935b = p0Var;
        }

        @Override // g0.p0
        public long a() {
            return ((Long) this.f27934a.apply(Long.valueOf(this.f27935b.a()))).longValue();
        }

        @Override // g0.p0
        public long b() {
            return ((Long) this.f27934a.apply(Long.valueOf(this.f27935b.b()))).longValue();
        }
    }

    /* JADX INFO: renamed from: g0.I$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d {
        static Surface a() {
            return MediaCodec.createPersistentInputSurface();
        }

        static void b(MediaCodec mediaCodec, Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    /* JADX INFO: renamed from: g0.I$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e implements InterfaceC2646l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f27936a = new LinkedHashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c.a f27937b = c.a.INACTIVE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f27938c = new ArrayList();

        e() {
        }

        public static /* synthetic */ Object h(final e eVar, final c.a aVar) {
            C2628I.this.f27913i.execute(new Runnable() { // from class: g0.N
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(this.f27977g.f27937b);
                }
            });
            return "fetchData";
        }

        public static /* synthetic */ void i(e eVar, final V0.a aVar, Executor executor) {
            eVar.f27936a.put((V0.a) H0.g.g(aVar), (Executor) H0.g.g(executor));
            final c.a aVar2 = eVar.f27937b;
            executor.execute(new Runnable() { // from class: g0.Q
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(aVar2);
                }
            });
        }

        public static /* synthetic */ Object m(final e eVar, final c.a aVar) {
            C2628I.this.f27913i.execute(new Runnable() { // from class: g0.P
                @Override // java.lang.Runnable
                public final void run() {
                    C2628I.e.n(this.f27981g, aVar);
                }
            });
            return "acquireBuffer";
        }

        public static /* synthetic */ void n(final e eVar, c.a aVar) {
            c.a aVar2 = eVar.f27937b;
            if (aVar2 == c.a.ACTIVE) {
                final InterfaceFutureC2904a interfaceFutureC2904aF = C2628I.this.F();
                J.n.t(interfaceFutureC2904aF, aVar);
                aVar.a(new Runnable() { // from class: g0.S
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27985g.p(interfaceFutureC2904aF);
                    }
                }, I.c.b());
                eVar.f27938c.add(interfaceFutureC2904aF);
                interfaceFutureC2904aF.h(new Runnable() { // from class: g0.T
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27987g.f27938c.remove(interfaceFutureC2904aF);
                    }
                }, C2628I.this.f27913i);
                return;
            }
            if (aVar2 == c.a.INACTIVE) {
                aVar.f(new IllegalStateException("BufferProvider is not active."));
                return;
            }
            aVar.f(new IllegalStateException("Unknown state: " + eVar.f27937b));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(InterfaceFutureC2904a interfaceFutureC2904a) {
            if (interfaceFutureC2904a.cancel(true)) {
                return;
            }
            H0.g.i(interfaceFutureC2904a.isDone());
            try {
                ((i0) interfaceFutureC2904a.get()).cancel();
            } catch (InterruptedException | CancellationException | ExecutionException e10) {
                AbstractC3583h0.l(C2628I.this.f27905a, "Unable to cancel the input buffer: " + e10);
            }
        }

        @Override // b0.c
        public InterfaceFutureC2904a a() {
            return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: g0.M
                @Override // androidx.concurrent.futures.c.InterfaceC0153c
                public final Object a(c.a aVar) {
                    return C2628I.e.m(this.f27976a, aVar);
                }
            });
        }

        @Override // F.V0
        public void c(final Executor executor, final V0.a aVar) {
            C2628I.this.f27913i.execute(new Runnable() { // from class: g0.L
                @Override // java.lang.Runnable
                public final void run() {
                    C2628I.e.i(this.f27973g, aVar, executor);
                }
            });
        }

        @Override // F.V0
        public InterfaceFutureC2904a d() {
            return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: g0.J
                @Override // androidx.concurrent.futures.c.InterfaceC0153c
                public final Object a(c.a aVar) {
                    return C2628I.e.h(this.f27970a, aVar);
                }
            });
        }

        @Override // F.V0
        public void e(final V0.a aVar) {
            C2628I.this.f27913i.execute(new Runnable() { // from class: g0.O
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27979g.f27936a.remove(H0.g.g(aVar));
                }
            });
        }

        void q(boolean z10) {
            final c.a aVar = z10 ? c.a.ACTIVE : c.a.INACTIVE;
            if (this.f27937b == aVar) {
                return;
            }
            this.f27937b = aVar;
            if (aVar == c.a.INACTIVE) {
                Iterator it = this.f27938c.iterator();
                while (it.hasNext()) {
                    ((InterfaceFutureC2904a) it.next()).cancel(true);
                }
                this.f27938c.clear();
            }
            for (final Map.Entry entry : this.f27936a.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: g0.K
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((V0.a) entry.getKey()).a(aVar);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    AbstractC3583h0.d(C2628I.this.f27905a, "Unable to post to the supplied executor.", e10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g0.I$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum f {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    /* JADX INFO: renamed from: g0.I$h */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class h implements InterfaceC2646l.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Surface f27965b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private InterfaceC2646l.c.a f27967d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Executor f27968e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f27964a = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f27966c = new HashSet();

        h() {
        }

        private void c(Executor executor, final InterfaceC2646l.c.a aVar, final Surface surface) {
            try {
                executor.execute(new Runnable() { // from class: g0.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(surface);
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC3583h0.d(C2628I.this.f27905a, "Unable to post to the supplied executor.", e10);
            }
        }

        @Override // g0.InterfaceC2646l.c
        public void b(Executor executor, InterfaceC2646l.c.a aVar) {
            Surface surface;
            synchronized (this.f27964a) {
                this.f27967d = (InterfaceC2646l.c.a) H0.g.g(aVar);
                this.f27968e = (Executor) H0.g.g(executor);
                surface = this.f27965b;
            }
            if (surface != null) {
                c(executor, aVar, surface);
            }
        }

        void d() {
            Surface surface;
            HashSet hashSet;
            synchronized (this.f27964a) {
                surface = this.f27965b;
                this.f27965b = null;
                hashSet = new HashSet(this.f27966c);
                this.f27966c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }

        void e() {
            Surface surfaceCreateInputSurface;
            InterfaceC2646l.c.a aVar;
            Executor executor;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) androidx.camera.video.internal.compat.quirk.a.b(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (this.f27964a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (this.f27965b == null) {
                            surfaceCreateInputSurface = d.a();
                            this.f27965b = surfaceCreateInputSurface;
                        } else {
                            surfaceCreateInputSurface = null;
                        }
                        d.b(C2628I.this.f27910f, this.f27965b);
                    } else {
                        Surface surface = this.f27965b;
                        if (surface != null) {
                            this.f27966c.add(surface);
                        }
                        surfaceCreateInputSurface = C2628I.this.f27910f.createInputSurface();
                        this.f27965b = surfaceCreateInputSurface;
                    }
                    aVar = this.f27967d;
                    executor = this.f27968e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (surfaceCreateInputSurface == null || aVar == null || executor == null) {
                return;
            }
            c(executor, aVar, surfaceCreateInputSurface);
        }
    }

    public C2628I(Executor executor, InterfaceC2648n interfaceC2648n, int i10) throws l0 {
        boolean z10 = false;
        H0.g.g(executor);
        this.f27908d = (InterfaceC2648n) H0.g.g(interfaceC2648n);
        MediaCodec mediaCodecA = AbstractC2687a.a(interfaceC2648n);
        this.f27910f = mediaCodecA;
        MediaCodecInfo codecInfo = mediaCodecA.getCodecInfo();
        this.f27913i = I.c.g(executor);
        MediaFormat mediaFormatA = interfaceC2648n.a();
        this.f27909e = mediaFormatA;
        v1 v1VarB = interfaceC2648n.b();
        this.f27921q = v1VarB;
        this.f27922r = f0(new o0(), new InterfaceC2955a() { // from class: g0.p
            @Override // n.InterfaceC2955a
            public final Object apply(Object obj) {
                return Long.valueOf(this.f28077a.e0(((Long) obj).longValue()));
            }
        });
        if (interfaceC2648n instanceof AbstractC2635a) {
            AbstractC2635a abstractC2635a = (AbstractC2635a) interfaceC2648n;
            this.f27905a = "AudioEncoder";
            this.f27907c = false;
            this.f27911g = new e();
            this.f27912h = new C2636b(codecInfo, interfaceC2648n.getMimeType());
            this.f27923s = new Rational(abstractC2635a.e(), abstractC2635a.g());
        } else {
            if (!(interfaceC2648n instanceof q0)) {
                throw new l0("Unknown encoder config type");
            }
            q0 q0Var = (q0) interfaceC2648n;
            this.f27905a = "VideoEncoder";
            this.f27907c = true;
            this.f27911g = new h();
            u0 u0Var = new u0(codecInfo, interfaceC2648n.getMimeType());
            H(u0Var, mediaFormatA);
            this.f27912h = u0Var;
            this.f27923s = new Rational(q0Var.e(), q0Var.h());
        }
        AbstractC3583h0.a(this.f27905a, "mInputTimebase = " + v1VarB);
        AbstractC3583h0.a(this.f27905a, "mMediaFormat = " + mediaFormatA);
        AbstractC3583h0.a(this.f27905a, "mCaptureToEncodeFrameRateRatio = " + this.f27923s);
        try {
            X();
            final AtomicReference atomicReference = new AtomicReference();
            this.f27914j = J.n.s(androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: g0.z
                @Override // androidx.concurrent.futures.c.InterfaceC0153c
                public final Object a(c.a aVar) {
                    return C2628I.v(atomicReference, aVar);
                }
            }));
            this.f27915k = (c.a) H0.g.g((c.a) atomicReference.get());
            if (this.f27907c && i10 == 1 && androidx.camera.video.internal.compat.quirk.a.b(PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) {
                z10 = true;
            }
            this.f27924t = z10;
            Z(f.CONFIGURED);
        } catch (MediaCodec.CodecException e10) {
            throw new l0(e10);
        }
    }

    private void G() {
        if (androidx.camera.video.internal.compat.quirk.a.b(SignalEosOutputBufferNotComeQuirk.class) != null) {
            final g gVar = this.f27900C;
            final Executor executor = this.f27913i;
            Future future = this.f27904G;
            if (future != null) {
                future.cancel(false);
            }
            this.f27904G = I.c.e().schedule(new Runnable() { // from class: g0.v
                @Override // java.lang.Runnable
                public final void run() {
                    C2628I.n(executor, gVar);
                }
            }, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    private void H(s0 s0Var, MediaFormat mediaFormat) {
        H0.g.i(this.f27907c);
        if (mediaFormat.containsKey("bitrate")) {
            int integer = mediaFormat.getInteger("bitrate");
            int iIntValue = ((Integer) s0Var.c().clamp(Integer.valueOf(integer))).intValue();
            if (integer != iIntValue) {
                mediaFormat.setInteger("bitrate", iIntValue);
                AbstractC3583h0.a(this.f27905a, "updated bitrate from " + integer + " to " + iIntValue);
            }
        }
    }

    static boolean N(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    private boolean O() {
        return androidx.camera.video.internal.compat.quirk.a.b(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) != null;
    }

    static boolean Q(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    private static boolean R(Rational rational) {
        return rational != null && rational.getDenominator() == rational.getNumerator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean S() {
        return !R(this.f27923s);
    }

    private void V() {
        AbstractC3583h0.a(this.f27905a, "releaseInternal");
        if (this.f27901D) {
            if (!this.f27924t) {
                AbstractC3583h0.a(this.f27905a, "mMediaCodec.stop()");
                this.f27910f.stop();
            }
            this.f27901D = false;
        }
        AbstractC3583h0.a(this.f27905a, "mMediaCodec.release()");
        this.f27910f.release();
        InterfaceC2646l.b bVar = this.f27911g;
        if (bVar instanceof h) {
            ((h) bVar).d();
        }
        Z(f.RELEASED);
        this.f27915k.c(null);
    }

    private void X() {
        this.f27928x = f27897H;
        this.f27929y = 0L;
        this.f27920p.clear();
        this.f27916l.clear();
        Iterator it = this.f27917m.iterator();
        while (it.hasNext()) {
            ((c.a) it.next()).d();
        }
        this.f27917m.clear();
        AbstractC3583h0.a(this.f27905a, "mMediaCodec.reset()");
        this.f27910f.reset();
        this.f27901D = false;
        this.f27902E = false;
        this.f27903F = false;
        this.f27930z = false;
        Future future = this.f27899B;
        if (future != null) {
            future.cancel(true);
            this.f27899B = null;
        }
        Future future2 = this.f27904G;
        if (future2 != null) {
            future2.cancel(false);
            this.f27904G = null;
        }
        g gVar = this.f27900C;
        if (gVar != null) {
            gVar.p();
        }
        this.f27900C = new g();
        AbstractC3583h0.a(this.f27905a, "mMediaCodec.setCallback()");
        this.f27910f.setCallback(this.f27900C);
        AbstractC3583h0.a(this.f27905a, "mMediaCodec.configure()");
        this.f27910f.configure(this.f27909e, (Surface) null, (MediaCrypto) null, 1);
        InterfaceC2646l.b bVar = this.f27911g;
        if (bVar instanceof h) {
            ((h) bVar).e();
        }
    }

    private void Z(f fVar) {
        if (this.f27927w == fVar) {
            return;
        }
        AbstractC3583h0.a(this.f27905a, "Transitioning encoder internal state: " + this.f27927w + " --> " + fVar);
        this.f27927w = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        AbstractC3583h0.a(this.f27905a, "signalEndOfInputStream");
        J.n.j(F(), new a(), this.f27913i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long e0(long j10) {
        return S() ? Math.round(j10 * this.f27923s.doubleValue()) : j10;
    }

    private static p0 f0(p0 p0Var, InterfaceC2955a interfaceC2955a) {
        return new c(interfaceC2955a, p0Var);
    }

    public static /* synthetic */ void i(C2628I c2628i) {
        if (c2628i.f27930z) {
            AbstractC3583h0.l(c2628i.f27905a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            c2628i.f27898A = null;
            c2628i.a0();
            c2628i.f27930z = false;
        }
    }

    public static /* synthetic */ void k(C2628I c2628i) {
        int iOrdinal = c2628i.f27927w.ordinal();
        if (iOrdinal == 1) {
            c2628i.W();
        } else if (iOrdinal == 6 || iOrdinal == 8) {
            throw new IllegalStateException("Encoder is released");
        }
    }

    public static /* synthetic */ void m(C2628I c2628i, long j10) {
        switch (c2628i.f27927w) {
            case CONFIGURED:
            case PAUSED:
            case STOPPING:
            case PENDING_START_PAUSED:
            case ERROR:
                return;
            case STARTED:
                AbstractC3583h0.a(c2628i.f27905a, "Pause on " + b0.d.f(j10));
                c2628i.f27920p.addLast(Range.create(Long.valueOf(j10), Long.MAX_VALUE));
                c2628i.Z(f.PAUSED);
                return;
            case PENDING_START:
                c2628i.Z(f.PENDING_START_PAUSED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + c2628i.f27927w);
        }
    }

    public static /* synthetic */ void n(Executor executor, final g gVar) {
        Objects.requireNonNull(gVar);
        executor.execute(new Runnable() { // from class: g0.y
            @Override // java.lang.Runnable
            public final void run() {
                gVar.l();
            }
        });
    }

    public static /* synthetic */ void q(C2628I c2628i) {
        c2628i.f27902E = true;
        if (c2628i.f27901D) {
            if (!c2628i.f27924t) {
                AbstractC3583h0.a(c2628i.f27905a, "mMediaCodec.stop()");
                c2628i.f27910f.stop();
            }
            c2628i.X();
        }
    }

    public static /* synthetic */ void s(final C2628I c2628i, long j10, long j11) {
        switch (c2628i.f27927w) {
            case CONFIGURED:
            case STOPPING:
            case ERROR:
                return;
            case STARTED:
            case PAUSED:
                f fVar = c2628i.f27927w;
                c2628i.Z(f.STOPPING);
                Long l10 = (Long) c2628i.f27928x.getLower();
                long jLongValue = l10.longValue();
                if (jLongValue == Long.MAX_VALUE) {
                    throw new AssertionError("There should be a \"start\" before \"stop\"");
                }
                if (j10 == -1) {
                    j10 = j11;
                } else if (j10 < jLongValue) {
                    AbstractC3583h0.l(c2628i.f27905a, "The expected stop time is less than the start time. Use current time as stop time.");
                    j10 = j11;
                }
                if (j10 < jLongValue) {
                    throw new AssertionError("The start time should be before the stop time.");
                }
                c2628i.f27928x = Range.create(l10, Long.valueOf(j10));
                AbstractC3583h0.a(c2628i.f27905a, "Stop on " + b0.d.f(j10));
                if (fVar == f.PAUSED && c2628i.f27898A != null) {
                    c2628i.a0();
                    return;
                } else {
                    c2628i.f27930z = true;
                    c2628i.f27899B = I.c.e().schedule(new Runnable() { // from class: g0.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2628I c2628i2 = this.f28086g;
                            c2628i2.f27913i.execute(new Runnable() { // from class: g0.t
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2628I.i(c2628i2);
                                }
                            });
                        }
                    }, 1000L, TimeUnit.MILLISECONDS);
                    return;
                }
            case PENDING_START:
            case PENDING_START_PAUSED:
                c2628i.Z(f.CONFIGURED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + c2628i.f27927w);
        }
    }

    public static /* synthetic */ void t(C2628I c2628i, long j10) {
        switch (c2628i.f27927w) {
            case CONFIGURED:
                c2628i.f27898A = null;
                AbstractC3583h0.a(c2628i.f27905a, "Start on " + b0.d.f(j10));
                try {
                    if (c2628i.f27901D) {
                        c2628i.X();
                    }
                    c2628i.f27928x = Range.create(Long.valueOf(j10), Long.MAX_VALUE);
                    AbstractC3583h0.a(c2628i.f27905a, "mMediaCodec.start()");
                    c2628i.f27910f.start();
                    InterfaceC2646l.b bVar = c2628i.f27911g;
                    if (bVar instanceof e) {
                        ((e) bVar).q(true);
                    }
                    c2628i.Z(f.STARTED);
                    return;
                } catch (MediaCodec.CodecException e10) {
                    c2628i.L(e10);
                    return;
                }
            case STARTED:
            case PENDING_START:
            case ERROR:
                return;
            case PAUSED:
                c2628i.f27898A = null;
                Range range = (Range) c2628i.f27920p.removeLast();
                H0.g.j(range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                Long l10 = (Long) range.getLower();
                long jLongValue = l10.longValue();
                c2628i.f27920p.addLast(Range.create(l10, Long.valueOf(j10)));
                AbstractC3583h0.a(c2628i.f27905a, "Resume on " + b0.d.f(j10) + "\nPaused duration = " + b0.d.f(j10 - jLongValue));
                if ((c2628i.f27907c || androidx.camera.video.internal.compat.quirk.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!c2628i.f27907c || androidx.camera.video.internal.compat.quirk.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    c2628i.Y(false);
                    InterfaceC2646l.b bVar2 = c2628i.f27911g;
                    if (bVar2 instanceof e) {
                        ((e) bVar2).q(true);
                    }
                }
                if (c2628i.f27907c) {
                    c2628i.W();
                }
                c2628i.Z(f.STARTED);
                return;
            case STOPPING:
            case PENDING_START_PAUSED:
                c2628i.Z(f.PENDING_START);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + c2628i.f27927w);
        }
    }

    public static /* synthetic */ Object v(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "mReleasedFuture";
    }

    public static /* synthetic */ void x(C2628I c2628i, List list, Runnable runnable) {
        if (c2628i.f27927w != f.ERROR) {
            if (!list.isEmpty()) {
                AbstractC3583h0.a(c2628i.f27905a, "encoded data and input buffers are returned");
            }
            if (!(c2628i.f27911g instanceof h) || c2628i.f27902E || c2628i.O()) {
                AbstractC3583h0.a(c2628i.f27905a, "mMediaCodec.stop()");
                c2628i.f27910f.stop();
            } else {
                if (c2628i.f27924t) {
                    AbstractC3583h0.a(c2628i.f27905a, "mMediaCodec.stop()");
                    c2628i.f27910f.stop();
                } else {
                    AbstractC3583h0.a(c2628i.f27905a, "mMediaCodec.flush()");
                    c2628i.f27910f.flush();
                }
                c2628i.f27901D = true;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        c2628i.M();
    }

    public static /* synthetic */ void y(C2628I c2628i) {
        switch (c2628i.f27927w) {
            case CONFIGURED:
            case STARTED:
            case PAUSED:
            case ERROR:
                c2628i.V();
                return;
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
                c2628i.Z(f.PENDING_RELEASE);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + c2628i.f27927w);
        }
    }

    public static /* synthetic */ Object z(AtomicReference atomicReference, c.a aVar) {
        atomicReference.set(aVar);
        return "acquireInputBuffer";
    }

    InterfaceFutureC2904a F() {
        switch (this.f27927w) {
            case CONFIGURED:
                return J.n.n(new IllegalStateException("Encoder is not started yet."));
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                final AtomicReference atomicReference = new AtomicReference();
                InterfaceFutureC2904a interfaceFutureC2904aA = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: g0.w
                    @Override // androidx.concurrent.futures.c.InterfaceC0153c
                    public final Object a(c.a aVar) {
                        return C2628I.z(atomicReference, aVar);
                    }
                });
                final c.a aVar = (c.a) H0.g.g((c.a) atomicReference.get());
                this.f27917m.offer(aVar);
                aVar.a(new Runnable() { // from class: g0.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28094g.f27917m.remove(aVar);
                    }
                }, this.f27913i);
                T();
                return interfaceFutureC2904aA;
            case ERROR:
                return J.n.n(new IllegalStateException("Encoder is in error state."));
            case RELEASED:
                return J.n.n(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f27927w);
        }
    }

    long I() {
        return this.f27922r.a();
    }

    long J(MediaCodec.BufferInfo bufferInfo) {
        long j10 = this.f27929y;
        return j10 > 0 ? bufferInfo.presentationTimeUs - j10 : bufferInfo.presentationTimeUs;
    }

    void K(final int i10, final String str, final Throwable th) {
        switch (this.f27927w) {
            case CONFIGURED:
                U(i10, str, th);
                X();
                break;
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                Z(f.ERROR);
                d0(new Runnable() { // from class: g0.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27882g.U(i10, str, th);
                    }
                });
                break;
            case ERROR:
                AbstractC3583h0.m(this.f27905a, "Get more than one error: " + str + "(" + i10 + ")", th);
                break;
        }
    }

    void L(MediaCodec.CodecException codecException) {
        K(1, codecException.getMessage(), codecException);
    }

    void M() {
        f fVar = this.f27927w;
        if (fVar == f.PENDING_RELEASE) {
            V();
            return;
        }
        if (!this.f27901D) {
            X();
        }
        Z(f.CONFIGURED);
        if (fVar == f.PENDING_START || fVar == f.PENDING_START_PAUSED) {
            start();
            if (fVar == f.PENDING_START_PAUSED) {
                pause();
            }
        }
    }

    boolean P(long j10) {
        for (Range range : this.f27920p) {
            if (range.contains(Long.valueOf(j10))) {
                return true;
            }
            if (j10 < ((Long) range.getLower()).longValue()) {
                break;
            }
        }
        return false;
    }

    void T() {
        while (!this.f27917m.isEmpty() && !this.f27916l.isEmpty()) {
            c.a aVar = (c.a) this.f27917m.poll();
            Objects.requireNonNull(aVar);
            Integer num = (Integer) this.f27916l.poll();
            Objects.requireNonNull(num);
            try {
                final b bVar = new b(this.f27910f, num.intValue());
                if (aVar.c(bVar)) {
                    this.f27918n.add(bVar);
                    bVar.b().h(new Runnable() { // from class: g0.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f28078g.f27918n.remove(bVar);
                        }
                    }, this.f27913i);
                } else {
                    bVar.cancel();
                }
            } catch (MediaCodec.CodecException e10) {
                L(e10);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(final int i10, final String str, final Throwable th) {
        final InterfaceC2647m interfaceC2647m;
        Executor executor;
        synchronized (this.f27906b) {
            interfaceC2647m = this.f27925u;
            executor = this.f27926v;
        }
        try {
            executor.execute(new Runnable() { // from class: g0.E
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC2647m.c(new C2642h(i10, str, th));
                }
            });
        } catch (RejectedExecutionException e10) {
            AbstractC3583h0.d(this.f27905a, "Unable to post to the supplied executor.", e10);
        }
    }

    void W() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        AbstractC3583h0.a(this.f27905a, "mMediaCodec.setParameters - requestKeyFrameToMediaCodec");
        this.f27910f.setParameters(bundle);
    }

    void Y(boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z10 ? 1 : 0);
        AbstractC3583h0.a(this.f27905a, "mMediaCodec.setParameters - setMediaCodecPaused: " + z10);
        this.f27910f.setParameters(bundle);
    }

    @Override // g0.InterfaceC2646l
    public void a() {
        this.f27913i.execute(new Runnable() { // from class: g0.B
            @Override // java.lang.Runnable
            public final void run() {
                C2628I.y(this.f27879g);
            }
        });
    }

    void a0() {
        AbstractC3583h0.a(this.f27905a, "signalCodecStop");
        InterfaceC2646l.b bVar = this.f27911g;
        if (bVar instanceof e) {
            ((e) bVar).q(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f27918n.iterator();
            while (it.hasNext()) {
                arrayList.add(((i0) it.next()).b());
            }
            J.n.w(arrayList).h(new Runnable() { // from class: g0.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28080g.b0();
                }
            }, this.f27913i);
            return;
        }
        if (bVar instanceof h) {
            try {
                G();
                AbstractC3583h0.a(this.f27905a, "mMediaCodec.signalEndOfInputStream()");
                this.f27910f.signalEndOfInputStream();
                this.f27903F = true;
            } catch (MediaCodec.CodecException e10) {
                L(e10);
            }
        }
    }

    @Override // g0.InterfaceC2646l
    public void b(final long j10) {
        final long jI = I();
        this.f27913i.execute(new Runnable() { // from class: g0.H
            @Override // java.lang.Runnable
            public final void run() {
                C2628I.s(this.f27894g, j10, jI);
            }
        });
    }

    @Override // g0.InterfaceC2646l
    public InterfaceC2646l.b c() {
        return this.f27911g;
    }

    public void c0() {
        AbstractC3583h0.a(this.f27905a, "signalSourceStopped");
        this.f27913i.execute(new Runnable() { // from class: g0.F
            @Override // java.lang.Runnable
            public final void run() {
                C2628I.q(this.f27890g);
            }
        });
    }

    @Override // g0.InterfaceC2646l
    public void d(InterfaceC2647m interfaceC2647m, Executor executor) {
        synchronized (this.f27906b) {
            this.f27925u = interfaceC2647m;
            this.f27926v = executor;
        }
    }

    void d0(final Runnable runnable) {
        AbstractC3583h0.a(this.f27905a, "stopMediaCodec");
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.f27919o.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2645k) it.next()).e());
        }
        Iterator it2 = this.f27918n.iterator();
        while (it2.hasNext()) {
            arrayList.add(((i0) it2.next()).b());
        }
        if (!arrayList.isEmpty()) {
            AbstractC3583h0.a(this.f27905a, "Waiting for resources to return. encoded data = " + this.f27919o.size() + ", input buffers = " + this.f27918n.size());
        }
        J.n.w(arrayList).h(new Runnable() { // from class: g0.G
            @Override // java.lang.Runnable
            public final void run() {
                C2628I.x(this.f27891g, arrayList, runnable);
            }
        }, this.f27913i);
    }

    @Override // g0.InterfaceC2646l
    public g0 e() {
        return this.f27912h;
    }

    @Override // g0.InterfaceC2646l
    public InterfaceFutureC2904a f() {
        return this.f27914j;
    }

    @Override // g0.InterfaceC2646l
    public void g() {
        this.f27913i.execute(new Runnable() { // from class: g0.u
            @Override // java.lang.Runnable
            public final void run() {
                C2628I.k(this.f28088g);
            }
        });
    }

    void g0(long j10) {
        while (!this.f27920p.isEmpty()) {
            Range range = (Range) this.f27920p.getFirst();
            if (j10 <= ((Long) range.getUpper()).longValue()) {
                return;
            }
            this.f27920p.removeFirst();
            this.f27929y += ((Long) range.getUpper()).longValue() - ((Long) range.getLower()).longValue();
            AbstractC3583h0.a(this.f27905a, "Total paused duration = " + b0.d.f(this.f27929y));
        }
    }

    @Override // g0.InterfaceC2646l
    public int h() {
        if (this.f27909e.containsKey("bitrate")) {
            return this.f27909e.getInteger("bitrate");
        }
        return 0;
    }

    @Override // g0.InterfaceC2646l
    public void pause() {
        final long jI = I();
        this.f27913i.execute(new Runnable() { // from class: g0.A
            @Override // java.lang.Runnable
            public final void run() {
                C2628I.m(this.f27877g, jI);
            }
        });
    }

    @Override // g0.InterfaceC2646l
    public void start() {
        final long jI = I();
        this.f27913i.execute(new Runnable() { // from class: g0.C
            @Override // java.lang.Runnable
            public final void run() {
                C2628I.t(this.f27880g, jI);
            }
        });
    }

    /* JADX INFO: renamed from: g0.I$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements J.c {
        a() {
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(i0 i0Var) {
            i0Var.e(C2628I.this.I());
            i0Var.c(true);
            i0Var.d();
            J.n.j(i0Var.b(), new C0280a(), C2628I.this.f27913i);
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            C2628I.this.K(0, "Unable to acquire InputBuffer.", th);
        }

        /* JADX INFO: renamed from: g0.I$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0280a implements J.c {
            C0280a() {
            }

            @Override // J.c
            public void onFailure(Throwable th) {
                if (th instanceof MediaCodec.CodecException) {
                    C2628I.this.L((MediaCodec.CodecException) th);
                } else {
                    C2628I.this.K(0, th.getMessage(), th);
                }
            }

            @Override // J.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r12) {
            }
        }
    }

    /* JADX INFO: renamed from: g0.I$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class g extends MediaCodec.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C2720h f27950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f27951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f27952c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f27953d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f27954e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f27955f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f27956g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f27957h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f27958i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f27959j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f27960k;

        /* JADX INFO: renamed from: g0.I$g$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements J.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2645k f27962a;

            a(C2645k c2645k) {
                this.f27962a = c2645k;
            }

            @Override // J.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r22) {
                C2628I.this.f27919o.remove(this.f27962a);
            }

            @Override // J.c
            public void onFailure(Throwable th) {
                C2628I.this.f27919o.remove(this.f27962a);
                if (th instanceof MediaCodec.CodecException) {
                    C2628I.this.L((MediaCodec.CodecException) th);
                } else {
                    C2628I.this.K(0, th.getMessage(), th);
                }
            }
        }

        g() {
            this.f27951b = true;
            boolean z10 = C2628I.this.f27907c;
            this.f27960k = z10;
            if (z10) {
                this.f27950a = new C2720h(C2628I.this.f27922r, C2628I.this.f27921q, (CameraUseInconsistentTimebaseQuirk) androidx.camera.video.internal.compat.quirk.a.b(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.f27950a = null;
            }
            CodecStuckOnFlushQuirk codecStuckOnFlushQuirk = (CodecStuckOnFlushQuirk) androidx.camera.video.internal.compat.quirk.a.b(CodecStuckOnFlushQuirk.class);
            if (codecStuckOnFlushQuirk == null || !codecStuckOnFlushQuirk.h(C2628I.this.f27909e.getString("mime"))) {
                return;
            }
            this.f27951b = false;
        }

        public static /* synthetic */ void b(g gVar, Executor executor, final InterfaceC2647m interfaceC2647m) {
            if (C2628I.this.f27927w == f.ERROR) {
                return;
            }
            try {
                Objects.requireNonNull(interfaceC2647m);
                executor.execute(new Runnable() { // from class: g0.V
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC2647m.d();
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC3583h0.d(C2628I.this.f27905a, "Unable to post to the supplied executor.", e10);
            }
        }

        public static /* synthetic */ void e(g gVar, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i10) {
            C2628I c2628i;
            final InterfaceC2647m interfaceC2647m;
            Executor executor;
            if (gVar.f27959j) {
                AbstractC3583h0.l(C2628I.this.f27905a, "Receives frame after codec is reset.");
                return;
            }
            switch (C2628I.this.f27927w) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    synchronized (C2628I.this.f27906b) {
                        c2628i = C2628I.this;
                        interfaceC2647m = c2628i.f27925u;
                        executor = c2628i.f27926v;
                        break;
                    }
                    if (c2628i.f27907c && c2628i.S()) {
                        bufferInfo.presentationTimeUs = C2628I.this.e0(bufferInfo.presentationTimeUs);
                    }
                    if (!gVar.f27952c) {
                        gVar.f27952c = true;
                        try {
                            Objects.requireNonNull(interfaceC2647m);
                            executor.execute(new Runnable() { // from class: g0.Z
                                @Override // java.lang.Runnable
                                public final void run() {
                                    interfaceC2647m.a();
                                }
                            });
                        } catch (RejectedExecutionException e10) {
                            AbstractC3583h0.d(C2628I.this.f27905a, "Unable to post to the supplied executor.", e10);
                        }
                        break;
                    }
                    if (!gVar.i(bufferInfo)) {
                        try {
                            C2628I.this.f27910f.releaseOutputBuffer(i10, false);
                        } catch (MediaCodec.CodecException e11) {
                            C2628I.this.L(e11);
                            return;
                        }
                        break;
                    } else {
                        if (!gVar.f27953d) {
                            gVar.f27953d = true;
                            AbstractC3583h0.a(C2628I.this.f27905a, "data timestampUs = " + bufferInfo.presentationTimeUs + ", data timebase = " + C2628I.this.f27921q + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        MediaCodec.BufferInfo bufferInfoM = gVar.m(bufferInfo);
                        gVar.f27956g = bufferInfoM.presentationTimeUs;
                        try {
                            gVar.n(new C2645k(mediaCodec, i10, bufferInfoM), interfaceC2647m, executor);
                        } catch (MediaCodec.CodecException e12) {
                            C2628I.this.L(e12);
                            return;
                        }
                        break;
                    }
                    if (!gVar.f27954e && gVar.j(bufferInfo)) {
                        gVar.l();
                    }
                    if (gVar.f27960k) {
                        gVar.f27960k = false;
                        return;
                    }
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C2628I.this.f27927w);
            }
        }

        public static /* synthetic */ void f(g gVar, final MediaFormat mediaFormat) {
            final InterfaceC2647m interfaceC2647m;
            Executor executor;
            if (gVar.f27959j) {
                AbstractC3583h0.l(C2628I.this.f27905a, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (C2628I.this.f27927w) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    C2628I c2628i = C2628I.this;
                    if (c2628i.f27907c && c2628i.S()) {
                        mediaFormat.setInteger("time-lapse-enable", 1);
                        mediaFormat.setInteger("time-lapse-fps", ((q0) C2628I.this.f27908d).e());
                    }
                    synchronized (C2628I.this.f27906b) {
                        C2628I c2628i2 = C2628I.this;
                        interfaceC2647m = c2628i2.f27925u;
                        executor = c2628i2.f27926v;
                        break;
                    }
                    try {
                        executor.execute(new Runnable() { // from class: g0.a0
                            @Override // java.lang.Runnable
                            public final void run() {
                                interfaceC2647m.b(new m0() { // from class: g0.d0
                                    @Override // g0.m0
                                    public final MediaFormat a() {
                                        return C2628I.g.a(mediaFormat);
                                    }
                                });
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e10) {
                        AbstractC3583h0.d(C2628I.this.f27905a, "Unable to post to the supplied executor.", e10);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + C2628I.this.f27927w);
            }
        }

        public static /* synthetic */ void g(g gVar, int i10) {
            if (gVar.f27959j) {
                AbstractC3583h0.l(C2628I.this.f27905a, "Receives input frame after codec is reset.");
                return;
            }
            switch (C2628I.this.f27927w) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    C2628I.this.f27916l.offer(Integer.valueOf(i10));
                    C2628I.this.T();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C2628I.this.f27927w);
            }
        }

        public static /* synthetic */ void h(g gVar, MediaCodec.CodecException codecException) {
            switch (C2628I.this.f27927w) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    C2628I.this.L(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C2628I.this.f27927w);
            }
        }

        private boolean i(MediaCodec.BufferInfo bufferInfo) {
            if (this.f27954e) {
                AbstractC3583h0.a(C2628I.this.f27905a, "Drop buffer by already reach end of stream.");
                return false;
            }
            if (bufferInfo.size <= 0) {
                AbstractC3583h0.a(C2628I.this.f27905a, "Drop buffer by invalid buffer size.");
                return false;
            }
            if ((bufferInfo.flags & 2) != 0) {
                AbstractC3583h0.a(C2628I.this.f27905a, "Drop buffer by codec config.");
                return false;
            }
            C2720h c2720h = this.f27950a;
            if (c2720h != null) {
                bufferInfo.presentationTimeUs = c2720h.b(bufferInfo.presentationTimeUs);
            }
            long j10 = bufferInfo.presentationTimeUs;
            if (j10 <= this.f27955f) {
                AbstractC3583h0.a(C2628I.this.f27905a, "Drop buffer by out of order buffer from MediaCodec.");
                return false;
            }
            this.f27955f = j10;
            if (!C2628I.this.f27928x.contains(Long.valueOf(j10))) {
                AbstractC3583h0.a(C2628I.this.f27905a, "Drop buffer by not in start-stop range.");
                C2628I c2628i = C2628I.this;
                if (c2628i.f27930z && bufferInfo.presentationTimeUs >= ((Long) c2628i.f27928x.getUpper()).longValue()) {
                    Future future = C2628I.this.f27899B;
                    if (future != null) {
                        future.cancel(true);
                    }
                    C2628I.this.f27898A = Long.valueOf(bufferInfo.presentationTimeUs);
                    C2628I.this.a0();
                    C2628I.this.f27930z = false;
                }
                return false;
            }
            if (q(bufferInfo)) {
                AbstractC3583h0.a(C2628I.this.f27905a, "Drop buffer by pause.");
                return false;
            }
            if (C2628I.this.J(bufferInfo) <= this.f27956g) {
                AbstractC3583h0.a(C2628I.this.f27905a, "Drop buffer by adjusted time is less than the last sent time.");
                if (C2628I.this.f27907c && C2628I.Q(bufferInfo)) {
                    this.f27958i = true;
                }
                return false;
            }
            if (!this.f27953d && !this.f27958i && C2628I.this.f27907c) {
                this.f27958i = true;
            }
            if (this.f27958i) {
                if (!C2628I.Q(bufferInfo)) {
                    AbstractC3583h0.a(C2628I.this.f27905a, "Drop buffer by not a key frame.");
                    C2628I.this.W();
                    return false;
                }
                this.f27958i = false;
            }
            return true;
        }

        private boolean j(MediaCodec.BufferInfo bufferInfo) {
            if (!C2628I.N(bufferInfo) || o()) {
                return this.f27951b && k(bufferInfo);
            }
            return true;
        }

        private boolean k(MediaCodec.BufferInfo bufferInfo) {
            C2628I c2628i = C2628I.this;
            return c2628i.f27903F && bufferInfo.presentationTimeUs > ((Long) c2628i.f27928x.getUpper()).longValue();
        }

        private MediaCodec.BufferInfo m(MediaCodec.BufferInfo bufferInfo) {
            long J9 = C2628I.this.J(bufferInfo);
            if (bufferInfo.presentationTimeUs == J9) {
                return bufferInfo;
            }
            H0.g.i(J9 > this.f27956g);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, J9, bufferInfo.flags);
            return bufferInfo2;
        }

        private void n(final C2645k c2645k, final InterfaceC2647m interfaceC2647m, Executor executor) {
            C2628I.this.f27919o.add(c2645k);
            J.n.j(c2645k.e(), new a(c2645k), C2628I.this.f27913i);
            try {
                executor.execute(new Runnable() { // from class: g0.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC2647m.e(c2645k);
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC3583h0.d(C2628I.this.f27905a, "Unable to post to the supplied executor.", e10);
                c2645k.close();
            }
        }

        private boolean o() {
            return this.f27960k && androidx.camera.video.internal.compat.quirk.a.b(PrematureEndOfStreamVideoQuirk.class) != null;
        }

        private boolean q(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final InterfaceC2647m interfaceC2647m;
            C2628I.this.g0(bufferInfo.presentationTimeUs);
            boolean zP = C2628I.this.P(bufferInfo.presentationTimeUs);
            boolean z10 = this.f27957h;
            if (!z10 && zP) {
                AbstractC3583h0.a(C2628I.this.f27905a, "Switch to pause state");
                this.f27957h = true;
                synchronized (C2628I.this.f27906b) {
                    C2628I c2628i = C2628I.this;
                    executor = c2628i.f27926v;
                    interfaceC2647m = c2628i.f27925u;
                }
                Objects.requireNonNull(interfaceC2647m);
                executor.execute(new Runnable() { // from class: g0.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC2647m.f();
                    }
                });
                C2628I c2628i2 = C2628I.this;
                if (c2628i2.f27927w == f.PAUSED && ((c2628i2.f27907c || androidx.camera.video.internal.compat.quirk.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!C2628I.this.f27907c || androidx.camera.video.internal.compat.quirk.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    InterfaceC2646l.b bVar = C2628I.this.f27911g;
                    if (bVar instanceof e) {
                        ((e) bVar).q(false);
                    }
                    C2628I.this.Y(true);
                }
                C2628I.this.f27898A = Long.valueOf(bufferInfo.presentationTimeUs);
                C2628I c2628i3 = C2628I.this;
                if (c2628i3.f27930z) {
                    Future future = c2628i3.f27899B;
                    if (future != null) {
                        future.cancel(true);
                    }
                    C2628I.this.a0();
                    C2628I.this.f27930z = false;
                }
            } else if (z10 && !zP) {
                AbstractC3583h0.a(C2628I.this.f27905a, "Switch to resume state");
                this.f27957h = false;
                if (C2628I.this.f27907c && !C2628I.Q(bufferInfo)) {
                    this.f27958i = true;
                }
            }
            return this.f27957h;
        }

        void l() {
            C2628I c2628i;
            final InterfaceC2647m interfaceC2647m;
            final Executor executor;
            AbstractC3583h0.a(C2628I.this.f27905a, "reachEndData");
            if (this.f27954e) {
                return;
            }
            this.f27954e = true;
            if (C2628I.this.f27904G != null) {
                C2628I.this.f27904G.cancel(false);
                C2628I.this.f27904G = null;
            }
            synchronized (C2628I.this.f27906b) {
                c2628i = C2628I.this;
                interfaceC2647m = c2628i.f27925u;
                executor = c2628i.f27926v;
            }
            c2628i.d0(new Runnable() { // from class: g0.b0
                @Override // java.lang.Runnable
                public final void run() {
                    C2628I.g.b(this.f28004g, executor, interfaceC2647m);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
            C2628I.this.f27913i.execute(new Runnable() { // from class: g0.X
                @Override // java.lang.Runnable
                public final void run() {
                    C2628I.g.h(this.f27996g, codecException);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, final int i10) {
            C2628I.this.f27913i.execute(new Runnable() { // from class: g0.U
                @Override // java.lang.Runnable
                public final void run() {
                    C2628I.g.g(this.f27989g, i10);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i10, final MediaCodec.BufferInfo bufferInfo) {
            C2628I.this.f27913i.execute(new Runnable() { // from class: g0.W
                @Override // java.lang.Runnable
                public final void run() {
                    C2628I.g.e(this.f27992g, bufferInfo, mediaCodec, i10);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
            AbstractC3583h0.a(C2628I.this.f27905a, "onOutputFormatChanged: mediaFormat = " + mediaFormat + ", CSD data = " + b0.d.d(mediaFormat));
            C2628I.this.f27913i.execute(new Runnable() { // from class: g0.Y
                @Override // java.lang.Runnable
                public final void run() {
                    C2628I.g.f(this.f27998g, mediaFormat);
                }
            });
        }

        void p() {
            this.f27959j = true;
        }

        public static /* synthetic */ MediaFormat a(MediaFormat mediaFormat) {
            return mediaFormat;
        }
    }
}
