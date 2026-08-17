package N5;

import com.google.gson.n;
import com.google.gson.o;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements o, Cloneable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f8104m = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f8105g = -1.0d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8106h = 136;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8107i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f8109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f8110l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private n f8111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f8113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.gson.d f8114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ R5.a f8115e;

        a(boolean z10, boolean z11, com.google.gson.d dVar, R5.a aVar) {
            this.f8112b = z10;
            this.f8113c = z11;
            this.f8114d = dVar;
            this.f8115e = aVar;
        }

        private n e() {
            n nVar = this.f8111a;
            if (nVar != null) {
                return nVar;
            }
            n nVarM = this.f8114d.m(d.this, this.f8115e);
            this.f8111a = nVarM;
            return nVarM;
        }

        @Override // com.google.gson.n
        public Object b(S5.a aVar) throws IOException {
            if (!this.f8112b) {
                return e().b(aVar);
            }
            aVar.S0();
            return null;
        }

        @Override // com.google.gson.n
        public void d(S5.c cVar, Object obj) throws IOException {
            if (this.f8113c) {
                cVar.X();
            } else {
                e().d(cVar, obj);
            }
        }
    }

    public d() {
        List list = Collections.EMPTY_LIST;
        this.f8109k = list;
        this.f8110l = list;
    }

    private boolean e(Class cls) {
        if (this.f8105g == -1.0d || m((M5.d) cls.getAnnotation(M5.d.class), (M5.e) cls.getAnnotation(M5.e.class))) {
            return (!this.f8107i && i(cls)) || h(cls);
        }
        return true;
    }

    private boolean f(Class cls, boolean z10) {
        Iterator it = (z10 ? this.f8109k : this.f8110l).iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    private boolean h(Class cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    private boolean i(Class cls) {
        return cls.isMemberClass() && !j(cls);
    }

    private boolean j(Class cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean k(M5.d dVar) {
        return dVar == null || dVar.value() <= this.f8105g;
    }

    private boolean l(M5.e eVar) {
        return eVar == null || eVar.value() > this.f8105g;
    }

    private boolean m(M5.d dVar, M5.e eVar) {
        return k(dVar) && l(eVar);
    }

    @Override // com.google.gson.o
    public n a(com.google.gson.d dVar, R5.a aVar) {
        Class clsC = aVar.c();
        boolean zE = e(clsC);
        boolean z10 = zE || f(clsC, true);
        boolean z11 = zE || f(clsC, false);
        if (z10 || z11) {
            return new a(z11, z10, dVar, aVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean c(Class cls, boolean z10) {
        return e(cls) || f(cls, z10);
    }

    public boolean g(Field field, boolean z10) {
        M5.a aVar;
        if ((this.f8106h & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f8105g != -1.0d && !m((M5.d) field.getAnnotation(M5.d.class), (M5.e) field.getAnnotation(M5.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f8108j && ((aVar = (M5.a) field.getAnnotation(M5.a.class)) == null || (!z10 ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.f8107i && i(field.getType())) || h(field.getType())) {
            return true;
        }
        List list = z10 ? this.f8109k : this.f8110l;
        if (list.isEmpty()) {
            return false;
        }
        new com.google.gson.a(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }
}
