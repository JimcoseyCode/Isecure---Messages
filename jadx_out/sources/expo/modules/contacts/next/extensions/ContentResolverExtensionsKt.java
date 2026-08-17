package expo.modules.contacts.next.extensions;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.J;
import R8.N;
import R8.O;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.customview.widget.a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.CouldNotExecuteQueryException;
import expo.modules.contacts.next.PermissionException;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a:\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0005*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000f\u001a0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0005*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0086@¢\u0006\u0004\b\u000e\u0010\u0012\u001a\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0015*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017\u001ap\u0010 \u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0019*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00032\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0086@¢\u0006\u0004\b \u0010!\u001aT\u0010#\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0086@¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroid/content/ContentResolver;", "Landroid/net/Uri;", "uri", PointerEventHelper.POINTER_TYPE_UNKNOWN, "where", PointerEventHelper.POINTER_TYPE_UNKNOWN, "selectionArgs", PointerEventHelper.POINTER_TYPE_UNKNOWN, "safeDelete", "(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "authority", "Landroid/content/ContentProviderOperation;", "operation", "Landroid/content/ContentProviderResult;", "safeApplyBatch", "(Landroid/content/ContentResolver;Ljava/lang/String;Landroid/content/ContentProviderOperation;Ln7/f;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "operations", "(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/util/List;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "getContactIdFromRawContactId-5WPtcSs", "(Landroid/content/ContentResolver;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "getContactIdFromRawContactId", "T", "column", "Lkotlin/Function2;", "Landroid/database/Cursor;", "extractor", "selection", "sortOrder", "queryOne", "(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "projection", "safeQuery", "(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "expo-contacts_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ContentResolverExtensionsKt {

    /* JADX INFO: renamed from: expo.modules.contacts.next.extensions.ContentResolverExtensionsKt$queryOne$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.extensions.ContentResolverExtensionsKt$queryOne$2", f = "ContentResolverExtensions.kt", l = {71}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "LR8/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ String $column;
        final /* synthetic */ Function2 $extractor;
        final /* synthetic */ String $selection;
        final /* synthetic */ String[] $selectionArgs;
        final /* synthetic */ String $sortOrder;
        final /* synthetic */ ContentResolver $this_queryOne;
        final /* synthetic */ Uri $uri;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, ContentResolver contentResolver, Uri uri, String str2, String[] strArr, String str3, Function2 function2, n7.f fVar) {
            super(2, fVar);
            this.$column = str;
            this.$this_queryOne = contentResolver;
            this.$uri = uri;
            this.$selection = str2;
            this.$selectionArgs = strArr;
            this.$sortOrder = str3;
            this.$extractor = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$column, this.$this_queryOne, this.$uri, this.$selection, this.$selectionArgs, this.$sortOrder, this.$extractor, fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            AnonymousClass2 anonymousClass2;
            N n10;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                N n11 = (N) this.L$0;
                String[] strArr = {this.$column};
                ContentResolver contentResolver = this.$this_queryOne;
                Uri uri = this.$uri;
                String str = this.$selection;
                String[] strArr2 = this.$selectionArgs;
                String str2 = this.$sortOrder;
                this.L$0 = n11;
                this.label = 1;
                anonymousClass2 = this;
                Object objSafeQuery = ContentResolverExtensionsKt.safeQuery(contentResolver, uri, strArr, str, strArr2, str2, anonymousClass2);
                if (objSafeQuery == objE) {
                    return objE;
                }
                n10 = n11;
                obj = objSafeQuery;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n10 = (N) this.L$0;
                AbstractC2753p.b(obj);
                anonymousClass2 = this;
            }
            Closeable closeable = (Closeable) obj;
            String str3 = anonymousClass2.$column;
            Function2 function2 = anonymousClass2.$extractor;
            try {
                Cursor cursor = (Cursor) closeable;
                O.d(n10);
                Object objInvoke = cursor.moveToFirst() ? function2.invoke(cursor, b.c(cursor.getColumnIndexOrThrow(str3))) : null;
                AbstractC3376c.a(closeable, null);
                return objInvoke;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: expo.modules.contacts.next.extensions.ContentResolverExtensionsKt$safeApplyBatch$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.extensions.ContentResolverExtensionsKt", f = "ContentResolverExtensions.kt", l = {39}, m = "safeApplyBatch")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C24672 extends d {
        int label;
        /* synthetic */ Object result;

        C24672(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return ContentResolverExtensionsKt.safeApplyBatch((ContentResolver) null, (String) null, (List<? extends ContentProviderOperation>) null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.contacts.next.extensions.ContentResolverExtensionsKt$safeApplyBatch$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.extensions.ContentResolverExtensionsKt$safeApplyBatch$3", f = "ContentResolverExtensions.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a0\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0017\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001¢\u0006\u0002\b\u00040\u0001¢\u0006\u0002\b\u0004*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/content/ContentProviderResult;", "kotlin.jvm.PlatformType", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(LR8/N;)Lkotlin/Array;"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass3 extends l implements Function2 {
        final /* synthetic */ String $authority;
        final /* synthetic */ List<ContentProviderOperation> $operations;
        final /* synthetic */ ContentResolver $this_safeApplyBatch;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(ContentResolver contentResolver, String str, List<? extends ContentProviderOperation> list, n7.f fVar) {
            super(2, fVar);
            this.$this_safeApplyBatch = contentResolver;
            this.$authority = str;
            this.$operations = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new AnonymousClass3(this.$this_safeApplyBatch, this.$authority, this.$operations, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass3) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws PermissionException {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            try {
                return this.$this_safeApplyBatch.applyBatch(this.$authority, new ArrayList<>(this.$operations));
            } catch (SecurityException e10) {
                throw new PermissionException("android.permission.WRITE_CONTACTS", e10);
            }
        }
    }

    /* JADX INFO: renamed from: expo.modules.contacts.next.extensions.ContentResolverExtensionsKt$safeDelete$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.extensions.ContentResolverExtensionsKt$safeDelete$2", f = "ContentResolverExtensions.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<anonymous>", "(LR8/N;)I"}, k = 3, mv = {2, 1, 0})
    static final class C24682 extends l implements Function2 {
        final /* synthetic */ String[] $selectionArgs;
        final /* synthetic */ ContentResolver $this_safeDelete;
        final /* synthetic */ Uri $uri;
        final /* synthetic */ String $where;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24682(ContentResolver contentResolver, Uri uri, String str, String[] strArr, n7.f fVar) {
            super(2, fVar);
            this.$this_safeDelete = contentResolver;
            this.$uri = uri;
            this.$where = str;
            this.$selectionArgs = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new C24682(this.$this_safeDelete, this.$uri, this.$where, this.$selectionArgs, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24682) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws PermissionException {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            try {
                return b.c(this.$this_safeDelete.delete(this.$uri, this.$where, this.$selectionArgs));
            } catch (SecurityException e10) {
                throw new PermissionException("android.permission.WRITE_CONTACTS", e10);
            }
        }
    }

    /* JADX INFO: renamed from: expo.modules.contacts.next.extensions.ContentResolverExtensionsKt$safeQuery$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.extensions.ContentResolverExtensionsKt$safeQuery$2", f = "ContentResolverExtensions.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Landroid/database/Cursor;", "<anonymous>", "(LR8/N;)Landroid/database/Cursor;"}, k = 3, mv = {2, 1, 0})
    static final class C24692 extends l implements Function2 {
        final /* synthetic */ String[] $projection;
        final /* synthetic */ String $selection;
        final /* synthetic */ String[] $selectionArgs;
        final /* synthetic */ String $sortOrder;
        final /* synthetic */ ContentResolver $this_safeQuery;
        final /* synthetic */ Uri $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24692(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, n7.f fVar) {
            super(2, fVar);
            this.$this_safeQuery = contentResolver;
            this.$uri = uri;
            this.$projection = strArr;
            this.$selection = str;
            this.$selectionArgs = strArr2;
            this.$sortOrder = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new C24692(this.$this_safeQuery, this.$uri, this.$projection, this.$selection, this.$selectionArgs, this.$sortOrder, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24692) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws CouldNotExecuteQueryException, PermissionException {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            try {
                Cursor cursorQuery = this.$this_safeQuery.query(this.$uri, this.$projection, this.$selection, this.$selectionArgs, this.$sortOrder);
                if (cursorQuery != null) {
                    return cursorQuery;
                }
                throw new CouldNotExecuteQueryException("Cursor returned by query is null", null, 2, null);
            } catch (SecurityException e10) {
                throw new PermissionException("android.permission.READ_CONTACTS", e10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: getContactIdFromRawContactId-5WPtcSs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m151getContactIdFromRawContactId5WPtcSs(ContentResolver contentResolver, String str, n7.f fVar) {
        ContentResolverExtensionsKt$getContactIdFromRawContactId$1 contentResolverExtensionsKt$getContactIdFromRawContactId$1;
        if (fVar instanceof ContentResolverExtensionsKt$getContactIdFromRawContactId$1) {
            contentResolverExtensionsKt$getContactIdFromRawContactId$1 = (ContentResolverExtensionsKt$getContactIdFromRawContactId$1) fVar;
            int i10 = contentResolverExtensionsKt$getContactIdFromRawContactId$1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                contentResolverExtensionsKt$getContactIdFromRawContactId$1.label = i10 - a.INVALID_ID;
            } else {
                contentResolverExtensionsKt$getContactIdFromRawContactId$1 = new ContentResolverExtensionsKt$getContactIdFromRawContactId$1(fVar);
            }
        }
        Object objG = contentResolverExtensionsKt$getContactIdFromRawContactId$1.result;
        Object objE = AbstractC3016b.e();
        int i11 = contentResolverExtensionsKt$getContactIdFromRawContactId$1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objG);
            J jB = C1404d0.b();
            ContentResolverExtensionsKt$getContactIdFromRawContactId$2 contentResolverExtensionsKt$getContactIdFromRawContactId$2 = new ContentResolverExtensionsKt$getContactIdFromRawContactId$2(contentResolver, str, null);
            contentResolverExtensionsKt$getContactIdFromRawContactId$1.label = 1;
            objG = AbstractC1413i.g(jB, contentResolverExtensionsKt$getContactIdFromRawContactId$2, contentResolverExtensionsKt$getContactIdFromRawContactId$1);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objG);
        }
        ContactId contactId = (ContactId) objG;
        if (contactId != null) {
            return contactId.m135unboximpl();
        }
        return null;
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

    public static final Object safeApplyBatch(ContentResolver contentResolver, String str, ContentProviderOperation contentProviderOperation, n7.f fVar) {
        return safeApplyBatch(contentResolver, str, (List<? extends ContentProviderOperation>) AbstractC2800q.e(contentProviderOperation), fVar);
    }

    public static final Object safeDelete(ContentResolver contentResolver, Uri uri, String str, String[] strArr, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new C24682(contentResolver, uri, str, strArr, null), fVar);
    }

    public static /* synthetic */ Object safeDelete$default(ContentResolver contentResolver, Uri uri, String str, String[] strArr, n7.f fVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            strArr = null;
        }
        return safeDelete(contentResolver, uri, str, strArr, fVar);
    }

    public static final Object safeQuery(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new C24692(contentResolver, uri, strArr, str, strArr2, str2, null), fVar);
    }

    public static /* synthetic */ Object safeQuery$default(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, n7.f fVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            strArr2 = null;
        }
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        return safeQuery(contentResolver, uri, strArr, str, strArr2, str2, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object safeApplyBatch(ContentResolver contentResolver, String str, List<? extends ContentProviderOperation> list, n7.f fVar) {
        C24672 c24672;
        if (fVar instanceof C24672) {
            c24672 = (C24672) fVar;
            int i10 = c24672.label;
            if ((i10 & a.INVALID_ID) != 0) {
                c24672.label = i10 - a.INVALID_ID;
            } else {
                c24672 = new C24672(fVar);
            }
        }
        Object objG = c24672.result;
        Object objE = AbstractC3016b.e();
        int i11 = c24672.label;
        if (i11 == 0) {
            AbstractC2753p.b(objG);
            J jB = C1404d0.b();
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(contentResolver, str, list, null);
            c24672.label = 1;
            objG = AbstractC1413i.g(jB, anonymousClass3, c24672);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objG);
        }
        AbstractC2855l.f(objG, "withContext(...)");
        return objG;
    }
}
