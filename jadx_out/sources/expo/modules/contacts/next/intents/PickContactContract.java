package expo.modules.contacts.next.intents;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.activityresult.AppContextActivityResultContract;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J$\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lexpo/modules/contacts/next/intents/PickContactContract;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "Lexpo/modules/contacts/next/intents/PickContactInput;", "Landroid/net/Uri;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "intent", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PickContactContract implements AppContextActivityResultContract<PickContactInput, Uri> {
    @Override // expo.modules.kotlin.activityresult.AppContextActivityResultContract
    public Intent createIntent(Context context, PickContactInput input) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(input, "input");
        return new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
    }

    @Override // expo.modules.kotlin.activityresult.AppContextActivityResultContract
    public Uri parseResult(PickContactInput input, int resultCode, Intent intent) {
        AbstractC2855l.g(input, "input");
        if (resultCode != -1 || intent == null) {
            return null;
        }
        return intent.getData();
    }
}
