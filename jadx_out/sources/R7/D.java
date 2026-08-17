package R7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class D extends y implements b8.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f10051a;

    public D(Object recordComponent) {
        AbstractC2855l.g(recordComponent, "recordComponent");
        this.f10051a = recordComponent;
    }

    @Override // R7.y
    public Member O() throws IllegalAccessException, InvocationTargetException {
        Method methodC = C1389a.f10061a.c(this.f10051a);
        if (methodC != null) {
            return methodC;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // b8.w
    public boolean a() {
        return false;
    }

    @Override // b8.w
    public b8.x getType() throws IllegalAccessException, InvocationTargetException {
        Class clsD = C1389a.f10061a.d(this.f10051a);
        if (clsD != null) {
            return new s(clsD);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
