package B1;

import B1.n;
import android.util.Base64;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import v1.EnumC3417a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f257a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        void a(Object obj);

        Object b(String str);

        Class getDataClass();
    }

    public e(a aVar) {
        this.f257a = aVar;
    }

    @Override // B1.n
    public n.a buildLoadData(Object obj, int i10, int i11, v1.h hVar) {
        return new n.a(new P1.c(obj), new b(obj.toString(), this.f257a));
    }

    @Override // B1.n
    public boolean handles(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f258g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final a f259h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Object f260i;

        b(String str, a aVar) {
            this.f258g = str;
            this.f259h = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
            try {
                this.f259h.a(this.f260i);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class getDataClass() {
            return this.f259h.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3417a getDataSource() {
            return EnumC3417a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void loadData(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                Object objB = this.f259h.b(this.f258g);
                this.f260i = objB;
                aVar.c(objB);
            } catch (IllegalArgumentException e10) {
                aVar.a(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f261a = new a();

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements a {
            a() {
            }

            @Override // B1.e.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void a(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // B1.e.a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream b(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }

            @Override // B1.e.a
            public Class getDataClass() {
                return InputStream.class;
            }
        }

        @Override // B1.o
        public n build(r rVar) {
            return new e(this.f261a);
        }

        @Override // B1.o
        public void teardown() {
        }
    }
}
