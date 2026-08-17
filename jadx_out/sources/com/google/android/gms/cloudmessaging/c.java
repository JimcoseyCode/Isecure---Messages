package com.google.android.gms.cloudmessaging;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class c extends E4.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f20983b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(a aVar, Looper looper) {
        super(looper);
        this.f20983b = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        a.g(this.f20983b, message);
    }
}
