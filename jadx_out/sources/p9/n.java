package p9;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f30704j = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class f30705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Class f30706i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ m b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final m a(String packageName) {
            AbstractC2855l.g(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
                AbstractC2855l.f(paramsClass, "paramsClass");
                return new n(cls, cls2, paramsClass);
            } catch (Exception e10) {
                o9.j.f30594c.g().k("unable to load android socket classes", 5, e10);
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        AbstractC2855l.g(sslSocketClass, "sslSocketClass");
        AbstractC2855l.g(sslSocketFactoryClass, "sslSocketFactoryClass");
        AbstractC2855l.g(paramClass, "paramClass");
        this.f30705h = sslSocketFactoryClass;
        this.f30706i = paramClass;
    }
}
