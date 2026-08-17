package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.ReactViewGroup;
import i7.C2735B;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o f25490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f25491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m f25492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f25493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private StateWrapper f25494k;

    public k(Context context) {
        super(context);
        this.f25490g = o.f25507g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View e() {
        for (ViewParent parent = getParent(); parent != 0; parent = parent.getParent()) {
            if (parent instanceof f) {
                return (View) parent;
            }
        }
        return this;
    }

    private final boolean f() {
        a aVarE;
        View view = this.f25493j;
        if (view == null || (aVarE = h.e(view)) == null || AbstractC2855l.b(this.f25491h, aVarE)) {
            return false;
        }
        this.f25491h = aVarE;
        g();
        return true;
    }

    private final void g() {
        a aVar = this.f25491h;
        if (aVar != null) {
            m mVar = this.f25492i;
            if (mVar == null) {
                l lVar = l.f25496h;
                mVar = new m(lVar, lVar, lVar, lVar);
            }
            StateWrapper stateWrapper = getStateWrapper();
            if (stateWrapper != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putMap("insets", q.b(aVar));
                stateWrapper.updateState(writableMapCreateMap);
                return;
            }
            n nVar = new n(aVar, this.f25490g, mVar);
            ReactContext reactContextA = r.a(this);
            final UIManagerModule uIManagerModule = (UIManagerModule) reactContextA.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), nVar);
                reactContextA.runOnNativeModulesQueueThread(new Runnable() { // from class: com.th3rdwave.safeareacontext.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.h(uIManagerModule);
                    }
                });
                i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(UIManagerModule uIManagerModule) {
        uIManagerModule.getUIImplementation().dispatchViewUpdates(-1);
    }

    private final void i() {
        final z zVar = new z();
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        long jNanoTime = System.nanoTime();
        r.a(this).runOnNativeModulesQueueThread(new Runnable() { // from class: com.th3rdwave.safeareacontext.j
            @Override // java.lang.Runnable
            public final void run() {
                k.j(reentrantLock, zVar, conditionNewCondition);
            }
        });
        reentrantLock.lock();
        for (long jNanoTime2 = 0; !zVar.f29399g && jNanoTime2 < 500000000; jNanoTime2 += System.nanoTime() - jNanoTime) {
            try {
                try {
                    conditionNewCondition.awaitNanos(500000000L);
                } catch (InterruptedException unused) {
                    zVar.f29399g = true;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        C2735B c2735b = C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ReentrantLock reentrantLock, z zVar, Condition condition) {
        reentrantLock.lock();
        try {
            if (!zVar.f29399g) {
                zVar.f29399g = true;
                condition.signal();
            }
            C2735B c2735b = C2735B.f28704a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final StateWrapper getStateWrapper() {
        return this.f25494k;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onAttachedToWindow();
        View viewE = e();
        this.f25493j = viewE;
        if (viewE != null && (viewTreeObserver = viewE.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.f25493j;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.f25493j = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean zF = f();
        if (zF) {
            requestLayout();
        }
        return !zF;
    }

    public final void setEdges(m edges) {
        AbstractC2855l.g(edges, "edges");
        this.f25492i = edges;
        g();
    }

    public final void setMode(o mode) {
        AbstractC2855l.g(mode, "mode");
        this.f25490g = mode;
        g();
    }

    public final void setStateWrapper(StateWrapper stateWrapper) {
        this.f25494k = stateWrapper;
    }
}
