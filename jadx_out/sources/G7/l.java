package G7;

import j7.AbstractC2800q;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f3525a = new l();

    private l() {
    }

    @Override // G7.h
    public List a() {
        return AbstractC2800q.j();
    }

    @Override // G7.h
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) c();
    }

    public Void c() {
        return null;
    }

    @Override // G7.h
    public Object call(Object[] args) {
        AbstractC2855l.g(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // G7.h
    public Type getReturnType() {
        Class TYPE = Void.TYPE;
        AbstractC2855l.f(TYPE, "TYPE");
        return TYPE;
    }
}
