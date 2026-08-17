package o4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.b;
import java.util.Set;
import o4.f;
import p4.InterfaceC3056c;
import p4.InterfaceC3061h;
import r4.AbstractC3268i;
import r4.C3262c;

/* JADX INFO: renamed from: o4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3008a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0335a f30477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f30478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30479c;

    /* JADX INFO: renamed from: o4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class AbstractC0335a extends e {
        public f a(Context context, Looper looper, C3262c c3262c, Object obj, f.a aVar, f.b bVar) {
            return b(context, looper, c3262c, obj, aVar, bVar);
        }

        public f b(Context context, Looper looper, C3262c c3262c, Object obj, InterfaceC3056c interfaceC3056c, InterfaceC3061h interfaceC3061h) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* JADX INFO: renamed from: o4.a$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
    }

    /* JADX INFO: renamed from: o4.a$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c {
    }

    /* JADX INFO: renamed from: o4.a$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0336a f30480f = new C0336a(null);

        /* JADX INFO: renamed from: o4.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0336a implements d {
            /* synthetic */ C0336a(j jVar) {
            }
        }
    }

    /* JADX INFO: renamed from: o4.a$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class e {
    }

    /* JADX INFO: renamed from: o4.a$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface f extends b {
        Set a();

        void b(com.google.android.gms.common.internal.e eVar, Set set);

        void c(String str);

        boolean d();

        String e();

        void f(b.c cVar);

        void g();

        void h(b.e eVar);

        boolean i();

        boolean j();

        int l();

        Feature[] m();

        String n();

        boolean o();
    }

    /* JADX INFO: renamed from: o4.a$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class g extends c {
    }

    public C3008a(String str, AbstractC0335a abstractC0335a, g gVar) {
        AbstractC3268i.l(abstractC0335a, "Cannot construct an Api with a null ClientBuilder");
        AbstractC3268i.l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f30479c = str;
        this.f30477a = abstractC0335a;
        this.f30478b = gVar;
    }

    public final AbstractC0335a a() {
        return this.f30477a;
    }

    public final String b() {
        return this.f30479c;
    }
}
