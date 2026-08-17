package w2;

import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: w2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3473f implements InterfaceC3471d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f33157g = new ArrayList(2);

    private synchronized void c(String str, Throwable th) {
    }

    public synchronized void a(InterfaceC3471d interfaceC3471d) {
        this.f33157g.add(interfaceC3471d);
    }

    public synchronized void b() {
        this.f33157g.clear();
    }

    @Override // w2.InterfaceC3471d
    public synchronized void onFailure(String str, Throwable th) {
        int size = this.f33157g.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                InterfaceC3471d interfaceC3471d = (InterfaceC3471d) this.f33157g.get(i10);
                if (interfaceC3471d != null) {
                    interfaceC3471d.onFailure(str, th);
                }
            } catch (Exception e10) {
                c("InternalListener exception in onFailure", e10);
            }
        }
    }

    @Override // w2.InterfaceC3471d
    public synchronized void onFinalImageSet(String str, Object obj, Animatable animatable) {
        int size = this.f33157g.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                InterfaceC3471d interfaceC3471d = (InterfaceC3471d) this.f33157g.get(i10);
                if (interfaceC3471d != null) {
                    interfaceC3471d.onFinalImageSet(str, obj, animatable);
                }
            } catch (Exception e10) {
                c("InternalListener exception in onFinalImageSet", e10);
            }
        }
    }

    @Override // w2.InterfaceC3471d
    public void onIntermediateImageFailed(String str, Throwable th) {
        int size = this.f33157g.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                InterfaceC3471d interfaceC3471d = (InterfaceC3471d) this.f33157g.get(i10);
                if (interfaceC3471d != null) {
                    interfaceC3471d.onIntermediateImageFailed(str, th);
                }
            } catch (Exception e10) {
                c("InternalListener exception in onIntermediateImageFailed", e10);
            }
        }
    }

    @Override // w2.InterfaceC3471d
    public void onIntermediateImageSet(String str, Object obj) {
        int size = this.f33157g.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                InterfaceC3471d interfaceC3471d = (InterfaceC3471d) this.f33157g.get(i10);
                if (interfaceC3471d != null) {
                    interfaceC3471d.onIntermediateImageSet(str, obj);
                }
            } catch (Exception e10) {
                c("InternalListener exception in onIntermediateImageSet", e10);
            }
        }
    }

    @Override // w2.InterfaceC3471d
    public synchronized void onRelease(String str) {
        int size = this.f33157g.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                InterfaceC3471d interfaceC3471d = (InterfaceC3471d) this.f33157g.get(i10);
                if (interfaceC3471d != null) {
                    interfaceC3471d.onRelease(str);
                }
            } catch (Exception e10) {
                c("InternalListener exception in onRelease", e10);
            }
        }
    }

    @Override // w2.InterfaceC3471d
    public synchronized void onSubmit(String str, Object obj) {
        int size = this.f33157g.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                InterfaceC3471d interfaceC3471d = (InterfaceC3471d) this.f33157g.get(i10);
                if (interfaceC3471d != null) {
                    interfaceC3471d.onSubmit(str, obj);
                }
            } catch (Exception e10) {
                c("InternalListener exception in onSubmit", e10);
            }
        }
    }
}
