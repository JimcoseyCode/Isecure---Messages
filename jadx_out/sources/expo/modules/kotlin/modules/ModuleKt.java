package expo.modules.kotlin.modules;

import expo.modules.kotlin.types.TypeConverterProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2854k;
import kotlin.jvm.internal.AbstractC2855l;
import l1.AbstractC2861a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\n\u001a\u00020\t*\u00020\u00002\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Lexpo/modules/kotlin/modules/Module;", "Lkotlin/Function1;", "Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;", "Li7/B;", "block", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "ModuleDefinition", "(Lexpo/modules/kotlin/modules/Module;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Lexpo/modules/kotlin/modules/ModuleConvertersBuilder;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "ModuleConverters", "(Lexpo/modules/kotlin/modules/Module;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/types/TypeConverterProvider;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ModuleKt {
    public static final TypeConverterProvider ModuleConverters(Module module, Function1 block) {
        AbstractC2855l.g(module, "<this>");
        AbstractC2855l.g(block, "block");
        AbstractC2861a.c("[ExpoModulesCore] " + (module.getClass() + ".TypeConverters"));
        try {
            ModuleConvertersBuilder moduleConvertersBuilder = new ModuleConvertersBuilder();
            block.invoke(moduleConvertersBuilder);
            return moduleConvertersBuilder.buildTypeConverterProvider();
        } finally {
            AbstractC2854k.b(1);
            AbstractC2861a.f();
            AbstractC2854k.a(1);
        }
    }

    public static final ModuleDefinitionData ModuleDefinition(Module module, Function1 block) {
        AbstractC2855l.g(module, "<this>");
        AbstractC2855l.g(block, "block");
        AbstractC2861a.c("[ExpoModulesCore] " + (module.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(module);
            block.invoke(moduleDefinitionBuilder);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            AbstractC2854k.b(1);
            AbstractC2861a.f();
            AbstractC2854k.a(1);
        }
    }
}
