package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e1.e f17558a = new e1.e();

    public final void a(String key, AutoCloseable closeable) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(closeable, "closeable");
        e1.e eVar = this.f17558a;
        if (eVar != null) {
            eVar.d(key, closeable);
        }
    }

    public final void b() {
        e1.e eVar = this.f17558a;
        if (eVar != null) {
            eVar.e();
        }
        d();
    }

    public final AutoCloseable c(String key) {
        AbstractC2855l.g(key, "key");
        e1.e eVar = this.f17558a;
        if (eVar != null) {
            return eVar.g(key);
        }
        return null;
    }

    protected void d() {
    }
}
