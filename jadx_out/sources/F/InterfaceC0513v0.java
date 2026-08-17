package F;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: F.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0513v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC0513v0 f1712a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f1713b = Collections.unmodifiableList(Arrays.asList(13, 10, 8, 11, 6, 5, 4, 9, 3, 7, 2));

    /* JADX INFO: renamed from: F.v0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements InterfaceC0513v0 {
        a() {
        }

        @Override // F.InterfaceC0513v0
        public boolean a(int i10) {
            return false;
        }

        @Override // F.InterfaceC0513v0
        public InterfaceC0515w0 b(int i10) {
            return null;
        }
    }

    boolean a(int i10);

    InterfaceC0515w0 b(int i10);
}
