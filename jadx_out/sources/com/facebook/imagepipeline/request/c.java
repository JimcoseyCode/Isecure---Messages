package com.facebook.imagepipeline.request;

import X2.f;
import X2.g;
import X2.h;
import Y2.C1534u;
import Y2.EnumC1528n;
import android.net.Uri;
import c2.k;
import com.facebook.imagepipeline.request.b;
import f3.InterfaceC2611e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set f20240t = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private InterfaceC2611e f20254n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f20258r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f20241a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b.c f20242b = b.c.FULL_FETCH;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20243c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f20244d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f20245e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private X2.d f20246f = X2.d.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b.EnumC0218b f20247g = b.EnumC0218b.DEFAULT;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20248h = C1534u.J().a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f20249i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f20250j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f f20251k = f.f12441j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d f20252l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f20253m = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private X2.b f20255o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f20256p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private EnumC1528n f20257q = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f20259s = null;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a extends RuntimeException {
        public a(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private c() {
    }

    private c B(int i10) {
        this.f20243c = i10;
        if (this.f20247g != b.EnumC0218b.DYNAMIC) {
            this.f20259s = null;
        }
        return this;
    }

    public static c b(b bVar) {
        return x(bVar.getSourceUri()).F(bVar.getImageDecodeOptions()).z(bVar.getBytesRange()).A(bVar.getCacheChoice()).H(bVar.getLocalThumbnailPreviewsEnabled()).G(bVar.getLoadThumbnailOnlyForAndroidSdkAboveQ()).I(bVar.getLowestPermittedRequestLevel()).B(bVar.getCachesDisabled()).J(bVar.getPostprocessor()).K(bVar.getProgressiveRenderingEnabled()).M(bVar.getPriority()).N(bVar.getResizeOptions()).L(bVar.getRequestListener()).P(bVar.getRotationOptions()).Q(bVar.shouldDecodePrefetches()).C(bVar.getDelayMs()).D(bVar.getDiskCacheId()).E(bVar.getDownsampleOverride()).O(bVar.getResizingAllowedOverride());
    }

    public static boolean s(Uri uri) {
        Set set = f20240t;
        if (set != null && uri != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static c x(Uri uri) {
        return new c().R(uri);
    }

    public c A(b.EnumC0218b enumC0218b) {
        this.f20247g = enumC0218b;
        return this;
    }

    public c C(int i10) {
        this.f20258r = i10;
        return this;
    }

    public c D(String str) {
        this.f20259s = str;
        return this;
    }

    public c E(EnumC1528n enumC1528n) {
        this.f20257q = enumC1528n;
        return this;
    }

    public c F(X2.d dVar) {
        this.f20246f = dVar;
        return this;
    }

    public c G(boolean z10) {
        this.f20250j = z10;
        return this;
    }

    public c H(boolean z10) {
        this.f20249i = z10;
        return this;
    }

    public c I(b.c cVar) {
        this.f20242b = cVar;
        return this;
    }

    public c J(d dVar) {
        this.f20252l = dVar;
        return this;
    }

    public c K(boolean z10) {
        this.f20248h = z10;
        return this;
    }

    public c L(InterfaceC2611e interfaceC2611e) {
        this.f20254n = interfaceC2611e;
        return this;
    }

    public c M(f fVar) {
        this.f20251k = fVar;
        return this;
    }

    public c N(g gVar) {
        this.f20244d = gVar;
        return this;
    }

    public c O(Boolean bool) {
        this.f20256p = bool;
        return this;
    }

    public c P(h hVar) {
        this.f20245e = hVar;
        return this;
    }

    public c Q(Boolean bool) {
        this.f20253m = bool;
        return this;
    }

    public c R(Uri uri) {
        k.g(uri);
        this.f20241a = uri;
        return this;
    }

    public Boolean S() {
        return this.f20253m;
    }

    protected void T() {
        Uri uri = this.f20241a;
        if (uri == null) {
            throw new a("Source must be set!");
        }
        if (k2.f.n(uri)) {
            if (!this.f20241a.isAbsolute()) {
                throw new a("Resource URI path must be absolute.");
            }
            if (this.f20241a.getPath().isEmpty()) {
                throw new a("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f20241a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new a("Resource URI path must be a resource id.");
            }
        }
        if (k2.f.i(this.f20241a) && !this.f20241a.isAbsolute()) {
            throw new a("Asset URI path must be absolute.");
        }
    }

    public b a() {
        T();
        return new b(this);
    }

    public X2.b c() {
        return this.f20255o;
    }

    public b.EnumC0218b d() {
        return this.f20247g;
    }

    public int e() {
        return this.f20243c;
    }

    public int f() {
        return this.f20258r;
    }

    public String g() {
        return this.f20259s;
    }

    public EnumC1528n h() {
        return this.f20257q;
    }

    public X2.d i() {
        return this.f20246f;
    }

    public boolean j() {
        return this.f20250j;
    }

    public b.c k() {
        return this.f20242b;
    }

    public d l() {
        return this.f20252l;
    }

    public InterfaceC2611e m() {
        return this.f20254n;
    }

    public f n() {
        return this.f20251k;
    }

    public g o() {
        return this.f20244d;
    }

    public Boolean p() {
        return this.f20256p;
    }

    public h q() {
        return this.f20245e;
    }

    public Uri r() {
        return this.f20241a;
    }

    public boolean t() {
        if ((this.f20243c & 48) == 0) {
            return k2.f.o(this.f20241a) || s(this.f20241a);
        }
        return false;
    }

    public boolean u() {
        return this.f20249i;
    }

    public boolean v() {
        return (this.f20243c & 15) == 0;
    }

    public boolean w() {
        return this.f20248h;
    }

    public c y(boolean z10) {
        return z10 ? P(h.c()) : P(h.e());
    }

    public c z(X2.b bVar) {
        this.f20255o = bVar;
        return this;
    }
}
