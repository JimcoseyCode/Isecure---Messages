package H2;

import i7.C2735B;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f3720d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f3721e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V2.d f3722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3724c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Date until) {
            AbstractC2855l.g(until, "until");
            synchronized (k.f3721e) {
                try {
                    ConcurrentHashMap concurrentHashMap = k.f3721e;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        if (((m) entry.getValue()).b().compareTo(until) < 0) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        ((m) entry2.getValue()).a().clear();
                        k.f3721e.remove(entry2.getKey());
                    }
                    C2735B c2735b = C2735B.f28704a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b(String cacheKey, j frameLoader) {
            AbstractC2855l.g(cacheKey, "cacheKey");
            AbstractC2855l.g(frameLoader, "frameLoader");
            k.f3721e.put(cacheKey, new m(frameLoader, new Date()));
        }

        private a() {
        }
    }

    public k(V2.d platformBitmapFactory, int i10, int i11) {
        AbstractC2855l.g(platformBitmapFactory, "platformBitmapFactory");
        this.f3722a = platformBitmapFactory;
        this.f3723b = i10;
        this.f3724c = i11;
    }

    public final j b(String cacheKey, D2.c bitmapFrameRenderer, C2.d animationInformation) {
        AbstractC2855l.g(cacheKey, "cacheKey");
        AbstractC2855l.g(bitmapFrameRenderer, "bitmapFrameRenderer");
        AbstractC2855l.g(animationInformation, "animationInformation");
        ConcurrentHashMap concurrentHashMap = f3721e;
        synchronized (concurrentHashMap) {
            m mVar = (m) concurrentHashMap.get(cacheKey);
            if (mVar == null) {
                C2735B c2735b = C2735B.f28704a;
                return new g(this.f3722a, bitmapFrameRenderer, new G2.c(this.f3723b), animationInformation, this.f3724c);
            }
            concurrentHashMap.remove(cacheKey);
            return mVar.a();
        }
    }
}
