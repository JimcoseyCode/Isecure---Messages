package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.UnsupportedClass;
import expo.modules.kotlin.jni.ExpectedType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a<\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0006\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"createTrivialTypeConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cppRequireType", "Lexpo/modules/kotlin/jni/ExpectedType;", "dynamicFallback", "Lkotlin/Function1;", "Lcom/facebook/react/bridge/Dynamic;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TypeConverterKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: expo.modules.kotlin.types.TypeConverterKt$createTrivialTypeConverter$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J'\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\tJ'\u0010\n\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"expo/modules/kotlin/types/TypeConverterKt$createTrivialTypeConverter$2", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "convertFromDynamic", "value", "Lcom/facebook/react/bridge/Dynamic;", "context", "Lexpo/modules/kotlin/AppContext;", "forceConversion", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;Z)Ljava/lang/Object;", "convertFromAny", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)Ljava/lang/Object;", "getCppRequiredTypes", "Lexpo/modules/kotlin/jni/ExpectedType;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass2<T> extends DynamicAwareTypeConverters<T> {
        final /* synthetic */ ExpectedType $cppRequireType;
        final /* synthetic */ Function1 $dynamicFallback;

        public AnonymousClass2(Function1 function1, ExpectedType expectedType) {
            this.$dynamicFallback = function1;
            this.$cppRequireType = expectedType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
        public T convertFromAny(Object value, AppContext context, boolean forceConversion) {
            AbstractC2855l.g(value, "value");
            AbstractC2855l.m(1, "T");
            return value;
        }

        @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
        public T convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) {
            AbstractC2855l.g(value, "value");
            return (T) this.$dynamicFallback.invoke(value);
        }

        @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
        /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
        public ExpectedType get$cppRequireType() {
            return this.$cppRequireType;
        }
    }

    public static final /* synthetic */ <T> TypeConverter<T> createTrivialTypeConverter(ExpectedType cppRequireType, Function1 dynamicFallback) {
        AbstractC2855l.g(cppRequireType, "cppRequireType");
        AbstractC2855l.g(dynamicFallback, "dynamicFallback");
        AbstractC2855l.l();
        return new AnonymousClass2(dynamicFallback, cppRequireType);
    }

    public static /* synthetic */ TypeConverter createTrivialTypeConverter$default(ExpectedType cppRequireType, Function1 dynamicFallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            AbstractC2855l.l();
            dynamicFallback = new Function1() { // from class: expo.modules.kotlin.types.TypeConverterKt.createTrivialTypeConverter.1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Dynamic it) throws UnsupportedClass {
                    AbstractC2855l.g(it, "it");
                    AbstractC2855l.m(4, "T");
                    throw new UnsupportedClass(D.b(Object.class));
                }
            };
        }
        AbstractC2855l.g(cppRequireType, "cppRequireType");
        AbstractC2855l.g(dynamicFallback, "dynamicFallback");
        AbstractC2855l.l();
        return new AnonymousClass2(dynamicFallback, cppRequireType);
    }
}
