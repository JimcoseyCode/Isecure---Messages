package com.bumptech.glide;

import J1.o;
import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import com.bumptech.glide.module.AppGlideModule;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import m0.C2892a;
import x1.C3527k;
import z1.InterfaceC3666a;
import z1.i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3527k f19049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private y1.d f19050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private y1.b f19051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private z1.h f19052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private A1.a f19053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private A1.a f19054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC3666a.InterfaceC0379a f19055i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private z1.i f19056j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private J1.c f19057k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o.b f19060n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private A1.a f19061o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19062p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f19063q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19047a = new C2892a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.a f19048b = new e.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f19058l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b.a f19059m = new a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        public M1.f build() {
            return new M1.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0203c {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e {
    }

    com.bumptech.glide.b a(Context context, List list, AppGlideModule appGlideModule) {
        if (this.f19053g == null) {
            this.f19053g = A1.a.I();
        }
        if (this.f19054h == null) {
            this.f19054h = A1.a.A();
        }
        if (this.f19061o == null) {
            this.f19061o = A1.a.r();
        }
        if (this.f19056j == null) {
            this.f19056j = new i.a(context).a();
        }
        if (this.f19057k == null) {
            this.f19057k = new J1.e();
        }
        if (this.f19050d == null) {
            int iB = this.f19056j.b();
            if (iB > 0) {
                this.f19050d = new y1.k(iB);
            } else {
                this.f19050d = new y1.e();
            }
        }
        if (this.f19051e == null) {
            this.f19051e = new y1.i(this.f19056j.a());
        }
        if (this.f19052f == null) {
            this.f19052f = new z1.g(this.f19056j.d());
        }
        if (this.f19055i == null) {
            this.f19055i = new z1.f(context);
        }
        if (this.f19049c == null) {
            this.f19049c = new C3527k(this.f19052f, this.f19055i, this.f19054h, this.f19053g, A1.a.J(), this.f19061o, this.f19062p);
        }
        List list2 = this.f19063q;
        if (list2 == null) {
            this.f19063q = Collections.EMPTY_LIST;
        } else {
            this.f19063q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.b(context, this.f19049c, this.f19052f, this.f19050d, this.f19051e, new o(this.f19060n), this.f19057k, this.f19058l, this.f19059m, this.f19047a, this.f19063q, list, appGlideModule, this.f19048b.b());
    }

    public c b(int i10) {
        if (i10 < 2 || i10 > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.f19058l = i10;
        return this;
    }

    void c(o.b bVar) {
        this.f19060n = bVar;
    }
}
