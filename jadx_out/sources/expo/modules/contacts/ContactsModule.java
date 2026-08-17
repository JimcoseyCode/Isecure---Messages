package expo.modules.contacts;

import C7.o;
import C7.q;
import P8.q;
import R8.A0;
import R8.AbstractC1417k;
import android.app.Activity;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import android.provider.ContactsContract;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.models.BaseModel;
import expo.modules.contacts.models.BirthdayModel;
import expo.modules.contacts.models.DateModel;
import expo.modules.contacts.models.DateModelKt;
import expo.modules.contacts.models.EmailModel;
import expo.modules.contacts.models.ExtraNameModel;
import expo.modules.contacts.models.ImAddressModel;
import expo.modules.contacts.models.PhoneNumberModel;
import expo.modules.contacts.models.PostalAddressModel;
import expo.modules.contacts.models.RelationshipModel;
import expo.modules.contacts.models.UrlAddressModel;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventListenerWithSenderAndPayload;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.OnActivityResultPayload;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import i7.C2735B;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import t7.AbstractC3376c;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ-\u0010\u0011\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001a\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020#2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0002¢\u0006\u0004\b$\u0010%JS\u0010,\u001a\u0004\u0018\u00010\u001c2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010)2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b,\u0010-JA\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b1\u00102J#\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\u0003J\u000f\u00108\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010\u0003J\u000f\u00109\u001a\u00020\bH\u0002¢\u0006\u0004\b9\u0010\u0003J\u000f\u0010:\u001a\u00020\bH\u0002¢\u0006\u0004\b:\u0010\u0003J\u000f\u0010;\u001a\u00020\bH\u0002¢\u0006\u0004\b;\u0010\u0003J\u000f\u0010<\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010\u0003J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lexpo/modules/contacts/ContactsModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lexpo/modules/contacts/Contact;", "contact", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Li7/B;", "presentForm", "(Lexpo/modules/contacts/Contact;Lexpo/modules/kotlin/Promise;)V", "presentEditForm", "initContact", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "data", "mutateContact", "(Lexpo/modules/contacts/Contact;Ljava/util/Map;)Lexpo/modules/contacts/Contact;", "contactId", "getLookupKeyForContactId", "(Ljava/lang/String;)Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "keysToFetch", "getContactById", "(Ljava/lang/String;Ljava/util/Set;)Lexpo/modules/contacts/Contact;", "query", "sortOrder", "Lexpo/modules/contacts/ContactPage;", "getContactByName", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)Lexpo/modules/contacts/ContactPage;", "Lexpo/modules/contacts/ContactQuery;", "options", "getAllContactsAsync", "(Lexpo/modules/contacts/ContactQuery;)Lexpo/modules/contacts/ContactPage;", "Lexpo/modules/contacts/QueryArguments;", "createProjectionForQuery", "(Ljava/util/Set;)Lexpo/modules/contacts/QueryArguments;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "pageOffset", "pageSize", PointerEventHelper.POINTER_TYPE_UNKNOWN, "queryStrings", "initQueryField", "fetchContacts", "(II[Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)Lexpo/modules/contacts/ContactPage;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "input", "sortContactsBy", "(Ljava/util/ArrayList;Ljava/lang/String;)Ljava/util/ArrayList;", "Landroid/database/Cursor;", "cursor", "loadContactsFrom", "(Landroid/database/Cursor;)Ljava/util/Map;", "ensureReadPermission", "ensureWritePermission", "ensurePermissions", "startObservingContactChanges", "stopObservingContactChanges", "handleContactChange", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "contactPickingPromise", "Lexpo/modules/kotlin/Promise;", "contactManipulationPromise", "Landroid/database/ContentObserver;", "contactChangeObserver", "Landroid/database/ContentObserver;", "Landroid/os/HandlerThread;", "contactsHandlerThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "contactsHandler", "Landroid/os/Handler;", "Lexpo/modules/interfaces/permissions/Permissions;", "getPermissionsManager", "()Lexpo/modules/interfaces/permissions/Permissions;", "permissionsManager", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "currentActivity", "Landroid/content/ContentResolver;", "getResolver", "()Landroid/content/ContentResolver;", "resolver", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactsModule extends Module {
    private ContentObserver contactChangeObserver;
    private Promise contactManipulationPromise;
    private Promise contactPickingPromise;
    private Handler contactsHandler;
    private HandlerThread contactsHandlerThread;

    private final QueryArguments createProjectionForQuery(Set<String> keysToFetch) {
        ArrayList arrayList = new ArrayList(ContactsModuleKt.DEFAULT_PROJECTION);
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.m("vnd.android.cursor.item/name", "vnd.android.cursor.item/organization"));
        String str = "mimetype=? OR mimetype=?";
        if (keysToFetch.contains("phoneNumbers")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.LABEL);
            arrayList.add(Columns.IS_PRIMARY);
            arrayList.add("_id");
            str = "mimetype=? OR mimetype=? OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/phone_v2");
        }
        if (keysToFetch.contains("emails")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.LABEL);
            arrayList.add(Columns.IS_PRIMARY);
            arrayList.add("_id");
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/email_v2");
        }
        if (keysToFetch.contains("addresses")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.LABEL);
            arrayList.add(Columns.DATA_4);
            arrayList.add(Columns.DATA_5);
            arrayList.add(Columns.DATA_6);
            arrayList.add(Columns.DATA_7);
            arrayList.add(Columns.DATA_8);
            arrayList.add(Columns.DATA_9);
            arrayList.add(Columns.DATA_10);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/postal-address_v2");
        }
        if (keysToFetch.contains("note")) {
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/note");
        }
        if (keysToFetch.contains(DateModelKt.BIRTHDAY) || keysToFetch.contains("dates")) {
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/contact_event");
        }
        if (keysToFetch.contains("instantMessageAddresses")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add(Columns.DATA_5);
            arrayList.add("_id");
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/im");
        }
        if (keysToFetch.contains("urlAddresses")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add("_id");
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/website");
        }
        if (keysToFetch.contains("extraNames")) {
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/nickname");
        }
        if (keysToFetch.contains("relationships")) {
            arrayList.add(Columns.DATA);
            arrayList.add(Columns.TYPE);
            arrayList.add("_id");
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/relation");
        }
        if (keysToFetch.contains("phoneticFirstName")) {
            arrayList.add(Columns.DATA_7);
        }
        if (keysToFetch.contains("phoneticLastName")) {
            arrayList.add(Columns.DATA_9);
        }
        if (keysToFetch.contains("phoneticMiddleName")) {
            arrayList.add(Columns.DATA_8);
        }
        if (keysToFetch.contains("namePrefix")) {
            arrayList.add(Columns.DATA_4);
        }
        if (keysToFetch.contains("nameSuffix")) {
            arrayList.add(Columns.DATA_6);
        }
        if (keysToFetch.contains("isFavorite")) {
            arrayList.add(Columns.STARRED);
        }
        return new QueryArguments((String[]) arrayList.toArray(new String[0]), str, (String[]) arrayList2.toArray(new String[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensurePermissions() throws MissingPermissionException {
        ensureReadPermission();
        ensureWritePermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureReadPermission() throws MissingPermissionException {
        if (!getPermissionsManager().hasGrantedPermissions("android.permission.READ_CONTACTS")) {
            throw new MissingPermissionException("android.permission.READ_CONTACTS");
        }
    }

    private final void ensureWritePermission() throws MissingPermissionException {
        if (!getPermissionsManager().hasGrantedPermissions("android.permission.WRITE_CONTACTS")) {
            throw new MissingPermissionException("android.permission.WRITE_CONTACTS");
        }
    }

    private final ContactPage fetchContacts(int pageOffset, int pageSize, String[] queryStrings, String initQueryField, Set<String> keysToFetch, String sortOrder) throws IOException, Exceptions.ReactContextLost {
        if (initQueryField == null) {
            initQueryField = "contact_id";
        }
        boolean z10 = pageSize == 0;
        QueryArguments queryArgumentsCreateProjectionForQuery = createProjectionForQuery(keysToFetch);
        ContentResolver resolver = getResolver();
        Cursor cursorQuery = (queryStrings == null || queryStrings.length == 0) ? resolver.query(ContactsContract.Data.CONTENT_URI, queryArgumentsCreateProjectionForQuery.getProjection(), queryArgumentsCreateProjectionForQuery.getSelection(), queryArgumentsCreateProjectionForQuery.getSelectionArgs(), null) : resolver.query(ContactsContract.Data.CONTENT_URI, queryArgumentsCreateProjectionForQuery.getProjection(), initQueryField + " LIKE ?", queryStrings, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            Map<String, Contact> mapLoadContactsFrom = loadContactsFrom(cursorQuery);
            ArrayList arrayList = new ArrayList();
            ArrayList<Contact> arrayListSortContactsBy = sortContactsBy(new ArrayList<>(mapLoadContactsFrom.values()), sortOrder);
            int size = arrayListSortContactsBy.size();
            for (int i10 = z10 ? 0 : pageOffset; i10 < size; i10++) {
                Contact contact = arrayListSortContactsBy.get(i10);
                AbstractC2855l.f(contact, "get(...)");
                Contact contact2 = contact;
                if (!z10 && i10 - pageOffset >= pageSize) {
                    break;
                }
                arrayList.add(contact2);
            }
            ContactPage contactPage = new ContactPage(arrayList, pageOffset > 0, pageOffset + pageSize < size, size);
            AbstractC3376c.a(cursorQuery, null);
            return contactPage;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactPage getAllContactsAsync(ContactQuery options) {
        return fetchContacts(options.getPageOffset(), options.getPageSize(), null, null, options.getFields(), options.getSort());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Contact getContactById(String contactId, Set<String> keysToFetch) throws IOException {
        Cursor cursorQuery = getResolver().query(ContactsContract.Data.CONTENT_URI, createProjectionForQuery(keysToFetch).getProjection(), "contact_id = ?", new String[]{contactId}, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            Contact contact = (Contact) AbstractC2800q.f0(loadContactsFrom(cursorQuery).values());
            AbstractC3376c.a(cursorQuery, null);
            return contact;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactPage getContactByName(String query, Set<String> keysToFetch, String sortOrder) {
        return fetchContacts(0, 9999, new String[]{query}, Columns.DISPLAY_NAME, keysToFetch, sortOrder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity getCurrentActivity() {
        return getAppContext().getThrowingActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLookupKeyForContactId(String contactId) throws IOException {
        Cursor cursorQuery = getResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"lookup"}, "_id = " + contactId, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
            AbstractC3376c.a(cursorQuery, null);
            return string;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Permissions getPermissionsManager() throws Exceptions.PermissionsModuleNotFound {
        Permissions permissions = getAppContext().getPermissions();
        if (permissions != null) {
            return permissions;
        }
        throw new Exceptions.PermissionsModuleNotFound();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentResolver getResolver() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext == null) {
            throw new Exceptions.ReactContextLost();
        }
        ContentResolver contentResolver = reactContext.getContentResolver();
        AbstractC2855l.f(contentResolver, "getContentResolver(...)");
        return contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleContactChange() {
        sendEvent("onContactsChange", K.f(t.a(ExpoNotificationBuilder.EXTRAS_BODY_KEY, null)));
    }

    private final Map<String, Contact> loadContactsFrom(Cursor cursor) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndex("contact_id"));
            Object contact = linkedHashMap.get(string);
            if (contact == null) {
                AbstractC2855l.d(string);
                contact = new Contact(string, getAppContext());
                linkedHashMap.put(string, contact);
            }
            ((Contact) contact).fromCursor(cursor);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Contact mutateContact(Contact initContact, Map<String, ? extends Object> data) throws IllegalAccessException, RemoteImageUriException, InstantiationException, InvocationTargetException {
        if (initContact == null) {
            String string = UUID.randomUUID().toString();
            AbstractC2855l.f(string, "toString(...)");
            initContact = new Contact(string, getAppContext());
        }
        String str = (String) ContactsModuleKt.safeGet(data, "firstName");
        if (str != null) {
            initContact.setFirstName(str);
        }
        String str2 = (String) ContactsModuleKt.safeGet(data, "middleName");
        if (str2 != null) {
            initContact.setMiddleName(str2);
        }
        String str3 = (String) ContactsModuleKt.safeGet(data, "lastName");
        if (str3 != null) {
            initContact.setLastName(str3);
        }
        String str4 = (String) ContactsModuleKt.safeGet(data, "namePrefix");
        if (str4 != null) {
            initContact.setPrefix(str4);
        }
        String str5 = (String) ContactsModuleKt.safeGet(data, "nameSuffix");
        if (str5 != null) {
            initContact.setSuffix(str5);
        }
        String str6 = (String) ContactsModuleKt.safeGet(data, "phoneticFirstName");
        if (str6 != null) {
            initContact.setPhoneticFirstName(str6);
        }
        String str7 = (String) ContactsModuleKt.safeGet(data, "phoneticMiddleName");
        if (str7 != null) {
            initContact.setPhoneticMiddleName(str7);
        }
        String str8 = (String) ContactsModuleKt.safeGet(data, "phoneticLastName");
        if (str8 != null) {
            initContact.setPhoneticLastName(str8);
        }
        String str9 = (String) ContactsModuleKt.safeGet(data, "company");
        if (str9 != null) {
            initContact.setCompany(str9);
        }
        String str10 = (String) ContactsModuleKt.safeGet(data, "jobTitle");
        if (str10 != null) {
            initContact.setJobTitle(str10);
        }
        String str11 = (String) ContactsModuleKt.safeGet(data, "department");
        if (str11 != null) {
            initContact.setDepartment(str11);
        }
        String str12 = (String) ContactsModuleKt.safeGet(data, "note");
        if (str12 != null) {
            initContact.setNote(str12);
        }
        if (data.containsKey("image")) {
            Object obj = data.get("image");
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey("uri")) {
                    String str13 = (String) map.get("uri");
                    if (str13 != null && !q.K(str13, "file://", false, 2, null) && !q.K(str13, "content://", false, 2, null) && !q.K(str13, "android.resource://", false, 2, null)) {
                        throw new RemoteImageUriException(str13);
                    }
                    initContact.setPhotoUri(str13);
                    initContact.setHasPhoto(true);
                }
            }
        }
        BaseModel.Companion companion = BaseModel.INSTANCE;
        List<PostalAddressModel> listDecodeList = companion.decodeList((List) ContactsModuleKt.safeGet(data, "addresses"), PostalAddressModel.class);
        if (listDecodeList != null) {
            initContact.setAddresses(listDecodeList);
        }
        List<PhoneNumberModel> listDecodeList2 = companion.decodeList((List) ContactsModuleKt.safeGet(data, "phoneNumbers"), PhoneNumberModel.class);
        if (listDecodeList2 != null) {
            initContact.setPhones(listDecodeList2);
        }
        List<EmailModel> listDecodeList3 = companion.decodeList((List) ContactsModuleKt.safeGet(data, "emails"), EmailModel.class);
        if (listDecodeList3 != null) {
            initContact.setEmails(listDecodeList3);
        }
        List<ImAddressModel> listDecodeList4 = companion.decodeList((List) ContactsModuleKt.safeGet(data, "instantMessageAddresses"), ImAddressModel.class);
        if (listDecodeList4 != null) {
            initContact.setImAddresses(listDecodeList4);
        }
        List<UrlAddressModel> listDecodeList5 = companion.decodeList((List) ContactsModuleKt.safeGet(data, "urlAddresses"), UrlAddressModel.class);
        if (listDecodeList5 != null) {
            initContact.setUrlAddresses(listDecodeList5);
        }
        List<ExtraNameModel> listDecodeList6 = companion.decodeList((List) ContactsModuleKt.safeGet(data, "extraNames"), ExtraNameModel.class);
        if (listDecodeList6 != null) {
            initContact.setExtraNames(listDecodeList6);
        }
        List<DateModel> listDecodeList7 = companion.decodeList((List) ContactsModuleKt.safeGet(data, "dates"), DateModel.class);
        if (listDecodeList7 != null) {
            initContact.setDates(listDecodeList7);
        }
        Object obj2 = data.get(DateModelKt.BIRTHDAY);
        if (obj2 != null) {
            Object obj3 = obj2 instanceof Map ? obj2 : null;
            if (obj3 != null) {
                List<DateModel> dates = initContact.getDates();
                BirthdayModel birthdayModel = new BirthdayModel();
                birthdayModel.fromMap((Map) obj3);
                dates.add(birthdayModel);
            }
        }
        List<RelationshipModel> listDecodeList8 = companion.decodeList((List) ContactsModuleKt.safeGet(data, "relationships"), RelationshipModel.class);
        if (listDecodeList8 != null) {
            initContact.setRelationships(listDecodeList8);
        }
        Boolean bool = (Boolean) ContactsModuleKt.safeGet(data, "isFavorite");
        if (bool != null) {
            initContact.setFavorite(bool.booleanValue());
        }
        return initContact;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentEditForm(Contact contact, Promise promise) {
        Uri lookupUri = ContactsContract.Contacts.getLookupUri(Long.parseLong(contact.getContactId()), contact.getLookupKey());
        Intent intent = new Intent("android.intent.action.EDIT");
        intent.setDataAndType(lookupUri, "vnd.android.cursor.item/contact");
        this.contactManipulationPromise = promise;
        getCurrentActivity().startActivityForResult(intent, ContactsModuleKt.RC_EDIT_CONTACT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentForm(Contact contact, Promise promise) {
        Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        intent.putExtra("name", contact.getFinalDisplayName());
        intent.putParcelableArrayListExtra("data", contact.getContentValues());
        this.contactManipulationPromise = promise;
        getCurrentActivity().startActivityForResult(intent, ContactsModuleKt.RC_ADD_CONTACT);
    }

    private final ArrayList<Contact> sortContactsBy(ArrayList<Contact> input, String sortOrder) {
        if (AbstractC2855l.b(sortOrder, "firstName")) {
            final Function2 function2 = new Function2() { // from class: expo.modules.contacts.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(ContactsModule.sortContactsBy$lambda$43((Contact) obj, (Contact) obj2));
                }
            };
            AbstractC2800q.y(input, new Comparator() { // from class: expo.modules.contacts.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ContactsModule.sortContactsBy$lambda$44(function2, obj, obj2);
                }
            });
            return input;
        }
        if (AbstractC2855l.b(sortOrder, "lastName")) {
            final Function2 function22 = new Function2() { // from class: expo.modules.contacts.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(ContactsModule.sortContactsBy$lambda$45((Contact) obj, (Contact) obj2));
                }
            };
            AbstractC2800q.y(input, new Comparator() { // from class: expo.modules.contacts.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ContactsModule.sortContactsBy$lambda$46(function22, obj, obj2);
                }
            });
        }
        return input;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortContactsBy$lambda$43(Contact contact, Contact contact2) {
        return q.r(contact.getFinalFirstName(), contact2.getFinalFirstName(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortContactsBy$lambda$44(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortContactsBy$lambda$45(Contact contact, Contact contact2) {
        return q.r(contact.getFinalLastName(), contact2.getFinalLastName(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortContactsBy$lambda$46(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startObservingContactChanges() {
        if (this.contactChangeObserver != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("ContactsObserverThread");
        this.contactsHandlerThread = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.contactsHandlerThread;
        AbstractC2855l.d(handlerThread2);
        final Handler handler = new Handler(handlerThread2.getLooper());
        this.contactsHandler = handler;
        ContentObserver contentObserver = new ContentObserver(handler) { // from class: expo.modules.contacts.ContactsModule$startObservingContactChanges$observer$1
            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange, Uri uri) {
                super.onChange(selfChange, uri);
                this.this$0.handleContactChange();
            }
        };
        Iterator it = AbstractC2800q.m(ContactsContract.Contacts.CONTENT_URI, ContactsContract.RawContacts.CONTENT_URI).iterator();
        while (it.hasNext()) {
            getResolver().registerContentObserver((Uri) it.next(), true, contentObserver);
        }
        this.contactChangeObserver = contentObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopObservingContactChanges() {
        ContentObserver contentObserver = this.contactChangeObserver;
        if (contentObserver != null) {
            getResolver().unregisterContentObserver(contentObserver);
            this.contactChangeObserver = null;
        }
        this.contactsHandler = null;
        HandlerThread handlerThread = this.contactsHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.contactsHandlerThread = null;
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Class cls;
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        AsyncFunctionComponent intAsyncFunctionComponent;
        AsyncFunctionComponent intAsyncFunctionComponent2;
        Class cls2;
        AnyTypeProvider anyTypeProvider;
        Object obj;
        AsyncFunctionComponent intAsyncFunctionComponent3;
        Boolean bool;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        Boolean bool2;
        Boolean bool3;
        AsyncFunctionComponent intAsyncFunctionComponent4;
        Boolean bool4;
        Boolean bool5;
        Class cls3;
        AsyncFunctionComponent intAsyncFunctionComponent5;
        Class cls4;
        Class cls5;
        Class cls6;
        AsyncFunctionComponent intAsyncFunctionComponent6;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder2.Name("ExpoContacts");
            moduleDefinitionBuilder2.Events("onContactsChange");
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder2.getEventListeners();
            EventName eventName = EventName.MODULE_DESTROY;
            eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$OnDestroy$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m33invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m33invoke() {
                    this.this$0.stopObservingContactChanges();
                }
            }));
            moduleDefinitionBuilder2.OnStartObserving("onContactsChange", new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$1$2
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() throws MissingPermissionException {
                    m31invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m31invoke() throws MissingPermissionException {
                    this.this$0.ensureReadPermission();
                    this.this$0.startObservingContactChanges();
                }
            });
            moduleDefinitionBuilder2.OnStopObserving("onContactsChange", new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$1$3
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m32invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m32invoke() {
                    this.this$0.stopObservingContactChanges();
                }
            });
            boolean zB = AbstractC2855l.b(Promise.class, Promise.class);
            Class cls7 = Integer.TYPE;
            Class cls8 = Float.TYPE;
            Class cls9 = Double.TYPE;
            Class cls10 = Boolean.TYPE;
            if (zB) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("requestPermissionsAsync", new AnyType[0], new Function2() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Object[]) obj2, (Promise) obj3);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        if (this.this$0.getPermissionsManager().isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
                        } else {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.READ_CONTACTS");
                        }
                    }
                });
                cls = ContactQuery.class;
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
                cls = ContactQuery.class;
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Promise.class), Boolean.FALSE));
                if (anyType == null) {
                    moduleDefinitionBuilder = moduleDefinitionBuilder2;
                    anyType = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters);
                } else {
                    moduleDefinitionBuilder = moduleDefinitionBuilder2;
                }
                AnyType[] anyTypeArr = {anyType};
                Function1 function1 = new Function1() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        if (this.this$0.getPermissionsManager().isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
                        } else {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.READ_CONTACTS");
                        }
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, cls7) ? new IntAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls10) ? new BoolAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls9) ? new DoubleAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls8) ? new FloatAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr, function1);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("requestPermissionsAsync", intAsyncFunctionComponent);
            if (AbstractC2855l.b(Promise.class, Promise.class)) {
                intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("getPermissionsAsync", new AnyType[0], new Function2() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Object[]) obj2, (Promise) obj3);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        if (this.this$0.getPermissionsManager().isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
                        } else {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.READ_CONTACTS");
                        }
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
                AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Promise.class), Boolean.FALSE));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$5
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters2);
                }
                AnyType[] anyTypeArr2 = {anyType2};
                Function1 function12 = new Function1() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        if (this.this$0.getPermissionsManager().isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
                        } else {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.READ_CONTACTS");
                        }
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent2 = AbstractC2855l.b(C2735B.class, cls7) ? new IntAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls10) ? new BoolAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls9) ? new DoubleAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls8) ? new FloatAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, function12);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getPermissionsAsync", intAsyncFunctionComponent2);
            TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
            C7.d dVarB = D.b(cls);
            Boolean bool6 = Boolean.FALSE;
            AnyType anyType3 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, bool6));
            if (anyType3 == null) {
                ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$1 contactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$1 = new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ContactQuery.class);
                    }
                };
                anyTypeProvider = anyTypeProvider2;
                obj = C2735B.class;
                C7.d dVarB2 = D.b(cls);
                cls2 = Map.class;
                anyType3 = new AnyType(new LazyKType(dVarB2, false, contactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$1), converters3);
            } else {
                cls2 = Map.class;
                anyTypeProvider = anyTypeProvider2;
                obj = C2735B.class;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getContactsAsync", new AsyncFunctionWithPromiseComponent("getContactsAsync", new AnyType[]{anyType3}, new Function2() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$2
                public final void invoke(Object[] objArr, Promise promise) throws MissingPermissionException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    ContactQuery contactQuery = (ContactQuery) objArr[0];
                    this.this$0.ensureReadPermission();
                    AbstractC1417k.d(this.this$0.getAppContext().getBackgroundCoroutineScope(), null, null, new ContactsModule$definition$1$6$1(contactQuery, promise, this.this$0, null), 3, null);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) throws MissingPermissionException {
                    invoke((Object[]) obj2, (Promise) obj3);
                    return C2735B.f28704a;
                }
            }));
            if (AbstractC2855l.b(Promise.class, Promise.class)) {
                intAsyncFunctionComponent3 = new AsyncFunctionWithPromiseComponent("hasContactsAsync", new AnyType[0], new Function2() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) throws MissingPermissionException {
                        invoke((Object[]) obj2, (Promise) obj3);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) throws MissingPermissionException {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        this.this$0.ensureReadPermission();
                        AbstractC1417k.d(this.this$0.getAppContext().getBackgroundCoroutineScope(), null, null, new ContactsModule$definition$1$7$1(this.this$0, promise, null), 3, null);
                    }
                });
            } else {
                TypeConverterProvider converters4 = moduleDefinitionBuilder.getConverters();
                AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Promise.class), bool6));
                if (anyType4 == null) {
                    anyType4 = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$8
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters4);
                }
                AnyType[] anyTypeArr3 = {anyType4};
                Function1 function13 = new Function1() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$9
                    @Override // kotlin.jvm.functions.Function1
                    public final A0 invoke(Object[] objArr) throws MissingPermissionException {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        this.this$0.ensureReadPermission();
                        return AbstractC1417k.d(this.this$0.getAppContext().getBackgroundCoroutineScope(), null, null, new ContactsModule$definition$1$7$1(this.this$0, promise, null), 3, null);
                    }
                };
                intAsyncFunctionComponent3 = AbstractC2855l.b(A0.class, cls7) ? new IntAsyncFunctionComponent("hasContactsAsync", anyTypeArr3, function13) : AbstractC2855l.b(A0.class, cls10) ? new BoolAsyncFunctionComponent("hasContactsAsync", anyTypeArr3, function13) : AbstractC2855l.b(A0.class, cls9) ? new DoubleAsyncFunctionComponent("hasContactsAsync", anyTypeArr3, function13) : AbstractC2855l.b(A0.class, cls8) ? new FloatAsyncFunctionComponent("hasContactsAsync", anyTypeArr3, function13) : AbstractC2855l.b(A0.class, String.class) ? new StringAsyncFunctionComponent("hasContactsAsync", anyTypeArr3, function13) : new UntypedAsyncFunctionComponent("hasContactsAsync", anyTypeArr3, function13);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("hasContactsAsync", intAsyncFunctionComponent3);
            TypeConverterProvider converters5 = moduleDefinitionBuilder.getConverters();
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool6));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$10
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = C7.q.f518c;
                        return D.q(Map.class, aVar.d(D.o(String.class)), aVar.d(D.o(Object.class)));
                    }
                }), converters5);
            }
            C7.d dVarB3 = D.b(String.class);
            Boolean bool7 = Boolean.TRUE;
            AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, bool7));
            if (anyType6 == null) {
                bool = bool7;
                anyType6 = new AnyType(new LazyKType(D.b(String.class), true, new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$11
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters5);
            } else {
                bool = bool7;
            }
            AnyType[] anyTypeArr4 = {anyType5, anyType6};
            Function1 function14 = new Function1() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$12
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(Object[] objArr) throws AddContactException, MissingPermissionException, RemoteException, IOException, Exceptions.ReactContextLost, OperationApplicationException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj2 = objArr[0];
                    this.this$0.ensurePermissions();
                    ContentProviderResult[] contentProviderResultArrApplyBatch = this.this$0.getResolver().applyBatch("com.android.contacts", this.this$0.mutateContact(null, (Map) obj2).toInsertOperationList());
                    AbstractC2855l.f(contentProviderResultArrApplyBatch, "applyBatch(...)");
                    if (contentProviderResultArrApplyBatch.length == 0) {
                        throw new AddContactException();
                    }
                    ContentResolver resolver = this.this$0.getResolver();
                    Uri uri = contentProviderResultArrApplyBatch[0].uri;
                    AbstractC2855l.d(uri);
                    Cursor cursorQuery = resolver.query(uri, new String[]{"contact_id"}, null, null, null);
                    try {
                        if (cursorQuery == null) {
                            throw new RetrieveIdException();
                        }
                        cursorQuery.moveToNext();
                        String strValueOf = String.valueOf(cursorQuery.getLong(0));
                        AbstractC3376c.a(cursorQuery, null);
                        return strValueOf;
                    } finally {
                    }
                }
            };
            moduleDefinitionBuilder.getAsyncFunctions().put("addContactAsync", AbstractC2855l.b(String.class, cls7) ? new IntAsyncFunctionComponent("addContactAsync", anyTypeArr4, function14) : AbstractC2855l.b(String.class, cls10) ? new BoolAsyncFunctionComponent("addContactAsync", anyTypeArr4, function14) : AbstractC2855l.b(String.class, cls9) ? new DoubleAsyncFunctionComponent("addContactAsync", anyTypeArr4, function14) : AbstractC2855l.b(String.class, cls8) ? new FloatAsyncFunctionComponent("addContactAsync", anyTypeArr4, function14) : AbstractC2855l.b(String.class, String.class) ? new StringAsyncFunctionComponent("addContactAsync", anyTypeArr4, function14) : new UntypedAsyncFunctionComponent("addContactAsync", anyTypeArr4, function14));
            Class cls11 = cls2;
            if (AbstractC2855l.b(cls11, Promise.class)) {
                untypedAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("updateContactAsync", new AnyType[0], new Function2() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$13
                    public final void invoke(Object[] objArr, Promise promise) throws ContactUpdateException, MissingPermissionException, ContactNotFoundException, IOException, RemoteException, OperationApplicationException {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        Map map = (Map) promise;
                        this.this$0.ensurePermissions();
                        Contact contactById = this.this$0.getContactById(map.containsKey("id") ? (String) map.get("id") : null, ContactsModuleKt.defaultFields);
                        if (contactById == null) {
                            throw new ContactNotFoundException();
                        }
                        ContentProviderResult[] contentProviderResultArrApplyBatch = this.this$0.getResolver().applyBatch("com.android.contacts", this.this$0.mutateContact(contactById, map).toUpdateOperationList());
                        AbstractC2855l.f(contentProviderResultArrApplyBatch, "applyBatch(...)");
                        if (contentProviderResultArrApplyBatch.length == 0) {
                            throw new ContactUpdateException();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) throws ContactUpdateException, MissingPermissionException, ContactNotFoundException, IOException, RemoteException, OperationApplicationException {
                        invoke((Object[]) obj2, (Promise) obj3);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters6 = moduleDefinitionBuilder.getConverters();
                AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls11), bool6));
                if (anyType7 == null) {
                    anyType7 = new AnyType(new LazyKType(D.b(cls11), false, new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$14
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            q.a aVar = C7.q.f518c;
                            return D.q(Map.class, aVar.d(D.o(String.class)), aVar.d(D.o(Object.class)));
                        }
                    }), converters6);
                }
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("updateContactAsync", new AnyType[]{anyType7}, new Function1() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$15
                    @Override // kotlin.jvm.functions.Function1
                    public final String invoke(Object[] objArr) throws ContactUpdateException, MissingPermissionException, ContactNotFoundException, IOException, RemoteException, OperationApplicationException {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Map map = (Map) objArr[0];
                        this.this$0.ensurePermissions();
                        String str = map.containsKey("id") ? (String) map.get("id") : null;
                        Contact contactById = this.this$0.getContactById(str, ContactsModuleKt.defaultFields);
                        if (contactById == null) {
                            throw new ContactNotFoundException();
                        }
                        ContentProviderResult[] contentProviderResultArrApplyBatch = this.this$0.getResolver().applyBatch("com.android.contacts", this.this$0.mutateContact(contactById, map).toUpdateOperationList());
                        AbstractC2855l.f(contentProviderResultArrApplyBatch, "applyBatch(...)");
                        if (contentProviderResultArrApplyBatch.length == 0) {
                            throw new ContactUpdateException();
                        }
                        return str;
                    }
                });
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("updateContactAsync", untypedAsyncFunctionComponent);
            if (AbstractC2855l.b(String.class, Promise.class)) {
                intAsyncFunctionComponent4 = new AsyncFunctionWithPromiseComponent("removeContactAsync", new AnyType[0], new Function2() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$16
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) throws MissingPermissionException {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        this.this$0.ensurePermissions();
                        this.this$0.getResolver().delete(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, (String) promise), null, null);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) throws MissingPermissionException {
                        invoke((Object[]) obj2, (Promise) obj3);
                        return C2735B.f28704a;
                    }
                });
                bool2 = bool;
                bool3 = bool6;
            } else {
                TypeConverterProvider converters7 = moduleDefinitionBuilder.getConverters();
                bool2 = bool;
                AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool2));
                if (anyType8 == null) {
                    bool3 = bool6;
                    anyType8 = new AnyType(new LazyKType(D.b(String.class), true, new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$17
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.f(String.class);
                        }
                    }), converters7);
                } else {
                    bool3 = bool6;
                }
                AnyType[] anyTypeArr5 = {anyType8};
                Function1 function15 = new Function1() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$18
                    @Override // kotlin.jvm.functions.Function1
                    public final Integer invoke(Object[] objArr) throws MissingPermissionException {
                        AbstractC2855l.g(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        this.this$0.ensurePermissions();
                        return Integer.valueOf(this.this$0.getResolver().delete(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, str), null, null));
                    }
                };
                intAsyncFunctionComponent4 = AbstractC2855l.b(Integer.class, cls7) ? new IntAsyncFunctionComponent("removeContactAsync", anyTypeArr5, function15) : AbstractC2855l.b(Integer.class, cls10) ? new BoolAsyncFunctionComponent("removeContactAsync", anyTypeArr5, function15) : AbstractC2855l.b(Integer.class, cls9) ? new DoubleAsyncFunctionComponent("removeContactAsync", anyTypeArr5, function15) : AbstractC2855l.b(Integer.class, cls8) ? new FloatAsyncFunctionComponent("removeContactAsync", anyTypeArr5, function15) : AbstractC2855l.b(Integer.class, String.class) ? new StringAsyncFunctionComponent("removeContactAsync", anyTypeArr5, function15) : new UntypedAsyncFunctionComponent("removeContactAsync", anyTypeArr5, function15);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("removeContactAsync", intAsyncFunctionComponent4);
            TypeConverterProvider converters8 = moduleDefinitionBuilder.getConverters();
            AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool2));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(D.b(String.class), true, new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$19
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters8);
            }
            AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool2));
            if (anyType10 == null) {
                bool4 = bool2;
                anyType10 = new AnyType(new LazyKType(D.b(String.class), true, new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$20
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters8);
            } else {
                bool4 = bool2;
            }
            AnyType[] anyTypeArr6 = {anyType9, anyType10};
            Function1 function16 = new Function1() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$21
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] objArr) throws LookupKeyNotFoundException, IOException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj2 = objArr[0];
                    String str = (String) objArr[1];
                    String lookupKeyForContactId = this.this$0.getLookupKeyForContactId((String) obj2);
                    if (lookupKeyForContactId == null) {
                        throw new LookupKeyNotFoundException();
                    }
                    Uri uriWithAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId);
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/x-vcard");
                    intent.putExtra("android.intent.extra.STREAM", uriWithAppendedPath);
                    intent.putExtra("android.intent.extra.SUBJECT", str);
                    this.this$0.getCurrentActivity().startActivity(intent);
                    return C2735B.f28704a;
                }
            };
            Object obj2 = obj;
            moduleDefinitionBuilder.getAsyncFunctions().put("shareContactAsync", AbstractC2855l.b(obj2, cls7) ? new IntAsyncFunctionComponent("shareContactAsync", anyTypeArr6, function16) : AbstractC2855l.b(obj2, cls10) ? new BoolAsyncFunctionComponent("shareContactAsync", anyTypeArr6, function16) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("shareContactAsync", anyTypeArr6, function16) : AbstractC2855l.b(obj2, cls8) ? new FloatAsyncFunctionComponent("shareContactAsync", anyTypeArr6, function16) : AbstractC2855l.b(obj2, String.class) ? new StringAsyncFunctionComponent("shareContactAsync", anyTypeArr6, function16) : new UntypedAsyncFunctionComponent("shareContactAsync", anyTypeArr6, function16));
            if (AbstractC2855l.b(cls11, Promise.class)) {
                intAsyncFunctionComponent5 = new AsyncFunctionWithPromiseComponent("writeContactToFileAsync", new AnyType[0], new Function2() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$22
                    public final void invoke(Object[] objArr, Promise promise) throws LookupKeyNotFoundException, MissingPermissionException, IOException {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        Map map = (Map) promise;
                        this.this$0.ensureReadPermission();
                        String lookupKeyForContactId = this.this$0.getLookupKeyForContactId(map.containsKey("id") ? (String) map.get("id") : null);
                        if (lookupKeyForContactId == null) {
                            throw new LookupKeyNotFoundException();
                        }
                        Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId).toString();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) throws LookupKeyNotFoundException, MissingPermissionException, IOException {
                        invoke((Object[]) obj3, (Promise) obj4);
                        return C2735B.f28704a;
                    }
                });
                cls3 = cls11;
                bool5 = bool3;
            } else {
                TypeConverterProvider converters9 = moduleDefinitionBuilder.getConverters();
                bool5 = bool3;
                AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls11), bool5));
                if (anyType11 == null) {
                    cls3 = cls11;
                    anyType11 = new AnyType(new LazyKType(D.b(cls11), false, new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$23
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            q.a aVar = C7.q.f518c;
                            return D.q(Map.class, aVar.d(D.o(String.class)), aVar.d(D.f(Object.class)));
                        }
                    }), converters9);
                } else {
                    cls3 = cls11;
                }
                AnyType[] anyTypeArr7 = {anyType11};
                Function1 function17 = new Function1() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$24
                    @Override // kotlin.jvm.functions.Function1
                    public final String invoke(Object[] objArr) throws LookupKeyNotFoundException, MissingPermissionException, IOException {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Map map = (Map) objArr[0];
                        this.this$0.ensureReadPermission();
                        String lookupKeyForContactId = this.this$0.getLookupKeyForContactId(map.containsKey("id") ? (String) map.get("id") : null);
                        if (lookupKeyForContactId != null) {
                            return Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId).toString();
                        }
                        throw new LookupKeyNotFoundException();
                    }
                };
                intAsyncFunctionComponent5 = AbstractC2855l.b(String.class, cls7) ? new IntAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr7, function17) : AbstractC2855l.b(String.class, cls10) ? new BoolAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr7, function17) : AbstractC2855l.b(String.class, cls9) ? new DoubleAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr7, function17) : AbstractC2855l.b(String.class, cls8) ? new FloatAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr7, function17) : AbstractC2855l.b(String.class, String.class) ? new StringAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr7, function17) : new UntypedAsyncFunctionComponent("writeContactToFileAsync", anyTypeArr7, function17);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("writeContactToFileAsync", intAsyncFunctionComponent5);
            TypeConverterProvider converters10 = moduleDefinitionBuilder.getConverters();
            Boolean bool8 = bool4;
            AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), bool8));
            if (anyType12 == null) {
                cls5 = String.class;
                cls4 = cls8;
                anyType12 = new AnyType(new LazyKType(D.b(cls5), true, new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters10);
            } else {
                cls4 = cls8;
                cls5 = String.class;
            }
            AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool8));
            if (anyType13 == null) {
                cls6 = cls9;
                anyType13 = new AnyType(new LazyKType(D.b(cls3), true, new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = C7.q.f518c;
                        return D.h(Map.class, aVar.d(D.o(String.class)), aVar.d(D.o(Object.class)));
                    }
                }), converters10);
            } else {
                cls6 = cls9;
            }
            AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool8));
            if (anyType14 == null) {
                anyType14 = new AnyType(new LazyKType(D.b(cls3), true, new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = C7.q.f518c;
                        return D.h(Map.class, aVar.d(D.o(String.class)), aVar.d(D.f(Object.class)));
                    }
                }), converters10);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("presentFormAsync", new AsyncFunctionWithPromiseComponent("presentFormAsync", new AnyType[]{anyType12, anyType13, anyType14}, new Function2() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunctionWithPromise$6
                public final void invoke(Object[] objArr, Promise promise) throws IllegalAccessException, ContactManipulationInProgressException, MissingPermissionException, ContactNotFoundException, RemoteImageUriException, InstantiationException, IOException, InvocationTargetException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    Map map = (Map) obj4;
                    String str = (String) obj3;
                    this.this$0.ensureReadPermission();
                    if (this.this$0.contactManipulationPromise != null) {
                        throw new ContactManipulationInProgressException();
                    }
                    if (str != null) {
                        Contact contactById = this.this$0.getContactById(str, ContactsModuleKt.defaultFields);
                        if (contactById == null) {
                            throw new ContactNotFoundException();
                        }
                        this.this$0.presentEditForm(contactById, promise);
                    }
                    if (map != null) {
                        this.this$0.presentForm(this.this$0.mutateContact(null, map), promise);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) throws IllegalAccessException, ContactManipulationInProgressException, MissingPermissionException, ContactNotFoundException, RemoteImageUriException, InstantiationException, IOException, InvocationTargetException {
                    invoke((Object[]) obj3, (Promise) obj4);
                    return C2735B.f28704a;
                }
            }));
            Map<EventName, EventListener> eventListeners2 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName2 = EventName.ON_ACTIVITY_RESULT;
            eventListeners2.put(eventName2, new EventListenerWithSenderAndPayload(eventName2, new Function2() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$OnActivityResult$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) throws IOException {
                    invoke((Activity) obj3, (OnActivityResultPayload) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(Activity sender, OnActivityResultPayload payload) throws IOException {
                    Promise promise;
                    Uri data;
                    AbstractC2855l.g(sender, "sender");
                    AbstractC2855l.g(payload, "payload");
                    int requestCode = payload.getRequestCode();
                    int resultCode = payload.getResultCode();
                    Intent data2 = payload.getData();
                    if (requestCode == 2137 || requestCode == 2139) {
                        Promise promise2 = this.this$0.contactManipulationPromise;
                        if (promise2 == null) {
                            return;
                        }
                        promise2.resolve(0);
                        this.this$0.contactManipulationPromise = null;
                    }
                    if (requestCode != 2138 || (promise = this.this$0.contactPickingPromise) == null) {
                        return;
                    }
                    if (resultCode == -1) {
                        Contact contactById = this.this$0.getContactById((data2 == null || (data = data2.getData()) == null) ? null : data.getLastPathSegment(), ContactsModuleKt.defaultFields);
                        promise.resolve(contactById != null ? contactById.toMap(ContactsModuleKt.defaultFields) : null);
                    } else {
                        promise.resolve();
                    }
                    this.this$0.contactPickingPromise = null;
                }
            }));
            if (AbstractC2855l.b(Promise.class, Promise.class)) {
                intAsyncFunctionComponent6 = new AsyncFunctionWithPromiseComponent("presentContactPickerAsync", new AnyType[0], new Function2() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$25
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) throws ContactPickingInProgressException {
                        invoke((Object[]) obj3, (Promise) obj4);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) throws ContactPickingInProgressException {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        if (this.this$0.contactPickingPromise != null) {
                            throw new ContactPickingInProgressException();
                        }
                        Intent intent = new Intent("android.intent.action.PICK");
                        intent.setType("vnd.android.cursor.dir/contact");
                        this.this$0.contactPickingPromise = promise;
                        this.this$0.getCurrentActivity().startActivityForResult(intent, ContactsModuleKt.RC_PICK_CONTACT);
                    }
                });
            } else {
                TypeConverterProvider converters11 = moduleDefinitionBuilder.getConverters();
                AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Promise.class), bool5));
                if (anyType15 == null) {
                    anyType15 = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$26
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters11);
                }
                AnyType[] anyTypeArr8 = {anyType15};
                Function1 function18 = new Function1() { // from class: expo.modules.contacts.ContactsModule$definition$lambda$15$$inlined$AsyncFunction$27
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) throws ContactPickingInProgressException {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        if (this.this$0.contactPickingPromise != null) {
                            throw new ContactPickingInProgressException();
                        }
                        Intent intent = new Intent("android.intent.action.PICK");
                        intent.setType("vnd.android.cursor.dir/contact");
                        this.this$0.contactPickingPromise = promise;
                        this.this$0.getCurrentActivity().startActivityForResult(intent, ContactsModuleKt.RC_PICK_CONTACT);
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent6 = AbstractC2855l.b(obj2, cls7) ? new IntAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr8, function18) : AbstractC2855l.b(obj2, cls10) ? new BoolAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr8, function18) : AbstractC2855l.b(obj2, cls6) ? new DoubleAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr8, function18) : AbstractC2855l.b(obj2, cls4) ? new FloatAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr8, function18) : AbstractC2855l.b(obj2, cls5) ? new StringAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr8, function18) : new UntypedAsyncFunctionComponent("presentContactPickerAsync", anyTypeArr8, function18);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("presentContactPickerAsync", intAsyncFunctionComponent6);
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
