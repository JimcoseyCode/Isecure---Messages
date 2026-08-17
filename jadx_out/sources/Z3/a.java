package Z3;

import W3.l;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f13563e = new C0139a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f13564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f13565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f13566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f13567d;

    /* JADX INFO: renamed from: Z3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0139a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f13568a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f13569b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f13570c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f13571d = PointerEventHelper.POINTER_TYPE_UNKNOWN;

        C0139a() {
        }

        public C0139a a(d dVar) {
            this.f13569b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f13568a, Collections.unmodifiableList(this.f13569b), this.f13570c, this.f13571d);
        }

        public C0139a c(String str) {
            this.f13571d = str;
            return this;
        }

        public C0139a d(b bVar) {
            this.f13570c = bVar;
            return this;
        }

        public C0139a e(f fVar) {
            this.f13568a = fVar;
            return this;
        }
    }

    a(f fVar, List list, b bVar, String str) {
        this.f13564a = fVar;
        this.f13565b = list;
        this.f13566c = bVar;
        this.f13567d = str;
    }

    public static C0139a e() {
        return new C0139a();
    }

    public String a() {
        return this.f13567d;
    }

    public b b() {
        return this.f13566c;
    }

    public List c() {
        return this.f13565b;
    }

    public f d() {
        return this.f13564a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
