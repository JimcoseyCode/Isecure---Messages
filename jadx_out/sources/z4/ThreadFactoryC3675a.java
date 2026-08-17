package z4;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import r4.AbstractC3268i;

/* JADX INFO: renamed from: z4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ThreadFactoryC3675a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadFactory f34263b = Executors.defaultThreadFactory();

    public ThreadFactoryC3675a(String str) {
        AbstractC3268i.l(str, "Name must not be null");
        this.f34262a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f34263b.newThread(new b(runnable, 0));
        threadNewThread.setName(this.f34262a);
        return threadNewThread;
    }
}
