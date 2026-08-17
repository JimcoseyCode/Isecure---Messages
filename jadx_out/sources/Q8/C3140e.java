package q8;

import C8.AbstractC0407d0;
import L7.H;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: q8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3140e extends r {
    public C3140e(char c10) {
        super(Character.valueOf(c10));
    }

    private final String c(char c10) {
        switch (c10) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case 11:
            default:
                return e(c10) ? String.valueOf(c10) : "?";
            case '\f':
                return "\\f";
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                return "\\r";
        }
    }

    private final boolean e(char c10) {
        byte type = (byte) Character.getType(c10);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // q8.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC0407d0 a(H module) {
        AbstractC2855l.g(module, "module");
        AbstractC0407d0 abstractC0407d0U = module.n().u();
        AbstractC2855l.f(abstractC0407d0U, "getCharType(...)");
        return abstractC0407d0U;
    }

    @Override // q8.g
    public String toString() {
        String str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(((Character) b()).charValue()), c(((Character) b()).charValue())}, 2));
        AbstractC2855l.f(str, "format(...)");
        return str;
    }
}
