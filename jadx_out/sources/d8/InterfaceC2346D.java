package d8;

import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: d8.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2346D {

    /* JADX INFO: renamed from: d8.D$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements InterfaceC2346D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25680a = new a();

        private a() {
        }

        @Override // d8.InterfaceC2346D
        public List a(String packageFqName) {
            AbstractC2855l.g(packageFqName, "packageFqName");
            return AbstractC2800q.j();
        }
    }

    List a(String str);
}
