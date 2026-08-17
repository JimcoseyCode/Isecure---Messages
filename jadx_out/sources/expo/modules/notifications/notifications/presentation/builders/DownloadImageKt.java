package expo.modules.notifications.notifications.presentation.builders;

import R8.Z0;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.customview.widget.a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import i7.AbstractC2753p;
import i7.C2752o;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/net/Uri;", "imageUrl", PointerEventHelper.POINTER_TYPE_UNKNOWN, "connectTimeout", "readTimeout", "Landroid/graphics/Bitmap;", "downloadImage", "(Landroid/net/Uri;JJLn7/f;)Ljava/lang/Object;", "expo-notifications_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DownloadImageKt {

    /* JADX INFO: renamed from: expo.modules.notifications.notifications.presentation.builders.DownloadImageKt$downloadImage$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.notifications.notifications.presentation.builders.DownloadImageKt", f = "DownloadImage.kt", l = {TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION}, m = "downloadImage")
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
            this.label |= a.INVALID_ID;
            return DownloadImageKt.downloadImage(null, 0L, 0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object downloadImage(Uri uri, long j10, long j11, n7.f fVar) {
        AnonymousClass1 anonymousClass1;
        Object objB;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object objC = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                AbstractC2753p.b(objC);
                C2752o.a aVar = C2752o.f28721h;
                DownloadImageKt$downloadImage$2$1 downloadImageKt$downloadImage$2$1 = new DownloadImageKt$downloadImage$2$1(uri, j10, j11, null);
                anonymousClass1.label = 1;
                objC = Z0.c(j10 + j11, downloadImageKt$downloadImage$2$1, anonymousClass1);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(objC);
            }
            objB = C2752o.b((Bitmap) objC);
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            objB = C2752o.b(AbstractC2753p.a(th));
        }
        if (C2752o.f(objB)) {
            return null;
        }
        return objB;
    }

    public static /* synthetic */ Object downloadImage$default(Uri uri, long j10, long j11, n7.f fVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 8000;
        }
        if ((i10 & 4) != 0) {
            j11 = 8000;
        }
        return downloadImage(uri, j10, j11, fVar);
    }
}
