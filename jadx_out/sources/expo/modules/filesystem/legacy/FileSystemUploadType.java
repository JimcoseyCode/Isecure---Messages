package expo.modules.filesystem.legacy;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/filesystem/legacy/FileSystemUploadType;", "Lexpo/modules/kotlin/types/Enumerable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BINARY_CONTENT", "MULTIPART", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileSystemUploadType implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FileSystemUploadType[] $VALUES;
    public static final FileSystemUploadType BINARY_CONTENT = new FileSystemUploadType("BINARY_CONTENT", 0, 0);
    public static final FileSystemUploadType MULTIPART = new FileSystemUploadType("MULTIPART", 1, 1);
    private final int value;

    private static final /* synthetic */ FileSystemUploadType[] $values() {
        return new FileSystemUploadType[]{BINARY_CONTENT, MULTIPART};
    }

    static {
        FileSystemUploadType[] fileSystemUploadTypeArr$values = $values();
        $VALUES = fileSystemUploadTypeArr$values;
        $ENTRIES = AbstractC3083a.a(fileSystemUploadTypeArr$values);
    }

    private FileSystemUploadType(String str, int i10, int i11) {
        this.value = i11;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static FileSystemUploadType valueOf(String str) {
        return (FileSystemUploadType) Enum.valueOf(FileSystemUploadType.class, str);
    }

    public static FileSystemUploadType[] values() {
        return (FileSystemUploadType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
