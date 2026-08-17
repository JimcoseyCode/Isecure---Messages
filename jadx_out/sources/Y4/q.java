package y4;

import com.facebook.react.views.progressbar.ProgressBarContainerView;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static int a(int i10) {
        if (i10 == -1) {
            return -1;
        }
        return i10 / ProgressBarContainerView.MAX_PROGRESS;
    }
}
