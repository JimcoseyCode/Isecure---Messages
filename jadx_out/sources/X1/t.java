package x1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import x1.C3525i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f33463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H0.e f33464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f33465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f33466d;

    public t(Class cls, Class cls2, Class cls3, List list, H0.e eVar) {
        this.f33463a = cls;
        this.f33464b = eVar;
        this.f33465c = (List) Q1.k.d(list);
        this.f33466d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v b(com.bumptech.glide.load.data.e eVar, v1.h hVar, int i10, int i11, C3525i.a aVar, List list) throws q {
        int size = this.f33465c.size();
        v vVarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                vVarA = ((C3525i) this.f33465c.get(i12)).a(eVar, i10, i11, hVar, aVar);
            } catch (q e10) {
                list.add(e10);
            }
            if (vVarA != null) {
                break;
            }
        }
        if (vVarA != null) {
            return vVarA;
        }
        throw new q(this.f33466d, new ArrayList(list));
    }

    public v a(com.bumptech.glide.load.data.e eVar, v1.h hVar, int i10, int i11, C3525i.a aVar) {
        List list = (List) Q1.k.e((List) this.f33464b.acquire());
        try {
            return b(eVar, hVar, i10, i11, aVar, list);
        } finally {
            this.f33464b.release(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f33465c.toArray()) + '}';
    }
}
