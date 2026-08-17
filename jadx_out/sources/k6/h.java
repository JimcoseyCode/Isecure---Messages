package K6;

import J6.u;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f7094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f7095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f7096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f7097h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u handler) {
        super(handler);
        AbstractC2855l.g(handler, "handler");
        this.f7094e = handler.b1();
        this.f7095f = handler.Z0();
        this.f7096g = handler.a1();
        this.f7097h = handler.c1();
    }

    @Override // K6.b
    public void a(WritableMap eventData) {
        AbstractC2855l.g(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("scale", this.f7094e);
        eventData.putDouble("focalX", PixelUtil.toDIPFromPixel(this.f7095f));
        eventData.putDouble("focalY", PixelUtil.toDIPFromPixel(this.f7096g));
        eventData.putDouble("velocity", this.f7097h);
    }
}
