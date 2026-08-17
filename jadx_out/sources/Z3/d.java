package Z3;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f13589c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f13591b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f13592a = PointerEventHelper.POINTER_TYPE_UNKNOWN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f13593b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f13592a, Collections.unmodifiableList(this.f13593b));
        }

        public a b(List list) {
            this.f13593b = list;
            return this;
        }

        public a c(String str) {
            this.f13592a = str;
            return this;
        }
    }

    d(String str, List list) {
        this.f13590a = str;
        this.f13591b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f13591b;
    }

    public String b() {
        return this.f13590a;
    }
}
