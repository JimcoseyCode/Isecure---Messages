package expo.modules.sharing;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lexpo/modules/sharing/SharingOptions;", "Lexpo/modules/kotlin/records/Record;", "mimeType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "UTI", "dialogTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMimeType$annotations", "()V", "getMimeType", "()Ljava/lang/String;", "getUTI$annotations", "getUTI", "getDialogTitle$annotations", "getDialogTitle", "component1", "component2", "component3", "copy", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "expo-sharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SharingOptions implements Record {
    private final String UTI;
    private final String dialogTitle;
    private final String mimeType;

    public SharingOptions(String str, String str2, String str3) {
        this.mimeType = str;
        this.UTI = str2;
        this.dialogTitle = str3;
    }

    public static /* synthetic */ SharingOptions copy$default(SharingOptions sharingOptions, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sharingOptions.mimeType;
        }
        if ((i10 & 2) != 0) {
            str2 = sharingOptions.UTI;
        }
        if ((i10 & 4) != 0) {
            str3 = sharingOptions.dialogTitle;
        }
        return sharingOptions.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUTI() {
        return this.UTI;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    public final SharingOptions copy(String mimeType, String UTI, String dialogTitle) {
        return new SharingOptions(mimeType, UTI, dialogTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharingOptions)) {
            return false;
        }
        SharingOptions sharingOptions = (SharingOptions) other;
        return AbstractC2855l.b(this.mimeType, sharingOptions.mimeType) && AbstractC2855l.b(this.UTI, sharingOptions.UTI) && AbstractC2855l.b(this.dialogTitle, sharingOptions.dialogTitle);
    }

    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getUTI() {
        return this.UTI;
    }

    public int hashCode() {
        String str = this.mimeType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.UTI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dialogTitle;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SharingOptions(mimeType=" + this.mimeType + ", UTI=" + this.UTI + ", dialogTitle=" + this.dialogTitle + ")";
    }

    @Field
    public static /* synthetic */ void getDialogTitle$annotations() {
    }

    @Field
    public static /* synthetic */ void getMimeType$annotations() {
    }

    @Field
    public static /* synthetic */ void getUTI$annotations() {
    }
}
