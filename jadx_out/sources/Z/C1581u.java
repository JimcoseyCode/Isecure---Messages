package Z;

import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: Z.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1581u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S f13474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1579s f13475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f13476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private H0.a f13477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Executor f13478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f13479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f13480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f13481h;

    public C1581u(Context context, S recorder, AbstractC1579s outputOptions) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(recorder, "recorder");
        AbstractC2855l.g(outputOptions, "outputOptions");
        this.f13474a = recorder;
        this.f13475b = outputOptions;
        Context contextA = H.f.a(context);
        AbstractC2855l.f(contextA, "getApplicationContext(...)");
        this.f13476c = contextA;
    }

    public static /* synthetic */ C1581u k(C1581u c1581u, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c1581u.j(z10);
    }

    public final Context a() {
        return this.f13476c;
    }

    public final H0.a b() {
        return this.f13477d;
    }

    public final Executor c() {
        return this.f13478e;
    }

    public final AbstractC1579s d() {
        return this.f13475b;
    }

    public final S e() {
        return this.f13474a;
    }

    public final boolean f() {
        return this.f13479f;
    }

    public final boolean g() {
        return this.f13480g;
    }

    public final boolean h() {
        return this.f13481h;
    }

    public final b0 i(Executor listenerExecutor, H0.a listener) {
        AbstractC2855l.g(listenerExecutor, "listenerExecutor");
        AbstractC2855l.g(listener, "listener");
        H0.g.h(listenerExecutor, "Listener Executor can't be null.");
        H0.g.h(listener, "Event listener can't be null");
        this.f13478e = listenerExecutor;
        this.f13477d = listener;
        b0 b0VarZ0 = this.f13474a.z0(this);
        AbstractC2855l.f(b0VarZ0, "start(...)");
        return b0VarZ0;
    }

    public final C1581u j(boolean z10) {
        if (androidx.core.content.d.b(this.f13476c, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
        }
        H0.g.j(this.f13474a.R(), "The Recorder this recording is associated to doesn't support audio.");
        this.f13479f = true;
        this.f13480g = z10;
        return this;
    }
}
