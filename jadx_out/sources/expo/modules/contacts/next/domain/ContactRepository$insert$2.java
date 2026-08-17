package expo.modules.contacts.next.domain;

import R8.N;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import expo.modules.contacts.next.ContactIdNotFoundException;
import expo.modules.contacts.next.domain.model.contact.NewContact;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import expo.modules.contacts.next.extensions.ContentProviderResultExtensionsKt;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import i7.AbstractC2753p;
import i7.C2735B;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.contacts.next.domain.ContactRepository$insert$2", f = "ContactRepository.kt", l = {36, 38}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "<anonymous>", "(LR8/N;)Lexpo/modules/contacts/next/domain/wrappers/ContactId;"}, k = 3, mv = {2, 1, 0})
final class ContactRepository$insert$2 extends l implements Function2 {
    final /* synthetic */ NewContact $contact;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$insert$2(NewContact newContact, ContactRepository contactRepository, n7.f fVar) {
        super(2, fVar);
        this.$contact = newContact;
        this.this$0 = contactRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        return new ContactRepository$insert$2(this.$contact, this.this$0, fVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((ContactRepository$insert$2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r7 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws ContactIdNotFoundException {
        Object objM151getContactIdFromRawContactId5WPtcSs;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            List<ContentProviderOperation> insertOperations = this.$contact.toInsertOperations();
            ContentResolver contentResolver = this.this$0.getContentResolver();
            this.label = 1;
            obj = ContentResolverExtensionsKt.safeApplyBatch(contentResolver, "com.android.contacts", insertOperations, this);
            if (obj != objE) {
            }
            return objE;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            ContactId contactId = (ContactId) obj;
            objM151getContactIdFromRawContactId5WPtcSs = contactId != null ? contactId.m135unboximpl() : null;
            String str = (String) objM151getContactIdFromRawContactId5WPtcSs;
            if (str != null) {
                return ContactId.m129boximpl(str);
            }
            throw new ContactIdNotFoundException(null, 1, null);
        }
        AbstractC2753p.b(obj);
        String strM144constructorimpl = RawContactId.m144constructorimpl(ContentProviderResultExtensionsKt.extractId((ContentProviderResult[]) obj));
        ContentResolver contentResolver2 = this.this$0.getContentResolver();
        this.label = 2;
        objM151getContactIdFromRawContactId5WPtcSs = ContentResolverExtensionsKt.m151getContactIdFromRawContactId5WPtcSs(contentResolver2, strM144constructorimpl, this);
    }
}
