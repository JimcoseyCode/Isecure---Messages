package expo.modules.clipboard;

import R8.N;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.exception.CodedException;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import o7.AbstractC3016b;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "expo.modules.clipboard.ClipboardModule$definition$lambda$12$$inlined$Coroutine$2", f = "ClipboardModule.kt", l = {282}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LR8/N;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<destruct>", "<anonymous>", "(LR8/N;Lkotlin/Array;)Ljava/lang/Object;", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$3"}, k = 3, mv = {2, 1, 0})
public final class ClipboardModule$definition$lambda$12$$inlined$Coroutine$2 extends l implements o {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClipboardModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipboardModule$definition$lambda$12$$inlined$Coroutine$2(n7.f fVar, ClipboardModule clipboardModule) {
        super(3, fVar);
        this.this$0 = clipboardModule;
    }

    @Override // w7.o
    public final Object invoke(N n10, Object[] objArr, n7.f fVar) {
        ClipboardModule$definition$lambda$12$$inlined$Coroutine$2 clipboardModule$definition$lambda$12$$inlined$Coroutine$2 = new ClipboardModule$definition$lambda$12$$inlined$Coroutine$2(fVar, this.this$0);
        clipboardModule$definition$lambda$12$$inlined$Coroutine$2.L$0 = objArr;
        return clipboardModule$definition$lambda$12$$inlined$Coroutine$2.invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ClipData.Item firstItem;
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                GetImageOptions getImageOptions = (GetImageOptions) ((Object[]) this.L$0)[0];
                ClipboardManager clipboardManager = this.this$0.getClipboardManager();
                if (!this.this$0.clipboardHasItemWithType("image/*")) {
                    clipboardManager = null;
                }
                Uri uri = (clipboardManager == null || (firstItem = this.this$0.getFirstItem(clipboardManager)) == null) ? null : firstItem.getUri();
                if (uri == null) {
                    return null;
                }
                Context context = this.this$0.getContext();
                this.label = 1;
                obj = ClipboardImageKt.imageFromContentUri(context, uri, getImageOptions, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            return ((ImageResult) obj).toBundle();
        } catch (Throwable th) {
            th.printStackTrace();
            if (th instanceof CodedException) {
                throw th;
            }
            throw (th instanceof SecurityException ? new NoPermissionException(th) : new PasteFailureException(th, "image"));
        }
    }
}
