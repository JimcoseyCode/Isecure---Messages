package expo.modules.medialibrary.albums;

import android.os.Bundle;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lexpo/modules/medialibrary/albums/Album;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "id", PointerEventHelper.POINTER_TYPE_UNKNOWN, AlertFragment.ARG_TITLE, "count", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getCount", "()I", "setCount", "(I)V", "toBundle", "Landroid/os/Bundle;", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class Album {
    private int count;
    private final String id;
    private final String title;

    public Album(String id, String title, int i10) {
        AbstractC2855l.g(id, "id");
        AbstractC2855l.g(title, "title");
        this.id = id;
        this.title = title;
        this.count = i10;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i10) {
        this.count = i10;
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("id", this.id);
        bundle.putString(AlertFragment.ARG_TITLE, this.title);
        bundle.putParcelable(NotificationsService.EVENT_TYPE_KEY, null);
        bundle.putInt("assetCount", this.count);
        return bundle;
    }

    public /* synthetic */ Album(String str, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? 0 : i10);
    }
}
