package U6;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0118a f11357e = new C0118a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f11358f = new a(false, false, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f11362d;

    /* JADX INFO: renamed from: U6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0118a {
        public /* synthetic */ C0118a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(ReadableMap readableMap) {
            if (readableMap != null) {
                return new a(readableMap.getBoolean(ViewProps.LEFT), readableMap.getBoolean(ViewProps.TOP), readableMap.getBoolean(ViewProps.RIGHT), readableMap.getBoolean(ViewProps.BOTTOM));
            }
            return null;
        }

        private C0118a() {
        }
    }

    public a(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f11359a = z10;
        this.f11360b = z11;
        this.f11361c = z12;
        this.f11362d = z13;
    }

    public final boolean a() {
        return this.f11362d;
    }

    public final boolean b() {
        return this.f11359a;
    }

    public final boolean c() {
        return this.f11361c;
    }

    public final boolean d() {
        return this.f11360b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11359a == aVar.f11359a && this.f11360b == aVar.f11360b && this.f11361c == aVar.f11361c && this.f11362d == aVar.f11362d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f11359a) * 31) + Boolean.hashCode(this.f11360b)) * 31) + Boolean.hashCode(this.f11361c)) * 31) + Boolean.hashCode(this.f11362d);
    }

    public String toString() {
        return "SafeAreaViewEdges(left=" + this.f11359a + ", top=" + this.f11360b + ", right=" + this.f11361c + ", bottom=" + this.f11362d + ")";
    }
}
