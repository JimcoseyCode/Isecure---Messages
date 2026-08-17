package com.facebook.react.uimanager.style;

import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/OutlineStyle;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;I)V", "SOLID", "DASHED", "DOTTED", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OutlineStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OutlineStyle[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OutlineStyle SOLID = new OutlineStyle("SOLID", 0);
    public static final OutlineStyle DASHED = new OutlineStyle("DASHED", 1);
    public static final OutlineStyle DOTTED = new OutlineStyle("DOTTED", 2);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/OutlineStyle$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "fromString", "Lcom/facebook/react/uimanager/style/OutlineStyle;", ViewProps.OUTLINE_STYLE, PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OutlineStyle fromString(String outlineStyle) {
            AbstractC2855l.g(outlineStyle, "outlineStyle");
            String lowerCase = outlineStyle.toLowerCase(Locale.ROOT);
            AbstractC2855l.f(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == -1338941519) {
                if (lowerCase.equals("dashed")) {
                    return OutlineStyle.DASHED;
                }
                return null;
            }
            if (iHashCode == -1325970902) {
                if (lowerCase.equals("dotted")) {
                    return OutlineStyle.DOTTED;
                }
                return null;
            }
            if (iHashCode == 109618859 && lowerCase.equals("solid")) {
                return OutlineStyle.SOLID;
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ OutlineStyle[] $values() {
        return new OutlineStyle[]{SOLID, DASHED, DOTTED};
    }

    static {
        OutlineStyle[] outlineStyleArr$values = $values();
        $VALUES = outlineStyleArr$values;
        $ENTRIES = AbstractC3083a.a(outlineStyleArr$values);
        INSTANCE = new Companion(null);
    }

    private OutlineStyle(String str, int i10) {
    }

    public static final OutlineStyle fromString(String str) {
        return INSTANCE.fromString(str);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static OutlineStyle valueOf(String str) {
        return (OutlineStyle) Enum.valueOf(OutlineStyle.class, str);
    }

    public static OutlineStyle[] values() {
        return (OutlineStyle[]) $VALUES.clone();
    }
}
