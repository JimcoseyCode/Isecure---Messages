package expo.modules.image.okhttp;

import B1.n;
import B1.o;
import B1.r;
import com.facebook.react.modules.network.ProgressListener;
import com.facebook.react.modules.network.ProgressResponseBody;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.D;
import e9.E;
import e9.v;
import e9.z;
import expo.modules.image.events.OkHttpProgressListener;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import v1.h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Lexpo/modules/image/okhttp/GlideUrlWrapperLoader;", "LB1/n;", "Lexpo/modules/image/okhttp/GlideUrlWrapper;", "Ljava/io/InputStream;", "Le9/z;", "commonClient", "<init>", "(Le9/z;)V", "model", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "height", "Lv1/h;", "options", "LB1/n$a;", "buildLoadData", "(Lexpo/modules/image/okhttp/GlideUrlWrapper;IILv1/h;)LB1/n$a;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "handles", "(Lexpo/modules/image/okhttp/GlideUrlWrapper;)Z", "Le9/z;", "Factory", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GlideUrlWrapperLoader implements n {
    private final z commonClient;

    public GlideUrlWrapperLoader(z commonClient) {
        AbstractC2855l.g(commonClient, "commonClient");
        this.commonClient = commonClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D buildLoadData$lambda$1(final GlideUrlWrapper glideUrlWrapper, v.a chain) {
        AbstractC2855l.g(chain, "chain");
        D dA = chain.a(chain.d());
        D.a aVarU0 = dA.u0();
        E eR = dA.r();
        if (eR != null) {
            return aVarU0.b(new ProgressResponseBody(eR, new ProgressListener() { // from class: expo.modules.image.okhttp.b
                @Override // com.facebook.react.modules.network.ProgressListener
                public final void onProgress(long j10, long j11, boolean z10) {
                    GlideUrlWrapperLoader.buildLoadData$lambda$1$lambda$0(glideUrlWrapper, j10, j11, z10);
                }
            })).c();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildLoadData$lambda$1$lambda$0(GlideUrlWrapper glideUrlWrapper, long j10, long j11, boolean z10) {
        OkHttpProgressListener progressListener = glideUrlWrapper.getProgressListener();
        if (progressListener != null) {
            progressListener.onProgress(j10, j11, z10);
        }
    }

    @Override // B1.n
    public boolean handles(GlideUrlWrapper model) {
        AbstractC2855l.g(model, "model");
        return true;
    }

    @Override // B1.n
    public n.a buildLoadData(final GlideUrlWrapper model, int width, int height, h options) {
        AbstractC2855l.g(model, "model");
        AbstractC2855l.g(options, "options");
        return new com.bumptech.glide.integration.okhttp3.a(this.commonClient.C().a(new v() { // from class: expo.modules.image.okhttp.a
            @Override // e9.v
            public final D intercept(v.a aVar) {
                return GlideUrlWrapperLoader.buildLoadData$lambda$1(model, aVar);
            }
        }).c()).buildLoadData(model.getGlideUrl(), width, height, options);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lexpo/modules/image/okhttp/GlideUrlWrapperLoader$Factory;", "LB1/o;", "Lexpo/modules/image/okhttp/GlideUrlWrapper;", "Ljava/io/InputStream;", "Le9/z;", "commonClient", "<init>", "(Le9/z;)V", "LB1/r;", "multiFactory", "LB1/n;", "build", "(LB1/r;)LB1/n;", "Li7/B;", "teardown", "()V", "Le9/z;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements o {
        private final z commonClient;

        public Factory(z commonClient) {
            AbstractC2855l.g(commonClient, "commonClient");
            this.commonClient = commonClient;
        }

        @Override // B1.o
        public n build(r multiFactory) {
            AbstractC2855l.g(multiFactory, "multiFactory");
            return new GlideUrlWrapperLoader(this.commonClient);
        }

        @Override // B1.o
        public void teardown() {
        }
    }
}
