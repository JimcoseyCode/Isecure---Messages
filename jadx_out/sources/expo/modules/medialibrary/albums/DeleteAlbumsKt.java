package expo.modules.medialibrary.albums;

import android.content.Context;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.medialibrary.MediaLibraryUtils;
import i7.AbstractC2753p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a&\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "albumIds", PointerEventHelper.POINTER_TYPE_UNKNOWN, "deleteAlbums", "(Landroid/content/Context;[Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DeleteAlbumsKt {

    /* JADX INFO: renamed from: expo.modules.medialibrary.albums.DeleteAlbumsKt$deleteAlbums$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.albums.DeleteAlbumsKt", f = "DeleteAlbums.kt", l = {12, TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION}, m = "deleteAlbums")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return DeleteAlbumsKt.deleteAlbums(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object deleteAlbums(Context context, String[] strArr, n7.f fVar) {
        AnonymousClass1 anonymousClass1;
        String str;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object objDeleteAssets = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(objDeleteAssets);
            MediaLibraryUtils mediaLibraryUtils = MediaLibraryUtils.INSTANCE;
            String str2 = "bucket_id IN (" + mediaLibraryUtils.queryPlaceholdersFor(strArr) + ")";
            str = "bucket_id IN (" + mediaLibraryUtils.queryPlaceholdersFor(strArr) + ")";
            anonymousClass1.L$0 = context;
            anonymousClass1.L$1 = strArr;
            anonymousClass1.L$2 = str;
            anonymousClass1.label = 1;
            objDeleteAssets = mediaLibraryUtils.deleteAssets(context, str2, strArr, anonymousClass1);
            if (objDeleteAssets != objE) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objDeleteAssets);
            return objDeleteAssets;
        }
        String str3 = (String) anonymousClass1.L$2;
        strArr = (String[]) anonymousClass1.L$1;
        Context context2 = (Context) anonymousClass1.L$0;
        AbstractC2753p.b(objDeleteAssets);
        str = str3;
        context = context2;
        if (!((Boolean) objDeleteAssets).booleanValue()) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        MediaLibraryUtils mediaLibraryUtils2 = MediaLibraryUtils.INSTANCE;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.label = 2;
        Object objDeleteAssets2 = mediaLibraryUtils2.deleteAssets(context, str, strArr, anonymousClass1);
        return objDeleteAssets2 == objE ? objE : objDeleteAssets2;
    }
}
