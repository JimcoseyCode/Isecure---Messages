package expo.modules.kotlin.activityaware;

import R8.C1425o;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2854k;
import n7.f;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0086H¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"R", "Lexpo/modules/kotlin/activityaware/AppCompatActivityAware;", "Lkotlin/Function1;", "Landroidx/appcompat/app/d;", "onActivityAvailable", "withActivityAvailable", "(Lexpo/modules/kotlin/activityaware/AppCompatActivityAware;Lkotlin/jvm/functions/Function1;Ln7/f;)Ljava/lang/Object;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AppCompatActivityAwareKt {
    public static final <R> Object withActivityAvailable(AppCompatActivityAware appCompatActivityAware, Function1 function1, f fVar) {
        C1425o c1425o = new C1425o(AbstractC3016b.c(fVar), 1);
        c1425o.F();
        AppCompatActivityAwareKt$withActivityAvailable$2$listener$1 appCompatActivityAwareKt$withActivityAvailable$2$listener$1 = new AppCompatActivityAwareKt$withActivityAvailable$2$listener$1(c1425o, appCompatActivityAware, function1);
        appCompatActivityAware.addOnActivityAvailableListener(appCompatActivityAwareKt$withActivityAvailable$2$listener$1);
        c1425o.g(new AppCompatActivityAwareKt$withActivityAvailable$2$1(appCompatActivityAware, appCompatActivityAwareKt$withActivityAvailable$2$listener$1));
        Object objZ = c1425o.z();
        if (objZ == AbstractC3016b.e()) {
            h.c(fVar);
        }
        return objZ;
    }

    private static final <R> Object withActivityAvailable$$forInline(AppCompatActivityAware appCompatActivityAware, Function1 function1, f fVar) {
        AbstractC2854k.c(0);
        C1425o c1425o = new C1425o(AbstractC3016b.c(fVar), 1);
        c1425o.F();
        AppCompatActivityAwareKt$withActivityAvailable$2$listener$1 appCompatActivityAwareKt$withActivityAvailable$2$listener$1 = new AppCompatActivityAwareKt$withActivityAvailable$2$listener$1(c1425o, appCompatActivityAware, function1);
        appCompatActivityAware.addOnActivityAvailableListener(appCompatActivityAwareKt$withActivityAvailable$2$listener$1);
        c1425o.g(new AppCompatActivityAwareKt$withActivityAvailable$2$1(appCompatActivityAware, appCompatActivityAwareKt$withActivityAvailable$2$listener$1));
        C2735B c2735b = C2735B.f28704a;
        Object objZ = c1425o.z();
        if (objZ == AbstractC3016b.e()) {
            h.c(fVar);
        }
        AbstractC2854k.c(1);
        return objZ;
    }
}
