package E2;

import P8.q;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements W1.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0036a f1071c = new C0036a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1073b;

    /* JADX INFO: renamed from: E2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0036a {
        public /* synthetic */ C0036a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0036a() {
        }
    }

    public a(int i10, boolean z10) {
        this.f1072a = z10;
        this.f1073b = "anim://" + i10;
    }

    @Override // W1.d
    public boolean a(Uri uri) {
        AbstractC2855l.g(uri, "uri");
        String string = uri.toString();
        AbstractC2855l.f(string, "toString(...)");
        return q.K(string, this.f1073b, false, 2, null);
    }

    @Override // W1.d
    public boolean b() {
        return false;
    }

    @Override // W1.d
    public String c() {
        return this.f1073b;
    }

    @Override // W1.d
    public boolean equals(Object obj) {
        if (!this.f1072a) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC2855l.b(a.class, obj.getClass())) {
            return false;
        }
        return AbstractC2855l.b(this.f1073b, ((a) obj).f1073b);
    }

    @Override // W1.d
    public int hashCode() {
        return !this.f1072a ? super.hashCode() : this.f1073b.hashCode();
    }
}
