package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.InterfaceC1795a;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f16391d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static f f16394g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f16396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f16390c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Set f16392e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f16393f = new Object();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {
        static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        static void c(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        static void d(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        static String e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static NotificationChannel f(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        static List g(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        static List h(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c {
        static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f16397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f16398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f16399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Notification f16400d;

        d(String str, int i10, String str2, Notification notification) {
            this.f16397a = str;
            this.f16398b = i10;
            this.f16399c = str2;
            this.f16400d = notification;
        }

        @Override // androidx.core.app.p.g
        public void a(InterfaceC1795a interfaceC1795a) {
            interfaceC1795a.v(this.f16397a, this.f16398b, this.f16399c, this.f16400d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f16397a + ", id:" + this.f16398b + ", tag:" + this.f16399c + "]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ComponentName f16401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final IBinder f16402b;

        e(ComponentName componentName, IBinder iBinder) {
            this.f16401a = componentName;
            this.f16402b = iBinder;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class f implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f16403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HandlerThread f16404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f16405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f16406d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Set f16407e = new HashSet();

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ComponentName f16408a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            InterfaceC1795a f16410c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f16409b = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            ArrayDeque f16411d = new ArrayDeque();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f16412e = 0;

            a(ComponentName componentName) {
                this.f16408a = componentName;
            }
        }

        f(Context context) {
            this.f16403a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f16404b = handlerThread;
            handlerThread.start();
            this.f16405c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f16409b) {
                return true;
            }
            boolean zBindService = this.f16403a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f16408a), this, 33);
            aVar.f16409b = zBindService;
            if (zBindService) {
                aVar.f16412e = 0;
            } else {
                Objects.toString(aVar.f16408a);
                this.f16403a.unbindService(this);
            }
            return aVar.f16409b;
        }

        private void b(a aVar) {
            if (aVar.f16409b) {
                this.f16403a.unbindService(this);
                aVar.f16409b = false;
            }
            aVar.f16410c = null;
        }

        private void c(g gVar) {
            j();
            for (a aVar : this.f16406d.values()) {
                aVar.f16411d.add(gVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = (a) this.f16406d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f16406d.get(componentName);
            if (aVar != null) {
                aVar.f16410c = InterfaceC1795a.AbstractBinderC0196a.c(iBinder);
                aVar.f16412e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = (a) this.f16406d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(aVar.f16408a);
                aVar.f16411d.size();
            }
            if (aVar.f16411d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f16410c == null) {
                i(aVar);
                return;
            }
            while (true) {
                g gVar = (g) aVar.f16411d.peek();
                if (gVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        gVar.toString();
                    }
                    gVar.a(aVar.f16410c);
                    aVar.f16411d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(aVar.f16408a);
                    }
                } catch (RemoteException unused2) {
                    Objects.toString(aVar.f16408a);
                }
            }
            if (aVar.f16411d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f16405c.hasMessages(3, aVar.f16408a)) {
                return;
            }
            int i10 = aVar.f16412e;
            int i11 = i10 + 1;
            aVar.f16412e = i11;
            if (i11 > 6) {
                aVar.f16411d.size();
                Objects.toString(aVar.f16408a);
                aVar.f16411d.clear();
            } else {
                this.f16405c.sendMessageDelayed(this.f16405c.obtainMessage(3, aVar.f16408a), (1 << i10) * ProgressBarContainerView.MAX_PROGRESS);
            }
        }

        private void j() {
            Set setI = p.i(this.f16403a);
            if (setI.equals(this.f16407e)) {
                return;
            }
            this.f16407e = setI;
            List<ResolveInfo> listQueryIntentServices = this.f16403a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setI.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        componentName.toString();
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f16406d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName2);
                    }
                    this.f16406d.put(componentName2, new a(componentName2));
                }
            }
            Iterator it = this.f16406d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(entry.getKey());
                    }
                    b((a) entry.getValue());
                    it.remove();
                }
            }
        }

        public void h(g gVar) {
            this.f16405c.obtainMessage(0, gVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((g) message.obj);
                return true;
            }
            if (i10 == 1) {
                e eVar = (e) message.obj;
                e(eVar.f16401a, eVar.f16402b);
                return true;
            }
            if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f16405c.obtainMessage(1, new e(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f16405c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface g {
        void a(InterfaceC1795a interfaceC1795a);
    }

    private p(Context context) {
        this.f16395a = context;
        this.f16396b = (NotificationManager) context.getSystemService(NotificationsService.NOTIFICATION_KEY);
    }

    public static p h(Context context) {
        return new p(context);
    }

    public static Set i(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f16390c) {
            if (string != null) {
                try {
                    if (!string.equals(f16391d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f16392e = hashSet;
                        f16391d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f16392e;
        }
        return set;
    }

    private void p(g gVar) {
        synchronized (f16393f) {
            try {
                if (f16394g == null) {
                    f16394g = new f(this.f16395a.getApplicationContext());
                }
                f16394g.h(gVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean q(Notification notification) {
        Bundle bundleD = l.d(notification);
        return bundleD != null && bundleD.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        return a.a(this.f16396b);
    }

    public void b(String str, int i10) {
        this.f16396b.cancel(str, i10);
    }

    public void c() {
        this.f16396b.cancelAll();
    }

    public void d(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(this.f16396b, notificationChannel);
        }
    }

    public void e(NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.b(this.f16396b, notificationChannelGroup);
        }
    }

    public void f(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.c(this.f16396b, str);
        }
    }

    public void g(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.d(this.f16396b, str);
        }
    }

    public int j() {
        return a.b(this.f16396b);
    }

    public NotificationChannel k(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return b.f(this.f16396b, str);
        }
        return null;
    }

    public NotificationChannelGroup l(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return c.a(this.f16396b, str);
        }
        if (i10 >= 26) {
            Iterator it = m().iterator();
            while (it.hasNext()) {
                NotificationChannelGroup notificationChannelGroupA = o.a(it.next());
                if (b.e(notificationChannelGroupA).equals(str)) {
                    return notificationChannelGroupA;
                }
            }
        }
        return null;
    }

    public List m() {
        return Build.VERSION.SDK_INT >= 26 ? b.g(this.f16396b) : Collections.EMPTY_LIST;
    }

    public List n() {
        return Build.VERSION.SDK_INT >= 26 ? b.h(this.f16396b) : Collections.EMPTY_LIST;
    }

    public void o(String str, int i10, Notification notification) {
        if (!q(notification)) {
            this.f16396b.notify(str, i10, notification);
        } else {
            p(new d(this.f16395a.getPackageName(), i10, str, notification));
            this.f16396b.cancel(str, i10);
        }
    }
}
