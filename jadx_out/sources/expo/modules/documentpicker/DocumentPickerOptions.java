package expo.modules.documentpicker;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import expo.modules.notifications.service.NotificationsService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r¨\u0006\u001d"}, d2 = {"Lexpo/modules/documentpicker/DocumentPickerOptions;", "Lexpo/modules/kotlin/records/Record;", "copyToCacheDirectory", PointerEventHelper.POINTER_TYPE_UNKNOWN, NotificationsService.EVENT_TYPE_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "multiple", "<init>", "(ZLjava/util/List;Z)V", "getCopyToCacheDirectory$annotations", "()V", "getCopyToCacheDirectory", "()Z", "getType$annotations", "getType", "()Ljava/util/List;", "getMultiple$annotations", "getMultiple", "component1", "component2", "component3", "copy", "equals", "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "expo-document-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DocumentPickerOptions implements Record {
    private final boolean copyToCacheDirectory;
    private final boolean multiple;
    private final List<String> type;

    public DocumentPickerOptions(boolean z10, List<String> type, boolean z11) {
        AbstractC2855l.g(type, "type");
        this.copyToCacheDirectory = z10;
        this.type = type;
        this.multiple = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentPickerOptions copy$default(DocumentPickerOptions documentPickerOptions, boolean z10, List list, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = documentPickerOptions.copyToCacheDirectory;
        }
        if ((i10 & 2) != 0) {
            list = documentPickerOptions.type;
        }
        if ((i10 & 4) != 0) {
            z11 = documentPickerOptions.multiple;
        }
        return documentPickerOptions.copy(z10, list, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCopyToCacheDirectory() {
        return this.copyToCacheDirectory;
    }

    public final List<String> component2() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getMultiple() {
        return this.multiple;
    }

    public final DocumentPickerOptions copy(boolean copyToCacheDirectory, List<String> type, boolean multiple) {
        AbstractC2855l.g(type, "type");
        return new DocumentPickerOptions(copyToCacheDirectory, type, multiple);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentPickerOptions)) {
            return false;
        }
        DocumentPickerOptions documentPickerOptions = (DocumentPickerOptions) other;
        return this.copyToCacheDirectory == documentPickerOptions.copyToCacheDirectory && AbstractC2855l.b(this.type, documentPickerOptions.type) && this.multiple == documentPickerOptions.multiple;
    }

    public final boolean getCopyToCacheDirectory() {
        return this.copyToCacheDirectory;
    }

    public final boolean getMultiple() {
        return this.multiple;
    }

    public final List<String> getType() {
        return this.type;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.copyToCacheDirectory) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.multiple);
    }

    public String toString() {
        return "DocumentPickerOptions(copyToCacheDirectory=" + this.copyToCacheDirectory + ", type=" + this.type + ", multiple=" + this.multiple + ")";
    }

    @Field
    public static /* synthetic */ void getCopyToCacheDirectory$annotations() {
    }

    @Field
    public static /* synthetic */ void getMultiple$annotations() {
    }

    @Field
    public static /* synthetic */ void getType$annotations() {
    }
}
