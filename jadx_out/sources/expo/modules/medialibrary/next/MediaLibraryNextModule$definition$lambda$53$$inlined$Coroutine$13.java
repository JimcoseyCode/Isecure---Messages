package expo.modules.medialibrary.next;

import R8.N;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.medialibrary.next.objects.asset.Asset;
import expo.modules.medialibrary.next.objects.asset.deleters.AssetDeleter;
import i7.AbstractC2753p;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import o7.AbstractC3016b;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$13", f = "MediaLibraryNextModule.kt", l = {271}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$3"}, k = 3, mv = {2, 1, 0})
public final class MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$13 extends l implements o {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MediaLibraryNextModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$13(n7.f fVar, MediaLibraryNextModule mediaLibraryNextModule) {
        super(3, fVar);
        this.this$0 = mediaLibraryNextModule;
    }

    @Override // w7.o
    public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
        MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$13 mediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$13 = new MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$13(fVar, this.this$0);
        mediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$13.L$0 = objArr;
        return mediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$13.invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            List list = (List) ((Object[]) this.L$0)[0];
            AssetDeleter assetDeleter = this.this$0.getAssetDeleter();
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Asset) it.next()).getContentUri());
            }
            this.label = 1;
            if (assetDeleter.delete(arrayList, this) == objE) {
                return objE;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
        }
        return C2735B.f28704a;
    }
}
