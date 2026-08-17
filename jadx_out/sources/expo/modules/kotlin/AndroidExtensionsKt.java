package expo.modules.kotlin;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006\u001a(\u0010\u0007\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\t\u001a(\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u000b*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"safeGetParcelableExtra", "T", "Landroid/os/Parcelable;", "Landroid/content/Intent;", "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/Parcelable;", "safeGetParcelable", "Landroid/os/Bundle;", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;", "safeGetSerializable", "Ljava/io/Serializable;", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AndroidExtensionsKt {
    public static final /* synthetic */ <T extends Parcelable> T safeGetParcelable(Bundle bundle, String name) {
        AbstractC2855l.g(bundle, "<this>");
        AbstractC2855l.g(name, "name");
        if (Build.VERSION.SDK_INT < 33) {
            return (T) bundle.getParcelable(name);
        }
        AbstractC2855l.m(4, "T");
        return (T) bundle.getParcelable(name, Parcelable.class);
    }

    public static final /* synthetic */ <T extends Parcelable> T safeGetParcelableExtra(Intent intent, String name) {
        AbstractC2855l.g(intent, "<this>");
        AbstractC2855l.g(name, "name");
        if (Build.VERSION.SDK_INT < 33) {
            return (T) intent.getParcelableExtra(name);
        }
        AbstractC2855l.m(4, "T");
        return (T) intent.getParcelableExtra(name, Parcelable.class);
    }

    public static final /* synthetic */ <T extends Serializable> T safeGetSerializable(Bundle bundle, String name) {
        AbstractC2855l.g(bundle, "<this>");
        AbstractC2855l.g(name, "name");
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC2855l.m(4, "T");
            return (T) bundle.getSerializable(name, Serializable.class);
        }
        T t10 = (T) bundle.getSerializable(name);
        AbstractC2855l.m(1, "T?");
        return t10;
    }
}
