package expo.modules.kotlin.types;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.records.formatters.FormattedRecord;
import expo.modules.kotlin.typedarray.RawTypedArrayHolder;
import expo.modules.kotlin.types.folly.FollyDynamicExtensionConverter;
import i7.C2735B;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u000b\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007J&\u0010\b\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n¨\u0006\r"}, d2 = {"Lexpo/modules/kotlin/types/JSTypeConverterProvider;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "legacyConvertToJSValue", "value", "containerProvider", "Lexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;", "convertToJSValue", "useExperimentalConverter", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ContainerProvider", "DefaultContainerProvider", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSTypeConverterProvider {
    public static final JSTypeConverterProvider INSTANCE = new JSTypeConverterProvider();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "createMap", "Lcom/facebook/react/bridge/WritableMap;", "createArray", "Lcom/facebook/react/bridge/WritableArray;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ContainerProvider {
        WritableArray createArray();

        WritableMap createMap();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/types/JSTypeConverterProvider$DefaultContainerProvider;", "Lexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;", "<init>", "()V", "createMap", "Lcom/facebook/react/bridge/WritableMap;", "createArray", "Lcom/facebook/react/bridge/WritableArray;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultContainerProvider implements ContainerProvider {
        public static final DefaultContainerProvider INSTANCE = new DefaultContainerProvider();

        private DefaultContainerProvider() {
        }

        @Override // expo.modules.kotlin.types.JSTypeConverterProvider.ContainerProvider
        public WritableArray createArray() {
            return Arguments.createArray();
        }

        @Override // expo.modules.kotlin.types.JSTypeConverterProvider.ContainerProvider
        public WritableMap createMap() {
            return Arguments.createMap();
        }
    }

    private JSTypeConverterProvider() {
    }

    public static /* synthetic */ Object convertToJSValue$default(JSTypeConverterProvider jSTypeConverterProvider, Object obj, ContainerProvider containerProvider, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            containerProvider = DefaultContainerProvider.INSTANCE;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return jSTypeConverterProvider.convertToJSValue(obj, containerProvider, z10);
    }

    public static /* synthetic */ Object legacyConvertToJSValue$default(JSTypeConverterProvider jSTypeConverterProvider, Object obj, ContainerProvider containerProvider, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            containerProvider = DefaultContainerProvider.INSTANCE;
        }
        return jSTypeConverterProvider.legacyConvertToJSValue(obj, containerProvider);
    }

    public final Object convertToJSValue(Object value, ContainerProvider containerProvider, boolean useExperimentalConverter) {
        AbstractC2855l.g(containerProvider, "containerProvider");
        if (value == null || (value instanceof C2735B)) {
            return null;
        }
        if (value instanceof Bundle) {
            return JSTypeConverterHelperKt.toJSValue((Bundle) value, containerProvider);
        }
        if (value instanceof Object[]) {
            return JSTypeConverterHelperKt.toJSValue((Object[]) value, containerProvider);
        }
        if ((value instanceof int[]) || (value instanceof float[]) || (value instanceof double[]) || (value instanceof boolean[]) || (value instanceof long[])) {
            return value;
        }
        if (value instanceof byte[]) {
            return FollyDynamicExtensionConverter.INSTANCE.put(value);
        }
        if (value instanceof Map) {
            return useExperimentalConverter ? JSTypeConverterHelperKt.toJSValueExperimental((Map) value) : JSTypeConverterHelperKt.toJSValue((Map) value, containerProvider);
        }
        if (value instanceof Enum) {
            return JSTypeConverterHelperKt.toJSValue((Enum<?>) value);
        }
        if (value instanceof Record) {
            return JSTypeConverterHelperKt.toJSValue((Record) value, containerProvider);
        }
        if (!(value instanceof FormattedRecord)) {
            return value instanceof URI ? JSTypeConverterHelperKt.toJSValue((URI) value) : value instanceof URL ? JSTypeConverterHelperKt.toJSValue((URL) value) : value instanceof Uri ? JSTypeConverterHelperKt.toJSValue((Uri) value) : value instanceof File ? JSTypeConverterHelperKt.toJSValue((File) value) : value instanceof Pair ? JSTypeConverterHelperKt.toJSValue((Pair<?, ?>) value, containerProvider) : value instanceof Long ? Double.valueOf(((Number) value).longValue()) : value instanceof Q8.a ? Double.valueOf(Q8.a.J(((Q8.a) value).N(), Q8.d.f9889k)) : value instanceof RawTypedArrayHolder ? ((RawTypedArrayHolder) value).getRawArray() : value instanceof Collection ? useExperimentalConverter ? JSTypeConverterHelperKt.toJSValueExperimental((Collection) value) : JSTypeConverterHelperKt.toJSValue((Collection) value, containerProvider) : value;
        }
        if (useExperimentalConverter) {
            return JSTypeConverterHelperKt.toJSValueExperimental((FormattedRecord<?>) value);
        }
        throw new IllegalStateException("FormattedRecord should be converted using the experimental converter.");
    }

    public final Object legacyConvertToJSValue(Object value, ContainerProvider containerProvider) {
        AbstractC2855l.g(containerProvider, "containerProvider");
        if (value == null || (value instanceof C2735B)) {
            return null;
        }
        return value instanceof Bundle ? JSTypeConverterHelperKt.toJSValue((Bundle) value, containerProvider) : value instanceof Object[] ? JSTypeConverterHelperKt.toJSValue((Object[]) value, containerProvider) : value instanceof int[] ? JSTypeConverterHelperKt.toJSValue((int[]) value, containerProvider) : value instanceof long[] ? JSTypeConverterHelperKt.toJSValue((long[]) value, containerProvider) : value instanceof float[] ? JSTypeConverterHelperKt.toJSValue((float[]) value, containerProvider) : value instanceof double[] ? JSTypeConverterHelperKt.toJSValue((double[]) value, containerProvider) : value instanceof boolean[] ? JSTypeConverterHelperKt.toJSValue((boolean[]) value, containerProvider) : value instanceof byte[] ? FollyDynamicExtensionConverter.INSTANCE.put(value) : value instanceof Map ? JSTypeConverterHelperKt.toJSValue((Map) value, containerProvider) : value instanceof Enum ? JSTypeConverterHelperKt.toJSValue((Enum<?>) value) : value instanceof Record ? JSTypeConverterHelperKt.toJSValue((Record) value, containerProvider) : value instanceof FormattedRecord ? new IllegalStateException("FormattedRecord should be converted using the experimental converter.") : value instanceof URI ? JSTypeConverterHelperKt.toJSValue((URI) value) : value instanceof URL ? JSTypeConverterHelperKt.toJSValue((URL) value) : value instanceof Uri ? JSTypeConverterHelperKt.toJSValue((Uri) value) : value instanceof File ? JSTypeConverterHelperKt.toJSValue((File) value) : value instanceof Pair ? JSTypeConverterHelperKt.toJSValue((Pair<?, ?>) value, containerProvider) : value instanceof Long ? Double.valueOf(((Number) value).longValue()) : value instanceof Q8.a ? Double.valueOf(Q8.a.J(((Q8.a) value).N(), Q8.d.f9889k)) : value instanceof RawTypedArrayHolder ? ((RawTypedArrayHolder) value).getRawArray() : value instanceof Collection ? JSTypeConverterHelperKt.toJSValue((Collection) value, containerProvider) : value;
    }
}
