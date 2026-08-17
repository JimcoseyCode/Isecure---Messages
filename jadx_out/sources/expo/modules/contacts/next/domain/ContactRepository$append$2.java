package expo.modules.contacts.next.domain;

import R8.N;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.extensions.ContentProviderResultExtensionsKt;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.contacts.next.domain.ContactRepository$append$2", f = "ContactRepository.kt", l = {112}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "<anonymous>", "(LR8/N;)Lexpo/modules/contacts/next/domain/wrappers/DataId;"}, k = 3, mv = {2, 1, 0})
final class ContactRepository$append$2 extends l implements Function2 {
    final /* synthetic */ Appendable $appendable;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$append$2(Appendable appendable, ContactRepository contactRepository, n7.f fVar) {
        super(2, fVar);
        this.$appendable = appendable;
        this.this$0 = contactRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        return new ContactRepository$append$2(this.$appendable, this.this$0, fVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((ContactRepository$append$2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            ContentProviderOperation appendOperation = this.$appendable.toAppendOperation();
            ContentResolver contentResolver = this.this$0.getContentResolver();
            this.label = 1;
            obj = ContentResolverExtensionsKt.safeApplyBatch(contentResolver, "com.android.contacts", appendOperation, this);
            if (obj == objE) {
                return objE;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
        }
        return DataId.m136boximpl(DataId.m137constructorimpl(ContentProviderResultExtensionsKt.extractId((ContentProviderResult[]) obj)));
    }
}
