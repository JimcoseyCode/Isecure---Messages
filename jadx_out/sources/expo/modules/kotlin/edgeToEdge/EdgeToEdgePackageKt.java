package expo.modules.kotlin.edgeToEdge;

import android.R;
import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Build;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.view.WindowUtilKt;
import i7.AbstractC2753p;
import i7.C2752o;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0003¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001aZ\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0007\u0018\u00012\u0006\u0010\t\u001a\u00020\b26\u0010\u000e\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b0\n\"\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroid/app/Activity;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getEnforceContrastFromTheme", "(Landroid/app/Activity;)Z", "Li7/B;", "enforceNavigationBarContrastFromTheme", "(Landroid/app/Activity;)V", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "methodName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Pair;", "Ljava/lang/Class;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "args", "invokeWindowUtilKtMethod", "(Ljava/lang/String;[Lkotlin/Pair;)Ljava/lang/Object;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class EdgeToEdgePackageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void enforceNavigationBarContrastFromTheme(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.getWindow().setNavigationBarContrastEnforced(getEnforceContrastFromTheme(activity));
        }
    }

    private static final boolean getEnforceContrastFromTheme(Activity activity) {
        TypedArray typedArrayObtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{R.attr.enforceNavigationBarContrast});
        AbstractC2855l.f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, true);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> T invokeWindowUtilKtMethod(String str, Pair<? extends Class<?>, ? extends Object>... pairArr) {
        Object objB;
        try {
            C2752o.a aVar = C2752o.f28721h;
            int i10 = WindowUtilKt.f20642a;
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<? extends Class<?>, ? extends Object> pair : pairArr) {
                arrayList.add((Class) pair.c());
            }
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair<? extends Class<?>, ? extends Object> pair2 : pairArr) {
                arrayList2.add(pair2.d());
            }
            Object[] array = arrayList2.toArray(new Object[0]);
            Method declaredMethod = WindowUtilKt.class.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, Arrays.copyOf(array, array.length));
            AbstractC2855l.m(2, "T");
            objB = C2752o.b(objInvoke);
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            objB = C2752o.b(AbstractC2753p.a(th));
        }
        C2752o.d(objB);
        if (C2752o.f(objB)) {
            return null;
        }
        return (T) objB;
    }
}
