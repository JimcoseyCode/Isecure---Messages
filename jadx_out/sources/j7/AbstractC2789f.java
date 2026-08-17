package j7;

import java.util.AbstractList;
import java.util.List;
import x7.InterfaceC3551b;

/* JADX INFO: renamed from: j7.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2789f extends AbstractList implements List, InterfaceC3551b {
    protected AbstractC2789f() {
    }

    public abstract int d();

    public abstract Object o(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return o(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return d();
    }
}
