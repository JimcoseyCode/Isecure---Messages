package expo.modules.contacts.next.intents;

import android.content.ContentValues;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lexpo/modules/contacts/next/intents/AddContactInput;", "Ljava/io/Serializable;", "contactValues", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/content/ContentValues;", "<init>", "(Ljava/util/List;)V", "getContactValues", "()Ljava/util/List;", "component1", "copy", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AddContactInput implements Serializable {
    private final List<ContentValues> contactValues;

    public AddContactInput(List<ContentValues> contactValues) {
        AbstractC2855l.g(contactValues, "contactValues");
        this.contactValues = contactValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddContactInput copy$default(AddContactInput addContactInput, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = addContactInput.contactValues;
        }
        return addContactInput.copy(list);
    }

    public final List<ContentValues> component1() {
        return this.contactValues;
    }

    public final AddContactInput copy(List<ContentValues> contactValues) {
        AbstractC2855l.g(contactValues, "contactValues");
        return new AddContactInput(contactValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AddContactInput) && AbstractC2855l.b(this.contactValues, ((AddContactInput) other).contactValues);
    }

    public final List<ContentValues> getContactValues() {
        return this.contactValues;
    }

    public int hashCode() {
        return this.contactValues.hashCode();
    }

    public String toString() {
        return "AddContactInput(contactValues=" + this.contactValues + ")";
    }
}
