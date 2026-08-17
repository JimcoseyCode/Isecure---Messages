package expo.modules.kotlin.viewevent;

import C7.k;
import android.view.View;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a<\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0086\n¢\u0006\u0004\b\u0007\u0010\b\u001aI\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\t2\"\b\n\u0010\r\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aa\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00100\u0001*\u00020\t2:\b\u0002\u0010\r\u001a4\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u0010\u0018\u0001`\fH\u0007¢\u0006\u0004\b\u0012\u0010\u000f*(\u0010\u0013\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n2\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"T", "Lexpo/modules/kotlin/viewevent/ViewEventDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "thisObj", "LC7/k;", "property", "Lexpo/modules/kotlin/viewevent/ViewEventCallback;", "getValue", "(Lexpo/modules/kotlin/viewevent/ViewEventDelegate;Ljava/lang/Object;LC7/k;)Lexpo/modules/kotlin/viewevent/ViewEventCallback;", "Landroid/view/View;", "Lkotlin/Function1;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/viewevent/CoalescingKey;", "coalescingKey", "EventDispatcher", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/viewevent/ViewEventDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "MapEventDispatcher", "CoalescingKey", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ViewEventDelegateKt {
    public static final /* synthetic */ <T> ViewEventDelegate<T> EventDispatcher(View view, Function1 function1) {
        AbstractC2855l.g(view, "<this>");
        return new ViewEventDelegate<>(view, function1);
    }

    public static /* synthetic */ ViewEventDelegate EventDispatcher$default(View view, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        AbstractC2855l.g(view, "<this>");
        return new ViewEventDelegate(view, function1);
    }

    public static final ViewEventDelegate<Map<String, Object>> MapEventDispatcher(View view, Function1 function1) {
        AbstractC2855l.g(view, "<this>");
        return new ViewEventDelegate<>(view, function1);
    }

    public static /* synthetic */ ViewEventDelegate MapEventDispatcher$default(View view, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        return MapEventDispatcher(view, function1);
    }

    public static final <T> ViewEventCallback<T> getValue(ViewEventDelegate<T> viewEventDelegate, Object obj, k property) {
        AbstractC2855l.g(viewEventDelegate, "<this>");
        AbstractC2855l.g(property, "property");
        return viewEventDelegate.getValue(property);
    }
}
