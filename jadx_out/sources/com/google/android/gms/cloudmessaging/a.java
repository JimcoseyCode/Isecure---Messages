package com.google.android.gms.cloudmessaging;

import P4.AbstractC1378l;
import P4.AbstractC1381o;
import P4.C1379m;
import P4.InterfaceC1369c;
import P4.InterfaceC1372f;
import P4.InterfaceC1377k;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import expo.modules.notifications.service.NotificationsService;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m0.i;
import m4.C2903f;
import m4.w;
import m4.x;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f20969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static PendingIntent f20970i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Executor f20971j = new Executor() { // from class: m4.y
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f20972k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f20974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f20975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f20976d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Messenger f20978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private zzd f20979g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f20973a = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Messenger f20977e = new Messenger(new c(this, Looper.getMainLooper()));

    public a(Context context) {
        this.f20974b = context;
        this.f20975c = new x(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f20976d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ AbstractC1378l e(Bundle bundle) {
        return m(bundle) ? AbstractC1381o.f(null) : AbstractC1381o.f(bundle);
    }

    static /* bridge */ /* synthetic */ void g(a aVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C2903f());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        aVar.f20979g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        aVar.f20978f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f20972k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        aVar.l(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras()));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (aVar.f20973a) {
                        for (int i10 = 0; i10 < aVar.f20973a.size(); i10++) {
                            try {
                                aVar.l((String) aVar.f20973a.f(i10), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    "Unexpected structured response ".concat(stringExtra2);
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                aVar.l(str, intent2.putExtra("error", strSubstring).getExtras());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AbstractC1378l i(Bundle bundle) {
        final String strJ = j();
        final C1379m c1379m = new C1379m();
        synchronized (this.f20973a) {
            this.f20973a.put(strJ, c1379m);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f20975c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.f20974b, intent);
        intent.putExtra("kid", "|ID|" + strJ + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.f20977e);
        if (this.f20978f != null || this.f20979g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f20978f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f20979g.b(messageObtain);
                }
            } catch (RemoteException unused) {
                if (this.f20975c.b() != 2) {
                }
            }
        } else if (this.f20975c.b() != 2) {
            this.f20974b.sendBroadcast(intent);
        } else {
            this.f20974b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f20976d.schedule(new Runnable() { // from class: m4.e
            @Override // java.lang.Runnable
            public final void run() {
                c1379m.d(new IOException("TIMEOUT"));
            }
        }, 30L, TimeUnit.SECONDS);
        c1379m.a().d(f20971j, new InterfaceC1372f() { // from class: com.google.android.gms.cloudmessaging.b
            @Override // P4.InterfaceC1372f
            public final void onComplete(AbstractC1378l abstractC1378l) {
                this.f20980a.h(strJ, scheduledFutureSchedule, abstractC1378l);
            }
        });
        return c1379m.a();
    }

    private static synchronized String j() {
        int i10;
        i10 = f20969h;
        f20969h = i10 + 1;
        return Integer.toString(i10);
    }

    private static synchronized void k(Context context, Intent intent) {
        try {
            if (f20970i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f20970i = PendingIntent.getBroadcast(context, 0, intent2, E4.a.f1083a);
            }
            intent.putExtra("app", f20970i);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void l(String str, Bundle bundle) {
        synchronized (this.f20973a) {
            try {
                C1379m c1379m = (C1379m) this.f20973a.remove(str);
                if (c1379m == null) {
                    return;
                }
                c1379m.c(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public AbstractC1378l a() {
        return this.f20975c.a() >= 241100000 ? w.b(this.f20974b).d(5, Bundle.EMPTY).i(f20971j, new InterfaceC1369c() { // from class: m4.d
            @Override // P4.InterfaceC1369c
            public final Object a(AbstractC1378l abstractC1378l) {
                Intent intent = (Intent) ((Bundle) abstractC1378l.l()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
            }
        }) : AbstractC1381o.e(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public AbstractC1378l b(CloudMessage cloudMessage) {
        if (this.f20975c.a() < 233700000) {
            return AbstractC1381o.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString(NotificationsService.GOOGLE_MESSAGE_ID_KEY, cloudMessage.s());
        Integer numX = cloudMessage.X();
        if (numX != null) {
            bundle.putInt("google.product_id", numX.intValue());
        }
        return w.b(this.f20974b).c(3, bundle);
    }

    public AbstractC1378l c(final Bundle bundle) {
        return this.f20975c.a() < 12000000 ? this.f20975c.b() != 0 ? i(bundle).j(f20971j, new InterfaceC1369c() { // from class: com.google.android.gms.cloudmessaging.g
            @Override // P4.InterfaceC1369c
            public final Object a(AbstractC1378l abstractC1378l) {
                return this.f20988a.f(bundle, abstractC1378l);
            }
        }) : AbstractC1381o.e(new IOException("MISSING_INSTANCEID_SERVICE")) : w.b(this.f20974b).d(1, bundle).i(f20971j, new InterfaceC1369c() { // from class: m4.c
            @Override // P4.InterfaceC1369c
            public final Object a(AbstractC1378l abstractC1378l) throws IOException {
                if (abstractC1378l.p()) {
                    return (Bundle) abstractC1378l.l();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Error making request: ".concat(String.valueOf(abstractC1378l.k()));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", abstractC1378l.k());
            }
        });
    }

    public AbstractC1378l d(boolean z10) {
        if (this.f20975c.a() < 241100000) {
            return AbstractC1381o.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z10);
        return w.b(this.f20974b).c(4, bundle);
    }

    final /* synthetic */ AbstractC1378l f(Bundle bundle, AbstractC1378l abstractC1378l) {
        return (abstractC1378l.p() && m((Bundle) abstractC1378l.l())) ? i(bundle).r(f20971j, new InterfaceC1377k() { // from class: com.google.android.gms.cloudmessaging.f
            @Override // P4.InterfaceC1377k
            public final AbstractC1378l a(Object obj) {
                return a.e((Bundle) obj);
            }
        }) : abstractC1378l;
    }

    final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, AbstractC1378l abstractC1378l) {
        synchronized (this.f20973a) {
            this.f20973a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
