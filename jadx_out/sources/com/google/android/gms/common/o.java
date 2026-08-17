package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class o extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final WeakReference f21314e = new WeakReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference f21315d;

    o(byte[] bArr) {
        super(bArr);
        this.f21315d = f21314e;
    }

    @Override // com.google.android.gms.common.m
    final byte[] x() {
        byte[] bArrY;
        synchronized (this) {
            try {
                bArrY = (byte[]) this.f21315d.get();
                if (bArrY == null) {
                    bArrY = y();
                    this.f21315d = new WeakReference(bArrY);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrY;
    }

    protected abstract byte[] y();
}
