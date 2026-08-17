package f2;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: f2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2601b implements H0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2601b f27219a = new C2601b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f27220b = 16384;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f27221c = new a();

    /* JADX INFO: renamed from: f2.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(C2601b.f27220b);
        }
    }

    public static int c() {
        return f27220b;
    }

    @Override // H0.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ByteBuffer acquire() {
        return (ByteBuffer) f27221c.get();
    }

    @Override // H0.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean release(ByteBuffer byteBuffer) {
        return true;
    }
}
