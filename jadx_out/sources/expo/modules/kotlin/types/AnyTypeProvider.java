package expo.modules.kotlin.types;

import android.net.Uri;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.typedarray.BigInt64Array;
import expo.modules.kotlin.typedarray.BigUint64Array;
import expo.modules.kotlin.typedarray.Float32Array;
import expo.modules.kotlin.typedarray.Float64Array;
import expo.modules.kotlin.typedarray.Int16Array;
import expo.modules.kotlin.typedarray.Int32Array;
import expo.modules.kotlin.typedarray.Int8Array;
import expo.modules.kotlin.typedarray.TypedArray;
import expo.modules.kotlin.typedarray.Uint16Array;
import expo.modules.kotlin.typedarray.Uint32Array;
import expo.modules.kotlin.typedarray.Uint8Array;
import expo.modules.kotlin.typedarray.Uint8ClampedArray;
import i7.C2735B;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.D;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R@\u0010\t\u001a\"\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\b0\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lexpo/modules/kotlin/types/AnyTypeProvider;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Pair;", "LC7/d;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/AnyType;", "typesMap", "Ljava/util/Map;", "getTypesMap", "()Ljava/util/Map;", "getTypesMap$annotations", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnyTypeProvider {
    public static final AnyTypeProvider INSTANCE = new AnyTypeProvider();
    private static final Map<Pair<C7.d, Boolean>, AnyType> typesMap;

    static {
        Map mapC = K.c();
        for (C7.d dVar : AbstractC2800q.m(D.b(Integer.TYPE), D.b(Float.TYPE), D.b(Double.TYPE), D.b(Long.TYPE), D.b(Boolean.TYPE), D.b(String.class), D.b(byte[].class), D.b(long[].class), D.b(int[].class), D.b(boolean[].class), D.b(float[].class), D.b(double[].class), D.b(JavaScriptValue.class), D.b(JavaScriptObject.class), D.b(TypedArray.class), D.b(Int8Array.class), D.b(Int16Array.class), D.b(Int32Array.class), D.b(Uint8Array.class), D.b(Uint8ClampedArray.class), D.b(Uint16Array.class), D.b(Uint32Array.class), D.b(Float32Array.class), D.b(Float64Array.class), D.b(BigInt64Array.class), D.b(BigUint64Array.class), D.b(ReadableArray.class), D.b(ReadableMap.class), D.b(URL.class), D.b(Uri.class), D.b(URI.class), D.b(File.class), D.b(Object.class), D.b(C2735B.class), D.b(ReadableArguments.class))) {
            mapC.put(t.a(dVar, Boolean.FALSE), new AnyType(new EmptyKType(dVar, false), null, 2, null));
            mapC.put(t.a(dVar, Boolean.TRUE), new AnyType(new EmptyKType(dVar, true), null, 2, null));
        }
        typesMap = K.b(mapC);
    }

    private AnyTypeProvider() {
    }

    public final Map<Pair<C7.d, Boolean>, AnyType> getTypesMap() {
        return typesMap;
    }

    public static /* synthetic */ void getTypesMap$annotations() {
    }
}
