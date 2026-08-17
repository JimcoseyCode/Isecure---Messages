package com.facebook.react.devsupport.interfaces;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/devsupport/interfaces/ErrorType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "displayName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "JS", "NATIVE", "toString", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ErrorType[] $VALUES;
    public static final ErrorType JS = new ErrorType("JS", 0, "JS");
    public static final ErrorType NATIVE = new ErrorType("NATIVE", 1, "Native");
    private final String displayName;

    private static final /* synthetic */ ErrorType[] $values() {
        return new ErrorType[]{JS, NATIVE};
    }

    static {
        ErrorType[] errorTypeArr$values = $values();
        $VALUES = errorTypeArr$values;
        $ENTRIES = AbstractC3083a.a(errorTypeArr$values);
    }

    private ErrorType(String str, int i10, String str2) {
        this.displayName = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) $VALUES.clone();
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.displayName;
    }
}
