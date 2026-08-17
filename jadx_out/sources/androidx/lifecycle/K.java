package androidx.lifecycle;

import androidx.lifecycle.AbstractC1764k;
import h1.C2697f;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class K implements InterfaceC1768o, AutoCloseable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f17539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final I f17540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17541i;

    public K(String key, I handle) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(handle, "handle");
        this.f17539g = key;
        this.f17540h = handle;
    }

    public final void d(C2697f registry, AbstractC1764k lifecycle) {
        AbstractC2855l.g(registry, "registry");
        AbstractC2855l.g(lifecycle, "lifecycle");
        if (this.f17541i) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f17541i = true;
        lifecycle.a(this);
        registry.c(this.f17539g, this.f17540h.a());
    }

    @Override // androidx.lifecycle.InterfaceC1768o
    public void k(r source, AbstractC1764k.a event) {
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(event, "event");
        if (event == AbstractC1764k.a.ON_DESTROY) {
            this.f17541i = false;
            source.getLifecycle().d(this);
        }
    }

    public final I m() {
        return this.f17540h;
    }

    public final boolean r() {
        return this.f17541i;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }
}
