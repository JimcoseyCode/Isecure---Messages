package v8;

import v8.C3435d;

/* JADX INFO: renamed from: v8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3434c {

    /* JADX INFO: renamed from: v8.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC3434c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32952a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f32953b;

        static {
            C3435d.a aVar = C3435d.f32955c;
            f32953b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        private a() {
        }

        @Override // v8.AbstractC3434c
        public int a() {
            return f32953b;
        }
    }

    /* JADX INFO: renamed from: v8.c$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC3434c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32954a = new b();

        private b() {
        }

        @Override // v8.AbstractC3434c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
