package expo.modules.linking;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import expo.modules.linking.ExpoLinkingModule;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/linking/LinkingReactActivityLifecycleListener;", "Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;", "<init>", "()V", "Landroid/net/Uri;", "url", "Li7/B;", "onReceiveURL", "(Landroid/net/Uri;)V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", PointerEventHelper.POINTER_TYPE_UNKNOWN, "onNewIntent", "(Landroid/content/Intent;)Z", "expo-linking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LinkingReactActivityLifecycleListener implements ReactActivityLifecycleListener {
    private final void onReceiveURL(Uri url) {
        if (url == null) {
            return;
        }
        ExpoLinkingModule.Companion companion = ExpoLinkingModule.INSTANCE;
        companion.setInitialURL(url);
        Iterator<T> it = companion.getOnURLReceivedObservers().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(url);
        }
    }

    @Override // expo.modules.core.interfaces.ReactActivityLifecycleListener
    public void onCreate(Activity activity, Bundle savedInstanceState) {
        Intent intent;
        onReceiveURL((activity == null || (intent = activity.getIntent()) == null) ? null : intent.getData());
    }

    @Override // expo.modules.core.interfaces.ReactActivityLifecycleListener
    public boolean onNewIntent(Intent intent) {
        onReceiveURL(intent != null ? intent.getData() : null);
        return true;
    }
}
