package R6;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0105a f10039c = new C0105a(null);

    /* JADX INFO: renamed from: R6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0105a implements P6.b {
        public /* synthetic */ C0105a(DefaultConstructorMarker defaultConstructorMarker) {
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

        private C0105a() {
        }
    }

    public a(int i10, int i11) {
        super(i10, i11, "topDidAppear", "onDidAppear");
    }
}
