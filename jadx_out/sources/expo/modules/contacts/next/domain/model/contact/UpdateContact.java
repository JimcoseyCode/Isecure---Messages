package expo.modules.contacts.next.domain.model.contact;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.model.headers.starred.ExistingStarred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", Columns.STARRED, "Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;", "toAppend", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/model/Appendable;", "<init>", "(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getRawContactId-WW_a-ig", "()Ljava/lang/String;", "Ljava/lang/String;", "getStarred", "()Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;", "getToAppend", "()Ljava/util/List;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpdateContact {
    private final String rawContactId;
    private final ExistingStarred starred;
    private final List<Appendable> toAppend;

    public /* synthetic */ UpdateContact(String str, ExistingStarred existingStarred, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, existingStarred, list);
    }

    /* JADX INFO: renamed from: getRawContactId-WW_a-ig, reason: not valid java name and from getter */
    public final String getRawContactId() {
        return this.rawContactId;
    }

    public final ExistingStarred getStarred() {
        return this.starred;
    }

    public final List<Appendable> getToAppend() {
        return this.toAppend;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private UpdateContact(String rawContactId, ExistingStarred starred, List<? extends Appendable> toAppend) {
        AbstractC2855l.g(rawContactId, "rawContactId");
        AbstractC2855l.g(starred, "starred");
        AbstractC2855l.g(toAppend, "toAppend");
        this.rawContactId = rawContactId;
        this.starred = starred;
        this.toAppend = toAppend;
    }
}
