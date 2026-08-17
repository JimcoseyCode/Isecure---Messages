package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: com.swmansion.rnscreens.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2288a extends AppBarLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2288a(Context context) {
        super(context);
        AbstractC2855l.g(context, "context");
    }

    private final void G(int i10) {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight() + i10, 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom() + i10);
    }

    public final void H(int i10) {
        G(i10);
    }
}
