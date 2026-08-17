package j7;

import java.util.AbstractSet;
import java.util.Set;
import x7.InterfaceC3554e;

/* JADX INFO: renamed from: j7.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2790g extends AbstractSet implements Set, InterfaceC3554e {
    protected AbstractC2790g() {
    }

    public abstract int d();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return d();
    }
}
