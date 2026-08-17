package x5;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import v5.InterfaceC3428a;
import v5.f;
import v5.g;
import w5.InterfaceC3480a;
import w5.InterfaceC3481b;

/* JADX INFO: renamed from: x5.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3547d implements InterfaceC3481b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v5.d f33530e = new v5.d() { // from class: x5.a
        @Override // v5.d
        public final void a(Object obj, Object obj2) {
            C3547d.c(obj, (v5.e) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f33531f = new f() { // from class: x5.b
        @Override // v5.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).d((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f f33532g = new f() { // from class: x5.c
        @Override // v5.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).e(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f33533h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f33534a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f33535b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v5.d f33536c = f33530e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33537d = false;

    /* JADX INFO: renamed from: x5.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements InterfaceC3428a {
        a() {
        }

        @Override // v5.InterfaceC3428a
        public void a(Object obj, Writer writer) {
            C3548e c3548e = new C3548e(writer, C3547d.this.f33534a, C3547d.this.f33535b, C3547d.this.f33536c, C3547d.this.f33537d);
            c3548e.h(obj, false);
            c3548e.p();
        }

        @Override // v5.InterfaceC3428a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* JADX INFO: renamed from: x5.d$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final DateFormat f33539a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f33539a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // v5.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) {
            gVar.d(f33539a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C3547d() {
        m(String.class, f33531f);
        m(Boolean.class, f33532g);
        m(Date.class, f33533h);
    }

    public static /* synthetic */ void c(Object obj, v5.e eVar) {
        throw new v5.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public InterfaceC3428a i() {
        return new a();
    }

    public C3547d j(InterfaceC3480a interfaceC3480a) {
        interfaceC3480a.a(this);
        return this;
    }

    public C3547d k(boolean z10) {
        this.f33537d = z10;
        return this;
    }

    @Override // w5.InterfaceC3481b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C3547d a(Class cls, v5.d dVar) {
        this.f33534a.put(cls, dVar);
        this.f33535b.remove(cls);
        return this;
    }

    public C3547d m(Class cls, f fVar) {
        this.f33535b.put(cls, fVar);
        this.f33534a.remove(cls);
        return this;
    }
}
