package expo.modules.contacts.next;

import R8.N;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import o7.AbstractC3016b;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$169", f = "ContactsNextModule.kt", l = {271}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$3"}, k = 3, mv = {2, 1, 0})
public final class ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$169 extends l implements o {
    /* synthetic */ Object L$0;
    int label;

    public ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$169(n7.f fVar) {
        super(3, fVar);
    }

    @Override // w7.o
    public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
        ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$169 contactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$169 = new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$169(fVar);
        contactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$169.L$0 = objArr;
        return contactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$169.invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            return obj;
        }
        AbstractC2753p.b(obj);
        Contact contact = (Contact) ((Object[]) this.L$0)[0];
        this.label = 1;
        Object objEditWithForm = contact.editWithForm(this);
        return objEditWithForm == objE ? objE : objEditWithForm;
    }
}
