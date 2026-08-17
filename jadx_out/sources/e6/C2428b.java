package e6;

import java.util.concurrent.Executor;
import r4.AbstractC3267h;

/* JADX INFO: renamed from: e6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2428b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f25934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f25935c;

    /* JADX INFO: renamed from: e6.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f25936a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f25937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Executor f25938c;

        public C2428b a() {
            return new C2428b(this.f25936a, this.f25937b, this.f25938c, null, null);
        }

        public a b(int i10, int... iArr) {
            this.f25936a = i10;
            if (iArr != null) {
                for (int i11 : iArr) {
                    this.f25936a = i11 | this.f25936a;
                }
            }
            return this;
        }
    }

    /* synthetic */ C2428b(int i10, boolean z10, Executor executor, d dVar, e eVar) {
        this.f25933a = i10;
        this.f25934b = z10;
        this.f25935c = executor;
    }

    public final int a() {
        return this.f25933a;
    }

    public final d b() {
        return null;
    }

    public final Executor c() {
        return this.f25935c;
    }

    public final boolean d() {
        return this.f25934b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2428b)) {
            return false;
        }
        C2428b c2428b = (C2428b) obj;
        return this.f25933a == c2428b.f25933a && this.f25934b == c2428b.f25934b && AbstractC3267h.a(this.f25935c, c2428b.f25935c) && AbstractC3267h.a(null, null);
    }

    public int hashCode() {
        return AbstractC3267h.b(Integer.valueOf(this.f25933a), Boolean.valueOf(this.f25934b), this.f25935c, null);
    }
}
