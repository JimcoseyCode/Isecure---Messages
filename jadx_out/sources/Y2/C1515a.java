package Y2;

import a3.InterfaceC1593a;
import android.util.Log;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import g2.AbstractC2662a;
import java.io.Closeable;

/* JADX INFO: renamed from: Y2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1515a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2662a.c f12696a;

    /* JADX INFO: renamed from: Y2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0133a implements AbstractC2662a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1593a f12697a;

        C0133a(InterfaceC1593a interfaceC1593a) {
            this.f12697a = interfaceC1593a;
        }

        @Override // g2.AbstractC2662a.c
        public boolean a() {
            return this.f12697a.a();
        }

        @Override // g2.AbstractC2662a.c
        public void b(g2.i iVar, Throwable th) {
            this.f12697a.b(iVar, th);
            Object objF = iVar.f();
            AbstractC2325a.K("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), objF != null ? objF.getClass().getName() : "<value is null>", C1515a.d(th));
        }
    }

    public C1515a(InterfaceC1593a interfaceC1593a) {
        this.f12696a = new C0133a(interfaceC1593a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(Throwable th) {
        return th == null ? PointerEventHelper.POINTER_TYPE_UNKNOWN : Log.getStackTraceString(th);
    }

    public AbstractC2662a b(Closeable closeable) {
        return AbstractC2662a.i0(closeable, this.f12696a);
    }

    public AbstractC2662a c(Object obj, g2.h hVar) {
        return AbstractC2662a.y0(obj, hVar, this.f12696a);
    }
}
