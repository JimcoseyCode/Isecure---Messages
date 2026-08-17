package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.cloudmessaging.CloudMessage;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessagingService extends AbstractServiceC2241i {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private com.google.android.gms.cloudmessaging.a rpc;

    private boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void f(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (M.t(extras)) {
            M m10 = new M(extras);
            ExecutorService executorServiceE = AbstractC2247o.e();
            try {
                if (new C2238f(this, m10, executorServiceE).a()) {
                    return;
                }
                executorServiceE.shutdown();
                if (K.D(intent)) {
                    K.w(intent);
                }
            } finally {
                executorServiceE.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private String g(Intent intent) {
        String stringExtra = intent.getStringExtra(NotificationsService.GOOGLE_MESSAGE_ID_KEY);
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private com.google.android.gms.cloudmessaging.a h(Context context) {
        if (this.rpc == null) {
            this.rpc = new com.google.android.gms.cloudmessaging.a(context.getApplicationContext());
        }
        return this.rpc;
    }

    private void i(Intent intent) {
        if (!e(intent.getStringExtra(NotificationsService.GOOGLE_MESSAGE_ID_KEY))) {
            j(intent);
        }
        h(this).b(new CloudMessage(intent));
    }

    private void j(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                K.y(intent);
                f(intent);
                break;
            case "send_error":
                onSendError(g(intent), new Y(intent.getStringExtra("error")));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra(NotificationsService.GOOGLE_MESSAGE_ID_KEY));
                break;
        }
    }

    static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC2241i
    protected Intent getStartCommandIntent(Intent intent) {
        return Z.b().c();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC2241i
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            i(intent);
        } else if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra(EXTRA_TOKEN));
        } else {
            intent.getAction();
        }
    }

    void setRpcForTesting(com.google.android.gms.cloudmessaging.a aVar) {
        this.rpc = aVar;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    @Deprecated
    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
    }
}
