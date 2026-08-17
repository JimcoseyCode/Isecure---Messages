package expo.modules.medialibrary.next;

import R8.N;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.next.exceptions.ContentResolverNotObtainedException;
import expo.modules.medialibrary.next.objects.album.Album;
import expo.modules.medialibrary.next.objects.asset.Asset;
import expo.modules.medialibrary.next.objects.asset.deleters.AssetDeleter;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import o7.AbstractC3016b;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11", f = "MediaLibraryNextModule.kt", l = {272, 283}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$3"}, k = 3, mv = {2, 1, 0})
public final class MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11 extends l implements o {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MediaLibraryNextModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11(n7.f fVar, MediaLibraryNextModule mediaLibraryNextModule) {
        super(3, fVar);
        this.this$0 = mediaLibraryNextModule;
    }

    @Override // w7.o
    public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
        MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11 mediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11 = new MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11(fVar, this.this$0);
        mediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11.L$0 = objArr;
        return mediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11.invokeSuspend(C2735B.f28704a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        if (r8.delete(r1, r7) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0062 -> B:17:0x0063). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws ContentResolverNotObtainedException {
        Collection arrayList;
        Iterator it;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            List list = (List) ((Object[]) this.L$0)[0];
            arrayList = new ArrayList(AbstractC2800q.u(list, 10));
            it = list.iterator();
            if (it.hasNext()) {
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
        arrayList = (Collection) this.L$2;
        it = (Iterator) this.L$1;
        Collection collection = (Collection) this.L$0;
        AbstractC2753p.b(obj);
        arrayList.add((List) obj);
        arrayList = collection;
        if (it.hasNext()) {
            Album album = (Album) it.next();
            this.L$0 = arrayList;
            this.L$1 = it;
            this.L$2 = arrayList;
            this.label = 1;
            obj = album.getAssets(this);
            if (obj != objE) {
                collection = arrayList;
                arrayList.add((List) obj);
                arrayList = collection;
                if (it.hasNext()) {
                    List listW = AbstractC2800q.w((List) arrayList);
                    ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(listW, 10));
                    Iterator it2 = listW.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Asset) it2.next()).getContentUri());
                    }
                    AssetDeleter assetDeleter = this.this$0.getAssetDeleter();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                }
            }
        }
        return objE;
    }
}
