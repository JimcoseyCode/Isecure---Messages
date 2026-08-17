package expo.modules.kotlin.objects;

import C7.o;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.C2735B;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0006\b\u0001\u0010\t\u0018\u00012\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0006\b\u0001\u0010\u000e\u0018\u00012\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;", "ThisType", "Lexpo/modules/kotlin/objects/PropertyComponentBuilder;", "LC7/o;", "thisType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "<init>", "(LC7/o;Ljava/lang/String;)V", "R", "Lkotlin/Function1;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "get", "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;", "T", "Lkotlin/Function2;", "Li7/B;", "set", "(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;", "LC7/o;", "getThisType", "()LC7/o;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PropertyComponentBuilderWithThis<ThisType> extends PropertyComponentBuilder {
    private final o thisType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyComponentBuilderWithThis(o thisType, String name) {
        super(name);
        AbstractC2855l.g(thisType, "thisType");
        AbstractC2855l.g(name, "name");
        this.thisType = thisType;
    }

    public final /* synthetic */ <R> PropertyComponentBuilderWithThis<ThisType> get(Function1 body) {
        AbstractC2855l.g(body, "body");
        AnyType[] anyTypeArr = {new AnyType(getThisType(), null, 2, null)};
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
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("get", anyTypeArr, returnType, new PropertyComponentBuilderWithThis$get$1$1(body));
        syncFunctionComponent.setOwnerType(getThisType());
        syncFunctionComponent.setCanTakeOwner(true);
        setGetter(syncFunctionComponent);
        return this;
    }

    public final o getThisType() {
        return this.thisType;
    }

    public final /* synthetic */ <T> PropertyComponentBuilderWithThis<ThisType> set(final Function2 body) {
        AbstractC2855l.g(body, "body");
        AnyType anyType = new AnyType(getThisType(), null, 2, null);
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "T");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "T");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AbstractC2855l.l();
            PropertyComponentBuilderWithThis$set$$inlined$apply$lambda$1 propertyComponentBuilderWithThis$set$$inlined$apply$lambda$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.PropertyComponentBuilderWithThis$set$$inlined$apply$lambda$1
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "T");
                    return null;
                }
            };
            AbstractC2855l.m(4, "T");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "T");
            anyType2 = new AnyType(new LazyKType(dVarB2, false, propertyComponentBuilderWithThis$set$$inlined$apply$lambda$1), null);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(D.b(C2735B.class));
        if (returnType == null) {
            returnType = new ReturnType(D.b(C2735B.class));
            returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType);
        }
        AbstractC2855l.l();
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("set", anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.objects.PropertyComponentBuilderWithThis$set$1$1
            public final void invoke(Object[] it) {
                AbstractC2855l.g(it, "it");
                Function2 function2 = body;
                Object obj = it[0];
                Object obj2 = it[1];
                AbstractC2855l.m(1, "T");
                function2.invoke(obj, obj2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Object[]) obj);
                return C2735B.f28704a;
            }
        });
        syncFunctionComponent.setOwnerType(getThisType());
        syncFunctionComponent.setCanTakeOwner(true);
        setSetter(syncFunctionComponent);
        return this;
    }
}
