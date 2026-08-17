package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.jni.CppType;
import expo.modules.kotlin.jni.ExpectedType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/types/DurationTypeConverter;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "LQ8/a;", "<init>", "()V", "Lcom/facebook/react/bridge/Dynamic;", "value", "Lexpo/modules/kotlin/AppContext;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "forceConversion", "convertFromDynamic-ZBGTal8", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;Z)J", "convertFromDynamic", PointerEventHelper.POINTER_TYPE_UNKNOWN, "convertFromAny-ZBGTal8", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)J", "convertFromAny", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "isTrivial", "()Z", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DurationTypeConverter extends DynamicAwareTypeConverters<Q8.a> {
    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public /* bridge */ /* synthetic */ Q8.a convertFromAny(Object obj, AppContext appContext, boolean z10) {
        return Q8.a.j(m262convertFromAnyZBGTal8(obj, appContext, z10));
    }

    /* JADX INFO: renamed from: convertFromAny-ZBGTal8, reason: not valid java name */
    public long m262convertFromAnyZBGTal8(Object value, AppContext context, boolean forceConversion) {
        AbstractC2855l.g(value, "value");
        return Q8.c.i(((Double) value).doubleValue(), Q8.d.f9889k);
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public /* bridge */ /* synthetic */ Q8.a convertFromDynamic(Dynamic dynamic, AppContext appContext, boolean z10) {
        return Q8.a.j(m263convertFromDynamicZBGTal8(dynamic, appContext, z10));
    }

    /* JADX INFO: renamed from: convertFromDynamic-ZBGTal8, reason: not valid java name */
    public long m263convertFromDynamicZBGTal8(Dynamic value, AppContext context, boolean forceConversion) {
        AbstractC2855l.g(value, "value");
        if (value.getType() == ReadableType.Number) {
            return Q8.c.i(value.asDouble(), Q8.d.f9889k);
        }
        throw new IllegalArgumentException("Expected a number, but received " + value.getType());
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return new ExpectedType(CppType.DOUBLE);
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }
}
