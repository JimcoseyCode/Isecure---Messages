package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f29374a;

    public G(int i10) {
        this.f29374a = new ArrayList(i10);
    }

    public void a(Object obj) {
        this.f29374a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = this.f29374a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f29374a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f29374a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f29374a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f29374a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f29374a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f29374a.toArray(objArr);
    }
}
