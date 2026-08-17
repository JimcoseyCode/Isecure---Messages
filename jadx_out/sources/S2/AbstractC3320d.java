package s2;

import Y2.C1533t;
import Y2.C1534u;
import Y2.y;
import Y2.z;
import android.content.Context;
import d2.AbstractC2325a;
import j3.C2768b;
import java.lang.reflect.InvocationTargetException;
import y3.AbstractC3612a;
import y3.C3614c;

/* JADX INFO: renamed from: s2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3320d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f32241a = AbstractC3320d.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f32242b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f32243c = false;

    public static C1533t a() {
        return b().j();
    }

    public static y b() {
        return y.l();
    }

    public static void c(Context context, C1534u c1534u, C3318b c3318b) {
        d(context, c1534u, c3318b, true);
    }

    public static void d(Context context, C1534u c1534u, C3318b c3318b, boolean z10) {
        if (C2768b.d()) {
            C2768b.a("Fresco#initialize");
        }
        if (f32243c) {
            AbstractC2325a.E(f32241a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f32243c = true;
        }
        z.b(z10);
        if (!AbstractC3612a.c()) {
            if (C2768b.d()) {
                C2768b.a("Fresco.initialize->SoLoader.init");
            }
            try {
                try {
                    try {
                        Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
                    } catch (IllegalAccessException unused) {
                        AbstractC3612a.b(new C3614c());
                        if (C2768b.d()) {
                        }
                    } catch (InvocationTargetException unused2) {
                        AbstractC3612a.b(new C3614c());
                        if (C2768b.d()) {
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                    AbstractC3612a.b(new C3614c());
                    if (C2768b.d()) {
                    }
                } catch (NoSuchMethodException unused4) {
                    AbstractC3612a.b(new C3614c());
                    if (C2768b.d()) {
                    }
                }
                if (C2768b.d()) {
                    C2768b.b();
                }
            } catch (Throwable th) {
                if (C2768b.d()) {
                    C2768b.b();
                }
                throw th;
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (c1534u == null) {
            y.t(applicationContext);
        } else {
            y.s(c1534u);
        }
        e(applicationContext, c3318b);
        if (C2768b.d()) {
            C2768b.b();
        }
    }

    private static void e(Context context, C3318b c3318b) {
        if (C2768b.d()) {
            C2768b.a("Fresco.initializeDrawee");
        }
        g gVar = new g(context, c3318b);
        f32242b = gVar;
        com.facebook.drawee.view.e.c(gVar);
        if (C2768b.d()) {
            C2768b.b();
        }
    }

    public static f f() {
        return f32242b.get();
    }
}
