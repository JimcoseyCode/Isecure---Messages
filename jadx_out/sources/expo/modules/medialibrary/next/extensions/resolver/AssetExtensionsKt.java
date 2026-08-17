package expo.modules.medialibrary.next.extensions.resolver;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.N;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.MediaLibraryConstantsKt;
import expo.modules.medialibrary.next.objects.wrappers.MediaType;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2853j;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001e\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\b\u0010\u0005\u001a\u001e\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\t\u0010\u0005\u001a\u001e\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u001e\u0010\f\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\f\u0010\u0005\u001a\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\r\u0010\u0005\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u000e\u0010\u0005\u001a\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0010\u0010\u0005\u001a,\u0010\u0018\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a!\u0010\u001f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010$\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#\u001a)\u0010'\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010)\u001a\u00020\u001a*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Landroid/content/ContentResolver;", "Landroid/net/Uri;", "contentUri", PointerEventHelper.POINTER_TYPE_UNKNOWN, "queryAssetDisplayName", "(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "queryAssetDateTaken", "queryAssetDateModified", "queryAssetDuration", PointerEventHelper.POINTER_TYPE_UNKNOWN, "queryAssetWidth", "queryAssetHeight", "queryAssetData", "queryAssetBucketId", "Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;", "queryAssetMediaStoreItem", "displayName", "Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;", "mimeType", "Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;", "relativePath", "insertPendingAsset-cT81_0k", "(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "insertPendingAsset", "uri", "Li7/B;", "publishPendingAsset", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "Landroid/content/ContentValues;", "values", "safeUpdate", "(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;)I", "newRelativePath", "updateRelativePath-XUFtwTY", "(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)V", "updateRelativePath", "updateRelativePathAndName-SGAlvP8", "(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "updateRelativePathAndName", "assetPath", "deleteBy", "(Landroid/content/ContentResolver;Ljava/lang/String;)V", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AssetExtensionsKt {

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt$queryAssetBucketId$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class AnonymousClass2 extends AbstractC2853j implements Function2 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(2, Cursor.class, "getInt", "getInt(I)I", 0);
        }

        public final Integer invoke(Cursor p02, int i10) {
            AbstractC2855l.g(p02, "p0");
            return Integer.valueOf(p02.getInt(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Cursor) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt$queryAssetData$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class C25292 extends AbstractC2853j implements Function2 {
        public static final C25292 INSTANCE = new C25292();

        C25292() {
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

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt$queryAssetDateModified$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class C25302 extends AbstractC2853j implements Function2 {
        public static final C25302 INSTANCE = new C25302();

        C25302() {
            super(2, Cursor.class, "getLong", "getLong(I)J", 0);
        }

        public final Long invoke(Cursor p02, int i10) {
            AbstractC2855l.g(p02, "p0");
            return Long.valueOf(p02.getLong(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Cursor) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt$queryAssetDateTaken$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class C25312 extends AbstractC2853j implements Function2 {
        public static final C25312 INSTANCE = new C25312();

        C25312() {
            super(2, Cursor.class, "getLong", "getLong(I)J", 0);
        }

        public final Long invoke(Cursor p02, int i10) {
            AbstractC2855l.g(p02, "p0");
            return Long.valueOf(p02.getLong(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Cursor) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt$queryAssetDisplayName$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class C25322 extends AbstractC2853j implements Function2 {
        public static final C25322 INSTANCE = new C25322();

        C25322() {
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

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt$queryAssetDuration$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class C25332 extends AbstractC2853j implements Function2 {
        public static final C25332 INSTANCE = new C25332();

        C25332() {
            super(2, Cursor.class, "getLong", "getLong(I)J", 0);
        }

        public final Long invoke(Cursor p02, int i10) {
            AbstractC2855l.g(p02, "p0");
            return Long.valueOf(p02.getLong(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Cursor) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt$queryAssetHeight$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class C25342 extends AbstractC2853j implements Function2 {
        public static final C25342 INSTANCE = new C25342();

        C25342() {
            super(2, Cursor.class, "getInt", "getInt(I)I", 0);
        }

        public final Integer invoke(Cursor p02, int i10) {
            AbstractC2855l.g(p02, "p0");
            return Integer.valueOf(p02.getInt(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Cursor) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt$queryAssetMediaStoreItem$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt$queryAssetMediaStoreItem$2", f = "AssetExtensions.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;", "<anonymous>", "(LR8/N;)Lexpo/modules/medialibrary/next/extensions/resolver/AssetMediaStoreItem;"}, k = 3, mv = {2, 1, 0})
    static final class C25352 extends l implements Function2 {
        final /* synthetic */ Uri $contentUri;
        final /* synthetic */ ContentResolver $this_queryAssetMediaStoreItem;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25352(Uri uri, ContentResolver contentResolver, n7.f fVar) {
            super(2, fVar);
            this.$contentUri = uri;
            this.$this_queryAssetMediaStoreItem = contentResolver;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new C25352(this.$contentUri, this.$this_queryAssetMediaStoreItem, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C25352) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            boolean z10 = MediaType.INSTANCE.fromContentUri(this.$contentUri) != MediaType.IMAGE;
            Cursor cursorSafeQuery$default = SafeQueryKt.safeQuery$default(this.$this_queryAssetMediaStoreItem, this.$contentUri, AssetMediaStoreProperty.INSTANCE.projection(z10), null, null, null, 16, null);
            if (cursorSafeQuery$default == null) {
                return null;
            }
            try {
                AssetMediaStoreItem assetMediaStoreItemBuildAssetMediaStoreItem = cursorSafeQuery$default.moveToFirst() ? AssetMediaStoreItemBuilder.INSTANCE.buildAssetMediaStoreItem(cursorSafeQuery$default, z10) : null;
                AbstractC3376c.a(cursorSafeQuery$default, null);
                return assetMediaStoreItemBuildAssetMediaStoreItem;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.next.extensions.resolver.AssetExtensionsKt$queryAssetWidth$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class C25362 extends AbstractC2853j implements Function2 {
        public static final C25362 INSTANCE = new C25362();

        C25362() {
            super(2, Cursor.class, "getInt", "getInt(I)I", 0);
        }

        public final Integer invoke(Cursor p02, int i10) {
            AbstractC2855l.g(p02, "p0");
            return Integer.valueOf(p02.getInt(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Cursor) obj, ((Number) obj2).intValue());
        }
    }

    public static final void deleteBy(ContentResolver contentResolver, String assetPath) {
        AbstractC2855l.g(contentResolver, "<this>");
        AbstractC2855l.g(assetPath, "assetPath");
        contentResolver.delete(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), "_data=?", new String[]{assetPath});
    }

    /* JADX INFO: renamed from: insertPendingAsset-cT81_0k, reason: not valid java name */
    public static final Object m271insertPendingAssetcT81_0k(ContentResolver contentResolver, String str, String str2, String str3, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AssetExtensionsKt$insertPendingAsset$2(str2, contentResolver, str, str3, null), fVar);
    }

    public static final void publishPendingAsset(ContentResolver contentResolver, Uri uri) {
        AbstractC2855l.g(contentResolver, "<this>");
        AbstractC2855l.g(uri, "uri");
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_pending", (Integer) 0);
        safeUpdate(contentResolver, uri, contentValues);
    }

    public static final Object queryAssetBucketId(ContentResolver contentResolver, Uri uri, n7.f fVar) {
        return QueryOneKt.queryOne$default(contentResolver, uri, AssetMediaStoreProperty.BucketId.getColumn(), AnonymousClass2.INSTANCE, null, null, null, fVar, 56, null);
    }

    public static final Object queryAssetData(ContentResolver contentResolver, Uri uri, n7.f fVar) {
        return QueryOneKt.queryOne$default(contentResolver, uri, AssetMediaStoreProperty.Data.getColumn(), C25292.INSTANCE, null, null, null, fVar, 56, null);
    }

    public static final Object queryAssetDateModified(ContentResolver contentResolver, Uri uri, n7.f fVar) {
        return QueryOneKt.queryOne$default(contentResolver, uri, AssetMediaStoreProperty.DateModified.getColumn(), C25302.INSTANCE, null, null, null, fVar, 56, null);
    }

    public static final Object queryAssetDateTaken(ContentResolver contentResolver, Uri uri, n7.f fVar) {
        return QueryOneKt.queryOne$default(contentResolver, uri, AssetMediaStoreProperty.DateTaken.getColumn(), C25312.INSTANCE, null, null, null, fVar, 56, null);
    }

    public static final Object queryAssetDisplayName(ContentResolver contentResolver, Uri uri, n7.f fVar) {
        return QueryOneKt.queryOne$default(contentResolver, uri, AssetMediaStoreProperty.DisplayName.getColumn(), C25322.INSTANCE, null, null, null, fVar, 56, null);
    }

    public static final Object queryAssetDuration(ContentResolver contentResolver, Uri uri, n7.f fVar) {
        return QueryOneKt.queryOne$default(contentResolver, uri, AssetMediaStoreProperty.Duration.getColumn(), C25332.INSTANCE, null, null, null, fVar, 56, null);
    }

    public static final Object queryAssetHeight(ContentResolver contentResolver, Uri uri, n7.f fVar) {
        return QueryOneKt.queryOne$default(contentResolver, uri, AssetMediaStoreProperty.Height.getColumn(), C25342.INSTANCE, null, null, null, fVar, 56, null);
    }

    public static final Object queryAssetMediaStoreItem(ContentResolver contentResolver, Uri uri, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new C25352(uri, contentResolver, null), fVar);
    }

    public static final Object queryAssetWidth(ContentResolver contentResolver, Uri uri, n7.f fVar) {
        return QueryOneKt.queryOne$default(contentResolver, uri, AssetMediaStoreProperty.Width.getColumn(), C25362.INSTANCE, null, null, null, fVar, 56, null);
    }

    public static final int safeUpdate(ContentResolver contentResolver, Uri uri, ContentValues values) {
        AbstractC2855l.g(contentResolver, "<this>");
        AbstractC2855l.g(uri, "uri");
        AbstractC2855l.g(values, "values");
        return Build.VERSION.SDK_INT >= 30 ? contentResolver.update(uri, values, null) : contentResolver.update(uri, values, null, null);
    }

    /* JADX INFO: renamed from: updateRelativePath-XUFtwTY, reason: not valid java name */
    public static final void m272updateRelativePathXUFtwTY(ContentResolver updateRelativePath, Uri contentUri, String newRelativePath) {
        AbstractC2855l.g(updateRelativePath, "$this$updateRelativePath");
        AbstractC2855l.g(contentUri, "contentUri");
        AbstractC2855l.g(newRelativePath, "newRelativePath");
        ContentValues contentValues = new ContentValues();
        contentValues.put("relative_path", newRelativePath);
        updateRelativePath.update(contentUri, contentValues, null, null);
    }

    /* JADX INFO: renamed from: updateRelativePathAndName-SGAlvP8, reason: not valid java name */
    public static final void m273updateRelativePathAndNameSGAlvP8(ContentResolver updateRelativePathAndName, Uri contentUri, String newRelativePath, String displayName) {
        AbstractC2855l.g(updateRelativePathAndName, "$this$updateRelativePathAndName");
        AbstractC2855l.g(contentUri, "contentUri");
        AbstractC2855l.g(newRelativePath, "newRelativePath");
        AbstractC2855l.g(displayName, "displayName");
        ContentValues contentValues = new ContentValues();
        contentValues.put("relative_path", newRelativePath);
        contentValues.put("_display_name", displayName);
        updateRelativePathAndName.update(contentUri, contentValues, null, null);
    }
}
