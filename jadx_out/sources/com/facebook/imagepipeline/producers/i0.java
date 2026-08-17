package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20096d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f20097c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Executor executor, f2.i pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        AbstractC2855l.g(executor, "executor");
        AbstractC2855l.g(pooledByteBufferFactory, "pooledByteBufferFactory");
        AbstractC2855l.g(contentResolver, "contentResolver");
        this.f20097c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected d3.k d(com.facebook.imagepipeline.request.b imageRequest) throws FileNotFoundException {
        AbstractC2855l.g(imageRequest, "imageRequest");
        InputStream inputStreamOpenInputStream = this.f20097c.openInputStream(imageRequest.getSourceUri());
        if (inputStreamOpenInputStream == null) {
            throw new IllegalStateException("ContentResolver returned null InputStream");
        }
        d3.k kVarE = e(inputStreamOpenInputStream, -1);
        AbstractC2855l.f(kVarE, "getEncodedImage(...)");
        return kVarE;
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "QualifiedResourceFetchProducer";
    }
}
