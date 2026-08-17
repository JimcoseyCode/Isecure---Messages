package s2;

import c2.n;
import c2.o;
import java.util.List;

/* JADX INFO: renamed from: s2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3318b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2.f f32235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f32236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f32237c;

    /* JADX INFO: renamed from: s2.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f32238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n f32239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f32240c;

        static /* bridge */ /* synthetic */ N2.g c(a aVar) {
            aVar.getClass();
            return null;
        }

        public C3318b e() {
            return new C3318b(this);
        }
    }

    public static a e() {
        return new a();
    }

    public c2.f a() {
        return this.f32235a;
    }

    public n b() {
        return this.f32237c;
    }

    public N2.g c() {
        return null;
    }

    public h d() {
        return this.f32236b;
    }

    private C3318b(a aVar) {
        this.f32235a = aVar.f32238a != null ? c2.f.o(aVar.f32238a) : null;
        this.f32237c = aVar.f32239b != null ? aVar.f32239b : o.a(Boolean.FALSE);
        this.f32236b = aVar.f32240c;
        a.c(aVar);
    }
}
