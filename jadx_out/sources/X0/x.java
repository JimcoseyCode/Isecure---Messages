package x0;

import E0.h;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import w0.AbstractC3458e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class x extends C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f33255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Constructor f33256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f33257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f33258e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        f33256c = constructor;
        f33255b = cls;
        f33257d = method2;
        f33258e = method;
    }

    x() {
    }

    private static boolean i(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f33257d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface j(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f33255b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f33258e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean k() {
        return f33257d != null;
    }

    private static Object l() {
        try {
            return f33256c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // x0.C
    public Typeface a(Context context, AbstractC3458e.c cVar, Resources resources, int i10) {
        Object objL = l();
        if (objL == null) {
            return null;
        }
        for (AbstractC3458e.d dVar : cVar.a()) {
            ByteBuffer byteBufferB = D.b(context, resources, dVar.b());
            if (byteBufferB == null || !i(objL, byteBufferB, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return j(objL);
    }

    @Override // x0.C
    public Typeface b(Context context, CancellationSignal cancellationSignal, h.b[] bVarArr, int i10) {
        Object objL = l();
        if (objL == null) {
            return null;
        }
        m0.i iVar = new m0.i();
        for (h.b bVar : bVarArr) {
            Uri uriE = bVar.e();
            ByteBuffer byteBufferF = (ByteBuffer) iVar.get(uriE);
            if (byteBufferF == null) {
                byteBufferF = D.f(context, cancellationSignal, uriE);
                iVar.put(uriE, byteBufferF);
            }
            if (byteBufferF == null || !i(objL, byteBufferF, bVar.d(), bVar.g(), bVar.h())) {
                return null;
            }
        }
        Typeface typefaceJ = j(objL);
        if (typefaceJ == null) {
            return null;
        }
        return Typeface.create(typefaceJ, i10);
    }
}
