package expo.modules.medialibrary.next.extensions.resolver;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.N;
import R8.O;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.next.exceptions.PermissionException;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\u001ap\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "contentUri", PointerEventHelper.POINTER_TYPE_UNKNOWN, "column", "Lkotlin/Function2;", "Landroid/database/Cursor;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "extractor", "selection", PointerEventHelper.POINTER_TYPE_UNKNOWN, "selectionArgs", "sortOrder", "queryOne", "(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class QueryOneKt {

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.resolver.QueryOneKt$queryOne$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.extensions.resolver.QueryOneKt$queryOne$2", f = "QueryOne.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "LR8/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ String $column;
        final /* synthetic */ Uri $contentUri;
        final /* synthetic */ Function2 $extractor;
        final /* synthetic */ String $selection;
        final /* synthetic */ String[] $selectionArgs;
        final /* synthetic */ String $sortOrder;
        final /* synthetic */ ContentResolver $this_queryOne;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, ContentResolver contentResolver, Uri uri, String str2, String[] strArr, String str3, Function2 function2, n7.f fVar) {
            super(2, fVar);
            this.$column = str;
            this.$this_queryOne = contentResolver;
            this.$contentUri = uri;
            this.$selection = str2;
            this.$selectionArgs = strArr;
            this.$sortOrder = str3;
            this.$extractor = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$column, this.$this_queryOne, this.$contentUri, this.$selection, this.$selectionArgs, this.$sortOrder, this.$extractor, fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws PermissionException, IOException {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            N n10 = (N) this.L$0;
            Cursor cursorSafeQuery = SafeQueryKt.safeQuery(this.$this_queryOne, this.$contentUri, new String[]{this.$column}, this.$selection, this.$selectionArgs, this.$sortOrder);
            if (cursorSafeQuery == null) {
                return null;
            }
            String str = this.$column;
            Function2 function2 = this.$extractor;
            try {
                O.d(n10);
                Object objInvoke = cursorSafeQuery.moveToFirst() ? function2.invoke(cursorSafeQuery, b.c(cursorSafeQuery.getColumnIndexOrThrow(str))) : null;
                AbstractC3376c.a(cursorSafeQuery, null);
                return objInvoke;
            } finally {
            }
        }
    }

    public static final <T> Object queryOne(ContentResolver contentResolver, Uri uri, String str, Function2 function2, String str2, String[] strArr, String str3, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(str, contentResolver, uri, str2, strArr, str3, function2, null), fVar);
    }

    public static /* synthetic */ Object queryOne$default(ContentResolver contentResolver, Uri uri, String str, Function2 function2, String str2, String[] strArr, String str3, n7.f fVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            strArr = null;
        }
        if ((i10 & 32) != 0) {
            str3 = null;
        }
        return queryOne(contentResolver, uri, str, function2, str2, strArr, str3, fVar);
    }
}
