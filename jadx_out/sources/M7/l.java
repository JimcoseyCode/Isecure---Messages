package M7;

import C8.AbstractC0407d0;
import C8.S;
import L7.h0;
import i7.AbstractC2746i;
import i7.EnumC2749l;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I7.i f7575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k8.c f7576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f7577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f7578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f7579e;

    public l(I7.i builtIns, k8.c fqName, Map allValueArguments, boolean z10) {
        AbstractC2855l.g(builtIns, "builtIns");
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(allValueArguments, "allValueArguments");
        this.f7575a = builtIns;
        this.f7576b = fqName;
        this.f7577c = allValueArguments;
        this.f7578d = z10;
        this.f7579e = AbstractC2746i.a(EnumC2749l.f28717h, new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC0407d0 c(l lVar) {
        return lVar.f7575a.o(lVar.d()).r();
    }

    @Override // M7.c
    public Map a() {
        return this.f7577c;
    }

    @Override // M7.c
    public k8.c d() {
        return this.f7576b;
    }

    @Override // M7.c
    public h0 g() {
        h0 NO_SOURCE = h0.f7335a;
        AbstractC2855l.f(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // M7.c
    public S getType() {
        Object value = this.f7579e.getValue();
        AbstractC2855l.f(value, "getValue(...)");
        return (S) value;
    }

    public /* synthetic */ l(I7.i iVar, k8.c cVar, Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, cVar, map, (i10 & 8) != 0 ? false : z10);
    }
}
