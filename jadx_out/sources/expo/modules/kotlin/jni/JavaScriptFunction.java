package expo.modules.kotlin.jni;

import C7.o;
import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.types.JSTypeConverterProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverter;
import expo.modules.kotlin.types.TypeConverterProviderImpl;
import i7.C2735B;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0003B\u0011\b\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u000e\u001a\u00028\u00002\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR*\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b#\u0010\u0018\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptFunction;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReturnType", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "thisValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "args", "Lexpo/modules/kotlin/jni/ExpectedType;", "expectedReturnType", "invoke", "(Lexpo/modules/kotlin/jni/JavaScriptObject;[Ljava/lang/Object;Lexpo/modules/kotlin/jni/ExpectedType;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isValid", "()Z", "Lexpo/modules/kotlin/AppContext;", "appContext", "([Ljava/lang/Object;Lexpo/modules/kotlin/jni/JavaScriptObject;Lexpo/modules/kotlin/AppContext;)Ljava/lang/Object;", "Li7/B;", "finalize", "()V", "getHybridDataForJNIDeallocator", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/jni/HybridData;", "LC7/o;", "returnType", "LC7/o;", "getReturnType", "()LC7/o;", "setReturnType", "(LC7/o;)V", "getReturnType$annotations", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
public final class JavaScriptFunction<ReturnType> implements Destructible {

    @DoNotStrip
    private final HybridData mHybridData;
    private o returnType;

    @DoNotStrip
    private JavaScriptFunction(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private final native Object invoke(JavaScriptObject thisValue, Object[] args, ExpectedType expectedReturnType);

    public static /* synthetic */ Object invoke$default(JavaScriptFunction javaScriptFunction, Object[] objArr, JavaScriptObject javaScriptObject, AppContext appContext, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            javaScriptObject = null;
        }
        if ((i10 & 4) != 0) {
            appContext = null;
        }
        return javaScriptFunction.invoke(objArr, javaScriptObject, appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o invoke$lambda$1() {
        return D.o(C2735B.class);
    }

    protected final void finalize() throws Throwable {
        this.mHybridData.resetNative();
    }

    @Override // expo.modules.kotlin.jni.Destructible
    /* JADX INFO: renamed from: getHybridDataForJNIDeallocator, reason: from getter */
    public HybridData getMHybridData() {
        return this.mHybridData;
    }

    public final o getReturnType() {
        return this.returnType;
    }

    public final ReturnType invoke(Object[] args, JavaScriptObject thisValue, AppContext appContext) {
        AbstractC2855l.g(args, "args");
        ArrayList arrayList = new ArrayList(args.length);
        for (Object obj : args) {
            arrayList.add(JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, obj, null, false, 6, null));
        }
        Object[] array = arrayList.toArray(new Object[0]);
        TypeConverterProviderImpl typeConverterProviderImpl = TypeConverterProviderImpl.INSTANCE;
        o lazyKType = this.returnType;
        if (lazyKType == null) {
            lazyKType = new LazyKType(D.b(C2735B.class), false, new InterfaceC3487a() { // from class: expo.modules.kotlin.jni.a
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return JavaScriptFunction.invoke$lambda$1();
                }
            });
        }
        TypeConverter<?> typeConverterObtainTypeConverter = typeConverterProviderImpl.obtainTypeConverter(lazyKType);
        return (ReturnType) typeConverterObtainTypeConverter.convert(invoke(thisValue, array, typeConverterObtainTypeConverter.getCppRequiredTypes()), appContext, false);
    }

    public final boolean isValid() {
        return this.mHybridData.isValid();
    }

    public final void setReturnType(o oVar) {
        this.returnType = oVar;
    }

    public static /* synthetic */ void getReturnType$annotations() {
    }
}
