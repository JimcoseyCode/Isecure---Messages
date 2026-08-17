package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.producers.X;
import com.facebook.react.views.image.ReactImageView;
import j2.InterfaceC2764b;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class D extends AbstractC1968d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f19927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f19928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC2764b f19929e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f19930g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ X.a f19931h;

        a(c cVar, X.a aVar) {
            this.f19930g = cVar;
            this.f19931h = aVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            D.this.e(this.f19930g, this.f19931h);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AbstractC1970f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Future f19933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ X.a f19934b;

        b(Future future, X.a aVar) {
            this.f19933a = future;
            this.f19934b = aVar;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            if (this.f19933a.cancel(false)) {
                this.f19934b.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c extends C {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f19936f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f19937g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f19938h;

        public c(InterfaceC1978n interfaceC1978n, e0 e0Var) {
            super(interfaceC1978n, e0Var);
        }
    }

    public D(int i10) {
        this(null, null, RealtimeSinceBootClock.get());
        this.f19925a = i10;
    }

    private HttpURLConnection b(Uri uri, int i10) throws IOException {
        HttpURLConnection httpURLConnectionJ = j(uri);
        String str = this.f19926b;
        if (str != null) {
            httpURLConnectionJ.setRequestProperty("User-Agent", str);
        }
        Map map = this.f19927c;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionJ.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        httpURLConnectionJ.setConnectTimeout(this.f19925a);
        int responseCode = httpURLConnectionJ.getResponseCode();
        if (h(responseCode)) {
            return httpURLConnectionJ;
        }
        if (!g(responseCode)) {
            httpURLConnectionJ.disconnect();
            throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
        }
        String headerField = httpURLConnectionJ.getHeaderField("Location");
        httpURLConnectionJ.disconnect();
        Uri uri2 = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i10 <= 0 || uri2 == null || c2.i.a(uri2.getScheme(), scheme)) {
            throw new IOException(i10 == 0 ? c("URL %s follows too many redirects", uri.toString()) : c("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        }
        return b(uri2, i10 - 1);
    }

    private static String c(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    private static boolean g(int i10) {
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS /* 300 */:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    private static boolean h(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    static HttpURLConnection j(Uri uri) {
        return (HttpURLConnection) k2.f.q(uri).openConnection();
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c createFetchState(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        return new c(interfaceC1978n, e0Var);
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void fetch(c cVar, X.a aVar) {
        cVar.f19936f = this.f19929e.now();
        cVar.b().k(new b(this.f19928d.submit(new a(cVar, aVar)), aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void e(c cVar, X.a aVar) throws Throwable {
        HttpURLConnection httpURLConnectionB;
        InputStream inputStream = null;
        try {
            httpURLConnectionB = b(cVar.g(), 5);
            try {
                try {
                    cVar.f19937g = this.f19929e.now();
                    if (httpURLConnectionB != null) {
                        inputStream = httpURLConnectionB.getInputStream();
                        aVar.b(inputStream, -1);
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (httpURLConnectionB == null) {
                        return;
                    }
                } catch (IOException e10) {
                    e = e10;
                    aVar.onFailure(e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnectionB == null) {
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (httpURLConnectionB != null) {
                    throw th;
                }
                httpURLConnectionB.disconnect();
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            httpURLConnectionB = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnectionB = null;
            if (inputStream != null) {
            }
            if (httpURLConnectionB != null) {
            }
        }
        httpURLConnectionB.disconnect();
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map getExtraMap(c cVar, int i10) {
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(cVar.f19937g - cVar.f19936f));
        map.put("fetch_time", Long.toString(cVar.f19938h - cVar.f19937g));
        map.put("total_time", Long.toString(cVar.f19938h - cVar.f19936f));
        map.put("image_size", Integer.toString(i10));
        return map;
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onFetchCompletion(c cVar, int i10) {
        cVar.f19938h = this.f19929e.now();
    }

    D(String str, Map map, InterfaceC2764b interfaceC2764b) {
        this.f19928d = Executors.newFixedThreadPool(3);
        this.f19929e = interfaceC2764b;
        this.f19927c = map;
        this.f19926b = str;
    }
}
