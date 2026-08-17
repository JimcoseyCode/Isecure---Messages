package com.github.penfeizhou.animation.glide;

import F1.j;
import I1.e;
import M3.g;
import R3.l;
import android.graphics.drawable.Drawable;
import v1.h;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class b implements e {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends j {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ E3.a f20890h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Drawable drawable, E3.a aVar) {
            super(drawable);
            this.f20890h = aVar;
        }

        @Override // x1.v
        public Class a() {
            return Drawable.class;
        }

        @Override // x1.v
        public int b() {
            return this.f20890h.d();
        }

        @Override // F1.j, x1.r
        public void initialize() {
            super.initialize();
        }

        @Override // x1.v
        public void recycle() {
            this.f20890h.stop();
        }
    }

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.glide.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0220b extends j {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Q3.a f20892h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0220b(Drawable drawable, Q3.a aVar) {
            super(drawable);
            this.f20892h = aVar;
        }

        @Override // x1.v
        public Class a() {
            return Drawable.class;
        }

        @Override // x1.v
        public int b() {
            return this.f20892h.d();
        }

        @Override // F1.j, x1.r
        public void initialize() {
            super.initialize();
        }

        @Override // x1.v
        public void recycle() {
            this.f20892h.stop();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c extends j {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ L3.a f20894h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Drawable drawable, L3.a aVar) {
            super(drawable);
            this.f20894h = aVar;
        }

        @Override // x1.v
        public Class a() {
            return Drawable.class;
        }

        @Override // x1.v
        public int b() {
            return this.f20894h.d();
        }

        @Override // F1.j, x1.r
        public void initialize() {
            super.initialize();
        }

        @Override // x1.v
        public void recycle() {
            this.f20894h.stop();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d extends j {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ H3.a f20896h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Drawable drawable, H3.a aVar) {
            super(drawable);
            this.f20896h = aVar;
        }

        @Override // x1.v
        public Class a() {
            return Drawable.class;
        }

        @Override // x1.v
        public int b() {
            return this.f20896h.d();
        }

        @Override // F1.j, x1.r
        public void initialize() {
            super.initialize();
        }

        @Override // x1.v
        public void recycle() {
            this.f20896h.stop();
        }
    }

    b() {
    }

    @Override // I1.e
    public v transcode(v vVar, h hVar) {
        com.github.penfeizhou.animation.decode.b bVar = (com.github.penfeizhou.animation.decode.b) vVar.get();
        boolean zBooleanValue = ((Boolean) hVar.b(O3.a.f8184d)).booleanValue();
        if (bVar instanceof F3.b) {
            E3.a aVar = new E3.a((F3.b) bVar);
            aVar.k(false);
            aVar.l(zBooleanValue);
            return new a(aVar, aVar);
        }
        if (bVar instanceof l) {
            Q3.a aVar2 = new Q3.a((l) bVar);
            aVar2.k(false);
            aVar2.l(zBooleanValue);
            return new C0220b(aVar2, aVar2);
        }
        if (bVar instanceof g) {
            L3.a aVar3 = new L3.a((g) bVar);
            aVar3.k(false);
            aVar3.l(zBooleanValue);
            return new c(aVar3, aVar3);
        }
        if (!(bVar instanceof I3.a)) {
            return null;
        }
        H3.a aVar4 = new H3.a((I3.a) bVar);
        aVar4.k(false);
        aVar4.l(zBooleanValue);
        return new d(aVar4, aVar4);
    }
}
