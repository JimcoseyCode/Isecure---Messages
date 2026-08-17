package r4;

import android.content.Intent;
import p4.InterfaceC3058e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class u extends v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Intent f31943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ InterfaceC3058e f31944h;

    u(Intent intent, InterfaceC3058e interfaceC3058e, int i10) {
        this.f31943g = intent;
        this.f31944h = interfaceC3058e;
    }

    @Override // r4.v
    public final void a() {
        Intent intent = this.f31943g;
        if (intent != null) {
            this.f31944h.startActivityForResult(intent, 2);
        }
    }
}
