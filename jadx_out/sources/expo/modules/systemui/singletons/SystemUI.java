package expo.modules.systemui.singletons;

import android.os.Build;
import androidx.appcompat.app.g;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.systemui.singletons.SystemUI;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/systemui/singletons/SystemUI;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "style", "Lkotlin/Function0;", "Li7/B;", "successCallback", "Lkotlin/Function1;", "failureCallback", "setUserInterfaceStyle", "(Ljava/lang/String;Lw7/a;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "expo-system-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SystemUI {
    public static final SystemUI INSTANCE = new SystemUI();
    private static final String TAG = "SystemUI";

    private SystemUI() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r4.equals("light") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r4.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_TYPE_UNKNOWN) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        r0 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setUserInterfaceStyle(String style, InterfaceC3487a successCallback, Function1 failureCallback) {
        int i10 = -1;
        if (style != null) {
            int iHashCode = style.hashCode();
            if (iHashCode != 0) {
                if (iHashCode == 3075958) {
                    if (style.equals("dark")) {
                        i10 = 2;
                    }
                    failureCallback.invoke("Invalid user interface style: \"" + style + "\"");
                    return;
                }
                if (iHashCode != 102970646) {
                    if (iHashCode == 1673671211 && style.equals("automatic")) {
                        if (Build.VERSION.SDK_INT < 28) {
                            i10 = 3;
                        }
                    }
                }
                failureCallback.invoke("Invalid user interface style: \"" + style + "\"");
                return;
            }
        }
        g.M(i10);
        successCallback.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B setUserInterfaceStyle$lambda$1(String m10) {
        AbstractC2855l.g(m10, "m");
        return C2735B.f28704a;
    }

    public static final void setUserInterfaceStyle(String style) {
        AbstractC2855l.g(style, "style");
        INSTANCE.setUserInterfaceStyle(style, new InterfaceC3487a() { // from class: f7.a
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return C2735B.f28704a;
            }
        }, new Function1() { // from class: f7.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SystemUI.setUserInterfaceStyle$lambda$1((String) obj);
            }
        });
    }
}
