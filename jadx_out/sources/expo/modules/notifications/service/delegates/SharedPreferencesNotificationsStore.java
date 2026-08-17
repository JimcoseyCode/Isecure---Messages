package expo.modules.notifications.service.delegates;

import P8.q;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.notifications.model.NotificationRequest;
import expo.modules.notifications.service.NotificationsService;
import j7.AbstractC2800q;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u000b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0016J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00178F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019¨\u0006 "}, d2 = {"Lexpo/modules/notifications/service/delegates/SharedPreferencesNotificationsStore;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/SharedPreferences$Editor;", "editor", PointerEventHelper.POINTER_TYPE_UNKNOWN, NotificationsService.IDENTIFIER_KEY, "kotlin.jvm.PlatformType", "removeNotificationRequest", "(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", "preferencesNotificationRequestKey", "(Ljava/lang/String;)Ljava/lang/String;", "Lexpo/modules/notifications/notifications/model/NotificationRequest;", "getNotificationRequest", "(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationRequest;", NotificationsService.NOTIFICATION_REQUEST_KEY, "Li7/B;", "saveNotificationRequest", "(Lexpo/modules/notifications/notifications/model/NotificationRequest;)V", "(Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "removeAllNotificationRequests", "()Ljava/util/Collection;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getAllNotificationRequests", "allNotificationRequests", "Companion", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SharedPreferencesNotificationsStore {
    private static final String NOTIFICATION_REQUEST_KEY_PREFIX = "notification_request-";
    private static final String SHARED_PREFERENCES_NAME = "expo.modules.notifications.SharedPreferencesNotificationsStore";
    private final SharedPreferences sharedPreferences;

    public SharedPreferencesNotificationsStore(Context context) {
        AbstractC2855l.g(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
        AbstractC2855l.f(sharedPreferences, "getSharedPreferences(...)");
        this.sharedPreferences = sharedPreferences;
    }

    private final String preferencesNotificationRequestKey(String identifier) {
        return NOTIFICATION_REQUEST_KEY_PREFIX + identifier;
    }

    public final Collection<NotificationRequest> getAllNotificationRequests() {
        NotificationRequest notificationRequest;
        String str;
        Map<String, ?> all = this.sharedPreferences.getAll();
        AbstractC2855l.f(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            AbstractC2855l.f(key, "<get-key>(...)");
            if (q.K(key, NOTIFICATION_REQUEST_KEY_PREFIX, false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            try {
                str = (String) ((Map.Entry) it.next()).getValue();
            } catch (IOException | ClassNotFoundException unused) {
            }
            if (str != null) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 2));
                try {
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                        try {
                            Object object = objectInputStream.readObject();
                            if (!(object instanceof NotificationRequest)) {
                                throw new InvalidClassException("Expected serialized object to be an instance of " + NotificationRequest.class + ". Found: " + object);
                            }
                            AbstractC3376c.a(objectInputStream, null);
                            AbstractC3376c.a(byteArrayInputStream, null);
                            notificationRequest = (NotificationRequest) object;
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3376c.a(byteArrayInputStream, th);
                    throw th2;
                }
            } else {
                notificationRequest = null;
            }
            if (notificationRequest != null) {
                arrayList.add(notificationRequest);
            }
        }
        return arrayList;
    }

    public final NotificationRequest getNotificationRequest(String identifier) throws IOException, ClassNotFoundException {
        AbstractC2855l.g(identifier, "identifier");
        String string = this.sharedPreferences.getString(preferencesNotificationRequestKey(identifier), null);
        if (string == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(string, 2));
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                Object object = objectInputStream.readObject();
                if (object instanceof NotificationRequest) {
                    AbstractC3376c.a(objectInputStream, null);
                    AbstractC3376c.a(byteArrayInputStream, null);
                    return (NotificationRequest) object;
                }
                throw new InvalidClassException("Expected serialized object to be an instance of " + NotificationRequest.class + ". Found: " + object);
            } finally {
            }
        } finally {
        }
    }

    public final Collection<String> removeAllNotificationRequests() {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        Collection<NotificationRequest> allNotificationRequests = getAllNotificationRequests();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(allNotificationRequests, 10));
        for (NotificationRequest notificationRequest : allNotificationRequests) {
            AbstractC2855l.d(editorEdit);
            String identifier = notificationRequest.getIdentifier();
            AbstractC2855l.f(identifier, "getIdentifier(...)");
            removeNotificationRequest(editorEdit, identifier);
            arrayList.add(notificationRequest.getIdentifier());
        }
        editorEdit.apply();
        return arrayList;
    }

    public final void removeNotificationRequest(String identifier) {
        AbstractC2855l.g(identifier, "identifier");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        AbstractC2855l.f(editorEdit, "edit(...)");
        removeNotificationRequest(editorEdit, identifier).apply();
    }

    public final void saveNotificationRequest(NotificationRequest notificationRequest) throws IOException {
        AbstractC2855l.g(notificationRequest, "notificationRequest");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        String identifier = notificationRequest.getIdentifier();
        AbstractC2855l.f(identifier, "getIdentifier(...)");
        editorEdit.putString(preferencesNotificationRequestKey(identifier), Base64SerializationKt.encodedInBase64(notificationRequest)).apply();
    }

    private final SharedPreferences.Editor removeNotificationRequest(SharedPreferences.Editor editor, String identifier) {
        return editor.remove(preferencesNotificationRequestKey(identifier));
    }
}
