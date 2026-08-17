package K6;

import J6.B;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f7102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f7103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f7104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f7105h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(B handler) {
        super(handler);
        AbstractC2855l.g(handler, "handler");
        this.f7102e = handler.L();
        this.f7103f = handler.M();
        this.f7104g = handler.J();
        this.f7105h = handler.K();
    }

    @Override // K6.b
    public void a(WritableMap eventData) {
        AbstractC2855l.g(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", PixelUtil.toDIPFromPixel(this.f7102e));
        eventData.putDouble("y", PixelUtil.toDIPFromPixel(this.f7103f));
        eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(this.f7104g));
        eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(this.f7105h));
    }
}
