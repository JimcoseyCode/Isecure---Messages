package N1;

import Q1.l;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d {
    private final int height;
    private M1.c request;
    private final int width;

    public a() {
        this(androidx.customview.widget.a.INVALID_ID, androidx.customview.widget.a.INVALID_ID);
    }

    @Override // N1.d
    public final M1.c getRequest() {
        return this.request;
    }

    @Override // N1.d
    public final void getSize(c cVar) {
        cVar.c(this.width, this.height);
    }

    @Override // N1.d
    public final void setRequest(M1.c cVar) {
        this.request = cVar;
    }

    public a(int i10, int i11) {
        if (l.u(i10, i11)) {
            this.width = i10;
            this.height = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    @Override // J1.l
    public void onDestroy() {
    }

    @Override // J1.l
    public void onStart() {
    }

    @Override // J1.l
    public void onStop() {
    }

    @Override // N1.d
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // N1.d
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // N1.d
    public final void removeCallback(c cVar) {
    }
}
