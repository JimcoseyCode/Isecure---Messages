package expo.modules.notifications.service;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import expo.modules.notifications.service.delegates.FirebaseMessagingDelegate;
import i7.AbstractC2746i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003R\u001b\u0010\u0013\u001a\u00020\u000e8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lexpo/modules/notifications/service/ExpoFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "Li7/B;", "onMessageReceived", "(Lcom/google/firebase/messaging/RemoteMessage;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "token", "onNewToken", "(Ljava/lang/String;)V", "onDeletedMessages", "Lexpo/modules/notifications/service/interfaces/FirebaseMessagingDelegate;", "firebaseMessagingDelegate$delegate", "Lkotlin/Lazy;", "getFirebaseMessagingDelegate", "()Lexpo/modules/notifications/service/interfaces/FirebaseMessagingDelegate;", "firebaseMessagingDelegate", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ExpoFirebaseMessagingService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: firebaseMessagingDelegate$delegate, reason: from kotlin metadata */
    private final Lazy firebaseMessagingDelegate = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.notifications.service.a
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return ExpoFirebaseMessagingService.firebaseMessagingDelegate_delegate$lambda$0(this.f26698g);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseMessagingDelegate firebaseMessagingDelegate_delegate$lambda$0(ExpoFirebaseMessagingService expoFirebaseMessagingService) {
        return new FirebaseMessagingDelegate(expoFirebaseMessagingService);
    }

    protected expo.modules.notifications.service.interfaces.FirebaseMessagingDelegate getFirebaseMessagingDelegate() {
        return (expo.modules.notifications.service.interfaces.FirebaseMessagingDelegate) this.firebaseMessagingDelegate.getValue();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onDeletedMessages() {
        getFirebaseMessagingDelegate().onDeletedMessages();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        AbstractC2855l.g(remoteMessage, "remoteMessage");
        getFirebaseMessagingDelegate().onMessageReceived(remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) {
        AbstractC2855l.g(token, "token");
        getFirebaseMessagingDelegate().onNewToken(token);
    }
}
