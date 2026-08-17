package X6;

import android.animation.FloatEvaluator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends FloatEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f12499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f12500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Number f12501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Number f12502d;

    public a(Function1 startValueProvider, Function1 endValueProvider) {
        AbstractC2855l.g(startValueProvider, "startValueProvider");
        AbstractC2855l.g(endValueProvider, "endValueProvider");
        this.f12499a = startValueProvider;
        this.f12500b = endValueProvider;
    }

    private final Number a(Number number) {
        if (this.f12502d == null) {
            this.f12502d = (Number) this.f12500b.invoke(number);
        }
        return this.f12502d;
    }

    private final Number b(Number number) {
        if (this.f12501c == null) {
            this.f12501c = (Number) this.f12499a.invoke(number);
        }
        return this.f12501c;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.TypeEvaluator
    public Float evaluate(float f10, Number number, Number number2) {
        Number numberB = b(number);
        Number numberA = a(number2);
        if (numberB == null || numberA == null) {
            return null;
        }
        return super.evaluate(f10, numberB, numberA);
    }
}
