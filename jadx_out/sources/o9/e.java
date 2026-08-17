package o9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f30578i = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f30579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f30580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Method f30581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f30582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class f30583h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f30584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f30585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f30586c;

        public a(List protocols) {
            AbstractC2855l.g(protocols, "protocols");
            this.f30586c = protocols;
        }

        public final String a() {
            return this.f30585b;
        }

        public final boolean b() {
            return this.f30584a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            AbstractC2855l.g(proxy, "proxy");
            AbstractC2855l.g(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (AbstractC2855l.b(name, "supports") && AbstractC2855l.b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (AbstractC2855l.b(name, "unsupported") && AbstractC2855l.b(Void.TYPE, returnType)) {
                this.f30584a = true;
                return null;
            }
            if (AbstractC2855l.b(name, "protocols") && objArr.length == 0) {
                return this.f30586c;
            }
            if ((AbstractC2855l.b(name, "selectProtocol") || AbstractC2855l.b(name, "select")) && AbstractC2855l.b(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            Object obj2 = list.get(i10);
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj2;
                            if (!this.f30586c.contains(str)) {
                                if (i10 == size) {
                                    break;
                                }
                                i10++;
                            } else {
                                this.f30585b = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) this.f30586c.get(0);
                    this.f30585b = str2;
                    return str2;
                }
            }
            if ((!AbstractC2855l.b(name, "protocolSelected") && !AbstractC2855l.b(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f30585b = (String) obj3;
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        private b() {
        }

        public final j a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                AbstractC2855l.f(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                AbstractC2855l.f(putMethod, "putMethod");
                AbstractC2855l.f(getMethod, "getMethod");
                AbstractC2855l.f(removeMethod, "removeMethod");
                AbstractC2855l.f(clientProviderClass, "clientProviderClass");
                AbstractC2855l.f(serverProviderClass, "serverProviderClass");
                return new e(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public e(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        AbstractC2855l.g(putMethod, "putMethod");
        AbstractC2855l.g(getMethod, "getMethod");
        AbstractC2855l.g(removeMethod, "removeMethod");
        AbstractC2855l.g(clientProviderClass, "clientProviderClass");
        AbstractC2855l.g(serverProviderClass, "serverProviderClass");
        this.f30579d = putMethod;
        this.f30580e = getMethod;
        this.f30581f = removeMethod;
        this.f30582g = clientProviderClass;
        this.f30583h = serverProviderClass;
    }

    @Override // o9.j
    public void b(SSLSocket sslSocket) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        try {
            this.f30581f.invoke(null, sslSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // o9.j
    public void e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        AbstractC2855l.g(protocols, "protocols");
        try {
            this.f30579d.invoke(null, sslSocket, Proxy.newProxyInstance(j.class.getClassLoader(), new Class[]{this.f30582g, this.f30583h}, new a(j.f30594c.b(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // o9.j
    public String h(SSLSocket sslSocket) {
        AbstractC2855l.g(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f30580e.invoke(null, sslSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                j.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
