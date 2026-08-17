package j0;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2759a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0301a f28861k = new C0301a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f28862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f28865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f28867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f28868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f28869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private GestureDetector f28871j;

    /* JADX INFO: renamed from: j0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0301a {
        public /* synthetic */ C0301a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0301a() {
        }
    }

    /* JADX INFO: renamed from: j0.a$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
    }

    /* JADX INFO: renamed from: j0.a$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e10) {
            AbstractC2855l.g(e10, "e");
            C2759a.this.f28868g = e10.getX();
            C2759a.this.f28869h = e10.getY();
            C2759a.this.f28870i = 1;
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2759a(Context context, b listener) {
        this(context, 0, 0, listener, 6, null);
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(listener, "listener");
    }

    public C2759a(Context context, int i10, int i11, b listener) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(listener, "listener");
        this.f28862a = context;
        this.f28863b = i10;
        this.f28864c = i11;
        this.f28865d = listener;
        this.f28866e = true;
        this.f28867f = true;
        this.f28871j = new GestureDetector(context, new c());
    }

    public /* synthetic */ C2759a(Context context, int i10, int i11, b bVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i10, (i12 & 4) != 0 ? 0 : i11, bVar);
    }
}
