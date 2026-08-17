package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static final void a(View view, V onBackPressedDispatcherOwner) {
        AbstractC2855l.g(view, "<this>");
        AbstractC2855l.g(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(W.f13814b, onBackPressedDispatcherOwner);
    }
}
