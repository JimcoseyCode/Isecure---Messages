package B1;

import B1.n;
import com.bumptech.glide.load.data.d;
import v1.EnumC3417a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class w implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w f335a = new w();

    public static w a() {
        return f335a;
    }

    @Override // B1.n
    public n.a buildLoadData(Object obj, int i10, int i11, v1.h hVar) {
        return new n.a(new P1.c(obj), new b(obj));
    }

    @Override // B1.n
    public boolean handles(Object obj) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f336a = new a();

        public static a a() {
            return f336a;
        }

        @Override // B1.o
        public n build(r rVar) {
            return w.a();
        }

        @Override // B1.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Object f337g;

        b(Object obj) {
            this.f337g = obj;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class getDataClass() {
            return this.f337g.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3417a getDataSource() {
            return EnumC3417a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void loadData(com.bumptech.glide.g gVar, d.a aVar) {
            aVar.c(this.f337g);
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
        }
    }
}
