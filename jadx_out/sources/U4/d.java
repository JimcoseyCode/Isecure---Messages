package u4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f32675b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f32676a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Executor f32677b;

        public a a(o4.g gVar) {
            this.f32676a.add(gVar);
            return this;
        }

        public d b() {
            return new d(this.f32676a, null, this.f32677b, true, null);
        }
    }

    /* synthetic */ d(List list, InterfaceC3402a interfaceC3402a, Executor executor, boolean z10, g gVar) {
        AbstractC3268i.l(list, "APIs must not be null.");
        AbstractC3268i.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            AbstractC3268i.l(interfaceC3402a, "Listener must not be null when listener executor is set.");
        }
        this.f32674a = list;
        this.f32675b = executor;
    }

    public static a d() {
        return new a();
    }

    public List a() {
        return this.f32674a;
    }

    public InterfaceC3402a b() {
        return null;
    }

    public Executor c() {
        return this.f32675b;
    }
}
