package b3;

import c2.k;
import com.facebook.react.uimanager.ViewDefaults;
import d3.o;
import d3.p;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f18657a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a implements b {
        @Override // b3.g.b
        public List a() {
            return Collections.EMPTY_LIST;
        }

        @Override // b3.g.b
        public int b() {
            return 0;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        List a();

        int b();
    }

    public g() {
        this(new a());
    }

    @Override // b3.e
    public p a(int i10) {
        return o.d(i10, i10 >= this.f18657a.b(), false);
    }

    @Override // b3.e
    public int b(int i10) {
        List listA = this.f18657a.a();
        if (listA == null || listA.isEmpty()) {
            return i10 + 1;
        }
        for (int i11 = 0; i11 < listA.size(); i11++) {
            if (((Integer) listA.get(i11)).intValue() > i10) {
                return ((Integer) listA.get(i11)).intValue();
            }
        }
        return ViewDefaults.NUMBER_OF_LINES;
    }

    @Override // b3.e
    public boolean c() {
        return true;
    }

    public g(b bVar) {
        this.f18657a = (b) k.g(bVar);
    }
}
