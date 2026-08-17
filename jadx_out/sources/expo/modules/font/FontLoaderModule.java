package expo.modules.font;

import C7.d;
import P8.l;
import P8.o;
import P8.q;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lexpo/modules/font/FontLoaderModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "queryCustomNativeFonts", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-font_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FontLoaderModule extends Module {
    private final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> queryCustomNativeFonts() throws IOException {
        List listB;
        AssetManager assets = getContext().getAssets();
        o oVar = new o("^(.+?)(_bold|_italic|_bold_italic)?\\.(ttf|otf)$");
        String[] list = assets.list("fonts/");
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : list) {
                AbstractC2855l.d(str);
                l lVarB = o.b(oVar, str, 0, 2, null);
                String str2 = (lVarB == null || (listB = lVarB.b()) == null) ? null : (String) listB.get(1);
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (!q.f0((String) obj)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList == null ? AbstractC2800q.j() : arrayList;
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            final C c10 = new C();
            c10.f29371g = queryCustomNativeFonts();
            moduleDefinitionBuilder.Name("ExpoFontLoader");
            AnyType[] anyTypeArr = new AnyType[0];
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Object.class));
            if (returnType == null) {
                returnType = new ReturnType(D.b(Object.class));
                returnTypeProvider.getTypes().put(D.b(Object.class), returnType);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("getLoadedFonts", new SyncFunctionComponent("getLoadedFonts", anyTypeArr, returnType, new Function1() { // from class: expo.modules.font.FontLoaderModule$definition$lambda$4$$inlined$FunctionWithoutArgs$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return c10.f29371g;
                }
            }));
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = D.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.font.FontLoaderModule$definition$lambda$4$$inlined$AsyncFunction$1
                    @Override // w7.InterfaceC3487a
                    public final C7.o invoke() {
                        return D.o(String.class);
                    }
                }), converters);
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.font.FontLoaderModule$definition$lambda$4$$inlined$AsyncFunction$2
                    @Override // w7.InterfaceC3487a
                    public final C7.o invoke() {
                        return D.o(String.class);
                    }
                }), converters);
            }
            AnyType[] anyTypeArr2 = {anyType, anyType2};
            Function1 function1 = new Function1() { // from class: expo.modules.font.FontLoaderModule$definition$lambda$4$$inlined$AsyncFunction$3
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] objArr) throws CodedException {
                    Typeface typefaceCreateFromFile;
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    String str = (String) objArr[1];
                    String str2 = (String) obj;
                    Context reactContext = this.this$0.getAppContext().getReactContext();
                    if (reactContext == null) {
                        throw new Exceptions.ReactContextLost();
                    }
                    if (q.K(str, "asset://", false, 2, null)) {
                        AssetManager assets = reactContext.getAssets();
                        String strSubstring = str.substring(9);
                        AbstractC2855l.f(strSubstring, "substring(...)");
                        typefaceCreateFromFile = Typeface.createFromAsset(assets, strSubstring);
                        AbstractC2855l.d(typefaceCreateFromFile);
                    } else {
                        String path = Uri.parse(str).getPath();
                        if (path == null) {
                            throw new FileNotFoundException(str);
                        }
                        File file = new File(path);
                        if (file.length() == 0) {
                            throw new CodedException("Font file for " + str2 + " is empty. Make sure the local file path is correctly populated.", null, 2, null);
                        }
                        typefaceCreateFromFile = Typeface.createFromFile(file);
                        AbstractC2855l.d(typefaceCreateFromFile);
                    }
                    ReactFontManager.INSTANCE.getInstance().setTypeface(str2, 0, typefaceCreateFromFile);
                    C c11 = c10;
                    Set setS0 = AbstractC2800q.S0((Iterable) c11.f29371g);
                    setS0.add(str2);
                    c11.f29371g = AbstractC2800q.P0(setS0);
                    return C2735B.f28704a;
                }
            };
            moduleDefinitionBuilder.getAsyncFunctions().put("loadAsync", AbstractC2855l.b(C2735B.class, Integer.TYPE) ? new IntAsyncFunctionComponent("loadAsync", anyTypeArr2, function1) : AbstractC2855l.b(C2735B.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("loadAsync", anyTypeArr2, function1) : AbstractC2855l.b(C2735B.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("loadAsync", anyTypeArr2, function1) : AbstractC2855l.b(C2735B.class, Float.TYPE) ? new FloatAsyncFunctionComponent("loadAsync", anyTypeArr2, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("loadAsync", anyTypeArr2, function1) : new UntypedAsyncFunctionComponent("loadAsync", anyTypeArr2, function1));
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
