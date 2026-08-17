package expo.modules.medialibrary;

import R8.N;
import android.content.Context;
import android.os.Build;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.medialibrary.MediaLibraryUtils;
import expo.modules.medialibrary.albums.AlbumUtilsKt;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.G;
import o7.AbstractC3016b;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32", f = "MediaLibraryModule.kt", l = {332, 333}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$3"}, k = 3, mv = {2, 1, 0})
public final class MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32 extends l implements o {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MediaLibraryModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32(n7.f fVar, MediaLibraryModule mediaLibraryModule) {
        super(3, fVar);
        this.this$0 = mediaLibraryModule;
    }

    @Override // w7.o
    public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
        MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32 mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32 = new MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32(fVar, this.this$0);
        mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32.L$0 = objArr;
        return mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32.invokeSuspend(C2735B.f28704a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0142, code lost:
    
        if (expo.modules.medialibrary.albums.migration.MigrateAlbumKt.migrateAlbum(r13, r4, r1, r12) == r0) goto L49;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws AlbumPathException, EmptyAlbumException, IOException, Exceptions.ReactContextLost {
        MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32 mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32;
        List<MediaLibraryUtils.AssetFile> list;
        File file;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            String str = (String) ((Object[]) this.L$0)[0];
            if (Build.VERSION.SDK_INT < 30) {
                return C2735B.f28704a;
            }
            List<String> assetsInAlbums = AlbumUtilsKt.getAssetsInAlbums(this.this$0.getContext(), str);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : assetsInAlbums) {
                if (((String) obj2).length() > 0) {
                    arrayList.add(obj2);
                }
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (strArr.length == 0) {
                return C2735B.f28704a;
            }
            MediaLibraryUtils mediaLibraryUtils = MediaLibraryUtils.INSTANCE;
            Context context = this.this$0.getContext();
            G g10 = new G(2);
            g10.a(null);
            g10.b(strArr);
            List<MediaLibraryUtils.AssetFile> assetsById = mediaLibraryUtils.getAssetsById(context, (String[]) g10.d(new String[g10.c()]));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj3 : assetsById) {
                File parentFile = ((MediaLibraryUtils.AssetFile) obj3).getParentFile();
                Object arrayList2 = linkedHashMap.get(parentFile);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(parentFile, arrayList2);
                }
                ((List) arrayList2).add(obj3);
            }
            if (linkedHashMap.size() != 1) {
                throw new EmptyAlbumException();
            }
            File parentFile2 = assetsById.get(0).getParentFile();
            if (parentFile2 == null) {
                throw new AlbumPathException();
            }
            if (parentFile2.canWrite()) {
                return C2735B.f28704a;
            }
            ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(assetsById, 10));
            Iterator<T> it = assetsById.iterator();
            while (it.hasNext()) {
                arrayList3.add(((MediaLibraryUtils.AssetFile) it.next()).getAssetId());
            }
            String[] strArr2 = (String[]) arrayList3.toArray(new String[0]);
            MediaLibraryModule mediaLibraryModule = this.this$0;
            this.L$0 = assetsById;
            this.L$1 = parentFile2;
            this.label = 1;
            mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32 = this;
            if (MediaLibraryModule.requestMediaLibraryActionPermission$default(mediaLibraryModule, strArr2, false, mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32, 2, null) != objE) {
                list = assetsById;
                file = parentFile2;
            }
            return objE;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            return C2735B.f28704a;
        }
        file = (File) this.L$1;
        list = (List) this.L$0;
        AbstractC2753p.b(obj);
        mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32 = this;
        Context context2 = mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32.this$0.getContext();
        String name = file.getName();
        AbstractC2855l.f(name, "getName(...)");
        mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32.L$0 = null;
        mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32.L$1 = null;
        mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$32.label = 2;
    }
}
