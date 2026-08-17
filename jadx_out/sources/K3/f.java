package k3;

import Y2.z;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f29117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f29118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f29119e;

    public f(int i10, boolean z10, d dVar, Integer num, boolean z11) {
        this.f29115a = i10;
        this.f29116b = z10;
        this.f29117c = dVar;
        this.f29118d = num;
        this.f29119e = z11;
    }

    private final c a(Q2.c cVar, boolean z10) {
        d dVar = this.f29117c;
        if (dVar != null) {
            return dVar.createImageTranscoder(cVar, z10);
        }
        return null;
    }

    private final c b(Q2.c cVar, boolean z10) {
        Integer num = this.f29118d;
        if (num == null) {
            return null;
        }
        if (num != null && num.intValue() == 0) {
            return c(cVar, z10);
        }
        if (num == null || num.intValue() != 1) {
            throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
        return d(cVar, z10);
    }

    private final c c(Q2.c cVar, boolean z10) {
        return com.facebook.imagepipeline.nativecode.c.a(this.f29115a, this.f29116b, this.f29119e).createImageTranscoder(cVar, z10);
    }

    private final c d(Q2.c cVar, boolean z10) {
        c cVarCreateImageTranscoder = new h(this.f29115a).createImageTranscoder(cVar, z10);
        AbstractC2855l.f(cVarCreateImageTranscoder, "createImageTranscoder(...)");
        return cVarCreateImageTranscoder;
    }

    @Override // k3.d
    public c createImageTranscoder(Q2.c imageFormat, boolean z10) {
        AbstractC2855l.g(imageFormat, "imageFormat");
        c cVarA = a(imageFormat, z10);
        if (cVarA == null) {
            cVarA = b(imageFormat, z10);
        }
        if (cVarA == null && z.a()) {
            cVarA = c(imageFormat, z10);
        }
        return cVarA == null ? d(imageFormat, z10) : cVarA;
    }
}
