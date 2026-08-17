package Y2;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class B implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f12616d;

    public B(int i10, String prefix, boolean z10) {
        AbstractC2855l.g(prefix, "prefix");
        this.f12613a = i10;
        this.f12614b = prefix;
        this.f12615c = z10;
        this.f12616d = new AtomicInteger(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0, Runnable runnable) {
        AbstractC2855l.g(this$0, "this$0");
        AbstractC2855l.g(runnable, "$runnable");
        try {
            Process.setThreadPriority(this$0.f12613a);
        } catch (Throwable unused) {
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        String str;
        AbstractC2855l.g(runnable, "runnable");
        Runnable runnable2 = new Runnable() { // from class: Y2.A
            @Override // java.lang.Runnable
            public final void run() {
                B.b(this.f12611g, runnable);
            }
        };
        if (this.f12615c) {
            str = this.f12614b + "-" + this.f12616d.getAndIncrement();
        } else {
            str = this.f12614b;
        }
        return new Thread(runnable2, str);
    }
}
