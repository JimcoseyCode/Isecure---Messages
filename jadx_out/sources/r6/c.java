package R6;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f10041d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10042c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements P6.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // P6.b
        public String a() {
            return "onDismiss";
        }

        @Override // P6.b
        public String getEventName() {
            return "topDismiss";
        }

        private a() {
        }
    }

    public c(int i10, int i11, boolean z10) {
        super(i10, i11, "topDismiss", "onDismiss");
        this.f10042c = z10;
    }

    @Override // R6.d, com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("isNativeDismiss", this.f10042c);
        return writableMapCreateMap;
    }
}
