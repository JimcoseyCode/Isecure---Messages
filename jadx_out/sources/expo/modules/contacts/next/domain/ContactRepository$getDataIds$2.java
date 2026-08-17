package expo.modules.contacts.next.domain;

import R8.N;
import R8.O;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import expo.modules.contacts.next.extensions.CursorExtensionsKt;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.contacts.next.domain.ContactRepository$getDataIds$2", f = "ContactRepository.kt", l = {70}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "<anonymous>", "(LR8/N;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
final class ContactRepository$getDataIds$2 extends l implements Function2 {
    final /* synthetic */ String $contactId;
    final /* synthetic */ Set<ExtractableField.Data<?>> $extractableFields;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContactRepository$getDataIds$2(Set<? extends ExtractableField.Data<?>> set, ContactRepository contactRepository, String str, n7.f fVar) {
        super(2, fVar);
        this.$extractableFields = set;
        this.this$0 = contactRepository;
        this.$contactId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence invokeSuspend$lambda$1(String str) {
        return "?";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$3$lambda$2(Cursor cursor) {
        return cursor.getString(0);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        ContactRepository$getDataIds$2 contactRepository$getDataIds$2 = new ContactRepository$getDataIds$2(this.$extractableFields, this.this$0, this.$contactId, fVar);
        contactRepository$getDataIds$2.L$0 = obj;
        return contactRepository$getDataIds$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((ContactRepository$getDataIds$2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws IOException {
        N n10;
        Object objSafeQuery$default;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            n10 = (N) this.L$0;
            Set<ExtractableField.Data<?>> set = this.$extractableFields;
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((ExtractableField.Data) it.next()).getMimeType());
            }
            List listY = AbstractC2800q.Y(arrayList);
            String strO0 = AbstractC2800q.o0(listY, ",", null, null, 0, null, new Function1() { // from class: expo.modules.contacts.next.domain.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ContactRepository$getDataIds$2.invokeSuspend$lambda$1((String) obj2);
                }
            }, 30, null);
            ContentResolver contentResolver = this.this$0.getContentResolver();
            Uri CONTENT_URI = ContactsContract.Data.CONTENT_URI;
            AbstractC2855l.f(CONTENT_URI, "CONTENT_URI");
            String[] strArr = (String[]) AbstractC2793j.t(new String[]{this.$contactId}, listY.toArray(new String[0]));
            this.L$0 = n10;
            this.label = 1;
            objSafeQuery$default = ContentResolverExtensionsKt.safeQuery$default(contentResolver, CONTENT_URI, new String[]{"_id"}, "contact_id = ? AND mimetype IN (" + strO0 + ")", strArr, null, this, 16, null);
            if (objSafeQuery$default == objE) {
                return objE;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N n11 = (N) this.L$0;
            AbstractC2753p.b(obj);
            n10 = n11;
            objSafeQuery$default = obj;
        }
        Closeable closeable = (Closeable) objSafeQuery$default;
        try {
            O.d(n10);
            List listS = O8.l.S(O8.l.J(O8.l.J(CursorExtensionsKt.asSequence((Cursor) closeable), new Function1() { // from class: expo.modules.contacts.next.domain.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ContactRepository$getDataIds$2.invokeSuspend$lambda$3$lambda$2((Cursor) obj2);
                }
            }), new Function1() { // from class: expo.modules.contacts.next.domain.ContactRepository$getDataIds$2$1$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return DataId.m136boximpl(m51invokefkdkgzA((String) obj2));
                }

                /* JADX INFO: renamed from: invoke-fkdkgzA, reason: not valid java name */
                public final String m51invokefkdkgzA(String str) {
                    AbstractC2855l.d(str);
                    return DataId.m137constructorimpl(str);
                }
            }));
            AbstractC3376c.a(closeable, null);
            return listS;
        } finally {
        }
    }
}
