package W6;

import j7.AbstractC2800q;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12128b;

    public c(int i10) {
        super(false, 1, null);
        this.f12128b = i10;
    }

    @Override // W6.a
    public void a(List drawingOperations) {
        AbstractC2855l.g(drawingOperations, "drawingOperations");
        if (b()) {
            int i10 = this.f12128b;
            for (int iL = AbstractC2800q.l(drawingOperations); i10 < iL; iL--) {
                Collections.swap(drawingOperations, i10, iL);
                i10++;
            }
        }
    }
}
