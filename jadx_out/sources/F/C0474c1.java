package F;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: F.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C0474c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f1441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f1442c;

    /* JADX INFO: renamed from: F.c1$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1443a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Set f1444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set f1445c;

        public C0474c1 a() {
            return new C0474c1(this.f1443a, this.f1444b, this.f1445c);
        }

        public b b(Set set) {
            this.f1445c = new HashSet(set);
            return this;
        }

        public b c(Set set) {
            this.f1444b = new HashSet(set);
            return this;
        }

        public b d(boolean z10) {
            this.f1443a = z10;
            return this;
        }
    }

    public static C0474c1 b() {
        return new b().d(true).a();
    }

    public boolean a(Class cls, boolean z10) {
        if (this.f1441b.contains(cls)) {
            return true;
        }
        return !this.f1442c.contains(cls) && this.f1440a && z10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0474c1)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0474c1 c0474c1 = (C0474c1) obj;
        return this.f1440a == c0474c1.f1440a && Objects.equals(this.f1441b, c0474c1.f1441b) && Objects.equals(this.f1442c, c0474c1.f1442c);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1440a), this.f1441b, this.f1442c);
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f1440a + ", forceEnabledQuirks=" + this.f1441b + ", forceDisabledQuirks=" + this.f1442c + '}';
    }

    private C0474c1(boolean z10, Set set, Set set2) {
        this.f1440a = z10;
        this.f1441b = set == null ? Collections.EMPTY_SET : new HashSet(set);
        this.f1442c = set2 == null ? Collections.EMPTY_SET : new HashSet(set2);
    }
}
