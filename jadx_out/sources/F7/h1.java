package F7;

import R7.AbstractC1394f;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2793j;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(Class cls) {
        AbstractC2855l.d(cls);
        return AbstractC1394f.f(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC2855l.f(parameterTypes, "getParameterTypes(...)");
        sb.append(AbstractC2793j.a0(parameterTypes, PointerEventHelper.POINTER_TYPE_UNKNOWN, "(", ")", 0, null, g1.f2055g, 24, null));
        Class<?> returnType = method.getReturnType();
        AbstractC2855l.f(returnType, "getReturnType(...)");
        sb.append(AbstractC1394f.f(returnType));
        return sb.toString();
    }
}
