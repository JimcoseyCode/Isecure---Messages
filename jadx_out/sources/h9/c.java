package h9;

import P8.q;
import com.facebook.react.views.image.ReactImageView;
import e9.B;
import e9.C2436d;
import e9.D;
import e9.t;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f28573c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f28574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D f28575b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(D response, B request) {
            AbstractC2855l.g(response, "response");
            AbstractC2855l.g(request, "request");
            int I9 = response.I();
            if (I9 != 200 && I9 != 410 && I9 != 414 && I9 != 501 && I9 != 203 && I9 != 204) {
                if (I9 == 307) {
                    if (D.d0(response, "Expires", null, 2, null) == null && response.s().c() == -1 && !response.s().b() && !response.s().a()) {
                        return false;
                    }
                } else if (I9 != 308 && I9 != 404 && I9 != 405) {
                    switch (I9) {
                        case ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS /* 300 */:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.s().h() || request.f().h()) ? false : true;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Date f28576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f28577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Date f28578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f28579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Date f28580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f28581f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f28582g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f28583h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f28584i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f28585j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final B f28586k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final D f28587l;

        public b(long j10, B request, D d10) {
            AbstractC2855l.g(request, "request");
            this.f28585j = j10;
            this.f28586k = request;
            this.f28587l = d10;
            this.f28584i = -1;
            if (d10 != null) {
                this.f28581f = d10.J0();
                this.f28582g = d10.A0();
                t tVarG0 = d10.g0();
                int size = tVarG0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strP = tVarG0.p(i10);
                    String strS = tVarG0.s(i10);
                    if (q.x(strP, "Date", true)) {
                        this.f28576a = k9.c.a(strS);
                        this.f28577b = strS;
                    } else if (q.x(strP, "Expires", true)) {
                        this.f28580e = k9.c.a(strS);
                    } else if (q.x(strP, "Last-Modified", true)) {
                        this.f28578c = k9.c.a(strS);
                        this.f28579d = strS;
                    } else if (q.x(strP, "ETag", true)) {
                        this.f28583h = strS;
                    } else if (q.x(strP, "Age", true)) {
                        this.f28584i = f9.c.U(strS, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f28576a;
            long jMax = date != null ? Math.max(0L, this.f28582g - date.getTime()) : 0L;
            int i10 = this.f28584i;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f28582g;
            return jMax + (j10 - this.f28581f) + (this.f28585j - j10);
        }

        private final c c() {
            String str;
            if (this.f28587l == null) {
                return new c(this.f28586k, null);
            }
            if (this.f28586k.k() && this.f28587l.M() == null) {
                return new c(this.f28586k, null);
            }
            if (!c.f28573c.a(this.f28587l, this.f28586k)) {
                return new c(this.f28586k, null);
            }
            C2436d c2436dF = this.f28586k.f();
            if (c2436dF.g() || e(this.f28586k)) {
                return new c(this.f28586k, null);
            }
            C2436d c2436dS = this.f28587l.s();
            long jA = a();
            long jD = d();
            if (c2436dF.c() != -1) {
                jD = Math.min(jD, TimeUnit.SECONDS.toMillis(c2436dF.c()));
            }
            long millis = 0;
            long millis2 = c2436dF.e() != -1 ? TimeUnit.SECONDS.toMillis(c2436dF.e()) : 0L;
            if (!c2436dS.f() && c2436dF.d() != -1) {
                millis = TimeUnit.SECONDS.toMillis(c2436dF.d());
            }
            if (!c2436dS.g()) {
                long j10 = millis2 + jA;
                if (j10 < millis + jD) {
                    D.a aVarU0 = this.f28587l.u0();
                    if (j10 >= jD) {
                        aVarU0.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jA > 86400000 && f()) {
                        aVarU0.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new c(null, aVarU0.c());
                }
            }
            String str2 = this.f28583h;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f28578c != null) {
                    str2 = this.f28579d;
                } else {
                    if (this.f28576a == null) {
                        return new c(this.f28586k, null);
                    }
                    str2 = this.f28577b;
                }
                str = "If-Modified-Since";
            }
            t.a aVarR = this.f28586k.i().r();
            AbstractC2855l.d(str2);
            aVarR.c(str, str2);
            return new c(this.f28586k.m().f(aVarR.e()).b(), this.f28587l);
        }

        private final long d() {
            D d10 = this.f28587l;
            AbstractC2855l.d(d10);
            if (d10.s().c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.c());
            }
            Date date = this.f28580e;
            if (date != null) {
                Date date2 = this.f28576a;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f28582g);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f28578c != null && this.f28587l.D0().p().m() == null) {
                Date date3 = this.f28576a;
                long time2 = date3 != null ? date3.getTime() : this.f28581f;
                Date date4 = this.f28578c;
                AbstractC2855l.d(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
            }
            return 0L;
        }

        private final boolean e(B b10) {
            return (b10.h("If-Modified-Since") == null && b10.h("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            D d10 = this.f28587l;
            AbstractC2855l.d(d10);
            return d10.s().c() == -1 && this.f28580e == null;
        }

        public final c b() {
            c cVarC = c();
            return (cVarC.b() == null || !this.f28586k.f().i()) ? cVarC : new c(null, null);
        }
    }

    public c(B b10, D d10) {
        this.f28574a = b10;
        this.f28575b = d10;
    }

    public final D a() {
        return this.f28575b;
    }

    public final B b() {
        return this.f28574a;
    }
}
