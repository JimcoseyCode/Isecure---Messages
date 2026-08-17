package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends LayoutShadowNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f25511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f25512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f25513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25514d;

    public p() {
        int[] iArr = ViewProps.PADDING_MARGIN_SPACING_TYPES;
        this.f25512b = new float[iArr.length];
        this.f25513c = new float[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f25512b[i10] = Float.NaN;
            this.f25513c[i10] = Float.NaN;
        }
    }

    private final float a(l lVar, float f10, float f11) {
        return lVar == l.f25495g ? f11 : lVar == l.f25497i ? Math.max(f10, f11) : f10 + f11;
    }

    private final void b(o oVar) {
        if (oVar == o.f25507g) {
            super.setPadding(1, this.f25512b[1]);
            super.setPadding(2, this.f25512b[2]);
            super.setPadding(3, this.f25512b[3]);
            super.setPadding(0, this.f25512b[0]);
        } else {
            super.setMargin(1, this.f25513c[1]);
            super.setMargin(2, this.f25513c[2]);
            super.setMargin(3, this.f25513c[3]);
            super.setMargin(0, this.f25513c[0]);
        }
        markUpdated();
    }

    private final void c() {
        n nVar = this.f25511a;
        if (nVar == null) {
            return;
        }
        o oVarC = nVar.c();
        o oVar = o.f25507g;
        float[] fArr = oVarC == oVar ? this.f25512b : this.f25513c;
        float f10 = fArr[8];
        if (Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        float f11 = f10;
        float f12 = f11;
        float f13 = f12;
        float f14 = fArr[7];
        if (!Float.isNaN(f14)) {
            f10 = f14;
            f12 = f10;
        }
        float f15 = fArr[6];
        if (!Float.isNaN(f15)) {
            f11 = f15;
            f13 = f11;
        }
        float f16 = fArr[1];
        if (!Float.isNaN(f16)) {
            f10 = f16;
        }
        float f17 = fArr[2];
        if (!Float.isNaN(f17)) {
            f11 = f17;
        }
        float f18 = fArr[3];
        if (!Float.isNaN(f18)) {
            f12 = f18;
        }
        float f19 = fArr[0];
        if (!Float.isNaN(f19)) {
            f13 = f19;
        }
        float pixelFromDIP = PixelUtil.toPixelFromDIP(f10);
        float pixelFromDIP2 = PixelUtil.toPixelFromDIP(f11);
        float pixelFromDIP3 = PixelUtil.toPixelFromDIP(f12);
        float pixelFromDIP4 = PixelUtil.toPixelFromDIP(f13);
        m mVarA = nVar.a();
        a aVarB = nVar.b();
        if (nVar.c() == oVar) {
            super.setPadding(1, a(mVarA.d(), aVarB.d(), pixelFromDIP));
            super.setPadding(2, a(mVarA.c(), aVarB.c(), pixelFromDIP2));
            super.setPadding(3, a(mVarA.a(), aVarB.a(), pixelFromDIP3));
            super.setPadding(0, a(mVarA.b(), aVarB.b(), pixelFromDIP4));
            return;
        }
        super.setMargin(1, a(mVarA.d(), aVarB.d(), pixelFromDIP));
        super.setMargin(2, a(mVarA.c(), aVarB.c(), pixelFromDIP2));
        super.setMargin(3, a(mVarA.a(), aVarB.a(), pixelFromDIP3));
        super.setMargin(0, a(mVarA.b(), aVarB.b(), pixelFromDIP4));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        AbstractC2855l.g(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        if (this.f25514d) {
            this.f25514d = false;
            c();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(Object data) {
        AbstractC2855l.g(data, "data");
        if (data instanceof n) {
            n nVar = this.f25511a;
            if (nVar != null && nVar.c() != ((n) data).c()) {
                b(nVar.c());
            }
            this.f25511a = (n) data;
            this.f25514d = false;
            c();
        }
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    @ReactPropGroup(names = {ViewProps.MARGIN, ViewProps.MARGIN_VERTICAL, ViewProps.MARGIN_HORIZONTAL, ViewProps.MARGIN_START, ViewProps.MARGIN_END, ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, ViewProps.MARGIN_LEFT, ViewProps.MARGIN_RIGHT})
    public void setMargins(int i10, Dynamic margin) {
        AbstractC2855l.g(margin, "margin");
        this.f25513c[ViewProps.PADDING_MARGIN_SPACING_TYPES[i10]] = margin.getType() == ReadableType.Number ? (float) margin.asDouble() : Float.NaN;
        super.setMargins(i10, margin);
        this.f25514d = true;
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    @ReactPropGroup(names = {ViewProps.PADDING, ViewProps.PADDING_VERTICAL, ViewProps.PADDING_HORIZONTAL, ViewProps.PADDING_START, ViewProps.PADDING_END, ViewProps.PADDING_TOP, ViewProps.PADDING_BOTTOM, ViewProps.PADDING_LEFT, ViewProps.PADDING_RIGHT})
    public void setPaddings(int i10, Dynamic padding) {
        AbstractC2855l.g(padding, "padding");
        this.f25512b[ViewProps.PADDING_MARGIN_SPACING_TYPES[i10]] = padding.getType() == ReadableType.Number ? (float) padding.asDouble() : Float.NaN;
        super.setPaddings(i10, padding);
        this.f25514d = true;
    }
}
