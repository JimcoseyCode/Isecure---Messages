package expo.modules.medialibrary.assets;

import android.content.Context;
import androidx.customview.widget.a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.AssetFileException;
import expo.modules.medialibrary.UnableToLoadPermissionException;
import expo.modules.medialibrary.UnableToSaveException;
import expo.modules.medialibrary.albums.AlbumUtilsKt;
import i7.AbstractC2753p;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "uri", PointerEventHelper.POINTER_TYPE_UNKNOWN, "resolveWithAdditionalData", "albumId", "Ljava/util/ArrayList;", "Landroid/os/Bundle;", "Lkotlin/collections/ArrayList;", "createAssetWithAlbumId", "(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Ln7/f;)Ljava/lang/Object;", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CreateAssetKt {

    /* JADX INFO: renamed from: expo.modules.medialibrary.assets.CreateAssetKt$createAssetWithAlbumId$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.assets.CreateAssetKt", f = "CreateAsset.kt", l = {179, 180}, m = "createAssetWithAlbumId")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= a.INVALID_ID;
            return CreateAssetKt.createAssetWithAlbumId(null, null, false, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createAssetWithAlbumId(Context context, String str, boolean z10, String str2, n7.f fVar) throws UnableToSaveException, UnableToLoadPermissionException, IOException, AssetFileException {
        AnonymousClass1 anonymousClass1;
        File file;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object albumFileOrNull = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(albumFileOrNull);
            if (str2 == null) {
                file = null;
                CreateAssetWithAlbumFile createAssetWithAlbumFile = new CreateAssetWithAlbumFile(context, str, z10, file);
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                Object objExecute = createAssetWithAlbumFile.execute(anonymousClass1);
                return objExecute != objE ? objE : objExecute;
            }
            anonymousClass1.L$0 = context;
            anonymousClass1.L$1 = str;
            anonymousClass1.Z$0 = z10;
            anonymousClass1.label = 1;
            albumFileOrNull = AlbumUtilsKt.getAlbumFileOrNull(context, str2, anonymousClass1);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(albumFileOrNull);
                return albumFileOrNull;
            }
            z10 = anonymousClass1.Z$0;
            str = (String) anonymousClass1.L$1;
            context = (Context) anonymousClass1.L$0;
            AbstractC2753p.b(albumFileOrNull);
        }
        file = (File) albumFileOrNull;
        CreateAssetWithAlbumFile createAssetWithAlbumFile2 = new CreateAssetWithAlbumFile(context, str, z10, file);
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        Object objExecute2 = createAssetWithAlbumFile2.execute(anonymousClass1);
        if (objExecute2 != objE) {
        }
    }

    public static /* synthetic */ Object createAssetWithAlbumId$default(Context context, String str, boolean z10, String str2, n7.f fVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return createAssetWithAlbumId(context, str, z10, str2, fVar);
    }
}
