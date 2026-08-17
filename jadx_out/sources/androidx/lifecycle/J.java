package androidx.lifecycle;

import androidx.lifecycle.AbstractC1764k;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class J implements InterfaceC1768o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final N f17538g;

    public J(N provider) {
        AbstractC2855l.g(provider, "provider");
        this.f17538g = provider;
    }

    @Override // androidx.lifecycle.InterfaceC1768o
    public void k(r source, AbstractC1764k.a event) {
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(event, "event");
        if (event == AbstractC1764k.a.ON_CREATE) {
            source.getLifecycle().d(this);
            this.f17538g.e();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
