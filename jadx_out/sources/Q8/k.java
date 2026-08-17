package q8;

import C8.AbstractC0407d0;
import C8.S;
import L7.AbstractC1299y;
import L7.H;
import L7.InterfaceC1280e;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3027i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k8.b f30874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k8.f f30875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(k8.b enumClassId, k8.f enumEntryName) {
        super(i7.t.a(enumClassId, enumEntryName));
        AbstractC2855l.g(enumClassId, "enumClassId");
        AbstractC2855l.g(enumEntryName, "enumEntryName");
        this.f30874b = enumClassId;
        this.f30875c = enumEntryName;
    }

    @Override // q8.g
    public S a(H module) {
        AbstractC0407d0 abstractC0407d0R;
        AbstractC2855l.g(module, "module");
        InterfaceC1280e interfaceC1280eB = AbstractC1299y.b(module, this.f30874b);
        if (interfaceC1280eB != null) {
            if (!AbstractC3027i.A(interfaceC1280eB)) {
                interfaceC1280eB = null;
            }
            if (interfaceC1280eB != null && (abstractC0407d0R = interfaceC1280eB.r()) != null) {
                return abstractC0407d0R;
            }
        }
        return E8.l.d(E8.k.f1174E0, this.f30874b.toString(), this.f30875c.toString());
    }

    public final k8.f c() {
        return this.f30875c;
    }

    @Override // q8.g
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30874b.h());
        sb.append('.');
        sb.append(this.f30875c);
        return sb.toString();
    }
}
