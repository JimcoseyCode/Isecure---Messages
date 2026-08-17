package expo.modules.kotlin.services;

import android.content.Context;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import j7.AbstractC2793j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lexpo/modules/kotlin/services/Service;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Service {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/services/Service$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "construct", "Lexpo/modules/kotlin/services/Service;", "serviceClass", "Ljava/lang/Class;", "appContext", "Lexpo/modules/kotlin/AppContext;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Service construct(Class<? extends Service> serviceClass, AppContext appContext) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            AbstractC2855l.g(serviceClass, "serviceClass");
            AbstractC2855l.g(appContext, "appContext");
            Context reactContext = appContext.getReactContext();
            if (reactContext == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Constructor<?>[] constructors = serviceClass.getConstructors();
            AbstractC2855l.f(constructors, "getConstructors(...)");
            Constructor constructor = (Constructor) AbstractC2793j.i0(constructors);
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC2855l.d(parameterTypes);
            if (parameterTypes.length == 0) {
                Object objNewInstance = constructor.newInstance(null);
                AbstractC2855l.e(objNewInstance, "null cannot be cast to non-null type expo.modules.kotlin.services.Service");
                return (Service) objNewInstance;
            }
            if (parameterTypes.length != 1) {
                throw new IllegalArgumentException("Service " + serviceClass.getSimpleName() + " has an invalid constructor.");
            }
            Class cls = (Class) AbstractC2793j.i0(parameterTypes);
            if (AbstractC2855l.b(cls, Context.class)) {
                Object objNewInstance2 = constructor.newInstance(reactContext);
                AbstractC2855l.e(objNewInstance2, "null cannot be cast to non-null type expo.modules.kotlin.services.Service");
                return (Service) objNewInstance2;
            }
            if (AbstractC2855l.b(cls, AppContext.class)) {
                Object objNewInstance3 = constructor.newInstance(appContext);
                AbstractC2855l.e(objNewInstance3, "null cannot be cast to non-null type expo.modules.kotlin.services.Service");
                return (Service) objNewInstance3;
            }
            throw new IllegalArgumentException("Service " + serviceClass.getSimpleName() + " has an invalid constructor.");
        }
    }
}
