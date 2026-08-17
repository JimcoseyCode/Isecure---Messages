package expo.modules.contacts.next.domain.query;

import B7.d;
import android.database.Cursor;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.contact.ExistingContact;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import j7.AbstractC2800q;
import j7.K;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011R\u001e\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a¨\u0006\u001f"}, d2 = {"Lexpo/modules/contacts/next/domain/query/QueryAggregator;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/model/ExtractableField;", "extractableFields", "<init>", "(Ljava/util/Collection;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "getContactIdsFromBuilders", "()Ljava/util/List;", "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "buildContacts", "Landroid/database/Cursor;", "cursor", "Li7/B;", "aggregateDataRow", "(Landroid/database/Cursor;)V", "aggregateContactsRow", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "contactsExtractableFields", "Ljava/util/List;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "dataExtractorsByMimeType", "Ljava/util/Map;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/query/ContactModelBuilder;", "contactBuilders", "Companion", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryAggregator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, ContactModelBuilder> contactBuilders;
    private final List<ExtractableField.Contacts<?>> contactsExtractableFields;
    private final Map<String, ExtractableField.Data<?>> dataExtractorsByMimeType;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000bJ-\u0010\f\u001a\u0004\u0018\u0001H\u0006\"\b\b\u0000\u0010\u0006*\u00020\r2\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000e¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/contacts/next/domain/query/QueryAggregator$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "aggregateOneField", PointerEventHelper.POINTER_TYPE_UNKNOWN, "T", "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "cursor", "Landroid/database/Cursor;", "extractor", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "aggregateOneFieldFromContacts", "Lexpo/modules/contacts/next/domain/model/Extractable;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "(Landroid/database/Cursor;Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;)Lexpo/modules/contacts/next/domain/model/Extractable;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends Extractable.Data> List<T> aggregateOneField(Cursor cursor, ExtractableField.Data<T> extractor) {
            AbstractC2855l.g(cursor, "cursor");
            AbstractC2855l.g(extractor, "extractor");
            List listC = AbstractC2800q.c();
            while (cursor.moveToNext()) {
                listC.add(extractor.extract(cursor));
            }
            return AbstractC2800q.a(listC);
        }

        public final <T extends Extractable> T aggregateOneFieldFromContacts(Cursor cursor, ExtractableField.Contacts<T> extractor) {
            AbstractC2855l.g(cursor, "cursor");
            AbstractC2855l.g(extractor, "extractor");
            if (cursor.moveToFirst()) {
                return extractor.extract(cursor);
            }
            return null;
        }

        private Companion() {
        }
    }

    public QueryAggregator(Collection<? extends ExtractableField<?>> extractableFields) {
        AbstractC2855l.g(extractableFields, "extractableFields");
        ArrayList arrayList = new ArrayList();
        for (Object obj : extractableFields) {
            if (obj instanceof ExtractableField.Contacts) {
                arrayList.add(obj);
            }
        }
        this.contactsExtractableFields = arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : extractableFields) {
            if (obj2 instanceof ExtractableField.Data) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d.d(K.e(AbstractC2800q.u(arrayList2, 10)), 16));
        for (Object obj3 : arrayList2) {
            linkedHashMap.put(((ExtractableField.Data) obj3).getMimeType(), obj3);
        }
        this.dataExtractorsByMimeType = linkedHashMap;
        this.contactBuilders = new LinkedHashMap();
    }

    public final void aggregateContactsRow(Cursor cursor) {
        AbstractC2855l.g(cursor, "cursor");
        String string = cursor.getString(cursor.getColumnIndexOrThrow("_id"));
        Map<String, ContactModelBuilder> map = this.contactBuilders;
        ContactModelBuilder contactModelBuilder = map.get(string);
        if (contactModelBuilder == null) {
            AbstractC2855l.d(string);
            contactModelBuilder = new ContactModelBuilder(ContactId.m130constructorimpl(string), null);
            map.put(string, contactModelBuilder);
        }
        ContactModelBuilder contactModelBuilder2 = contactModelBuilder;
        Iterator<T> it = this.contactsExtractableFields.iterator();
        while (it.hasNext()) {
            contactModelBuilder2.addModel(((ExtractableField.Contacts) it.next()).extract(cursor));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void aggregateDataRow(Cursor cursor) {
        AbstractC2855l.g(cursor, "cursor");
        String string = cursor.getString(cursor.getColumnIndexOrThrow("contact_id"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(Columns.MIMETYPE));
        Map<String, ContactModelBuilder> map = this.contactBuilders;
        ContactModelBuilder contactModelBuilder = map.get(string);
        Object[] objArr = 0;
        if (contactModelBuilder == null) {
            AbstractC2855l.d(string);
            contactModelBuilder = new ContactModelBuilder(ContactId.m130constructorimpl(string), objArr == true ? 1 : 0);
            map.put(string, contactModelBuilder);
        }
        ContactModelBuilder contactModelBuilder2 = contactModelBuilder;
        ExtractableField.Data<?> data = this.dataExtractorsByMimeType.get(string2);
        Extractable.Data data2 = data != null ? (Extractable.Data) data.extract(cursor) : null;
        if (data2 != null) {
            contactModelBuilder2.addModel(data2);
        }
    }

    public final List<ExistingContact> buildContacts() {
        Collection<ContactModelBuilder> collectionValues = this.contactBuilders.values();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((ContactModelBuilder) it.next()).build());
        }
        return arrayList;
    }

    public final List<ContactId> getContactIdsFromBuilders() {
        Set<String> setKeySet = this.contactBuilders.keySet();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(ContactId.m129boximpl(ContactId.m130constructorimpl((String) it.next())));
        }
        return arrayList;
    }
}
