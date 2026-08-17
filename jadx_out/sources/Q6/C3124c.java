package q6;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import i7.C2735B;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: q6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3124c extends Event {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30836b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3125d f30837a;

    /* JADX INFO: renamed from: q6.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3124c(int i10, int i11, C3125d event) {
        super(i10, i11);
        AbstractC2855l.g(event, "event");
        this.f30837a = event;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", this.f30837a.g());
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        writableMapCreateMap3.putDouble("x", this.f30837a.e());
        writableMapCreateMap3.putDouble("y", this.f30837a.f());
        writableMapCreateMap3.putInt(ViewProps.POSITION, this.f30837a.d());
        C2735B c2735b = C2735B.f28704a;
        writableMapCreateMap2.putMap(ViewProps.START, writableMapCreateMap3);
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        writableMapCreateMap4.putDouble("x", this.f30837a.b());
        writableMapCreateMap4.putDouble("y", this.f30837a.c());
        writableMapCreateMap4.putInt(ViewProps.POSITION, this.f30837a.a());
        writableMapCreateMap2.putMap(ViewProps.END, writableMapCreateMap4);
        writableMapCreateMap.putMap("selection", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topFocusedInputSelectionChanged";
    }
}
