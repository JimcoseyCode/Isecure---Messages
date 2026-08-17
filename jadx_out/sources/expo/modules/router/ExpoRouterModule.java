package expo.modules.router;

import C7.o;
import Q4.a;
import Q4.j;
import android.content.Context;
import android.graphics.Color;
import androidx.appcompat.view.d;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import f.AbstractC2568a;
import i7.t;
import j7.K;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000bH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lexpo/modules/router/ExpoRouterModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "materialColor", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "scheme", "dynamicColor", "getColorFromTheme", "themeResId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getSystemScheme", "Companion", "expo-router_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoRouterModule extends Module {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, Integer> attrMap = K.l(t.a("primary", Integer.valueOf(AbstractC2568a.f26751w)), t.a("onprimary", Integer.valueOf(a.f9148j)), t.a("primarycontainer", Integer.valueOf(a.f9091A)), t.a("onprimarycontainer", Integer.valueOf(a.f9150k)), t.a("primaryinverse", Integer.valueOf(a.f9097D)), t.a("primaryfixed", Integer.valueOf(a.f9093B)), t.a("primaryfixeddim", Integer.valueOf(a.f9095C)), t.a("onprimaryfixed", Integer.valueOf(a.f9152l)), t.a("onprimaryfixedvariant", Integer.valueOf(a.f9154m)), t.a("secondary", Integer.valueOf(a.f9101F)), t.a("onsecondary", Integer.valueOf(a.f9156n)), t.a("secondarycontainer", Integer.valueOf(a.f9103G)), t.a("onsecondarycontainer", Integer.valueOf(a.f9158o)), t.a("secondaryfixed", Integer.valueOf(a.f9105H)), t.a("secondaryfixeddim", Integer.valueOf(a.f9107I)), t.a("onsecondaryfixed", Integer.valueOf(a.f9160p)), t.a("onsecondaryfixedvariant", Integer.valueOf(a.f9162q)), t.a("tertiary", Integer.valueOf(a.f9123T)), t.a("ontertiary", Integer.valueOf(a.f9170u)), t.a("tertiarycontainer", Integer.valueOf(a.f9124U)), t.a("ontertiarycontainer", Integer.valueOf(a.f9172v)), t.a("tertiaryfixed", Integer.valueOf(a.f9125V)), t.a("tertiaryfixeddim", Integer.valueOf(a.f9126W)), t.a("ontertiaryfixed", Integer.valueOf(a.f9174w)), t.a("ontertiaryfixedvariant", Integer.valueOf(a.f9176x)), t.a("error", Integer.valueOf(AbstractC2568a.f26750v)), t.a("onerror", Integer.valueOf(a.f9144h)), t.a("errorcontainer", Integer.valueOf(a.f9140f)), t.a("onerrorcontainer", Integer.valueOf(a.f9146i)), t.a("outline", Integer.valueOf(a.f9178y)), t.a("outlinevariant", Integer.valueOf(a.f9180z)), t.a(AppStateModule.APP_STATE_BACKGROUND, Integer.valueOf(android.R.attr.colorBackground)), t.a("onbackground", Integer.valueOf(a.f9142g)), t.a("surface", Integer.valueOf(a.f9109J)), t.a("onsurface", Integer.valueOf(a.f9164r)), t.a("surfacevariant", Integer.valueOf(a.f9122S)), t.a("onsurfacevariant", Integer.valueOf(a.f9168t)), t.a("surfaceinverse", Integer.valueOf(a.f9121R)), t.a("onsurfaceinverse", Integer.valueOf(a.f9166s)), t.a("surfacebright", Integer.valueOf(a.f9111K)), t.a("surfacedim", Integer.valueOf(a.f9120Q)), t.a("surfacecontainer", Integer.valueOf(a.f9113L)), t.a("surfacecontainerlow", Integer.valueOf(a.f9118O)), t.a("surfacecontainerlowest", Integer.valueOf(a.f9119P)), t.a("surfacecontainerhigh", Integer.valueOf(a.f9115M)), t.a("surfacecontainerhighest", Integer.valueOf(a.f9117N)));

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/router/ExpoRouterModule$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "colorToHex", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.COLOR, PointerEventHelper.POINTER_TYPE_UNKNOWN, "attrMap", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getAttrMap", "()Ljava/util/Map;", "expo-router_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

        public final Map<String, Integer> getAttrMap() {
            return ExpoRouterModule.attrMap;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String dynamicColor(String name, String scheme) {
        if (!AbstractC2855l.b(scheme, "dark") && !AbstractC2855l.b(scheme, "light")) {
            scheme = getSystemScheme();
        }
        return getColorFromTheme(name, AbstractC2855l.b(scheme, "dark") ? j.f9408g : j.f9409h);
    }

    private final String getColorFromTheme(String name, int themeResId) {
        Integer numF;
        d dVar = new d(getContext(), themeResId);
        Map<String, Integer> map = attrMap;
        String lowerCase = name.toLowerCase(Locale.ROOT);
        AbstractC2855l.f(lowerCase, "toLowerCase(...)");
        Integer num = map.get(lowerCase);
        if (num == null || (numF = X4.a.f(dVar, num.intValue())) == null) {
            return null;
        }
        return INSTANCE.colorToHex(numF.intValue());
    }

    private final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    private final String getSystemScheme() {
        int i10 = getContext().getResources().getConfiguration().uiMode & 48;
        return (i10 == 16 || i10 != 32) ? "light" : "dark";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String materialColor(String name, String scheme) {
        if (!AbstractC2855l.b(scheme, "dark") && !AbstractC2855l.b(scheme, "light")) {
            scheme = getSystemScheme();
        }
        return getColorFromTheme(name, AbstractC2855l.b(scheme, "dark") ? j.f9405d : j.f9410i);
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoRouter");
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            C7.d dVarB = D.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.router.ExpoRouterModule$definition$lambda$2$$inlined$Function$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters);
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.router.ExpoRouterModule$definition$lambda$2$$inlined$Function$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters);
            }
            AnyType[] anyTypeArr = {anyType, anyType2};
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(D.b(String.class));
            if (returnType == null) {
                returnType = new ReturnType(D.b(String.class));
                returnTypeProvider.getTypes().put(D.b(String.class), returnType);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("Material3Color", new SyncFunctionComponent("Material3Color", anyTypeArr, returnType, new Function1() { // from class: expo.modules.router.ExpoRouterModule$definition$lambda$2$$inlined$Function$3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    String str = (String) objArr[1];
                    return this.this$0.materialColor((String) obj, str);
                }
            }));
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.router.ExpoRouterModule$definition$lambda$2$$inlined$Function$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters2);
            }
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.router.ExpoRouterModule$definition$lambda$2$$inlined$Function$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters2);
            }
            AnyType[] anyTypeArr2 = {anyType3, anyType4};
            ReturnType returnType2 = returnTypeProvider.getTypes().get(D.b(String.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(D.b(String.class));
                returnTypeProvider.getTypes().put(D.b(String.class), returnType2);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("Material3DynamicColor", new SyncFunctionComponent("Material3DynamicColor", anyTypeArr2, returnType2, new Function1() { // from class: expo.modules.router.ExpoRouterModule$definition$lambda$2$$inlined$Function$6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    String str = (String) objArr[1];
                    return this.this$0.dynamicColor((String) obj, str);
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
