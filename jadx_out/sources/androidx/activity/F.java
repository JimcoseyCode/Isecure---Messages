package androidx.activity;

import android.view.Window;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class F extends E {
    @Override // androidx.activity.B, androidx.activity.G, androidx.activity.H
    public void b(Window window) {
        AbstractC2855l.g(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}
