package expo.modules.fetch;

import P8.q;
import android.content.Context;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.A;
import e9.B;
import e9.D;
import e9.E;
import e9.u;
import e9.v;
import e9.x;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.j;
import t9.s;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001c¨\u0006\u001e"}, d2 = {"Lexpo/modules/fetch/OkHttpFileUrlInterceptor;", "Le9/v;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Le9/u;", "url", PointerEventHelper.POINTER_TYPE_UNKNOWN, "restoreFileUrl", "(Le9/u;)Ljava/lang/String;", "Le9/B;", "request", "Le9/D;", "createFileNotFoundResponse", "(Le9/B;)Le9/D;", "fileName", "Le9/x;", "createMediaType", "(Ljava/lang/String;)Le9/x;", "Le9/v$a;", "chain", "intercept", "(Le9/v$a;)Le9/D;", "Le9/E;", "createAssetResponseBody", "(Landroid/content/Context;Ljava/lang/String;)Le9/E;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "Companion", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OkHttpFileUrlInterceptor implements v {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final WeakReference<Context> context;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lexpo/modules/fetch/OkHttpFileUrlInterceptor$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "handleFileUrl", "Ljava/net/URL;", "url", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final URL handleFileUrl(URL url) {
            AbstractC2855l.g(url, "url");
            if (!AbstractC2855l.b(url.getProtocol(), "file")) {
                return url;
            }
            return new URL("http://filesystem.local" + url.getPath());
        }

        private Companion() {
        }
    }

    public OkHttpFileUrlInterceptor(Context context) {
        AbstractC2855l.g(context, "context");
        this.context = new WeakReference<>(context);
    }

    private final D createFileNotFoundResponse(B request) {
        return new D.a().r(request).p(A.HTTP_1_1).g(404).m("File not found").b(E.Companion.e("File not found", x.f26347g.b("text/plain"))).c();
    }

    private final x createMediaType(String fileName) {
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(fileName);
        if (strGuessContentTypeFromName == null) {
            strGuessContentTypeFromName = "application/octet-stream";
        }
        x.a aVar = x.f26347g;
        x xVarC = aVar.c(strGuessContentTypeFromName);
        return xVarC == null ? aVar.b("application/octet-stream") : xVarC;
    }

    private final String restoreFileUrl(u url) {
        return q.G(url.toString(), "http://filesystem.local", "file://", false, 4, null);
    }

    public final E createAssetResponseBody(Context context, String fileName) throws IOException {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(fileName, "fileName");
        InputStream inputStreamOpen = context.getAssets().open(fileName);
        AbstractC2855l.f(inputStreamOpen, "open(...)");
        return E.b.i(E.Companion, s.d(s.k(inputStreamOpen)), createMediaType(fileName), 0L, 2, null);
    }

    @Override // e9.v
    public D intercept(v.a chain) throws FetchAndroidContextLostException {
        AbstractC2855l.g(chain, "chain");
        B bD = chain.d();
        String strRestoreFileUrl = restoreFileUrl(bD.p());
        if (!q.K(strRestoreFileUrl, "file://", false, 2, null)) {
            return chain.a(bD);
        }
        if (q.K(strRestoreFileUrl, "file:///android_asset/", false, 2, null)) {
            String strW0 = q.w0(strRestoreFileUrl, "file:///android_asset/");
            Context context = this.context.get();
            if (context == null) {
                throw new FetchAndroidContextLostException();
            }
            try {
                return new D.a().r(bD).p(A.HTTP_1_1).g(200).m("OK").b(createAssetResponseBody(context, strW0)).c();
            } catch (IOException unused) {
                return createFileNotFoundResponse(bD);
            }
        }
        String strSubstring = strRestoreFileUrl.substring(7);
        AbstractC2855l.f(strSubstring, "substring(...)");
        File file = new File(strSubstring);
        if (!file.exists()) {
            return createFileNotFoundResponse(bD);
        }
        E.b bVar = E.Companion;
        j jVarD = s.d(s.j(file));
        String name = file.getName();
        AbstractC2855l.f(name, "getName(...)");
        return new D.a().r(bD).p(A.HTTP_1_1).g(200).m("OK").b(bVar.f(jVarD, createMediaType(name), file.length())).c();
    }
}
