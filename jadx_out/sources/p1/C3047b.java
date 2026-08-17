package p1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i4.InterfaceC2727a;
import java.util.List;
import q1.AbstractC3110a;

/* JADX INFO: renamed from: p1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3047b extends AbstractC3046a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30607a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f30608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC2727a f30609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ServiceConnection f30610d;

    /* JADX INFO: renamed from: p1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class ServiceConnectionC0343b implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3048c f30611a;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AbstractC3110a.a("InstallReferrerClient", "Install Referrer service connected.");
            C3047b.this.f30609c = InterfaceC2727a.AbstractBinderC0290a.c(iBinder);
            C3047b.this.f30607a = 2;
            this.f30611a.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            AbstractC3110a.b("InstallReferrerClient", "Install Referrer service disconnected.");
            C3047b.this.f30609c = null;
            C3047b.this.f30607a = 0;
            this.f30611a.onInstallReferrerServiceDisconnected();
        }

        private ServiceConnectionC0343b(InterfaceC3048c interfaceC3048c) {
            if (interfaceC3048c == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f30611a = interfaceC3048c;
        }
    }

    public C3047b(Context context) {
        this.f30608b = context.getApplicationContext();
    }

    private boolean g() {
        return this.f30608b.getPackageManager().getPackageInfo("com.android.vending", IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).versionCode >= 80837300;
    }

    @Override // p1.AbstractC3046a
    public void a() {
        this.f30607a = 3;
        if (this.f30610d != null) {
            AbstractC3110a.a("InstallReferrerClient", "Unbinding from service.");
            this.f30608b.unbindService(this.f30610d);
            this.f30610d = null;
        }
        this.f30609c = null;
    }

    @Override // p1.AbstractC3046a
    public d b() throws RemoteException {
        if (!h()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f30608b.getPackageName());
        try {
            return new d(this.f30609c.k(bundle));
        } catch (RemoteException e10) {
            AbstractC3110a.b("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f30607a = 0;
            throw e10;
        }
    }

    @Override // p1.AbstractC3046a
    public void d(InterfaceC3048c interfaceC3048c) {
        ServiceInfo serviceInfo;
        if (h()) {
            AbstractC3110a.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            interfaceC3048c.onInstallReferrerSetupFinished(0);
            return;
        }
        int i10 = this.f30607a;
        if (i10 == 1) {
            AbstractC3110a.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            interfaceC3048c.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i10 == 3) {
            AbstractC3110a.b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            interfaceC3048c.onInstallReferrerSetupFinished(3);
            return;
        }
        AbstractC3110a.a("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = this.f30608b.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f30607a = 0;
            AbstractC3110a.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
            interfaceC3048c.onInstallReferrerSetupFinished(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!"com.android.vending".equals(str) || str2 == null || !g()) {
            AbstractC3110a.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.f30607a = 0;
            interfaceC3048c.onInstallReferrerSetupFinished(2);
            return;
        }
        Intent intent2 = new Intent(intent);
        ServiceConnectionC0343b serviceConnectionC0343b = new ServiceConnectionC0343b(interfaceC3048c);
        this.f30610d = serviceConnectionC0343b;
        try {
            if (this.f30608b.bindService(intent2, serviceConnectionC0343b, 1)) {
                AbstractC3110a.a("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            AbstractC3110a.b("InstallReferrerClient", "Connection to service is blocked.");
            this.f30607a = 0;
            interfaceC3048c.onInstallReferrerSetupFinished(1);
        } catch (SecurityException unused) {
            AbstractC3110a.b("InstallReferrerClient", "No permission to connect to service.");
            this.f30607a = 0;
            interfaceC3048c.onInstallReferrerSetupFinished(4);
        }
    }

    public boolean h() {
        return (this.f30607a != 2 || this.f30609c == null || this.f30610d == null) ? false : true;
    }
}
