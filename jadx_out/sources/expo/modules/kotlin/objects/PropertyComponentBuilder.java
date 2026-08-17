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
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\t\u001a\u00020\u0000\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000e\u001a\u00020\u0000\"\u0006\b\u0000\u0010\u000b\u0018\u00012\u0014\b\u0004\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"Lexpo/modules/kotlin/objects/PropertyComponentBuilder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "<init>", "(Ljava/lang/String;)V", "R", "Lkotlin/Function0;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "get", "(Lw7/a;)Lexpo/modules/kotlin/objects/PropertyComponentBuilder;", "T", "Lkotlin/Function1;", "Li7/B;", "set", "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/objects/PropertyComponentBuilder;", "Lexpo/modules/kotlin/objects/PropertyComponent;", "build", "()Lexpo/modules/kotlin/objects/PropertyComponent;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "getter", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "getGetter", "()Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "setGetter", "(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V", "setter", "getSetter", "setSetter", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class PropertyComponentBuilder {
    private SyncFunctionComponent getter;
    private final String name;
    private SyncFunctionComponent setter;

    public PropertyComponentBuilder(String name) {
        AbstractC2855l.g(name, "name");
        this.name = name;
    }

    public final PropertyComponent build() {
        return new PropertyComponent(this.name, this.getter, this.setter);
    }

    public final /* synthetic */ <R> PropertyComponentBuilder get(InterfaceC3487a body) {
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
        setGetter(new SyncFunctionComponent("get", anyTypeArr, returnType, new PropertyComponentBuilder$get$1$1(body)));
        return this;
    }

    public final SyncFunctionComponent getGetter() {
        return this.getter;
    }

    public final String getName() {
        return this.name;
    }

    public final SyncFunctionComponent getSetter() {
        return this.setter;
    }

    public final /* synthetic */ <T> PropertyComponentBuilder set(final Function1 body) {
        AbstractC2855l.g(body, "body");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "T");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "T");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AbstractC2855l.l();
            PropertyComponentBuilder$set$$inlined$apply$lambda$1 propertyComponentBuilder$set$$inlined$apply$lambda$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.objects.PropertyComponentBuilder$set$$inlined$apply$lambda$1
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "T");
                    return null;
                }
            };
            AbstractC2855l.m(4, "T");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "T");
            anyType = new AnyType(new LazyKType(dVarB2, false, propertyComponentBuilder$set$$inlined$apply$lambda$1), null);
        }
        AnyType[] anyTypeArr = {anyType};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(D.b(C2735B.class));
        if (returnType == null) {
            returnType = new ReturnType(D.b(C2735B.class));
            returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType);
        }
        AbstractC2855l.l();
        setSetter(new SyncFunctionComponent("set", anyTypeArr, returnType, new Function1() { // from class: expo.modules.kotlin.objects.PropertyComponentBuilder$set$1$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Object[]) obj);
                return C2735B.f28704a;
            }

            public final void invoke(Object[] it) {
                AbstractC2855l.g(it, "it");
                Function1 function1 = body;
                Object obj = it[0];
                AbstractC2855l.m(1, "T");
                function1.invoke(obj);
            }
        }));
        return this;
    }

    public final void setGetter(SyncFunctionComponent syncFunctionComponent) {
        this.getter = syncFunctionComponent;
    }

    public final void setSetter(SyncFunctionComponent syncFunctionComponent) {
        this.setter = syncFunctionComponent;
    }
}
