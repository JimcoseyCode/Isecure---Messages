package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class f extends D4.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f21140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ a f21141c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f21141c = aVar;
        this.f21140b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        a aVar = this.f21141c;
        int iG = aVar.g(this.f21140b);
        if (aVar.j(iG)) {
            this.f21141c.o(this.f21140b, iG);
        }
    }
}
