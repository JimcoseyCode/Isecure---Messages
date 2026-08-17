package S6;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends Event implements P6.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f10310d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10313c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements P6.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // P6.b
        public String a() {
            return "onNativeFocusChange";
        }

        @Override // P6.b
        public String getEventName() {
            return "topNativeFocusChange";
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, int i11, String tabKey, int i12, boolean z10) {
        super(i10, i11);
        AbstractC2855l.g(tabKey, "tabKey");
        this.f10311a = tabKey;
        this.f10312b = i12;
        this.f10313c = z10;
    }

    @Override // P6.b
    public String a() {
        return "onNativeFocusChange";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) ((this.f10312b * 10) + (this.f10313c ? 1 : 0));
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("tabKey", this.f10311a);
        writableMapCreateMap.putBoolean("repeatedSelectionHandledBySpecialEffect", this.f10313c);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topNativeFocusChange";
    }
}
