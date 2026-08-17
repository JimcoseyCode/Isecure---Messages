package expo.modules.kotlin.functions;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.types.AnyType;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\n\u001a\u00020\t\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001e\b\b\u0010\b\u001a\u0018\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0003\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"ReturnType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/AnyType;", "desiredArgsTypes", "Lkotlin/Function1;", PointerEventHelper.POINTER_TYPE_UNKNOWN, ExpoNotificationBuilder.EXTRAS_BODY_KEY, "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "createAsyncFunctionComponent", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UntypedAsyncFunctionComponentKt {
    public static final /* synthetic */ <ReturnType> AsyncFunctionComponent createAsyncFunctionComponent(String name, AnyType[] desiredArgsTypes, Function1 body) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(desiredArgsTypes, "desiredArgsTypes");
        AbstractC2855l.g(body, "body");
        AbstractC2855l.m(3, "ReturnType");
        AbstractC2855l.m(4, "ReturnType");
        return AbstractC2855l.b(Object.class, Integer.TYPE) ? new IntAsyncFunctionComponent(name, desiredArgsTypes, body) : AbstractC2855l.b(Object.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent(name, desiredArgsTypes, body) : AbstractC2855l.b(Object.class, Double.TYPE) ? new DoubleAsyncFunctionComponent(name, desiredArgsTypes, body) : AbstractC2855l.b(Object.class, Float.TYPE) ? new FloatAsyncFunctionComponent(name, desiredArgsTypes, body) : AbstractC2855l.b(Object.class, String.class) ? new StringAsyncFunctionComponent(name, desiredArgsTypes, body) : new UntypedAsyncFunctionComponent(name, desiredArgsTypes, body);
    }
}
