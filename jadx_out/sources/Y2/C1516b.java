package Y2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Y2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1516b implements InterfaceC1530p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f12699f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f12700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f12701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f12702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f12703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f12704e;

    /* JADX INFO: renamed from: Y2.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C1516b(int i10) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new B(10, "FrescoIoBoundExecutor", true));
        AbstractC2855l.f(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        this.f12700a = executorServiceNewFixedThreadPool;
        ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(i10, new B(10, "FrescoDecodeExecutor", true));
        AbstractC2855l.f(executorServiceNewFixedThreadPool2, "newFixedThreadPool(...)");
        this.f12701b = executorServiceNewFixedThreadPool2;
        ExecutorService executorServiceNewFixedThreadPool3 = Executors.newFixedThreadPool(i10, new B(10, "FrescoBackgroundExecutor", true));
        AbstractC2855l.f(executorServiceNewFixedThreadPool3, "newFixedThreadPool(...)");
        this.f12702c = executorServiceNewFixedThreadPool3;
        ExecutorService executorServiceNewFixedThreadPool4 = Executors.newFixedThreadPool(1, new B(10, "FrescoLightWeightBackgroundExecutor", true));
        AbstractC2855l.f(executorServiceNewFixedThreadPool4, "newFixedThreadPool(...)");
        this.f12703d = executorServiceNewFixedThreadPool4;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i10, new B(10, "FrescoBackgroundExecutor", true));
        AbstractC2855l.f(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
        this.f12704e = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // Y2.InterfaceC1530p
    public Executor a() {
        return this.f12701b;
    }

    @Override // Y2.InterfaceC1530p
    public Executor b() {
        return this.f12703d;
    }

    @Override // Y2.InterfaceC1530p
    public Executor c() {
        return this.f12702c;
    }

    @Override // Y2.InterfaceC1530p
    public Executor d() {
        return this.f12700a;
    }

    @Override // Y2.InterfaceC1530p
    public Executor e() {
        return this.f12700a;
    }

    @Override // Y2.InterfaceC1530p
    public Executor f() {
        return this.f12700a;
    }

    @Override // Y2.InterfaceC1530p
    public ScheduledExecutorService g() {
        return this.f12704e;
    }
}
