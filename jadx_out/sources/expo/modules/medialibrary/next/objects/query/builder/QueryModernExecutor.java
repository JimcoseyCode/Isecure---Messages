package expo.modules.medialibrary.next.objects.query.builder;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.N;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.next.exceptions.QueryCouldNotBeExecuted;
import expo.modules.medialibrary.next.extensions.resolver.AlbumExtensionsKt;
import expo.modules.medialibrary.next.records.SortDescriptor;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J&\u0010\u0018\u001a\u00020\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001c"}, d2 = {"Lexpo/modules/medialibrary/next/objects/query/builder/QueryModernExecutor;", "Lexpo/modules/medialibrary/next/objects/query/builder/QueryExecutor;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "clauses", "args", "Lexpo/modules/medialibrary/next/records/SortDescriptor;", "sortDescriptors", PointerEventHelper.POINTER_TYPE_UNKNOWN, "limit", "offset", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/os/Bundle;", "build", "()Landroid/os/Bundle;", "buildSelection", "()Ljava/lang/String;", "buildSortOrder", PointerEventHelper.POINTER_TYPE_UNKNOWN, "projection", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/database/Cursor;", "exe", "([Ljava/lang/String;Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;", "Ljava/util/List;", "Ljava/lang/Integer;", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryModernExecutor implements QueryExecutor {
    private List<String> args;
    private List<String> clauses;
    private final Integer limit;
    private final Integer offset;
    private final List<SortDescriptor> sortDescriptors;

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.query.builder.QueryModernExecutor$exe$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.query.builder.QueryModernExecutor$exe$2", f = "QueryModernExecutor.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Landroid/database/Cursor;", "<anonymous>", "(LR8/N;)Landroid/database/Cursor;"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ ContentResolver $contentResolver;
        final /* synthetic */ String[] $projection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ContentResolver contentResolver, String[] strArr, n7.f fVar) {
            super(2, fVar);
            this.$contentResolver = contentResolver;
            this.$projection = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return QueryModernExecutor.this.new AnonymousClass2(this.$contentResolver, this.$projection, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws QueryCouldNotBeExecuted {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            Cursor cursorQuery = this.$contentResolver.query(AlbumExtensionsKt.getEXTERNAL_CONTENT_URI(), this.$projection, QueryModernExecutor.this.build(), null);
            if (cursorQuery != null) {
                return cursorQuery;
            }
            throw new QueryCouldNotBeExecuted("Cursor is null", null, 2, null);
        }
    }

    public QueryModernExecutor(List<String> clauses, List<String> args, List<SortDescriptor> sortDescriptors, Integer num, Integer num2) {
        AbstractC2855l.g(clauses, "clauses");
        AbstractC2855l.g(args, "args");
        AbstractC2855l.g(sortDescriptors, "sortDescriptors");
        this.clauses = clauses;
        this.args = args;
        this.sortDescriptors = sortDescriptors;
        this.limit = num;
        this.offset = num2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle build() {
        String strBuildSelection = buildSelection();
        String[] strArr = (String[]) this.args.toArray(new String[0]);
        String strBuildSortOrder = buildSortOrder();
        Bundle bundle = new Bundle();
        Integer num = this.limit;
        if (num != null) {
            bundle.putInt("android:query-arg-limit", num.intValue());
        }
        Integer num2 = this.offset;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            if (this.limit == null) {
                bundle.putInt("android:query-arg-limit", -1);
            }
            bundle.putInt("android:query-arg-offset", iIntValue);
        }
        if (strBuildSelection != null) {
            bundle.putString("android:query-arg-sql-selection", strBuildSelection);
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
        }
        if (strBuildSortOrder != null) {
            bundle.putString("android:query-arg-sql-sort-order", strBuildSortOrder);
        }
        return bundle;
    }

    private final String buildSelection() {
        if (this.clauses.isEmpty()) {
            return null;
        }
        return AbstractC2800q.o0(this.clauses, " AND ", null, null, 0, null, null, 62, null);
    }

    private final String buildSortOrder() {
        if (this.sortDescriptors.isEmpty()) {
            return null;
        }
        return AbstractC2800q.o0(this.sortDescriptors, ", ", null, null, 0, null, new Function1() { // from class: expo.modules.medialibrary.next.objects.query.builder.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QueryModernExecutor.buildSortOrder$lambda$5((SortDescriptor) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence buildSortOrder$lambda$5(SortDescriptor it) {
        AbstractC2855l.g(it, "it");
        return it.toMediaStoreQueryString();
    }

    @Override // expo.modules.medialibrary.next.objects.query.builder.QueryExecutor
    public Object exe(String[] strArr, ContentResolver contentResolver, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(contentResolver, strArr, null), fVar);
    }
}
