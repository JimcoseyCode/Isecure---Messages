package expo.modules.medialibrary;

import R8.N;
import android.content.Context;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.exception.Exceptions;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import o7.AbstractC3016b;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.medialibrary.MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12", f = "MediaLibraryModule.kt", l = {272, 273}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$5"}, k = 3, mv = {2, 1, 0})
public final class MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12 extends l implements o {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MediaLibraryModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12(n7.f fVar, MediaLibraryModule mediaLibraryModule) {
        super(3, fVar);
        this.this$0 = mediaLibraryModule;
    }

    @Override // w7.o
    public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
        MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12 mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12 = new MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12(fVar, this.this$0);
        mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12.L$0 = objArr;
        return mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12.invokeSuspend(C2735B.f28704a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        if (expo.modules.medialibrary.albums.RemoveAssetsFromAlbumKt.removeAssetsFromAlbum(r13, r1, r4, r12) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws PermissionsException, Exceptions.ReactContextLost {
        MediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12 mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12;
        String str;
        String[] strArr;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC2753p.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            String str2 = (String) objArr[1];
            String[] strArr2 = (String[]) obj2;
            MediaLibraryModule.requireSystemPermissions$default(this.this$0, false, 1, null);
            MediaLibraryModule mediaLibraryModule = this.this$0;
            this.L$0 = str2;
            this.L$1 = strArr2;
            this.label = 1;
            mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12 = this;
            if (MediaLibraryModule.requestMediaLibraryActionPermission$default(mediaLibraryModule, strArr2, false, mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12, 2, null) != objE) {
                str = str2;
                strArr = strArr2;
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
        strArr = (String[]) this.L$1;
        str = (String) this.L$0;
        AbstractC2753p.b(obj);
        mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12 = this;
        Context context = mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12.this$0.getContext();
        mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12.L$0 = null;
        mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12.L$1 = null;
        mediaLibraryModule$definition$lambda$23$$inlined$Coroutine$12.label = 2;
    }
}
