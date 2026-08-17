package expo.modules.kotlin.views;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.t;
import j7.K;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR%\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/kotlin/views/ShadowNodeProxy;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/views/ExpoView;", "expoView", "<init>", "(Lexpo/modules/kotlin/views/ExpoView;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "height", "Li7/B;", "setViewSize", "(DD)V", "setStyleSize", "(Ljava/lang/Double;Ljava/lang/Double;)V", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "weakExpoView", "Ljava/lang/ref/WeakReference;", "getWeakExpoView", "()Ljava/lang/ref/WeakReference;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShadowNodeProxy {
    private final WeakReference<ExpoView> weakExpoView;

    public ShadowNodeProxy(ExpoView expoView) {
        AbstractC2855l.g(expoView, "expoView");
        this.weakExpoView = new WeakReference<>(expoView);
    }

    public final WeakReference<ExpoView> getWeakExpoView() {
        return this.weakExpoView;
    }

    public final void setStyleSize(Double width, Double height) {
        StateWrapper stateWrapper;
        ExpoView expoView = this.weakExpoView.get();
        if (expoView == null || (stateWrapper = expoView.getStateWrapper()) == null) {
            return;
        }
        stateWrapper.updateState(Arguments.makeNativeMap((Map<String, ? extends Object>) K.l(t.a("styleWidth", width), t.a("styleHeight", height))));
    }

    public final void setViewSize(double width, double height) {
        StateWrapper stateWrapper;
        ExpoView expoView = this.weakExpoView.get();
        if (expoView == null || (stateWrapper = expoView.getStateWrapper()) == null) {
            return;
        }
        stateWrapper.updateState(Arguments.makeNativeMap((Map<String, ? extends Object>) K.l(t.a("width", Double.valueOf(width)), t.a("height", Double.valueOf(height)))));
    }
}
