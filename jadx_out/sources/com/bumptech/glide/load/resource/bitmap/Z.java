package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C1949t;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class Z implements v1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1949t f19221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y1.b f19222b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a implements C1949t.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X f19223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Q1.d f19224b;

        a(X x10, Q1.d dVar) {
            this.f19223a = x10;
            this.f19224b = dVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1949t.b
        public void a() {
            this.f19223a.e();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C1949t.b
        public void b(y1.d dVar, Bitmap bitmap) throws IOException {
            IOException iOExceptionD = this.f19224b.d();
            if (iOExceptionD != null) {
                if (bitmap == null) {
                    throw iOExceptionD;
                }
                dVar.c(bitmap);
                throw iOExceptionD;
            }
        }
    }

    public Z(C1949t c1949t, y1.b bVar) {
        this.f19221a = c1949t;
        this.f19222b = bVar;
    }

    @Override // v1.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x1.v decode(InputStream inputStream, int i10, int i11, v1.h hVar) {
        boolean z10;
        X x10;
        if (inputStream instanceof X) {
            x10 = (X) inputStream;
            z10 = false;
        } else {
            z10 = true;
            x10 = new X(inputStream, this.f19222b);
        }
        Q1.d dVarE = Q1.d.e(x10);
        try {
            x1.v vVarF = this.f19221a.f(new Q1.i(dVarE), i10, i11, hVar, new a(x10, dVarE));
            dVarE.k();
            if (z10) {
                x10.k();
            }
            return vVarF;
        } finally {
        }
    }

    @Override // v1.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(InputStream inputStream, v1.h hVar) {
        return this.f19221a.p(inputStream);
    }
}
