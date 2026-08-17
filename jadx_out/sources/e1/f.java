package e1;

import androidx.lifecycle.InterfaceC1762i;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import d1.AbstractC2320a;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f25818a = new f();

    private f() {
    }

    public final AbstractC2320a a(W owner) {
        AbstractC2855l.g(owner, "owner");
        return owner instanceof InterfaceC1762i ? ((InterfaceC1762i) owner).getDefaultViewModelCreationExtras() : AbstractC2320a.b.f25551c;
    }

    public final U.c b(W owner) {
        AbstractC2855l.g(owner, "owner");
        return owner instanceof InterfaceC1762i ? ((InterfaceC1762i) owner).getDefaultViewModelProviderFactory() : C2392b.f25812b;
    }

    public final String c(C7.d modelClass) {
        AbstractC2855l.g(modelClass, "modelClass");
        String strA = AbstractC2391a.a(modelClass);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    public final T d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
