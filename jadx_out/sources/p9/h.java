package p9;

import P8.q;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p9.l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class h implements m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final l.a f30686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f30687g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f30688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f30689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f30690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f30691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class f30692e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: p9.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0344a implements l.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f30693a;

            C0344a(String str) {
                this.f30693a = str;
            }

            @Override // p9.l.a
            public boolean a(SSLSocket sslSocket) {
                AbstractC2855l.g(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                AbstractC2855l.f(name, "sslSocket.javaClass.name");
                return q.K(name, this.f30693a + '.', false, 2, null);
            }

            @Override // p9.l.a
            public m b(SSLSocket sslSocket) {
                AbstractC2855l.g(sslSocket, "sslSocket");
                return h.f30687g.b(sslSocket.getClass());
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !AbstractC2855l.b(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            AbstractC2855l.d(superclass);
            return new h(superclass);
        }

        public final l.a c(String packageName) {
            AbstractC2855l.g(packageName, "packageName");
            return new C0344a(packageName);
        }

        public final l.a d() {
            return h.f30686f;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f30687g = aVar;
        f30686f = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public h(Class sslSocketClass) throws NoSuchMethodException {
        AbstractC2855l.g(sslSocketClass, "sslSocketClass");
        this.f30692e = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC2855l.f(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f30688a = declaredMethod;
        this.f30689b = sslSocketClass.getMethod("setHostname", String.class);
        this.f30690c = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f30691d = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p9.m
    public boolean a(SSLSocket sslSocket) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        return this.f30692e.isInstance(sslSocket);
    }

    @Override // p9.m
    public boolean b() {
        return o9.b.f30566g.b();
    }

    @Override // p9.m
    public String c(SSLSocket sslSocket) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f30690c.invoke(sslSocket, null);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            AbstractC2855l.f(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (NullPointerException e11) {
            if (AbstractC2855l.b(e11.getMessage(), "ssl == null")) {
                return null;
            }
            throw e11;
        } catch (InvocationTargetException e12) {
            throw new AssertionError(e12);
        }
    }

    @Override // p9.m
    public void d(SSLSocket sslSocket, String str, List protocols) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        AbstractC2855l.g(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f30688a.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f30689b.invoke(sslSocket, str);
                }
                this.f30691d.invoke(sslSocket, o9.j.f30594c.c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
