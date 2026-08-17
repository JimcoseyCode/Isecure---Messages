package U0;

import kotlin.jvm.functions.Function1;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3487a f10777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f10778c;

        a(InterfaceC3487a interfaceC3487a, Function1 function1) {
            this.f10777b = interfaceC3487a;
            this.f10778c = function1;
        }

        @Override // U0.k
        public float a() {
            return ((Number) this.f10777b.invoke()).floatValue();
        }

        @Override // U0.k
        public void b(float f10) {
            this.f10778c.invoke(Float.valueOf(f10));
        }
    }

    private static final k a(Function1 function1, InterfaceC3487a interfaceC3487a) {
        return new a(interfaceC3487a, function1);
    }

    public static final m b(Function1 function1, InterfaceC3487a interfaceC3487a, float f10) {
        k kVarA = a(function1, interfaceC3487a);
        return Float.isNaN(f10) ? new m(kVarA) : new m(kVarA, f10);
    }
}
