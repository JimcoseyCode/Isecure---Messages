package O8;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f8605a;

        public a(Function2 function2) {
            this.f8605a = function2;
        }

        @Override // O8.i
        public Iterator iterator() {
            return m.a(this.f8605a);
        }
    }

    public static final Iterator a(Function2 block) {
        AbstractC2855l.g(block, "block");
        j jVar = new j();
        jVar.m(AbstractC3016b.a(block, jVar, jVar));
        return jVar;
    }

    public static i b(Function2 block) {
        AbstractC2855l.g(block, "block");
        return new a(block);
    }
}
