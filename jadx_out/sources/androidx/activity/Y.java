package androidx.activity;

import android.content.res.Resources;
import androidx.activity.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f13815e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f13819d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Y c(a aVar, int i10, int i11, Function1 function1, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                function1 = new Function1() { // from class: androidx.activity.X
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(Y.a.d((Resources) obj2));
                    }
                };
            }
            return aVar.b(i10, i11, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(Resources resources) {
            AbstractC2855l.g(resources, "resources");
            return (resources.getConfiguration().uiMode & 48) == 32;
        }

        public final Y b(int i10, int i11, Function1 detectDarkMode) {
            AbstractC2855l.g(detectDarkMode, "detectDarkMode");
            return new Y(i10, i11, 0, detectDarkMode, null);
        }

        private a() {
        }
    }

    public /* synthetic */ Y(int i10, int i11, int i12, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, function1);
    }

    public final int a() {
        return this.f13817b;
    }

    public final Function1 b() {
        return this.f13819d;
    }

    public final int c() {
        return this.f13818c;
    }

    public final int d(boolean z10) {
        return z10 ? this.f13817b : this.f13816a;
    }

    public final int e(boolean z10) {
        if (this.f13818c == 0) {
            return 0;
        }
        return z10 ? this.f13817b : this.f13816a;
    }

    private Y(int i10, int i11, int i12, Function1 function1) {
        this.f13816a = i10;
        this.f13817b = i11;
        this.f13818c = i12;
        this.f13819d = function1;
    }
}
