package R;

import R.a;
import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a {
        public abstract e a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);
    }

    e() {
    }

    public static a a() {
        return new a.b().e("0.0").c("0.0").d(PointerEventHelper.POINTER_TYPE_UNKNOWN).b(PointerEventHelper.POINTER_TYPE_UNKNOWN);
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();
}
