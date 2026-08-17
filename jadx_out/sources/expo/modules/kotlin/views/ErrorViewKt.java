package expo.modules.kotlin.views;

import android.view.View;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isErrorView", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/view/View;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ErrorViewKt {
    public static final boolean isErrorView(View view) {
        AbstractC2855l.g(view, "<this>");
        return (view instanceof ErrorView) || (view instanceof ErrorGroupView);
    }
}
