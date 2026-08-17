package q6;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: renamed from: q6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3127f extends Event {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f30847f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a.EnumC0347a f30848g = a.EnumC0347a.f30857h;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a.EnumC0347a f30849h = a.EnumC0347a.f30858i;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a.EnumC0347a f30850i = a.EnumC0347a.f30859j;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a.EnumC0347a f30851j = a.EnumC0347a.f30860k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.EnumC0347a f30852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f30853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f30854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f30855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f30856e;

    /* JADX INFO: renamed from: q6.f$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: q6.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class EnumC0347a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final EnumC0347a f30857h = new EnumC0347a("Move", 0, "topKeyboardMove");

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final EnumC0347a f30858i = new EnumC0347a("Start", 1, "topKeyboardMoveStart");

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final EnumC0347a f30859j = new EnumC0347a("End", 2, "topKeyboardMoveEnd");

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final EnumC0347a f30860k = new EnumC0347a("Interactive", 3, "topKeyboardMoveInteractive");

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static final /* synthetic */ EnumC0347a[] f30861l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private static final /* synthetic */ EnumEntries f30862m;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final String f30863g;

            static {
                EnumC0347a[] enumC0347aArrH = h();
                f30861l = enumC0347aArrH;
                f30862m = AbstractC3083a.a(enumC0347aArrH);
            }

            private EnumC0347a(String str, int i10, String str2) {
                this.f30863g = str2;
            }

            private static final /* synthetic */ EnumC0347a[] h() {
                return new EnumC0347a[]{f30857h, f30858i, f30859j, f30860k};
            }

            public static EnumC0347a valueOf(String str) {
                return (EnumC0347a) Enum.valueOf(EnumC0347a.class, str);
            }

            public static EnumC0347a[] values() {
                return (EnumC0347a[]) f30861l.clone();
            }

            public final String j() {
                return this.f30863g;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC0347a a() {
            return C3127f.f30850i;
        }

        public final EnumC0347a b() {
            return C3127f.f30851j;
        }

        public final EnumC0347a c() {
            return C3127f.f30848g;
        }

        public final EnumC0347a d() {
            return C3127f.f30849h;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3127f(int i10, int i11, a.EnumC0347a event, double d10, double d11, int i12, int i13) {
        super(i10, i11);
        AbstractC2855l.g(event, "event");
        this.f30852a = event;
        this.f30853b = d10;
        this.f30854c = d11;
        this.f30855d = i12;
        this.f30856e = i13;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, this.f30854c);
        writableMapCreateMap.putDouble("height", this.f30853b);
        writableMapCreateMap.putInt("duration", this.f30855d);
        writableMapCreateMap.putInt("target", this.f30856e);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return this.f30852a.j();
    }
}
