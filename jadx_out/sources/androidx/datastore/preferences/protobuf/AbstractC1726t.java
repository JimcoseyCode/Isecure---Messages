package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1708a;
import androidx.datastore.preferences.protobuf.AbstractC1727u;
import com.facebook.react.uimanager.ViewDefaults;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1726t extends AbstractC1708a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1726t> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected g0 unknownFields = g0.c();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a extends AbstractC1708a.AbstractC0171a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AbstractC1726t f17028g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected AbstractC1726t f17029h;

        protected a(AbstractC1726t abstractC1726t) {
            this.f17028g = abstractC1726t;
            if (abstractC1726t.B()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f17029h = p();
        }

        private static void o(Object obj, Object obj2) {
            U.a().d(obj).a(obj, obj2);
        }

        private AbstractC1726t p() {
            return this.f17028g.H();
        }

        public final AbstractC1726t i() {
            AbstractC1726t abstractC1726tX = X();
            if (abstractC1726tX.z()) {
                return abstractC1726tX;
            }
            throw AbstractC1708a.AbstractC0171a.h(abstractC1726tX);
        }

        @Override // androidx.datastore.preferences.protobuf.J.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public AbstractC1726t X() {
            if (!this.f17029h.B()) {
                return this.f17029h;
            }
            this.f17029h.C();
            return this.f17029h;
        }

        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVarC = a().c();
            aVarC.f17029h = X();
            return aVarC;
        }

        protected final void l() {
            if (this.f17029h.B()) {
                return;
            }
            m();
        }

        protected void m() {
            AbstractC1726t abstractC1726tP = p();
            o(abstractC1726tP, this.f17029h);
            this.f17029h = abstractC1726tP;
        }

        @Override // androidx.datastore.preferences.protobuf.K
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public AbstractC1726t a() {
            return this.f17028g;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected static class b extends AbstractC1709b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC1726t f17030b;

        public b(AbstractC1726t abstractC1726t) {
            this.f17030b = abstractC1726t;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c extends AbstractC1718k {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static final boolean A(AbstractC1726t abstractC1726t, boolean z10) {
        byte bByteValue = ((Byte) abstractC1726t.p(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = U.a().d(abstractC1726t).d(abstractC1726t);
        if (z10) {
            abstractC1726t.q(d.SET_MEMOIZED_IS_INITIALIZED, zD ? abstractC1726t : null);
        }
        return zD;
    }

    protected static AbstractC1727u.b E(AbstractC1727u.b bVar) {
        int size = bVar.size();
        return bVar.f(size == 0 ? 10 : size * 2);
    }

    protected static Object G(J j10, String str, Object[] objArr) {
        return new W(j10, str, objArr);
    }

    protected static AbstractC1726t I(AbstractC1726t abstractC1726t, InputStream inputStream) {
        return j(J(abstractC1726t, AbstractC1714g.g(inputStream), C1720m.b()));
    }

    static AbstractC1726t J(AbstractC1726t abstractC1726t, AbstractC1714g abstractC1714g, C1720m c1720m) throws C1728v {
        AbstractC1726t abstractC1726tH = abstractC1726t.H();
        try {
            Y yD = U.a().d(abstractC1726tH);
            yD.b(abstractC1726tH, C1715h.O(abstractC1714g), c1720m);
            yD.c(abstractC1726tH);
            return abstractC1726tH;
        } catch (e0 e10) {
            throw e10.a().k(abstractC1726tH);
        } catch (C1728v e11) {
            e = e11;
            if (e.a()) {
                e = new C1728v(e);
            }
            throw e.k(abstractC1726tH);
        } catch (IOException e12) {
            if (e12.getCause() instanceof C1728v) {
                throw ((C1728v) e12.getCause());
            }
            throw new C1728v(e12).k(abstractC1726tH);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C1728v) {
                throw ((C1728v) e13.getCause());
            }
            throw e13;
        }
    }

    protected static void K(Class cls, AbstractC1726t abstractC1726t) {
        abstractC1726t.D();
        defaultInstanceMap.put(cls, abstractC1726t);
    }

    private static AbstractC1726t j(AbstractC1726t abstractC1726t) throws C1728v {
        if (abstractC1726t == null || abstractC1726t.z()) {
            return abstractC1726t;
        }
        throw abstractC1726t.g().a().k(abstractC1726t);
    }

    private int n(Y y10) {
        return y10 == null ? U.a().d(this).g(this) : y10.g(this);
    }

    protected static AbstractC1727u.b s() {
        return V.p();
    }

    static AbstractC1726t t(Class cls) {
        AbstractC1726t abstractC1726t = defaultInstanceMap.get(cls);
        if (abstractC1726t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1726t = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC1726t != null) {
            return abstractC1726t;
        }
        AbstractC1726t abstractC1726tA = ((AbstractC1726t) i0.i(cls)).a();
        if (abstractC1726tA == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC1726tA);
        return abstractC1726tA;
    }

    static Object y(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    boolean B() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected void C() {
        U.a().d(this).c(this);
        D();
    }

    void D() {
        this.memoizedSerializedSize &= ViewDefaults.NUMBER_OF_LINES;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final a c() {
        return (a) p(d.NEW_BUILDER);
    }

    AbstractC1726t H() {
        return (AbstractC1726t) p(d.NEW_MUTABLE_INSTANCE);
    }

    void L(int i10) {
        this.memoizedHashCode = i10;
    }

    void M(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & ViewDefaults.NUMBER_OF_LINES) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public int b() {
        return f(null);
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public void e(AbstractC1716i abstractC1716i) {
        U.a().d(this).e(this, C1717j.N(abstractC1716i));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return U.a().d(this).f(this, (AbstractC1726t) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1708a
    int f(Y y10) {
        if (!B()) {
            if (w() != Integer.MAX_VALUE) {
                return w();
            }
            int iN = n(y10);
            M(iN);
            return iN;
        }
        int iN2 = n(y10);
        if (iN2 >= 0) {
            return iN2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iN2);
    }

    public int hashCode() {
        if (B()) {
            return m();
        }
        if (x()) {
            L(m());
        }
        return v();
    }

    Object i() {
        return p(d.BUILD_MESSAGE_INFO);
    }

    void k() {
        this.memoizedHashCode = 0;
    }

    void l() {
        M(ViewDefaults.NUMBER_OF_LINES);
    }

    int m() {
        return U.a().d(this).h(this);
    }

    protected final a o() {
        return (a) p(d.NEW_BUILDER);
    }

    protected Object p(d dVar) {
        return r(dVar, null, null);
    }

    protected Object q(d dVar, Object obj) {
        return r(dVar, obj, null);
    }

    protected abstract Object r(d dVar, Object obj, Object obj2);

    public String toString() {
        return L.f(this, super.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.K
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final AbstractC1726t a() {
        return (AbstractC1726t) p(d.GET_DEFAULT_INSTANCE);
    }

    int v() {
        return this.memoizedHashCode;
    }

    int w() {
        return this.memoizedSerializedSize & ViewDefaults.NUMBER_OF_LINES;
    }

    boolean x() {
        return v() == 0;
    }

    public final boolean z() {
        return A(this, true);
    }
}
