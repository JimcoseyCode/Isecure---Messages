package expo.modules.constants;

import expo.modules.interfaces.constants.ConstantsInterface;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.services.Service;
import expo.modules.kotlin.types.AnyType;
import j7.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lexpo/modules/constants/ConstantsModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-constants_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConstantsModule extends Module {
    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExponentConstants");
            moduleDefinitionBuilder.Constants(new InterfaceC3487a() { // from class: expo.modules.constants.ConstantsModule$definition$1$1
                @Override // w7.InterfaceC3487a
                public final Map<String, Object> invoke() {
                    Map<String, Object> constants;
                    Service service = this.this$0.getAppContext().getServices().getRegistry().get(ConstantsInterface.class);
                    if (!(service instanceof ConstantsInterface)) {
                        service = null;
                    }
                    ConstantsInterface constantsInterface = (ConstantsInterface) service;
                    return (constantsInterface == null || (constants = constantsInterface.getConstants()) == null) ? K.i() : constants;
                }
            });
            moduleDefinitionBuilder.getAsyncFunctions().put("getWebViewUserAgentAsync", new UntypedAsyncFunctionComponent("getWebViewUserAgentAsync", new AnyType[0], new Function1() { // from class: expo.modules.constants.ConstantsModule$definition$lambda$1$$inlined$AsyncFunction$1
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return System.getProperty("http.agent");
                }
            }));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            AbstractC2861a.f();
        }
    }
}
