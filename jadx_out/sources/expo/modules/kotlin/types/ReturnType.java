package expo.modules.kotlin.types;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.records.formatters.FormattedRecord;
import expo.modules.kotlin.typedarray.RawTypedArrayHolder;
import expo.modules.kotlin.types.JSTypeConverter;
import i7.C2735B;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\n\"\u0006\b\u0000\u0010\t\u0018\u0001H\u0080\b¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lexpo/modules/kotlin/types/ReturnType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "LC7/d;", "klass", "<init>", "(LC7/d;)V", "value", "convertToJS", "(Ljava/lang/Object;)Ljava/lang/Object;", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "inheritFrom$expo_modules_core_release", "()Z", "inheritFrom", "LC7/d;", "Lexpo/modules/kotlin/types/JSTypeConverter;", "converter", "Lexpo/modules/kotlin/types/JSTypeConverter;", "Lexpo/modules/kotlin/jni/ReturnType;", "getCppType", "()Lexpo/modules/kotlin/jni/ReturnType;", "cppType", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReturnType {
    private final JSTypeConverter<?> converter;
    private final C7.d klass;

    public ReturnType(C7.d klass) {
        AbstractC2855l.g(klass, "klass");
        this.klass = klass;
        JSTypeConverter<?> passThroughConverter = AbstractC2855l.b(klass, D.b(C2735B.class)) ? new JSTypeConverter.PassThroughConverter() : AbstractC2855l.b(klass, D.b(Bundle.class)) ? new JSTypeConverter.BundleConverter() : AbstractC2855l.b(klass, D.b(int[].class)) ? new JSTypeConverter.IntArrayConverter() : AbstractC2855l.b(klass, D.b(float[].class)) ? new JSTypeConverter.FloatArrayConverter() : AbstractC2855l.b(klass, D.b(double[].class)) ? new JSTypeConverter.DoubleArrayConverter() : AbstractC2855l.b(klass, D.b(boolean[].class)) ? new JSTypeConverter.BooleanArrayConverter() : AbstractC2855l.b(klass, D.b(byte[].class)) ? new JSTypeConverter.ByteArrayConverter() : AbstractC2855l.b(klass, D.b(URI.class)) ? new JSTypeConverter.URIConverter() : AbstractC2855l.b(klass, D.b(URL.class)) ? new JSTypeConverter.URLConverter() : AbstractC2855l.b(klass, D.b(Uri.class)) ? new JSTypeConverter.AndroidUriConverter() : AbstractC2855l.b(klass, D.b(File.class)) ? new JSTypeConverter.FileConverter() : AbstractC2855l.b(klass, D.b(Pair.class)) ? new JSTypeConverter.PairConverter() : AbstractC2855l.b(klass, D.b(Long.TYPE)) ? new JSTypeConverter.LongConverter() : AbstractC2855l.b(klass, D.b(Q8.a.class)) ? new JSTypeConverter.DurationConverter() : AbstractC2855l.b(klass, D.b(Object.class)) ? new JSTypeConverter.AnyConverter() : null;
        this.converter = passThroughConverter == null ? Map.class.isAssignableFrom(AbstractC3430a.b(this.klass)) ? new JSTypeConverter.MapConverter() : Enum.class.isAssignableFrom(AbstractC3430a.b(this.klass)) ? new JSTypeConverter.EnumConverter() : Record.class.isAssignableFrom(AbstractC3430a.b(this.klass)) ? new JSTypeConverter.RecordConverter() : FormattedRecord.class.isAssignableFrom(AbstractC3430a.b(this.klass)) ? new JSTypeConverter.FormattedRecordConverter() : RawTypedArrayHolder.class.isAssignableFrom(AbstractC3430a.b(this.klass)) ? new JSTypeConverter.RawTypedArrayHolderConverter() : Object[].class.isAssignableFrom(AbstractC3430a.b(this.klass)) ? new JSTypeConverter.ArrayConverter() : Collection.class.isAssignableFrom(AbstractC3430a.b(this.klass)) ? new JSTypeConverter.CollectionConverter() : new JSTypeConverter.PassThroughConverter() : passThroughConverter;
    }

    public final Object convertToJS(Object value) {
        return this.converter.convertToJS(value);
    }

    public final expo.modules.kotlin.jni.ReturnType getCppType() {
        return this.converter.getReturnType();
    }

    public final /* synthetic */ <T> boolean inheritFrom$expo_modules_core_release() {
        Class clsB = AbstractC3430a.b(this.klass);
        AbstractC2855l.m(4, "T");
        return Object.class.isAssignableFrom(clsB);
    }
}
