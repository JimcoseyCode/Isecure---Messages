package R7;

import b8.InterfaceC1817a;
import b8.InterfaceC1819c;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends AbstractC1396h implements InterfaceC1819c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Annotation f10084c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k8.f fVar, Annotation annotation) {
        super(fVar, null);
        AbstractC2855l.g(annotation, "annotation");
        this.f10084c = annotation;
    }

    @Override // b8.InterfaceC1819c
    public InterfaceC1817a a() {
        return new C1395g(this.f10084c);
    }
}
