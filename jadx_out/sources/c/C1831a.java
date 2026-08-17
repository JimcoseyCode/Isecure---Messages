package c;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: c.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1831a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f18671a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Context f18672b;

    public final void a(InterfaceC1832b listener) {
        AbstractC2855l.g(listener, "listener");
        Context context = this.f18672b;
        if (context != null) {
            listener.a(context);
        }
        this.f18671a.add(listener);
    }

    public final void b() {
        this.f18672b = null;
    }

    public final void c(Context context) {
        AbstractC2855l.g(context, "context");
        this.f18672b = context;
        Iterator it = this.f18671a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1832b) it.next()).a(context);
        }
    }

    public final Context d() {
        return this.f18672b;
    }

    public final void e(InterfaceC1832b listener) {
        AbstractC2855l.g(listener, "listener");
        this.f18671a.remove(listener);
    }
}
