package com.facebook.fresco.animation.factory;

import V2.d;
import W2.n;
import Y2.InterfaceC1530p;
import a2.g;
import a2.i;
import android.content.Context;
import android.graphics.Rect;
import c2.o;
import c3.InterfaceC1844a;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import d3.e;
import d3.k;
import d3.p;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class AnimatedFactoryV2Impl implements S2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f19836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1530p f19837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f19838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private S2.d f19840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private T2.b f19841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private U2.a f19842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC1844a f19843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g f19844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f19846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f19847l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements b3.c {
        a() {
        }

        @Override // b3.c
        public e a(k kVar, int i10, p pVar, X2.d dVar) {
            return AnimatedFactoryV2Impl.this.n().b(kVar, dVar, dVar.f12422i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements T2.b {
        b() {
        }

        @Override // T2.b
        public R2.a a(R2.e eVar, Rect rect) {
            return new T2.a(AnimatedFactoryV2Impl.this.m(), eVar, rect, AnimatedFactoryV2Impl.this.f19839d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements T2.b {
        c() {
        }

        @Override // T2.b
        public R2.a a(R2.e eVar, Rect rect) {
            return new T2.a(AnimatedFactoryV2Impl.this.m(), eVar, rect, AnimatedFactoryV2Impl.this.f19839d);
        }
    }

    public AnimatedFactoryV2Impl(d dVar, InterfaceC1530p interfaceC1530p, n nVar, boolean z10, boolean z11, int i10, int i11, g gVar) {
        this.f19836a = dVar;
        this.f19837b = interfaceC1530p;
        this.f19838c = nVar;
        this.f19845j = i10;
        this.f19846k = z11;
        this.f19839d = z10;
        this.f19844i = gVar;
        this.f19847l = i11;
    }

    public static /* synthetic */ Integer e() {
        return 2;
    }

    public static /* synthetic */ Integer f() {
        return 3;
    }

    private S2.d j() {
        return new S2.e(new c(), this.f19836a, this.f19846k);
    }

    private K2.d k() {
        c2.n nVar = new c2.n() { // from class: K2.b
            @Override // c2.n
            public final Object get() {
                return AnimatedFactoryV2Impl.e();
            }
        };
        ExecutorService dVar = this.f19844i;
        if (dVar == null) {
            dVar = new a2.d(this.f19837b.a());
        }
        c2.n nVar2 = new c2.n() { // from class: K2.c
            @Override // c2.n
            public final Object get() {
                return AnimatedFactoryV2Impl.f();
            }
        };
        c2.n nVar3 = o.f18800b;
        return new K2.d(l(), i.B(), dVar, RealtimeSinceBootClock.get(), this.f19836a, this.f19838c, nVar, nVar2, nVar3, o.a(Boolean.valueOf(this.f19846k)), o.a(Boolean.valueOf(this.f19839d)), o.a(Integer.valueOf(this.f19845j)), o.a(Integer.valueOf(this.f19847l)));
    }

    private T2.b l() {
        if (this.f19841f == null) {
            this.f19841f = new b();
        }
        return this.f19841f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public U2.a m() {
        if (this.f19842g == null) {
            this.f19842g = new U2.a();
        }
        return this.f19842g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public S2.d n() {
        if (this.f19840e == null) {
            this.f19840e = j();
        }
        return this.f19840e;
    }

    @Override // S2.a
    public InterfaceC1844a a(Context context) {
        if (this.f19843h == null) {
            this.f19843h = k();
        }
        return this.f19843h;
    }

    @Override // S2.a
    public b3.c b() {
        return new a();
    }

    @Override // S2.a
    public b3.c c() {
        return new b3.c() { // from class: K2.a
            @Override // b3.c
            public final e a(k kVar, int i10, p pVar, X2.d dVar) {
                return this.f7036a.n().a(kVar, dVar, dVar.f12422i);
            }
        };
    }
}
