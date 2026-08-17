package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import r4.AbstractC3261b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class b implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Uri f21152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Bitmap f21153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CountDownLatch f21154i;

    public b(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z10, CountDownLatch countDownLatch) {
        this.f21152g = uri;
        this.f21153h = bitmap;
        this.f21154i = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC3261b.a("OnBitmapLoadedRunnable must be executed in the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) ImageManager.g(null).remove(this.f21152g);
        if (imageReceiver != null) {
            ArrayList arrayList = imageReceiver.f21145h;
            if (arrayList.size() > 0) {
                android.support.v4.media.session.b.a(arrayList.get(0));
                if (this.f21153h != null) {
                    ImageManager.a(null);
                    throw null;
                }
                ImageManager.f(null).put(this.f21152g, Long.valueOf(SystemClock.elapsedRealtime()));
                ImageManager.a(null);
                ImageManager.c(null);
                throw null;
            }
        }
        this.f21154i.countDown();
        synchronized (ImageManager.f21142a) {
            ImageManager.f21143b.remove(this.f21152g);
        }
    }
}
