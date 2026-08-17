package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import v1.EnumC3417a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class j implements d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final b f19176m = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final B1.h f19177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f19178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f19179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private HttpURLConnection f19180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InputStream f19181k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f19182l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface b {
        HttpURLConnection a(URL url);
    }

    public j(B1.h hVar, int i10) {
        this(hVar, i10, f19176m);
    }

    private HttpURLConnection a(URL url, Map map) throws v1.e {
        try {
            HttpURLConnection httpURLConnectionA = this.f19179i.a(url);
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionA.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnectionA.setConnectTimeout(this.f19178h);
            httpURLConnectionA.setReadTimeout(this.f19178h);
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setInstanceFollowRedirects(false);
            return httpURLConnectionA;
        } catch (IOException e10) {
            throw new v1.e("URL.openConnection threw", 0, e10);
        }
    }

    private static int b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    private InputStream c(HttpURLConnection httpURLConnection) throws v1.e {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f19181k = Q1.c.e(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.f19181k = httpURLConnection.getInputStream();
            }
            return this.f19181k;
        } catch (IOException e10) {
            throw new v1.e("Failed to obtain InputStream", b(httpURLConnection), e10);
        }
    }

    private static boolean d(int i10) {
        return i10 / 100 == 2;
    }

    private static boolean e(int i10) {
        return i10 / 100 == 3;
    }

    private InputStream f(URL url, int i10, URL url2, Map map) throws v1.e {
        if (i10 >= 5) {
            throw new v1.e("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new v1.e("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionA = a(url, map);
        this.f19180j = httpURLConnectionA;
        try {
            httpURLConnectionA.connect();
            this.f19181k = this.f19180j.getInputStream();
            if (this.f19182l) {
                return null;
            }
            int iB = b(this.f19180j);
            if (d(iB)) {
                return c(this.f19180j);
            }
            if (!e(iB)) {
                if (iB == -1) {
                    throw new v1.e(iB);
                }
                try {
                    throw new v1.e(this.f19180j.getResponseMessage(), iB);
                } catch (IOException e10) {
                    throw new v1.e("Failed to get a response message", iB, e10);
                }
            }
            String headerField = this.f19180j.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new v1.e("Received empty or null redirect url", iB);
            }
            try {
                URL url3 = new URL(url, headerField);
                cleanup();
                return f(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new v1.e("Bad redirect url: " + headerField, iB, e11);
            }
        } catch (IOException e12) {
            throw new v1.e("Failed to connect or obtain data", b(this.f19180j), e12);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f19182l = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        InputStream inputStream = this.f19181k;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f19180j;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f19180j = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public EnumC3417a getDataSource() {
        return EnumC3417a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void loadData(com.bumptech.glide.g gVar, d.a aVar) {
        long jB = Q1.g.b();
        try {
            try {
                aVar.c(f(this.f19177g.toURL(), 0, null, this.f19177g.getHeaders()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Q1.g.a(jB);
                }
            } catch (IOException e10) {
                aVar.a(e10);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Q1.g.a(jB);
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Q1.g.a(jB);
            }
            throw th;
        }
    }

    j(B1.h hVar, int i10, b bVar) {
        this.f19177g = hVar;
        this.f19178h = i10;
        this.f19179i = bVar;
    }
}
