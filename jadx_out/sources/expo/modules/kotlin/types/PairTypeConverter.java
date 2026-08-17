package expo.modules.kotlin.types;

import C7.q;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.CppType;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0019\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0018\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\"\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00140$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lexpo/modules/kotlin/types/PairTypeConverter;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "Lkotlin/Pair;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "LC7/o;", "pairType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;LC7/o;)V", "Lcom/facebook/react/bridge/ReadableArray;", "jsArray", "Lexpo/modules/kotlin/AppContext;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "forceConversion", "convertFromReadableArray", "(Lcom/facebook/react/bridge/ReadableArray;Lexpo/modules/kotlin/AppContext;Z)Lkotlin/Pair;", "array", PointerEventHelper.POINTER_TYPE_UNKNOWN, "index", PointerEventHelper.POINTER_TYPE_UNKNOWN, "convertElement", "(Lexpo/modules/kotlin/AppContext;Lcom/facebook/react/bridge/ReadableArray;IZ)Ljava/lang/Object;", "Lcom/facebook/react/bridge/Dynamic;", "value", "convertFromDynamic", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;Z)Lkotlin/Pair;", "convertFromAny", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)Lkotlin/Pair;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "isTrivial", "()Z", "LC7/o;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/TypeConverter;", "converters", "Ljava/util/List;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PairTypeConverter extends DynamicAwareTypeConverters<Pair<?, ?>> {
    private final List<TypeConverter<? extends Object>> converters;
    private final C7.o pairType;

    public PairTypeConverter(TypeConverterProvider converterProvider, C7.o pairType) {
        AbstractC2855l.g(converterProvider, "converterProvider");
        AbstractC2855l.g(pairType, "pairType");
        this.pairType = pairType;
        q qVar = (q) AbstractC2800q.h0(pairType.getArguments(), 0);
        C7.o oVarC = qVar != null ? qVar.c() : null;
        if (oVarC == null) {
            throw new IllegalArgumentException("The pair type should contain the type of the first parameter.");
        }
        TypeConverter<?> typeConverterObtainTypeConverter = converterProvider.obtainTypeConverter(oVarC);
        q qVar2 = (q) AbstractC2800q.h0(pairType.getArguments(), 1);
        C7.o oVarC2 = qVar2 != null ? qVar2.c() : null;
        if (oVarC2 == null) {
            throw new IllegalArgumentException("The pair type should contain the type of the second parameter.");
        }
        this.converters = AbstractC2800q.m(typeConverterObtainTypeConverter, converterProvider.obtainTypeConverter(oVarC2));
    }

    private final Object convertElement(AppContext context, ReadableArray array, int index, boolean forceConversion) {
        CodedException unexpectedException;
        Dynamic dynamic = array.getDynamic(index);
        try {
            Object objConvert = ((TypeConverter) this.converters.get(index)).convert(dynamic, context, forceConversion);
            dynamic.recycle();
            return objConvert;
        } catch (Throwable th) {
            try {
                if (th instanceof CodedException) {
                    unexpectedException = (CodedException) th;
                } else if (th instanceof expo.modules.core.errors.CodedException) {
                    String code = ((expo.modules.core.errors.CodedException) th).getCode();
                    AbstractC2855l.f(code, "getCode(...)");
                    unexpectedException = new CodedException(code, ((expo.modules.core.errors.CodedException) th).getMessage(), ((expo.modules.core.errors.CodedException) th).getCause());
                } else {
                    unexpectedException = new UnexpectedException(th);
                }
                C7.o oVar = this.pairType;
                C7.o oVarC = ((q) this.pairType.getArguments().get(index)).c();
                AbstractC2855l.d(oVarC);
                throw new CollectionElementCastException(oVar, oVarC, dynamic.getType(), unexpectedException);
            } catch (Throwable th2) {
                dynamic.recycle();
                throw th2;
            }
        }
    }

    private final Pair<?, ?> convertFromReadableArray(ReadableArray jsArray, AppContext context, boolean forceConversion) {
        return new Pair<>(convertElement(context, jsArray, 0, forceConversion), convertElement(context, jsArray, 1, forceConversion));
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return new ExpectedType(new SingleType(CppType.READABLE_ARRAY, null, 2, null));
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Pair<?, ?> convertFromAny(Object value, AppContext context, boolean forceConversion) {
        AbstractC2855l.g(value, "value");
        return value instanceof ReadableArray ? convertFromReadableArray((ReadableArray) value, context, forceConversion) : (Pair) value;
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Pair<?, ?> convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws DynamicCastException {
        AbstractC2855l.g(value, "value");
        ReadableArray readableArrayAsArray = value.asArray();
        if (readableArrayAsArray != null) {
            return convertFromReadableArray(readableArrayAsArray, context, forceConversion);
        }
        throw new DynamicCastException(D.b(ReadableArray.class));
    }
}
