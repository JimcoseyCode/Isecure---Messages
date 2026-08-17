package R7;

import b8.InterfaceC1818b;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: R7.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1396h implements InterfaceC1818b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10082b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k8.f f10083a;

    /* JADX INFO: renamed from: R7.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC1396h a(Object value, k8.f fVar) {
            AbstractC2855l.g(value, "value");
            return AbstractC1394f.l(value.getClass()) ? new v(fVar, (Enum) value) : value instanceof Annotation ? new i(fVar, (Annotation) value) : value instanceof Object[] ? new l(fVar, (Object[]) value) : value instanceof Class ? new r(fVar, (Class) value) : new x(fVar, value);
        }

        private a() {
        }
    }

    public /* synthetic */ AbstractC1396h(k8.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    @Override // b8.InterfaceC1818b
    public k8.f getName() {
        return this.f10083a;
    }

    private AbstractC1396h(k8.f fVar) {
        this.f10083a = fVar;
    }
}
