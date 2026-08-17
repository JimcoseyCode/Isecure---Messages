package com.google.firebase.messaging;

import P4.AbstractC1378l;
import P4.AbstractC1381o;
import P4.C1379m;
import P4.InterfaceC1372f;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.google.firebase.messaging.m0;
import f1.ExecutorC2595b;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.firebase.messaging.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractServiceC2241i extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = AbstractC2247o.d();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* JADX INFO: renamed from: com.google.firebase.messaging.i$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements m0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.m0.a
        public AbstractC1378l a(Intent intent) {
            return AbstractServiceC2241i.this.d(intent);
        }
    }

    public static /* synthetic */ void a(AbstractServiceC2241i abstractServiceC2241i, Intent intent, C1379m c1379m) {
        abstractServiceC2241i.getClass();
        try {
            abstractServiceC2241i.handleIntent(intent);
        } finally {
            c1379m.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Intent intent) {
        if (intent != null) {
            k0.c(intent);
        }
        synchronized (this.lock) {
            try {
                int i10 = this.runningTasks - 1;
                this.runningTasks = i10;
                if (i10 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC1378l d(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return AbstractC1381o.f(null);
        }
        final C1379m c1379m = new C1379m();
        this.executor.execute(new Runnable() { // from class: com.google.firebase.messaging.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC2241i.a(this.f24267g, intent, c1379m);
            }
        });
        return c1379m.a();
    }

    protected abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.binder == null) {
                this.binder = new m0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.lock) {
            this.lastStartId = i11;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            c(intent);
            return 2;
        }
        AbstractC1378l abstractC1378lD = d(startCommandIntent);
        if (abstractC1378lD.o()) {
            c(intent);
            return 2;
        }
        abstractC1378lD.d(new ExecutorC2595b(), new InterfaceC1372f() { // from class: com.google.firebase.messaging.g
            @Override // P4.InterfaceC1372f
            public final void onComplete(AbstractC1378l abstractC1378l) {
                this.f24260a.c(intent);
            }
        });
        return 3;
    }

    boolean stopSelfResultHook(int i10) {
        return stopSelfResult(i10);
    }
}
