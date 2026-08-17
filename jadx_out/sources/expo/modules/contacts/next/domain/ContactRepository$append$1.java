package expo.modules.contacts.next.domain;

import expo.modules.contacts.next.domain.wrappers.DataId;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.contacts.next.domain.ContactRepository", f = "ContactRepository.kt", l = {110}, m = "append-4zbj8jY")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ContactRepository$append$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$append$1(ContactRepository contactRepository, n7.f fVar) {
        super(fVar);
        this.this$0 = contactRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= androidx.customview.widget.a.INVALID_ID;
        Object objM41append4zbj8jY = this.this$0.m41append4zbj8jY(null, this);
        return objM41append4zbj8jY == AbstractC3016b.e() ? objM41append4zbj8jY : DataId.m136boximpl((String) objM41append4zbj8jY);
    }
}
