package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f17571a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f17571a.values().iterator();
        while (it.hasNext()) {
            ((T) it.next()).b();
        }
        this.f17571a.clear();
    }

    public final T b(String key) {
        AbstractC2855l.g(key, "key");
        return (T) this.f17571a.get(key);
    }

    public final Set c() {
        return new HashSet(this.f17571a.keySet());
    }

    public final void d(String key, T viewModel) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(viewModel, "viewModel");
        T t10 = (T) this.f17571a.put(key, viewModel);
        if (t10 != null) {
            t10.b();
        }
    }
}
