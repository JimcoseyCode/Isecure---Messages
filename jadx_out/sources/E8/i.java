package E8;

import C8.AbstractC0407d0;
import C8.r0;
import C8.v0;
import j7.AbstractC2800q;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends AbstractC0407d0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v0 f1155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3442k f1156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k f1157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f1158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f1159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String[] f1160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f1161n;

    public /* synthetic */ i(v0 v0Var, InterfaceC3442k interfaceC3442k, k kVar, List list, boolean z10, String[] strArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(v0Var, interfaceC3442k, kVar, (i10 & 8) != 0 ? AbstractC2800q.j() : list, (i10 & 16) != 0 ? false : z10, strArr);
    }

    @Override // C8.S
    public List I0() {
        return this.f1158k;
    }

    @Override // C8.S
    public r0 J0() {
        return r0.f682h.j();
    }

    @Override // C8.S
    public v0 K0() {
        return this.f1155h;
    }

    @Override // C8.S
    public boolean L0() {
        return this.f1159l;
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: R0 */
    public AbstractC0407d0 O0(boolean z10) {
        v0 v0VarK0 = K0();
        InterfaceC3442k interfaceC3442kO = o();
        k kVar = this.f1157j;
        List listI0 = I0();
        String[] strArr = this.f1160m;
        return new i(v0VarK0, interfaceC3442kO, kVar, listI0, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: S0 */
    public AbstractC0407d0 Q0(r0 newAttributes) {
        AbstractC2855l.g(newAttributes, "newAttributes");
        return this;
    }

    public final String T0() {
        return this.f1161n;
    }

    public final k U0() {
        return this.f1157j;
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public i U0(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public final i W0(List newArguments) {
        AbstractC2855l.g(newArguments, "newArguments");
        v0 v0VarK0 = K0();
        InterfaceC3442k interfaceC3442kO = o();
        k kVar = this.f1157j;
        boolean zL0 = L0();
        String[] strArr = this.f1160m;
        return new i(v0VarK0, interfaceC3442kO, kVar, newArguments, zL0, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // C8.S
    public InterfaceC3442k o() {
        return this.f1156i;
    }

    public i(v0 constructor, InterfaceC3442k memberScope, k kind, List arguments, boolean z10, String... formatParams) {
        AbstractC2855l.g(constructor, "constructor");
        AbstractC2855l.g(memberScope, "memberScope");
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(arguments, "arguments");
        AbstractC2855l.g(formatParams, "formatParams");
        this.f1155h = constructor;
        this.f1156i = memberScope;
        this.f1157j = kind;
        this.f1158k = arguments;
        this.f1159l = z10;
        this.f1160m = formatParams;
        H h10 = H.f29375a;
        String strJ = kind.j();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strJ, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC2855l.f(str, "format(...)");
        this.f1161n = str;
    }
}
