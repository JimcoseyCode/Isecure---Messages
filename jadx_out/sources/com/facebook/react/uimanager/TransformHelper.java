package com.facebook.react.uimanager;

import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0016JA\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0010\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010!\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010 H\u0083 ¢\u0006\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/facebook/react/uimanager/TransformHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "transformMap", PointerEventHelper.POINTER_TYPE_UNKNOWN, "key", PointerEventHelper.POINTER_TYPE_UNKNOWN, "convertToRadians", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D", "Lcom/facebook/react/bridge/ReadableArray;", "transforms", PointerEventHelper.POINTER_TYPE_UNKNOWN, "result", "Li7/B;", "processTransform", "(Lcom/facebook/react/bridge/ReadableArray;[D)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewWidth", "viewHeight", ViewProps.TRANSFORM_ORIGIN, "(Lcom/facebook/react/bridge/ReadableArray;[DFFLcom/facebook/react/bridge/ReadableArray;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "allowPercentageResolution", "(Lcom/facebook/react/bridge/ReadableArray;[DFFLcom/facebook/react/bridge/ReadableArray;Z)V", "stringValue", "dimension", "parseTranslateValue", "(Ljava/lang/String;D)D", "getTranslateForTransformOrigin", "(FFLcom/facebook/react/bridge/ReadableArray;Z)[D", "Lcom/facebook/react/bridge/NativeArray;", "nativeProcessTransform", "(Lcom/facebook/react/bridge/NativeArray;[DFFLcom/facebook/react/bridge/NativeArray;)V", "Ljava/lang/ThreadLocal;", "helperMatrix", "Ljava/lang/ThreadLocal;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransformHelper {
    public static final TransformHelper INSTANCE = new TransformHelper();
    private static final ThreadLocal<double[]> helperMatrix = new ThreadLocal<double[]>() { // from class: com.facebook.react.uimanager.TransformHelper$helperMatrix$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public double[] initialValue() {
            return new double[16];
        }
    };

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TransformHelper() {
    }

    private final double convertToRadians(ReadableMap transformMap, String key) {
        double d10;
        boolean z10 = true;
        if (transformMap.getType(key) == ReadableType.String) {
            String string = transformMap.getString(key);
            AbstractC2855l.d(string);
            if (P8.q.w(string, "rad", false, 2, null)) {
                string = P8.q.f1(string, 3);
            } else if (P8.q.w(string, "deg", false, 2, null)) {
                string = P8.q.f1(string, 3);
                z10 = false;
            }
            d10 = Double.parseDouble(string);
        } else {
            d10 = transformMap.getDouble(key);
        }
        return z10 ? d10 : MatrixMathHelper.degreesToRadians(d10);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final double[] getTranslateForTransformOrigin(float viewWidth, float viewHeight, ReadableArray transformOrigin, boolean allowPercentageResolution) {
        boolean z10;
        int i10;
        if (transformOrigin == null || (viewHeight == 0.0f && viewWidth == 0.0f)) {
            return null;
        }
        double d10 = ((double) viewWidth) / 2.0d;
        double d11 = ((double) viewHeight) / 2.0d;
        double[] dArr = new double[3];
        boolean z11 = false;
        dArr[0] = d10;
        int i11 = 1;
        dArr[1] = d11;
        dArr[2] = 0.0d;
        int iMin = Math.min(transformOrigin.size(), 3);
        int i12 = 0;
        while (i12 < iMin) {
            int i13 = WhenMappings.$EnumSwitchMapping$0[transformOrigin.getType(i12).ordinal()];
            if (i13 == i11) {
                z10 = z11;
                i10 = i11;
                dArr[i12] = transformOrigin.getDouble(i12);
            } else if (i13 == 2 && allowPercentageResolution) {
                String string = transformOrigin.getString(i12);
                AbstractC2855l.d(string);
                if (P8.q.w(string, "%", z11, 2, null)) {
                    double d12 = Double.parseDouble(P8.q.f1(string, i11));
                    z10 = z11;
                    i10 = i11;
                    dArr[i12] = (((double) (i12 == 0 ? viewWidth : viewHeight)) * d12) / 100.0d;
                } else {
                    z10 = z11;
                    i10 = i11;
                }
            }
            i12++;
            z11 = z10;
            i11 = i10;
        }
        boolean z12 = z11;
        int i14 = i11;
        double d13 = (-d10) + dArr[z12 ? 1 : 0];
        double d14 = (-d11) + dArr[i14];
        double d15 = dArr[2];
        double[] dArr2 = new double[3];
        dArr2[z12 ? 1 : 0] = d13;
        dArr2[i14] = d14;
        dArr2[2] = d15;
        return dArr2;
    }

    private static final native void nativeProcessTransform(NativeArray transforms, double[] result, float viewWidth, float viewHeight, NativeArray transformOrigin);

    private final double parseTranslateValue(String stringValue, double dimension) {
        try {
            return P8.q.w(stringValue, "%", false, 2, null) ? (Double.parseDouble(P8.q.f1(stringValue, 1)) * dimension) / 100.0d : Double.parseDouble(stringValue);
        } catch (NumberFormatException unused) {
            AbstractC2325a.I(ReactConstants.TAG, "Invalid translate value: " + stringValue);
            return 0.0d;
        }
    }

    public static final void processTransform(ReadableArray transforms, double[] result) {
        AbstractC2855l.g(transforms, "transforms");
        AbstractC2855l.g(result, "result");
        processTransform(transforms, result, 0.0f, 0.0f, null, false);
    }

    public static final void processTransform(ReadableArray transforms, double[] result, float viewWidth, float viewHeight, ReadableArray transformOrigin) {
        AbstractC2855l.g(transforms, "transforms");
        AbstractC2855l.g(result, "result");
        processTransform(transforms, result, viewWidth, viewHeight, transformOrigin, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024a A[PHI: r6 r7
      0x024a: PHI (r6v24 int) = 
      (r6v4 int)
      (r6v5 int)
      (r6v6 int)
      (r6v7 int)
      (r6v8 int)
      (r6v9 int)
      (r6v10 int)
      (r6v11 int)
      (r6v12 int)
      (r6v13 int)
      (r6v25 int)
     binds: [B:107:0x0248, B:97:0x0218, B:91:0x01f9, B:87:0x01e1, B:83:0x01cb, B:79:0x01b5, B:75:0x019c, B:71:0x0184, B:67:0x016c, B:63:0x0156, B:29:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r7v25 char) = 
      (r7v4 char)
      (r7v5 char)
      (r7v6 char)
      (r7v7 char)
      (r7v8 char)
      (r7v9 char)
      (r7v10 char)
      (r7v11 char)
      (r7v12 char)
      (r7v13 char)
      (r7v26 char)
     binds: [B:107:0x0248, B:97:0x0218, B:91:0x01f9, B:87:0x01e1, B:83:0x01cb, B:79:0x01b5, B:75:0x019c, B:71:0x0184, B:67:0x016c, B:63:0x0156, B:29:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void processTransform(ReadableArray transforms, double[] result, float viewWidth, float viewHeight, ReadableArray transformOrigin, boolean allowPercentageResolution) {
        int i10;
        char c10;
        double translateValue;
        double translateValue2;
        double[] dArr;
        double translateValue3;
        double d10;
        double translateValue4;
        AbstractC2855l.g(transforms, "transforms");
        AbstractC2855l.g(result, "result");
        int i11 = 1;
        if (allowPercentageResolution && ReactNativeFeatureFlags.useNativeTransformHelperAndroid() && (transforms instanceof NativeArray)) {
            if (transformOrigin == 0 ? true : transformOrigin instanceof NativeArray) {
                nativeProcessTransform((NativeArray) transforms, result, viewWidth, viewHeight, (NativeArray) transformOrigin);
                return;
            }
        }
        double[] dArr2 = helperMatrix.get();
        AbstractC2855l.d(dArr2);
        double[] dArr3 = dArr2;
        MatrixMathHelper.resetIdentityMatrix(result);
        double[] translateForTransformOrigin = INSTANCE.getTranslateForTransformOrigin(viewWidth, viewHeight, transformOrigin, allowPercentageResolution);
        if (translateForTransformOrigin != null) {
            MatrixMathHelper.resetIdentityMatrix(dArr3);
            MatrixMathHelper.applyTranslate3D(dArr3, translateForTransformOrigin[0], translateForTransformOrigin[1], translateForTransformOrigin[2]);
            MatrixMathHelper.multiplyInto(result, result, dArr3);
        }
        if (transforms.size() == 16 && transforms.getType(0) == ReadableType.Number) {
            MatrixMathHelper.resetIdentityMatrix(dArr3);
            int size = transforms.size();
            for (int i12 = 0; i12 < size; i12++) {
                dArr3[i12] = transforms.getDouble(i12);
            }
            MatrixMathHelper.multiplyInto(result, result, dArr3);
        } else {
            int size2 = transforms.size();
            int i13 = 0;
            while (i13 < size2) {
                ReadableMap map = transforms.getMap(i13);
                AbstractC2855l.d(map);
                String strNextKey = map.keySetIterator().nextKey();
                MatrixMathHelper.resetIdentityMatrix(dArr3);
                int i14 = i13;
                switch (strNextKey.hashCode()) {
                    case -1721943862:
                        i10 = size2;
                        c10 = 16;
                        if (!strNextKey.equals(ViewProps.TRANSLATE_X)) {
                            AbstractC2325a.I(ReactConstants.TAG, "Unsupported transform type: " + strNextKey);
                        } else {
                            if (map.getType(strNextKey) == ReadableType.String && allowPercentageResolution) {
                                TransformHelper transformHelper = INSTANCE;
                                String string = map.getString(strNextKey);
                                AbstractC2855l.d(string);
                                translateValue = transformHelper.parseTranslateValue(string, viewWidth);
                            } else {
                                translateValue = map.getDouble(strNextKey);
                            }
                            MatrixMathHelper.applyTranslate2D(dArr3, translateValue, 0.0d);
                        }
                        break;
                    case -1721943861:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals(ViewProps.TRANSLATE_Y)) {
                            if (map.getType(strNextKey) == ReadableType.String && allowPercentageResolution) {
                                TransformHelper transformHelper2 = INSTANCE;
                                String string2 = map.getString(strNextKey);
                                AbstractC2855l.d(string2);
                                translateValue2 = transformHelper2.parseTranslateValue(string2, viewHeight);
                            } else {
                                translateValue2 = map.getDouble(strNextKey);
                            }
                            MatrixMathHelper.applyTranslate2D(dArr3, 0.0d, translateValue2);
                            break;
                        }
                        break;
                    case -1081239615:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals("matrix")) {
                            ReadableArray array = map.getArray(strNextKey);
                            AbstractC2855l.d(array);
                            for (int i15 = 0; i15 < 16; i15++) {
                                dArr3[i15] = array.getDouble(i15);
                            }
                            break;
                        }
                        break;
                    case -925180581:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals("rotate")) {
                            MatrixMathHelper.applyRotateZ(dArr3, INSTANCE.convertToRadians(map, strNextKey));
                            break;
                        }
                        break;
                    case -908189618:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals(ViewProps.SCALE_X)) {
                            MatrixMathHelper.applyScaleX(dArr3, map.getDouble(strNextKey));
                            break;
                        }
                        break;
                    case -908189617:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals(ViewProps.SCALE_Y)) {
                            MatrixMathHelper.applyScaleY(dArr3, map.getDouble(strNextKey));
                            break;
                        }
                        break;
                    case 109250890:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals("scale")) {
                            double d11 = map.getDouble(strNextKey);
                            MatrixMathHelper.applyScaleX(dArr3, d11);
                            MatrixMathHelper.applyScaleY(dArr3, d11);
                            break;
                        }
                        break;
                    case 109493390:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals("skewX")) {
                            MatrixMathHelper.applySkewX(dArr3, INSTANCE.convertToRadians(map, strNextKey));
                            break;
                        }
                        break;
                    case 109493391:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals("skewY")) {
                            MatrixMathHelper.applySkewY(dArr3, INSTANCE.convertToRadians(map, strNextKey));
                            break;
                        }
                        break;
                    case 207960636:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals("perspective")) {
                            MatrixMathHelper.applyPerspective(dArr3, map.getDouble(strNextKey));
                            break;
                        }
                        break;
                    case 1052832078:
                        if (strNextKey.equals("translate")) {
                            ReadableArray array2 = map.getArray(strNextKey);
                            AbstractC2855l.d(array2);
                            ReadableType type = array2.getType(0);
                            ReadableType readableType = ReadableType.String;
                            if (type == readableType && allowPercentageResolution) {
                                TransformHelper transformHelper3 = INSTANCE;
                                String string3 = array2.getString(0);
                                AbstractC2855l.d(string3);
                                dArr = dArr3;
                                translateValue3 = transformHelper3.parseTranslateValue(string3, viewWidth);
                            } else {
                                dArr = dArr3;
                                translateValue3 = array2.getDouble(0);
                            }
                            if (array2.getType(i11) == readableType && allowPercentageResolution) {
                                TransformHelper transformHelper4 = INSTANCE;
                                String string4 = array2.getString(i11);
                                AbstractC2855l.d(string4);
                                d10 = translateValue3;
                                translateValue4 = transformHelper4.parseTranslateValue(string4, viewHeight);
                            } else {
                                d10 = translateValue3;
                                translateValue4 = array2.getDouble(i11);
                            }
                            dArr3 = dArr;
                            double d12 = translateValue4;
                            i10 = size2;
                            c10 = 16;
                            MatrixMathHelper.applyTranslate3D(dArr3, d10, d12, array2.size() > 2 ? array2.getDouble(2) : 0.0d);
                        }
                        i10 = size2;
                        c10 = 16;
                        AbstractC2325a.I(ReactConstants.TAG, "Unsupported transform type: " + strNextKey);
                        break;
                    case 1384173149:
                        if (strNextKey.equals("rotateX")) {
                            MatrixMathHelper.applyRotateX(dArr3, INSTANCE.convertToRadians(map, strNextKey));
                            i10 = size2;
                            c10 = 16;
                        }
                        i10 = size2;
                        c10 = 16;
                        AbstractC2325a.I(ReactConstants.TAG, "Unsupported transform type: " + strNextKey);
                        break;
                    case 1384173150:
                        if (strNextKey.equals("rotateY")) {
                            MatrixMathHelper.applyRotateY(dArr3, INSTANCE.convertToRadians(map, strNextKey));
                            i10 = size2;
                            c10 = 16;
                        }
                        i10 = size2;
                        c10 = 16;
                        AbstractC2325a.I(ReactConstants.TAG, "Unsupported transform type: " + strNextKey);
                        break;
                    case 1384173151:
                        if (strNextKey.equals("rotateZ")) {
                            i10 = size2;
                            c10 = 16;
                            MatrixMathHelper.applyRotateZ(dArr3, INSTANCE.convertToRadians(map, strNextKey));
                        }
                        i10 = size2;
                        c10 = 16;
                        AbstractC2325a.I(ReactConstants.TAG, "Unsupported transform type: " + strNextKey);
                        break;
                    default:
                        i10 = size2;
                        c10 = 16;
                        AbstractC2325a.I(ReactConstants.TAG, "Unsupported transform type: " + strNextKey);
                        break;
                }
                MatrixMathHelper.multiplyInto(result, result, dArr3);
                i13 = i14 + 1;
                size2 = i10;
                i11 = 1;
            }
        }
        if (translateForTransformOrigin != null) {
            MatrixMathHelper.resetIdentityMatrix(dArr3);
            MatrixMathHelper.applyTranslate3D(dArr3, -translateForTransformOrigin[0], -translateForTransformOrigin[1], -translateForTransformOrigin[2]);
            MatrixMathHelper.multiplyInto(result, result, dArr3);
        }
    }
}
