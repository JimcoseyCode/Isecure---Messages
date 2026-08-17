package expo.modules.application;

import android.os.RemoteException;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.Promise;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.z;
import p1.AbstractC3046a;
import p1.InterfaceC3048c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"expo/modules/application/ApplicationModule$definition$1$8$1", "Lp1/c;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "responseCode", "Li7/B;", "onInstallReferrerSetupFinished", "(I)V", "onInstallReferrerServiceDisconnected", "()V", "expo-application_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApplicationModule$definition$1$8$1 implements InterfaceC3048c {
    final /* synthetic */ StringBuilder $installReferrer;
    final /* synthetic */ z $isSettled;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ AbstractC3046a $referrerClient;

    ApplicationModule$definition$1$8$1(z zVar, AbstractC3046a abstractC3046a, StringBuilder sb, Promise promise) {
        this.$isSettled = zVar;
        this.$referrerClient = abstractC3046a;
        this.$installReferrer = sb;
        this.$promise = promise;
    }

    @Override // p1.InterfaceC3048c
    public void onInstallReferrerServiceDisconnected() {
        z zVar = this.$isSettled;
        if (zVar.f29399g) {
            return;
        }
        zVar.f29399g = true;
        this.$promise.reject("ERR_APPLICATION_INSTALL_REFERRER_SERVICE_DISCONNECTED", "Connection to install referrer service was lost.", null);
    }

    @Override // p1.InterfaceC3048c
    public void onInstallReferrerSetupFinished(int responseCode) {
        z zVar = this.$isSettled;
        if (zVar.f29399g) {
            return;
        }
        try {
            if (responseCode == 0) {
                try {
                    this.$installReferrer.append(this.$referrerClient.b().a());
                    this.$isSettled.f29399g = true;
                    Promise promise = this.$promise;
                    String string = this.$installReferrer.toString();
                    AbstractC2855l.f(string, "toString(...)");
                    promise.resolve(string);
                } catch (RemoteException e10) {
                    this.$promise.reject("ERR_APPLICATION_INSTALL_REFERRER_REMOTE_EXCEPTION", "RemoteException getting install referrer information. This may happen if the process hosting the remote object is no longer available.", e10);
                    this.$isSettled.f29399g = true;
                    return;
                }
            } else if (responseCode == 1) {
                zVar.f29399g = true;
                this.$promise.reject("ERR_APPLICATION_INSTALL_REFERRER", "General error retrieving the install referrer: response code " + responseCode, null);
            } else if (responseCode != 2) {
                zVar.f29399g = true;
                this.$promise.reject("ERR_APPLICATION_INSTALL_REFERRER", "General error retrieving the install referrer: response code " + responseCode, null);
            } else {
                zVar.f29399g = true;
                this.$promise.reject("ERR_APPLICATION_INSTALL_REFERRER_UNAVAILABLE", "The current Play Store app doesn't provide the installation referrer API, or the Play Store may not be installed.", null);
            }
            this.$referrerClient.a();
        } catch (Throwable th) {
            this.$isSettled.f29399g = true;
            throw th;
        }
    }
}
