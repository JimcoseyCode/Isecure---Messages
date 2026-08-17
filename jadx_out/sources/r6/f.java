package R6;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f10046c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements P6.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // P6.b
        public String a() {
            return "onWillDisappear";
        }

        @Override // P6.b
        public String getEventName() {
            return "topWillDisappear";
        }

        private a() {
        }
    }

    public f(int i10, int i11) {
        super(i10, i11, "topWillDisappear", "onWillDisappear");
    }
}
