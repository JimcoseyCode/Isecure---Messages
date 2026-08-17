package expo.modules.medialibrary.next.extensions.resolver;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.N;
import R8.O;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.customview.widget.a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.medialibrary.next.objects.wrappers.RelativePath;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2853j;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u001e\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\t\u0010\u0004\u001a\u001e\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\n\u0010\u0004\u001a\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u000e\u0010\u0004\"\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/content/ContentResolver;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "bucketId", "queryAlbumTitle", "(Landroid/content/ContentResolver;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;", "queryAlbumRelativePath", "queryAlbumFilepath", "relativePath", "queryAlbumId-qTZuolk", "queryAlbumId", "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/net/Uri;", "queryAlbumAssetsContentUris", "EXTERNAL_CONTENT_URI", "Landroid/net/Uri;", "getEXTERNAL_CONTENT_URI", "()Landroid/net/Uri;", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AlbumExtensionsKt {
    private static final Uri EXTERNAL_CONTENT_URI;

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.resolver.AlbumExtensionsKt$queryAlbumAssetsContentUris$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.extensions.resolver.AlbumExtensionsKt$queryAlbumAssetsContentUris$2", f = "AlbumExtensions.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/net/Uri;", "<anonymous>", "(LR8/N;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ String $bucketId;
        final /* synthetic */ ContentResolver $this_queryAlbumAssetsContentUris;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ContentResolver contentResolver, String str, n7.f fVar) {
            super(2, fVar);
            this.$this_queryAlbumAssetsContentUris = contentResolver;
            this.$bucketId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_queryAlbumAssetsContentUris, this.$bucketId, fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            N n10 = (N) this.L$0;
            Cursor cursorQuery = this.$this_queryAlbumAssetsContentUris.query(AlbumExtensionsKt.getEXTERNAL_CONTENT_URI(), new String[]{"_id", "media_type"}, "bucket_id = ?", new String[]{this.$bucketId}, null);
            if (cursorQuery != null) {
                try {
                    O.d(n10);
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("media_type");
                    Iterable<Cursor> iterableAsIterable = expo.modules.medialibrary.next.extensions.CursorExtensionsKt.asIterable(cursorQuery);
                    ArrayList arrayList = new ArrayList(AbstractC2800q.u(iterableAsIterable, 10));
                    Iterator<Cursor> it = iterableAsIterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(CursorExtensionsKt.extractAssetContentUri(it.next(), columnIndexOrThrow, columnIndexOrThrow2));
                    }
                    List listP0 = AbstractC2800q.P0(arrayList);
                    AbstractC3376c.a(cursorQuery, null);
                    if (listP0 != null) {
                        return listP0;
                    }
                } finally {
                }
            }
            return AbstractC2800q.j();
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.resolver.AlbumExtensionsKt$queryAlbumFilepath$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class C25252 extends AbstractC2853j implements Function2 {
        public static final C25252 INSTANCE = new C25252();

        C25252() {
            super(2, Cursor.class, "getString", "getString(I)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Cursor) obj, ((Number) obj2).intValue());
        }

        public final String invoke(Cursor p02, int i10) {
            AbstractC2855l.g(p02, "p0");
            return p02.getString(i10);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.resolver.AlbumExtensionsKt$queryAlbumId$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class C25262 extends AbstractC2853j implements Function2 {
        public static final C25262 INSTANCE = new C25262();

        C25262() {
            super(2, Cursor.class, "getString", "getString(I)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Cursor) obj, ((Number) obj2).intValue());
        }

        public final String invoke(Cursor p02, int i10) {
            AbstractC2855l.g(p02, "p0");
            return p02.getString(i10);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.resolver.AlbumExtensionsKt$queryAlbumId$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class AnonymousClass4 extends AbstractC2853j implements Function2 {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(2, Cursor.class, "getString", "getString(I)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Cursor) obj, ((Number) obj2).intValue());
        }

        public final String invoke(Cursor p02, int i10) {
            AbstractC2855l.g(p02, "p0");
            return p02.getString(i10);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.resolver.AlbumExtensionsKt$queryAlbumRelativePath$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.extensions.resolver.AlbumExtensionsKt", f = "AlbumExtensions.kt", l = {TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY}, m = "queryAlbumRelativePath")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            Object objQueryAlbumRelativePath = AlbumExtensionsKt.queryAlbumRelativePath(null, null, this);
            if (objQueryAlbumRelativePath == AbstractC3016b.e()) {
                return objQueryAlbumRelativePath;
            }
            String str = (String) objQueryAlbumRelativePath;
            if (str != null) {
                return RelativePath.m311boximpl(str);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.resolver.AlbumExtensionsKt$queryAlbumTitle$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class C25282 extends AbstractC2853j implements Function2 {
        public static final C25282 INSTANCE = new C25282();

        C25282() {
            super(2, Cursor.class, "getString", "getString(I)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Cursor) obj, ((Number) obj2).intValue());
        }

        public final String invoke(Cursor p02, int i10) {
            AbstractC2855l.g(p02, "p0");
            return p02.getString(i10);
        }
    }

    static {
        Uri contentUri = MediaStore.Files.getContentUri("external");
        AbstractC2855l.f(contentUri, "getContentUri(...)");
        EXTERNAL_CONTENT_URI = contentUri;
    }

    public static final Uri getEXTERNAL_CONTENT_URI() {
        return EXTERNAL_CONTENT_URI;
    }

    public static final Object queryAlbumAssetsContentUris(ContentResolver contentResolver, String str, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(contentResolver, str, null), fVar);
    }

    public static final Object queryAlbumFilepath(ContentResolver contentResolver, String str, n7.f fVar) {
        return QueryOneKt.queryOne$default(contentResolver, EXTERNAL_CONTENT_URI, "_data", C25252.INSTANCE, "bucket_id = ?", new String[]{str}, null, fVar, 32, null);
    }

    public static final Object queryAlbumId(ContentResolver contentResolver, String str, n7.f fVar) {
        return QueryOneKt.queryOne$default(contentResolver, EXTERNAL_CONTENT_URI, "bucket_id", AnonymousClass4.INSTANCE, "bucket_display_name = ?", new String[]{str}, null, fVar, 32, null);
    }

    /* JADX INFO: renamed from: queryAlbumId-qTZuolk, reason: not valid java name */
    public static final Object m269queryAlbumIdqTZuolk(ContentResolver contentResolver, String str, n7.f fVar) {
        return QueryOneKt.queryOne$default(contentResolver, EXTERNAL_CONTENT_URI, "bucket_id", C25262.INSTANCE, "relative_path = ?", new String[]{str}, null, fVar, 32, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object queryAlbumRelativePath(ContentResolver contentResolver, String str, n7.f fVar) {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object objQueryOne$default = anonymousClass12.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass12.label;
        if (i11 == 0) {
            AbstractC2753p.b(objQueryOne$default);
            anonymousClass12.label = 1;
            objQueryOne$default = QueryOneKt.queryOne$default(contentResolver, EXTERNAL_CONTENT_URI, "relative_path", new Function2() { // from class: expo.modules.medialibrary.next.extensions.resolver.AlbumExtensionsKt.queryAlbumRelativePath.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return RelativePath.m311boximpl(m270invokeYrlpHeI((Cursor) obj, ((Number) obj2).intValue()));
                }

                /* JADX INFO: renamed from: invoke-YrlpHeI, reason: not valid java name */
                public final String m270invokeYrlpHeI(Cursor queryOne, int i12) {
                    AbstractC2855l.g(queryOne, "$this$queryOne");
                    String string = queryOne.getString(i12);
                    AbstractC2855l.f(string, "getString(...)");
                    return RelativePath.m312constructorimpl(string);
                }
            }, "bucket_id = ?", new String[]{str}, null, anonymousClass12, 32, null);
            if (objQueryOne$default == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objQueryOne$default);
        }
        RelativePath relativePath = (RelativePath) objQueryOne$default;
        if (relativePath != null) {
            return relativePath.m318unboximpl();
        }
        return null;
    }

    public static final Object queryAlbumTitle(ContentResolver contentResolver, String str, n7.f fVar) {
        return QueryOneKt.queryOne$default(contentResolver, EXTERNAL_CONTENT_URI, "bucket_display_name", C25282.INSTANCE, "bucket_id = ?", new String[]{str}, null, fVar, 32, null);
    }
}
