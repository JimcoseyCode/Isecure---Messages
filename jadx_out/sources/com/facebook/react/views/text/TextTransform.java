package com.facebook.react.views.text;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/facebook/react/views/text/TextTransform;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;I)V", "NONE", "UPPERCASE", "LOWERCASE", "CAPITALIZE", "UNSET", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextTransform {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextTransform[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TextTransform NONE = new TextTransform("NONE", 0);
    public static final TextTransform UPPERCASE = new TextTransform("UPPERCASE", 1);
    public static final TextTransform LOWERCASE = new TextTransform("LOWERCASE", 2);
    public static final TextTransform CAPITALIZE = new TextTransform("CAPITALIZE", 3);
    public static final TextTransform UNSET = new TextTransform("UNSET", 4);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/react/views/text/TextTransform$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "apply", PointerEventHelper.POINTER_TYPE_UNKNOWN, ReactTextInputShadowNode.PROP_TEXT, ReactBaseTextShadowNode.PROP_TEXT_TRANSFORM, "Lcom/facebook/react/views/text/TextTransform;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String apply(String text, TextTransform textTransform) {
            AbstractC2855l.g(text, "text");
            return TextTransformKt.applyTextTransform(text, textTransform);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ TextTransform[] $values() {
        return new TextTransform[]{NONE, UPPERCASE, LOWERCASE, CAPITALIZE, UNSET};
    }

    static {
        TextTransform[] textTransformArr$values = $values();
        $VALUES = textTransformArr$values;
        $ENTRIES = AbstractC3083a.a(textTransformArr$values);
        INSTANCE = new Companion(null);
    }

    private TextTransform(String str, int i10) {
    }

    public static final String apply(String str, TextTransform textTransform) {
        return INSTANCE.apply(str, textTransform);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static TextTransform valueOf(String str) {
        return (TextTransform) Enum.valueOf(TextTransform.class, str);
    }

    public static TextTransform[] values() {
        return (TextTransform[]) $VALUES.clone();
    }
}
