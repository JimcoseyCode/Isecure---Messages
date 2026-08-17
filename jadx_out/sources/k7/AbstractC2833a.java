package k7;

import j7.AbstractC2790g;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: k7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2833a extends AbstractC2790g {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return o((Map.Entry) obj);
        }
        return false;
    }

    public final boolean o(Map.Entry element) {
        AbstractC2855l.g(element, "element");
        return p(element);
    }

    public abstract boolean p(Map.Entry entry);

    public abstract /* bridge */ boolean q(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return q((Map.Entry) obj);
        }
        return false;
    }
}
