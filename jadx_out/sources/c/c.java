package C;

import android.util.Range;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends A.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f450j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Range f451k = new Range(30, 30);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f454i = b.f445h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(int i10, int i11) {
        this.f452g = i10;
        this.f453h = i11;
    }

    @Override // A.b
    public b c() {
        return this.f454i;
    }

    public final int f() {
        return this.f453h;
    }

    public final int g() {
        return this.f452g;
    }

    public String toString() {
        return "FpsRangeFeature(minFps=" + this.f452g + ", maxFps=" + this.f453h + ')';
    }
}
