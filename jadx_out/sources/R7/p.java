package R7;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
class p implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q f10092g;

    public p(q qVar) {
        this.f10092g = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(q.P(this.f10092g, (Method) obj));
    }
}
