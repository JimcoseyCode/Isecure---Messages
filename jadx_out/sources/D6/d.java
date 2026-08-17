package D6;

import android.graphics.Point;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.jvm.internal.AbstractC2855l;
import r6.AbstractC3274c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends LayoutShadowNode {
    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void addChildAt(ReactShadowNodeImpl child, int i10) {
        AbstractC2855l.g(child, "child");
        super.addChildAt(child, i10);
        ThemedReactContext themedContext = getThemedContext();
        AbstractC2855l.f(themedContext, "getThemedContext(...)");
        Point pointB = AbstractC3274c.b(themedContext);
        child.setStyleWidth(pointB.x);
        child.setStyleHeight(pointB.y);
    }
}
