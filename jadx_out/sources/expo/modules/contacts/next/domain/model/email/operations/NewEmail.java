package expo.modules.contacts.next.domain.model.email.operations;

import android.content.ContentProviderOperation;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.domain.model.Insertable;
import expo.modules.contacts.next.domain.model.email.EmailLabel;
import expo.modules.contacts.next.domain.model.email.EmailModel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/contacts/next/domain/model/email/operations/NewEmail;", "Lexpo/modules/contacts/next/domain/model/email/EmailModel;", "Lexpo/modules/contacts/next/domain/model/Insertable;", "address", PointerEventHelper.POINTER_TYPE_UNKNOWN, "label", "Lexpo/modules/contacts/next/domain/model/email/EmailLabel;", "<init>", "(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/email/EmailLabel;)V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NewEmail extends EmailModel implements Insertable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewEmail(String str, EmailLabel label) {
        super(str, label);
        AbstractC2855l.g(label, "label");
    }

    @Override // expo.modules.contacts.next.domain.model.Insertable
    public ContentProviderOperation toInsertOperation() {
        return Insertable.DefaultImpls.toInsertOperation(this);
    }
}
