package E6;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Event {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0038a f1113c = new C0038a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f1115b;

    /* JADX INFO: renamed from: E6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0038a {
        public /* synthetic */ C0038a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0038a() {
        }
    }

    public a(int i10, int i11, float f10) {
        super(i10);
        this.f1114a = i11;
        this.f1115b = (Float.isInfinite(f10) || Float.isNaN(f10)) ? 0.0f : f10;
    }

    private final WritableMap b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(ViewProps.POSITION, this.f1114a);
        writableMapCreateMap.putDouble("offset", this.f1115b);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        AbstractC2855l.g(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), internal_getEventNameCompat(), b());
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topPageScroll";
    }
}
