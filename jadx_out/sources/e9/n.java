package e9;

import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26299b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f26298a = new a.C0267a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: e9.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static final class C0267a implements n {
            @Override // e9.n
            public List loadForRequest(u url) {
                AbstractC2855l.g(url, "url");
                return AbstractC2800q.j();
            }

            @Override // e9.n
            public void saveFromResponse(u url, List cookies) {
                AbstractC2855l.g(url, "url");
                AbstractC2855l.g(cookies, "cookies");
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    List loadForRequest(u uVar);

    void saveFromResponse(u uVar, List list);
}
