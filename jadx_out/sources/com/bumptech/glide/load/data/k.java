package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.resource.bitmap.X;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X f19183a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y1.b f19184a;

        public a(y1.b bVar) {
            this.f19184a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(InputStream inputStream) {
            return new k(inputStream, this.f19184a);
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class getDataClass() {
            return InputStream.class;
        }
    }

    public k(InputStream inputStream, y1.b bVar) {
        X x10 = new X(inputStream, bVar);
        this.f19183a = x10;
        x10.mark(5242880);
    }

    public void b() {
        this.f19183a.e();
    }

    @Override // com.bumptech.glide.load.data.e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.f19183a.reset();
        return this.f19183a;
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
        this.f19183a.k();
    }
}
