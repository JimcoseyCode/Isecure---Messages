package com.facebook.react.views.image;

import B7.d;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.facebook.drawee.drawable.p;
import com.facebook.drawee.drawable.q;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/views/image/ScaleTypeStartInside;", "Lcom/facebook/drawee/drawable/p;", "<init>", "()V", "Landroid/graphics/Matrix;", "outTransform", "Landroid/graphics/Rect;", "parentRect", PointerEventHelper.POINTER_TYPE_UNKNOWN, "childWidth", "childHeight", PointerEventHelper.POINTER_TYPE_UNKNOWN, "focusX", "focusY", ViewProps.SCALE_X, ViewProps.SCALE_Y, "Li7/B;", "getTransformImpl", "(Landroid/graphics/Matrix;Landroid/graphics/Rect;IIFFFF)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "()Ljava/lang/String;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScaleTypeStartInside extends p {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final q INSTANCE = new ScaleTypeStartInside();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/views/image/ScaleTypeStartInside$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/drawee/drawable/q;", "INSTANCE", "Lcom/facebook/drawee/drawable/q;", "getINSTANCE", "()Lcom/facebook/drawee/drawable/q;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q getINSTANCE() {
            return ScaleTypeStartInside.INSTANCE;
        }

        private Companion() {
        }
    }

    @Override // com.facebook.drawee.drawable.p
    public void getTransformImpl(Matrix outTransform, Rect parentRect, int childWidth, int childHeight, float focusX, float focusY, float scaleX, float scaleY) {
        AbstractC2855l.g(outTransform, "outTransform");
        AbstractC2855l.g(parentRect, "parentRect");
        float fG = d.g(Math.min(scaleX, scaleY), 1.0f);
        float f10 = parentRect.left;
        float f11 = parentRect.top;
        outTransform.setScale(fG, fG);
        outTransform.postTranslate(Math.round(f10), Math.round(f11));
    }

    public String toString() {
        return "start_inside";
    }
}
