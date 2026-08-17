package expo.modules.contacts;

import R8.N;
import android.database.Cursor;
import android.provider.ContactsContract;
import expo.modules.kotlin.Promise;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.contacts.ContactsModule$definition$1$7$1", f = "ContactsModule.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
final class ContactsModule$definition$1$7$1 extends l implements Function2 {
    final /* synthetic */ Promise $promise;
    int label;
    final /* synthetic */ ContactsModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactsModule$definition$1$7$1(ContactsModule contactsModule, Promise promise, n7.f fVar) {
        super(2, fVar);
        this.this$0 = contactsModule;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        return new ContactsModule$definition$1$7$1(this.this$0, this.$promise, fVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((ContactsModule$definition$1$7$1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws ContactsCheckFailedException, IOException {
        AbstractC3016b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC2753p.b(obj);
        Cursor cursorQuery = this.this$0.getResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id"}, null, null, null);
        if (cursorQuery == null) {
            throw new ContactsCheckFailedException();
        }
        try {
            this.$promise.resolve(cursorQuery.moveToFirst());
            C2735B c2735b = C2735B.f28704a;
            AbstractC3376c.a(cursorQuery, null);
            return C2735B.f28704a;
        } finally {
        }
    }
}
