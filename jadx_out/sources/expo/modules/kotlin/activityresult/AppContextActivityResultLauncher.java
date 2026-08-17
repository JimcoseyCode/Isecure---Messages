package expo.modules.kotlin.activityresult;

import R8.C1425o;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d.InterfaceC2313a;
import i7.C2752o;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import n7.f;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\rR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Ljava/io/Serializable;", "I", "O", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "input", "Ld/a;", "callback", "Li7/B;", "launch", "(Ljava/io/Serializable;Ld/a;)V", "(Ljava/io/Serializable;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "getContract", "()Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "contract", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AppContextActivityResultLauncher<I extends Serializable, O> {
    public abstract AppContextActivityResultContract<I, O> getContract();

    public final Object launch(I i10, f fVar) {
        final C1425o c1425o = new C1425o(AbstractC3016b.c(fVar), 1);
        c1425o.F();
        launch(i10, new InterfaceC2313a() { // from class: expo.modules.kotlin.activityresult.AppContextActivityResultLauncher$launch$2$1
            @Override // d.InterfaceC2313a
            public final void onActivityResult(O o10) {
                if (c1425o.d()) {
                    c1425o.resumeWith(C2752o.b(o10));
                }
            }
        });
        Object objZ = c1425o.z();
        if (objZ == AbstractC3016b.e()) {
            h.c(fVar);
        }
        return objZ;
    }

    public abstract void launch(I input, InterfaceC2313a callback);
}
