package expo.modules.contacts.next.domain;

import R8.N;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2853j;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.contacts.next.domain.ContactRepository$getRawContactId$2", f = "ContactRepository.kt", l = {286}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "<anonymous>", "(LR8/N;)Lexpo/modules/contacts/next/domain/wrappers/RawContactId;"}, k = 3, mv = {2, 1, 0})
final class ContactRepository$getRawContactId$2 extends l implements Function2 {
    final /* synthetic */ String $contactId;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX INFO: renamed from: expo.modules.contacts.next.domain.ContactRepository$getRawContactId$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends AbstractC2853j implements Function2 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2, Cursor.class, "getString", "getString(I)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Cursor) obj, ((Number) obj2).intValue());
        }

        public final String invoke(Cursor p02, int i10) {
            AbstractC2855l.g(p02, "p0");
            return p02.getString(i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$getRawContactId$2(ContactRepository contactRepository, String str, n7.f fVar) {
        super(2, fVar);
        this.this$0 = contactRepository;
        this.$contactId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        return new ContactRepository$getRawContactId$2(this.this$0, this.$contactId, fVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((ContactRepository$getRawContactId$2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            StringBuilder sb = new StringBuilder("contact_id=?");
            ContentResolver contentResolver = this.this$0.getContentResolver();
            Uri CONTENT_URI = ContactsContract.RawContacts.CONTENT_URI;
            AbstractC2855l.f(CONTENT_URI, "CONTENT_URI");
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            String string = sb.toString();
            String[] strArr = {this.$contactId};
            this.label = 1;
            obj = ContentResolverExtensionsKt.queryOne$default(contentResolver, CONTENT_URI, "_id", anonymousClass1, string, strArr, null, this, 32, null);
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
        String strM144constructorimpl = str != null ? RawContactId.m144constructorimpl(str) : null;
        if (strM144constructorimpl != null) {
            return RawContactId.m143boximpl(strM144constructorimpl);
        }
        return null;
    }
}
