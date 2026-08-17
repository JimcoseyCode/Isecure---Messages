package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.logging.Logger;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.CoreLoggerKt;
import expo.modules.kotlin.KClassExtensionsKt;
import expo.modules.kotlin.ReadableTypeExtensionsKt;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.EnumNoSuchValueException;
import expo.modules.kotlin.exception.IncompatibleArgTypeException;
import expo.modules.kotlin.jni.ExpectedType;
import j7.AbstractC2800q;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0004\u0018\u00010\r*\u00020\r2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010!\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\"J-\u0010#\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u001d\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010$R\u001e\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%RH\u0010\n\u001a6\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 &*\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0002 &*\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0002\b\u0003 &*\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u00020\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u001e\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lexpo/modules/kotlin/types/EnumTypeConverter;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "LC7/d;", "enumClass", "<init>", "(LC7/d;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "stringRepresentation", PointerEventHelper.POINTER_TYPE_UNKNOWN, "enumConstants", "convertEnumWithoutParameter", "(Ljava/lang/String;[Ljava/lang/Enum;)Ljava/lang/Enum;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "jsValue", "parameterName", "convertEnumWithParameter", "(Ljava/lang/Object;[Ljava/lang/Enum;Ljava/lang/String;)Ljava/lang/Enum;", "Ljava/lang/Class;", "parameterType", "unwrapValue", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isTrivial", "()Z", "Lcom/facebook/react/bridge/Dynamic;", "value", "Lexpo/modules/kotlin/AppContext;", "context", "forceConversion", "convertFromDynamic", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;Z)Ljava/lang/Enum;", "convertFromAny", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)Ljava/lang/Enum;", "LC7/d;", "kotlin.jvm.PlatformType", "[Ljava/lang/Enum;", "LC7/g;", "primaryConstructor", "LC7/g;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EnumTypeConverter extends DynamicAwareTypeConverters<Enum<?>> {
    private final C7.d enumClass;
    private final Enum<?>[] enumConstants;
    private final C7.g primaryConstructor;

    public EnumTypeConverter(C7.d enumClass) {
        AbstractC2855l.g(enumClass, "enumClass");
        this.enumClass = enumClass;
        Object[] enumConstants = AbstractC3430a.b(enumClass).getEnumConstants();
        if (enumConstants == null) {
            throw new IllegalArgumentException("Passed type is not an enum type");
        }
        Enum<?>[] enumArr = (Enum[]) enumConstants;
        if (enumArr.length == 0) {
            throw new IllegalArgumentException("Passed enum type is empty");
        }
        this.enumConstants = enumArr;
        C7.g fastPrimaryConstructor = KClassExtensionsKt.getFastPrimaryConstructor(enumClass);
        if (fastPrimaryConstructor == null) {
            throw new IllegalArgumentException("Cannot convert js value to enum without the primary constructor");
        }
        this.primaryConstructor = fastPrimaryConstructor;
        if (Enumerable.class.isAssignableFrom(AbstractC3430a.b(enumClass))) {
            return;
        }
        Logger.error$default(CoreLoggerKt.getLogger(), "Enum '" + enumClass + "' should inherit from " + D.b(Enumerable.class) + ".", null, 2, null);
    }

    private final Enum<?> convertEnumWithParameter(Object jsValue, Enum<?>[] enumConstants, String parameterName) throws NoSuchFieldException {
        Enum<?> r42;
        Field declaredField = AbstractC3430a.b(this.enumClass).getDeclaredField(parameterName);
        if (declaredField == null) {
            throw new IllegalArgumentException(("Cannot find a property for " + parameterName + " parameter").toString());
        }
        declaredField.setAccessible(true);
        Class<?> type = declaredField.getType();
        AbstractC2855l.d(type);
        Object objUnwrapValue = unwrapValue(jsValue, type);
        int length = enumConstants.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                r42 = null;
                break;
            }
            r42 = enumConstants[i10];
            if (AbstractC2855l.b(declaredField.get(r42), objUnwrapValue)) {
                break;
            }
            i10++;
        }
        if (r42 != null) {
            return r42;
        }
        throw new IllegalArgumentException(("Couldn't convert '" + jsValue + "' to " + this.enumClass.o() + " where " + parameterName + " is the enum parameter").toString());
    }

    private final Enum<?> convertEnumWithoutParameter(String stringRepresentation, Enum<?>[] enumConstants) throws EnumNoSuchValueException {
        Enum<?> r22;
        int length = enumConstants.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                r22 = null;
                break;
            }
            r22 = enumConstants[i10];
            if (AbstractC2855l.b(r22.name(), stringRepresentation)) {
                break;
            }
            i10++;
        }
        if (r22 != null) {
            return r22;
        }
        throw new EnumNoSuchValueException(this.enumClass, enumConstants, stringRepresentation);
    }

    private final Object unwrapValue(Object obj, Class<?> cls) {
        if (obj instanceof Dynamic) {
            return AbstractC2855l.b(cls, String.class) ? ((Dynamic) obj).asString() : Integer.valueOf(((Dynamic) obj).asInt());
        }
        if (AbstractC2855l.b(cls, String.class)) {
            AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.String");
            return (String) obj;
        }
        if (obj instanceof Double) {
            return Integer.valueOf((int) ((Number) obj).doubleValue());
        }
        AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.Int");
        return (Integer) obj;
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return ExpectedType.INSTANCE.forEnum();
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Enum<?> convertFromAny(Object value, AppContext context, boolean forceConversion) throws IncompatibleArgTypeException {
        AbstractC2855l.g(value, "value");
        if (this.primaryConstructor.getParameters().isEmpty()) {
            return convertEnumWithoutParameter((String) value, this.enumConstants);
        }
        if (this.primaryConstructor.getParameters().size() != 1) {
            throw new IncompatibleArgTypeException(D.b(value.getClass()), this.enumClass, null, 4, null);
        }
        Enum<?>[] enumArr = this.enumConstants;
        String name = ((C7.j) AbstractC2800q.e0(this.primaryConstructor.getParameters())).getName();
        AbstractC2855l.d(name);
        return convertEnumWithParameter(value, enumArr, name);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Enum<?> convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws DynamicCastException, IncompatibleArgTypeException {
        AbstractC2855l.g(value, "value");
        if (this.primaryConstructor.getParameters().isEmpty()) {
            String strAsString = value.asString();
            if (strAsString != null) {
                return convertEnumWithoutParameter(strAsString, this.enumConstants);
            }
            throw new DynamicCastException(D.b(String.class));
        }
        if (this.primaryConstructor.getParameters().size() != 1) {
            throw new IncompatibleArgTypeException(ReadableTypeExtensionsKt.toKClass(value.getType()), this.enumClass, null, 4, null);
        }
        Enum<?>[] enumArr = this.enumConstants;
        String name = ((C7.j) AbstractC2800q.e0(this.primaryConstructor.getParameters())).getName();
        AbstractC2855l.d(name);
        return convertEnumWithParameter(value, enumArr, name);
    }
}
