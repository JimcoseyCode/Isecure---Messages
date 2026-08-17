package expo.modules.sharing;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b1\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jh\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R$\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R&\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R&\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010+\u0012\u0004\b&\u0010\u0011\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R&\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b,\u0010\u0011\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010\u0015R&\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b/\u0010\u0011\u001a\u0004\b0\u0010\u0013\"\u0004\b1\u0010\u0015¨\u0006C"}, d2 = {"Lexpo/modules/sharing/ResolvedSharePayload;", "Lexpo/modules/kotlin/records/Record;", "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shareType", "Lexpo/modules/sharing/ShareType;", "mimeType", "contentUri", "contentType", "Lexpo/modules/sharing/ContentType;", "contentSize", PointerEventHelper.POINTER_TYPE_UNKNOWN, "contentMimeType", "originalName", "<init>", "(Ljava/lang/String;Lexpo/modules/sharing/ShareType;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/sharing/ContentType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getValue$annotations", "()V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "getShareType$annotations", "getShareType", "()Lexpo/modules/sharing/ShareType;", "setShareType", "(Lexpo/modules/sharing/ShareType;)V", "getMimeType$annotations", "getMimeType", "setMimeType", "getContentUri$annotations", "getContentUri", "setContentUri", "getContentType$annotations", "getContentType", "()Lexpo/modules/sharing/ContentType;", "setContentType", "(Lexpo/modules/sharing/ContentType;)V", "getContentSize$annotations", "getContentSize", "()Ljava/lang/Long;", "setContentSize", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getContentMimeType$annotations", "getContentMimeType", "setContentMimeType", "getOriginalName$annotations", "getOriginalName", "setOriginalName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lexpo/modules/sharing/ShareType;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/sharing/ContentType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/sharing/ResolvedSharePayload;", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "expo-sharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ResolvedSharePayload implements Record {
    private String contentMimeType;
    private Long contentSize;
    private ContentType contentType;
    private String contentUri;
    private String mimeType;
    private String originalName;
    private ShareType shareType;
    private String value;

    public ResolvedSharePayload() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ ResolvedSharePayload copy$default(ResolvedSharePayload resolvedSharePayload, String str, ShareType shareType, String str2, String str3, ContentType contentType, Long l10, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = resolvedSharePayload.value;
        }
        if ((i10 & 2) != 0) {
            shareType = resolvedSharePayload.shareType;
        }
        if ((i10 & 4) != 0) {
            str2 = resolvedSharePayload.mimeType;
        }
        if ((i10 & 8) != 0) {
            str3 = resolvedSharePayload.contentUri;
        }
        if ((i10 & 16) != 0) {
            contentType = resolvedSharePayload.contentType;
        }
        if ((i10 & 32) != 0) {
            l10 = resolvedSharePayload.contentSize;
        }
        if ((i10 & 64) != 0) {
            str4 = resolvedSharePayload.contentMimeType;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            str5 = resolvedSharePayload.originalName;
        }
        String str6 = str4;
        String str7 = str5;
        ContentType contentType2 = contentType;
        Long l11 = l10;
        return resolvedSharePayload.copy(str, shareType, str2, str3, contentType2, l11, str6, str7);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContentUri() {
        return this.contentUri;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ContentType getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getContentSize() {
        return this.contentSize;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getContentMimeType() {
        return this.contentMimeType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOriginalName() {
        return this.originalName;
    }

    public final ResolvedSharePayload copy(String value, ShareType shareType, String mimeType, String contentUri, ContentType contentType, Long contentSize, String contentMimeType, String originalName) {
        AbstractC2855l.g(value, "value");
        AbstractC2855l.g(shareType, "shareType");
        AbstractC2855l.g(mimeType, "mimeType");
        return new ResolvedSharePayload(value, shareType, mimeType, contentUri, contentType, contentSize, contentMimeType, originalName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResolvedSharePayload)) {
            return false;
        }
        ResolvedSharePayload resolvedSharePayload = (ResolvedSharePayload) other;
        return AbstractC2855l.b(this.value, resolvedSharePayload.value) && this.shareType == resolvedSharePayload.shareType && AbstractC2855l.b(this.mimeType, resolvedSharePayload.mimeType) && AbstractC2855l.b(this.contentUri, resolvedSharePayload.contentUri) && this.contentType == resolvedSharePayload.contentType && AbstractC2855l.b(this.contentSize, resolvedSharePayload.contentSize) && AbstractC2855l.b(this.contentMimeType, resolvedSharePayload.contentMimeType) && AbstractC2855l.b(this.originalName, resolvedSharePayload.originalName);
    }

    public final String getContentMimeType() {
        return this.contentMimeType;
    }

    public final Long getContentSize() {
        return this.contentSize;
    }

    public final ContentType getContentType() {
        return this.contentType;
    }

    public final String getContentUri() {
        return this.contentUri;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getOriginalName() {
        return this.originalName;
    }

    public final ShareType getShareType() {
        return this.shareType;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((((this.value.hashCode() * 31) + this.shareType.hashCode()) * 31) + this.mimeType.hashCode()) * 31;
        String str = this.contentUri;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ContentType contentType = this.contentType;
        int iHashCode3 = (iHashCode2 + (contentType == null ? 0 : contentType.hashCode())) * 31;
        Long l10 = this.contentSize;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.contentMimeType;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originalName;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setContentMimeType(String str) {
        this.contentMimeType = str;
    }

    public final void setContentSize(Long l10) {
        this.contentSize = l10;
    }

    public final void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public final void setContentUri(String str) {
        this.contentUri = str;
    }

    public final void setMimeType(String str) {
        AbstractC2855l.g(str, "<set-?>");
        this.mimeType = str;
    }

    public final void setOriginalName(String str) {
        this.originalName = str;
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
        return "ResolvedSharePayload(value=" + this.value + ", shareType=" + this.shareType + ", mimeType=" + this.mimeType + ", contentUri=" + this.contentUri + ", contentType=" + this.contentType + ", contentSize=" + this.contentSize + ", contentMimeType=" + this.contentMimeType + ", originalName=" + this.originalName + ")";
    }

    public ResolvedSharePayload(String value, ShareType shareType, String mimeType, String str, ContentType contentType, Long l10, String str2, String str3) {
        AbstractC2855l.g(value, "value");
        AbstractC2855l.g(shareType, "shareType");
        AbstractC2855l.g(mimeType, "mimeType");
        this.value = value;
        this.shareType = shareType;
        this.mimeType = mimeType;
        this.contentUri = str;
        this.contentType = contentType;
        this.contentSize = l10;
        this.contentMimeType = str2;
        this.originalName = str3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ResolvedSharePayload(java.lang.String r2, expo.modules.sharing.ShareType r3, java.lang.String r4, java.lang.String r5, expo.modules.sharing.ContentType r6, java.lang.Long r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r11 = r10 & 2
            if (r11 == 0) goto Lc
            expo.modules.sharing.ShareType r3 = expo.modules.sharing.ShareType.Text
        Lc:
            r11 = r10 & 4
            if (r11 == 0) goto L12
            java.lang.String r4 = "text/plain"
        L12:
            r11 = r10 & 8
            r0 = 0
            if (r11 == 0) goto L18
            r5 = r0
        L18:
            r11 = r10 & 16
            if (r11 == 0) goto L1d
            r6 = r0
        L1d:
            r11 = r10 & 32
            if (r11 == 0) goto L22
            r7 = r0
        L22:
            r11 = r10 & 64
            if (r11 == 0) goto L27
            r8 = r0
        L27:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L35
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3e
        L35:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3e:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.sharing.ResolvedSharePayload.<init>(java.lang.String, expo.modules.sharing.ShareType, java.lang.String, java.lang.String, expo.modules.sharing.ContentType, java.lang.Long, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Field
    public static /* synthetic */ void getContentMimeType$annotations() {
    }

    @Field
    public static /* synthetic */ void getContentSize$annotations() {
    }

    @Field
    public static /* synthetic */ void getContentType$annotations() {
    }

    @Field
    public static /* synthetic */ void getContentUri$annotations() {
    }

    @Field
    public static /* synthetic */ void getMimeType$annotations() {
    }

    @Field
    public static /* synthetic */ void getOriginalName$annotations() {
    }

    @Field
    public static /* synthetic */ void getShareType$annotations() {
    }

    @Field
    public static /* synthetic */ void getValue$annotations() {
    }
}
