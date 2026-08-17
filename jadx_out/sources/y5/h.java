package y5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import w5.InterfaceC3480a;
import w5.InterfaceC3481b;
import y5.h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f33973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f33974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v5.d f33975c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements InterfaceC3481b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final v5.d f33976d = new v5.d() { // from class: y5.g
            @Override // v5.d
            public final void a(Object obj, Object obj2) {
                h.a.b(obj, (v5.e) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f33977a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f33978b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private v5.d f33979c = f33976d;

        public static /* synthetic */ void b(Object obj, v5.e eVar) {
            throw new v5.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f33977a), new HashMap(this.f33978b), this.f33979c);
        }

        public a d(InterfaceC3480a interfaceC3480a) {
            interfaceC3480a.a(this);
            return this;
        }

        @Override // w5.InterfaceC3481b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, v5.d dVar) {
            this.f33977a.put(cls, dVar);
            this.f33978b.remove(cls);
            return this;
        }
    }

    h(Map map, Map map2, v5.d dVar) {
        this.f33973a = map;
        this.f33974b = map2;
        this.f33975c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f33973a, this.f33974b, this.f33975c).q(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
