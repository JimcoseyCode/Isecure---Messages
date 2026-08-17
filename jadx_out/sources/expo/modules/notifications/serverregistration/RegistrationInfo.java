package expo.modules.notifications.serverregistration;

import android.content.Context;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import t7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lexpo/modules/notifications/serverregistration/RegistrationInfo;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "get", "()Ljava/lang/String;", "registrationInfo", "Li7/B;", "set", "(Ljava/lang/String;)V", "Landroid/content/Context;", "Ljava/io/File;", "getNonBackedUpRegistrationInfoFile", "()Ljava/io/File;", "nonBackedUpRegistrationInfoFile", "Companion", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class RegistrationInfo {
    public static final String REGISTRATION_INFO_FILE_NAME = "expo_notifications_registration_info.txt";
    private final Context context;

    public RegistrationInfo(Context context) {
        AbstractC2855l.g(context, "context");
        this.context = context;
    }

    public final String get() {
        if (getNonBackedUpRegistrationInfoFile().exists()) {
            return j.k(getNonBackedUpRegistrationInfoFile(), null, 1, null);
        }
        return null;
    }

    protected final File getNonBackedUpRegistrationInfoFile() {
        return new File(this.context.getNoBackupFilesDir(), REGISTRATION_INFO_FILE_NAME);
    }

    public final void set(String registrationInfo) {
        getNonBackedUpRegistrationInfoFile().delete();
        if (registrationInfo != null) {
            j.m(getNonBackedUpRegistrationInfoFile(), registrationInfo, null, 2, null);
        }
    }
}
