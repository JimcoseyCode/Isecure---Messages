package expo.modules.contacts.next.domain;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.J;
import R8.N;
import R8.O;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.model.contact.ContactPatch;
import expo.modules.contacts.next.domain.model.contact.NewContact;
import expo.modules.contacts.next.domain.model.contact.UpdateContact;
import expo.modules.contacts.next.domain.query.QueryAggregator;
import expo.modules.contacts.next.domain.query.QueryBuilder;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import expo.modules.contacts.next.extensions.CursorExtensionsKt;
import expo.modules.contacts.next.records.SortOrder;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0086@¢\u0006\u0004\b#\u0010$J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&H\u0086@¢\u0006\u0004\b\u001c\u0010(J\u0018\u0010+\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\fH\u0086@¢\u0006\u0004\b*\u0010\u001fJF\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010,2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00102\u001a\u0004\u0018\u000101H\u0086@¢\u0006\u0004\b3\u00104J,\u00109\u001a\u0004\u0018\u0001062\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003050\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b7\u00108JX\u0010;\u001a\b\u0012\u0004\u0012\u0002060:2\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003050\b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010,2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00102\u001a\u0004\u0018\u000101H\u0086@¢\u0006\u0004\b;\u0010<J6\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010>*\u00020=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b@\u0010AJ2\u0010G\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010>*\u00020C2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000D2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\bE\u0010FJ\u0010\u0010H\u001a\u00020,H\u0086@¢\u0006\u0004\bH\u0010IJ\u001a\u0010K\u001a\u0004\u0018\u00010/2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\bJ\u0010\u001fJ\u001a\u0010N\u001a\u0004\u0018\u00010L2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\bM\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010Q¨\u0006R"}, d2 = {"Lexpo/modules/contacts/next/domain/ContactRepository;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/content/ContentResolver;", "contentResolver", "<init>", "(Landroid/content/ContentResolver;)V", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "contactId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "extractableFields", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "getDataIds-0xh38yw", "(Ljava/lang/String;Ljava/util/Set;Ln7/f;)Ljava/lang/Object;", "getDataIds", "Lexpo/modules/contacts/next/domain/model/contact/NewContact;", "contact", "insert-Hoartsk", "(Lexpo/modules/contacts/next/domain/model/contact/NewContact;Ln7/f;)Ljava/lang/Object;", "insert", "Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;", "contactPatch", PointerEventHelper.POINTER_TYPE_UNKNOWN, "patch", "(Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;", "updateContact", "update", "(Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;Ln7/f;)Ljava/lang/Object;", "delete-D2TBaGg", "(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "delete", "Lexpo/modules/contacts/next/domain/model/Appendable;", "appendable", "append-4zbj8jY", "(Lexpo/modules/contacts/next/domain/model/Appendable;Ln7/f;)Ljava/lang/Object;", "append", "Lexpo/modules/contacts/next/domain/model/Updatable;", "updatable", "(Lexpo/modules/contacts/next/domain/model/Updatable;Ln7/f;)Ljava/lang/Object;", "dataId", "deleteFieldEntry-bM46d30", "deleteFieldEntry", PointerEventHelper.POINTER_TYPE_UNKNOWN, "limit", "offset", PointerEventHelper.POINTER_TYPE_UNKNOWN, "searchedDisplayName", "Lexpo/modules/contacts/next/records/SortOrder;", "sortOrder", "getAllIds", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/contacts/next/domain/model/ExtractableField;", "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "getById-m7AL99Q", "(Ljava/util/Set;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "getById", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getAllPaginated", "(Ljava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "T", "extractableField", "getFieldFromData-m7AL99Q", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "getFieldFromData", "Lexpo/modules/contacts/next/domain/model/Extractable;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "getFieldFromContacts-m7AL99Q", "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "getFieldFromContacts", "getCount", "(Ln7/f;)Ljava/lang/Object;", "getLookupKey-D2TBaGg", "getLookupKey", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "getRawContactId-K3SHF88", "getRawContactId", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactRepository {
    private final ContentResolver contentResolver;

    /* JADX INFO: renamed from: expo.modules.contacts.next.domain.ContactRepository$getAllIds$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.domain.ContactRepository$getAllIds$2", f = "ContactRepository.kt", l = {137}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "<anonymous>", "(LR8/N;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ Integer $limit;
        final /* synthetic */ Integer $offset;
        final /* synthetic */ String $searchedDisplayName;
        final /* synthetic */ SortOrder $sortOrder;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, SortOrder sortOrder, Integer num, Integer num2, n7.f fVar) {
            super(2, fVar);
            this.$searchedDisplayName = str;
            this.$sortOrder = sortOrder;
            this.$offset = num;
            this.$limit = num2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$3$lambda$2(Cursor cursor) {
            return cursor.getString(cursor.getColumnIndexOrThrow("_id"));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            AnonymousClass2 anonymousClass2 = ContactRepository.this.new AnonymousClass2(this.$searchedDisplayName, this.$sortOrder, this.$offset, this.$limit, fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            String[] strArr;
            AnonymousClass2 anonymousClass2;
            N n10;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                N n11 = (N) this.L$0;
                ContentResolver contentResolver = ContactRepository.this.getContentResolver();
                Uri CONTENT_URI = ContactsContract.Contacts.CONTENT_URI;
                AbstractC2855l.f(CONTENT_URI, "CONTENT_URI");
                String[] strArr2 = {"_id"};
                String str = this.$searchedDisplayName;
                String str2 = str != null ? "display_name LIKE ?" : null;
                if (str != null) {
                    strArr = new String[]{"%" + str + "%"};
                } else {
                    strArr = null;
                }
                SortOrder sortOrder = this.$sortOrder;
                String column = sortOrder != null ? sortOrder.toColumn() : null;
                this.L$0 = n11;
                this.label = 1;
                anonymousClass2 = this;
                Object objSafeQuery = ContentResolverExtensionsKt.safeQuery(contentResolver, CONTENT_URI, strArr2, str2, strArr, column, anonymousClass2);
                if (objSafeQuery == objE) {
                    return objE;
                }
                n10 = n11;
                obj = objSafeQuery;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n10 = (N) this.L$0;
                AbstractC2753p.b(obj);
                anonymousClass2 = this;
            }
            Closeable closeable = (Closeable) obj;
            Integer num = anonymousClass2.$offset;
            Integer num2 = anonymousClass2.$limit;
            try {
                Cursor cursor = (Cursor) closeable;
                O.d(n10);
                cursor.moveToPosition((num != null ? num.intValue() : 0) - 1);
                List listS = O8.l.S(O8.l.J(O8.l.J(O8.l.P(CursorExtensionsKt.asSequence(cursor), num2 != null ? num2.intValue() : ViewDefaults.NUMBER_OF_LINES), new Function1() { // from class: expo.modules.contacts.next.domain.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ContactRepository.AnonymousClass2.invokeSuspend$lambda$3$lambda$2((Cursor) obj2);
                    }
                }), new Function1() { // from class: expo.modules.contacts.next.domain.ContactRepository$getAllIds$2$3$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        return ContactId.m129boximpl(m50invokeOAciUqU((String) obj2));
                    }

                    /* JADX INFO: renamed from: invoke-OAciUqU, reason: not valid java name */
                    public final String m50invokeOAciUqU(String str3) {
                        AbstractC2855l.d(str3);
                        return ContactId.m130constructorimpl(str3);
                    }
                }));
                AbstractC3376c.a(closeable, null);
                return listS;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: expo.modules.contacts.next.domain.ContactRepository$getAllPaginated$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.domain.ContactRepository$getAllPaginated$2", f = "ContactRepository.kt", l = {197, JfifUtil.MARKER_EOI}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "<anonymous>", "(LR8/N;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    static final class C24642 extends l implements Function2 {
        final /* synthetic */ Set<ExtractableField<?>> $extractableFields;
        final /* synthetic */ Integer $limit;
        final /* synthetic */ Integer $offset;
        final /* synthetic */ String $searchedDisplayName;
        final /* synthetic */ SortOrder $sortOrder;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ ContactRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C24642(Set<? extends ExtractableField<?>> set, ContactRepository contactRepository, String str, SortOrder sortOrder, Integer num, Integer num2, n7.f fVar) {
            super(2, fVar);
            this.$extractableFields = set;
            this.this$0 = contactRepository;
            this.$searchedDisplayName = str;
            this.$sortOrder = sortOrder;
            this.$limit = num;
            this.$offset = num2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            C24642 c24642 = new C24642(this.$extractableFields, this.this$0, this.$searchedDisplayName, this.$sortOrder, this.$limit, this.$offset, fVar);
            c24642.L$0 = obj;
            return c24642;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24642) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0157 A[Catch: all -> 0x0161, LOOP:0: B:55:0x0151->B:57:0x0157, LOOP_END, TryCatch #0 {all -> 0x0161, blocks: (B:54:0x0143, B:55:0x0151, B:57:0x0157, B:60:0x0164), top: B:71:0x0143 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws IOException {
            N n10;
            QueryAggregator queryAggregator;
            QueryBuilder queryBuilder;
            int i10;
            String[] strArr;
            Object objSafeQuery;
            Closeable closeable;
            Integer num;
            Integer num2;
            Object objSafeQuery$default;
            N n11;
            Object objE = AbstractC3016b.e();
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    AbstractC2753p.b(obj);
                    n10 = (N) this.L$0;
                    queryAggregator = new QueryAggregator(this.$extractableFields);
                    queryBuilder = new QueryBuilder(this.$extractableFields);
                    ContentResolver contentResolver = this.this$0.getContentResolver();
                    Uri CONTENT_URI = ContactsContract.Contacts.CONTENT_URI;
                    AbstractC2855l.f(CONTENT_URI, "CONTENT_URI");
                    String[] strArrBuildContactsProjection = queryBuilder.buildContactsProjection();
                    String str = this.$searchedDisplayName;
                    String str2 = str != null ? "display_name LIKE ?" : null;
                    if (str != null) {
                        i10 = 0;
                        strArr = new String[]{"%" + str + "%"};
                    } else {
                        i10 = 0;
                        strArr = null;
                    }
                    SortOrder sortOrder = this.$sortOrder;
                    String column = sortOrder != null ? sortOrder.toColumn() : null;
                    this.L$0 = n10;
                    this.L$1 = queryAggregator;
                    this.L$2 = queryBuilder;
                    this.label = 1;
                    objSafeQuery = ContentResolverExtensionsKt.safeQuery(contentResolver, CONTENT_URI, strArrBuildContactsProjection, str2, strArr, column, this);
                    if (objSafeQuery != objE) {
                    }
                    return objE;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    QueryAggregator queryAggregator2 = (QueryAggregator) this.L$1;
                    n11 = (N) this.L$0;
                    AbstractC2753p.b(obj);
                    queryAggregator = queryAggregator2;
                    objSafeQuery$default = obj;
                    closeable = (Closeable) objSafeQuery$default;
                    try {
                        Cursor cursor = (Cursor) closeable;
                        O.d(n11);
                        for (Cursor cursor2 : CursorExtensionsKt.asSequence(cursor)) {
                            queryAggregator.aggregateDataRow(cursor);
                        }
                        C2735B c2735b = C2735B.f28704a;
                        AbstractC3376c.a(closeable, null);
                        return queryAggregator.buildContacts();
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
                i10 = 0;
                objSafeQuery = obj;
                Cursor cursor3 = (Cursor) closeable;
                O.d(n10);
                cursor3.moveToPosition((num != null ? num.intValue() : i10) - 1);
                for (Cursor cursor4 : O8.l.P(CursorExtensionsKt.asSequence(cursor3), num2 != null ? num2.intValue() : ViewDefaults.NUMBER_OF_LINES)) {
                    queryAggregator.aggregateContactsRow(cursor3);
                }
                C2735B c2735b2 = C2735B.f28704a;
                AbstractC3376c.a(closeable, null);
                List<ContactId> contactIdsFromBuilders = (this.$limit == null && this.$offset == null && this.$searchedDisplayName == null) ? null : queryAggregator.getContactIdsFromBuilders();
                ContentResolver contentResolver2 = this.this$0.getContentResolver();
                Uri CONTENT_URI2 = ContactsContract.Data.CONTENT_URI;
                AbstractC2855l.f(CONTENT_URI2, "CONTENT_URI");
                String[] strArrBuildDataProjection = queryBuilder.buildDataProjection();
                String strBuildSelection = queryBuilder.buildSelection(contactIdsFromBuilders);
                String[] strArrBuildSelectionArgs = queryBuilder.buildSelectionArgs(contactIdsFromBuilders);
                this.L$0 = n10;
                this.L$1 = queryAggregator;
                this.L$2 = null;
                this.label = 2;
                objSafeQuery$default = ContentResolverExtensionsKt.safeQuery$default(contentResolver2, CONTENT_URI2, strArrBuildDataProjection, strBuildSelection, strArrBuildSelectionArgs, null, this, 16, null);
                if (objSafeQuery$default != objE) {
                    n11 = n10;
                    closeable = (Closeable) objSafeQuery$default;
                    Cursor cursor5 = (Cursor) closeable;
                    O.d(n11);
                    while (r1.hasNext()) {
                    }
                    C2735B c2735b3 = C2735B.f28704a;
                    AbstractC3376c.a(closeable, null);
                    return queryAggregator.buildContacts();
                }
                return objE;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
            closeable = (Closeable) objSafeQuery;
            num = this.$offset;
            num2 = this.$limit;
        }
    }

    /* JADX INFO: renamed from: expo.modules.contacts.next.domain.ContactRepository$getCount$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.domain.ContactRepository$getCount$2", f = "ContactRepository.kt", l = {262}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<anonymous>", "(LR8/N;)I"}, k = 3, mv = {2, 1, 0})
    static final class C24652 extends l implements Function2 {
        private /* synthetic */ Object L$0;
        int label;

        C24652(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            C24652 c24652 = ContactRepository.this.new C24652(fVar);
            c24652.L$0 = obj;
            return c24652;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24652) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            N n10;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                N n11 = (N) this.L$0;
                ContentResolver contentResolver = ContactRepository.this.getContentResolver();
                Uri CONTENT_URI = ContactsContract.Contacts.CONTENT_URI;
                AbstractC2855l.f(CONTENT_URI, "CONTENT_URI");
                this.L$0 = n11;
                this.label = 1;
                Object objSafeQuery$default = ContentResolverExtensionsKt.safeQuery$default(contentResolver, CONTENT_URI, new String[]{"_id"}, null, null, null, this, 28, null);
                if (objSafeQuery$default == objE) {
                    return objE;
                }
                n10 = n11;
                obj = objSafeQuery$default;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n10 = (N) this.L$0;
                AbstractC2753p.b(obj);
            }
            Closeable closeable = (Closeable) obj;
            try {
                O.d(n10);
                Integer numC = kotlin.coroutines.jvm.internal.b.c(((Cursor) closeable).getCount());
                AbstractC3376c.a(closeable, null);
                return numC;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: expo.modules.contacts.next.domain.ContactRepository$patch$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.domain.ContactRepository$patch$2", f = "ContactRepository.kt", l = {49, 57}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<anonymous>", "(LR8/N;)Z"}, k = 3, mv = {2, 1, 0})
    static final class C24662 extends l implements Function2 {
        final /* synthetic */ ContactPatch $contactPatch;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ ContactRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24662(ContactPatch contactPatch, ContactRepository contactRepository, n7.f fVar) {
            super(2, fVar);
            this.$contactPatch = contactPatch;
            this.this$0 = contactRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new C24662(this.$contactPatch, this.this$0, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24662) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00fb, code lost:
        
            if (expo.modules.contacts.next.extensions.ContentResolverExtensionsKt.safeApplyBatch(r10, "com.android.contacts", (java.util.List<? extends android.content.ContentProviderOperation>) r6, r9) == r0) goto L30;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List listR0;
            Set setT0;
            List list;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                listR0 = AbstractC2800q.R0(this.$contactPatch.toPatchOperations());
                List<Updatable> toUpdate = this.$contactPatch.getToUpdate();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : toUpdate) {
                    if (obj2 instanceof Updatable.Data) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(DataId.m136boximpl(((Updatable.Data) it.next()).getDataId()));
                }
                setT0 = AbstractC2800q.T0(arrayList2);
                ContactRepository contactRepository = this.this$0;
                String strM58getContactIdS9XCBSM = this.$contactPatch.m58getContactIdS9XCBSM();
                Set<ExtractableField.Data<?>> modifiedFields = this.$contactPatch.getModifiedFields();
                this.L$0 = listR0;
                this.L$1 = setT0;
                this.L$2 = listR0;
                this.label = 1;
                obj = contactRepository.m40getDataIds0xh38yw(strM58getContactIdS9XCBSM, modifiedFields, this);
                if (obj != objE) {
                    list = listR0;
                }
                return objE;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(true);
            }
            listR0 = (List) this.L$2;
            setT0 = (Set) this.L$1;
            list = (List) this.L$0;
            AbstractC2753p.b(obj);
            List listV0 = AbstractC2800q.v0((Iterable) obj, setT0);
            ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(listV0, 10));
            Iterator it2 = listV0.iterator();
            while (it2.hasNext()) {
                ContentProviderOperation contentProviderOperationBuild = ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("_id = ?", new String[]{((DataId) it2.next()).m142unboximpl()}).build();
                AbstractC2855l.f(contentProviderOperationBuild, "build(...)");
                arrayList3.add(contentProviderOperationBuild);
            }
            listR0.addAll(arrayList3);
            ContentResolver contentResolver = this.this$0.getContentResolver();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        }
    }

    /* JADX INFO: renamed from: expo.modules.contacts.next.domain.ContactRepository$update$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.domain.ContactRepository", f = "ContactRepository.kt", l = {97}, m = "update")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return ContactRepository.this.update((UpdateContact) null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.contacts.next.domain.ContactRepository$update$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.domain.ContactRepository$update$3", f = "ContactRepository.kt", l = {119}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<anonymous>", "(LR8/N;)Z"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass3 extends l implements Function2 {
        final /* synthetic */ Updatable $updatable;
        int label;
        final /* synthetic */ ContactRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Updatable updatable, ContactRepository contactRepository, n7.f fVar) {
            super(2, fVar);
            this.$updatable = updatable;
            this.this$0 = contactRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new AnonymousClass3(this.$updatable, this.this$0, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass3) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                ContentProviderOperation updateOperation = this.$updatable.toUpdateOperation();
                ContentResolver contentResolver = this.this$0.getContentResolver();
                this.label = 1;
                if (ContentResolverExtensionsKt.safeApplyBatch(contentResolver, "com.android.contacts", updateOperation, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            return kotlin.coroutines.jvm.internal.b.a(true);
        }
    }

    public ContactRepository(ContentResolver contentResolver) {
        AbstractC2855l.g(contentResolver, "contentResolver");
        this.contentResolver = contentResolver;
    }

    public static /* synthetic */ Object getAllIds$default(ContactRepository contactRepository, Integer num, Integer num2, String str, SortOrder sortOrder, n7.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            num2 = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            sortOrder = SortOrder.UserDefault;
        }
        return contactRepository.getAllIds(num, num2, str, sortOrder, fVar);
    }

    public static /* synthetic */ Object getAllPaginated$default(ContactRepository contactRepository, Set set, Integer num, Integer num2, String str, SortOrder sortOrder, n7.f fVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        if ((i10 & 8) != 0) {
            str = null;
        }
        if ((i10 & 16) != 0) {
            sortOrder = null;
        }
        return contactRepository.getAllPaginated(set, num, num2, str, sortOrder, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getDataIds-0xh38yw, reason: not valid java name */
    public final Object m40getDataIds0xh38yw(String str, Set<? extends ExtractableField.Data<?>> set, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new ContactRepository$getDataIds$2(set, this, str, null), fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: append-4zbj8jY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m41append4zbj8jY(Appendable appendable, n7.f fVar) {
        ContactRepository$append$1 contactRepository$append$1;
        if (fVar instanceof ContactRepository$append$1) {
            contactRepository$append$1 = (ContactRepository$append$1) fVar;
            int i10 = contactRepository$append$1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                contactRepository$append$1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                contactRepository$append$1 = new ContactRepository$append$1(this, fVar);
            }
        }
        Object objG = contactRepository$append$1.result;
        Object objE = AbstractC3016b.e();
        int i11 = contactRepository$append$1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objG);
            J jB = C1404d0.b();
            ContactRepository$append$2 contactRepository$append$2 = new ContactRepository$append$2(appendable, this, null);
            contactRepository$append$1.label = 1;
            objG = AbstractC1413i.g(jB, contactRepository$append$2, contactRepository$append$1);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objG);
        }
        return ((DataId) objG).m142unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: delete-D2TBaGg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m42deleteD2TBaGg(String str, n7.f fVar) {
        ContactRepository$delete$1 contactRepository$delete$1;
        if (fVar instanceof ContactRepository$delete$1) {
            contactRepository$delete$1 = (ContactRepository$delete$1) fVar;
            int i10 = contactRepository$delete$1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                contactRepository$delete$1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                contactRepository$delete$1 = new ContactRepository$delete$1(this, fVar);
            }
        }
        Object objSafeDelete = contactRepository$delete$1.result;
        Object objE = AbstractC3016b.e();
        int i11 = contactRepository$delete$1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objSafeDelete);
            ContentResolver contentResolver = this.contentResolver;
            Uri CONTENT_URI = ContactsContract.RawContacts.CONTENT_URI;
            AbstractC2855l.f(CONTENT_URI, "CONTENT_URI");
            contactRepository$delete$1.label = 1;
            objSafeDelete = ContentResolverExtensionsKt.safeDelete(contentResolver, CONTENT_URI, "contact_id = ?", new String[]{str}, contactRepository$delete$1);
            if (objSafeDelete == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objSafeDelete);
        }
        return kotlin.coroutines.jvm.internal.b.a(((Number) objSafeDelete).intValue() > 0);
    }

    /* JADX INFO: renamed from: deleteFieldEntry-bM46d30, reason: not valid java name */
    public final Object m43deleteFieldEntrybM46d30(String str, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new ContactRepository$deleteFieldEntry$2(str, this, null), fVar);
    }

    public final Object getAllIds(Integer num, Integer num2, String str, SortOrder sortOrder, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(str, sortOrder, num2, num, null), fVar);
    }

    public final Object getAllPaginated(Set<? extends ExtractableField<?>> set, Integer num, Integer num2, String str, SortOrder sortOrder, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new C24642(set, this, str, sortOrder, num, num2, null), fVar);
    }

    /* JADX INFO: renamed from: getById-m7AL99Q, reason: not valid java name */
    public final Object m44getByIdm7AL99Q(Set<? extends ExtractableField<?>> set, String str, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new ContactRepository$getById$2(set, this, str, null), fVar);
    }

    public final ContentResolver getContentResolver() {
        return this.contentResolver;
    }

    public final Object getCount(n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new C24652(null), fVar);
    }

    /* JADX INFO: renamed from: getFieldFromContacts-m7AL99Q, reason: not valid java name */
    public final <T extends Extractable> Object m45getFieldFromContactsm7AL99Q(ExtractableField.Contacts<T> contacts, String str, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new ContactRepository$getFieldFromContacts$2(this, contacts, str, null), fVar);
    }

    /* JADX INFO: renamed from: getFieldFromData-m7AL99Q, reason: not valid java name */
    public final <T extends Extractable.Data> Object m46getFieldFromDatam7AL99Q(ExtractableField.Data<T> data, String str, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new ContactRepository$getFieldFromData$2(this, data, str, null), fVar);
    }

    /* JADX INFO: renamed from: getLookupKey-D2TBaGg, reason: not valid java name */
    public final Object m47getLookupKeyD2TBaGg(String str, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new ContactRepository$getLookupKey$2(this, str, null), fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: getRawContactId-K3SHF88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m48getRawContactIdK3SHF88(String str, n7.f fVar) {
        ContactRepository$getRawContactId$1 contactRepository$getRawContactId$1;
        if (fVar instanceof ContactRepository$getRawContactId$1) {
            contactRepository$getRawContactId$1 = (ContactRepository$getRawContactId$1) fVar;
            int i10 = contactRepository$getRawContactId$1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                contactRepository$getRawContactId$1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                contactRepository$getRawContactId$1 = new ContactRepository$getRawContactId$1(this, fVar);
            }
        }
        Object objG = contactRepository$getRawContactId$1.result;
        Object objE = AbstractC3016b.e();
        int i11 = contactRepository$getRawContactId$1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objG);
            J jB = C1404d0.b();
            ContactRepository$getRawContactId$2 contactRepository$getRawContactId$2 = new ContactRepository$getRawContactId$2(this, str, null);
            contactRepository$getRawContactId$1.label = 1;
            objG = AbstractC1413i.g(jB, contactRepository$getRawContactId$2, contactRepository$getRawContactId$1);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objG);
        }
        RawContactId rawContactId = (RawContactId) objG;
        if (rawContactId != null) {
            return rawContactId.m149unboximpl();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: insert-Hoartsk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m49insertHoartsk(NewContact newContact, n7.f fVar) {
        ContactRepository$insert$1 contactRepository$insert$1;
        if (fVar instanceof ContactRepository$insert$1) {
            contactRepository$insert$1 = (ContactRepository$insert$1) fVar;
            int i10 = contactRepository$insert$1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                contactRepository$insert$1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                contactRepository$insert$1 = new ContactRepository$insert$1(this, fVar);
            }
        }
        Object objG = contactRepository$insert$1.result;
        Object objE = AbstractC3016b.e();
        int i11 = contactRepository$insert$1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objG);
            J jB = C1404d0.b();
            ContactRepository$insert$2 contactRepository$insert$2 = new ContactRepository$insert$2(newContact, this, null);
            contactRepository$insert$1.label = 1;
            objG = AbstractC1413i.g(jB, contactRepository$insert$2, contactRepository$insert$1);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objG);
        }
        return ((ContactId) objG).m135unboximpl();
    }

    public final Object patch(ContactPatch contactPatch, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new C24662(contactPatch, this, null), fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object update(UpdateContact updateContact, n7.f fVar) {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object obj = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            ContentProviderOperation contentProviderOperationBuild = ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("raw_contact_id = ?", new String[]{updateContact.getRawContactId()}).build();
            AbstractC2855l.f(contentProviderOperationBuild, "build(...)");
            List listC = AbstractC2800q.c();
            listC.add(contentProviderOperationBuild);
            List<Appendable> toAppend = updateContact.getToAppend();
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(toAppend, 10));
            Iterator<T> it = toAppend.iterator();
            while (it.hasNext()) {
                arrayList.add(((Appendable) it.next()).toAppendOperation());
            }
            listC.addAll(arrayList);
            listC.add(updateContact.getStarred().toUpdateOperation());
            List listA = AbstractC2800q.a(listC);
            ContentResolver contentResolver = this.contentResolver;
            anonymousClass1.label = 1;
            if (ContentResolverExtensionsKt.safeApplyBatch(contentResolver, "com.android.contacts", (List<? extends ContentProviderOperation>) listA, anonymousClass1) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
        }
        return kotlin.coroutines.jvm.internal.b.a(true);
    }

    public final Object update(Updatable updatable, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass3(updatable, this, null), fVar);
    }
}
