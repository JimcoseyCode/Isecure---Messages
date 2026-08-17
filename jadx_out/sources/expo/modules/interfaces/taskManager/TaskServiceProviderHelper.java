package expo.modules.interfaces.taskManager;

import android.content.Context;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.ExpoModulesPackageList;
import expo.modules.core.ModulePriorities;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.core.interfaces.Package;
import j7.AbstractC2800q;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l7.AbstractC2884a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/interfaces/taskManager/TaskServiceProviderHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "getTaskServiceImpl", "Lexpo/modules/interfaces/taskManager/TaskServiceInterface;", "context", "Landroid/content/Context;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
public final class TaskServiceProviderHelper {
    public static final TaskServiceProviderHelper INSTANCE = new TaskServiceProviderHelper();

    private TaskServiceProviderHelper() {
    }

    @DoNotStrip
    public final TaskServiceInterface getTaskServiceImpl(Context context) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method method;
        AbstractC2855l.g(context, "context");
        try {
            ExpoModulesPackageList.Companion companion = ExpoModulesPackageList.INSTANCE;
            method = ExpoModulesPackageList.class.getMethod("getPackageList", null);
        } catch (ClassNotFoundException unused) {
        }
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(null, null);
        List list = objInvoke instanceof List ? (List) objInvoke : null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Package) {
                arrayList.add(obj);
            }
        }
        List listH0 = AbstractC2800q.H0(arrayList, new Comparator() { // from class: expo.modules.interfaces.taskManager.TaskServiceProviderHelper$getTaskServiceImpl$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                ModulePriorities modulePriorities = ModulePriorities.INSTANCE;
                return AbstractC2884a.a(Integer.valueOf(modulePriorities.get(D.b(((Package) t11).getClass()).n())), Integer.valueOf(modulePriorities.get(D.b(((Package) t10).getClass()).n())));
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listH0) {
            if (obj2 instanceof TaskServiceProviderInterface) {
                arrayList2.add(obj2);
            }
        }
        TaskServiceProviderInterface taskServiceProviderInterface = (TaskServiceProviderInterface) AbstractC2800q.g0(arrayList2);
        if (taskServiceProviderInterface != null) {
            return taskServiceProviderInterface.getTaskServiceImpl(context);
        }
        return null;
    }
}
