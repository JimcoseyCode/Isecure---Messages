package Q0;

import androidx.datastore.preferences.protobuf.AbstractC1726t;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.k0;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC1726t implements K {
    private static final f DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private D preferences_ = D.e();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC1726t.a implements K {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a q(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            l();
            ((f) this.f17029h).P().put(str, hVar);
            return this;
        }

        private a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C f8993a = C.d(k0.b.f16920q, PointerEventHelper.POINTER_TYPE_UNKNOWN, k0.b.f16922s, h.Z());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC1726t.K(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map P() {
        return R();
    }

    private D R() {
        if (!this.preferences_.i()) {
            this.preferences_ = this.preferences_.l();
        }
        return this.preferences_;
    }

    private D S() {
        return this.preferences_;
    }

    public static a T() {
        return (a) DEFAULT_INSTANCE.o();
    }

    public static f U(InputStream inputStream) {
        return (f) AbstractC1726t.I(DEFAULT_INSTANCE, inputStream);
    }

    public Map Q() {
        return Collections.unmodifiableMap(S());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1726t
    protected final Object r(AbstractC1726t.d dVar, Object obj, Object obj2) {
        S bVar;
        e eVar = null;
        switch (e.f8992a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1726t.G(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f8993a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                S s10 = PARSER;
                if (s10 != null) {
                    return s10;
                }
                synchronized (f.class) {
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
