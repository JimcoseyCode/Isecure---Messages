package expo.modules.medialibrary.albums.migration;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.D0;
import R8.N;
import android.content.Context;
import android.database.Cursor;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.AlbumNotFound;
import expo.modules.medialibrary.MediaLibraryConstantsKt;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;
import t7.AbstractC3376c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0083@¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "albumId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "checkIfAlbumShouldBeMigrated", "(Landroid/content/Context;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;", "Ljava/io/File;", "getAlbumDirectory", "expo-media-library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CheckIfAlbumShouldBeMigratedKt {

    /* JADX INFO: renamed from: expo.modules.medialibrary.albums.migration.CheckIfAlbumShouldBeMigratedKt$checkIfAlbumShouldBeMigrated$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.albums.migration.CheckIfAlbumShouldBeMigratedKt", f = "CheckIfAlbumShouldBeMigrated.kt", l = {16}, m = "checkIfAlbumShouldBeMigrated")
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
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return CheckIfAlbumShouldBeMigratedKt.checkIfAlbumShouldBeMigrated(null, null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.medialibrary.albums.migration.CheckIfAlbumShouldBeMigratedKt$getAlbumDirectory$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.medialibrary.albums.migration.CheckIfAlbumShouldBeMigratedKt$getAlbumDirectory$2", f = "CheckIfAlbumShouldBeMigrated.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Ljava/io/File;", "<anonymous>", "(LR8/N;)Ljava/io/File;"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        final /* synthetic */ String $albumId;
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Context context, n7.f fVar) {
            super(2, fVar);
            this.$albumId = str;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$albumId, this.$context, fVar);
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
            String[] strArr = {this.$albumId};
            Cursor cursorQuery = this.$context.getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), new String[]{"_data"}, "media_type != 0 AND bucket_id=?", strArr, null);
            try {
                D0.g(n10.i());
                if (cursorQuery != null && cursorQuery.moveToNext()) {
                    File file = new File(cursorQuery.getString(cursorQuery.getColumnIndex("_data")));
                    if (file.isFile()) {
                        String parent = file.getParent();
                        if (parent == null) {
                            AbstractC3376c.a(cursorQuery, null);
                            return null;
                        }
                        File file2 = new File(parent);
                        AbstractC3376c.a(cursorQuery, null);
                        return file2;
                    }
                }
                C2735B c2735b = C2735B.f28704a;
                AbstractC3376c.a(cursorQuery, null);
                return null;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object checkIfAlbumShouldBeMigrated(Context context, String str, n7.f fVar) throws AlbumNotFound {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object albumDirectory = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            AbstractC2753p.b(albumDirectory);
            anonymousClass1.label = 1;
            albumDirectory = getAlbumDirectory(context, str, anonymousClass1);
            if (albumDirectory == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(albumDirectory);
        }
        if (((File) albumDirectory) != null) {
            return b.a(!r6.canWrite());
        }
        throw new AlbumNotFound();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getAlbumDirectory(Context context, String str, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new AnonymousClass2(str, context, null), fVar);
    }
}
