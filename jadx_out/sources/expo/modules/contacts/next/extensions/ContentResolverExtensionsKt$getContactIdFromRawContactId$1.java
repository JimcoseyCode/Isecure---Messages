package expo.modules.contacts.next.extensions;

import androidx.customview.widget.a;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.contacts.next.extensions.ContentResolverExtensionsKt", f = "ContentResolverExtensions.kt", l = {49}, m = "getContactIdFromRawContactId-5WPtcSs")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ContentResolverExtensionsKt$getContactIdFromRawContactId$1 extends d {
    int label;
    /* synthetic */ Object result;

    ContentResolverExtensionsKt$getContactIdFromRawContactId$1(n7.f fVar) {
        super(fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= a.INVALID_ID;
        Object objM151getContactIdFromRawContactId5WPtcSs = ContentResolverExtensionsKt.m151getContactIdFromRawContactId5WPtcSs(null, null, this);
        if (objM151getContactIdFromRawContactId5WPtcSs == AbstractC3016b.e()) {
            return objM151getContactIdFromRawContactId5WPtcSs;
        }
        String str = (String) objM151getContactIdFromRawContactId5WPtcSs;
        if (str != null) {
            return ContactId.m129boximpl(str);
        }
        return null;
    }
}
