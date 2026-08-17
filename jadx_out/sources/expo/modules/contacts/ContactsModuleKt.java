package expo.modules.contacts;

import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.models.DateModelKt;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import j7.AbstractC2800q;
import j7.T;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u001a+\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0010*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"onContactsChangeEventName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toBundle", "Landroid/os/Bundle;", "Lexpo/modules/contacts/ContactPage;", "keys", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/Contact;", "defaultFields", "RC_EDIT_CONTACT", PointerEventHelper.POINTER_TYPE_UNKNOWN, "RC_PICK_CONTACT", "RC_ADD_CONTACT", "DEFAULT_PROJECTION", PointerEventHelper.POINTER_TYPE_UNKNOWN, "safeGet", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "key", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;", "expo-contacts_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ContactsModuleKt {
    public static final int RC_ADD_CONTACT = 2139;
    public static final int RC_EDIT_CONTACT = 2137;
    public static final int RC_PICK_CONTACT = 2138;
    public static final String onContactsChangeEventName = "onContactsChange";
    private static final Set<String> defaultFields = T.h("phoneNumbers", "emails", "addresses", "note", DateModelKt.BIRTHDAY, "dates", "instantMessageAddresses", "urlAddresses", "extraNames", "relationships", "phoneticFirstName", "phoneticLastName", "phoneticMiddleName", "namePrefix", "nameSuffix", "name", "firstName", "middleName", "lastName", "nickname", "id", "jobTitle", "company", "department", "image", "imageAvailable", "note", "isFavorite");
    private static final List<String> DEFAULT_PROJECTION = AbstractC2800q.m(RawContactId.COLUMN_IN_DATA_TABLE, "contact_id", "lookup", Columns.MIMETYPE, Columns.DISPLAY_NAME, Columns.PHOTO_URI, Columns.PHOTO_THUMBNAIL_URI, Columns.DATA, Columns.TYPE, Columns.DATA_5, Columns.LABEL, Columns.DATA_4, Columns.DATA_6, Columns.DATA_7, Columns.DATA_8, Columns.DATA_9, Columns.DATA, Columns.DATA_4, Columns.DATA_5, Columns.STARRED);

    public static final <T> T safeGet(Map<String, ? extends Object> map, String key) {
        AbstractC2855l.g(map, "<this>");
        AbstractC2855l.g(key, "key");
        T t10 = (T) map.get(key);
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    public static final Bundle toBundle(ContactPage contactPage, Set<String> keys) {
        Collection collectionJ;
        List<Contact> data;
        AbstractC2855l.g(keys, "keys");
        if (contactPage == null || (data = contactPage.getData()) == null) {
            collectionJ = AbstractC2800q.j();
        } else {
            collectionJ = new ArrayList(AbstractC2800q.u(data, 10));
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                collectionJ.add(((Contact) it.next()).toMap(keys));
            }
        }
        boolean hasNextPage = contactPage != null ? contactPage.getHasNextPage() : false;
        boolean hasPreviousPage = contactPage != null ? contactPage.getHasPreviousPage() : false;
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data", new ArrayList<>(collectionJ));
        bundle.putBoolean("hasNextPage", hasNextPage);
        bundle.putBoolean("hasPreviousPage", hasPreviousPage);
        return bundle;
    }

    public static final Bundle toBundle(Contact contact, Set<String> keys) {
        List listJ;
        AbstractC2855l.g(keys, "keys");
        Bundle map = contact != null ? contact.toMap(keys) : null;
        if (map == null || (listJ = AbstractC2800q.e(map)) == null) {
            listJ = AbstractC2800q.j();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data", new ArrayList<>(listJ));
        bundle.putBoolean("hasNextPage", false);
        bundle.putBoolean("hasPreviousPage", false);
        return bundle;
    }
}
