package expo.modules.contacts.next.domain;

import expo.modules.contacts.next.domain.wrappers.RawContactId;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.contacts.next.domain.ContactRepository", f = "ContactRepository.kt", l = {283}, m = "getRawContactId-K3SHF88")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ContactRepository$getRawContactId$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$getRawContactId$1(ContactRepository contactRepository, n7.f fVar) {
        super(fVar);
        this.this$0 = contactRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= androidx.customview.widget.a.INVALID_ID;
        Object objM48getRawContactIdK3SHF88 = this.this$0.m48getRawContactIdK3SHF88(null, this);
        if (objM48getRawContactIdK3SHF88 == AbstractC3016b.e()) {
            return objM48getRawContactIdK3SHF88;
        }
        String str = (String) objM48getRawContactIdK3SHF88;
        if (str != null) {
            return RawContactId.m143boximpl(str);
        }
        return null;
    }
}
