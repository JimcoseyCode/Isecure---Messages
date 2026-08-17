package expo.modules.sharing;

import P8.q;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactDelegate;
import com.facebook.react.ReactHost;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.net.URL;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a*\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0014\u0018\u0001*\u00020\u0013*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a<\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0019\"\n\b\u0000\u0010\u0014\u0018\u0001*\u00020\u0013*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\"\u0018\u0010\u001f\u001a\u00020\u0002*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getShareScheme", "(Landroid/content/Context;)Ljava/lang/String;", "Landroid/net/Uri;", "getShareIntentUri", "(Landroid/content/Context;)Landroid/net/Uri;", "Lcom/facebook/react/ReactActivity;", "reactActivity", "Landroid/content/Intent;", "originalIntent", "Li7/B;", "emitShareIntentReceived", "(Lcom/facebook/react/ReactActivity;Landroid/content/Intent;)V", "intent", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isShareIntent", "(Landroid/content/Intent;)Z", "Landroid/os/Parcelable;", "T", "name", "getParcelableExtraCompat", "(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/Parcelable;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getParcelableArrayListExtraCompat", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/util/ArrayList;", "Ljava/net/URL;", "getLastPathComponent", "(Ljava/net/URL;)Ljava/lang/String;", "lastPathComponent", "expo-sharing_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ShareIntoUtilsKt {
    public static final void emitShareIntentReceived(ReactActivity reactActivity, Intent originalIntent) {
        ReactHost reactHost;
        AbstractC2855l.g(reactActivity, "reactActivity");
        AbstractC2855l.g(originalIntent, "originalIntent");
        SharingSingleton.INSTANCE.setIntent(originalIntent);
        ReactDelegate reactDelegate = reactActivity.getReactDelegate();
        ReactContext currentReactContext = (reactDelegate == null || (reactHost = reactDelegate.getReactHost()) == null) ? null : reactHost.getCurrentReactContext();
        DeviceEventManagerModule deviceEventManagerModule = currentReactContext != null ? (DeviceEventManagerModule) currentReactContext.getNativeModule(DeviceEventManagerModule.class) : null;
        Uri shareIntentUri = getShareIntentUri(reactActivity);
        if (shareIntentUri == null || deviceEventManagerModule == null) {
            return;
        }
        deviceEventManagerModule.emitNewIntentReceived(shareIntentUri);
    }

    public static final String getLastPathComponent(URL url) {
        AbstractC2855l.g(url, "<this>");
        String path = url.getPath();
        AbstractC2855l.f(path, "getPath(...)");
        return q.S0(q.x0(path, "/"), '/', null, 2, null);
    }

    public static final /* synthetic */ <T extends Parcelable> ArrayList<T> getParcelableArrayListExtraCompat(Intent intent, String name) {
        AbstractC2855l.g(intent, "<this>");
        AbstractC2855l.g(name, "name");
        if (Build.VERSION.SDK_INT < 33) {
            return intent.getParcelableArrayListExtra(name);
        }
        AbstractC2855l.m(4, "T");
        return intent.getParcelableArrayListExtra(name, Parcelable.class);
    }

    public static final /* synthetic */ <T extends Parcelable> T getParcelableExtraCompat(Intent intent, String name) {
        AbstractC2855l.g(intent, "<this>");
        AbstractC2855l.g(name, "name");
        if (Build.VERSION.SDK_INT < 33) {
            return (T) intent.getParcelableExtra(name);
        }
        AbstractC2855l.m(4, "T");
        return (T) intent.getParcelableExtra(name, Parcelable.class);
    }

    public static final Uri getShareIntentUri(Context context) {
        AbstractC2855l.g(context, "context");
        String shareScheme = getShareScheme(context);
        if (shareScheme == null) {
            return null;
        }
        return Uri.parse(shareScheme + "://expo-sharing");
    }

    public static final String getShareScheme(Context context) {
        AbstractC2855l.g(context, "context");
        int identifier = context.getResources().getIdentifier("share_into_scheme", "string", context.getPackageName());
        if (identifier == 0) {
            return null;
        }
        return context.getString(identifier);
    }

    public static final boolean isShareIntent(Intent intent) {
        AbstractC2855l.g(intent, "intent");
        return intent.getType() != null && AbstractC2800q.X(AbstractC2800q.m("android.intent.action.SEND", "android.intent.action.SEND_MULTIPLE"), intent.getAction());
    }
}
