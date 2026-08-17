package q5;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class w implements C5.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f30821c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f30822a = f30821c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile C5.b f30823b;

    public w(C5.b bVar) {
        this.f30823b = bVar;
    }

    @Override // C5.b
    public Object get() {
        Object obj;
        Object obj2 = this.f30822a;
        Object obj3 = f30821c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f30822a;
                if (obj == obj3) {
                    obj = this.f30823b.get();
                    this.f30822a = obj;
                    this.f30823b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
