package m4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class q implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    r f29606c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ w f29609f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f29604a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Messenger f29605b = new Messenger(new E4.f(Looper.getMainLooper(), new Handler.Callback() { // from class: m4.n
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.arg1;
            q qVar = this.f29601a;
            synchronized (qVar) {
                try {
                    t tVar = (t) qVar.f29608e.get(i10);
                    if (tVar == null) {
                        return true;
                    }
                    qVar.f29608e.remove(i10);
                    qVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        tVar.c(new u(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    tVar.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Queue f29607d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final SparseArray f29608e = new SparseArray();

    /* synthetic */ q(w wVar, p pVar) {
        this.f29609f = wVar;
    }

    final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    final synchronized void b(int i10, String str, Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i11 = this.f29604a;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f29604a = 4;
                return;
            }
            this.f29604a = 4;
            x4.b.b().c(this.f29609f.f29617a, this);
            u uVar = new u(i10, str, th);
            Iterator it = this.f29607d.iterator();
            while (it.hasNext()) {
                ((t) it.next()).c(uVar);
            }
            this.f29607d.clear();
            for (int i12 = 0; i12 < this.f29608e.size(); i12++) {
                ((t) this.f29608e.valueAt(i12)).c(uVar);
            }
            this.f29608e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final void c() {
        this.f29609f.f29618b.execute(new Runnable() { // from class: m4.k
            @Override // java.lang.Runnable
            public final void run() {
                final t tVar;
                while (true) {
                    final q qVar = this.f29598g;
                    synchronized (qVar) {
                        try {
                            if (qVar.f29604a != 2) {
                                return;
                            }
                            if (qVar.f29607d.isEmpty()) {
                                qVar.f();
                                return;
                            } else {
                                tVar = (t) qVar.f29607d.poll();
                                qVar.f29608e.put(tVar.f29612a, tVar);
                                qVar.f29609f.f29618b.schedule(new Runnable() { // from class: m4.o
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        qVar.e(tVar.f29612a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } finally {
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(tVar));
                    }
                    w wVar = qVar.f29609f;
                    Messenger messenger = qVar.f29605b;
                    int i10 = tVar.f29614c;
                    Context context = wVar.f29617a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = tVar.f29612a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", tVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", tVar.f29615d);
                    messageObtain.setData(bundle);
                    try {
                        qVar.f29606c.a(messageObtain);
                    } catch (RemoteException e10) {
                        qVar.a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void d() {
        if (this.f29604a == 1) {
            a(1, "Timed out while binding");
        }
    }

    final synchronized void e(int i10) {
        t tVar = (t) this.f29608e.get(i10);
        if (tVar != null) {
            this.f29608e.remove(i10);
            tVar.c(new u(3, "Timed out waiting for response", null));
            f();
        }
    }

    final synchronized void f() {
        if (this.f29604a == 2 && this.f29607d.isEmpty() && this.f29608e.size() == 0) {
            this.f29604a = 3;
            x4.b.b().c(this.f29609f.f29617a, this);
        }
    }

    final synchronized boolean g(t tVar) {
        int i10 = this.f29604a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f29607d.add(tVar);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f29607d.add(tVar);
            c();
            return true;
        }
        this.f29607d.add(tVar);
        AbstractC3268i.n(this.f29604a == 0);
        this.f29604a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (x4.b.b().a(this.f29609f.f29617a, intent, this, 1)) {
                this.f29609f.f29618b.schedule(new Runnable() { // from class: m4.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f29599g.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f29609f.f29618b.execute(new Runnable() { // from class: m4.j
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = this.f29596g;
                IBinder iBinder2 = iBinder;
                synchronized (qVar) {
                    if (iBinder2 == null) {
                        qVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        qVar.f29606c = new r(iBinder2);
                        qVar.f29604a = 2;
                        qVar.c();
                    } catch (RemoteException e10) {
                        qVar.a(0, e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f29609f.f29618b.execute(new Runnable() { // from class: m4.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f29600g.a(2, "Service disconnected");
            }
        });
    }
}
