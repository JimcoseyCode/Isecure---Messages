package O3;

import F3.d;
import M3.g;
import R3.l;
import R3.m;
import java.nio.ByteBuffer;
import v1.h;
import v1.j;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b implements j {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends P3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f8186a;

        a(ByteBuffer byteBuffer) {
            this.f8186a = byteBuffer;
        }

        @Override // P3.a
        public ByteBuffer b() {
            this.f8186a.position(0);
            return this.f8186a;
        }
    }

    /* JADX INFO: renamed from: O3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class C0088b implements v {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final com.github.penfeizhou.animation.decode.b f8188g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f8189h;

        C0088b(com.github.penfeizhou.animation.decode.b bVar, int i10) {
            this.f8188g = bVar;
            this.f8189h = i10;
        }

        @Override // x1.v
        public Class a() {
            return com.github.penfeizhou.animation.decode.b.class;
        }

        @Override // x1.v
        public int b() {
            return this.f8189h;
        }

        @Override // x1.v
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.github.penfeizhou.animation.decode.b get() {
            return this.f8188g;
        }

        @Override // x1.v
        public void recycle() {
            this.f8188g.U();
        }
    }

    @Override // v1.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v decode(ByteBuffer byteBuffer, int i10, int i11, h hVar) {
        com.github.penfeizhou.animation.decode.b aVar;
        a aVar2 = new a(byteBuffer);
        if (m.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            aVar = new l(aVar2, null);
        } else if (d.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            aVar = new F3.b(aVar2, null);
        } else if (M3.h.b(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            aVar = new g(aVar2, null);
        } else {
            if (!I3.c.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
                return null;
            }
            aVar = new I3.a(aVar2, null);
        }
        return new C0088b(aVar, byteBuffer.limit());
    }

    @Override // v1.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(ByteBuffer byteBuffer, h hVar) {
        if (!((Boolean) hVar.b(O3.a.f8182b)).booleanValue() && m.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            return true;
        }
        if (!((Boolean) hVar.b(O3.a.f8183c)).booleanValue() && d.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            return true;
        }
        if (((Boolean) hVar.b(O3.a.f8181a)).booleanValue() || !M3.h.b(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            return !((Boolean) hVar.b(O3.a.f8185e)).booleanValue() && I3.c.a(new com.github.penfeizhou.animation.io.a(byteBuffer));
        }
        return true;
    }
}
