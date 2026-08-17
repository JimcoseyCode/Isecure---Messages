package J8;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements Iterable, InterfaceC3550a {
    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int d();

    public abstract Object get(int i10);

    @Override // java.lang.Iterable
    public abstract Iterator iterator();

    public abstract void set(int i10, Object obj);

    private c() {
    }
}
