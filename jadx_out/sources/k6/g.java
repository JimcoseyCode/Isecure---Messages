package K6;

import J6.t;
import J6.z;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f7085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f7086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f7087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f7088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f7089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f7090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f7091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f7092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final z f7093m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t handler) {
        super(handler);
        AbstractC2855l.g(handler, "handler");
        this.f7085e = handler.L();
        this.f7086f = handler.M();
        this.f7087g = handler.J();
        this.f7088h = handler.K();
        this.f7089i = handler.n1();
        this.f7090j = handler.o1();
        this.f7091k = handler.p1();
        this.f7092l = handler.q1();
        this.f7093m = handler.m1();
    }

    @Override // K6.b
    public void a(WritableMap eventData) {
        AbstractC2855l.g(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", PixelUtil.toDIPFromPixel(this.f7085e));
        eventData.putDouble("y", PixelUtil.toDIPFromPixel(this.f7086f));
        eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(this.f7087g));
        eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(this.f7088h));
        eventData.putDouble("translationX", PixelUtil.toDIPFromPixel(this.f7089i));
        eventData.putDouble("translationY", PixelUtil.toDIPFromPixel(this.f7090j));
        eventData.putDouble("velocityX", PixelUtil.toDIPFromPixel(this.f7091k));
        eventData.putDouble("velocityY", PixelUtil.toDIPFromPixel(this.f7092l));
        if (this.f7093m.a() == -1.0d) {
            return;
        }
        eventData.putMap("stylusData", this.f7093m.b());
    }
}
