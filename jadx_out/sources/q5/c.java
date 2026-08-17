package Q5;

import com.google.gson.g;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Class f9851d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f9852b = d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Field f9853c = c();

    c() {
    }

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f9851d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // Q5.b
    public void b(AccessibleObject accessibleObject) {
        if (e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e10) {
            throw new g("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
        }
    }

    boolean e(AccessibleObject accessibleObject) {
        if (this.f9852b == null || this.f9853c == null) {
            return false;
        }
        try {
            Long l10 = (Long) f9851d.getMethod("objectFieldOffset", Field.class).invoke(this.f9852b, this.f9853c);
            l10.longValue();
            f9851d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f9852b, accessibleObject, l10, Boolean.TRUE);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
