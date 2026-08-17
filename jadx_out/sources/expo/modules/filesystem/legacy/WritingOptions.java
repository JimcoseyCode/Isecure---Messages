package expo.modules.filesystem.legacy;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lexpo/modules/filesystem/legacy/WritingOptions;", "Lexpo/modules/kotlin/records/Record;", "encoding", "Lexpo/modules/filesystem/legacy/EncodingType;", "append", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Lexpo/modules/filesystem/legacy/EncodingType;Z)V", "getEncoding$annotations", "()V", "getEncoding", "()Lexpo/modules/filesystem/legacy/EncodingType;", "getAppend$annotations", "getAppend", "()Z", "component1", "component2", "copy", "equals", "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WritingOptions implements Record {
    private final boolean append;
    private final EncodingType encoding;

    /* JADX WARN: Multi-variable type inference failed */
    public WritingOptions() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WritingOptions copy$default(WritingOptions writingOptions, EncodingType encodingType, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            encodingType = writingOptions.encoding;
        }
        if ((i10 & 2) != 0) {
            z10 = writingOptions.append;
        }
        return writingOptions.copy(encodingType, z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EncodingType getEncoding() {
        return this.encoding;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAppend() {
        return this.append;
    }

    public final WritingOptions copy(EncodingType encoding, boolean append) {
        AbstractC2855l.g(encoding, "encoding");
        return new WritingOptions(encoding, append);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WritingOptions)) {
            return false;
        }
        WritingOptions writingOptions = (WritingOptions) other;
        return this.encoding == writingOptions.encoding && this.append == writingOptions.append;
    }

    public final boolean getAppend() {
        return this.append;
    }

    public final EncodingType getEncoding() {
        return this.encoding;
    }

    public int hashCode() {
        return (this.encoding.hashCode() * 31) + Boolean.hashCode(this.append);
    }

    public String toString() {
        return "WritingOptions(encoding=" + this.encoding + ", append=" + this.append + ")";
    }

    public WritingOptions(EncodingType encoding, boolean z10) {
        AbstractC2855l.g(encoding, "encoding");
        this.encoding = encoding;
        this.append = z10;
    }

    public /* synthetic */ WritingOptions(EncodingType encodingType, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EncodingType.UTF8 : encodingType, (i10 & 2) != 0 ? false : z10);
    }

    @Field
    public static /* synthetic */ void getAppend$annotations() {
    }

    @Field
    public static /* synthetic */ void getEncoding$annotations() {
    }
}
