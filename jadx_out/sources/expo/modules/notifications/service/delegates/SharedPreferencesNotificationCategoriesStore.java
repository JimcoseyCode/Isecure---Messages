package expo.modules.notifications.service.delegates;

import P8.q;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.notifications.model.NotificationCategory;
import expo.modules.notifications.service.NotificationsService;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lexpo/modules/notifications/service/delegates/SharedPreferencesNotificationCategoriesStore;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getNotificationCategory", "Lexpo/modules/notifications/notifications/model/NotificationCategory;", NotificationsService.IDENTIFIER_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "allNotificationCategories", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getAllNotificationCategories", "()Ljava/util/Collection;", "saveNotificationCategory", NotificationsService.NOTIFICATION_CATEGORY_KEY, "removeNotificationCategory", PointerEventHelper.POINTER_TYPE_UNKNOWN, "preferencesNotificationCategoryKey", "Companion", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SharedPreferencesNotificationCategoriesStore {
    private static final String NOTIFICATION_CATEGORY_KEY_PREFIX = "notification_category-";
    private static final String SHARED_PREFERENCES_NAME = "expo.modules.notifications.SharedPreferencesNotificationCategoriesStore";
    private final SharedPreferences sharedPreferences;

    public SharedPreferencesNotificationCategoriesStore(Context context) {
        AbstractC2855l.g(context, "context");
        this.sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
    }

    private final String preferencesNotificationCategoryKey(String identifier) {
        return NOTIFICATION_CATEGORY_KEY_PREFIX + identifier;
    }

    public final Collection<NotificationCategory> getAllNotificationCategories() {
        NotificationCategory notificationCategory;
        String str;
        Map<String, ?> all = this.sharedPreferences.getAll();
        AbstractC2855l.f(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            AbstractC2855l.f(key, "<get-key>(...)");
            if (q.K(key, NOTIFICATION_CATEGORY_KEY_PREFIX, false, 2, null)) {
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
                            if (!(object instanceof NotificationCategory)) {
                                throw new InvalidClassException("Expected serialized object to be an instance of " + NotificationCategory.class + ". Found: " + object);
                            }
                            AbstractC3376c.a(objectInputStream, null);
                            AbstractC3376c.a(byteArrayInputStream, null);
                            notificationCategory = (NotificationCategory) object;
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
                notificationCategory = null;
            }
            if (notificationCategory != null) {
                arrayList.add(notificationCategory);
            }
        }
        return arrayList;
    }

    public final NotificationCategory getNotificationCategory(String identifier) throws IOException, ClassNotFoundException {
        AbstractC2855l.g(identifier, "identifier");
        String string = this.sharedPreferences.getString(preferencesNotificationCategoryKey(identifier), null);
        if (string == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(string, 2));
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                Object object = objectInputStream.readObject();
                if (object instanceof NotificationCategory) {
                    AbstractC3376c.a(objectInputStream, null);
                    AbstractC3376c.a(byteArrayInputStream, null);
                    return (NotificationCategory) object;
                }
                throw new InvalidClassException("Expected serialized object to be an instance of " + NotificationCategory.class + ". Found: " + object);
            } finally {
            }
        } finally {
        }
    }

    public final boolean removeNotificationCategory(String identifier) {
        AbstractC2855l.g(identifier, "identifier");
        String strPreferencesNotificationCategoryKey = preferencesNotificationCategoryKey(identifier);
        if (this.sharedPreferences.getString(strPreferencesNotificationCategoryKey, null) == null) {
            return false;
        }
        return this.sharedPreferences.edit().remove(strPreferencesNotificationCategoryKey).commit();
    }

    public final NotificationCategory saveNotificationCategory(NotificationCategory notificationCategory) throws IOException {
        AbstractC2855l.g(notificationCategory, "notificationCategory");
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        String identifier = notificationCategory.getIdentifier();
        AbstractC2855l.f(identifier, "getIdentifier(...)");
        if (editorEdit.putString(preferencesNotificationCategoryKey(identifier), Base64SerializationKt.encodedInBase64(notificationCategory)).commit()) {
            return notificationCategory;
        }
        return null;
    }
}
