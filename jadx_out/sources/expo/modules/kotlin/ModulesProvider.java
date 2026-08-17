package expo.modules.kotlin;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.services.Service;
import j7.AbstractC2800q;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0018\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H&J\u0016\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\u00040\bH\u0016¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/ModulesProvider;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getModulesMap", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Ljava/lang/Class;", "Lexpo/modules/kotlin/modules/Module;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getServices", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/services/Service;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ModulesProvider {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static List<Class<? extends Service>> getServices(ModulesProvider modulesProvider) {
            return AbstractC2800q.j();
        }
    }

    Map<Class<? extends Module>, String> getModulesMap();

    List<Class<? extends Service>> getServices();
}
