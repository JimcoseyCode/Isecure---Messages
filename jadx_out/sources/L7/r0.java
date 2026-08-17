package L7;

import i7.C2750m;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r0 {
    public /* synthetic */ r0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean a(k8.f fVar);

    public final r0 b(Function1 transform) {
        AbstractC2855l.g(transform, "transform");
        if (this instanceof A) {
            A a10 = (A) this;
            return new A(a10.c(), (G8.j) transform.invoke(a10.d()));
        }
        if (!(this instanceof I)) {
            throw new C2750m();
        }
        List<Pair> listC = ((I) this).c();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listC, 10));
        for (Pair pair : listC) {
            arrayList.add(i7.t.a((k8.f) pair.getFirst(), transform.invoke((G8.j) pair.getSecond())));
        }
        return new I(arrayList);
    }

    private r0() {
    }
}
