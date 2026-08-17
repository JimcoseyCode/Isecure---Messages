package B1;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface n {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v1.f f299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d f301c;

        public a(v1.f fVar, com.bumptech.glide.load.data.d dVar) {
            this(fVar, Collections.EMPTY_LIST, dVar);
        }

        public a(v1.f fVar, List list, com.bumptech.glide.load.data.d dVar) {
            this.f299a = (v1.f) Q1.k.e(fVar);
            this.f300b = (List) Q1.k.e(list);
            this.f301c = (com.bumptech.glide.load.data.d) Q1.k.e(dVar);
        }
    }

    a buildLoadData(Object obj, int i10, int i11, v1.h hVar);

    boolean handles(Object obj);
}
