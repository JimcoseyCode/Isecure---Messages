package Q0;

import R8.C1404d0;
import R8.N;
import R8.O;
import R8.T0;
import android.content.Context;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: Q0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0097a extends n implements Function1 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0097a f8982h = new C0097a();

        C0097a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context it) {
            AbstractC2855l.g(it, "it");
            return AbstractC2800q.j();
        }
    }

    public static final kotlin.properties.c a(String name, O0.b bVar, Function1 produceMigrations, N scope) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(produceMigrations, "produceMigrations");
        AbstractC2855l.g(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ kotlin.properties.c b(String str, O0.b bVar, Function1 function1, N n10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            function1 = C0097a.f8982h;
        }
        if ((i10 & 8) != 0) {
            n10 = O.a(C1404d0.b().X(T0.b(null, 1, null)));
        }
        return a(str, bVar, function1, n10);
    }
}
