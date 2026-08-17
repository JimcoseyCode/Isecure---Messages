package K6;

import J6.q;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f7084e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q handler) {
        super(handler);
        AbstractC2855l.g(handler, "handler");
        this.f7084e = handler.f0();
    }

    @Override // K6.b
    public void a(WritableMap eventData) {
        AbstractC2855l.g(eventData, "eventData");
        super.a(eventData);
        eventData.putBoolean("pointerInside", this.f7084e);
    }
}
