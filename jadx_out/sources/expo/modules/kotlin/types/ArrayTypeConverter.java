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
import expo.modules.kotlin.jni.ExpectedType;
import j7.AbstractC2800q;
import java.lang.reflect.Array;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0018\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lexpo/modules/kotlin/types/ArrayTypeConverter;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "LC7/o;", "arrayType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;LC7/o;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "size", PointerEventHelper.POINTER_TYPE_UNKNOWN, "createTypedArray", "(I)[Ljava/lang/Object;", "Lcom/facebook/react/bridge/Dynamic;", "value", "Lexpo/modules/kotlin/AppContext;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "forceConversion", "convertFromDynamic", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;Z)[Ljava/lang/Object;", "convertFromAny", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)[Ljava/lang/Object;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "isTrivial", "()Z", "LC7/o;", "Lexpo/modules/kotlin/types/TypeConverter;", "arrayElementConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArrayTypeConverter extends DynamicAwareTypeConverters<Object[]> {
    private final TypeConverter<?> arrayElementConverter;
    private final C7.o arrayType;

    public ArrayTypeConverter(TypeConverterProvider converterProvider, C7.o arrayType) {
        AbstractC2855l.g(converterProvider, "converterProvider");
        AbstractC2855l.g(arrayType, "arrayType");
        this.arrayType = arrayType;
        q qVar = (q) AbstractC2800q.g0(arrayType.getArguments());
        C7.o oVarC = qVar != null ? qVar.c() : null;
        if (oVarC == null) {
            throw new IllegalArgumentException("The array type should contain the type of the elements.");
        }
        this.arrayElementConverter = converterProvider.obtainTypeConverter(oVarC);
    }

    private final Object[] createTypedArray(int size) {
        C7.o oVarC = ((q) AbstractC2800q.e0(this.arrayType.getArguments())).c();
        AbstractC2855l.d(oVarC);
        C7.e classifier = oVarC.getClassifier();
        AbstractC2855l.e(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Object objNewInstance = Array.newInstance((Class<?>) AbstractC3430a.b((C7.d) classifier), size);
        AbstractC2855l.e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return (Object[]) objNewInstance;
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return ExpectedType.INSTANCE.forArray(this.arrayElementConverter.get$cppRequireType());
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return this.arrayElementConverter.isTrivial();
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Object[] convertFromAny(Object value, AppContext context, boolean forceConversion) throws CollectionElementCastException {
        CodedException unexpectedException;
        AbstractC2855l.g(value, "value");
        if (this.arrayElementConverter.isTrivial() && !forceConversion) {
            return (Object[]) value;
        }
        Object[] objArr = (Object[]) value;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            try {
                arrayList.add(this.arrayElementConverter.convert(obj, context, forceConversion));
            } catch (Throwable th) {
                if (th instanceof CodedException) {
                    unexpectedException = (CodedException) th;
                } else if (th instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                    String code = codedException.getCode();
                    AbstractC2855l.f(code, "getCode(...)");
                    unexpectedException = new CodedException(code, codedException.getMessage(), codedException.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th);
                }
                C7.o oVar = this.arrayType;
                C7.o oVarC = ((q) AbstractC2800q.e0(this.arrayType.getArguments())).c();
                AbstractC2855l.d(oVarC);
                AbstractC2855l.d(obj);
                throw new CollectionElementCastException(oVar, oVarC, D.b(obj.getClass()), unexpectedException);
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Object[] convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws DynamicCastException {
        AbstractC2855l.g(value, "value");
        ReadableArray readableArrayAsArray = value.asArray();
        if (readableArrayAsArray == null) {
            throw new DynamicCastException(D.b(ReadableArray.class));
        }
        Object[] objArrCreateTypedArray = createTypedArray(readableArrayAsArray.size());
        int size = readableArrayAsArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            Dynamic dynamic = readableArrayAsArray.getDynamic(i10);
            try {
                Object objConvert = this.arrayElementConverter.convert(dynamic, context, forceConversion);
                dynamic.recycle();
                objArrCreateTypedArray[i10] = objConvert;
            } finally {
            }
        }
        return objArrCreateTypedArray;
    }
}
