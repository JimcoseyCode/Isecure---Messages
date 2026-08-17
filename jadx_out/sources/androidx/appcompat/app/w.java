package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Field f14160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f14161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f14162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f14163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Field f14164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f14165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Field f14166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f14167h;

    static void a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        b(resources);
    }

    private static void b(Resources resources) {
        Object obj;
        if (!f14167h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f14166g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f14167h = true;
        }
        Field field = f14166g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException unused2) {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f14161b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f14160a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f14161b = true;
        }
        Field field2 = f14160a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException unused4) {
            }
        }
        if (obj2 != null) {
            c(obj2);
        }
    }

    private static void c(Object obj) {
        LongSparseArray longSparseArray;
        if (!f14163d) {
            try {
                f14162c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f14163d = true;
        }
        Class cls = f14162c;
        if (cls == null) {
            return;
        }
        if (!f14165f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f14164e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f14165f = true;
        }
        Field field = f14164e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
