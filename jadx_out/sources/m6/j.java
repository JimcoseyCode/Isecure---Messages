package M6;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends Event {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f7529e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f7530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f7531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f7532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f7533d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(int i10, int i11, float f10, boolean z10, boolean z11, short s10) {
        super(i10, i11);
        this.f7530a = f10;
        this.f7531b = z10;
        this.f7532c = z11;
        this.f7533d = s10;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.f7533d;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, this.f7530a);
        writableMapCreateMap.putInt("closing", this.f7531b ? 1 : 0);
        writableMapCreateMap.putInt("goingForward", this.f7532c ? 1 : 0);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topTransitionProgress";
    }
}
