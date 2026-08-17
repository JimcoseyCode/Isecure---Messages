package x1;

import v1.EnumC3417a;

/* JADX INFO: renamed from: x1.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3526j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3526j f33372a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3526j f33373b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC3526j f33374c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC3526j f33375d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC3526j f33376e = new e();

    /* JADX INFO: renamed from: x1.j$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AbstractC3526j {
        a() {
        }

        @Override // x1.AbstractC3526j
        public boolean a() {
            return true;
        }

        @Override // x1.AbstractC3526j
        public boolean b() {
            return true;
        }

        @Override // x1.AbstractC3526j
        public boolean c(EnumC3417a enumC3417a) {
            return enumC3417a == EnumC3417a.REMOTE;
        }

        @Override // x1.AbstractC3526j
        public boolean d(boolean z10, EnumC3417a enumC3417a, v1.c cVar) {
            return (enumC3417a == EnumC3417a.RESOURCE_DISK_CACHE || enumC3417a == EnumC3417a.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: x1.j$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AbstractC3526j {
        b() {
        }

        @Override // x1.AbstractC3526j
        public boolean a() {
            return false;
        }

        @Override // x1.AbstractC3526j
        public boolean b() {
            return false;
        }

        @Override // x1.AbstractC3526j
        public boolean c(EnumC3417a enumC3417a) {
            return false;
        }

        @Override // x1.AbstractC3526j
        public boolean d(boolean z10, EnumC3417a enumC3417a, v1.c cVar) {
            return false;
        }
    }

    /* JADX INFO: renamed from: x1.j$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c extends AbstractC3526j {
        c() {
        }

        @Override // x1.AbstractC3526j
        public boolean a() {
            return true;
        }

        @Override // x1.AbstractC3526j
        public boolean b() {
            return false;
        }

        @Override // x1.AbstractC3526j
        public boolean c(EnumC3417a enumC3417a) {
            return (enumC3417a == EnumC3417a.DATA_DISK_CACHE || enumC3417a == EnumC3417a.MEMORY_CACHE) ? false : true;
        }

        @Override // x1.AbstractC3526j
        public boolean d(boolean z10, EnumC3417a enumC3417a, v1.c cVar) {
            return false;
        }
    }

    /* JADX INFO: renamed from: x1.j$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d extends AbstractC3526j {
        d() {
        }

        @Override // x1.AbstractC3526j
        public boolean a() {
            return false;
        }

        @Override // x1.AbstractC3526j
        public boolean b() {
            return true;
        }

        @Override // x1.AbstractC3526j
        public boolean c(EnumC3417a enumC3417a) {
            return false;
        }

        @Override // x1.AbstractC3526j
        public boolean d(boolean z10, EnumC3417a enumC3417a, v1.c cVar) {
            return (enumC3417a == EnumC3417a.RESOURCE_DISK_CACHE || enumC3417a == EnumC3417a.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: x1.j$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e extends AbstractC3526j {
        e() {
        }

        @Override // x1.AbstractC3526j
        public boolean a() {
            return true;
        }

        @Override // x1.AbstractC3526j
        public boolean b() {
            return true;
        }

        @Override // x1.AbstractC3526j
        public boolean c(EnumC3417a enumC3417a) {
            return enumC3417a == EnumC3417a.REMOTE;
        }

        @Override // x1.AbstractC3526j
        public boolean d(boolean z10, EnumC3417a enumC3417a, v1.c cVar) {
            return ((z10 && enumC3417a == EnumC3417a.DATA_DISK_CACHE) || enumC3417a == EnumC3417a.LOCAL) && cVar == v1.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(EnumC3417a enumC3417a);

    public abstract boolean d(boolean z10, EnumC3417a enumC3417a, v1.c cVar);
}
