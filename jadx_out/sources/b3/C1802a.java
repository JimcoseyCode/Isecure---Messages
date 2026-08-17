package b3;

import d3.k;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: b3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1802a extends RuntimeException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k f18640g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1802a(String str, k encodedImage) {
        super(str);
        AbstractC2855l.g(encodedImage, "encodedImage");
        this.f18640g = encodedImage;
    }

    public final k a() {
        return this.f18640g;
    }
}
