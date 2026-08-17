package androidx.lifecycle;

import android.app.Application;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2845b;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f17556a = AbstractC2800q.m(Application.class, I.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f17557b = AbstractC2800q.e(I.class);

    public static final Constructor c(Class modelClass, List signature) {
        AbstractC2855l.g(modelClass, "modelClass");
        AbstractC2855l.g(signature, "signature");
        Iterator itA = AbstractC2845b.a(modelClass.getConstructors());
        while (itA.hasNext()) {
            Constructor constructor = (Constructor) itA.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC2855l.f(parameterTypes, "getParameterTypes(...)");
            List listV0 = AbstractC2793j.v0(parameterTypes);
            if (AbstractC2855l.b(signature, listV0)) {
                AbstractC2855l.e(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactory_androidKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == listV0.size() && listV0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final T d(Class modelClass, Constructor constructor, Object... params) {
        AbstractC2855l.g(modelClass, "modelClass");
        AbstractC2855l.g(constructor, "constructor");
        AbstractC2855l.g(params, "params");
        try {
            return (T) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e12.getCause());
        }
    }
}
