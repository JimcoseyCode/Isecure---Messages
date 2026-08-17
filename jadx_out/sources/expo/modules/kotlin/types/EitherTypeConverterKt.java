package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import i7.u;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\r\u001a\u0004\u0018\u00010\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001aS\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u001c\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00100\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "wasConverted", "Lexpo/modules/kotlin/types/TypeConverter;", "typeConverter", "Lexpo/modules/kotlin/jni/ExpectedType;", "expectedType", "Lexpo/modules/kotlin/AppContext;", "context", "Lexpo/modules/kotlin/types/DeferredValue;", "createDeferredValue", "(Ljava/lang/Object;ZLexpo/modules/kotlin/types/TypeConverter;Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/AppContext;)Lexpo/modules/kotlin/types/DeferredValue;", "tryToConvert", "(Lexpo/modules/kotlin/types/TypeConverter;Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Pair;", "list", "LC7/o;", "typeList", "createDeferredValues", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class EitherTypeConverterKt {
    private static final DeferredValue createDeferredValue(Object obj, boolean z10, TypeConverter<?> typeConverter, ExpectedType expectedType, AppContext appContext) {
        Object objTryToConvert;
        for (SingleType singleType : expectedType.getInnerPossibleTypes()) {
            if (z10) {
                return new UnconvertedValue(obj, typeConverter, appContext);
            }
            if ((singleType.getExpectedCppType().getClazz().q(obj) || (obj instanceof Dynamic)) && (objTryToConvert = tryToConvert(typeConverter, obj, appContext)) != null) {
                return new ConvertedValue(objTryToConvert);
            }
        }
        return IncompatibleValue.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<DeferredValue> createDeferredValues(Object obj, AppContext appContext, List<? extends Pair<ExpectedType, ? extends TypeConverter<?>>> list, List<? extends C7.o> list2) {
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator<T> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            DeferredValue deferredValueCreateDeferredValue = createDeferredValue(obj, z10, (TypeConverter) pair.getSecond(), (ExpectedType) pair.getFirst(), appContext);
            if (deferredValueCreateDeferredValue instanceof ConvertedValue) {
                z10 = true;
            }
            arrayList.add(deferredValueCreateDeferredValue);
        }
        if (z10) {
            return arrayList;
        }
        throw new u("Cannot cast '" + obj + "' to 'Either<" + AbstractC2800q.o0(list2, ", ", null, null, 0, null, new Function1() { // from class: expo.modules.kotlin.types.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return EitherTypeConverterKt.createDeferredValues$lambda$1((C7.o) obj2);
            }
        }, 30, null) + ">'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence createDeferredValues$lambda$1(C7.o it) {
        AbstractC2855l.g(it, "it");
        return it.toString();
    }

    private static final Object tryToConvert(TypeConverter<?> typeConverter, Object obj, AppContext appContext) {
        try {
            return (!typeConverter.isTrivial() || (obj instanceof Dynamic)) ? typeConverter.convert(obj, appContext, true) : obj;
        } catch (Throwable unused) {
            return null;
        }
    }
}
