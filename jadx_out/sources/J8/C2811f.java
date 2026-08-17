package j8;

import i8.AbstractC2757a;
import j7.AbstractC2800q;
import j7.T;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: j8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2811f extends AbstractC2812g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC2757a.e f28947h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2811f(AbstractC2757a.e types, String[] strings) {
        Set setT0;
        AbstractC2855l.g(types, "types");
        AbstractC2855l.g(strings, "strings");
        List listW = types.w();
        if (listW.isEmpty()) {
            setT0 = T.e();
        } else {
            AbstractC2855l.d(listW);
            setT0 = AbstractC2800q.T0(listW);
        }
        List listX = types.x();
        AbstractC2855l.f(listX, "getRecordList(...)");
        super(strings, setT0, AbstractC2813h.a(listX));
        this.f28947h = types;
    }
}
