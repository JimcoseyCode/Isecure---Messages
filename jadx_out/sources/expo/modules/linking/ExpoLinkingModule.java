package expo.modules.linking;

import D0.c;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import i7.C2735B;
import i7.t;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lexpo/modules/linking/ExpoLinkingModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Lkotlin/Function1;", "Landroid/net/Uri;", "Li7/B;", "onURLReceivedObserver", "Lkotlin/jvm/functions/Function1;", "Companion", "expo-linking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoLinkingModule extends Module {
    private static Uri initialURL;
    private Function1 onURLReceivedObserver;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static Set<Function1> onURLReceivedObservers = new LinkedHashSet();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR6\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/linking/ExpoLinkingModule$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/net/Uri;", "initialURL", "Landroid/net/Uri;", "getInitialURL", "()Landroid/net/Uri;", "setInitialURL", "(Landroid/net/Uri;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Function1;", "Li7/B;", "onURLReceivedObservers", "Ljava/util/Set;", "getOnURLReceivedObservers", "()Ljava/util/Set;", "setOnURLReceivedObservers", "(Ljava/util/Set;)V", "expo-linking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri getInitialURL() {
            return ExpoLinkingModule.initialURL;
        }

        public final Set<Function1> getOnURLReceivedObservers() {
            return ExpoLinkingModule.onURLReceivedObservers;
        }

        public final void setInitialURL(Uri uri) {
            ExpoLinkingModule.initialURL = uri;
        }

        public final void setOnURLReceivedObservers(Set<Function1> set) {
            AbstractC2855l.g(set, "<set-?>");
            ExpoLinkingModule.onURLReceivedObservers = set;
        }

        private Companion() {
        }
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoLinking");
            moduleDefinitionBuilder.Events("onURLReceived");
            AnyType[] anyTypeArr = new AnyType[0];
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Object.class));
            if (returnType == null) {
                returnType = new ReturnType(D.b(Object.class));
                returnTypeProvider.getTypes().put(D.b(Object.class), returnType);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("getLinkingURL", new SyncFunctionComponent("getLinkingURL", anyTypeArr, returnType, new Function1() { // from class: expo.modules.linking.ExpoLinkingModule$definition$lambda$1$$inlined$FunctionWithoutArgs$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    Uri uri = ExpoLinkingModule.initialURL;
                    if (uri != null) {
                        return uri.toString();
                    }
                    return null;
                }
            }));
            moduleDefinitionBuilder.OnStartObserving("onURLReceived", new InterfaceC3487a() { // from class: expo.modules.linking.ExpoLinkingModule$definition$1$2
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m265invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m265invoke() {
                    final WeakReference weakReference = new WeakReference(this.this$0);
                    Function1 function1 = new Function1() { // from class: expo.modules.linking.ExpoLinkingModule$definition$1$2$observer$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Uri) obj);
                            return C2735B.f28704a;
                        }

                        public final void invoke(Uri uri) {
                            ExpoLinkingModule expoLinkingModule = weakReference.get();
                            if (expoLinkingModule != null) {
                                expoLinkingModule.sendEvent("onURLReceived", c.a(t.a("url", uri != null ? uri.toString() : null)));
                            }
                        }
                    };
                    ExpoLinkingModule.INSTANCE.getOnURLReceivedObservers().add(function1);
                    this.this$0.onURLReceivedObserver = function1;
                }
            });
            moduleDefinitionBuilder.OnStopObserving("onURLReceived", new InterfaceC3487a() { // from class: expo.modules.linking.ExpoLinkingModule$definition$1$3
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m266invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m266invoke() {
                    Set<Function1> onURLReceivedObservers2 = ExpoLinkingModule.INSTANCE.getOnURLReceivedObservers();
                    I.a(onURLReceivedObservers2).remove(this.this$0.onURLReceivedObserver);
                }
            });
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
