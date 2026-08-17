package expo.modules.contacts.next.domain.query;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import j7.T;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0003J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lexpo/modules/contacts/next/domain/query/QueryBuilder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "extractableFields", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/model/ExtractableField;", "<init>", "(Ljava/util/Collection;)V", "dataExtractableFields", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "contactsExtractableFields", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "buildContactsProjection", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "()[Ljava/lang/String;", "buildDataProjection", "buildSelection", "contactIds", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "buildSelectionArgs", "(Ljava/util/Collection;)[Ljava/lang/String;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryBuilder {
    private final List<ExtractableField.Contacts<?>> contactsExtractableFields;
    private final List<ExtractableField.Data<?>> dataExtractableFields;

    public QueryBuilder(Collection<? extends ExtractableField<?>> extractableFields) {
        AbstractC2855l.g(extractableFields, "extractableFields");
        ArrayList arrayList = new ArrayList();
        for (Object obj : extractableFields) {
            if (obj instanceof ExtractableField.Data) {
                arrayList.add(obj);
            }
        }
        this.dataExtractableFields = arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : extractableFields) {
            if (obj2 instanceof ExtractableField.Contacts) {
                arrayList2.add(obj2);
            }
        }
        this.contactsExtractableFields = arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String buildSelection$default(QueryBuilder queryBuilder, Collection collection, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            collection = null;
        }
        return queryBuilder.buildSelection(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence buildSelection$lambda$3(String it) {
        AbstractC2855l.g(it, "it");
        return "?";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence buildSelection$lambda$4(String it) {
        AbstractC2855l.g(it, "it");
        return "(" + it + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String[] buildSelectionArgs$default(QueryBuilder queryBuilder, Collection collection, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            collection = null;
        }
        return queryBuilder.buildSelectionArgs(collection);
    }

    public final String[] buildContactsProjection() {
        List listE = AbstractC2800q.e("_id");
        List<ExtractableField.Contacts<?>> list = this.contactsExtractableFields;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC2800q.A(arrayList, AbstractC2793j.v0(((ExtractableField.Contacts) it.next()).getProjection()));
        }
        return (String[]) T.k(AbstractC2800q.T0(arrayList), listE).toArray(new String[0]);
    }

    public final String[] buildDataProjection() {
        List listM = AbstractC2800q.m("contact_id", "_id", Columns.MIMETYPE);
        List<ExtractableField.Data<?>> list = this.dataExtractableFields;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC2800q.A(arrayList, AbstractC2793j.v0(((ExtractableField.Data) it.next()).getProjection()));
        }
        return (String[]) T.k(AbstractC2800q.T0(arrayList), listM).toArray(new String[0]);
    }

    public final String buildSelection(Collection<ContactId> contactIds) {
        ArrayList arrayList = new ArrayList();
        List<ExtractableField.Data<?>> list = this.dataExtractableFields;
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ExtractableField.Data) it.next()).getMimeType());
        }
        Set setT0 = AbstractC2800q.T0(arrayList2);
        if (!setT0.isEmpty()) {
            arrayList.add("mimetype IN (" + AbstractC2800q.o0(setT0, ", ", null, null, 0, null, new Function1() { // from class: expo.modules.contacts.next.domain.query.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return QueryBuilder.buildSelection$lambda$3((String) obj);
                }
            }, 30, null) + ")");
        }
        if (contactIds != null) {
            arrayList.add("contact_id IN (" + AbstractC2800q.o0(contactIds, ", ", null, null, 0, null, new Function1() { // from class: expo.modules.contacts.next.domain.query.QueryBuilder$buildSelection$idPlaceholders$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return m118invokekDnipiQ(((ContactId) obj).m135unboximpl());
                }

                /* JADX INFO: renamed from: invoke-kDnipiQ, reason: not valid java name */
                public final CharSequence m118invokekDnipiQ(String it2) {
                    AbstractC2855l.g(it2, "it");
                    return "?";
                }
            }, 30, null) + ")");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return AbstractC2800q.o0(arrayList, " AND ", null, null, 0, null, new Function1() { // from class: expo.modules.contacts.next.domain.query.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QueryBuilder.buildSelection$lambda$4((String) obj);
            }
        }, 30, null);
    }

    public final String[] buildSelectionArgs(Collection<ContactId> contactIds) {
        List<ExtractableField.Data<?>> list = this.dataExtractableFields;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ExtractableField.Data) it.next()).getMimeType());
        }
        String[] strArr = (String[]) AbstractC2800q.T0(arrayList).toArray(new String[0]);
        if (contactIds == null || contactIds.isEmpty()) {
            return strArr;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(contactIds, 10));
        Iterator<T> it2 = contactIds.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ContactId) it2.next()).m135unboximpl());
        }
        return (String[]) AbstractC2793j.t(strArr, (String[]) arrayList2.toArray(new String[0]));
    }
}
