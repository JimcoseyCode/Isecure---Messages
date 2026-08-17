package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements v1.j {
    @Override // v1.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x1.v decode(Bitmap bitmap, int i10, int i11, v1.h hVar) {
        return new a(bitmap);
    }

    @Override // v1.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(Bitmap bitmap, v1.h hVar) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements x1.v {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Bitmap f19234g;

        a(Bitmap bitmap) {
            this.f19234g = bitmap;
        }

        @Override // x1.v
        public Class a() {
            return Bitmap.class;
        }

        @Override // x1.v
        public int b() {
            return Q1.l.i(this.f19234g);
        }

        @Override // x1.v
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f19234g;
        }

        @Override // x1.v
        public void recycle() {
        }
    }
}
