package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.j;
import f.AbstractC2574g;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f14390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.appcompat.app.c f14391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    c f14392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private j.a f14393j;

    public f(e eVar) {
        this.f14390g = eVar;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void a(e eVar, boolean z10) {
        if (z10 || eVar == this.f14390g) {
            c();
        }
        j.a aVar = this.f14393j;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean b(e eVar) {
        j.a aVar = this.f14393j;
        if (aVar != null) {
            return aVar.b(eVar);
        }
        return false;
    }

    public void c() {
        androidx.appcompat.app.c cVar = this.f14391h;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        e eVar = this.f14390g;
        c.a aVar = new c.a(eVar.w());
        c cVar = new c(aVar.b(), AbstractC2574g.f26874j);
        this.f14392i = cVar;
        cVar.f(this);
        this.f14390g.b(this.f14392i);
        aVar.c(this.f14392i.j(), this);
        View viewA = eVar.A();
        if (viewA != null) {
            aVar.e(viewA);
        } else {
            aVar.f(eVar.y()).o(eVar.z());
        }
        aVar.k(this);
        androidx.appcompat.app.c cVarA = aVar.a();
        this.f14391h = cVarA;
        cVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f14391h.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f14391h.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f14390g.O((g) this.f14392i.j().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f14392i.a(this.f14390g, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f14391h.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f14391h.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f14390g.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f14390g.performShortcut(i10, keyEvent, 0);
    }
}
