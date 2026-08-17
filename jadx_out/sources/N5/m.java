package N5;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f8147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f8148b;

        a(Method method, Object obj) {
            this.f8147a = method;
            this.f8148b = obj;
        }

        @Override // N5.m
        public Object c(Class cls) {
            m.a(cls);
            return this.f8147a.invoke(this.f8148b, cls);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f8149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8150b;

        b(Method method, int i10) {
            this.f8149a = method;
            this.f8150b = i10;
        }

        @Override // N5.m
        public Object c(Class cls) {
            m.a(cls);
            return this.f8149a.invoke(null, cls, Integer.valueOf(this.f8150b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f8151a;

        c(Method method) {
            this.f8151a = method;
        }

        @Override // N5.m
        public Object c(Class cls) {
            m.a(cls);
            return this.f8151a.invoke(null, cls, Object.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d extends m {
        d() {
        }

        @Override // N5.m
        public Object c(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    static void a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    public static m b() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new c(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new b(declaredMethod3, iIntValue);
        }
    }

    public abstract Object c(Class cls);
}
