package W3;

import W3.d;
import android.util.Base64;
import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a {
        public abstract o a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(U3.e eVar);
    }

    public static a a() {
        return new d.b().d(U3.e.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract U3.e d();

    public boolean e() {
        return c() != null;
    }

    public o f(U3.e eVar) {
        return a().b(b()).d(eVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? PointerEventHelper.POINTER_TYPE_UNKNOWN : Base64.encodeToString(c(), 2));
    }
}
