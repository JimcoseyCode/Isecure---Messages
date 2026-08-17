package expo.modules.kotlin.types;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\u0086\b\u001a\u0011\u0010\u0004\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b¨\u0006\u0005"}, d2 = {"get", "Lexpo/modules/kotlin/types/ReturnType;", "T", "Lexpo/modules/kotlin/types/ReturnTypeProvider;", "toReturnType", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ReturnTypeKt {
    public static final /* synthetic */ <T> ReturnType get(ReturnTypeProvider returnTypeProvider) {
        AbstractC2855l.g(returnTypeProvider, "<this>");
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(4, "T");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType != null) {
            return returnType;
        }
        AbstractC2855l.m(4, "T");
        ReturnType returnType2 = new ReturnType(D.b(Object.class));
        Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
        AbstractC2855l.m(4, "T");
        types2.put(D.b(Object.class), returnType2);
        return returnType2;
    }

    public static final /* synthetic */ <T> ReturnType toReturnType() {
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<C7.d, ReturnType> types = returnTypeProvider.getTypes();
        AbstractC2855l.m(4, "T");
        ReturnType returnType = types.get(D.b(Object.class));
        if (returnType != null) {
            return returnType;
        }
        AbstractC2855l.m(4, "T");
        ReturnType returnType2 = new ReturnType(D.b(Object.class));
        Map<C7.d, ReturnType> types2 = returnTypeProvider.getTypes();
        AbstractC2855l.m(4, "T");
        types2.put(D.b(Object.class), returnType2);
        return returnType2;
    }
}
