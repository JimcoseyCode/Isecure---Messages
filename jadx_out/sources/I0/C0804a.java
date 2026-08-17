package I0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: I0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0804a extends ClickableSpan {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f3849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z f3850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f3851i;

    public C0804a(int i10, z zVar, int i11) {
        this.f3849g = i10;
        this.f3850h = zVar;
        this.f3851i = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3849g);
        this.f3850h.m0(this.f3851i, bundle);
    }
}
