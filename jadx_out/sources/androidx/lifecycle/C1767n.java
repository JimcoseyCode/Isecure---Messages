package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1767n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1767n f17602a = new C1767n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f17603b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.n$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC1760g {
        @Override // androidx.lifecycle.AbstractC1760g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC2855l.g(activity, "activity");
            G.INSTANCE.c(activity);
        }
    }

    private C1767n() {
    }

    public static final void a(Context context) {
        AbstractC2855l.g(context, "context");
        if (f17603b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        AbstractC2855l.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
