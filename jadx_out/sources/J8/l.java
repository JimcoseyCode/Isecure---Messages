package J8;

import L7.InterfaceC1288m;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface l {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6868a = new a();

        private a() {
        }

        @Override // J8.l
        public boolean a(InterfaceC1288m what, InterfaceC1288m from) {
            AbstractC2855l.g(what, "what");
            AbstractC2855l.g(from, "from");
            return true;
        }
    }

    boolean a(InterfaceC1288m interfaceC1288m, InterfaceC1288m interfaceC1288m2);
}
