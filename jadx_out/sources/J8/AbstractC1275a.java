package J8;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: renamed from: J8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1275a implements Iterable, InterfaceC3550a {

    /* JADX INFO: renamed from: J8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class AbstractC0062a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6843a;

        public AbstractC0062a(int i10) {
            this.f6843a = i10;
        }

        protected final Object a(AbstractC1275a thisRef) {
            AbstractC2855l.g(thisRef, "thisRef");
            return thisRef.d().get(this.f6843a);
        }
    }

    protected abstract c d();

    public final boolean isEmpty() {
        return d().d() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return d().iterator();
    }

    protected abstract z o();

    protected final void p(C7.d tClass, Object value) {
        AbstractC2855l.g(tClass, "tClass");
        AbstractC2855l.g(value, "value");
        String strN = tClass.n();
        AbstractC2855l.d(strN);
        q(strN, value);
    }

    protected abstract void q(String str, Object obj);
}
