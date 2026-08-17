package q8;

import C8.S;
import L7.H;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: q8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C3137b extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f30868b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3137b(List value, Function1 computeType) {
        super(value);
        AbstractC2855l.g(value, "value");
        AbstractC2855l.g(computeType, "computeType");
        this.f30868b = computeType;
    }

    @Override // q8.g
    public S a(H module) {
        AbstractC2855l.g(module, "module");
        S s10 = (S) this.f30868b.invoke(module);
        if (!I7.i.c0(s10) && !I7.i.q0(s10)) {
            I7.i.D0(s10);
        }
        return s10;
    }
}
