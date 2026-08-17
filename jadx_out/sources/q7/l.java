package Q7;

import L7.i0;
import R7.u;
import a8.InterfaceC1599a;
import a8.InterfaceC1600b;
import b8.InterfaceC1828l;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements InterfaceC1600b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f9876a = new l();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements InterfaceC1599a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f9877b;

        public a(u javaElement) {
            AbstractC2855l.g(javaElement, "javaElement");
            this.f9877b = javaElement;
        }

        @Override // L7.h0
        public i0 a() {
            i0 NO_SOURCE_FILE = i0.f7336a;
            AbstractC2855l.f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return NO_SOURCE_FILE;
        }

        @Override // a8.InterfaceC1599a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u b() {
            return this.f9877b;
        }

        public String toString() {
            return a.class.getName() + ": " + b();
        }
    }

    private l() {
    }

    @Override // a8.InterfaceC1600b
    public InterfaceC1599a a(InterfaceC1828l javaElement) {
        AbstractC2855l.g(javaElement, "javaElement");
        return new a((u) javaElement);
    }
}
