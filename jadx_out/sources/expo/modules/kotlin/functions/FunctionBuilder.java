package expo.modules.kotlin.functions;

import C7.o;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import w7.InterfaceC3487a;
import w7.p;
import w7.q;
import w7.r;
import w7.s;
import w7.t;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\b2\u0010\b\u0004\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\rJA\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0010JO\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u0001\"\u0006\b\u0002\u0010\u0011\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001a\b\u0004\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0013J]\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u0001\"\u0006\b\u0002\u0010\u0011\u0018\u0001\"\u0006\b\u0003\u0010\u0014\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022 \b\u0004\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0016Jk\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u0001\"\u0006\b\u0002\u0010\u0011\u0018\u0001\"\u0006\b\u0003\u0010\u0014\u0018\u0001\"\u0006\b\u0004\u0010\u0017\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022&\b\u0004\u0010\u0007\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0019Jy\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u0001\"\u0006\b\u0002\u0010\u0011\u0018\u0001\"\u0006\b\u0003\u0010\u0014\u0018\u0001\"\u0006\b\u0004\u0010\u0017\u0018\u0001\"\u0006\b\u0005\u0010\u001a\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022,\b\u0004\u0010\u0007\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u001cJ\u0087\u0001\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u0001\"\u0006\b\u0002\u0010\u0011\u0018\u0001\"\u0006\b\u0003\u0010\u0014\u0018\u0001\"\u0006\b\u0004\u0010\u0017\u0018\u0001\"\u0006\b\u0005\u0010\u001a\u0018\u0001\"\u0006\b\u0006\u0010\u001d\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u000222\b\u0004\u0010\u0007\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u001fJ\u0095\u0001\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u0001\"\u0006\b\u0002\u0010\u0011\u0018\u0001\"\u0006\b\u0003\u0010\u0014\u0018\u0001\"\u0006\b\u0004\u0010\u0017\u0018\u0001\"\u0006\b\u0005\u0010\u001a\u0018\u0001\"\u0006\b\u0006\u0010\u001d\u0018\u0001\"\u0006\b\u0007\u0010 \u0018\u00012\u0006\u0010\u0003\u001a\u00020\u000228\b\u0004\u0010\u0007\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00000!H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\"J£\u0001\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u0001\"\u0006\b\u0002\u0010\u0011\u0018\u0001\"\u0006\b\u0003\u0010\u0014\u0018\u0001\"\u0006\b\u0004\u0010\u0017\u0018\u0001\"\u0006\b\u0005\u0010\u001a\u0018\u0001\"\u0006\b\u0006\u0010\u001d\u0018\u0001\"\u0006\b\u0007\u0010 \u0018\u0001\"\u0006\b\b\u0010#\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022>\b\u0004\u0010\u0007\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010%J\u000f\u0010(\u001a\u00020\bH\u0000¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R*\u0010.\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b3\u0010-\u001a\u0004\b0\u0010'\"\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, d2 = {"Lexpo/modules/kotlin/functions/FunctionBuilder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "<init>", "(Ljava/lang/String;)V", "Lkotlin/Function0;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "BodyWithoutArgs", "(Lw7/a;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "Body", "R", "(Ljava/lang/String;Lw7/a;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P0", "Lkotlin/Function1;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P1", "Lkotlin/Function2;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P2", "Lkotlin/Function3;", "(Ljava/lang/String;Lw7/o;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P3", "Lkotlin/Function4;", "(Ljava/lang/String;Lw7/p;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P4", "Lkotlin/Function5;", "(Ljava/lang/String;Lw7/q;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P5", "Lkotlin/Function6;", "(Ljava/lang/String;Lw7/r;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P6", "Lkotlin/Function7;", "(Ljava/lang/String;Lw7/s;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P7", "Lkotlin/Function8;", "(Ljava/lang/String;Lw7/t;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "build$expo_modules_core_release", "()Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "build", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", "functionComponent", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "getFunctionComponent", "setFunctionComponent", "(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V", "getFunctionComponent$annotations", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FunctionBuilder {
    private SyncFunctionComponent functionComponent;
    private final String name;

    public FunctionBuilder(String name) {
        AbstractC2855l.g(name, "name");
        this.name = name;
    }

    public final /* synthetic */ <R> SyncFunctionComponent Body(String name, final InterfaceC3487a body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(4, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(4, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(4, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                AbstractC2855l.g(it, "it");
                return body.invoke();
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final SyncFunctionComponent BodyWithoutArgs(final InterfaceC3487a body) {
        AbstractC2855l.g(body, "body");
        String name = getName();
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(D.b(Object.class));
            returnTypeProvider.getTypes().put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] it) {
                AbstractC2855l.g(it, "it");
                return body.invoke();
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final SyncFunctionComponent build$expo_modules_core_release() {
        SyncFunctionComponent syncFunctionComponent = this.functionComponent;
        if (syncFunctionComponent != null) {
            return syncFunctionComponent;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final SyncFunctionComponent getFunctionComponent() {
        return this.functionComponent;
    }

    public final String getName() {
        return this.name;
    }

    public final void setFunctionComponent(SyncFunctionComponent syncFunctionComponent) {
        this.functionComponent = syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> SyncFunctionComponent Body(String name, final Function1 body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.m(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$1 functionBuilder$Body$$inlined$toArgsArray$default$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$1
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, functionBuilder$Body$$inlined$toArgsArray$default$1), null);
        }
        AnyType[] anyTypeArr = {anyType};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(4, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(4, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(4, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public static /* synthetic */ void getFunctionComponent$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public final /* synthetic */ <R, P0, P1> SyncFunctionComponent Body(String name, final Function2 body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$2 functionBuilder$Body$$inlined$toArgsArray$default$2 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$2
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, functionBuilder$Body$$inlined$toArgsArray$default$2), null);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$3 functionBuilder$Body$$inlined$toArgsArray$default$3 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$3
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, functionBuilder$Body$$inlined$toArgsArray$default$3), null);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(4, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(4, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(4, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> SyncFunctionComponent Body(String name, final w7.o body) {
        int i10;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$4 functionBuilder$Body$$inlined$toArgsArray$default$4 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$4
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, functionBuilder$Body$$inlined$toArgsArray$default$4), null);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$5 functionBuilder$Body$$inlined$toArgsArray$default$5 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$5
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, functionBuilder$Body$$inlined$toArgsArray$default$5), null);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$6 functionBuilder$Body$$inlined$toArgsArray$default$6 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$6
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i10 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, functionBuilder$Body$$inlined$toArgsArray$default$6), null);
        } else {
            i10 = 4;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(i10, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(i10, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(i10, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> SyncFunctionComponent Body(String name, final p body) {
        int i10;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$7 functionBuilder$Body$$inlined$toArgsArray$default$7 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$7
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, functionBuilder$Body$$inlined$toArgsArray$default$7), null);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$8 functionBuilder$Body$$inlined$toArgsArray$default$8 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$8
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, functionBuilder$Body$$inlined$toArgsArray$default$8), null);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$9 functionBuilder$Body$$inlined$toArgsArray$default$9 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$9
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, functionBuilder$Body$$inlined$toArgsArray$default$9), null);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$10 functionBuilder$Body$$inlined$toArgsArray$default$10 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$10
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i10 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, functionBuilder$Body$$inlined$toArgsArray$default$10), null);
        } else {
            i10 = 4;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(i10, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(i10, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(i10, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.e(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> SyncFunctionComponent Body(String name, final q body) {
        int i10;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$11 functionBuilder$Body$$inlined$toArgsArray$default$11 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$11
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, functionBuilder$Body$$inlined$toArgsArray$default$11), null);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$12 functionBuilder$Body$$inlined$toArgsArray$default$12 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$12
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, functionBuilder$Body$$inlined$toArgsArray$default$12), null);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$13 functionBuilder$Body$$inlined$toArgsArray$default$13 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$13
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, functionBuilder$Body$$inlined$toArgsArray$default$13), null);
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$14 functionBuilder$Body$$inlined$toArgsArray$default$14 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$14
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, functionBuilder$Body$$inlined$toArgsArray$default$14), null);
        }
        AbstractC2855l.m(4, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(3, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$15 functionBuilder$Body$$inlined$toArgsArray$default$15 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$15
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i10 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, functionBuilder$Body$$inlined$toArgsArray$default$15), null);
        } else {
            i10 = 4;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(i10, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(i10, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(i10, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> SyncFunctionComponent Body(String name, final r body) {
        AnyTypeProvider anyTypeProvider;
        int i10;
        AnyType anyType;
        int i11;
        int i12;
        AnyType anyType2;
        int i13;
        int i14;
        AnyType anyType3;
        int i15;
        int i16;
        AnyType anyType4;
        int i17;
        int i18;
        AnyType anyType5;
        int i19;
        AnyType anyType6;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AbstractC2855l.m(4, "P5");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType7 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType7 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$16 functionBuilder$Body$$inlined$toArgsArray$default$16 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$16
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, functionBuilder$Body$$inlined$toArgsArray$default$16), null);
        } else {
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            anyType = anyType7;
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$17 functionBuilder$Body$$inlined$toArgsArray$default$17 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$17
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, functionBuilder$Body$$inlined$toArgsArray$default$17), null);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType8;
        }
        AbstractC2855l.m(i11, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$18 functionBuilder$Body$$inlined$toArgsArray$default$18 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$18
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, functionBuilder$Body$$inlined$toArgsArray$default$18), null);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType9;
        }
        AbstractC2855l.m(i13, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$19 functionBuilder$Body$$inlined$toArgsArray$default$19 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$19
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, functionBuilder$Body$$inlined$toArgsArray$default$19), null);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType10;
        }
        AbstractC2855l.m(i15, "P4");
        C7.d dVarB9 = D.b(Object.class);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$20 functionBuilder$Body$$inlined$toArgsArray$default$20 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$20
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(Object.class);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, functionBuilder$Body$$inlined$toArgsArray$default$20), null);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType11;
        }
        AbstractC2855l.m(i17, "P5");
        C7.d dVarB11 = D.b(Object.class);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$21 functionBuilder$Body$$inlined$toArgsArray$default$21 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$21
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            i19 = 4;
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(Object.class);
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, functionBuilder$Body$$inlined$toArgsArray$default$21), null);
        } else {
            i19 = 4;
            anyType6 = anyType12;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(i19, "R");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType == null) {
            AbstractC2855l.m(i19, "R");
            returnType = new ReturnType(D.b(Object.class));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(i19, "R");
            types2.put(D.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.m(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> SyncFunctionComponent Body(String name, final s body) {
        AnyTypeProvider anyTypeProvider;
        Class cls;
        int i10;
        AnyType anyType;
        int i11;
        int i12;
        AnyType anyType2;
        int i13;
        int i14;
        AnyType anyType3;
        int i15;
        int i16;
        AnyType anyType4;
        int i17;
        int i18;
        AnyType anyType5;
        int i19;
        int i20;
        AnyType anyType6;
        int i21;
        AnyType anyType7;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AbstractC2855l.m(4, "P5");
        AbstractC2855l.m(4, "P6");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType8 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$22 functionBuilder$Body$$inlined$toArgsArray$default$22 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$22
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            cls = Object.class;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, functionBuilder$Body$$inlined$toArgsArray$default$22), null);
        } else {
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            i10 = 3;
            anyType = anyType8;
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(cls);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$23 functionBuilder$Body$$inlined$toArgsArray$default$23 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$23
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, functionBuilder$Body$$inlined$toArgsArray$default$23), null);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType9;
        }
        AbstractC2855l.m(i11, "P2");
        C7.d dVarB5 = D.b(cls);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$24 functionBuilder$Body$$inlined$toArgsArray$default$24 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$24
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, functionBuilder$Body$$inlined$toArgsArray$default$24), null);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType10;
        }
        AbstractC2855l.m(i13, "P3");
        C7.d dVarB7 = D.b(cls);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$25 functionBuilder$Body$$inlined$toArgsArray$default$25 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$25
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, functionBuilder$Body$$inlined$toArgsArray$default$25), null);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType11;
        }
        AbstractC2855l.m(i15, "P4");
        C7.d dVarB9 = D.b(cls);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$26 functionBuilder$Body$$inlined$toArgsArray$default$26 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$26
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, functionBuilder$Body$$inlined$toArgsArray$default$26), null);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType12;
        }
        AbstractC2855l.m(i17, "P5");
        C7.d dVarB11 = D.b(cls);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType13 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$27 functionBuilder$Body$$inlined$toArgsArray$default$27 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$27
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            i19 = 4;
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(cls);
            i20 = 3;
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, functionBuilder$Body$$inlined$toArgsArray$default$27), null);
        } else {
            i19 = 4;
            i20 = 3;
            anyType6 = anyType13;
        }
        AbstractC2855l.m(i19, "P6");
        C7.d dVarB13 = D.b(cls);
        AbstractC2855l.m(i20, "P6");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType14 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$28 functionBuilder$Body$$inlined$toArgsArray$default$28 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$28
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P6");
                    return null;
                }
            };
            i21 = 4;
            AbstractC2855l.m(4, "P6");
            C7.d dVarB14 = D.b(cls);
            AbstractC2855l.m(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, functionBuilder$Body$$inlined$toArgsArray$default$28), null);
        } else {
            i21 = 4;
            anyType7 = anyType14;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(i21, "R");
        ReturnType returnType = types.get(D.b(cls));
        if (returnType == null) {
            AbstractC2855l.m(i21, "R");
            returnType = new ReturnType(D.b(cls));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(i21, "R");
            types2.put(D.b(cls), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.s(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> SyncFunctionComponent Body(String name, final t body) {
        AnyTypeProvider anyTypeProvider;
        Class cls;
        int i10;
        AnyType anyType;
        int i11;
        int i12;
        AnyType anyType2;
        int i13;
        int i14;
        AnyType anyType3;
        int i15;
        int i16;
        AnyType anyType4;
        int i17;
        int i18;
        AnyType anyType5;
        int i19;
        int i20;
        AnyType anyType6;
        int i21;
        int i22;
        AnyType anyType7;
        int i23;
        AnyType anyType8;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AbstractC2855l.m(4, "P5");
        AbstractC2855l.m(4, "P6");
        AbstractC2855l.m(4, "P7");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType9 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$29 functionBuilder$Body$$inlined$toArgsArray$default$29 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$29
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(cls);
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, functionBuilder$Body$$inlined$toArgsArray$default$29), null);
        } else {
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            i10 = 3;
            anyType = anyType9;
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(cls);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$30 functionBuilder$Body$$inlined$toArgsArray$default$30 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$30
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, functionBuilder$Body$$inlined$toArgsArray$default$30), null);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType10;
        }
        AbstractC2855l.m(i11, "P2");
        C7.d dVarB5 = D.b(cls);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$31 functionBuilder$Body$$inlined$toArgsArray$default$31 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$31
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, functionBuilder$Body$$inlined$toArgsArray$default$31), null);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType11;
        }
        AbstractC2855l.m(i13, "P3");
        C7.d dVarB7 = D.b(cls);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$32 functionBuilder$Body$$inlined$toArgsArray$default$32 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$32
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, functionBuilder$Body$$inlined$toArgsArray$default$32), null);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType12;
        }
        AbstractC2855l.m(i15, "P4");
        C7.d dVarB9 = D.b(cls);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType13 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$33 functionBuilder$Body$$inlined$toArgsArray$default$33 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$33
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, functionBuilder$Body$$inlined$toArgsArray$default$33), null);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType13;
        }
        AbstractC2855l.m(i17, "P5");
        C7.d dVarB11 = D.b(cls);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType14 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$34 functionBuilder$Body$$inlined$toArgsArray$default$34 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$34
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            i19 = 4;
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(cls);
            i20 = 3;
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, functionBuilder$Body$$inlined$toArgsArray$default$34), null);
        } else {
            i19 = 4;
            i20 = 3;
            anyType6 = anyType14;
        }
        AbstractC2855l.m(i19, "P6");
        C7.d dVarB13 = D.b(cls);
        AbstractC2855l.m(i20, "P6");
        AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType15 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$35 functionBuilder$Body$$inlined$toArgsArray$default$35 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$35
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P6");
                    return null;
                }
            };
            i21 = 4;
            AbstractC2855l.m(4, "P6");
            C7.d dVarB14 = D.b(cls);
            i22 = 3;
            AbstractC2855l.m(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, functionBuilder$Body$$inlined$toArgsArray$default$35), null);
        } else {
            i21 = 4;
            i22 = 3;
            anyType7 = anyType15;
        }
        AbstractC2855l.m(i21, "P7");
        C7.d dVarB15 = D.b(cls);
        AbstractC2855l.m(i22, "P7");
        AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(dVarB15, false));
        if (anyType16 == null) {
            AbstractC2855l.l();
            FunctionBuilder$Body$$inlined$toArgsArray$default$36 functionBuilder$Body$$inlined$toArgsArray$default$36 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$36
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P7");
                    return null;
                }
            };
            i23 = 4;
            AbstractC2855l.m(4, "P7");
            C7.d dVarB16 = D.b(cls);
            AbstractC2855l.m(3, "P7");
            anyType8 = new AnyType(new LazyKType(dVarB16, false, functionBuilder$Body$$inlined$toArgsArray$default$36), null);
        } else {
            i23 = 4;
            anyType8 = anyType16;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(i23, "R");
        ReturnType returnType = types.get(D.b(cls));
        if (returnType == null) {
            AbstractC2855l.m(i23, "R");
            returnType = new ReturnType(D.b(cls));
            Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
            AbstractC2855l.m(i23, "R");
            types2.put(D.b(cls), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object[] objArr) {
                AbstractC2855l.g(objArr, "<destruct>");
                return body.i(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }
}
