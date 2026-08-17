package S6;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Event implements P6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0108a f10306a = new C0108a(null);

    /* JADX INFO: renamed from: S6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0108a implements P6.b {
        public /* synthetic */ C0108a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // P6.b
        public String a() {
            return "onDidAppear";
        }

        @Override // P6.b
        public String getEventName() {
            return "topDidAppear";
        }

        private C0108a() {
        }
    }

    public a(int i10, int i11) {
        super(i10, i11);
    }

    @Override // P6.b
    public String a() {
        return "onDidAppear";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topDidAppear";
    }
}
