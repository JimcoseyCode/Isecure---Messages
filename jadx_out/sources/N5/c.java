package N5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f8085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q5.b f8086b = Q5.b.a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements N5.i {
        a() {
        }

        @Override // N5.i
        public Object construct() {
            return new ConcurrentHashMap();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements N5.i {
        b() {
        }

        @Override // N5.i
        public Object construct() {
            return new TreeMap();
        }
    }

    /* JADX INFO: renamed from: N5.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0083c implements N5.i {
        C0083c() {
        }

        @Override // N5.i
        public Object construct() {
            return new LinkedHashMap();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements N5.i {
        d() {
        }

        @Override // N5.i
        public Object construct() {
            return new N5.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e implements N5.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f8091a = m.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f8092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Type f8093c;

        e(Class cls, Type type) {
            this.f8092b = cls;
            this.f8093c = type;
        }

        @Override // N5.i
        public Object construct() {
            try {
                return this.f8091a.c(this.f8092b);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f8093c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class f implements N5.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f8095a;

        f(Constructor constructor) {
            this.f8095a = constructor;
        }

        @Override // N5.i
        public Object construct() {
            try {
                return this.f8095a.newInstance(null);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke " + this.f8095a + " with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke " + this.f8095a + " with no args", e12.getTargetException());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class g implements N5.i {
        g() {
        }

        @Override // N5.i
        public Object construct() {
            return new TreeSet();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class h implements N5.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f8098a;

        h(Type type) {
            this.f8098a = type;
        }

        @Override // N5.i
        public Object construct() {
            Type type = this.f8098a;
            if (!(type instanceof ParameterizedType)) {
                throw new com.google.gson.g("Invalid EnumSet type: " + this.f8098a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new com.google.gson.g("Invalid EnumSet type: " + this.f8098a.toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class i implements N5.i {
        i() {
        }

        @Override // N5.i
        public Object construct() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class j implements N5.i {
        j() {
        }

        @Override // N5.i
        public Object construct() {
            return new ArrayDeque();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class k implements N5.i {
        k() {
        }

        @Override // N5.i
        public Object construct() {
            return new ArrayList();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class l implements N5.i {
        l() {
        }

        @Override // N5.i
        public Object construct() {
            return new ConcurrentSkipListMap();
        }
    }

    public c(Map map) {
        this.f8085a = map;
    }

    private N5.i b(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                this.f8086b.b(declaredConstructor);
            }
            return new f(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private N5.i c(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new g() : EnumSet.class.isAssignableFrom(cls) ? new h(type) : Set.class.isAssignableFrom(cls) ? new i() : Queue.class.isAssignableFrom(cls) ? new j() : new k();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new l() : ConcurrentMap.class.isAssignableFrom(cls) ? new a() : SortedMap.class.isAssignableFrom(cls) ? new b() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(R5.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new d() : new C0083c();
        }
        return null;
    }

    private N5.i d(Type type, Class cls) {
        return new e(cls, type);
    }

    public N5.i a(R5.a aVar) {
        Type typeD = aVar.d();
        Class clsC = aVar.c();
        android.support.v4.media.session.b.a(this.f8085a.get(typeD));
        android.support.v4.media.session.b.a(this.f8085a.get(clsC));
        N5.i iVarB = b(clsC);
        if (iVarB != null) {
            return iVarB;
        }
        N5.i iVarC = c(typeD, clsC);
        return iVarC != null ? iVarC : d(typeD, clsC);
    }

    public String toString() {
        return this.f8085a.toString();
    }
}
