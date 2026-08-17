package expo.modules.contacts.next.domain;

import R8.N;
import R8.O;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.query.QueryAggregator;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.contacts.next.domain.ContactRepository$getFieldFromData$2", f = "ContactRepository.kt", l = {235}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "T", "LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<anonymous>", "(LR8/N;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
final class ContactRepository$getFieldFromData$2 extends l implements Function2 {
    final /* synthetic */ String $contactId;
    final /* synthetic */ ExtractableField.Data<T> $extractableField;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$getFieldFromData$2(ContactRepository contactRepository, ExtractableField.Data<T> data, String str, n7.f fVar) {
        super(2, fVar);
        this.this$0 = contactRepository;
        this.$extractableField = data;
        this.$contactId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        ContactRepository$getFieldFromData$2 contactRepository$getFieldFromData$2 = new ContactRepository$getFieldFromData$2(this.this$0, this.$extractableField, this.$contactId, fVar);
        contactRepository$getFieldFromData$2.L$0 = obj;
        return contactRepository$getFieldFromData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((ContactRepository$getFieldFromData$2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws IOException {
        ContactRepository$getFieldFromData$2 contactRepository$getFieldFromData$2;
        N n10;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            N n11 = (N) this.L$0;
            ContentResolver contentResolver = this.this$0.getContentResolver();
            Uri CONTENT_URI = ContactsContract.Data.CONTENT_URI;
            AbstractC2855l.f(CONTENT_URI, "CONTENT_URI");
            String[] projection = this.$extractableField.getProjection();
            String[] strArr = {this.$contactId, this.$extractableField.getMimeType()};
            this.L$0 = n11;
            this.label = 1;
            contactRepository$getFieldFromData$2 = this;
            Object objSafeQuery$default = ContentResolverExtensionsKt.safeQuery$default(contentResolver, CONTENT_URI, projection, "contact_id = ? AND mimetype = ?", strArr, null, contactRepository$getFieldFromData$2, 16, null);
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
            contactRepository$getFieldFromData$2 = this;
        }
        Closeable closeable = (Closeable) obj;
        ExtractableField extractableField = contactRepository$getFieldFromData$2.$extractableField;
        try {
            O.d(n10);
            List listAggregateOneField = QueryAggregator.INSTANCE.aggregateOneField((Cursor) closeable, extractableField);
            AbstractC3376c.a(closeable, null);
            return listAggregateOneField;
        } finally {
        }
    }
}
