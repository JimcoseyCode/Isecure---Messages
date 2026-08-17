package expo.modules.kotlin.types;

import C7.q;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u00152\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0018\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lexpo/modules/kotlin/types/ListTypeConverter;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "LC7/o;", "listType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;LC7/o;)V", "Lcom/facebook/react/bridge/ReadableArray;", "jsArray", "Lexpo/modules/kotlin/AppContext;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "forceConversion", "convertFromReadableArray", "(Lcom/facebook/react/bridge/ReadableArray;Lexpo/modules/kotlin/AppContext;Z)Ljava/util/List;", "Lcom/facebook/react/bridge/Dynamic;", "value", "convertFromDynamic", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;Z)Ljava/util/List;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "convertFromAny", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)Ljava/util/List;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "isTrivial", "()Z", "LC7/o;", "Lexpo/modules/kotlin/types/TypeConverter;", "elementConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ListTypeConverter extends DynamicAwareTypeConverters<List<?>> {
    private final TypeConverter<?> elementConverter;
    private final C7.o listType;

    public ListTypeConverter(TypeConverterProvider converterProvider, C7.o listType) {
        AbstractC2855l.g(converterProvider, "converterProvider");
        AbstractC2855l.g(listType, "listType");
        this.listType = listType;
        C7.o oVarC = ((q) AbstractC2800q.e0(listType.getArguments())).c();
        if (oVarC == null) {
            throw new IllegalArgumentException("The list type should contain the type of elements.");
        }
        this.elementConverter = converterProvider.obtainTypeConverter(oVarC);
    }

    private final List<?> convertFromReadableArray(ReadableArray jsArray, AppContext context, boolean forceConversion) {
        int size = jsArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            Dynamic dynamic = jsArray.getDynamic(i10);
            try {
                Object objConvert = this.elementConverter.convert(dynamic, context, forceConversion);
                dynamic.recycle();
                arrayList.add(objConvert);
            } finally {
            }
        }
        return arrayList;
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return ExpectedType.INSTANCE.forList(this.elementConverter.get$cppRequireType());
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return this.elementConverter.isTrivial();
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public List<?> convertFromAny(Object value, AppContext context, boolean forceConversion) throws CollectionElementCastException {
        CodedException unexpectedException;
        AbstractC2855l.g(value, "value");
        if (this.elementConverter.isTrivial() && !forceConversion) {
            return (List) value;
        }
        List list = (List) value;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        for (Object obj : list) {
            try {
                arrayList.add(this.elementConverter.convert(obj, context, forceConversion));
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
                C7.o oVar = this.listType;
                C7.o oVarC = ((q) AbstractC2800q.e0(this.listType.getArguments())).c();
                AbstractC2855l.d(oVarC);
                AbstractC2855l.d(obj);
                throw new CollectionElementCastException(oVar, oVarC, D.b(obj.getClass()), unexpectedException);
            }
        }
        return arrayList;
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public List<?> convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws CollectionElementCastException, DynamicCastException {
        CodedException unexpectedException;
        AbstractC2855l.g(value, "value");
        if (value.getType() == ReadableType.Array) {
            ReadableArray readableArrayAsArray = value.asArray();
            if (readableArrayAsArray != null) {
                return convertFromReadableArray(readableArrayAsArray, context, forceConversion);
            }
            throw new DynamicCastException(D.b(ReadableArray.class));
        }
        try {
            return AbstractC2800q.e(this.elementConverter.convert(value, context, forceConversion));
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
            C7.o oVar = this.listType;
            C7.o oVarC = ((q) AbstractC2800q.e0(this.listType.getArguments())).c();
            AbstractC2855l.d(oVarC);
            throw new CollectionElementCastException(oVar, oVarC, D.b(value.getClass()), unexpectedException);
        }
    }
}
