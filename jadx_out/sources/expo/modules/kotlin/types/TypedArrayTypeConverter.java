package expo.modules.kotlin.types;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import expo.modules.kotlin.typedarray.TypedArray;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lexpo/modules/kotlin/types/TypedArrayTypeConverter;", "Lexpo/modules/kotlin/types/BaseTypeArrayConverter;", "Lexpo/modules/kotlin/typedarray/TypedArray;", "<init>", "()V", "isTrivial", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TypedArrayTypeConverter extends BaseTypeArrayConverter<TypedArray> {
    public TypedArrayTypeConverter() {
        super(new Function1() { // from class: expo.modules.kotlin.types.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TypedArrayTypeConverter._init_$lambda$0((JavaScriptTypedArray) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypedArray _init_$lambda$0(JavaScriptTypedArray it) {
        AbstractC2855l.g(it, "it");
        return it;
    }

    @Override // expo.modules.kotlin.types.BaseTypeArrayConverter, expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return true;
    }
}
