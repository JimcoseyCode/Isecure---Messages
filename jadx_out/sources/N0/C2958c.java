package n0;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: n0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2958c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f30015a;

    public C2958c(int i10, float f10) {
        this.f30015a = new LinkedHashMap(i10, f10, true);
    }

    public final Object a(Object key) {
        AbstractC2855l.g(key, "key");
        return this.f30015a.get(key);
    }

    public final Set b() {
        Set setEntrySet = this.f30015a.entrySet();
        AbstractC2855l.f(setEntrySet, "map.entries");
        return setEntrySet;
    }

    public final boolean c() {
        return this.f30015a.isEmpty();
    }

    public final Object d(Object key, Object value) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(value, "value");
        return this.f30015a.put(key, value);
    }

    public final Object e(Object key) {
        AbstractC2855l.g(key, "key");
        return this.f30015a.remove(key);
    }
}
