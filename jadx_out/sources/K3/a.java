package K3;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f7051c = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f7052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicInteger f7053b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f7054a = new a();
    }

    public static a b() {
        return b.f7054a;
    }

    public int a() {
        return this.f7053b.getAndIncrement();
    }

    public Looper c(int i10) {
        int i11 = i10 % f7051c;
        if (i11 < this.f7052a.size()) {
            if (this.f7052a.get(i11) == null) {
                return Looper.getMainLooper();
            }
            Looper looper = ((HandlerThread) this.f7052a.get(i11)).getLooper();
            return looper != null ? looper : Looper.getMainLooper();
        }
        HandlerThread handlerThread = new HandlerThread("FrameDecoderExecutor-" + i11);
        handlerThread.start();
        this.f7052a.add(handlerThread);
        Looper looper2 = handlerThread.getLooper();
        return looper2 != null ? looper2 : Looper.getMainLooper();
    }

    private a() {
        this.f7052a = new ArrayList();
        this.f7053b = new AtomicInteger(0);
    }
}
