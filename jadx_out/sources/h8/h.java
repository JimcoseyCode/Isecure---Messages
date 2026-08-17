package h8;

import f8.w;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28564b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f28565c = new h(AbstractC2800q.j());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f28566a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(w table) {
            AbstractC2855l.g(table, "table");
            if (table.u() == 0) {
                return b();
            }
            List listV = table.v();
            AbstractC2855l.f(listV, "getRequirementList(...)");
            return new h(listV, null);
        }

        public final h b() {
            return h.f28565c;
        }

        private a() {
        }
    }

    public /* synthetic */ h(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    private h(List list) {
        this.f28566a = list;
    }
}
