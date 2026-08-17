package H2;

import H2.l;
import android.os.Handler;
import android.os.HandlerThread;
import i7.AbstractC2746i;
import i7.C2750m;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f3691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f3692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicInteger f3693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f3694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f3695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Lazy f3696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Runnable f3697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Runnable f3698h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3699a;

        static {
            int[] iArr = new int[l.a.values().length];
            try {
                iArr[l.a.f3727g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.a.f3728h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.a.f3729i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3699a = iArr;
        }
    }

    static {
        e eVar = new e();
        f3691a = eVar;
        f3692b = new AtomicInteger(0);
        f3693c = new AtomicInteger(0);
        f3694d = new AtomicInteger(0);
        f3695e = new ConcurrentHashMap();
        f3696f = AbstractC2746i.b(new InterfaceC3487a() { // from class: H2.b
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return e.g();
            }
        });
        Runnable runnable = new Runnable() { // from class: H2.c
            @Override // java.lang.Runnable
            public final void run() {
                e.d();
            }
        };
        f3697g = runnable;
        Runnable runnable2 = new Runnable() { // from class: H2.d
            @Override // java.lang.Runnable
            public final void run() {
                e.e();
            }
        };
        f3698h = runnable2;
        eVar.f().post(runnable);
        eVar.f().post(runnable2);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d() {
        float andSet = f3692b.getAndSet(0);
        float andSet2 = f3693c.getAndSet(0);
        float andSet3 = f3694d.getAndSet(0);
        float f10 = andSet + andSet2 + andSet3;
        if (f10 > 0.0f) {
            float f11 = andSet / f10;
            float f12 = andSet3 / f10;
            if (andSet2 / f10 > 0.25f || f12 > 0.1f) {
                for (Map.Entry entry : f3695e.entrySet()) {
                    f3691a.k((i) entry.getKey(), -((Number) entry.getValue()).intValue());
                }
            } else if (f11 > 0.98f) {
                for (Map.Entry entry2 : f3695e.entrySet()) {
                    f3691a.k((i) entry2.getKey(), ((Number) entry2.getValue()).intValue());
                }
            }
            f3695e.clear();
        }
        f3691a.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        k.f3720d.a(new Date(System.currentTimeMillis() - 10000));
        f3691a.i();
    }

    private final Handler f() {
        return (Handler) f3696f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler g() {
        HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    private final boolean i() {
        return f().postDelayed(f3698h, 10000L);
    }

    private final boolean j() {
        return f().postDelayed(f3697g, 2000L);
    }

    private final void k(i iVar, int i10) {
        int iL = B7.d.l(iVar.b() + i10, (int) B7.d.c(iVar.a() * 0.5f, 1.0f), iVar.a());
        if (iL != iVar.b()) {
            iVar.c(iL);
        }
    }

    public final void h(i animation, l frameResult) {
        AbstractC2855l.g(animation, "animation");
        AbstractC2855l.g(frameResult, "frameResult");
        ConcurrentHashMap concurrentHashMap = f3695e;
        if (!concurrentHashMap.contains(animation)) {
            concurrentHashMap.put(animation, Integer.valueOf((int) (animation.a() * 0.2f)));
        }
        int i10 = a.f3699a[frameResult.b().ordinal()];
        if (i10 == 1) {
            f3692b.incrementAndGet();
        } else if (i10 == 2) {
            f3693c.incrementAndGet();
        } else {
            if (i10 != 3) {
                throw new C2750m();
            }
            f3694d.incrementAndGet();
        }
    }
}
