package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: androidx.activity.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1604c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f13822f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f13823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f13824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f13825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f13827e;

    /* JADX INFO: renamed from: androidx.activity.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C1604c(float f10, float f11, float f12, int i10, long j10) {
        this.f13823a = f10;
        this.f13824b = f11;
        this.f13825c = f12;
        this.f13826d = i10;
        this.f13827e = j10;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f13823a + ", touchY=" + this.f13824b + ", progress=" + this.f13825c + ", swipeEdge=" + this.f13826d + ", frameTimeMillis=" + this.f13827e + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1604c(BackEvent backEvent) {
        AbstractC2855l.g(backEvent, "backEvent");
        C1602a c1602a = C1602a.f13820a;
        this(c1602a.c(backEvent), c1602a.d(backEvent), c1602a.a(backEvent), c1602a.b(backEvent), Build.VERSION.SDK_INT >= 36 ? C1603b.f13821a.a(backEvent) : 0L);
    }
}
