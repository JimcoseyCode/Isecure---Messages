package expo.modules.kotlin.types;

import C7.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.jni.CppType;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import expo.modules.kotlin.types.TypeConverter;
import expo.modules.kotlin.types.ValueOrUndefined;
import j7.AbstractC2800q;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lexpo/modules/kotlin/types/ValueOrUndefinedTypeConverter;", "Lexpo/modules/kotlin/types/TypeConverter;", "Lexpo/modules/kotlin/types/ValueOrUndefined;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "LC7/o;", "innerType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;LC7/o;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "Lexpo/modules/kotlin/AppContext;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "forceConversion", "convert", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)Lexpo/modules/kotlin/types/ValueOrUndefined;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "isTrivial", "()Z", "innerTypeConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ValueOrUndefinedTypeConverter implements TypeConverter<ValueOrUndefined<?>> {
    private final TypeConverter<?> innerTypeConverter;

    public ValueOrUndefinedTypeConverter(TypeConverterProvider converterProvider, C7.o innerType) {
        AbstractC2855l.g(converterProvider, "converterProvider");
        AbstractC2855l.g(innerType, "innerType");
        C7.o oVarC = ((q) AbstractC2800q.e0(innerType.getArguments())).c();
        if (oVarC == null) {
            throw new IllegalArgumentException("The ValueOrUndefined type should contain the argument type.");
        }
        this.innerTypeConverter = converterProvider.obtainTypeConverter(oVarC);
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return new ExpectedType(new SingleType(CppType.VALUE_OR_UNDEFINED, new ExpectedType[]{this.innerTypeConverter.get$cppRequireType()}));
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // expo.modules.kotlin.types.TypeConverter
    public ValueOrUndefined<?> convert(Object value, AppContext context, boolean forceConversion) {
        return value instanceof ValueOrUndefined.Undefined ? ValueOrUndefined.Undefined.INSTANCE : new ValueOrUndefined.Value(TypeConverter.DefaultImpls.convert$default(this.innerTypeConverter, value, context, false, 4, null));
    }
}
