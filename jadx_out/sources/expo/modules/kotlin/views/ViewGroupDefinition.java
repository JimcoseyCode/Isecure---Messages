package expo.modules.kotlin.views;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B³\u0001\u0012&\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002j\u0004\u0018\u0001`\u0007\u0012\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tj\u0004\u0018\u0001`\u000f\u0012 \u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tj\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014R7\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R3\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR1\u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tj\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR1\u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tj\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a¨\u0006 "}, d2 = {"Lexpo/modules/kotlin/views/ViewGroupDefinition;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Function3;", "Landroid/view/ViewGroup;", "Landroid/view/View;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Li7/B;", "Lexpo/modules/kotlin/views/AddViewAction;", "addViewAction", "Lkotlin/Function2;", "Lexpo/modules/kotlin/views/GetChildAtAction;", "getChildAtAction", "Lkotlin/Function1;", "Lexpo/modules/kotlin/views/GetChildCountAction;", "getChildCountAction", "Lexpo/modules/kotlin/views/RemoveViewAction;", "removeViewAction", "Lexpo/modules/kotlin/views/RemoveViewAtAction;", "removeViewAtAction", "<init>", "(Lw7/o;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "Lw7/o;", "getAddViewAction", "()Lw7/o;", "Lkotlin/jvm/functions/Function2;", "getGetChildAtAction", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "getGetChildCountAction", "()Lkotlin/jvm/functions/Function1;", "getRemoveViewAction", "getRemoveViewAtAction", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewGroupDefinition {
    private final o addViewAction;
    private final Function2 getChildAtAction;
    private final Function1 getChildCountAction;
    private final Function2 removeViewAction;
    private final Function2 removeViewAtAction;

    public ViewGroupDefinition(o oVar, Function2 function2, Function1 function1, Function2 function22, Function2 function23) {
        this.addViewAction = oVar;
        this.getChildAtAction = function2;
        this.getChildCountAction = function1;
        this.removeViewAction = function22;
        this.removeViewAtAction = function23;
    }

    public final o getAddViewAction() {
        return this.addViewAction;
    }

    public final Function2 getGetChildAtAction() {
        return this.getChildAtAction;
    }

    public final Function1 getGetChildCountAction() {
        return this.getChildCountAction;
    }

    public final Function2 getRemoveViewAction() {
        return this.removeViewAction;
    }

    public final Function2 getRemoveViewAtAction() {
        return this.removeViewAtAction;
    }
}
