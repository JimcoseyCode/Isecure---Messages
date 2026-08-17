package expo.modules.medialibrary.next.objects.query;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.N;
import R8.O;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.medialibrary.next.exceptions.ContentResolverNotObtainedException;
import expo.modules.medialibrary.next.extensions.CursorExtensionsKt;
import expo.modules.medialibrary.next.extensions.WeakReferenceExtensionsKt;
import expo.modules.medialibrary.next.objects.album.Album;
import expo.modules.medialibrary.next.objects.asset.factories.AssetFactory;
import expo.modules.medialibrary.next.objects.query.builder.QueryExecutor;
import expo.modules.medialibrary.next.objects.query.builder.QueryLegacyExecutor;
import expo.modules.medialibrary.next.objects.query.builder.QueryModernExecutor;
import expo.modules.medialibrary.next.records.AssetField;
import expo.modules.medialibrary.next.records.SortDescriptor;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\rJ\u001d\u0010\u0014\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\rJ\u001d\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\rJ\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000eH\u0086@¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\"\u0010*\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u00040\u00040(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010.R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00100R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00100R\u0014\u00104\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lexpo/modules/medialibrary/next/objects/query/Query;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;", "assetFactory", "Landroid/content/Context;", "context", "<init>", "(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Landroid/content/Context;)V", "Lexpo/modules/medialibrary/next/records/AssetField;", "field", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "eq", "(Lexpo/modules/medialibrary/next/records/AssetField;Ljava/lang/String;)Lexpo/modules/medialibrary/next/objects/query/Query;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "values", "within", "(Lexpo/modules/medialibrary/next/records/AssetField;Ljava/util/List;)Lexpo/modules/medialibrary/next/objects/query/Query;", "gt", "gte", "lt", "lte", PointerEventHelper.POINTER_TYPE_UNKNOWN, "limit", "(I)Lexpo/modules/medialibrary/next/objects/query/Query;", "Lexpo/modules/medialibrary/next/objects/album/Album;", "album", "(Lexpo/modules/medialibrary/next/objects/album/Album;)Lexpo/modules/medialibrary/next/objects/query/Query;", "count", "offset", "Lexpo/modules/medialibrary/next/records/SortDescriptor;", "descriptor", "orderBy", "(Lexpo/modules/medialibrary/next/records/SortDescriptor;)Lexpo/modules/medialibrary/next/objects/query/Query;", "Lexpo/modules/medialibrary/next/objects/asset/Asset;", "exe", "(Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;", "getAssetFactory", "()Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "contextRef", "Ljava/lang/ref/WeakReference;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "clauses", "Ljava/util/List;", "args", "Ljava/lang/Integer;", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "contentResolver", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Query extends SharedObject {
    private final List<String> args;
    private final AssetFactory assetFactory;
    private final List<String> clauses;
    private final WeakReference<Context> contextRef;
    private Integer limit;
    private Integer offset;
    private final List<SortDescriptor> orderBy;

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.objects.query.Query$exe$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.objects.query.Query$exe$2", f = "Query.kt", l = {101}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/medialibrary/next/objects/asset/Asset;", "<anonymous>", "(LR8/N;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            AnonymousClass2 anonymousClass2 = Query.this.new AnonymousClass2(fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws ContentResolverNotObtainedException, IOException {
            N n10;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                N n11 = (N) this.L$0;
                QueryExecutor queryModernExecutor = Build.VERSION.SDK_INT >= 30 ? new QueryModernExecutor(Query.this.clauses, Query.this.args, Query.this.orderBy, Query.this.limit, Query.this.offset) : new QueryLegacyExecutor(Query.this.clauses, Query.this.args, Query.this.orderBy, Query.this.limit, Query.this.offset);
                ContentResolver contentResolver = Query.this.getContentResolver();
                this.L$0 = n11;
                this.label = 1;
                Object objExe = queryModernExecutor.exe(new String[]{"_id", "media_type"}, contentResolver, this);
                if (objExe == objE) {
                    return objE;
                }
                n10 = n11;
                obj = objExe;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n10 = (N) this.L$0;
                AbstractC2753p.b(obj);
            }
            Cursor cursor = (Cursor) obj;
            Query query = Query.this;
            try {
                O.d(n10);
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("media_type");
                Iterable<Cursor> iterableAsIterable = CursorExtensionsKt.asIterable(cursor);
                ArrayList arrayList = new ArrayList(AbstractC2800q.u(iterableAsIterable, 10));
                Iterator<Cursor> it = iterableAsIterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(expo.modules.medialibrary.next.extensions.resolver.CursorExtensionsKt.extractAssetContentUri(it.next(), columnIndexOrThrow, columnIndexOrThrow2));
                }
                ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(query.getAssetFactory().create((Uri) it2.next()));
                }
                List listP0 = AbstractC2800q.P0(arrayList2);
                AbstractC3376c.a(cursor, null);
                return listP0;
            } finally {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Query(AssetFactory assetFactory, Context context) {
        super(null, 1, null);
        AbstractC2855l.g(assetFactory, "assetFactory");
        AbstractC2855l.g(context, "context");
        this.assetFactory = assetFactory;
        this.contextRef = new WeakReference<>(context);
        this.clauses = new ArrayList();
        this.args = new ArrayList();
        this.orderBy = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentResolver getContentResolver() throws ContentResolverNotObtainedException {
        ContentResolver contentResolver = WeakReferenceExtensionsKt.getOrThrow(this.contextRef).getContentResolver();
        if (contentResolver != null) {
            return contentResolver;
        }
        throw new ContentResolverNotObtainedException(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence within$lambda$2$lambda$1(String it) {
        AbstractC2855l.g(it, "it");
        return "?";
    }

    public final Query album(Album album) {
        AbstractC2855l.g(album, "album");
        this.clauses.add("bucket_id = ?");
        this.args.add(album.getId());
        return this;
    }

    public final Query eq(AssetField field, String value) {
        AbstractC2855l.g(field, "field");
        AbstractC2855l.g(value, "value");
        this.clauses.add(field.toMediaStoreColumn() + " = ?");
        this.args.add(value);
        return this;
    }

    public final Object exe(n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(null), fVar);
    }

    public final AssetFactory getAssetFactory() {
        return this.assetFactory;
    }

    public final Query gt(AssetField field, String value) {
        AbstractC2855l.g(field, "field");
        AbstractC2855l.g(value, "value");
        this.clauses.add(field.toMediaStoreColumn() + " > ?");
        this.args.add(value);
        return this;
    }

    public final Query gte(AssetField field, String value) {
        AbstractC2855l.g(field, "field");
        AbstractC2855l.g(value, "value");
        this.clauses.add(field.toMediaStoreColumn() + " >= ?");
        this.args.add(value);
        return this;
    }

    public final Query limit(int limit) {
        this.limit = Integer.valueOf(limit);
        return this;
    }

    public final Query lt(AssetField field, String value) {
        AbstractC2855l.g(field, "field");
        AbstractC2855l.g(value, "value");
        this.clauses.add(field.toMediaStoreColumn() + " < ?");
        this.args.add(value);
        return this;
    }

    public final Query lte(AssetField field, String value) {
        AbstractC2855l.g(field, "field");
        AbstractC2855l.g(value, "value");
        this.clauses.add(field.toMediaStoreColumn() + " <= ?");
        this.args.add(value);
        return this;
    }

    public final Query offset(int count) {
        this.offset = Integer.valueOf(count);
        return this;
    }

    public final Query orderBy(SortDescriptor descriptor) {
        AbstractC2855l.g(descriptor, "descriptor");
        this.orderBy.add(descriptor);
        return this;
    }

    public final Query within(AssetField field, List<String> values) {
        AbstractC2855l.g(field, "field");
        AbstractC2855l.g(values, "values");
        String strO0 = AbstractC2800q.o0(values, ", ", null, null, 0, null, new Function1() { // from class: expo.modules.medialibrary.next.objects.query.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Query.within$lambda$2$lambda$1((String) obj);
            }
        }, 30, null);
        this.clauses.add(field.toMediaStoreColumn() + " IN (" + strO0 + ")");
        this.args.addAll(values);
        return this;
    }
}
