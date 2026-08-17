package Q0;

import androidx.datastore.preferences.protobuf.AbstractC1708a;
import androidx.datastore.preferences.protobuf.AbstractC1726t;
import androidx.datastore.preferences.protobuf.AbstractC1727u;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.S;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC1726t implements K {
    private static final g DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC1727u.b strings_ = AbstractC1726t.s();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC1726t.a implements K {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a q(Iterable iterable) {
            l();
            ((g) this.f17029h).P(iterable);
            return this;
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC1726t.K(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(Iterable iterable) {
        Q();
        AbstractC1708a.d(iterable, this.strings_);
    }

    private void Q() {
        AbstractC1727u.b bVar = this.strings_;
        if (bVar.n()) {
            return;
        }
        this.strings_ = AbstractC1726t.E(bVar);
    }

    public static g R() {
        return DEFAULT_INSTANCE;
    }

    public static a T() {
        return (a) DEFAULT_INSTANCE.o();
    }

    public List S() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1726t
    protected final Object r(AbstractC1726t.d dVar, Object obj, Object obj2) {
        S bVar;
        e eVar = null;
        switch (e.f8992a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1726t.G(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                S s10 = PARSER;
                if (s10 != null) {
                    return s10;
                }
                synchronized (g.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC1726t.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
