package com.google.android.material.button;

import I0.z;
import Q4.j;
import Q4.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C1657a;
import com.google.android.material.internal.l;
import h5.C2705a;
import h5.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k5.AbstractC2830a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends d {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f22900x = j.f9426y;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final LinkedHashSet f22901r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f22902s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f22903t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f22904u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f22905v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Set f22906w;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends C1657a {
        a() {
        }

        @Override // androidx.core.view.C1657a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.z0(z.g.b(0, 1, MaterialButtonToggleGroup.this.u(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Q4.a.f9141f0);
    }

    private String getChildrenA11yClassName() {
        return (this.f22903t ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && j(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private boolean j(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void r(int i10, boolean z10) {
        if (i10 == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.f22906w);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f22903t && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f22904u || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        y(hashSet);
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    private void t(int i10, boolean z10) {
        Iterator it = this.f22901r.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, i10, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int u(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && j(i11)) {
                i10++;
            }
        }
        return -1;
    }

    private void x(int i10, boolean z10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof MaterialButton) {
            this.f22902s = true;
            ((MaterialButton) viewFindViewById).setChecked(z10);
            this.f22902s = false;
        }
    }

    private void y(Set set) {
        Set set2 = this.f22906w;
        this.f22906w = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = f(i10).getId();
            x(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                t(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void z() {
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            f(i10).setA11yClassName(childrenA11yClassName);
        }
    }

    @Override // com.google.android.material.button.d, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i10, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setupButtonChild(materialButton);
            r(materialButton.getId(), materialButton.isChecked());
            AbstractC1658a0.k0(materialButton, new a());
        }
    }

    public int getCheckedButtonId() {
        if (!this.f22903t || this.f22906w.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f22906w.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = f(i10).getId();
            if (this.f22906w.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f22905v;
        if (i10 != -1) {
            y(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z.d1(accessibilityNodeInfo).y0(z.f.b(1, getVisibleButtonCount(), false, v() ? 1 : 2));
    }

    public void q(b bVar) {
        this.f22901r.add(bVar);
    }

    public void s() {
        y(new HashSet());
    }

    public void setSelectionRequired(boolean z10) {
        this.f22904u = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f22903t != z10) {
            this.f22903t = z10;
            s();
        }
        z();
    }

    public boolean v() {
        return this.f22903t;
    }

    void w(MaterialButton materialButton, boolean z10) {
        if (this.f22902s) {
            return;
        }
        r(materialButton.getId(), z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f22900x;
        super(AbstractC2830a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f22901r = new LinkedHashSet();
        this.f22902s = false;
        this.f22906w = new HashSet();
        TypedArray typedArrayI = l.i(getContext(), attributeSet, k.f9463E2, i10, i11, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(k.f9495I2, false));
        this.f22905v = typedArrayI.getResourceId(k.f9479G2, -1);
        this.f22904u = typedArrayI.getBoolean(k.f9487H2, false);
        if (this.f22917l == null) {
            this.f22917l = p.c(new C2705a(0.0f));
        }
        setEnabled(typedArrayI.getBoolean(k.f9471F2, true));
        typedArrayI.recycle();
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
