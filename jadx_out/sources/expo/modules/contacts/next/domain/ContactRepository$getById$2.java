package expo.modules.contacts.next.domain;

import R8.N;
import R8.O;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.contact.ExistingContact;
import expo.modules.contacts.next.domain.query.QueryAggregator;
import expo.modules.contacts.next.domain.query.QueryBuilder;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import expo.modules.contacts.next.extensions.CursorExtensionsKt;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.contacts.next.domain.ContactRepository$getById$2", f = "ContactRepository.kt", l = {162, 173}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "<anonymous>", "(LR8/N;)Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;"}, k = 3, mv = {2, 1, 0})
final class ContactRepository$getById$2 extends l implements Function2 {
    final /* synthetic */ String $contactId;
    final /* synthetic */ Set<ExtractableField<?>> $extractableFields;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContactRepository$getById$2(Set<? extends ExtractableField<?>> set, ContactRepository contactRepository, String str, n7.f fVar) {
        super(2, fVar);
        this.$extractableFields = set;
        this.this$0 = contactRepository;
        this.$contactId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        ContactRepository$getById$2 contactRepository$getById$2 = new ContactRepository$getById$2(this.$extractableFields, this.this$0, this.$contactId, fVar);
        contactRepository$getById$2.L$0 = obj;
        return contactRepository$getById$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((ContactRepository$getById$2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff A[Catch: all -> 0x0109, LOOP:0: B:27:0x00f9->B:29:0x00ff, LOOP_END, TryCatch #2 {all -> 0x0109, blocks: (B:26:0x00eb, B:27:0x00f9, B:29:0x00ff, B:32:0x010c), top: B:50:0x00eb }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        N n10;
        QueryAggregator queryAggregator;
        QueryBuilder queryBuilder;
        Object objSafeQuery$default;
        Closeable closeable;
        Object objSafeQuery$default2;
        N n11;
        List<ExistingContact> listBuildContacts;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                n10 = (N) this.L$0;
                queryAggregator = new QueryAggregator(this.$extractableFields);
                queryBuilder = new QueryBuilder(this.$extractableFields);
                ContentResolver contentResolver = this.this$0.getContentResolver();
                Uri CONTENT_URI = ContactsContract.Contacts.CONTENT_URI;
                AbstractC2855l.f(CONTENT_URI, "CONTENT_URI");
                String[] strArrBuildContactsProjection = queryBuilder.buildContactsProjection();
                String[] strArr = {this.$contactId};
                this.L$0 = n10;
                this.L$1 = queryAggregator;
                this.L$2 = queryBuilder;
                this.label = 1;
                objSafeQuery$default = ContentResolverExtensionsKt.safeQuery$default(contentResolver, CONTENT_URI, strArrBuildContactsProjection, "_id = ?", strArr, null, this, 16, null);
                if (objSafeQuery$default != objE) {
                }
                return objE;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                QueryAggregator queryAggregator2 = (QueryAggregator) this.L$1;
                n11 = (N) this.L$0;
                AbstractC2753p.b(obj);
                queryAggregator = queryAggregator2;
                objSafeQuery$default2 = obj;
                closeable = (Closeable) objSafeQuery$default2;
                try {
                    Cursor cursor = (Cursor) closeable;
                    O.d(n11);
                    for (Cursor cursor2 : CursorExtensionsKt.asSequence(cursor)) {
                        queryAggregator.aggregateDataRow(cursor);
                    }
                    C2735B c2735b = C2735B.f28704a;
                    AbstractC3376c.a(closeable, null);
                    listBuildContacts = queryAggregator.buildContacts();
                    if (listBuildContacts.isEmpty()) {
                        return listBuildContacts.get(0);
                    }
                    return null;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            QueryBuilder queryBuilder2 = (QueryBuilder) this.L$2;
            QueryAggregator queryAggregator3 = (QueryAggregator) this.L$1;
            N n12 = (N) this.L$0;
            AbstractC2753p.b(obj);
            queryBuilder = queryBuilder2;
            queryAggregator = queryAggregator3;
            n10 = n12;
            objSafeQuery$default = obj;
            Cursor cursor3 = (Cursor) closeable;
            for (Cursor cursor4 : CursorExtensionsKt.asSequence(cursor3)) {
                queryAggregator.aggregateContactsRow(cursor3);
            }
            C2735B c2735b2 = C2735B.f28704a;
            AbstractC3376c.a(closeable, null);
            ContentResolver contentResolver2 = this.this$0.getContentResolver();
            Uri CONTENT_URI2 = ContactsContract.Data.CONTENT_URI;
            AbstractC2855l.f(CONTENT_URI2, "CONTENT_URI");
            String[] strArrBuildDataProjection = queryBuilder.buildDataProjection();
            String strBuildSelection = queryBuilder.buildSelection(AbstractC2800q.e(ContactId.m129boximpl(this.$contactId)));
            String[] strArrBuildSelectionArgs = queryBuilder.buildSelectionArgs(AbstractC2800q.e(ContactId.m129boximpl(this.$contactId)));
            this.L$0 = n10;
            this.L$1 = queryAggregator;
            this.L$2 = null;
            this.label = 2;
            objSafeQuery$default2 = ContentResolverExtensionsKt.safeQuery$default(contentResolver2, CONTENT_URI2, strArrBuildDataProjection, strBuildSelection, strArrBuildSelectionArgs, null, this, 16, null);
            if (objSafeQuery$default2 != objE) {
                n11 = n10;
                closeable = (Closeable) objSafeQuery$default2;
                Cursor cursor5 = (Cursor) closeable;
                O.d(n11);
                while (r1.hasNext()) {
                }
                C2735B c2735b3 = C2735B.f28704a;
                AbstractC3376c.a(closeable, null);
                listBuildContacts = queryAggregator.buildContacts();
                if (listBuildContacts.isEmpty()) {
                }
            }
            return objE;
        } catch (Throwable th2) {
            try {
                throw th2;
            } finally {
            }
        }
        closeable = (Closeable) objSafeQuery$default;
    }
}
