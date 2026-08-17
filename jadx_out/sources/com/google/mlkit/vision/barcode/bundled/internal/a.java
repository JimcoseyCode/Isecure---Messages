package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractBinderC2214y;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbe;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l5.C2871a;
import l5.C2874d;
import l5.e;
import l5.f;
import l5.g;
import l5.i;
import l5.j;
import l5.l;
import l5.m;
import l5.o;
import m6.C2906B;
import m6.C2921a;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class a extends AbstractBinderC2214y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f24377f = {5, 7, 7, 7, 5, 5};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final double[][] f24378g = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f24379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zzba f24380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BarhopperV3 f24381e;

    a(Context context, zzba zzbaVar) {
        this.f24379c = context;
        this.f24380d = zzbaVar;
    }

    private final RecognitionOptions d() {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        recognitionOptions.a(this.f24380d.e());
        recognitionOptions.f(this.f24380d.s());
        recognitionOptions.b(true);
        recognitionOptions.c(true);
        return recognitionOptions;
    }

    private static zzan f(C2906B c2906b, String str, String str2) {
        if (c2906b == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new zzan(c2906b.K(), c2906b.I(), c2906b.F(), c2906b.G(), c2906b.H(), c2906b.J(), c2906b.N(), matcher.find() ? matcher.group(1) : null);
    }

    private final C2921a x(ByteBuffer byteBuffer, zzcc zzccVar, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = (BarhopperV3) AbstractC3268i.k(this.f24381e);
        if (((ByteBuffer) AbstractC3268i.k(byteBuffer)).isDirect()) {
            return barhopperV3.e(zzccVar.k0(), zzccVar.e(), byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.k(zzccVar.k0(), zzccVar.e(), byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.k(zzccVar.k0(), zzccVar.e(), bArr, recognitionOptions);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    private final java.util.List y(B4.a r48, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc r49, com.google.android.libraries.barhopper.RecognitionOptions r50) {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.barcode.bundled.internal.a.y(B4.a, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc, com.google.android.libraries.barhopper.RecognitionOptions):java.util.List");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2218z
    public final void b() {
        if (this.f24381e != null) {
            return;
        }
        this.f24381e = new BarhopperV3();
        l lVarF = m.F();
        i iVarF = j.F();
        int i10 = 16;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            f fVarF = g.F();
            fVarF.q(i10);
            fVarF.r(i10);
            for (int i13 = 0; i13 < f24377f[i12]; i13++) {
                double[] dArr = f24378g[i11];
                double d10 = dArr[0] * 320.0d;
                float fSqrt = (float) Math.sqrt(dArr[1]);
                float f10 = (float) d10;
                fVarF.o(f10 / fSqrt);
                fVarF.p(f10 * fSqrt);
                i11++;
            }
            i10 += i10;
            iVarF.o(fVarF);
        }
        lVarF.o(iVarF);
        try {
            InputStream inputStreamOpen = this.f24379c.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream inputStreamOpen2 = this.f24379c.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream inputStreamOpen3 = this.f24379c.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV3 = (BarhopperV3) AbstractC3268i.k(this.f24381e);
                        o oVarF = C2871a.F();
                        lVarF.p(AbstractC2171o0.E(inputStreamOpen));
                        oVarF.o(lVarF);
                        C2874d c2874dF = e.F();
                        c2874dF.o(AbstractC2171o0.E(inputStreamOpen2));
                        c2874dF.p(AbstractC2171o0.E(inputStreamOpen3));
                        oVarF.p(c2874dF);
                        barhopperV3.d((C2871a) oVarF.k0());
                        if (inputStreamOpen3 != null) {
                            inputStreamOpen3.close();
                        }
                        if (inputStreamOpen2 != null) {
                            inputStreamOpen2.close();
                        }
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e10) {
            throw new IllegalStateException("Failed to open Barcode models", e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2218z
    public final void e() {
        BarhopperV3 barhopperV3 = this.f24381e;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f24381e = null;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2218z
    public final void m(zzbe zzbeVar) {
        b();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2218z
    public final List r(B4.a aVar, zzcc zzccVar) {
        return y(aVar, zzccVar, d());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2218z
    public final List s(B4.a aVar, zzcc zzccVar, zzbc zzbcVar) {
        RecognitionOptions recognitionOptionsD = d();
        MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
        multiScaleDecodingOptions.a(zzbcVar.e().X());
        multiScaleDecodingOptions.b(zzbcVar.e().e());
        multiScaleDecodingOptions.c(zzbcVar.e().s());
        recognitionOptionsD.d(multiScaleDecodingOptions);
        MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
        multiScaleDetectionOptions.a(zzbcVar.e().X());
        recognitionOptionsD.e(multiScaleDetectionOptions);
        recognitionOptionsD.g(zzbcVar.s());
        return y(aVar, zzccVar, recognitionOptionsD);
    }
}
