package expo.modules.kotlin.views;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.CoreLoggerKt;
import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.events.KModuleEventEmitterWrapperKt;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.OnViewDidUpdatePropsException;
import expo.modules.kotlin.exception.UnexpectedException;
import i7.C2735B;
import i7.t;
import j7.K;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0012J\u0019\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010,\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b+\u0010&R\u001d\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0\u00198F¢\u0006\u0006\u001a\u0004\b.\u0010\u001b¨\u00060"}, d2 = {"Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/ModuleHolder;", "moduleHolder", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "definition", PointerEventHelper.POINTER_TYPE_UNKNOWN, "delegateName", "<init>", "(Lexpo/modules/kotlin/ModuleHolder;Lexpo/modules/kotlin/views/ViewManagerDefinition;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "Landroid/view/View;", "createView", "(Landroid/content/Context;)Landroid/view/View;", "view", "Li7/B;", "onViewDidUpdateProps", "(Landroid/view/View;)V", "Lcom/facebook/react/bridge/ReadableMap;", "propsMap", PointerEventHelper.POINTER_TYPE_UNKNOWN, "updateProperties", "(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)Ljava/util/List;", "onDestroy", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lexpo/modules/kotlin/ModuleHolder;", "getModuleHolder$expo_modules_core_release", "()Lexpo/modules/kotlin/ModuleHolder;", "setModuleHolder$expo_modules_core_release", "(Lexpo/modules/kotlin/ModuleHolder;)V", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "getDefinition$expo_modules_core_release", "()Lexpo/modules/kotlin/views/ViewManagerDefinition;", "Ljava/lang/String;", "getDelegateName$expo_modules_core_release", "()Ljava/lang/String;", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "getViewGroupDefinition$expo_modules_core_release", "()Lexpo/modules/kotlin/views/ViewGroupDefinition;", "viewGroupDefinition", "getName", "name", "Lexpo/modules/kotlin/views/AnyViewProp;", "getProps", "props", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewManagerWrapperDelegate {
    private final ViewManagerDefinition definition;
    private final String delegateName;
    private ModuleHolder<?> moduleHolder;

    public ViewManagerWrapperDelegate(ModuleHolder<?> moduleHolder, ViewManagerDefinition definition, String str) {
        AbstractC2855l.g(moduleHolder, "moduleHolder");
        AbstractC2855l.g(definition, "definition");
        this.moduleHolder = moduleHolder;
        this.definition = definition;
        this.delegateName = str;
    }

    public final View createView(Context context) {
        AbstractC2855l.g(context, "context");
        return this.definition.createView(context, this.moduleHolder.getModule().getAppContext());
    }

    /* JADX INFO: renamed from: getDefinition$expo_modules_core_release, reason: from getter */
    public final ViewManagerDefinition getDefinition() {
        return this.definition;
    }

    /* JADX INFO: renamed from: getDelegateName$expo_modules_core_release, reason: from getter */
    public final String getDelegateName() {
        return this.delegateName;
    }

    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        String[] names;
        Map mapC = K.c();
        CallbacksDefinition callbacksDefinition = this.definition.getCallbacksDefinition();
        if (callbacksDefinition != null && (names = callbacksDefinition.getNames()) != null) {
            for (String str : names) {
                mapC.put(KModuleEventEmitterWrapperKt.normalizeEventName(str), K.f(t.a("registrationName", str)));
            }
        }
        return K.b(mapC);
    }

    public final ModuleHolder<?> getModuleHolder$expo_modules_core_release() {
        return this.moduleHolder;
    }

    public final String getName() {
        String str = this.delegateName;
        if (str != null) {
            return str;
        }
        return this.moduleHolder.getName() + "_" + this.definition.getName();
    }

    public final Map<String, AnyViewProp> getProps() {
        return this.definition.getProps$expo_modules_core_release();
    }

    public final ViewGroupDefinition getViewGroupDefinition$expo_modules_core_release() {
        return this.definition.getViewGroupDefinition();
    }

    public final void onDestroy(View view) {
        CodedException unexpectedException;
        CodedException codedException;
        AbstractC2855l.g(view, "view");
        try {
            Function1 onViewDestroys = this.definition.getOnViewDestroys();
            if (onViewDestroys != null) {
                onViewDestroys.invoke(view);
            }
        } catch (Throwable th) {
            if (ErrorViewKt.isErrorView(view)) {
                return;
            }
            if (th instanceof CodedException) {
                codedException = (CodedException) th;
            } else {
                if (th instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) th;
                    String code = codedException2.getCode();
                    AbstractC2855l.f(code, "getCode(...)");
                    unexpectedException = new CodedException(code, codedException2.getMessage(), codedException2.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th);
                }
                codedException = unexpectedException;
            }
            CoreLoggerKt.getLogger().error("❌ '" + view + "' wasn't able to destroy itself", codedException);
            this.definition.handleException(view, codedException);
        }
    }

    public final void onViewDidUpdateProps(View view) {
        CodedException unexpectedException;
        CodedException unexpectedException2;
        AbstractC2855l.g(view, "view");
        Function1 onViewDidUpdateProps = this.definition.getOnViewDidUpdateProps();
        if (onViewDidUpdateProps != null) {
            try {
                onViewDidUpdateProps.invoke(view);
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                try {
                    if (th instanceof CodedException) {
                        unexpectedException2 = (CodedException) th;
                    } else if (th instanceof expo.modules.core.errors.CodedException) {
                        String code = ((expo.modules.core.errors.CodedException) th).getCode();
                        AbstractC2855l.f(code, "getCode(...)");
                        unexpectedException2 = new CodedException(code, ((expo.modules.core.errors.CodedException) th).getMessage(), ((expo.modules.core.errors.CodedException) th).getCause());
                    } else {
                        unexpectedException2 = new UnexpectedException(th);
                    }
                    throw new OnViewDidUpdatePropsException(AbstractC3430a.e(view.getClass()), unexpectedException2);
                } catch (Throwable th2) {
                    if (ErrorViewKt.isErrorView(view)) {
                        return;
                    }
                    if (th2 instanceof CodedException) {
                        unexpectedException = (CodedException) th2;
                    } else if (th2 instanceof expo.modules.core.errors.CodedException) {
                        expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th2;
                        String code2 = codedException.getCode();
                        AbstractC2855l.f(code2, "getCode(...)");
                        unexpectedException = new CodedException(code2, codedException.getMessage(), codedException.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(th2);
                    }
                    CoreLoggerKt.getLogger().error("❌ Error occurred when invoking 'onViewDidUpdateProps' on '" + view.getClass().getSimpleName() + "'", unexpectedException);
                    this.definition.handleException(view, unexpectedException);
                }
            }
        }
    }

    public final void setModuleHolder$expo_modules_core_release(ModuleHolder<?> moduleHolder) {
        AbstractC2855l.g(moduleHolder, "<set-?>");
        this.moduleHolder = moduleHolder;
    }

    public final List<String> updateProperties(View view, ReadableMap propsMap) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(propsMap, "propsMap");
        Map<String, AnyViewProp> props = getProps();
        ArrayList arrayList = new ArrayList();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = propsMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            AnyViewProp anyViewProp = props.get(strNextKey);
            if (anyViewProp != null) {
                try {
                    anyViewProp.set(propsMap.getDynamic(strNextKey), view, this.moduleHolder.getModule().getAppContext());
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        return arrayList;
    }

    public /* synthetic */ ViewManagerWrapperDelegate(ModuleHolder moduleHolder, ViewManagerDefinition viewManagerDefinition, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(moduleHolder, viewManagerDefinition, (i10 & 4) != 0 ? null : str);
    }
}
