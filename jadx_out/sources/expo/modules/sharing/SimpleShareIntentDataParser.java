package expo.modules.sharing;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Patterns;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.service.NotificationsService;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lexpo/modules/sharing/SimpleShareIntentDataParser;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Companion", "expo-sharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SimpleShareIntentDataParser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0002¨\u0006\u0013"}, d2 = {"Lexpo/modules/sharing/SimpleShareIntentDataParser$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "parse", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/sharing/SharePayload;", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "handleSendAction", NotificationsService.EVENT_TYPE_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "handleSendMultipleAction", "createUriPayload", "uri", "Landroid/net/Uri;", "defaultType", "expo-sharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SharePayload createUriPayload(Context context, Uri uri, String defaultType) {
            String type = context.getContentResolver().getType(uri);
            if (type != null) {
                defaultType = type;
            }
            SharePayload sharePayload = new SharePayload(null, null, null, 7, null);
            String string = uri.toString();
            AbstractC2855l.f(string, "toString(...)");
            sharePayload.setValue(string);
            sharePayload.setShareType(ShareType.INSTANCE.fromMimeType(defaultType));
            sharePayload.setMimeType(defaultType);
            return sharePayload;
        }

        private final List<SharePayload> handleSendAction(Context context, Intent intent, String type) {
            if (!AbstractC2855l.b(type, "text/plain")) {
                Uri uri = (Uri) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class) : intent.getParcelableExtra("android.intent.extra.STREAM"));
                return AbstractC2800q.n(uri != null ? SimpleShareIntentDataParser.INSTANCE.createUriPayload(context, uri, type) : null);
            }
            String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
            if (stringExtra == null) {
                return AbstractC2800q.j();
            }
            boolean zMatches = Patterns.WEB_URL.matcher(stringExtra).matches();
            SharePayload sharePayload = new SharePayload(null, null, null, 7, null);
            sharePayload.setValue(stringExtra);
            sharePayload.setShareType(zMatches ? ShareType.Url : ShareType.Text);
            sharePayload.setMimeType("text/plain");
            return AbstractC2800q.e(sharePayload);
        }

        private final List<SharePayload> handleSendMultipleAction(Context context, Intent intent, String type) {
            ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("android.intent.extra.STREAM", Uri.class) : intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            if (parcelableArrayListExtra == null) {
                return AbstractC2800q.j();
            }
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(parcelableArrayListExtra, 10));
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                arrayList.add(SimpleShareIntentDataParser.INSTANCE.createUriPayload(context, (Uri) it.next(), type));
            }
            return arrayList;
        }

        public final List<SharePayload> parse(Context context, Intent intent) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(intent, "intent");
            String type = intent.getType();
            if (type == null) {
                return AbstractC2800q.j();
            }
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode != -1173264947) {
                    if (iHashCode == -58484670 && action.equals("android.intent.action.SEND_MULTIPLE")) {
                        return handleSendMultipleAction(context, intent, type);
                    }
                } else if (action.equals("android.intent.action.SEND")) {
                    return handleSendAction(context, intent, type);
                }
            }
            return AbstractC2800q.j();
        }

        private Companion() {
        }
    }
}
