package R8;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n7.AbstractC2981a;
import n7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class M extends AbstractC2981a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f10144i = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f10145h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements j.c {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public M(String str) {
        super(f10144i);
        this.f10145h = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof M) && AbstractC2855l.b(this.f10145h, ((M) obj).f10145h);
    }

    public int hashCode() {
        return this.f10145h.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f10145h + ')';
    }
}
