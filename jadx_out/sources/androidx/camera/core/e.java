package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.o;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import y.Y;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final o f15160h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f15159g = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Set f15161i = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        void a(o oVar);
    }

    protected e(o oVar) {
        this.f15160h = oVar;
    }

    @Override // androidx.camera.core.o
    public void b0(Rect rect) {
        this.f15160h.b0(rect);
    }

    @Override // androidx.camera.core.o, java.lang.AutoCloseable
    public void close() {
        this.f15160h.close();
        e();
    }

    public void d(a aVar) {
        synchronized (this.f15159g) {
            this.f15161i.add(aVar);
        }
    }

    protected void e() {
        HashSet hashSet;
        synchronized (this.f15159g) {
            hashSet = new HashSet(this.f15161i);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this);
        }
    }

    @Override // androidx.camera.core.o
    public int getFormat() {
        return this.f15160h.getFormat();
    }

    @Override // androidx.camera.core.o
    public int getHeight() {
        return this.f15160h.getHeight();
    }

    @Override // androidx.camera.core.o
    public int getWidth() {
        return this.f15160h.getWidth();
    }

    @Override // androidx.camera.core.o
    public Y i() {
        return this.f15160h.i();
    }

    @Override // androidx.camera.core.o
    public o.a[] p() {
        return this.f15160h.p();
    }

    @Override // androidx.camera.core.o
    public Image p0() {
        return this.f15160h.p0();
    }
}
