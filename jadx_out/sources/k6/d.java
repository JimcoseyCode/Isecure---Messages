package K6;

import J6.o;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f7079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f7080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f7081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f7082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f7083i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o handler) {
        super(handler);
        AbstractC2855l.g(handler, "handler");
        this.f7079e = handler.L();
        this.f7080f = handler.M();
        this.f7081g = handler.J();
        this.f7082h = handler.K();
        this.f7083i = handler.Y0();
    }

    @Override // K6.b
    public void a(WritableMap eventData) {
        AbstractC2855l.g(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", PixelUtil.toDIPFromPixel(this.f7079e));
        eventData.putDouble("y", PixelUtil.toDIPFromPixel(this.f7080f));
        eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(this.f7081g));
        eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(this.f7082h));
        eventData.putInt("duration", this.f7083i);
    }
}
