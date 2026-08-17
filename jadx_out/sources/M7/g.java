package M7;

import C8.AbstractC0407d0;
import C8.N0;
import C8.S;
import I7.o;
import L7.H;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import q8.C3136a;
import q8.C3137b;
import q8.x;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k8.f f7565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k8.f f7566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k8.f f7567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k8.f f7568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final k8.f f7569e;

    static {
        k8.f fVarQ = k8.f.q("message");
        AbstractC2855l.f(fVarQ, "identifier(...)");
        f7565a = fVarQ;
        k8.f fVarQ2 = k8.f.q("replaceWith");
        AbstractC2855l.f(fVarQ2, "identifier(...)");
        f7566b = fVarQ2;
        k8.f fVarQ3 = k8.f.q("level");
        AbstractC2855l.f(fVarQ3, "identifier(...)");
        f7567c = fVarQ3;
        k8.f fVarQ4 = k8.f.q("expression");
        AbstractC2855l.f(fVarQ4, "identifier(...)");
        f7568d = fVarQ4;
        k8.f fVarQ5 = k8.f.q("imports");
        AbstractC2855l.f(fVarQ5, "identifier(...)");
        f7569e = fVarQ5;
    }

    public static final c b(I7.i iVar, String message, String replaceWith, String level, boolean z10) {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(message, "message");
        AbstractC2855l.g(replaceWith, "replaceWith");
        AbstractC2855l.g(level, "level");
        l lVar = new l(iVar, o.a.f5144B, K.l(t.a(f7568d, new x(replaceWith)), t.a(f7569e, new C3137b(AbstractC2800q.j(), new f(iVar)))), false, 8, null);
        k8.c cVar = o.a.f5231y;
        Pair pairA = t.a(f7565a, new x(message));
        Pair pairA2 = t.a(f7566b, new C3136a(lVar));
        k8.f fVar = f7567c;
        k8.b bVarC = k8.b.f29200d.c(o.a.f5142A);
        k8.f fVarQ = k8.f.q(level);
        AbstractC2855l.f(fVarQ, "identifier(...)");
        return new l(iVar, cVar, K.l(pairA, pairA2, t.a(fVar, new q8.k(bVarC, fVarQ))), z10);
    }

    public static /* synthetic */ c c(I7.i iVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        if ((i10 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return b(iVar, str, str2, str3, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S d(I7.i iVar, H module) {
        AbstractC2855l.g(module, "module");
        AbstractC0407d0 abstractC0407d0L = module.n().l(N0.f592k, iVar.W());
        AbstractC2855l.f(abstractC0407d0L, "getArrayType(...)");
        return abstractC0407d0L;
    }
}
