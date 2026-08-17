package C8;

import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends J8.e implements Iterable, InterfaceC3550a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f682h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final r0 f683i = new r0(AbstractC2800q.j());

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends J8.z {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // J8.z
        public int b(ConcurrentHashMap concurrentHashMap, String key, Function1 compute) {
            int iIntValue;
            AbstractC2855l.g(concurrentHashMap, "<this>");
            AbstractC2855l.g(key, "key");
            AbstractC2855l.g(compute, "compute");
            Integer num = (Integer) concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(key);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Object objInvoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(((Number) objInvoke).intValue()));
                        iIntValue = ((Number) objInvoke).intValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        }

        public final r0 i(List attributes) {
            AbstractC2855l.g(attributes, "attributes");
            return attributes.isEmpty() ? j() : new r0(attributes, null);
        }

        public final r0 j() {
            return r0.f683i;
        }

        private a() {
        }
    }

    public /* synthetic */ r0(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @Override // J8.AbstractC1275a
    protected J8.z o() {
        return f682h;
    }

    public final r0 s(r0 other) {
        AbstractC2855l.g(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f682h.g().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            p0 p0Var = (p0) d().get(iIntValue);
            p0 p0Var2 = (p0) other.d().get(iIntValue);
            M8.a.a(arrayList, p0Var == null ? p0Var2 != null ? p0Var2.a(p0Var) : null : p0Var.a(p0Var2));
        }
        return f682h.i(arrayList);
    }

    public final boolean t(p0 attribute) {
        AbstractC2855l.g(attribute, "attribute");
        return d().get(f682h.d(attribute.b())) != null;
    }

    public final r0 u(r0 other) {
        AbstractC2855l.g(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f682h.g().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            p0 p0Var = (p0) d().get(iIntValue);
            p0 p0Var2 = (p0) other.d().get(iIntValue);
            M8.a.a(arrayList, p0Var == null ? p0Var2 != null ? p0Var2.c(p0Var) : null : p0Var.c(p0Var2));
        }
        return f682h.i(arrayList);
    }

    public final r0 v(p0 attribute) {
        AbstractC2855l.g(attribute, "attribute");
        if (t(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new r0(attribute);
        }
        return f682h.i(AbstractC2800q.A0(AbstractC2800q.P0(this), attribute));
    }

    public final r0 w(p0 attribute) {
        AbstractC2855l.g(attribute, "attribute");
        if (!isEmpty()) {
            J8.c cVarD = d();
            ArrayList arrayList = new ArrayList();
            for (Object obj : cVarD) {
                if (!AbstractC2855l.b((p0) obj, attribute)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() != d().d()) {
                return f682h.i(arrayList);
            }
        }
        return this;
    }

    private r0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p0 p0Var = (p0) it.next();
            p(p0Var.b(), p0Var);
        }
    }

    private r0(p0 p0Var) {
        this(AbstractC2800q.e(p0Var));
    }
}
