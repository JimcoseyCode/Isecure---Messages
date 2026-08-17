package C8;

import L7.InterfaceC1283h;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class M extends E0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L7.m0[] f588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B0[] f589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f590e;

    public /* synthetic */ M(L7.m0[] m0VarArr, B0[] b0Arr, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(m0VarArr, b0Arr, (i10 & 4) != 0 ? false : z10);
    }

    @Override // C8.E0
    public boolean b() {
        return this.f590e;
    }

    @Override // C8.E0
    public B0 e(S key) {
        AbstractC2855l.g(key, "key");
        InterfaceC1283h interfaceC1283hP = key.K0().p();
        L7.m0 m0Var = interfaceC1283hP instanceof L7.m0 ? (L7.m0) interfaceC1283hP : null;
        if (m0Var == null) {
            return null;
        }
        int index = m0Var.getIndex();
        L7.m0[] m0VarArr = this.f588c;
        if (index >= m0VarArr.length || !AbstractC2855l.b(m0VarArr[index].j(), m0Var.j())) {
            return null;
        }
        return this.f589d[index];
    }

    @Override // C8.E0
    public boolean f() {
        return this.f589d.length == 0;
    }

    public final B0[] i() {
        return this.f589d;
    }

    public final L7.m0[] j() {
        return this.f588c;
    }

    public M(L7.m0[] parameters, B0[] arguments, boolean z10) {
        AbstractC2855l.g(parameters, "parameters");
        AbstractC2855l.g(arguments, "arguments");
        this.f588c = parameters;
        this.f589d = arguments;
        this.f590e = z10;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public M(List parameters, List argumentsList) {
        this((L7.m0[]) parameters.toArray(new L7.m0[0]), (B0[]) argumentsList.toArray(new B0[0]), false, 4, null);
        AbstractC2855l.g(parameters, "parameters");
        AbstractC2855l.g(argumentsList, "argumentsList");
    }
}
