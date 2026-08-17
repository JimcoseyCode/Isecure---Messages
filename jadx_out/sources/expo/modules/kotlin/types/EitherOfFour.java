package expo.modules.kotlin.types;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.notifications.service.NotificationsService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u0001*\b\b\u0003\u0010\u0005*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006B+\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00030\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00028\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00030\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00028\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lexpo/modules/kotlin/types/EitherOfFour;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "FirstType", "SecondType", "ThirdType", "FourthType", "Lexpo/modules/kotlin/types/EitherOfThree;", "bareValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/DeferredValue;", "deferredValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "LC7/o;", "types", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V", "LC7/d;", NotificationsService.EVENT_TYPE_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "isFourthType", "(LC7/d;)Z", "is", "getFourthType", "(LC7/d;)Ljava/lang/Object;", "get", "fourth", "()Ljava/lang/Object;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
public final class EitherOfFour<FirstType, SecondType, ThirdType, FourthType> extends EitherOfThree<FirstType, SecondType, ThirdType> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EitherOfFour(Object bareValue, List<DeferredValue> deferredValue, List<? extends C7.o> types) {
        super(bareValue, deferredValue, types);
        AbstractC2855l.g(bareValue, "bareValue");
        AbstractC2855l.g(deferredValue, "deferredValue");
        AbstractC2855l.g(types, "types");
    }

    public final FourthType fourth() {
        FourthType fourthtype = (FourthType) get$expo_modules_core_release(3);
        AbstractC2855l.e(fourthtype, "null cannot be cast to non-null type FourthType of expo.modules.kotlin.types.EitherOfFour");
        return fourthtype;
    }

    public final FourthType getFourthType(C7.d type) {
        AbstractC2855l.g(type, "type");
        FourthType fourthtype = (FourthType) get$expo_modules_core_release(3);
        AbstractC2855l.e(fourthtype, "null cannot be cast to non-null type FourthType of expo.modules.kotlin.types.EitherOfFour");
        return fourthtype;
    }

    public final boolean isFourthType(C7.d type) {
        AbstractC2855l.g(type, "type");
        return is$expo_modules_core_release(3);
    }
}
