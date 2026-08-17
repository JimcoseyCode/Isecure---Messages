package expo.modules.kotlin.functions;

import C7.e;
import C7.o;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.ArgumentCastException;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.InvalidArgsNumberException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.types.AnyType;
import i7.C2735B;
import j7.AbstractC2793j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R(\u0010$\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b$\u0010%\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010-\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u0010+\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u001b\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010%\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010'¨\u0006;"}, d2 = {"Lexpo/modules/kotlin/functions/AnyFunction;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/AnyType;", "desiredArgsTypes", "<init>", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;)V", "args", "Lexpo/modules/kotlin/AppContext;", "appContext", PointerEventHelper.POINTER_TYPE_UNKNOWN, "forceConversion", "convertArgs", "([Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)[Ljava/lang/Object;", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "jsObject", "moduleName", "Li7/B;", "attachToJSObject", "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes$expo_modules_core_release", "()Ljava/util/List;", "getCppRequiredTypes", "isEnumerable", "enumerable", "(Z)Lexpo/modules/kotlin/functions/AnyFunction;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "[Lexpo/modules/kotlin/types/AnyType;", "getDesiredArgsTypes", "()[Lexpo/modules/kotlin/types/AnyType;", "canTakeOwner", "Z", "getCanTakeOwner", "()Z", "setCanTakeOwner", "(Z)V", "getCanTakeOwner$annotations", "()V", "LC7/o;", "ownerType", "LC7/o;", "getOwnerType", "()LC7/o;", "setOwnerType", "(LC7/o;)V", "getOwnerType$annotations", "isEnumerable$expo_modules_core_release", "setEnumerable$expo_modules_core_release", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requiredArgumentsCount", "I", "getTakesOwner$expo_modules_core_release", "takesOwner", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AnyFunction {
    private boolean canTakeOwner;
    private final AnyType[] desiredArgsTypes;
    private boolean isEnumerable;
    private final String name;
    private o ownerType;
    private final int requiredArgumentsCount;

    public AnyFunction(String name, AnyType[] desiredArgsTypes) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(desiredArgsTypes, "desiredArgsTypes");
        this.name = name;
        this.desiredArgsTypes = desiredArgsTypes;
        this.isEnumerable = true;
        Iterator it = AbstractC2793j.g0(desiredArgsTypes).iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (!((AnyType) it.next()).getKType().getIsMarkedNullable()) {
                break;
            } else {
                i10++;
            }
        }
        this.requiredArgumentsCount = i10 >= 0 ? this.desiredArgsTypes.length - i10 : 0;
    }

    public static /* synthetic */ Object[] convertArgs$default(AnyFunction anyFunction, Object[] objArr, AppContext appContext, boolean z10, int i10, Object obj) throws CodedException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertArgs");
        }
        if ((i10 & 2) != 0) {
            appContext = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return anyFunction.convertArgs(objArr, appContext, z10);
    }

    public static /* synthetic */ AnyFunction enumerable$default(AnyFunction anyFunction, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enumerable");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return anyFunction.enumerable(z10);
    }

    public abstract void attachToJSObject(AppContext appContext, JSDecoratorsBridgingObject jsObject, String moduleName);

    protected final Object[] convertArgs(Object[] args, AppContext appContext, boolean forceConversion) throws CodedException {
        CodedException unexpectedException;
        CodedException codedException;
        AbstractC2855l.g(args, "args");
        if (this.requiredArgumentsCount <= args.length) {
            int length = args.length;
            AnyType[] anyTypeArr = this.desiredArgsTypes;
            if (length <= anyTypeArr.length) {
                Object[] objArr = anyTypeArr.length == args.length ? args : new Object[anyTypeArr.length];
                int length2 = args.length;
                for (int i10 = 0; i10 < length2; i10++) {
                    Object obj = args[i10];
                    AnyType anyType = this.desiredArgsTypes[i10];
                    try {
                        objArr[i10] = anyType.convert(obj, appContext, forceConversion);
                        C2735B c2735b = C2735B.f28704a;
                    } catch (Throwable th) {
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
                        throw new ArgumentCastException(anyType.getKType(), i10, String.valueOf(obj != null ? obj.getClass() : null), codedException);
                    }
                }
                return objArr;
            }
        }
        throw new InvalidArgsNumberException(args.length, this.desiredArgsTypes.length, this.requiredArgumentsCount);
    }

    public final AnyFunction enumerable(boolean isEnumerable) {
        this.isEnumerable = isEnumerable;
        return this;
    }

    public final boolean getCanTakeOwner() {
        return this.canTakeOwner;
    }

    public final List<ExpectedType> getCppRequiredTypes$expo_modules_core_release() {
        AnyType[] anyTypeArr = this.desiredArgsTypes;
        ArrayList arrayList = new ArrayList(anyTypeArr.length);
        for (AnyType anyType : anyTypeArr) {
            arrayList.add(anyType.getCppRequiredTypes());
        }
        return arrayList;
    }

    protected final AnyType[] getDesiredArgsTypes() {
        return this.desiredArgsTypes;
    }

    protected final String getName() {
        return this.name;
    }

    public final o getOwnerType() {
        return this.ownerType;
    }

    public final boolean getTakesOwner$expo_modules_core_release() {
        o kType;
        if (!this.canTakeOwner) {
            return false;
        }
        AnyType anyType = (AnyType) AbstractC2793j.G(this.desiredArgsTypes);
        e classifier = (anyType == null || (kType = anyType.getKType()) == null) ? null : kType.getClassifier();
        C7.d dVar = classifier instanceof C7.d ? (C7.d) classifier : null;
        if (dVar == null) {
            return false;
        }
        if (AbstractC2855l.b(dVar, D.b(JavaScriptObject.class))) {
            return true;
        }
        o oVar = this.ownerType;
        e classifier2 = oVar != null ? oVar.getClassifier() : null;
        C7.d dVar2 = classifier2 instanceof C7.d ? (C7.d) classifier2 : null;
        if (dVar2 == null) {
            return false;
        }
        return AbstractC2855l.b(dVar, dVar2);
    }

    /* JADX INFO: renamed from: isEnumerable$expo_modules_core_release, reason: from getter */
    public final boolean getIsEnumerable() {
        return this.isEnumerable;
    }

    public final void setCanTakeOwner(boolean z10) {
        this.canTakeOwner = z10;
    }

    public final void setEnumerable$expo_modules_core_release(boolean z10) {
        this.isEnumerable = z10;
    }

    public final void setOwnerType(o oVar) {
        this.ownerType = oVar;
    }

    public static /* synthetic */ void getCanTakeOwner$annotations() {
    }

    public static /* synthetic */ void getOwnerType$annotations() {
    }
}
