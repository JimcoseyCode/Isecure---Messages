package androidx.lifecycle;

import android.app.Application;
import d1.AbstractC2320a;
import d1.C2323d;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f17559b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC2320a.c f17560c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2323d f17561a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ U b(b bVar, W w10, c cVar, AbstractC2320a abstractC2320a, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = e1.f.f25818a.b(w10);
            }
            if ((i10 & 4) != 0) {
                abstractC2320a = e1.f.f25818a.a(w10);
            }
            return bVar.a(w10, cVar, abstractC2320a);
        }

        public final U a(W owner, c factory, AbstractC2320a extras) {
            AbstractC2855l.g(owner, "owner");
            AbstractC2855l.g(factory, "factory");
            AbstractC2855l.g(extras, "extras");
            return new U(owner.getViewModelStore(), factory, extras);
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17566a = a.f17567a;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f17567a = new a();

            private a() {
            }
        }

        default T a(Class modelClass) {
            AbstractC2855l.g(modelClass, "modelClass");
            return e1.f.f25818a.d();
        }

        default T b(Class modelClass, AbstractC2320a extras) {
            AbstractC2855l.g(modelClass, "modelClass");
            AbstractC2855l.g(extras, "extras");
            return a(modelClass);
        }

        default T c(C7.d modelClass, AbstractC2320a extras) {
            AbstractC2855l.g(modelClass, "modelClass");
            AbstractC2855l.g(extras, "extras");
            return b(AbstractC3430a.b(modelClass), extras);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class d implements c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static d f17569c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f17568b = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final AbstractC2320a.c f17570d = U.f17560c;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a() {
                if (d.f17569c == null) {
                    d.f17569c = new d();
                }
                d dVar = d.f17569c;
                AbstractC2855l.d(dVar);
                return dVar;
            }

            private a() {
            }
        }

        @Override // androidx.lifecycle.U.c
        public T a(Class modelClass) {
            AbstractC2855l.g(modelClass, "modelClass");
            return e1.c.f25813a.a(modelClass);
        }

        @Override // androidx.lifecycle.U.c
        public T b(Class modelClass, AbstractC2320a extras) {
            AbstractC2855l.g(modelClass, "modelClass");
            AbstractC2855l.g(extras, "extras");
            return a(modelClass);
        }

        @Override // androidx.lifecycle.U.c
        public T c(C7.d modelClass, AbstractC2320a extras) {
            AbstractC2855l.g(modelClass, "modelClass");
            AbstractC2855l.g(extras, "extras");
            return b(AbstractC3430a.b(modelClass), extras);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class e {
        public abstract void d(T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class f implements AbstractC2320a.c {
    }

    static {
        AbstractC2320a.C0246a c0246a = AbstractC2320a.f25549b;
        f17560c = new f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public U(V store, c factory) {
        this(store, factory, null, 4, null);
        AbstractC2855l.g(store, "store");
        AbstractC2855l.g(factory, "factory");
    }

    public final T a(C7.d modelClass) {
        AbstractC2855l.g(modelClass, "modelClass");
        return C2323d.e(this.f17561a, modelClass, null, 2, null);
    }

    public T b(Class modelClass) {
        AbstractC2855l.g(modelClass, "modelClass");
        return a(AbstractC3430a.e(modelClass));
    }

    public final T c(String key, C7.d modelClass) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(modelClass, "modelClass");
        return this.f17561a.d(modelClass, key);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0179a f17562f = new C0179a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static a f17563g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final AbstractC2320a.c f17564h;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Application f17565e;

        /* JADX INFO: renamed from: androidx.lifecycle.U$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0179a {
            public /* synthetic */ C0179a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Application application) {
                AbstractC2855l.g(application, "application");
                if (a.f17563g == null) {
                    a.f17563g = new a(application);
                }
                a aVar = a.f17563g;
                AbstractC2855l.d(aVar);
                return aVar;
            }

            private C0179a() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class b implements AbstractC2320a.c {
        }

        static {
            AbstractC2320a.C0246a c0246a = AbstractC2320a.f25549b;
            f17564h = new b();
        }

        private a(Application application, int i10) {
            this.f17565e = application;
        }

        private final T h(Class cls, Application application) {
            if (!AbstractC1754a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                T t10 = (T) cls.getConstructor(Application.class).newInstance(application);
                AbstractC2855l.d(t10);
                return t10;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        @Override // androidx.lifecycle.U.d, androidx.lifecycle.U.c
        public T a(Class modelClass) {
            AbstractC2855l.g(modelClass, "modelClass");
            Application application = this.f17565e;
            if (application != null) {
                return h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.U.d, androidx.lifecycle.U.c
        public T b(Class modelClass, AbstractC2320a extras) {
            AbstractC2855l.g(modelClass, "modelClass");
            AbstractC2855l.g(extras, "extras");
            if (this.f17565e != null) {
                return a(modelClass);
            }
            Application application = (Application) extras.a(f17564h);
            if (application != null) {
                return h(modelClass, application);
            }
            if (AbstractC1754a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(modelClass);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            AbstractC2855l.g(application, "application");
        }
    }

    private U(C2323d c2323d) {
        this.f17561a = c2323d;
    }

    public /* synthetic */ U(V v10, c cVar, AbstractC2320a abstractC2320a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(v10, cVar, (i10 & 4) != 0 ? AbstractC2320a.b.f25551c : abstractC2320a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public U(V store, c factory, AbstractC2320a defaultCreationExtras) {
        this(new C2323d(store, factory, defaultCreationExtras));
        AbstractC2855l.g(store, "store");
        AbstractC2855l.g(factory, "factory");
        AbstractC2855l.g(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public U(W owner) {
        AbstractC2855l.g(owner, "owner");
        V viewModelStore = owner.getViewModelStore();
        e1.f fVar = e1.f.f25818a;
        this(viewModelStore, fVar.b(owner), fVar.a(owner));
    }
}
