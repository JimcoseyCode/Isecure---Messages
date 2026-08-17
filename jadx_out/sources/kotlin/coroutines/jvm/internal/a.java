package kotlin.coroutines.jvm.internal;

import i7.AbstractC2753p;
import i7.C2752o;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements n7.f, e, Serializable {
    private final n7.f completion;

    public a(n7.f fVar) {
        this.completion = fVar;
    }

    public n7.f create(n7.f completion) {
        AbstractC2855l.g(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        n7.f fVar = this.completion;
        if (fVar instanceof e) {
            return (e) fVar;
        }
        return null;
    }

    public final n7.f getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    @Override // n7.f
    public final void resumeWith(Object obj) {
        Object objInvokeSuspend;
        n7.f fVar = this;
        while (true) {
            h.b(fVar);
            a aVar = (a) fVar;
            n7.f fVar2 = aVar.completion;
            AbstractC2855l.d(fVar2);
            try {
                objInvokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th) {
                C2752o.a aVar2 = C2752o.f28721h;
                obj = C2752o.b(AbstractC2753p.a(th));
            }
            if (objInvokeSuspend == AbstractC3016b.e()) {
                return;
            }
            obj = C2752o.b(objInvokeSuspend);
            aVar.releaseIntercepted();
            if (!(fVar2 instanceof a)) {
                fVar2.resumeWith(obj);
                return;
            }
            fVar = fVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public n7.f create(Object obj, n7.f completion) {
        AbstractC2855l.g(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    protected void releaseIntercepted() {
    }
}
