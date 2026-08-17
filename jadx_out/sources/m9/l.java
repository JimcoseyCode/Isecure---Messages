package m9;

import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30003b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f30002a = new a.C0323a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: m9.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static final class C0323a implements l {
            @Override // m9.l
            public boolean a(int i10, t9.j source, int i11, boolean z10) {
                AbstractC2855l.g(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // m9.l
            public void b(int i10, b errorCode) {
                AbstractC2855l.g(errorCode, "errorCode");
            }

            @Override // m9.l
            public boolean c(int i10, List requestHeaders) {
                AbstractC2855l.g(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // m9.l
            public boolean d(int i10, List responseHeaders, boolean z10) {
                AbstractC2855l.g(responseHeaders, "responseHeaders");
                return true;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    boolean a(int i10, t9.j jVar, int i11, boolean z10);

    void b(int i10, b bVar);

    boolean c(int i10, List list);

    boolean d(int i10, List list, boolean z10);
}
