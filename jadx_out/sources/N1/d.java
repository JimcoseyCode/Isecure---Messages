package N1;

import J1.l;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface d extends l {
    M1.c getRequest();

    void getSize(c cVar);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(Object obj, O1.b bVar);

    void removeCallback(c cVar);

    void setRequest(M1.c cVar);
}
