package com.facebook.react.views.text;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000¨\u0006\u0004"}, d2 = {"applyTextTransform", PointerEventHelper.POINTER_TYPE_UNKNOWN, ReactBaseTextShadowNode.PROP_TEXT_TRANSFORM, "Lcom/facebook/react/views/text/TextTransform;", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TextTransformKt {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextTransform.values().length];
            try {
                iArr[TextTransform.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextTransform.LOWERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextTransform.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String applyTextTransform(String str, TextTransform textTransform) {
        AbstractC2855l.g(str, "<this>");
        int i10 = textTransform == null ? -1 : WhenMappings.$EnumSwitchMapping$0[textTransform.ordinal()];
        if (i10 == 1) {
            Locale locale = Locale.getDefault();
            AbstractC2855l.f(locale, "getDefault(...)");
            String upperCase = str.toUpperCase(locale);
            AbstractC2855l.f(upperCase, "toUpperCase(...)");
            return upperCase;
        }
        if (i10 == 2) {
            Locale locale2 = Locale.getDefault();
            AbstractC2855l.f(locale2, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale2);
            AbstractC2855l.f(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        if (i10 != 3) {
            return str;
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb = new StringBuilder(str.length());
        int iFirst = wordInstance.first();
        int next = wordInstance.next();
        while (true) {
            int i11 = next;
            int i12 = iFirst;
            iFirst = i11;
            if (iFirst == -1) {
                String string = sb.toString();
                AbstractC2855l.d(string);
                return string;
            }
            String strSubstring = str.substring(i12, iFirst);
            AbstractC2855l.f(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                char upperCase2 = Character.toUpperCase(strSubstring.charAt(0));
                String strSubstring2 = strSubstring.substring(1);
                AbstractC2855l.f(strSubstring2, "substring(...)");
                strSubstring = upperCase2 + strSubstring2;
            }
            sb.append(strSubstring);
            next = wordInstance.next();
        }
    }
}
