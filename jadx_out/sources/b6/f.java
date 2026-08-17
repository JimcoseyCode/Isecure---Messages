package B6;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f379a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WeakReference f380b;

    private f() {
    }

    public final d a() {
        WeakReference weakReference = f380b;
        if (weakReference != null) {
            return (d) weakReference.get();
        }
        return null;
    }

    public final void b(d view) {
        AbstractC2855l.g(view, "view");
        f380b = new WeakReference(view);
    }
}
