package expo.modules.imagepicker;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/imagepicker/ImagePickerResponse;", "Lexpo/modules/kotlin/records/Record;", "canceled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "assets", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/imagepicker/ImagePickerAsset;", "<init>", "(ZLjava/util/List;)V", "getCanceled$annotations", "()V", "getCanceled", "()Z", "getAssets$annotations", "getAssets", "()Ljava/util/List;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImagePickerResponse implements Record {
    private final List<ImagePickerAsset> assets;
    private final boolean canceled;

    /* JADX WARN: Multi-variable type inference failed */
    public ImagePickerResponse() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final List<ImagePickerAsset> getAssets() {
        return this.assets;
    }

    public final boolean getCanceled() {
        return this.canceled;
    }

    public ImagePickerResponse(boolean z10, List<ImagePickerAsset> list) {
        this.canceled = z10;
        this.assets = list;
    }

    public /* synthetic */ ImagePickerResponse(boolean z10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : list);
    }

    @Field
    public static /* synthetic */ void getAssets$annotations() {
    }

    @Field
    public static /* synthetic */ void getCanceled$annotations() {
    }
}
