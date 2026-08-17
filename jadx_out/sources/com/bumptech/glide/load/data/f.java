package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e.a f19168b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19169a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements e.a {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e a(Object obj) {
            return new b(obj);
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class getDataClass() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    public synchronized e a(Object obj) {
        e.a aVar;
        try {
            Q1.k.e(obj);
            aVar = (e.a) this.f19169a.get(obj.getClass());
            if (aVar == null) {
                Iterator it = this.f19169a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar2 = (e.a) it.next();
                    if (aVar2.getDataClass().isAssignableFrom(obj.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f19168b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar.a(obj);
    }

    public synchronized void b(e.a aVar) {
        this.f19169a.put(aVar.getDataClass(), aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f19170a;

        b(Object obj) {
            this.f19170a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public Object a() {
            return this.f19170a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void cleanup() {
        }
    }
}
