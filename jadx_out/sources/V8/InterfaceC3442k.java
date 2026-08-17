package v8;

import j7.T;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: v8.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3442k extends InterfaceC3445n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f32993a = a.f32994a;

    /* JADX INFO: renamed from: v8.k$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f32994a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Function1 f32995b = C3441j.f32992g;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean a(k8.f it) {
            AbstractC2855l.g(it, "it");
            return true;
        }

        public final Function1 c() {
            return f32995b;
        }
    }

    /* JADX INFO: renamed from: v8.k$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC3443l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f32996b = new b();

        private b() {
        }

        @Override // v8.AbstractC3443l, v8.InterfaceC3442k
        public Set a() {
            return T.e();
        }

        @Override // v8.AbstractC3443l, v8.InterfaceC3442k
        public Set c() {
            return T.e();
        }

        @Override // v8.AbstractC3443l, v8.InterfaceC3442k
        public Set e() {
            return T.e();
        }
    }

    Set a();

    Collection b(k8.f fVar, T7.b bVar);

    Set c();

    Collection d(k8.f fVar, T7.b bVar);

    Set e();
}
