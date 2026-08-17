package K6;

import J6.x;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f7098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f7099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f7100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f7101h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x handler) {
        super(handler);
        AbstractC2855l.g(handler, "handler");
        this.f7098e = handler.Y0();
        this.f7099f = handler.W0();
        this.f7100g = handler.X0();
        this.f7101h = handler.Z0();
    }

    @Override // K6.b
    public void a(WritableMap eventData) {
        AbstractC2855l.g(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble(ViewProps.ROTATION, this.f7098e);
        eventData.putDouble("anchorX", PixelUtil.toDIPFromPixel(this.f7099f));
        eventData.putDouble("anchorY", PixelUtil.toDIPFromPixel(this.f7100g));
        eventData.putDouble("velocity", this.f7101h);
    }
}
