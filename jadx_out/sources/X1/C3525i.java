package x1;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: x1.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3525i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f33367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f33368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I1.e f33369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final H0.e f33370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f33371e;

    /* JADX INFO: renamed from: x1.i$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
        v a(v vVar);
    }

    public C3525i(Class cls, Class cls2, Class cls3, List list, I1.e eVar, H0.e eVar2) {
        this.f33367a = cls;
        this.f33368b = list;
        this.f33369c = eVar;
        this.f33370d = eVar2;
        this.f33371e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v b(com.bumptech.glide.load.data.e eVar, int i10, int i11, v1.h hVar) {
        List list = (List) Q1.k.e((List) this.f33370d.acquire());
        try {
            return c(eVar, i10, i11, hVar, list);
        } finally {
            this.f33370d.release(list);
        }
    }

    private v c(com.bumptech.glide.load.data.e eVar, int i10, int i11, v1.h hVar, List list) throws q {
        int size = this.f33368b.size();
        v vVarDecode = null;
        for (int i12 = 0; i12 < size; i12++) {
            v1.j jVar = (v1.j) this.f33368b.get(i12);
            try {
                if (jVar.handles(eVar.a(), hVar)) {
                    vVarDecode = jVar.decode(eVar.a(), i10, i11, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(jVar);
                }
                list.add(e10);
            }
            if (vVarDecode != null) {
                break;
            }
        }
        if (vVarDecode != null) {
            return vVarDecode;
        }
        throw new q(this.f33371e, new ArrayList(list));
    }

    public v a(com.bumptech.glide.load.data.e eVar, int i10, int i11, v1.h hVar, a aVar) {
        return this.f33369c.transcode(aVar.a(b(eVar, i10, i11, hVar)), hVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f33367a + ", decoders=" + this.f33368b + ", transcoder=" + this.f33369c + '}';
    }
}
