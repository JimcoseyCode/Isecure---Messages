package expo.modules.systemui;

import C7.o;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.g;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.Queues;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.systemui.SystemUIModule;
import i7.C2735B;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lexpo/modules/systemui/SystemUIModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.COLOR, "Li7/B;", "setBackgroundColor", "(I)V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs", "getSystemBackgroundColor", "()I", "systemBackgroundColor", "Companion", "expo-system-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SystemUIModule extends Module {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/systemui/SystemUIModule$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "colorToHex", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.COLOR, PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-system-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String colorToHex(int color) {
            H h10 = H.f29375a;
            String str = String.format("#%02x%02x%02x", Arrays.copyOf(new Object[]{Integer.valueOf(Color.red(color)), Integer.valueOf(Color.green(color)), Integer.valueOf(Color.blue(color))}, 3));
            AbstractC2855l.f(str, "format(...)");
            return str;
        }

        private Companion() {
        }
    }

    private final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getPrefs() throws Exceptions.ReactContextLost {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("expo_ui_preferences", 0);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSystemBackgroundColor() {
        int iO = g.o();
        if (iO != -1) {
            return (iO == 1 || iO != 2) ? -1 : -16777216;
        }
        int i10 = getContext().getResources().getConfiguration().uiMode & 48;
        return (i10 == 16 || i10 != 32) ? -1 : -16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBackgroundColor(int color) {
        Window window = getAppContext().getThrowingActivity().getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        int color2 = Color.parseColor(INSTANCE.colorToHex(color));
        if (decorView != null) {
            decorView.setBackgroundColor(color2);
        }
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent intAsyncFunctionComponent;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoSystemUI");
            if (AbstractC2855l.b(Integer.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("setBackgroundColorAsync", new AnyType[0], new Function2() { // from class: expo.modules.systemui.SystemUIModule$definition$lambda$3$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        Integer num = (Integer) promise;
                        this.this$0.getPrefs().edit().putInt(SystemUIModuleKt.PREFERENCE_KEY, num.intValue()).apply();
                        this.this$0.setBackgroundColor(num.intValue());
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Integer.class), Boolean.TRUE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(D.b(Integer.class), true, new InterfaceC3487a() { // from class: expo.modules.systemui.SystemUIModule$definition$lambda$3$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.f(Integer.class);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr = {anyType};
                Function1 function1 = new Function1() { // from class: expo.modules.systemui.SystemUIModule$definition$lambda$3$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Integer num = (Integer) objArr[0];
                        if (num != null) {
                            this.this$0.getPrefs().edit().putInt(SystemUIModuleKt.PREFERENCE_KEY, num.intValue()).apply();
                        } else {
                            this.this$0.getPrefs().edit().remove(SystemUIModuleKt.PREFERENCE_KEY).apply();
                        }
                        SystemUIModule systemUIModule = this.this$0;
                        systemUIModule.setBackgroundColor(num != null ? num.intValue() : systemUIModule.getSystemBackgroundColor());
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, Integer.TYPE) ? new IntAsyncFunctionComponent("setBackgroundColorAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("setBackgroundColorAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("setBackgroundColorAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Float.TYPE) ? new FloatAsyncFunctionComponent("setBackgroundColorAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("setBackgroundColorAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("setBackgroundColorAsync", anyTypeArr, function1);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("setBackgroundColorAsync", intAsyncFunctionComponent);
            intAsyncFunctionComponent.runOnQueue(Queues.MAIN);
            moduleDefinitionBuilder.getAsyncFunctions().put("getBackgroundColorAsync", new UntypedAsyncFunctionComponent("getBackgroundColorAsync", new AnyType[0], new Function1() { // from class: expo.modules.systemui.SystemUIModule$definition$lambda$3$$inlined$AsyncFunction$4
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    Drawable background = this.this$0.getAppContext().getThrowingActivity().getWindow().getDecorView().getBackground();
                    if (!(background instanceof ColorDrawable)) {
                        return null;
                    }
                    SystemUIModule.Companion companion = SystemUIModule.INSTANCE;
                    Drawable drawableMutate = ((ColorDrawable) background).mutate();
                    AbstractC2855l.e(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                    return companion.colorToHex(((ColorDrawable) drawableMutate).getColor());
                }
            }));
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
