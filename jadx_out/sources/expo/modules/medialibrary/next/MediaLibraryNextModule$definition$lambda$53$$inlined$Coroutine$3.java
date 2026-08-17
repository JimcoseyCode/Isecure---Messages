package expo.modules.medialibrary.next;

import R8.N;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.next.exceptions.AlbumPropertyNotFoundException;
import expo.modules.medialibrary.next.exceptions.ContentResolverNotObtainedException;
import expo.modules.medialibrary.next.objects.album.Album;
import expo.modules.medialibrary.next.objects.asset.factories.AssetFactory;
import expo.modules.medialibrary.next.objects.wrappers.RelativePath;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import o7.AbstractC3016b;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3", f = "MediaLibraryNextModule.kt", l = {271, 271}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$5"}, k = 3, mv = {2, 1, 0})
public final class MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3 extends l implements o {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MediaLibraryNextModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3(n7.f fVar, MediaLibraryNextModule mediaLibraryNextModule) {
        super(3, fVar);
        this.this$0 = mediaLibraryNextModule;
    }

    @Override // w7.o
    public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
        MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3 mediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3 = new MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3(fVar, this.this$0);
        mediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3.L$0 = objArr;
        return mediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3.invokeSuspend(C2735B.f28704a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws AlbumPropertyNotFoundException, ContentResolverNotObtainedException {
        Uri uri;
        AssetFactory assetFactory;
        String str;
        Object objM275getRelativePathMwbCjzw;
        Uri uri2;
        AssetFactory assetFactory2;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            Album album = (Album) objArr[1];
            uri = (Uri) obj2;
            assetFactory = this.this$0.getAssetFactory();
            if (album == null) {
                str = null;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                Object objMo289createBuevYFM = assetFactory.mo289createBuevYFM(uri, str, this);
                return objMo289createBuevYFM != objE ? objE : objMo289createBuevYFM;
            }
            this.L$0 = uri;
            this.L$1 = assetFactory;
            this.label = 1;
            objM275getRelativePathMwbCjzw = album.m275getRelativePathMwbCjzw(this);
            if (objM275getRelativePathMwbCjzw != objE) {
                uri2 = uri;
                assetFactory2 = assetFactory;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            return obj;
        }
        assetFactory2 = (AssetFactory) this.L$1;
        uri2 = (Uri) this.L$0;
        AbstractC2753p.b(obj);
        objM275getRelativePathMwbCjzw = ((RelativePath) obj).m318unboximpl();
        str = (String) objM275getRelativePathMwbCjzw;
        assetFactory = assetFactory2;
        uri = uri2;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object objMo289createBuevYFM2 = assetFactory.mo289createBuevYFM(uri, str, this);
        if (objMo289createBuevYFM2 != objE) {
        }
    }
}
