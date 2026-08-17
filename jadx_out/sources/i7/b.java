package I7;

import L7.H;
import L7.O;
import i7.AbstractC2746i;
import i7.EnumC2749l;
import j7.AbstractC2800q;
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5053a = a.f5054a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f5054a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Lazy f5055b = AbstractC2746i.a(EnumC2749l.f28717h, I7.a.f5052g);

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b a() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(b.class, b.class.getClassLoader());
            AbstractC2855l.d(serviceLoaderLoad);
            b bVar = (b) AbstractC2800q.f0(serviceLoaderLoad);
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }

        public final b c() {
            return (b) f5055b.getValue();
        }
    }

    O a(B8.n nVar, H h10, Iterable iterable, N7.c cVar, N7.a aVar, boolean z10);
}
