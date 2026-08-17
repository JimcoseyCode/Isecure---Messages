package com.swmansion.gesturehandler.react;

import J6.AbstractC1274d;
import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements J6.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f24940a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f24941b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f24942c = new SparseArray();

    private final synchronized void d(final AbstractC1274d abstractC1274d) {
        try {
            Integer num = (Integer) this.f24941b.get(abstractC1274d.T());
            if (num != null) {
                this.f24941b.remove(abstractC1274d.T());
                ArrayList arrayList = (ArrayList) this.f24942c.get(num.intValue());
                if (arrayList != null) {
                    synchronized (arrayList) {
                        arrayList.remove(abstractC1274d);
                    }
                    if (arrayList.size() == 0) {
                        this.f24942c.remove(num.intValue());
                    }
                }
            }
            if (abstractC1274d.W() != null) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.e(abstractC1274d);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AbstractC1274d abstractC1274d) {
        abstractC1274d.q();
    }

    private final synchronized void k(int i10, AbstractC1274d abstractC1274d) {
        try {
            if (this.f24941b.get(abstractC1274d.T()) != null) {
                throw new IllegalStateException(("Handler " + abstractC1274d + " already attached").toString());
            }
            this.f24941b.put(abstractC1274d.T(), Integer.valueOf(i10));
            Object obj = this.f24942c.get(i10);
            if (obj == null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(abstractC1274d);
                this.f24942c.put(i10, arrayList);
            } else {
                synchronized (obj) {
                    ((ArrayList) obj).add(abstractC1274d);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // J6.j
    public synchronized ArrayList a(View view) {
        AbstractC2855l.g(view, "view");
        return i(view.getId());
    }

    public final synchronized boolean c(int i10, int i11, int i12) {
        boolean z10;
        AbstractC1274d abstractC1274d = (AbstractC1274d) this.f24940a.get(i10);
        if (abstractC1274d != null) {
            d(abstractC1274d);
            abstractC1274d.u0(i12);
            k(i11, abstractC1274d);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final synchronized void f() {
        this.f24940a.clear();
        this.f24941b.clear();
        this.f24942c.clear();
    }

    public final synchronized void g(int i10) {
        AbstractC1274d abstractC1274d = (AbstractC1274d) this.f24940a.get(i10);
        if (abstractC1274d != null) {
            d(abstractC1274d);
            this.f24940a.remove(i10);
        }
    }

    public final synchronized AbstractC1274d h(int i10) {
        return (AbstractC1274d) this.f24940a.get(i10);
    }

    public final synchronized ArrayList i(int i10) {
        return (ArrayList) this.f24942c.get(i10);
    }

    public final synchronized void j(AbstractC1274d handler) {
        AbstractC2855l.g(handler, "handler");
        this.f24940a.put(handler.T(), handler);
    }
}
