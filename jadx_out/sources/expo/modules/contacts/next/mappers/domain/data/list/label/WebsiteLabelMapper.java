package expo.modules.contacts.next.mappers.domain.data.list.label;

import P8.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.domain.model.website.WebsiteLabel;
import expo.modules.kotlin.types.ValueOrUndefined;
import i7.C2750m;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/list/label/WebsiteLabelMapper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "toDomain", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;", "label", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/ValueOrUndefined;", "toRecord", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebsiteLabelMapper {
    public static final WebsiteLabelMapper INSTANCE = new WebsiteLabelMapper();

    private WebsiteLabelMapper() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final WebsiteLabel toDomain(String label) {
        if (label == null || q.f0(label)) {
            return new WebsiteLabel.Custom("other");
        }
        String lowerCase = label.toLowerCase(Locale.ROOT);
        AbstractC2855l.f(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -485371922:
                if (lowerCase.equals("homepage")) {
                    return WebsiteLabel.Homepage.INSTANCE;
                }
                break;
            case -309425751:
                if (lowerCase.equals("profile")) {
                    return WebsiteLabel.Profile.INSTANCE;
                }
                break;
            case 101730:
                if (lowerCase.equals("ftp")) {
                    return WebsiteLabel.Ftp.INSTANCE;
                }
                break;
            case 3026850:
                if (lowerCase.equals("blog")) {
                    return WebsiteLabel.Blog.INSTANCE;
                }
                break;
            case 3208415:
                if (lowerCase.equals("home")) {
                    return WebsiteLabel.Home.INSTANCE;
                }
                break;
            case 3655441:
                if (lowerCase.equals("work")) {
                    return WebsiteLabel.Work.INSTANCE;
                }
                break;
            case 106069776:
                if (lowerCase.equals("other")) {
                    return WebsiteLabel.Other.INSTANCE;
                }
                break;
        }
        return new WebsiteLabel.Custom(label);
    }

    public final String toRecord(WebsiteLabel label) {
        AbstractC2855l.g(label, "label");
        if (label instanceof WebsiteLabel.Homepage) {
            return "homepage";
        }
        if (label instanceof WebsiteLabel.Blog) {
            return "blog";
        }
        if (label instanceof WebsiteLabel.Ftp) {
            return "ftp";
        }
        if (label instanceof WebsiteLabel.Home) {
            return "home";
        }
        if (label instanceof WebsiteLabel.Work) {
            return "work";
        }
        if (label instanceof WebsiteLabel.Other) {
            return "other";
        }
        if (label instanceof WebsiteLabel.Profile) {
            return "profile";
        }
        if (label instanceof WebsiteLabel.Custom) {
            return label.getLabel();
        }
        throw new C2750m();
    }

    public final ValueOrUndefined<WebsiteLabel> toDomain(ValueOrUndefined<String> label) {
        AbstractC2855l.g(label, "label");
        if (label instanceof ValueOrUndefined.Value) {
            return new ValueOrUndefined.Value(INSTANCE.toDomain((String) ((ValueOrUndefined.Value) label).getValue()));
        }
        if (label instanceof ValueOrUndefined.Undefined) {
            ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(undefined, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            return undefined;
        }
        throw new C2750m();
    }
}
