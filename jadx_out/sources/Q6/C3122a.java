package q6;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import i7.C2735B;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: q6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3122a extends Event {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0346a f30826b = new C0346a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3123b f30827a;

    /* JADX INFO: renamed from: q6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0346a {
        public /* synthetic */ C0346a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0346a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3122a(int i10, int i11, C3123b event) {
        super(i10, i11);
        AbstractC2855l.g(event, "event");
        this.f30827a = event;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", this.f30827a.e());
        writableMapCreateMap.putInt("parentScrollViewTarget", this.f30827a.d());
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("x", this.f30827a.g());
        writableMapCreateMap2.putDouble("y", this.f30827a.h());
        writableMapCreateMap2.putDouble("width", this.f30827a.f());
        writableMapCreateMap2.putDouble("height", this.f30827a.c());
        writableMapCreateMap2.putDouble("absoluteX", this.f30827a.a());
        writableMapCreateMap2.putDouble("absoluteY", this.f30827a.b());
        C2735B c2735b = C2735B.f28704a;
        writableMapCreateMap.putMap("layout", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topFocusedInputLayoutChanged";
    }
}
