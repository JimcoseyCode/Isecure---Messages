package expo.modules.sharing;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R$\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000e¨\u0006\""}, d2 = {"Lexpo/modules/sharing/SharePayload;", "Lexpo/modules/kotlin/records/Record;", "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shareType", "Lexpo/modules/sharing/ShareType;", "mimeType", "<init>", "(Ljava/lang/String;Lexpo/modules/sharing/ShareType;Ljava/lang/String;)V", "getValue$annotations", "()V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "getShareType$annotations", "getShareType", "()Lexpo/modules/sharing/ShareType;", "setShareType", "(Lexpo/modules/sharing/ShareType;)V", "getMimeType$annotations", "getMimeType", "setMimeType", "component1", "component2", "component3", "copy", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "expo-sharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SharePayload implements Record {
    private String mimeType;
    private ShareType shareType;
    private String value;

    public SharePayload() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SharePayload copy$default(SharePayload sharePayload, String str, ShareType shareType, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sharePayload.value;
        }
        if ((i10 & 2) != 0) {
            shareType = sharePayload.shareType;
        }
        if ((i10 & 4) != 0) {
            str2 = sharePayload.mimeType;
        }
        return sharePayload.copy(str, shareType, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ShareType getShareType() {
        return this.shareType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public final SharePayload copy(String value, ShareType shareType, String mimeType) {
        AbstractC2855l.g(value, "value");
        AbstractC2855l.g(shareType, "shareType");
        AbstractC2855l.g(mimeType, "mimeType");
        return new SharePayload(value, shareType, mimeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharePayload)) {
            return false;
        }
        SharePayload sharePayload = (SharePayload) other;
        return AbstractC2855l.b(this.value, sharePayload.value) && this.shareType == sharePayload.shareType && AbstractC2855l.b(this.mimeType, sharePayload.mimeType);
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final ShareType getShareType() {
        return this.shareType;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.value.hashCode() * 31) + this.shareType.hashCode()) * 31) + this.mimeType.hashCode();
    }

    public final void setMimeType(String str) {
        AbstractC2855l.g(str, "<set-?>");
        this.mimeType = str;
    }

    public final void setShareType(ShareType shareType) {
        AbstractC2855l.g(shareType, "<set-?>");
        this.shareType = shareType;
    }

    public final void setValue(String str) {
        AbstractC2855l.g(str, "<set-?>");
        this.value = str;
    }

    public String toString() {
        return "SharePayload(value=" + this.value + ", shareType=" + this.shareType + ", mimeType=" + this.mimeType + ")";
    }

    public SharePayload(String value, ShareType shareType, String mimeType) {
        AbstractC2855l.g(value, "value");
        AbstractC2855l.g(shareType, "shareType");
        AbstractC2855l.g(mimeType, "mimeType");
        this.value = value;
        this.shareType = shareType;
        this.mimeType = mimeType;
    }

    public /* synthetic */ SharePayload(String str, ShareType shareType, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? PointerEventHelper.POINTER_TYPE_UNKNOWN : str, (i10 & 2) != 0 ? ShareType.Text : shareType, (i10 & 4) != 0 ? "text/plain" : str2);
    }

    @Field
    public static /* synthetic */ void getMimeType$annotations() {
    }

    @Field
    public static /* synthetic */ void getShareType$annotations() {
    }

    @Field
    public static /* synthetic */ void getValue$annotations() {
    }
}
