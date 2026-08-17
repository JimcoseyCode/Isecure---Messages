package Z6;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.zoontek.rnedgetoedge.EdgeToEdgeModule;
import com.zoontek.rnedgetoedge.NativeEdgeToEdgeModuleSpec;
import i7.t;
import j7.K;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends BaseReactPackage {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b() {
        return K.f(t.a(NativeEdgeToEdgeModuleSpec.NAME, new ReactModuleInfo(NativeEdgeToEdgeModuleSpec.NAME, NativeEdgeToEdgeModuleSpec.NAME, false, true, true, false, true)));
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(reactContext, "reactContext");
        if (AbstractC2855l.b(name, NativeEdgeToEdgeModuleSpec.NAME)) {
            return new EdgeToEdgeModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: Z6.h
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return i.b();
            }
        };
    }
}
