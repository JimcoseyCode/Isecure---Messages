package expo.modules.kotlin.activityaware;

import R8.InterfaceC1421m;
import androidx.appcompat.app.d;
import i7.AbstractC2753p;
import i7.C2752o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"expo/modules/kotlin/activityaware/AppCompatActivityAwareKt$withActivityAvailable$2$listener$1", "Lexpo/modules/kotlin/activityaware/OnActivityAvailableListener;", "Landroidx/appcompat/app/d;", "activity", "Li7/B;", "onActivityAvailable", "(Landroidx/appcompat/app/d;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 176)
public final class AppCompatActivityAwareKt$withActivityAvailable$2$listener$1 implements OnActivityAvailableListener {
    final /* synthetic */ InterfaceC1421m $continuation;
    final /* synthetic */ Function1 $onActivityAvailable;
    final /* synthetic */ AppCompatActivityAware $this_withActivityAvailable;

    public AppCompatActivityAwareKt$withActivityAvailable$2$listener$1(InterfaceC1421m interfaceC1421m, AppCompatActivityAware appCompatActivityAware, Function1 function1) {
        this.$continuation = interfaceC1421m;
        this.$this_withActivityAvailable = appCompatActivityAware;
        this.$onActivityAvailable = function1;
    }

    @Override // expo.modules.kotlin.activityaware.OnActivityAvailableListener
    public void onActivityAvailable(d activity) {
        Object objB;
        AbstractC2855l.g(activity, "activity");
        if (this.$continuation.d()) {
            this.$this_withActivityAvailable.removeOnActivityAvailableListener(this);
            InterfaceC1421m interfaceC1421m = this.$continuation;
            Function1 function1 = this.$onActivityAvailable;
            try {
                C2752o.a aVar = C2752o.f28721h;
                objB = C2752o.b(function1.invoke(activity));
            } catch (Throwable th) {
                C2752o.a aVar2 = C2752o.f28721h;
                objB = C2752o.b(AbstractC2753p.a(th));
            }
            interfaceC1421m.resumeWith(objB);
        }
    }
}
