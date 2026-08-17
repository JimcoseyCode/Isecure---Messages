package androidx.recyclerview.widget;

import I0.A;
import I0.z;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C1657a;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class k extends C1657a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final RecyclerView f18183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f18184b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a extends C1657a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final k f18185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f18186b = new WeakHashMap();

        public a(k kVar) {
            this.f18185a = kVar;
        }

        C1657a c(View view) {
            return (C1657a) this.f18186b.remove(view);
        }

        void d(View view) {
            C1657a c1657aK = AbstractC1658a0.k(view);
            if (c1657aK == null || c1657aK == this) {
                return;
            }
            this.f18186b.put(view, c1657aK);
        }

        @Override // androidx.core.view.C1657a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1657a c1657a = (C1657a) this.f18186b.get(view);
            return c1657a != null ? c1657a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1657a
        public A getAccessibilityNodeProvider(View view) {
            C1657a c1657a = (C1657a) this.f18186b.get(view);
            return c1657a != null ? c1657a.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.C1657a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1657a c1657a = (C1657a) this.f18186b.get(view);
            if (c1657a != null) {
                c1657a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1657a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            if (this.f18185a.d() || this.f18185a.f18183a.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, zVar);
                return;
            }
            this.f18185a.f18183a.getLayoutManager().S0(view, zVar);
            C1657a c1657a = (C1657a) this.f18186b.get(view);
            if (c1657a != null) {
                c1657a.onInitializeAccessibilityNodeInfo(view, zVar);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, zVar);
            }
        }

        @Override // androidx.core.view.C1657a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1657a c1657a = (C1657a) this.f18186b.get(view);
            if (c1657a != null) {
                c1657a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1657a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1657a c1657a = (C1657a) this.f18186b.get(viewGroup);
            return c1657a != null ? c1657a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1657a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (this.f18185a.d() || this.f18185a.f18183a.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            C1657a c1657a = (C1657a) this.f18186b.get(view);
            if (c1657a != null) {
                if (c1657a.performAccessibilityAction(view, i10, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            return this.f18185a.f18183a.getLayoutManager().m1(view, i10, bundle);
        }

        @Override // androidx.core.view.C1657a
        public void sendAccessibilityEvent(View view, int i10) {
            C1657a c1657a = (C1657a) this.f18186b.get(view);
            if (c1657a != null) {
                c1657a.sendAccessibilityEvent(view, i10);
            } else {
                super.sendAccessibilityEvent(view, i10);
            }
        }

        @Override // androidx.core.view.C1657a
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            C1657a c1657a = (C1657a) this.f18186b.get(view);
            if (c1657a != null) {
                c1657a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public k(RecyclerView recyclerView) {
        this.f18183a = recyclerView;
        C1657a c1657aC = c();
        if (c1657aC == null || !(c1657aC instanceof a)) {
            this.f18184b = new a(this);
        } else {
            this.f18184b = (a) c1657aC;
        }
    }

    public C1657a c() {
        return this.f18184b;
    }

    boolean d() {
        return this.f18183a.s0();
    }

    @Override // androidx.core.view.C1657a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || d()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().O0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C1657a
    public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
        super.onInitializeAccessibilityNodeInfo(view, zVar);
        if (d() || this.f18183a.getLayoutManager() == null) {
            return;
        }
        this.f18183a.getLayoutManager().Q0(zVar);
    }

    @Override // androidx.core.view.C1657a
    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (super.performAccessibilityAction(view, i10, bundle)) {
            return true;
        }
        if (d() || this.f18183a.getLayoutManager() == null) {
            return false;
        }
        return this.f18183a.getLayoutManager().k1(i10, bundle);
    }
}
