package expo.modules.notifications.notifications.presentation.builders;

import R8.AbstractC1413i;
import R8.C1404d0;
import R8.J;
import R8.N;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.facebook.react.views.text.TextAttributeProps;
import i7.AbstractC2753p;
import i7.C2735B;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@f(c = "expo.modules.notifications.notifications.presentation.builders.DownloadImageKt$downloadImage$2$1", f = "DownloadImage.kt", l = {TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR8/N;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "<anonymous>", "(LR8/N;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 1, 0})
final class DownloadImageKt$downloadImage$2$1 extends l implements Function2 {
    final /* synthetic */ long $connectTimeout;
    final /* synthetic */ Uri $imageUrl;
    final /* synthetic */ long $readTimeout;
    int label;

    /* JADX INFO: renamed from: expo.modules.notifications.notifications.presentation.builders.DownloadImageKt$downloadImage$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.notifications.notifications.presentation.builders.DownloadImageKt$downloadImage$2$1$1", f = "DownloadImage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR8/N;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "<anonymous>", "(LR8/N;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ long $connectTimeout;
        final /* synthetic */ Uri $imageUrl;
        final /* synthetic */ long $readTimeout;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Uri uri, long j10, long j11, n7.f fVar) {
            super(2, fVar);
            this.$imageUrl = uri;
            this.$connectTimeout = j10;
            this.$readTimeout = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new AnonymousClass1(this.$imageUrl, this.$connectTimeout, this.$readTimeout, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            AbstractC3016b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            URLConnection uRLConnectionOpenConnection = new URL(this.$imageUrl.toString()).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout((int) this.$connectTimeout);
            uRLConnectionOpenConnection.setReadTimeout((int) this.$readTimeout);
            return BitmapFactory.decodeStream(uRLConnectionOpenConnection.getInputStream());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadImageKt$downloadImage$2$1(Uri uri, long j10, long j11, n7.f fVar) {
        super(2, fVar);
        this.$imageUrl = uri;
        this.$connectTimeout = j10;
        this.$readTimeout = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final n7.f create(Object obj, n7.f fVar) {
        return new DownloadImageKt$downloadImage$2$1(this.$imageUrl, this.$connectTimeout, this.$readTimeout, fVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, n7.f fVar) {
        return ((DownloadImageKt$downloadImage$2$1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objE = AbstractC3016b.e();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            return obj;
        }
        AbstractC2753p.b(obj);
        J jB = C1404d0.b();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$imageUrl, this.$connectTimeout, this.$readTimeout, null);
        this.label = 1;
        Object objG = AbstractC1413i.g(jB, anonymousClass1, this);
        return objG == objE ? objE : objG;
    }
}
