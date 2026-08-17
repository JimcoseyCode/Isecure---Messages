package com.google.firebase.messaging;

import P4.AbstractC1378l;
import P4.C1379m;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class I implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final URL f24149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Future f24150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AbstractC1378l f24151i;

    private I(URL url) {
        this.f24149g = url;
    }

    public static /* synthetic */ void d(I i10, C1379m c1379m) {
        i10.getClass();
        try {
            c1379m.c(i10.e());
        } catch (Exception e10) {
            c1379m.b(e10);
        }
    }

    private byte[] k() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f24149g.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrD = AbstractC2234b.d(AbstractC2234b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = bArrD.length;
                Objects.toString(this.f24149g);
            }
            if (bArrD.length <= 1048576) {
                return bArrD;
            }
            throw new IOException("Image exceeds max size of 1048576");
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
    }

    public static I m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new I(new URL(str));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f24150h.cancel(true);
    }

    public Bitmap e() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Objects.toString(this.f24149g);
        }
        byte[] bArrK = k();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrK, 0, bArrK.length);
        if (bitmapDecodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(this.f24149g);
            }
            return bitmapDecodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f24149g);
    }

    public AbstractC1378l r() {
        return (AbstractC1378l) AbstractC3268i.k(this.f24151i);
    }

    public void s(ExecutorService executorService) {
        final C1379m c1379m = new C1379m();
        this.f24150h = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.H
            @Override // java.lang.Runnable
            public final void run() {
                I.d(this.f24147g, c1379m);
            }
        });
        this.f24151i = c1379m.a();
    }
}
