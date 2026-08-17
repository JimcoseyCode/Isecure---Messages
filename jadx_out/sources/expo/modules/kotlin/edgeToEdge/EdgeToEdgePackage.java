package expo.modules.kotlin.edgeToEdge;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.view.WindowUtilKt;
import expo.modules.core.BasePackage;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import j7.AbstractC2800q;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lexpo/modules/kotlin/edgeToEdge/EdgeToEdgePackage;", "Lexpo/modules/core/BasePackage;", "<init>", "()V", "createReactActivityLifecycleListeners", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;", "activityContext", "Landroid/content/Context;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EdgeToEdgePackage extends BasePackage {
    @Override // expo.modules.core.BasePackage, expo.modules.core.interfaces.Package
    public List<ReactActivityLifecycleListener> createReactActivityLifecycleListeners(Context activityContext) {
        return AbstractC2800q.e(new ReactActivityLifecycleListener() { // from class: expo.modules.kotlin.edgeToEdge.EdgeToEdgePackage.createReactActivityLifecycleListeners.1
            @Override // expo.modules.core.interfaces.ReactActivityLifecycleListener
            public void onCreate(Activity activity, Bundle savedInstanceState) {
                Object objB;
                Object objB2;
                Object obj = null;
                try {
                    C2752o.a aVar = C2752o.f28721h;
                    int i10 = WindowUtilKt.f20642a;
                    Class[] clsArr = (Class[]) new ArrayList(0).toArray(new Class[0]);
                    Object[] array = new ArrayList(0).toArray(new Object[0]);
                    Method declaredMethod = WindowUtilKt.class.getDeclaredMethod("isEdgeToEdgeFeatureFlagOn", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(null, Arrays.copyOf(array, array.length));
                    if (!(objInvoke instanceof Boolean)) {
                        objInvoke = null;
                    }
                    objB = C2752o.b((Boolean) objInvoke);
                } catch (Throwable th) {
                    C2752o.a aVar2 = C2752o.f28721h;
                    objB = C2752o.b(AbstractC2753p.a(th));
                }
                C2752o.d(objB);
                if (C2752o.f(objB)) {
                    objB = null;
                }
                Boolean bool = (Boolean) objB;
                if (bool != null ? bool.booleanValue() : true) {
                    Pair[] pairArr = {new Pair(Window.class, activity != null ? activity.getWindow() : null)};
                    try {
                        int i11 = WindowUtilKt.f20642a;
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add((Class) pairArr[0].c());
                        Class[] clsArr2 = (Class[]) arrayList.toArray(new Class[0]);
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(pairArr[0].d());
                        Object[] array2 = arrayList2.toArray(new Object[0]);
                        Method declaredMethod2 = WindowUtilKt.class.getDeclaredMethod("enableEdgeToEdge", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                        declaredMethod2.setAccessible(true);
                        Object objInvoke2 = declaredMethod2.invoke(null, Arrays.copyOf(array2, array2.length));
                        if (objInvoke2 instanceof C2735B) {
                            obj = objInvoke2;
                        }
                        objB2 = C2752o.b((C2735B) obj);
                    } catch (Throwable th2) {
                        C2752o.a aVar3 = C2752o.f28721h;
                        objB2 = C2752o.b(AbstractC2753p.a(th2));
                    }
                    C2752o.d(objB2);
                    C2752o.f(objB2);
                    if (activity != null) {
                        EdgeToEdgePackageKt.enforceNavigationBarContrastFromTheme(activity);
                    }
                }
            }
        });
    }
}
