package K6;

import J6.m;
import J6.z;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f7074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f7075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f7076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f7077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z f7078i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m handler) {
        super(handler);
        AbstractC2855l.g(handler, "handler");
        this.f7074e = handler.L();
        this.f7075f = handler.M();
        this.f7076g = handler.J();
        this.f7077h = handler.K();
        this.f7078i = handler.X0();
    }

    @Override // K6.b
    public void a(WritableMap eventData) {
        AbstractC2855l.g(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", PixelUtil.toDIPFromPixel(this.f7074e));
        eventData.putDouble("y", PixelUtil.toDIPFromPixel(this.f7075f));
        eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(this.f7076g));
        eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(this.f7077h));
        if (this.f7078i.a() == -1.0d) {
            return;
        }
        eventData.putMap("stylusData", this.f7078i.b());
    }
}
