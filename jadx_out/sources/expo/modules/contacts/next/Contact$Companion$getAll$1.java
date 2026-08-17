package expo.modules.contacts.next;

import expo.modules.contacts.next.Contact;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "expo.modules.contacts.next.Contact$Companion", f = "Contact.kt", l = {194}, m = "getAll")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class Contact$Companion$getAll$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Contact.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Contact$Companion$getAll$1(Contact.Companion companion, n7.f fVar) {
        super(fVar);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= androidx.customview.widget.a.INVALID_ID;
        return this.this$0.getAll(null, null, null, this);
    }
}
