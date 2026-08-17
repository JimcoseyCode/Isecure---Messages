package com.facebook.react.uimanager;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o3.AbstractC3007a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b;\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001KB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001b\u0010\u0019J'\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001e\u0010\u000fJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001f\u0010\u0017J\u001f\u0010\"\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b$\u0010%J/\u0010(\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0004H\u0007¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\tH\u0007¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0004H\u0007¢\u0006\u0004\b2\u0010.J\u0017\u00103\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tH\u0007¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u00105\u001a\u00020\u0004H\u0007¢\u0006\u0004\b6\u00107J\u001f\u00109\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u00108\u001a\u00020\u0004H\u0007¢\u0006\u0004\b9\u00107J\u001f\u0010:\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u00108\u001a\u00020\u0004H\u0007¢\u0006\u0004\b:\u00107J'\u0010=\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0004H\u0007¢\u0006\u0004\b=\u0010>J/\u0010@\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u0004H\u0007¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010B\u001a\u00020\u0004H\u0007¢\u0006\u0004\bC\u00107J\u001f\u0010D\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010B\u001a\u00020\u0004H\u0007¢\u0006\u0004\bD\u00107J\u001f\u0010E\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010B\u001a\u00020\u0004H\u0007¢\u0006\u0004\bE\u00107J\u001f\u0010F\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010B\u001a\u00020\u0004H\u0007¢\u0006\u0004\bF\u00107J\u001f\u0010G\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010B\u001a\u00020\u0004H\u0007¢\u0006\u0004\bG\u00107J\u001d\u0010H\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u00108\u001a\u00020\u0004¢\u0006\u0004\bH\u00107R\u0014\u0010I\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lcom/facebook/react/uimanager/MatrixMathHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "d", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isZero", "(D)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "out", "a", "b", "Li7/B;", "multiplyInto", "([D[D[D)V", "transformMatrix", "Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;", "ctx", "decomposeMatrix", "([DLcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;)V", "matrix", "determinant", "([D)D", "inverse", "([D)[D", "m", "transpose", "v", "result", "multiplyVectorByMatrix", "v3Length", "vector", "norm", "v3Normalize", "([DD)[D", "v3Dot", "([D[D)D", "aScale", "bScale", "v3Combine", "([D[DDD)[D", "v3Cross", "([D[D)[D", "n", "roundTo3Places", "(D)D", "createIdentityMatrix", "()[D", "degrees", "degreesToRadians", "resetIdentityMatrix", "([D)V", "perspective", "applyPerspective", "([DD)V", "factor", "applyScaleX", "applyScaleY", "x", "y", "applyTranslate2D", "([DDD)V", "z", "applyTranslate3D", "([DDDD)V", "radians", "applySkewX", "applySkewY", "applyRotateX", "applyRotateY", "applyRotateZ", "applyScaleZ", "EPSILON", "D", "MatrixDecompositionContext", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MatrixMathHelper {
    private static final double EPSILON = 1.0E-5d;
    public static final MatrixMathHelper INSTANCE = new MatrixMathHelper();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b\b\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Li7/B;", "reset", PointerEventHelper.POINTER_TYPE_UNKNOWN, "perspective", "[D", "scale", "skew", "translation", "rotationDegrees", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class MatrixDecompositionContext {
        private static final Companion Companion = new Companion(null);
        public double[] perspective = new double[4];
        public double[] scale = new double[3];
        public double[] skew = new double[3];
        public double[] translation = new double[3];
        public double[] rotationDegrees = new double[3];

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "arr", "Li7/B;", "resetArray", "([D)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void resetArray(double[] arr) {
                int length = arr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    arr[i10] = 0.0d;
                }
            }

            private Companion() {
            }
        }

        public final void reset() {
            Companion companion = Companion;
            companion.resetArray(this.perspective);
            companion.resetArray(this.scale);
            companion.resetArray(this.skew);
            companion.resetArray(this.translation);
            companion.resetArray(this.rotationDegrees);
        }
    }

    private MatrixMathHelper() {
    }

    public static final void applyPerspective(double[] m10, double perspective) {
        AbstractC2855l.g(m10, "m");
        m10[11] = ((double) (-1)) / perspective;
    }

    public static final void applyRotateX(double[] m10, double radians) {
        AbstractC2855l.g(m10, "m");
        m10[5] = Math.cos(radians);
        m10[6] = Math.sin(radians);
        m10[9] = -Math.sin(radians);
        m10[10] = Math.cos(radians);
    }

    public static final void applyRotateY(double[] m10, double radians) {
        AbstractC2855l.g(m10, "m");
        m10[0] = Math.cos(radians);
        m10[2] = -Math.sin(radians);
        m10[8] = Math.sin(radians);
        m10[10] = Math.cos(radians);
    }

    public static final void applyRotateZ(double[] m10, double radians) {
        AbstractC2855l.g(m10, "m");
        m10[0] = Math.cos(radians);
        m10[1] = Math.sin(radians);
        m10[4] = -Math.sin(radians);
        m10[5] = Math.cos(radians);
    }

    public static final void applyScaleX(double[] m10, double factor) {
        AbstractC2855l.g(m10, "m");
        m10[0] = factor;
    }

    public static final void applyScaleY(double[] m10, double factor) {
        AbstractC2855l.g(m10, "m");
        m10[5] = factor;
    }

    public static final void applySkewX(double[] m10, double radians) {
        AbstractC2855l.g(m10, "m");
        m10[4] = Math.tan(radians);
    }

    public static final void applySkewY(double[] m10, double radians) {
        AbstractC2855l.g(m10, "m");
        m10[1] = Math.tan(radians);
    }

    public static final void applyTranslate2D(double[] m10, double x10, double y10) {
        AbstractC2855l.g(m10, "m");
        m10[12] = x10;
        m10[13] = y10;
    }

    public static final void applyTranslate3D(double[] m10, double x10, double y10, double z10) {
        AbstractC2855l.g(m10, "m");
        m10[12] = x10;
        m10[13] = y10;
        m10[14] = z10;
    }

    public static final double[] createIdentityMatrix() {
        double[] dArr = new double[16];
        resetIdentityMatrix(dArr);
        return dArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0 A[LOOP:3: B:36:0x00ce->B:37:0x00d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df A[LOOP:4: B:39:0x00dd->B:40:0x00df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea A[LOOP:5: B:42:0x00e8->B:43:0x00ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void decomposeMatrix(double[] transformMatrix, MatrixDecompositionContext ctx) {
        char c10;
        int i10;
        double[][] dArr;
        int i11;
        int i12;
        double[] dArrV3Normalize;
        AbstractC2855l.g(transformMatrix, "transformMatrix");
        AbstractC2855l.g(ctx, "ctx");
        AbstractC3007a.a(transformMatrix.length == 16);
        double[] dArr2 = ctx.perspective;
        double[] dArr3 = ctx.scale;
        double[] dArr4 = ctx.skew;
        double[] dArr5 = ctx.translation;
        double[] dArr6 = ctx.rotationDegrees;
        if (INSTANCE.isZero(transformMatrix[15])) {
            return;
        }
        double[][] dArr7 = new double[4][];
        for (int i13 = 0; i13 < 4; i13++) {
            dArr7[i13] = new double[4];
        }
        double[] dArr8 = new double[16];
        for (int i14 = 0; i14 < 4; i14++) {
            for (int i15 = 0; i15 < 4; i15++) {
                int i16 = (i14 * 4) + i15;
                double d10 = transformMatrix[i16] / transformMatrix[15];
                dArr7[i14][i15] = d10;
                if (i15 == 3) {
                    d10 = 0.0d;
                }
                dArr8[i16] = d10;
            }
        }
        dArr8[15] = 1.0d;
        MatrixMathHelper matrixMathHelper = INSTANCE;
        if (matrixMathHelper.isZero(determinant(dArr8))) {
            return;
        }
        if (matrixMathHelper.isZero(dArr7[0][3])) {
            c10 = 2;
            if (matrixMathHelper.isZero(dArr7[1][3]) && matrixMathHelper.isZero(dArr7[2][3])) {
                dArr2[2] = 0.0d;
                dArr2[1] = 0.0d;
                dArr2[0] = 0.0d;
                dArr2[3] = 1.0d;
            }
            for (i10 = 0; i10 < 3; i10++) {
                dArr5[i10] = dArr7[3][i10];
            }
            dArr = new double[3][];
            for (i11 = 0; i11 < 3; i11++) {
                dArr[i11] = new double[3];
            }
            for (i12 = 0; i12 < 3; i12++) {
                double[] dArr9 = dArr[i12];
                double[] dArr10 = dArr7[i12];
                dArr9[0] = dArr10[0];
                dArr9[1] = dArr10[1];
                dArr9[c10] = dArr10[c10];
            }
            double dV3Length = v3Length(dArr[0]);
            dArr3[0] = dV3Length;
            double[] dArrV3Normalize2 = v3Normalize(dArr[0], dV3Length);
            dArr[0] = dArrV3Normalize2;
            double dV3Dot = v3Dot(dArrV3Normalize2, dArr[1]);
            dArr4[0] = dV3Dot;
            double[] dArrV3Combine = v3Combine(dArr[1], dArr[0], 1.0d, -dV3Dot);
            dArr[1] = dArrV3Combine;
            double dV3Length2 = v3Length(dArrV3Combine);
            dArr3[1] = dV3Length2;
            dArr[1] = v3Normalize(dArr[1], dV3Length2);
            dArr4[0] = dArr4[0] / dArr3[1];
            double dV3Dot2 = v3Dot(dArr[0], dArr[c10]);
            dArr4[1] = dV3Dot2;
            double[] dArrV3Combine2 = v3Combine(dArr[c10], dArr[0], 1.0d, -dV3Dot2);
            dArr[c10] = dArrV3Combine2;
            double dV3Dot3 = v3Dot(dArr[1], dArrV3Combine2);
            dArr4[c10] = dV3Dot3;
            double[] dArrV3Combine3 = v3Combine(dArr[c10], dArr[1], 1.0d, -dV3Dot3);
            dArr[c10] = dArrV3Combine3;
            double dV3Length3 = v3Length(dArrV3Combine3);
            dArr3[c10] = dV3Length3;
            dArrV3Normalize = v3Normalize(dArr[c10], dV3Length3);
            dArr[c10] = dArrV3Normalize;
            double d11 = dArr4[1];
            double d12 = dArr3[c10];
            dArr4[1] = d11 / d12;
            dArr4[c10] = dArr4[c10] / d12;
            if (v3Dot(dArr[0], v3Cross(dArr[1], dArrV3Normalize)) < 0.0d) {
                for (int i17 = 0; i17 < 3; i17++) {
                    dArr3[i17] = dArr3[i17] * (-1.0d);
                    double[] dArr11 = dArr[i17];
                    dArr11[0] = dArr11[0] * (-1.0d);
                    dArr11[1] = dArr11[1] * (-1.0d);
                    dArr11[c10] = dArr11[c10] * (-1.0d);
                }
            }
            double[] dArr12 = dArr[c10];
            dArr6[0] = roundTo3Places((-Math.atan2(dArr12[1], dArr12[c10])) * 57.29577951308232d);
            double[] dArr13 = dArr[c10];
            double d13 = -dArr13[0];
            double d14 = dArr13[1];
            double d15 = dArr13[c10];
            dArr6[1] = roundTo3Places((-Math.atan2(d13, Math.sqrt((d14 * d14) + (d15 * d15)))) * 57.29577951308232d);
            dArr6[c10] = roundTo3Places((-Math.atan2(dArr[1][0], dArr[0][0])) * 57.29577951308232d);
        }
        c10 = 2;
        double d16 = dArr7[0][3];
        double d17 = dArr7[1][3];
        double d18 = dArr7[c10][3];
        double d19 = dArr7[3][3];
        double[] dArr14 = new double[4];
        dArr14[0] = d16;
        dArr14[1] = d17;
        dArr14[c10] = d18;
        dArr14[3] = d19;
        multiplyVectorByMatrix(dArr14, transpose(inverse(dArr8)), dArr2);
        while (i10 < 3) {
        }
        dArr = new double[3][];
        while (i11 < 3) {
        }
        while (i12 < 3) {
        }
        double dV3Length4 = v3Length(dArr[0]);
        dArr3[0] = dV3Length4;
        double[] dArrV3Normalize22 = v3Normalize(dArr[0], dV3Length4);
        dArr[0] = dArrV3Normalize22;
        double dV3Dot4 = v3Dot(dArrV3Normalize22, dArr[1]);
        dArr4[0] = dV3Dot4;
        double[] dArrV3Combine4 = v3Combine(dArr[1], dArr[0], 1.0d, -dV3Dot4);
        dArr[1] = dArrV3Combine4;
        double dV3Length22 = v3Length(dArrV3Combine4);
        dArr3[1] = dV3Length22;
        dArr[1] = v3Normalize(dArr[1], dV3Length22);
        dArr4[0] = dArr4[0] / dArr3[1];
        double dV3Dot22 = v3Dot(dArr[0], dArr[c10]);
        dArr4[1] = dV3Dot22;
        double[] dArrV3Combine22 = v3Combine(dArr[c10], dArr[0], 1.0d, -dV3Dot22);
        dArr[c10] = dArrV3Combine22;
        double dV3Dot32 = v3Dot(dArr[1], dArrV3Combine22);
        dArr4[c10] = dV3Dot32;
        double[] dArrV3Combine32 = v3Combine(dArr[c10], dArr[1], 1.0d, -dV3Dot32);
        dArr[c10] = dArrV3Combine32;
        double dV3Length32 = v3Length(dArrV3Combine32);
        dArr3[c10] = dV3Length32;
        dArrV3Normalize = v3Normalize(dArr[c10], dV3Length32);
        dArr[c10] = dArrV3Normalize;
        double d112 = dArr4[1];
        double d122 = dArr3[c10];
        dArr4[1] = d112 / d122;
        dArr4[c10] = dArr4[c10] / d122;
        if (v3Dot(dArr[0], v3Cross(dArr[1], dArrV3Normalize)) < 0.0d) {
        }
        double[] dArr122 = dArr[c10];
        dArr6[0] = roundTo3Places((-Math.atan2(dArr122[1], dArr122[c10])) * 57.29577951308232d);
        double[] dArr132 = dArr[c10];
        double d132 = -dArr132[0];
        double d142 = dArr132[1];
        double d152 = dArr132[c10];
        dArr6[1] = roundTo3Places((-Math.atan2(d132, Math.sqrt((d142 * d142) + (d152 * d152)))) * 57.29577951308232d);
        dArr6[c10] = roundTo3Places((-Math.atan2(dArr[1][0], dArr[0][0])) * 57.29577951308232d);
    }

    public static final double degreesToRadians(double degrees) {
        return (degrees * 3.141592653589793d) / ((double) 180);
    }

    public static final double determinant(double[] matrix) {
        AbstractC2855l.g(matrix, "matrix");
        double d10 = matrix[0];
        double d11 = matrix[1];
        double d12 = matrix[2];
        double d13 = matrix[3];
        double d14 = matrix[4];
        double d15 = matrix[5];
        double d16 = matrix[6];
        double d17 = matrix[7];
        double d18 = matrix[8];
        double d19 = matrix[9];
        double d20 = matrix[10];
        double d21 = matrix[11];
        double d22 = matrix[12];
        double d23 = matrix[13];
        double d24 = matrix[14];
        double d25 = matrix[15];
        double d26 = d13 * d16;
        double d27 = d12 * d17;
        double d28 = d13 * d15;
        double d29 = d11 * d17;
        double d30 = d12 * d15;
        double d31 = d11 * d16;
        double d32 = d13 * d14;
        double d33 = d17 * d10;
        double d34 = d12 * d14;
        double d35 = d16 * d10;
        double d36 = d11 * d14;
        double d37 = d10 * d15;
        return ((((((((((((((((((((((((d26 * d19) * d22) - ((d27 * d19) * d22)) - ((d28 * d20) * d22)) + ((d29 * d20) * d22)) + ((d30 * d21) * d22)) - ((d31 * d21) * d22)) - ((d26 * d18) * d23)) + ((d27 * d18) * d23)) + ((d32 * d20) * d23)) - ((d33 * d20) * d23)) - ((d34 * d21) * d23)) + ((d35 * d21) * d23)) + ((d28 * d18) * d24)) - ((d29 * d18) * d24)) - ((d32 * d19) * d24)) + ((d33 * d19) * d24)) + ((d36 * d21) * d24)) - ((d21 * d37) * d24)) - ((d30 * d18) * d25)) + ((d31 * d18) * d25)) + ((d34 * d19) * d25)) - ((d35 * d19) * d25)) - ((d36 * d20) * d25)) + (d37 * d20 * d25);
    }

    public static final double[] inverse(double[] matrix) {
        AbstractC2855l.g(matrix, "matrix");
        double dDeterminant = determinant(matrix);
        if (INSTANCE.isZero(dDeterminant)) {
            return matrix;
        }
        double d10 = matrix[0];
        double d11 = matrix[1];
        double d12 = matrix[2];
        double d13 = matrix[3];
        double d14 = matrix[4];
        double d15 = matrix[5];
        double d16 = matrix[6];
        double d17 = matrix[7];
        double d18 = matrix[8];
        double d19 = matrix[9];
        double d20 = matrix[10];
        double d21 = matrix[11];
        double d22 = matrix[12];
        double d23 = matrix[13];
        double d24 = matrix[14];
        double d25 = matrix[15];
        double d26 = d16 * d21;
        double d27 = d17 * d20;
        double d28 = d17 * d19;
        double d29 = d15 * d21;
        double d30 = d16 * d19;
        double d31 = d15 * d20;
        double d32 = d13 * d20;
        double d33 = d12 * d21;
        double d34 = d13 * d19;
        double d35 = d11 * d21;
        double d36 = d12 * d19;
        double d37 = d11 * d20;
        double d38 = d12 * d17;
        double d39 = d13 * d16;
        double d40 = d13 * d15;
        double d41 = d11 * d17;
        double d42 = d12 * d15;
        double d43 = d11 * d16;
        double d44 = (d27 * d22) - (d26 * d22);
        double d45 = d17 * d18;
        double d46 = d14 * d21;
        double d47 = d16 * d18;
        double d48 = d14 * d20;
        double d49 = (d33 * d22) - (d32 * d22);
        double d50 = d13 * d18;
        double d51 = d10 * d21;
        double d52 = d12 * d18;
        double d53 = d10 * d20;
        double d54 = d13 * d14;
        double d55 = d17 * d10;
        double d56 = d12 * d14;
        double d57 = d16 * d10;
        double d58 = (((d29 * d22) - (d28 * d22)) + (d45 * d23)) - (d46 * d23);
        double d59 = d15 * d18;
        double d60 = d14 * d19;
        double d61 = (((d34 * d22) - (d35 * d22)) - (d50 * d23)) + (d51 * d23);
        double d62 = d11 * d18;
        double d63 = d10 * d19;
        double d64 = d11 * d14;
        double d65 = d10 * d15;
        return new double[]{((((((d26 * d23) - (d27 * d23)) + (d28 * d24)) - (d29 * d24)) - (d30 * d25)) + (d31 * d25)) / dDeterminant, ((((((d32 * d23) - (d33 * d23)) - (d34 * d24)) + (d35 * d24)) + (d36 * d25)) - (d37 * d25)) / dDeterminant, ((((((d38 * d23) - (d39 * d23)) + (d40 * d24)) - (d41 * d24)) - (d42 * d25)) + (d43 * d25)) / dDeterminant, ((((((d39 * d19) - (d38 * d19)) - (d40 * d20)) + (d41 * d20)) + (d42 * d21)) - (d43 * d21)) / dDeterminant, ((((d44 - (d45 * d24)) + (d46 * d24)) + (d47 * d25)) - (d48 * d25)) / dDeterminant, ((((d49 + (d50 * d24)) - (d51 * d24)) - (d52 * d25)) + (d53 * d25)) / dDeterminant, ((((((d39 * d22) - (d38 * d22)) - (d54 * d24)) + (d55 * d24)) + (d56 * d25)) - (d57 * d25)) / dDeterminant, ((((((d38 * d18) - (d39 * d18)) + (d54 * d20)) - (d55 * d20)) - (d56 * d21)) + (d57 * d21)) / dDeterminant, ((d58 - (d59 * d25)) + (d60 * d25)) / dDeterminant, ((d61 + (d62 * d25)) - (d63 * d25)) / dDeterminant, ((((((d41 * d22) - (d40 * d22)) + (d54 * d23)) - (d55 * d23)) - (d64 * d25)) + (d25 * d65)) / dDeterminant, ((((((d40 * d18) - (d41 * d18)) - (d54 * d19)) + (d55 * d19)) + (d64 * d21)) - (d21 * d65)) / dDeterminant, ((((((d30 * d22) - (d31 * d22)) - (d47 * d23)) + (d48 * d23)) + (d59 * d24)) - (d60 * d24)) / dDeterminant, ((((((d37 * d22) - (d36 * d22)) + (d52 * d23)) - (d53 * d23)) - (d62 * d24)) + (d63 * d24)) / dDeterminant, ((((((d42 * d22) - (d22 * d43)) - (d56 * d23)) + (d23 * d57)) + (d64 * d24)) - (d24 * d65)) / dDeterminant, ((((((d43 * d18) - (d42 * d18)) + (d56 * d19)) - (d57 * d19)) - (d64 * d20)) + (d65 * d20)) / dDeterminant};
    }

    private final boolean isZero(double d10) {
        return !Double.isNaN(d10) && Math.abs(d10) < EPSILON;
    }

    public static final void multiplyInto(double[] out, double[] a10, double[] b10) {
        AbstractC2855l.g(out, "out");
        AbstractC2855l.g(a10, "a");
        AbstractC2855l.g(b10, "b");
        double d10 = a10[0];
        double d11 = a10[1];
        double d12 = a10[2];
        double d13 = a10[3];
        double d14 = a10[4];
        double d15 = a10[5];
        double d16 = a10[6];
        double d17 = a10[7];
        double d18 = a10[8];
        double d19 = a10[9];
        double d20 = a10[10];
        double d21 = a10[11];
        double d22 = a10[12];
        double d23 = a10[13];
        double d24 = a10[14];
        double d25 = a10[15];
        double d26 = b10[0];
        double d27 = b10[1];
        double d28 = b10[2];
        double d29 = b10[3];
        out[0] = (d26 * d10) + (d27 * d14) + (d28 * d18) + (d29 * d22);
        out[1] = (d26 * d11) + (d27 * d15) + (d28 * d19) + (d29 * d23);
        out[2] = (d26 * d12) + (d27 * d16) + (d28 * d20) + (d29 * d24);
        out[3] = (d26 * d13) + (d27 * d17) + (d28 * d21) + (d29 * d25);
        double d30 = b10[4];
        double d31 = b10[5];
        double d32 = b10[6];
        double d33 = b10[7];
        out[4] = (d30 * d10) + (d31 * d14) + (d32 * d18) + (d33 * d22);
        out[5] = (d30 * d11) + (d31 * d15) + (d32 * d19) + (d33 * d23);
        out[6] = (d30 * d12) + (d31 * d16) + (d32 * d20) + (d33 * d24);
        out[7] = (d30 * d13) + (d31 * d17) + (d32 * d21) + (d33 * d25);
        double d34 = b10[8];
        double d35 = b10[9];
        double d36 = b10[10];
        double d37 = b10[11];
        out[8] = (d34 * d10) + (d35 * d14) + (d36 * d18) + (d37 * d22);
        out[9] = (d34 * d11) + (d35 * d15) + (d36 * d19) + (d37 * d23);
        out[10] = (d34 * d12) + (d35 * d16) + (d36 * d20) + (d37 * d24);
        out[11] = (d34 * d13) + (d35 * d17) + (d36 * d21) + (d37 * d25);
        double d38 = b10[12];
        double d39 = b10[13];
        double d40 = b10[14];
        double d41 = b10[15];
        out[12] = (d10 * d38) + (d14 * d39) + (d18 * d40) + (d22 * d41);
        out[13] = (d11 * d38) + (d15 * d39) + (d19 * d40) + (d23 * d41);
        out[14] = (d12 * d38) + (d16 * d39) + (d20 * d40) + (d24 * d41);
        out[15] = (d38 * d13) + (d39 * d17) + (d40 * d21) + (d41 * d25);
    }

    public static final void multiplyVectorByMatrix(double[] v10, double[] m10, double[] result) {
        AbstractC2855l.g(v10, "v");
        AbstractC2855l.g(m10, "m");
        AbstractC2855l.g(result, "result");
        double d10 = v10[0];
        double d11 = v10[1];
        double d12 = v10[2];
        double d13 = v10[3];
        result[0] = (m10[0] * d10) + (m10[4] * d11) + (m10[8] * d12) + (m10[12] * d13);
        result[1] = (m10[1] * d10) + (m10[5] * d11) + (m10[9] * d12) + (m10[13] * d13);
        result[2] = (m10[2] * d10) + (m10[6] * d11) + (m10[10] * d12) + (m10[14] * d13);
        result[3] = (d10 * m10[3]) + (d11 * m10[7]) + (d12 * m10[11]) + (d13 * m10[15]);
    }

    public static final void resetIdentityMatrix(double[] matrix) {
        AbstractC2855l.g(matrix, "matrix");
        matrix[14] = 0.0d;
        matrix[13] = 0.0d;
        matrix[12] = 0.0d;
        matrix[11] = 0.0d;
        matrix[9] = 0.0d;
        matrix[8] = 0.0d;
        matrix[7] = 0.0d;
        matrix[6] = 0.0d;
        matrix[4] = 0.0d;
        matrix[3] = 0.0d;
        matrix[2] = 0.0d;
        matrix[1] = 0.0d;
        matrix[15] = 1.0d;
        matrix[10] = 1.0d;
        matrix[5] = 1.0d;
        matrix[0] = 1.0d;
    }

    public static final double roundTo3Places(double n10) {
        return Math.round(n10 * 1000.0d) * 0.001d;
    }

    public static final double[] transpose(double[] m10) {
        AbstractC2855l.g(m10, "m");
        return new double[]{m10[0], m10[4], m10[8], m10[12], m10[1], m10[5], m10[9], m10[13], m10[2], m10[6], m10[10], m10[14], m10[3], m10[7], m10[11], m10[15]};
    }

    public static final double[] v3Combine(double[] a10, double[] b10, double aScale, double bScale) {
        AbstractC2855l.g(a10, "a");
        AbstractC2855l.g(b10, "b");
        return new double[]{(a10[0] * aScale) + (b10[0] * bScale), (a10[1] * aScale) + (b10[1] * bScale), (aScale * a10[2]) + (bScale * b10[2])};
    }

    public static final double[] v3Cross(double[] a10, double[] b10) {
        AbstractC2855l.g(a10, "a");
        AbstractC2855l.g(b10, "b");
        double d10 = a10[1];
        double d11 = b10[2];
        double d12 = a10[2];
        double d13 = b10[1];
        double d14 = b10[0];
        double d15 = a10[0];
        return new double[]{(d10 * d11) - (d12 * d13), (d12 * d14) - (d11 * d15), (d15 * d13) - (d10 * d14)};
    }

    public static final double v3Dot(double[] a10, double[] b10) {
        AbstractC2855l.g(a10, "a");
        AbstractC2855l.g(b10, "b");
        return (a10[0] * b10[0]) + (a10[1] * b10[1]) + (a10[2] * b10[2]);
    }

    public static final double v3Length(double[] a10) {
        AbstractC2855l.g(a10, "a");
        double d10 = a10[0];
        double d11 = a10[1];
        double d12 = (d10 * d10) + (d11 * d11);
        double d13 = a10[2];
        return Math.sqrt(d12 + (d13 * d13));
    }

    public static final double[] v3Normalize(double[] vector, double norm) {
        AbstractC2855l.g(vector, "vector");
        double d10 = 1;
        if (INSTANCE.isZero(norm)) {
            norm = v3Length(vector);
        }
        double d11 = d10 / norm;
        return new double[]{vector[0] * d11, vector[1] * d11, vector[2] * d11};
    }

    public final void applyScaleZ(double[] m10, double factor) {
        AbstractC2855l.g(m10, "m");
        m10[10] = factor;
    }
}
