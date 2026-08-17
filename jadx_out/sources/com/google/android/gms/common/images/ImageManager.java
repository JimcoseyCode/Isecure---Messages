package com.google.android.gms.common.images;

import D4.e;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImageManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f21142a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashSet f21143b = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class ImageReceiver extends ResultReceiver {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Uri f21144g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ArrayList f21145h;

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i10, Bundle bundle) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager.h(null).execute(new a(null, this.f21144g, parcelFileDescriptor));
        }
    }

    static /* bridge */ /* synthetic */ Context a(ImageManager imageManager) {
        throw null;
    }

    static /* bridge */ /* synthetic */ Handler b(ImageManager imageManager) {
        throw null;
    }

    static /* bridge */ /* synthetic */ e c(ImageManager imageManager) {
        throw null;
    }

    static /* bridge */ /* synthetic */ Map f(ImageManager imageManager) {
        throw null;
    }

    static /* bridge */ /* synthetic */ Map g(ImageManager imageManager) {
        throw null;
    }

    static /* bridge */ /* synthetic */ ExecutorService h(ImageManager imageManager) {
        throw null;
    }
}
