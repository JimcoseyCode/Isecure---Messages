package B1;

import B1.n;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import v1.EnumC3417a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d implements n {
    @Override // B1.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n.a buildLoadData(File file, int i10, int i11, v1.h hVar) {
        return new n.a(new P1.c(file), new a(file));
    }

    @Override // B1.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(File file) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final File f256g;

        a(File file) {
            this.f256g = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class getDataClass() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3417a getDataSource() {
            return EnumC3417a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void loadData(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                aVar.c(Q1.a.a(this.f256g));
            } catch (IOException e10) {
                aVar.a(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b implements o {
        @Override // B1.o
        public n build(r rVar) {
            return new d();
        }

        @Override // B1.o
        public void teardown() {
        }
    }
}
