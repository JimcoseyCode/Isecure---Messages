package expo.modules.kotlin.allocators;

import C7.g;
import C7.j;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.K;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\r\u0010\tJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lexpo/modules/kotlin/allocators/ObjectConstructorFactory;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "T", "Ljava/lang/Class;", "clazz", "Lexpo/modules/kotlin/allocators/ObjectConstructor;", "tryToUseDefaultConstructor", "(Ljava/lang/Class;)Lexpo/modules/kotlin/allocators/ObjectConstructor;", "LC7/d;", "tryToUseDefaultKotlinConstructor", "(LC7/d;)Lexpo/modules/kotlin/allocators/ObjectConstructor;", "useUnsafeAllocator", "get", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ObjectConstructorFactory {
    private final <T> ObjectConstructor<T> tryToUseDefaultConstructor(Class<T> clazz) {
        try {
            final Constructor<T> declaredConstructor = clazz.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new ObjectConstructor() { // from class: expo.modules.kotlin.allocators.b
                @Override // expo.modules.kotlin.allocators.ObjectConstructor
                public final Object construct() {
                    return ObjectConstructorFactory.tryToUseDefaultConstructor$lambda$0(declaredConstructor);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object tryToUseDefaultConstructor$lambda$0(Constructor constructor) {
        return constructor.newInstance(null);
    }

    private final <T> ObjectConstructor<T> tryToUseDefaultKotlinConstructor(C7.d clazz) {
        Iterator<T> it = clazz.f().iterator();
        boolean z10 = false;
        T t10 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z10) {
                    break;
                }
            } else {
                T next = it.next();
                List parameters = ((g) next).getParameters();
                if (parameters == null || !parameters.isEmpty()) {
                    Iterator<T> it2 = parameters.iterator();
                    while (it2.hasNext()) {
                        if (!((j) it2.next()).d()) {
                            break;
                        }
                    }
                }
                if (z10) {
                    break;
                }
                z10 = true;
                t10 = next;
            }
        }
        t10 = null;
        final g gVar = (g) t10;
        if (gVar == null) {
            return null;
        }
        return new ObjectConstructor() { // from class: expo.modules.kotlin.allocators.c
            @Override // expo.modules.kotlin.allocators.ObjectConstructor
            public final Object construct() {
                return ObjectConstructorFactory.tryToUseDefaultKotlinConstructor$lambda$2(gVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object tryToUseDefaultKotlinConstructor$lambda$2(g gVar) {
        return gVar.callBy(K.i());
    }

    private final <T> ObjectConstructor<T> useUnsafeAllocator(Class<T> clazz) {
        final UnsafeAllocator<T> unsafeAllocatorCreateAllocator = UnsafeAllocator.INSTANCE.createAllocator(clazz);
        return new ObjectConstructor() { // from class: expo.modules.kotlin.allocators.a
            @Override // expo.modules.kotlin.allocators.ObjectConstructor
            public final Object construct() {
                return unsafeAllocatorCreateAllocator.newInstance();
            }
        };
    }

    public final <T> ObjectConstructor<T> get(C7.d clazz) {
        AbstractC2855l.g(clazz, "clazz");
        ObjectConstructor<T> objectConstructorTryToUseDefaultConstructor = tryToUseDefaultConstructor(AbstractC3430a.b(clazz));
        return (objectConstructorTryToUseDefaultConstructor == null && (objectConstructorTryToUseDefaultConstructor = tryToUseDefaultKotlinConstructor(clazz)) == null) ? useUnsafeAllocator(AbstractC3430a.b(clazz)) : objectConstructorTryToUseDefaultConstructor;
    }
}
