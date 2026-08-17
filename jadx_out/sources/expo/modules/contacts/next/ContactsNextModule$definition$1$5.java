package expo.modules.contacts.next;

import expo.modules.contacts.next.intents.ContactIntentDelegate;
import expo.modules.kotlin.activityresult.AppContextActivityResultCaller;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "expo.modules.contacts.next.ContactsNextModule$definition$1$5", f = "ContactsNextModule.kt", l = {391}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;", "Li7/B;", "<anonymous>", "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;)V"}, k = 3, mv = {2, 1, 0})
final class ContactsNextModule$definition$1$5 extends l implements Function2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContactsNextModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactsNextModule$definition$1$5(ContactsNextModule contactsNextModule, n7.f fVar) {
        super(2, fVar);
        this.this$0 = contactsNextModule;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        ContactsNextModule$definition$1$5 contactsNextModule$definition$1$5 = new ContactsNextModule$definition$1$5(this.this$0, fVar);
        contactsNextModule$definition$1$5.L$0 = obj;
        return contactsNextModule$definition$1$5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AppContextActivityResultCaller appContextActivityResultCaller, n7.f fVar) {
        return ((ContactsNextModule$definition$1$5) create(appContextActivityResultCaller, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            AppContextActivityResultCaller appContextActivityResultCaller = (AppContextActivityResultCaller) this.L$0;
            ContactIntentDelegate contactIntentDelegate = this.this$0.contactIntentDelegate;
            this.label = 1;
            if (contactIntentDelegate.registerContactContracts(appContextActivityResultCaller, this) == objE) {
                return objE;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
        }
        return C2735B.f28704a;
    }
}
