package K6;

import J6.AbstractC1274d;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7073d;

    public b(AbstractC1274d handler) {
        AbstractC2855l.g(handler, "handler");
        this.f7070a = handler.O();
        this.f7071b = handler.T();
        this.f7072c = handler.S();
        this.f7073d = handler.Q();
    }

    public void a(WritableMap eventData) {
        AbstractC2855l.g(eventData, "eventData");
        eventData.putInt("numberOfPointers", this.f7070a);
        eventData.putInt("handlerTag", this.f7071b);
        eventData.putInt("state", this.f7072c);
        eventData.putInt("pointerType", this.f7073d);
    }
}
