package j7;

import java.util.AbstractCollection;
import java.util.Collection;
import x7.InterfaceC3551b;

/* JADX INFO: renamed from: j7.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2788e extends AbstractCollection implements Collection, InterfaceC3551b {
    protected AbstractC2788e() {
    }

    public abstract int d();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }
}
