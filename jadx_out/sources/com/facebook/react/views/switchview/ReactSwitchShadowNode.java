package com.facebook.react.views.switchview;

import android.view.View;
import com.facebook.react.common.annotations.LegacyArchitectureShadowNodeWithCxxImpl;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import com.facebook.yoga.r;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@LegacyArchitectureShadowNodeWithCxxImpl
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/views/switchview/ReactSwitchShadowNode;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "Lcom/facebook/yoga/o;", "<init>", "()V", "Li7/B;", "initMeasureFunction", "Lcom/facebook/yoga/r;", "node", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "Lcom/facebook/yoga/p;", "widthMode", "height", "heightMode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "measure", "(Lcom/facebook/yoga/r;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)J", PointerEventHelper.POINTER_TYPE_UNKNOWN, "I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "measured", "Z", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactSwitchShadowNode extends LayoutShadowNode implements o {
    private int height;
    private boolean measured;
    private int width;

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("ReactSwitchShadowNode", LegacyArchitectureLogLevel.ERROR);
    }

    public ReactSwitchShadowNode() {
        initMeasureFunction();
    }

    private final void initMeasureFunction() {
        setMeasureFunction(this);
    }

    @Override // com.facebook.yoga.o
    public long measure(r node, float width, p widthMode, float height, p heightMode) {
        AbstractC2855l.g(node, "node");
        AbstractC2855l.g(widthMode, "widthMode");
        AbstractC2855l.g(heightMode, "heightMode");
        if (!this.measured) {
            ThemedReactContext themedContext = getThemedContext();
            AbstractC2855l.f(themedContext, "getThemedContext(...)");
            ReactSwitch reactSwitch = new ReactSwitch(themedContext);
            reactSwitch.setShowText(false);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            reactSwitch.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.width = reactSwitch.getMeasuredWidth();
            this.height = reactSwitch.getMeasuredHeight();
            this.measured = true;
        }
        return q.b(this.width, this.height);
    }
}
