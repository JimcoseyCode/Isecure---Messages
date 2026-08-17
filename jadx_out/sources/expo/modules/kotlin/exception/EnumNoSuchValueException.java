package expo.modules.kotlin.exception;

import C7.d;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2793j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/exception/EnumNoSuchValueException;", "Lexpo/modules/kotlin/exception/CodedException;", "LC7/d;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "enumType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "enumConstants", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "<init>", "(LC7/d;[Ljava/lang/Enum;Ljava/lang/Object;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EnumNoSuchValueException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumNoSuchValueException(d enumType, Enum<?>[] enumConstants, Object obj) {
        super("'" + obj + "' is not present in " + enumType.o() + " enum, it must be one of: " + AbstractC2793j.a0(enumConstants, ", ", null, null, 0, null, new Function1() { // from class: expo.modules.kotlin.exception.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return EnumNoSuchValueException._init_$lambda$0((Enum) obj2);
            }
        }, 30, null), null, 2, null);
        AbstractC2855l.g(enumType, "enumType");
        AbstractC2855l.g(enumConstants, "enumConstants");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _init_$lambda$0(Enum it) {
        AbstractC2855l.g(it, "it");
        return "'" + it.name() + "'";
    }
}
