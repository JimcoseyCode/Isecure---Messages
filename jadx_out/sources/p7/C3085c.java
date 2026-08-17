package p7;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: p7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3085c implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f30668h = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f30669g;

    /* JADX INFO: renamed from: p7.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3085c(Enum[] entries) {
        AbstractC2855l.g(entries, "entries");
        Class<?> componentType = entries.getClass().getComponentType();
        AbstractC2855l.d(componentType);
        this.f30669g = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f30669g.getEnumConstants();
        AbstractC2855l.f(enumConstants, "getEnumConstants(...)");
        return AbstractC3083a.a((Enum[]) enumConstants);
    }
}
