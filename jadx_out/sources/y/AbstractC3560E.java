package y;

import F.InterfaceC0484g0;
import F.InterfaceC0488i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: y.E, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3560E {

    /* JADX INFO: renamed from: y.E$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a implements InterfaceC0484g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f33632a;

        a(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f33632a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // F.InterfaceC0484g0
        public List a() {
            return this.f33632a;
        }
    }

    static InterfaceC0484g0 a(InterfaceC0488i0... interfaceC0488i0Arr) {
        return new a(Arrays.asList(interfaceC0488i0Arr));
    }

    public static InterfaceC0484g0 b() {
        return a(new InterfaceC0488i0.a());
    }
}
