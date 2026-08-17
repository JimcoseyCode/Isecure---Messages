package expo.modules.kotlin.views;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.modules.DefinitionMarker;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJA\u0010\u000f\u001a\u00020\r\"\n\b\u0001\u0010\n\u0018\u0001*\u00020\t2 \b\u0004\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u00020\r2\u0014\b\u0004\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u0015\u001a\u00020\r\"\n\b\u0001\u0010\n\u0018\u0001*\u00020\t2\u001c\b\u0004\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\r2\u001a\b\u0004\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016J;\u0010\u0018\u001a\u00020\r\"\n\b\u0001\u0010\n\u0018\u0001*\u00020\t2\u001a\b\b\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016RH\u0010\u001a\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bj\u0004\u0018\u0001`\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001f\u0010\u0005\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0010RD\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0014j\u0004\u0018\u0001` 8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b!\u0010\"\u0012\u0004\b&\u0010\u0005\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0016R<\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\u0011j\u0004\u0018\u0001`'8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b-\u0010\u0005\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0013RB\u0010/\u001a\u001c\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014j\u0004\u0018\u0001`.8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b/\u0010\"\u0012\u0004\b2\u0010\u0005\u001a\u0004\b0\u0010$\"\u0004\b1\u0010\u0016RB\u00104\u001a\u001c\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014j\u0004\u0018\u0001`38\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b4\u0010\"\u0012\u0004\b7\u0010\u0005\u001a\u0004\b5\u0010$\"\u0004\b6\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00068"}, d2 = {"Lexpo/modules/kotlin/views/ViewGroupDefinitionBuilder;", "Landroid/view/ViewGroup;", "ParentType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "build", "()Lexpo/modules/kotlin/views/ViewGroupDefinition;", "Landroid/view/View;", "ChildViewType", "Lkotlin/Function3;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Li7/B;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "AddChildView", "(Lw7/o;)V", "Lkotlin/Function1;", "GetChildCount", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "GetChildViewAt", "(Lkotlin/jvm/functions/Function2;)V", "RemoveChildViewAt", "RemoveChildView", "Lexpo/modules/kotlin/views/AddViewAction;", "addViewAction", "Lw7/o;", "getAddViewAction", "()Lw7/o;", "setAddViewAction", "getAddViewAction$annotations", "Lexpo/modules/kotlin/views/GetChildAtAction;", "getChildAtAction", "Lkotlin/jvm/functions/Function2;", "getGetChildAtAction", "()Lkotlin/jvm/functions/Function2;", "setGetChildAtAction", "getGetChildAtAction$annotations", "Lexpo/modules/kotlin/views/GetChildCountAction;", "getChildCountAction", "Lkotlin/jvm/functions/Function1;", "getGetChildCountAction", "()Lkotlin/jvm/functions/Function1;", "setGetChildCountAction", "getGetChildCountAction$annotations", "Lexpo/modules/kotlin/views/RemoveViewAction;", "removeViewAction", "getRemoveViewAction", "setRemoveViewAction", "getRemoveViewAction$annotations", "Lexpo/modules/kotlin/views/RemoveViewAtAction;", "removeViewAtAction", "getRemoveViewAtAction", "setRemoveViewAtAction", "getRemoveViewAtAction$annotations", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DefinitionMarker
public final class ViewGroupDefinitionBuilder<ParentType extends ViewGroup> {
    private o addViewAction;
    private Function2 getChildAtAction;
    private Function1 getChildCountAction;
    private Function2 removeViewAction;
    private Function2 removeViewAtAction;

    public final /* synthetic */ <ChildViewType extends View> void AddChildView(final o body) {
        AbstractC2855l.g(body, "body");
        AbstractC2855l.l();
        setAddViewAction(new o() { // from class: expo.modules.kotlin.views.ViewGroupDefinitionBuilder.AddChildView.1
            @Override // w7.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((ViewGroup) obj, (View) obj2, ((Number) obj3).intValue());
                return C2735B.f28704a;
            }

            public final void invoke(ViewGroup parent, View child, int i10) {
                AbstractC2855l.g(parent, "parent");
                AbstractC2855l.g(child, "child");
                o oVar = body;
                AbstractC2855l.m(1, "ChildViewType");
                oVar.invoke(parent, child, Integer.valueOf(i10));
            }
        });
    }

    public final void GetChildCount(final Function1 body) {
        AbstractC2855l.g(body, "body");
        setGetChildCountAction(new Function1() { // from class: expo.modules.kotlin.views.ViewGroupDefinitionBuilder.GetChildCount.1
            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(ViewGroup view) {
                AbstractC2855l.g(view, "view");
                return (Integer) body.invoke(view);
            }
        });
    }

    public final /* synthetic */ <ChildViewType extends View> void GetChildViewAt(final Function2 body) {
        AbstractC2855l.g(body, "body");
        AbstractC2855l.l();
        setGetChildAtAction(new Function2() { // from class: expo.modules.kotlin.views.ViewGroupDefinitionBuilder.GetChildViewAt.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((ViewGroup) obj, ((Number) obj2).intValue());
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroid/view/ViewGroup;I)TChildViewType; */
            /* JADX WARN: Unknown type variable: ChildViewType in type: ChildViewType */
            public final View invoke(ViewGroup view, int i10) {
                AbstractC2855l.g(view, "view");
                return (View) body.invoke(view, Integer.valueOf(i10));
            }
        });
    }

    public final /* synthetic */ <ChildViewType extends View> void RemoveChildView(final Function2 body) {
        AbstractC2855l.g(body, "body");
        AbstractC2855l.l();
        setRemoveViewAction(new Function2() { // from class: expo.modules.kotlin.views.ViewGroupDefinitionBuilder.RemoveChildView.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ViewGroup) obj, (View) obj2);
                return C2735B.f28704a;
            }

            public final void invoke(ViewGroup view, View child) {
                AbstractC2855l.g(view, "view");
                AbstractC2855l.g(child, "child");
                Function2 function2 = body;
                AbstractC2855l.m(1, "ChildViewType");
                function2.invoke(view, child);
            }
        });
    }

    public final void RemoveChildViewAt(final Function2 body) {
        AbstractC2855l.g(body, "body");
        setRemoveViewAtAction(new Function2() { // from class: expo.modules.kotlin.views.ViewGroupDefinitionBuilder.RemoveChildViewAt.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ViewGroup) obj, ((Number) obj2).intValue());
                return C2735B.f28704a;
            }

            public final void invoke(ViewGroup view, int i10) {
                AbstractC2855l.g(view, "view");
                body.invoke(view, Integer.valueOf(i10));
            }
        });
    }

    public final ViewGroupDefinition build() {
        return new ViewGroupDefinition(this.addViewAction, this.getChildAtAction, this.getChildCountAction, this.removeViewAction, this.removeViewAtAction);
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

    public final void setAddViewAction(o oVar) {
        this.addViewAction = oVar;
    }

    public final void setGetChildAtAction(Function2 function2) {
        this.getChildAtAction = function2;
    }

    public final void setGetChildCountAction(Function1 function1) {
        this.getChildCountAction = function1;
    }

    public final void setRemoveViewAction(Function2 function2) {
        this.removeViewAction = function2;
    }

    public final void setRemoveViewAtAction(Function2 function2) {
        this.removeViewAtAction = function2;
    }

    public static /* synthetic */ void getAddViewAction$annotations() {
    }

    public static /* synthetic */ void getGetChildAtAction$annotations() {
    }

    public static /* synthetic */ void getGetChildCountAction$annotations() {
    }

    public static /* synthetic */ void getRemoveViewAction$annotations() {
    }

    public static /* synthetic */ void getRemoveViewAtAction$annotations() {
    }
}
