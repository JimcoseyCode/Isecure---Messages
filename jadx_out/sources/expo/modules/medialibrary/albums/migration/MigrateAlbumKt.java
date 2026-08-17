package expo.modules.medialibrary.albums.migration;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.N;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.AlbumException;
import expo.modules.medialibrary.MediaLibraryUtils;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0087@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/medialibrary/MediaLibraryUtils$AssetFile;", "assetFiles", PointerEventHelper.POINTER_TYPE_UNKNOWN, "albumDirName", "Li7/B;", "migrateAlbum", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MigrateAlbumKt {

    /* JADX INFO: renamed from: expo.modules.medialibrary.albums.migration.MigrateAlbumKt$migrateAlbum$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.albums.migration.MigrateAlbumKt$migrateAlbum$2", f = "MigrateAlbum.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ String $albumDirName;
        final /* synthetic */ List<MediaLibraryUtils.AssetFile> $assetFiles;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(List<MediaLibraryUtils.AssetFile> list, String str, Context context, n7.f fVar) {
            super(2, fVar);
            this.$assetFiles = list;
            this.$albumDirName = str;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new AnonymousClass2(this.$assetFiles, this.$albumDirName, this.$context, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws AlbumException {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            List<MediaLibraryUtils.AssetFile> list = this.$assetFiles;
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(MediaLibraryUtils.INSTANCE.getRelativePathForAssetType(((MediaLibraryUtils.AssetFile) it.next()).getMimeType(), false));
            }
            Set setT0 = AbstractC2800q.T0(arrayList);
            if (setT0.size() > 1) {
                throw new AlbumException("The album contains incompatible file types.");
            }
            String str = setT0.iterator().next() + File.separator + this.$albumDirName;
            ContentValues contentValues = new ContentValues();
            contentValues.put("relative_path", str);
            List<MediaLibraryUtils.AssetFile> list2 = this.$assetFiles;
            Context context = this.$context;
            for (MediaLibraryUtils.AssetFile assetFile : list2) {
                context.getContentResolver().update(ContentUris.withAppendedId(MediaLibraryUtils.INSTANCE.mimeTypeToExternalUri(assetFile.getMimeType()), Long.parseLong(assetFile.getAssetId())), contentValues, null);
            }
            return C2735B.f28704a;
        }
    }

    public static final Object migrateAlbum(Context context, List<MediaLibraryUtils.AssetFile> list, String str, n7.f fVar) {
        Object objG = AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(list, str, context, null), fVar);
        return objG == AbstractC3016b.e() ? objG : C2735B.f28704a;
    }
}
