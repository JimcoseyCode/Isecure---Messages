package expo.modules.kotlin.views;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.PropSetException;
import expo.modules.kotlin.types.AnyType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/views/ConcreteViewPropWithDefault;", "Landroid/view/View;", "ViewType", "PropType", "Lexpo/modules/kotlin/views/ConcreteViewProp;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "Lexpo/modules/kotlin/types/AnyType;", "propType", "Lkotlin/Function2;", "Li7/B;", "setter", "defaultValue", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "Lcom/facebook/react/bridge/Dynamic;", "prop", "onView", "Lexpo/modules/kotlin/AppContext;", "appContext", "set", "(Lcom/facebook/react/bridge/Dynamic;Landroid/view/View;Lexpo/modules/kotlin/AppContext;)V", "Ljava/lang/Object;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConcreteViewPropWithDefault<ViewType extends View, PropType> extends ConcreteViewProp<ViewType, PropType> {
    private final PropType defaultValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcreteViewPropWithDefault(String name, AnyType propType, Function2 setter, PropType proptype) {
        super(name, propType, setter);
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(propType, "propType");
        AbstractC2855l.g(setter, "setter");
        this.defaultValue = proptype;
    }

    @Override // expo.modules.kotlin.views.ConcreteViewProp, expo.modules.kotlin.views.AnyViewProp
    public void set(Dynamic prop, View onView, AppContext appContext) throws PropSetException {
        AbstractC2855l.g(prop, "prop");
        AbstractC2855l.g(onView, "onView");
        if (prop.isNull()) {
            getSetter().invoke(onView, this.defaultValue);
        } else {
            super.set(prop, onView, appContext);
        }
    }
}
