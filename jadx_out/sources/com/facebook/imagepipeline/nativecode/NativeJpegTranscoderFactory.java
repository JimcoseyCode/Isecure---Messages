package com.facebook.imagepipeline.nativecode;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class NativeJpegTranscoderFactory implements k3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19901c;

    public NativeJpegTranscoderFactory(int i10, boolean z10, boolean z11) {
        this.f19899a = i10;
        this.f19900b = z10;
        this.f19901c = z11;
    }

    @Override // k3.d
    public k3.c createImageTranscoder(Q2.c cVar, boolean z10) {
        if (cVar != Q2.b.f9065b) {
            return null;
        }
        return new NativeJpegTranscoder(z10, this.f19899a, this.f19900b, this.f19901c);
    }
}
