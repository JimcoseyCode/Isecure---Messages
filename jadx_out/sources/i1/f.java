package I1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f3913a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class f3914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f3915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f3916c;

        a(Class cls, Class cls2, e eVar) {
            this.f3914a = cls;
            this.f3915b = cls2;
            this.f3916c = eVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f3914a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f3915b);
        }
    }

    public synchronized e a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.a();
        }
        for (a aVar : this.f3913a) {
            if (aVar.a(cls, cls2)) {
                return aVar.f3916c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f3913a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f3915b)) {
                arrayList.add(aVar.f3915b);
            }
        }
        return arrayList;
    }

    public synchronized void c(Class cls, Class cls2, e eVar) {
        this.f3913a.add(new a(cls, cls2, eVar));
    }
}
