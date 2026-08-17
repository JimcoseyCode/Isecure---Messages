package g3;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements f2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.f f28213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f2.l f28214b;

    public y(com.facebook.imagepipeline.memory.f pool, f2.l pooledByteStreams) {
        AbstractC2855l.g(pool, "pool");
        AbstractC2855l.g(pooledByteStreams, "pooledByteStreams");
        this.f28213a = pool;
        this.f28214b = pooledByteStreams;
    }

    public final x f(InputStream inputStream, com.facebook.imagepipeline.memory.g outputStream) {
        AbstractC2855l.g(inputStream, "inputStream");
        AbstractC2855l.g(outputStream, "outputStream");
        this.f28214b.a(inputStream, outputStream);
        return outputStream.d();
    }

    @Override // f2.i
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public x c(InputStream inputStream) throws Throwable {
        AbstractC2855l.g(inputStream, "inputStream");
        com.facebook.imagepipeline.memory.g gVar = new com.facebook.imagepipeline.memory.g(this.f28213a, 0, 2, null);
        try {
            return f(inputStream, gVar);
        } finally {
            gVar.close();
        }
    }

    @Override // f2.i
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public x d(InputStream inputStream, int i10) throws Throwable {
        AbstractC2855l.g(inputStream, "inputStream");
        com.facebook.imagepipeline.memory.g gVar = new com.facebook.imagepipeline.memory.g(this.f28213a, i10);
        try {
            return f(inputStream, gVar);
        } finally {
            gVar.close();
        }
    }

    @Override // f2.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public x b(byte[] bytes) throws Throwable {
        AbstractC2855l.g(bytes, "bytes");
        com.facebook.imagepipeline.memory.g gVar = new com.facebook.imagepipeline.memory.g(this.f28213a, bytes.length);
        try {
            try {
                gVar.write(bytes, 0, bytes.length);
                return gVar.d();
            } catch (IOException e10) {
                throw c2.p.a(e10);
            }
        } finally {
            gVar.close();
        }
    }

    @Override // f2.i
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.facebook.imagepipeline.memory.g a() {
        return new com.facebook.imagepipeline.memory.g(this.f28213a, 0, 2, null);
    }

    @Override // f2.i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.facebook.imagepipeline.memory.g e(int i10) {
        return new com.facebook.imagepipeline.memory.g(this.f28213a, i10);
    }
}
