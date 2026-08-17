package i7;

import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: i7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2747j {

    /* JADX INFO: renamed from: i7.j$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28715a;

        static {
            int[] iArr = new int[EnumC2749l.values().length];
            try {
                iArr[EnumC2749l.f28716g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2749l.f28717h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2749l.f28718i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28715a = iArr;
        }
    }

    public static Lazy a(EnumC2749l mode, InterfaceC3487a initializer) {
        AbstractC2855l.g(mode, "mode");
        AbstractC2855l.g(initializer, "initializer");
        int i10 = a.f28715a[mode.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new C2755r(initializer, defaultConstructorMarker, i11, defaultConstructorMarker);
        }
        if (i10 == 2) {
            return new C2754q(initializer);
        }
        if (i10 == 3) {
            return new C2736C(initializer);
        }
        throw new C2750m();
    }

    public static Lazy b(InterfaceC3487a initializer) {
        AbstractC2855l.g(initializer, "initializer");
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new C2755r(initializer, defaultConstructorMarker, 2, defaultConstructorMarker);
    }
}
