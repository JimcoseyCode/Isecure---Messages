package expo.modules.notifications.notifications.interfaces;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import expo.modules.notifications.notifications.enums.NotificationPriority;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import kotlin.Metadata;
import n7.f;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0004\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0014\u0010\u001b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0014\u0010*\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0004R\u0016\u0010,\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\fR\u0014\u0010-\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0004¨\u0006."}, d2 = {"Lexpo/modules/notifications/notifications/interfaces/INotificationContent;", "Landroid/os/Parcelable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "containsImage", "()Z", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap;", "getImage", "(Landroid/content/Context;Ln7/f;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getTitle", "()Ljava/lang/String;", AlertFragment.ARG_TITLE, "getText", ReactTextInputShadowNode.PROP_TEXT, "getSubText", "subText", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getBadgeCount", "()Ljava/lang/Number;", "badgeCount", "getShouldPlayDefaultSound", "shouldPlayDefaultSound", "getSoundName", "soundName", "getShouldUseDefaultVibrationPattern", "shouldUseDefaultVibrationPattern", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getVibrationPattern", "()[J", "vibrationPattern", "Lorg/json/JSONObject;", "getBody", "()Lorg/json/JSONObject;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "Lexpo/modules/notifications/notifications/enums/NotificationPriority;", "getPriority", "()Lexpo/modules/notifications/notifications/enums/NotificationPriority;", "priority", "getColor", ViewProps.COLOR, "isAutoDismiss", "getCategoryId", "categoryId", "isSticky", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface INotificationContent extends Parcelable {
    boolean containsImage();

    Number getBadgeCount();

    JSONObject getBody();

    String getCategoryId();

    Number getColor();

    Object getImage(Context context, f fVar);

    NotificationPriority getPriority();

    boolean getShouldPlayDefaultSound();

    boolean getShouldUseDefaultVibrationPattern();

    String getSoundName();

    String getSubText();

    String getText();

    String getTitle();

    long[] getVibrationPattern();

    boolean isAutoDismiss();

    boolean isSticky();
}
