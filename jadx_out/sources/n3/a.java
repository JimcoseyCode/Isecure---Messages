package N3;

import com.github.penfeizhou.animation.io.e;
import java.nio.IntBuffer;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected IntBuffer f8077a;

    public a() {
        c(10240);
    }

    public IntBuffer a() {
        return this.f8077a;
    }

    public int[] b() {
        return this.f8077a.array();
    }

    public void c(int i10) {
        IntBuffer intBuffer = this.f8077a;
        if (intBuffer == null || i10 > intBuffer.capacity()) {
            this.f8077a = IntBuffer.allocate(i10);
        }
        this.f8077a.clear();
        this.f8077a.limit(i10);
        this.f8077a.position(0);
    }

    @Override // com.github.penfeizhou.animation.io.e
    public void close() {
    }
}
