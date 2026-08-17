package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class L {
    private final CopyOnWriteArrayList<InterfaceC1605d> cancellables = new CopyOnWriteArrayList<>();
    private InterfaceC3487a enabledChangedCallback;
    private boolean isEnabled;

    public L(boolean z10) {
        this.isEnabled = z10;
    }

    public final void addCancellable(InterfaceC1605d cancellable) {
        AbstractC2855l.g(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final InterfaceC3487a getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(C1604c backEvent) {
        AbstractC2855l.g(backEvent, "backEvent");
    }

    public void handleOnBackStarted(C1604c backEvent) {
        AbstractC2855l.g(backEvent, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((InterfaceC1605d) it.next()).cancel();
        }
    }

    public final void removeCancellable(InterfaceC1605d cancellable) {
        AbstractC2855l.g(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
        InterfaceC3487a interfaceC3487a = this.enabledChangedCallback;
        if (interfaceC3487a != null) {
            interfaceC3487a.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(InterfaceC3487a interfaceC3487a) {
        this.enabledChangedCallback = interfaceC3487a;
    }

    public void handleOnBackCancelled() {
    }
}
