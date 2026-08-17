package B1;

import B1.n;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import v1.EnumC3417a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f273a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b extends a {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements d {
            a() {
            }

            @Override // B1.g.d
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // B1.g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // B1.g.d
            public Class getDataClass() {
                return ParcelFileDescriptor.class;
            }
        }

        public b() {
            super(new a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface d {
        void a(Object obj);

        Object b(File file);

        Class getDataClass();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class e extends a {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements d {
            a() {
            }

            @Override // B1.g.d
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // B1.g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream b(File file) {
                return new FileInputStream(file);
            }

            @Override // B1.g.d
            public Class getDataClass() {
                return InputStream.class;
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d dVar) {
        this.f273a = dVar;
    }

    @Override // B1.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n.a buildLoadData(File file, int i10, int i11, v1.h hVar) {
        return new n.a(new P1.c(file), new c(file, this.f273a));
    }

    @Override // B1.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(File file) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f274a;

        public a(d dVar) {
            this.f274a = dVar;
        }

        @Override // B1.o
        public final n build(r rVar) {
            return new g(this.f274a);
        }

        @Override // B1.o
        public final void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final File f275g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final d f276h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Object f277i;

        c(File file, d dVar) {
            this.f275g = file;
            this.f276h = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
            Object obj = this.f277i;
            if (obj != null) {
                try {
                    this.f276h.a(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class getDataClass() {
            return this.f276h.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3417a getDataSource() {
            return EnumC3417a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void loadData(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                Object objB = this.f276h.b(this.f275g);
                this.f277i = objB;
                aVar.c(objB);
            } catch (FileNotFoundException e10) {
                aVar.a(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
