package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import y.Y;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f15258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Y f15259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Rect f15260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f15261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f15262n;

    s(o oVar, Y y10) {
        this(oVar, null, y10);
    }

    @Override // androidx.camera.core.e, androidx.camera.core.o
    public void b0(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f15258j) {
            this.f15260l = rect;
        }
    }

    @Override // androidx.camera.core.e, androidx.camera.core.o
    public int getHeight() {
        return this.f15262n;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.o
    public int getWidth() {
        return this.f15261m;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.o
    public Y i() {
        return this.f15259k;
    }

    public s(o oVar, Size size, Y y10) {
        super(oVar);
        this.f15258j = new Object();
        if (size == null) {
            this.f15261m = super.getWidth();
            this.f15262n = super.getHeight();
        } else {
            this.f15261m = size.getWidth();
            this.f15262n = size.getHeight();
        }
        this.f15259k = y10;
    }
}
