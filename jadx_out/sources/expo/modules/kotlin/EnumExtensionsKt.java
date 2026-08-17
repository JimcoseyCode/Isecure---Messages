package expo.modules.kotlin;

import C7.j;
import C7.m;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u0001\"\u0012\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u00020\u0004*\u0002H\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"convertToString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/Enumerable;", "(Ljava/lang/Enum;)Ljava/lang/String;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class EnumExtensionsKt {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Enum<TT;>;:Lexpo/modules/kotlin/types/Enumerable;>(TT;)Ljava/lang/String; */
    public static final String convertToString(Enum r42) {
        List parameters;
        Object next;
        AbstractC2855l.g(r42, "<this>");
        C7.d dVarB = D.b(r42.getClass());
        C7.g fastPrimaryConstructor = KClassExtensionsKt.getFastPrimaryConstructor(dVarB);
        if (fastPrimaryConstructor == null || (parameters = fastPrimaryConstructor.getParameters()) == null || parameters.size() != 1) {
            return r42.name();
        }
        String name = ((j) AbstractC2800q.e0(fastPrimaryConstructor.getParameters())).getName();
        Iterator it = D7.c.a(dVarB).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC2855l.b(((m) next).getName(), name)) {
                break;
            }
        }
        m mVar = (m) next;
        if (mVar != null) {
            if (AbstractC2855l.b(mVar.getReturnType().getClassifier(), D.b(String.class))) {
                return (String) mVar.get(r42);
            }
            throw new IllegalArgumentException("The enum parameter has to be a string.");
        }
        throw new IllegalArgumentException(("Cannot find a property for " + name + " parameter").toString());
    }
}
