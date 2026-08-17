package r4;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class t extends v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Intent f31940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ Activity f31941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f31942i;

    t(Intent intent, Activity activity, int i10) {
        this.f31940g = intent;
        this.f31941h = activity;
        this.f31942i = i10;
    }

    @Override // r4.v
    public final void a() {
        Intent intent = this.f31940g;
        if (intent != null) {
            this.f31941h.startActivityForResult(intent, this.f31942i);
        }
    }
}
