package B1;

import B1.n;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import v1.EnumC3417a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0012b f251a;

    /* JADX INFO: renamed from: B1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface InterfaceC0012b {
        Object a(byte[] bArr);

        Class getDataClass();
    }

    public b(InterfaceC0012b interfaceC0012b) {
        this.f251a = interfaceC0012b;
    }

    @Override // B1.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n.a buildLoadData(byte[] bArr, int i10, int i11, v1.h hVar) {
        return new n.a(new P1.c(bArr), new c(bArr, this.f251a));
    }

    @Override // B1.n
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(byte[] bArr) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a implements o {

        /* JADX INFO: renamed from: B1.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0011a implements InterfaceC0012b {
            C0011a() {
            }

            @Override // B1.b.InterfaceC0012b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ByteBuffer a(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }

            @Override // B1.b.InterfaceC0012b
            public Class getDataClass() {
                return ByteBuffer.class;
            }
        }

        @Override // B1.o
        public n build(r rVar) {
            return new b(new C0011a());
        }

        @Override // B1.o
        public void teardown() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f253g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final InterfaceC0012b f254h;

        c(byte[] bArr, InterfaceC0012b interfaceC0012b) {
            this.f253g = bArr;
            this.f254h = interfaceC0012b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class getDataClass() {
            return this.f254h.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3417a getDataSource() {
            return EnumC3417a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void loadData(com.bumptech.glide.g gVar, d.a aVar) {
            aVar.c(this.f254h.a(this.f253g));
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cleanup() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class d implements o {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements InterfaceC0012b {
            a() {
            }

            @Override // B1.b.InterfaceC0012b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public InputStream a(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }

            @Override // B1.b.InterfaceC0012b
            public Class getDataClass() {
                return InputStream.class;
            }
        }

        @Override // B1.o
        public n build(r rVar) {
            return new b(new a());
        }

        @Override // B1.o
        public void teardown() {
        }
    }
}
