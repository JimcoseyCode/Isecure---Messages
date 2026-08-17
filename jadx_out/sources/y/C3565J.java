package y;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: y.J, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3565J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f33692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f33693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f33694d;

    C3565J(a aVar) {
        this.f33691a = Collections.unmodifiableList(aVar.f33695a);
        this.f33692b = Collections.unmodifiableList(aVar.f33696b);
        this.f33693c = Collections.unmodifiableList(aVar.f33697c);
        this.f33694d = aVar.f33698d;
    }

    public long a() {
        return this.f33694d;
    }

    public List b() {
        return this.f33692b;
    }

    public List c() {
        return this.f33691a;
    }

    public List d() {
        return this.f33693c;
    }

    public boolean e() {
        return this.f33694d > 0;
    }

    /* JADX INFO: renamed from: y.J$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f33695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List f33696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List f33697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f33698d;

        public a(C3589k0 c3589k0, int i10) {
            this.f33695a = new ArrayList();
            this.f33696b = new ArrayList();
            this.f33697c = new ArrayList();
            this.f33698d = 5000L;
            a(c3589k0, i10);
        }

        public a a(C3589k0 c3589k0, int i10) {
            boolean z10 = false;
            H0.g.b(c3589k0 != null, "Point cannot be null.");
            if (i10 >= 1 && i10 <= 7) {
                z10 = true;
            }
            H0.g.b(z10, "Invalid metering mode " + i10);
            if ((i10 & 1) != 0) {
                this.f33695a.add(c3589k0);
            }
            if ((i10 & 2) != 0) {
                this.f33696b.add(c3589k0);
            }
            if ((i10 & 4) != 0) {
                this.f33697c.add(c3589k0);
            }
            return this;
        }

        public C3565J b() {
            return new C3565J(this);
        }

        public a c(int i10) {
            if ((i10 & 1) != 0) {
                this.f33695a.clear();
            }
            if ((i10 & 2) != 0) {
                this.f33696b.clear();
            }
            if ((i10 & 4) != 0) {
                this.f33697c.clear();
            }
            return this;
        }

        public a(C3565J c3565j) {
            ArrayList arrayList = new ArrayList();
            this.f33695a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f33696b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f33697c = arrayList3;
            this.f33698d = 5000L;
            arrayList.addAll(c3565j.c());
            arrayList2.addAll(c3565j.b());
            arrayList3.addAll(c3565j.d());
            this.f33698d = c3565j.a();
        }
    }
}
