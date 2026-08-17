package expo.modules.contacts.next.extensions;

import R8.N;
import android.content.ContentResolver;
import android.net.Uri;
import android.provider.ContactsContract;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.contacts.next.extensions.ContentResolverExtensionsKt$getContactIdFromRawContactId$2", f = "ContentResolverExtensions.kt", l = {50}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "<anonymous>", "(LR8/N;)Lexpo/modules/contacts/next/domain/wrappers/ContactId;"}, k = 3, mv = {2, 1, 0})
final class ContentResolverExtensionsKt$getContactIdFromRawContactId$2 extends l implements Function2 {
    final /* synthetic */ String $rawContactId;
    final /* synthetic */ ContentResolver $this_getContactIdFromRawContactId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentResolverExtensionsKt$getContactIdFromRawContactId$2(ContentResolver contentResolver, String str, n7.f fVar) {
        super(2, fVar);
        this.$this_getContactIdFromRawContactId = contentResolver;
        this.$rawContactId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        return new ContentResolverExtensionsKt$getContactIdFromRawContactId$2(this.$this_getContactIdFromRawContactId, this.$rawContactId, fVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((ContentResolverExtensionsKt$getContactIdFromRawContactId$2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            ContentResolver contentResolver = this.$this_getContactIdFromRawContactId;
            Uri CONTENT_URI = ContactsContract.RawContacts.CONTENT_URI;
            AbstractC2855l.f(CONTENT_URI, "CONTENT_URI");
            ContentResolverExtensionsKt$getContactIdFromRawContactId$2$contactIdString$1 contentResolverExtensionsKt$getContactIdFromRawContactId$2$contactIdString$1 = ContentResolverExtensionsKt$getContactIdFromRawContactId$2$contactIdString$1.INSTANCE;
            String[] strArr = {this.$rawContactId};
            this.label = 1;
            obj = ContentResolverExtensionsKt.queryOne$default(contentResolver, CONTENT_URI, "contact_id", contentResolverExtensionsKt$getContactIdFromRawContactId$2$contactIdString$1, "_id = ?", strArr, null, this, 32, null);
            if (obj == objE) {
                return objE;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
        }
        String str = (String) obj;
        String strM130constructorimpl = str != null ? ContactId.m130constructorimpl(str) : null;
        if (strM130constructorimpl != null) {
            return ContactId.m129boximpl(strM130constructorimpl);
        }
        return null;
    }
}
