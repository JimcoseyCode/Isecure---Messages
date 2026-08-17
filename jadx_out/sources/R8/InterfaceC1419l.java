package R8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: R8.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1419l extends O0 {

    /* JADX INFO: renamed from: R8.l$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements InterfaceC1419l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Function1 f10205a;

        public a(Function1 function1) {
            this.f10205a = function1;
        }

        @Override // R8.InterfaceC1419l
        public void a(Throwable th) {
            this.f10205a.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + S.a(this.f10205a) + '@' + S.b(this) + ']';
        }
    }

    void a(Throwable th);
}
