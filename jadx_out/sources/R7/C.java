package R7;

import j7.AbstractC2800q;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC2855l;
import t8.EnumC3382e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C extends E implements b8.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f10048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection f10049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f10050d;

    public C(Class reflectType) {
        AbstractC2855l.g(reflectType, "reflectType");
        this.f10048b = reflectType;
        this.f10049c = AbstractC2800q.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R7.E
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public Class N() {
        return this.f10048b;
    }

    @Override // b8.InterfaceC1820d
    public Collection getAnnotations() {
        return this.f10049c;
    }

    @Override // b8.v
    public I7.l getType() {
        if (AbstractC2855l.b(N(), Void.TYPE)) {
            return null;
        }
        return EnumC3382e.k(N().getName()).q();
    }

    @Override // b8.InterfaceC1820d
    public boolean k() {
        return this.f10050d;
    }
}
