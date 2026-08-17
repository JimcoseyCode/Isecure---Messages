package n7;

import i7.C2735B;
import i7.C2752o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final void a(Function2 function2, Object obj, f completion) {
        AbstractC2855l.g(function2, "<this>");
        AbstractC2855l.g(completion, "completion");
        f fVarC = AbstractC3016b.c(AbstractC3016b.a(function2, obj, completion));
        C2752o.a aVar = C2752o.f28721h;
        fVarC.resumeWith(C2752o.b(C2735B.f28704a));
    }
}
