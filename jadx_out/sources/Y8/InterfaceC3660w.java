package y8;

import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import java.util.List;

/* JADX INFO: renamed from: y8.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3660w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC3660w f34149a = new a();

    /* JADX INFO: renamed from: y8.w$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a implements InterfaceC3660w {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i10 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // y8.InterfaceC3660w
        public void a(InterfaceC1277b interfaceC1277b) {
            if (interfaceC1277b == null) {
                c(2);
            }
        }

        @Override // y8.InterfaceC3660w
        public void b(InterfaceC1280e interfaceC1280e, List list) {
            if (interfaceC1280e == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(InterfaceC1277b interfaceC1277b);

    void b(InterfaceC1280e interfaceC1280e, List list);
}
