package Q2;

import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f9064a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f9065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f9066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f9067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f9068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f9069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f9070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f9071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f9072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f9073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f9074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f9075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f9076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f9077n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f9078o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List f9079p;

    static {
        c cVar = new c("JPEG", "jpeg");
        f9065b = cVar;
        c cVar2 = new c("PNG", "png");
        f9066c = cVar2;
        c cVar3 = new c("GIF", "gif");
        f9067d = cVar3;
        c cVar4 = new c("BMP", "bmp");
        f9068e = cVar4;
        c cVar5 = new c("ICO", "ico");
        f9069f = cVar5;
        c cVar6 = new c("WEBP_SIMPLE", "webp");
        f9070g = cVar6;
        c cVar7 = new c("WEBP_LOSSLESS", "webp");
        f9071h = cVar7;
        c cVar8 = new c("WEBP_EXTENDED", "webp");
        f9072i = cVar8;
        c cVar9 = new c("WEBP_EXTENDED_WITH_ALPHA", "webp");
        f9073j = cVar9;
        c cVar10 = new c("WEBP_ANIMATED", "webp");
        f9074k = cVar10;
        c cVar11 = new c("HEIF", "heif");
        f9075l = cVar11;
        f9076m = new c("DNG", "dng");
        c cVar12 = new c("BINARY_XML", "xml");
        f9077n = cVar12;
        c cVar13 = new c("AVIF", "avif");
        f9078o = cVar13;
        f9079p = AbstractC2800q.m(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13);
    }

    private b() {
    }

    public static final boolean a(c imageFormat) {
        AbstractC2855l.g(imageFormat, "imageFormat");
        return imageFormat == f9070g || imageFormat == f9071h || imageFormat == f9072i || imageFormat == f9073j;
    }

    public static final boolean b(c imageFormat) {
        AbstractC2855l.g(imageFormat, "imageFormat");
        return a(imageFormat) || imageFormat == f9074k;
    }
}
