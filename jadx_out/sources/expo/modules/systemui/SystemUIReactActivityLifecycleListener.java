package expo.modules.systemui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import expo.modules.systemui.singletons.SystemUI;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/systemui/SystemUIReactActivityLifecycleListener;", "Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;", "<init>", "()V", "Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getUserInterfaceStyle", "(Landroid/content/Context;)Ljava/lang/String;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Li7/B;", "onCreate", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "expo-system-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SystemUIReactActivityLifecycleListener implements ReactActivityLifecycleListener {
    private final String getUserInterfaceStyle(Context context) {
        String string = context.getString(R.string.expo_system_ui_user_interface_style);
        AbstractC2855l.f(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        AbstractC2855l.f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // expo.modules.core.interfaces.ReactActivityLifecycleListener
    public void onCreate(Activity activity, Bundle savedInstanceState) {
        AbstractC2855l.g(activity, "activity");
        SystemUI.setUserInterfaceStyle(getUserInterfaceStyle(activity));
    }
}
