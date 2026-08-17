package com.google.android.datatransport.cct;

import V3.j;
import V3.k;
import V3.l;
import V3.m;
import V3.n;
import V3.o;
import V3.p;
import W3.h;
import W3.i;
import X3.f;
import X3.g;
import X3.m;
import a4.AbstractC1595a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import b4.AbstractC1805b;
import b4.InterfaceC1804a;
import b4.InterfaceC1806c;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import com.google.android.datatransport.cct.d;
import g4.InterfaceC2673a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import v5.InterfaceC3428a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3428a f20910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f20911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f20912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final URL f20913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC2673a f20914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC2673a f20915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f20916g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final URL f20917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final j f20918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f20919c;

        a(URL url, j jVar, String str) {
            this.f20917a = url;
            this.f20918b = jVar;
            this.f20919c = str;
        }

        a a(URL url) {
            return new a(url, this.f20918b, this.f20919c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f20920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final URL f20921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f20922c;

        b(int i10, URL url, long j10) {
            this.f20920a = i10;
            this.f20921b = url;
            this.f20922c = j10;
        }
    }

    d(Context context, InterfaceC2673a interfaceC2673a, InterfaceC2673a interfaceC2673a2, int i10) {
        this.f20910a = j.b();
        this.f20912c = context;
        this.f20911b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f20913d = m(com.google.android.datatransport.cct.a.f20901c);
        this.f20914e = interfaceC2673a2;
        this.f20915f = interfaceC2673a;
        this.f20916g = i10;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.f20921b;
        if (url == null) {
            return null;
        }
        AbstractC1595a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f20921b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        AbstractC1595a.f("CctTransportBackend", "Making request to: %s", aVar.f20917a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f20917a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f20916g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f20919c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f20910a.a(aVar.f20918b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC1595a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    AbstractC1595a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC1595a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamL = l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(inputStreamL))).c());
                            if (inputStreamL != null) {
                                inputStreamL.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ConnectException e10) {
            e = e10;
            AbstractC1595a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            AbstractC1595a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            AbstractC1595a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(ReactFontManager.TypefaceStyle.NORMAL, null, 0L);
        } catch (v5.b e13) {
            e = e13;
            AbstractC1595a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(ReactFontManager.TypefaceStyle.NORMAL, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.j();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.j();
        }
        if (o.b.h(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.j() : networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            AbstractC1595a.d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private j i(f fVar) {
        l.a aVarJ;
        HashMap map = new HashMap();
        for (i iVar : fVar.b()) {
            String strJ = iVar.j();
            if (map.containsKey(strJ)) {
                ((List) map.get(strJ)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                map.put(strJ, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            m.a aVarB = V3.m.a().f(p.DEFAULT).g(this.f20915f.a()).h(this.f20914e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(V3.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b(Constants.LOCALE)).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h hVarE = iVar3.e();
                U3.c cVarB = hVarE.b();
                if (cVarB.equals(U3.c.b("proto"))) {
                    aVarJ = l.j(hVarE.a());
                } else if (cVarB.equals(U3.c.b("json"))) {
                    aVarJ = l.i(new String(hVarE.a(), Charset.forName("UTF-8")));
                } else {
                    AbstractC1595a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", cVarB);
                }
                aVarJ.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.h(iVar3.g("net-type"))).b(o.b.h(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVarJ.b(iVar3.d());
                }
                arrayList3.add(aVarJ.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / ProgressBarContainerView.MAX_PROGRESS;
    }

    private static InputStream l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // X3.m
    public g a(f fVar) {
        j jVarI = i(fVar);
        URL urlM = this.f20913d;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a aVarC = com.google.android.datatransport.cct.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlM = m(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) AbstractC1805b.a(5, new a(urlM, jVarI, strD), new InterfaceC1804a() { // from class: com.google.android.datatransport.cct.b
                @Override // b4.InterfaceC1804a
                public final Object apply(Object obj) {
                    return this.f20909a.e((d.a) obj);
                }
            }, new InterfaceC1806c() { // from class: com.google.android.datatransport.cct.c
                @Override // b4.InterfaceC1806c
                public final Object a(Object obj, Object obj2) {
                    return d.d((d.a) obj, (d.b) obj2);
                }
            });
            int i10 = bVar.f20920a;
            if (i10 == 200) {
                return g.e(bVar.f20922c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e10) {
            AbstractC1595a.d("CctTransportBackend", "Could not make request to the backend", e10);
            return g.f();
        }
    }

    @Override // X3.m
    public i b(i iVar) {
        NetworkInfo activeNetworkInfo = this.f20911b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c(Constants.LOCALE, Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f20912c).getSimOperator()).c("application_build", Integer.toString(h(this.f20912c))).d();
    }

    d(Context context, InterfaceC2673a interfaceC2673a, InterfaceC2673a interfaceC2673a2) {
        this(context, interfaceC2673a, interfaceC2673a2, 130000);
    }
}
