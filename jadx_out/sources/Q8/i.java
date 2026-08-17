package q8;

import C8.AbstractC0407d0;
import C8.S;
import L7.H;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f30873a = new i();

    private i() {
    }

    private final C3137b c(List list, H h10, I7.l lVar) {
        List listP0 = AbstractC2800q.P0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listP0.iterator();
        while (it.hasNext()) {
            g gVarF = f(this, it.next(), null, 2, null);
            if (gVarF != null) {
                arrayList.add(gVarF);
            }
        }
        if (h10 == null) {
            return new C3137b(arrayList, new h(lVar));
        }
        AbstractC0407d0 abstractC0407d0O = h10.n().O(lVar);
        AbstractC2855l.f(abstractC0407d0O, "getPrimitiveArrayKotlinType(...)");
        return new z(arrayList, abstractC0407d0O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S d(I7.l lVar, H it) {
        AbstractC2855l.g(it, "it");
        AbstractC0407d0 abstractC0407d0O = it.n().O(lVar);
        AbstractC2855l.f(abstractC0407d0O, "getPrimitiveArrayKotlinType(...)");
        return abstractC0407d0O;
    }

    public static /* synthetic */ g f(i iVar, Object obj, H h10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            h10 = null;
        }
        return iVar.e(obj, h10);
    }

    public final C3137b b(List value, S type) {
        AbstractC2855l.g(value, "value");
        AbstractC2855l.g(type, "type");
        return new z(value, type);
    }

    public final g e(Object obj, H h10) {
        if (obj instanceof Byte) {
            return new C3139d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new w(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new n(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new t(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C3140e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new m(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new j(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C3138c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new x((String) obj);
        }
        if (obj instanceof byte[]) {
            return c(AbstractC2793j.p0((byte[]) obj), h10, I7.l.f5082o);
        }
        if (obj instanceof short[]) {
            return c(AbstractC2793j.w0((short[]) obj), h10, I7.l.f5083p);
        }
        if (obj instanceof int[]) {
            return c(AbstractC2793j.t0((int[]) obj), h10, I7.l.f5084q);
        }
        if (obj instanceof long[]) {
            return c(AbstractC2793j.u0((long[]) obj), h10, I7.l.f5086s);
        }
        if (obj instanceof char[]) {
            return c(AbstractC2793j.q0((char[]) obj), h10, I7.l.f5081n);
        }
        if (obj instanceof float[]) {
            return c(AbstractC2793j.s0((float[]) obj), h10, I7.l.f5085r);
        }
        if (obj instanceof double[]) {
            return c(AbstractC2793j.r0((double[]) obj), h10, I7.l.f5087t);
        }
        if (obj instanceof boolean[]) {
            return c(AbstractC2793j.x0((boolean[]) obj), h10, I7.l.f5080m);
        }
        if (obj == null) {
            return new u();
        }
        return null;
    }
}
