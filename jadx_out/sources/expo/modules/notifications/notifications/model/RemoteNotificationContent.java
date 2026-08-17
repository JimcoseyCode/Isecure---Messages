package expo.modules.notifications.notifications.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.firebase.messaging.RemoteMessage;
import expo.modules.notifications.notifications.enums.NotificationPriority;
import expo.modules.notifications.notifications.interfaces.INotificationContent;
import expo.modules.notifications.notifications.presentation.builders.DownloadImageKt;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n7.f;
import o7.AbstractC3016b;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0005\u0018\u0000 H2\u00020\u0001:\u0001HB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010$\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0010R\u001c\u0010'\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!R\u001c\u0010*\u001a\u0004\u0018\u00010)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010/\u001a\u0004\u0018\u00010.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b3\u0010\u0010R\u0017\u00104\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b4\u0010\u0010R\u001c\u00105\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010\u001f\u001a\u0004\b6\u0010!R\u001a\u00107\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b7\u0010\u0010R\u001c\u00108\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010\u001f\u001a\u0004\b9\u0010!R\u001c\u0010:\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0010R\u0014\u0010C\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0016\u0010G\u001a\u0004\u0018\u00010D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;", "Lexpo/modules/notifications/notifications/interfaces/INotificationContent;", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "<init>", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap;", "getImage", "(Landroid/content/Context;Ln7/f;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "containsImage", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "describeContents", "()I", "dest", "flags", "Li7/B;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/google/firebase/messaging/RemoteMessage;", "Lexpo/modules/notifications/notifications/model/NotificationData;", "notificationData", "Ljava/util/Map;", PointerEventHelper.POINTER_TYPE_UNKNOWN, AlertFragment.ARG_TITLE, "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", ReactTextInputShadowNode.PROP_TEXT, "getText", "shouldPlayDefaultSound", "Z", "getShouldPlayDefaultSound", "soundName", "getSoundName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "vibrationPattern", "[J", "getVibrationPattern", "()[J", "Lorg/json/JSONObject;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "Lorg/json/JSONObject;", "getBody", "()Lorg/json/JSONObject;", "isAutoDismiss", "isDataOnly", "categoryId", "getCategoryId", "isSticky", "subText", "getSubText", "badgeCount", "Ljava/lang/Integer;", "getBadgeCount", "()Ljava/lang/Integer;", "getShouldUseDefaultVibrationPattern", "shouldUseDefaultVibrationPattern", "Lexpo/modules/notifications/notifications/enums/NotificationPriority;", "getPriority", "()Lexpo/modules/notifications/notifications/enums/NotificationPriority;", "priority", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getColor", "()Ljava/lang/Number;", ViewProps.COLOR, "CREATOR", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteNotificationContent implements INotificationContent {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer badgeCount;
    private final JSONObject body;
    private final String categoryId;
    private final boolean isAutoDismiss;
    private final boolean isDataOnly;
    private final boolean isSticky;
    private final Map<String, ? extends String> notificationData;
    private final RemoteMessage remoteMessage;
    private final boolean shouldPlayDefaultSound;
    private final String soundName;
    private final String subText;
    private final String text;
    private final String title;
    private final long[] vibrationPattern;

    /* JADX INFO: renamed from: expo.modules.notifications.notifications.model.RemoteNotificationContent$CREATOR, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lexpo/modules/notifications/notifications/model/RemoteNotificationContent$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", PointerEventHelper.POINTER_TYPE_UNKNOWN, "size", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(I)[Lexpo/modules/notifications/notifications/model/RemoteNotificationContent;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<RemoteNotificationContent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteNotificationContent createFromParcel(Parcel parcel) {
            AbstractC2855l.g(parcel, "parcel");
            return new RemoteNotificationContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteNotificationContent[] newArray(int size) {
            return new RemoteNotificationContent[size];
        }
    }

    public RemoteNotificationContent(RemoteMessage remoteMessage) {
        long[] jArrZ;
        String strS;
        String strA;
        String strW;
        AbstractC2855l.g(remoteMessage, "remoteMessage");
        this.remoteMessage = remoteMessage;
        Map mapS = remoteMessage.s();
        AbstractC2855l.f(mapS, "getData(...)");
        Map<String, ? extends String> mapM326constructorimpl = NotificationData.m326constructorimpl(mapS);
        this.notificationData = mapM326constructorimpl;
        RemoteMessage.b bVarU0 = remoteMessage.u0();
        this.title = (bVarU0 == null || (strW = bVarU0.w()) == null) ? NotificationData.m339getTitleimpl(mapM326constructorimpl) : strW;
        RemoteMessage.b bVarU02 = remoteMessage.u0();
        this.text = (bVarU02 == null || (strA = bVarU02.a()) == null) ? NotificationData.m334getMessageimpl(mapM326constructorimpl) : strA;
        RemoteMessage.b bVarU03 = remoteMessage.u0();
        this.shouldPlayDefaultSound = (bVarU03 != null ? bVarU03.s() : null) == null && NotificationData.m335getShouldPlayDefaultSoundimpl(mapM326constructorimpl);
        RemoteMessage.b bVarU04 = remoteMessage.u0();
        this.soundName = (bVarU04 == null || (strS = bVarU04.s()) == null) ? NotificationData.m337getSoundimpl(mapM326constructorimpl) : strS;
        RemoteMessage.b bVarU05 = remoteMessage.u0();
        this.vibrationPattern = (bVarU05 == null || (jArrZ = bVarU05.z()) == null) ? NotificationData.m340getVibrationPatternimpl(mapM326constructorimpl) : jArrZ;
        this.body = NotificationData.m331getBodyimpl(mapM326constructorimpl);
        this.isAutoDismiss = NotificationData.m329getAutoDismissimpl(mapM326constructorimpl);
        this.isDataOnly = remoteMessage.u0() == null;
        this.categoryId = NotificationData.m332getCategoryIdimpl(mapM326constructorimpl);
        this.isSticky = NotificationData.m342isStickyimpl(mapM326constructorimpl);
        this.subText = NotificationData.m338getSubTextimpl(mapM326constructorimpl);
        this.badgeCount = NotificationData.m330getBadgeimpl(mapM326constructorimpl);
    }

    @Override // expo.modules.notifications.notifications.interfaces.INotificationContent
    public boolean containsImage() {
        RemoteMessage.b bVarU0 = this.remoteMessage.u0();
        return (bVarU0 != null ? bVarU0.l() : null) != null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // expo.modules.notifications.notifications.interfaces.INotificationContent
    public JSONObject getBody() {
        return this.body;
    }

    @Override // expo.modules.notifications.notifications.interfaces.INotificationContent
    public String getCategoryId() {
        return this.categoryId;
    }

    @Override // expo.modules.notifications.notifications.interfaces.INotificationContent
    public Number getColor() {
        String strM333getColorimpl;
        RemoteMessage.b bVarU0 = this.remoteMessage.u0();
        if (bVarU0 == null || (strM333getColorimpl = bVarU0.f()) == null) {
            strM333getColorimpl = NotificationData.m333getColorimpl(this.notificationData);
        }
        if (strM333getColorimpl != null) {
            return Integer.valueOf(Color.parseColor(strM333getColorimpl));
        }
        return null;
    }

    @Override // expo.modules.notifications.notifications.interfaces.INotificationContent
    public Object getImage(Context context, f fVar) {
        RemoteMessage.b bVarU0 = this.remoteMessage.u0();
        Uri uriL = bVarU0 != null ? bVarU0.l() : null;
        if (uriL == null) {
            return null;
        }
        Object objDownloadImage$default = DownloadImageKt.downloadImage$default(uriL, 0L, 0L, fVar, 6, null);
        return objDownloadImage$default == AbstractC3016b.e() ? objDownloadImage$default : (Bitmap) objDownloadImage$default;
    }

    @Override // expo.modules.notifications.notifications.interfaces.INotificationContent
    public NotificationPriority getPriority() {
        return this.remoteMessage.D0() == 1 ? NotificationPriority.HIGH : NotificationPriority.DEFAULT;
    }

    @Override // expo.modules.notifications.notifications.interfaces.INotificationContent
    public boolean getShouldPlayDefaultSound() {
        return this.shouldPlayDefaultSound;
    }

    @Override // expo.modules.notifications.notifications.interfaces.INotificationContent
    public boolean getShouldUseDefaultVibrationPattern() {
        RemoteMessage.b bVarU0 = this.remoteMessage.u0();
        return bVarU0 != null ? bVarU0.i() : NotificationData.m336getShouldUseDefaultVibrationPatternimpl(this.notificationData);
    }

    @Override // expo.modules.notifications.notifications.interfaces.INotificationContent
    public String getSoundName() {
        return this.soundName;
    }

    @Override // expo.modules.notifications.notifications.interfaces.INotificationContent
    public String getSubText() {
        return this.subText;
    }

    @Override // expo.modules.notifications.notifications.interfaces.INotificationContent
    public String getText() {
        return this.text;
    }

    @Override // expo.modules.notifications.notifications.interfaces.INotificationContent
    public String getTitle() {
        return this.title;
    }

    @Override // expo.modules.notifications.notifications.interfaces.INotificationContent
    public long[] getVibrationPattern() {
        return this.vibrationPattern;
    }

    @Override // expo.modules.notifications.notifications.interfaces.INotificationContent
    /* JADX INFO: renamed from: isAutoDismiss, reason: from getter */
    public boolean getIsAutoDismiss() {
        return this.isAutoDismiss;
    }

    /* JADX INFO: renamed from: isDataOnly, reason: from getter */
    public final boolean getIsDataOnly() {
        return this.isDataOnly;
    }

    @Override // expo.modules.notifications.notifications.interfaces.INotificationContent
    /* JADX INFO: renamed from: isSticky, reason: from getter */
    public boolean getIsSticky() {
        return this.isSticky;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        AbstractC2855l.g(dest, "dest");
        dest.writeParcelable(this.remoteMessage, flags);
    }

    @Override // expo.modules.notifications.notifications.interfaces.INotificationContent
    public Integer getBadgeCount() {
        return this.badgeCount;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteNotificationContent(Parcel parcel) {
        AbstractC2855l.g(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(RemoteMessage.class.getClassLoader());
        AbstractC2855l.d(parcelable);
        this((RemoteMessage) parcelable);
    }
}
