package X1;

import android.content.Context;
import c2.n;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f12340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f12341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f12342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f12343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f12344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final W1.a f12345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final W1.c f12346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Z1.b f12347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f12348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f12349l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements n {
        a() {
        }

        @Override // c2.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public File get() {
            c2.k.g(d.this.f12348k);
            return d.this.f12348k.getApplicationContext().getCacheDir();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f12352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n f12353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f12354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f12355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f12356f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private j f12357g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private W1.a f12358h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private W1.c f12359i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Z1.b f12360j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f12361k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Context f12362l;

        public d n() {
            return new d(this);
        }

        private b(Context context) {
            this.f12351a = 1;
            this.f12352b = "image_cache";
            this.f12354d = 41943040L;
            this.f12355e = 10485760L;
            this.f12356f = 2097152L;
            this.f12357g = new c();
            this.f12362l = context;
        }
    }

    protected d(b bVar) {
        Context context = bVar.f12362l;
        this.f12348k = context;
        c2.k.j((bVar.f12353c == null && context == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
        if (bVar.f12353c == null && context != null) {
            bVar.f12353c = new a();
        }
        this.f12338a = bVar.f12351a;
        this.f12339b = (String) c2.k.g(bVar.f12352b);
        this.f12340c = (n) c2.k.g(bVar.f12353c);
        this.f12341d = bVar.f12354d;
        this.f12342e = bVar.f12355e;
        this.f12343f = bVar.f12356f;
        this.f12344g = (j) c2.k.g(bVar.f12357g);
        this.f12345h = bVar.f12358h == null ? W1.g.b() : bVar.f12358h;
        this.f12346i = bVar.f12359i == null ? W1.h.i() : bVar.f12359i;
        this.f12347j = bVar.f12360j == null ? Z1.c.b() : bVar.f12360j;
        this.f12349l = bVar.f12361k;
    }

    public static b m(Context context) {
        return new b(context);
    }

    public String b() {
        return this.f12339b;
    }

    public n c() {
        return this.f12340c;
    }

    public W1.a d() {
        return this.f12345h;
    }

    public W1.c e() {
        return this.f12346i;
    }

    public long f() {
        return this.f12341d;
    }

    public Z1.b g() {
        return this.f12347j;
    }

    public j h() {
        return this.f12344g;
    }

    public boolean i() {
        return this.f12349l;
    }

    public long j() {
        return this.f12342e;
    }

    public long k() {
        return this.f12343f;
    }

    public int l() {
        return this.f12338a;
    }
}
