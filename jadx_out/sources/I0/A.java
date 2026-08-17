package I0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3847a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final A f3848a;

        a(A a10) {
            this.f3848a = a10;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            z zVarB = this.f3848a.b(i10);
            if (zVarB == null) {
                return null;
            }
            return zVarB.c1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i10) {
            List listC = this.f3848a.c(str, i10);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((z) listC.get(i11)).c1());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            z zVarD = this.f3848a.d(i10);
            if (zVarD == null) {
                return null;
            }
            return zVarD.c1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f3848a.f(i10, i11, bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b extends a {
        b(A a10) {
            super(a10);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f3848a.a(i10, z.d1(accessibilityNodeInfo), str, bundle);
        }
    }

    public A() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3847a = new b(this);
        } else {
            this.f3847a = new a(this);
        }
    }

    public z b(int i10) {
        return null;
    }

    public List c(String str, int i10) {
        return null;
    }

    public z d(int i10) {
        return null;
    }

    public Object e() {
        return this.f3847a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public A(Object obj) {
        this.f3847a = obj;
    }

    public void a(int i10, z zVar, String str, Bundle bundle) {
    }
}
