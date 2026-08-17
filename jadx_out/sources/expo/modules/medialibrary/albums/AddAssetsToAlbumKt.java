package expo.modules.medialibrary.albums;

import R8.AbstractC1413i;
import R8.AbstractC1444y;
import R8.C1404d0;
import R8.D0;
import R8.InterfaceC1440w;
import R8.N;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.medialibrary.AlbumException;
import expo.modules.medialibrary.MediaLibraryUtils;
import expo.modules.medialibrary.PermissionsException;
import expo.modules.medialibrary.albums.AddAssetsToAlbumKt;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a6\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "assetIds", "albumId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "copyToAlbum", "addAssetsToAlbum", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AddAssetsToAlbumKt {

    /* JADX INFO: renamed from: expo.modules.medialibrary.albums.AddAssetsToAlbumKt$addAssetsToAlbum$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.albums.AddAssetsToAlbumKt$addAssetsToAlbum$2", f = "AddAssetsToAlbum.kt", l = {TextAttributeProps.TA_KEY_ROLE, 51}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<anonymous>", "(LR8/N;)Z"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ String $albumId;
        final /* synthetic */ String[] $assetIds;
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $copyToAlbum;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z10, Context context, String str, String[] strArr, n7.f fVar) {
            super(2, fVar);
            this.$copyToAlbum = z10;
            this.$context = context;
            this.$albumId = str;
            this.$assetIds = strArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(AtomicInteger atomicInteger, InterfaceC1440w interfaceC1440w, String str, Uri uri) {
            if (atomicInteger.decrementAndGet() == 0) {
                interfaceC1440w.l0(Boolean.TRUE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$copyToAlbum, this.$context, this.$albumId, this.$assetIds, fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws AlbumException, PermissionsException, IOException {
            N n10;
            AssetFileStrategy copyStrategy;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                n10 = (N) this.L$0;
                copyStrategy = this.$copyToAlbum ? AssetFileStrategy.INSTANCE.getCopyStrategy() : AssetFileStrategy.INSTANCE.getMoveStrategy();
                Context context = this.$context;
                String str = this.$albumId;
                this.L$0 = n10;
                this.L$1 = copyStrategy;
                this.label = 1;
                obj = AlbumUtilsKt.getAlbumFile(context, str, this);
                if (obj != objE) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            copyStrategy = (AssetFileStrategy) this.L$1;
            n10 = (N) this.L$0;
            AbstractC2753p.b(obj);
            File file = (File) obj;
            D0.g(n10.i());
            if (Build.VERSION.SDK_INT >= 30 && !file.canWrite()) {
                throw new PermissionsException("The application doesn't have permission to write to the album's directory. For more information, check out https://expo.fyi/android-r.");
            }
            MediaLibraryUtils mediaLibraryUtils = MediaLibraryUtils.INSTANCE;
            Context context2 = this.$context;
            String[] strArr = this.$assetIds;
            List<MediaLibraryUtils.AssetFile> assetsById = mediaLibraryUtils.getAssetsById(context2, (String[]) Arrays.copyOf(strArr, strArr.length));
            D0.g(n10.i());
            Context context3 = this.$context;
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(assetsById, 10));
            Iterator<T> it = assetsById.iterator();
            while (it.hasNext()) {
                arrayList.add(copyStrategy.apply((MediaLibraryUtils.AssetFile) it.next(), file, context3).getPath());
            }
            D0.g(n10.i());
            final InterfaceC1440w interfaceC1440wB = AbstractC1444y.b(null, 1, null);
            final AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
            MediaScannerConnection.scanFile(this.$context, (String[]) arrayList.toArray(new String[0]), null, new MediaScannerConnection.OnScanCompletedListener() { // from class: expo.modules.medialibrary.albums.a
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str2, Uri uri) {
                    AddAssetsToAlbumKt.AnonymousClass2.invokeSuspend$lambda$1(atomicInteger, interfaceC1440wB, str2, uri);
                }
            });
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            Object objI = interfaceC1440wB.I(this);
            return objI == objE ? objE : objI;
        }
    }

    public static final Object addAssetsToAlbum(Context context, String[] strArr, String str, boolean z10, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(z10, context, str, strArr, null), fVar);
    }
}
