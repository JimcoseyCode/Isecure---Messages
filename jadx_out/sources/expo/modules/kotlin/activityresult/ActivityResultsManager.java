package expo.modules.kotlin.activityresult;

import R8.AbstractC1417k;
import R8.C1425o;
import R8.C1435t0;
import R8.InterfaceC1421m;
import R8.N;
import android.content.Intent;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.activityaware.AppCompatActivityAware;
import expo.modules.kotlin.activityaware.AppCompatActivityAwareHelper;
import expo.modules.kotlin.activityaware.OnActivityAvailableListener;
import expo.modules.kotlin.providers.CurrentActivityProvider;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012JT\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b\"\b\b\u0000\u0010\u0015*\u00020\u0014\"\u0004\b\u0001\u0010\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00172\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lexpo/modules/kotlin/activityresult/ActivityResultsManager;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;", "Lexpo/modules/kotlin/activityaware/AppCompatActivityAware;", "Lexpo/modules/kotlin/providers/CurrentActivityProvider;", "currentActivityProvider", "<init>", "(Lexpo/modules/kotlin/providers/CurrentActivityProvider;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestCode", "resultCode", "Landroid/content/Intent;", "data", "Li7/B;", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroidx/appcompat/app/d;", "activity", "onHostResume", "(Landroidx/appcompat/app/d;)V", "onHostDestroy", "Ljava/io/Serializable;", "I", "O", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "contract", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;", "fallbackCallback", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "registerForActivityResult", "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/kotlin/activityaware/OnActivityAvailableListener;", "listener", "addOnActivityAvailableListener", "(Lexpo/modules/kotlin/activityaware/OnActivityAvailableListener;)V", "removeOnActivityAvailableListener", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;", "registry", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lexpo/modules/kotlin/activityaware/AppCompatActivityAwareHelper;", "activityAwareHelper", "Lexpo/modules/kotlin/activityaware/AppCompatActivityAwareHelper;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActivityResultsManager implements AppContextActivityResultCaller, AppCompatActivityAware {
    private final AppCompatActivityAwareHelper activityAwareHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final AppContextActivityResultRegistry registry;

    /* JADX INFO: renamed from: expo.modules.kotlin.activityresult.ActivityResultsManager$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.kotlin.activityresult.ActivityResultsManager$1", f = "ActivityResultsManager.kt", l = {101}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        Object L$0;
        Object L$1;
        int label;

        AnonymousClass1(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ActivityResultsManager.this.new AnonymousClass1(fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [expo.modules.kotlin.activityaware.OnActivityAvailableListener, expo.modules.kotlin.activityresult.ActivityResultsManager$1$invokeSuspend$$inlined$withActivityAvailable$1] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                final ActivityResultsManager activityResultsManager = ActivityResultsManager.this;
                this.L$0 = activityResultsManager;
                this.L$1 = activityResultsManager;
                this.label = 1;
                final C1425o c1425o = new C1425o(AbstractC3016b.c(this), 1);
                c1425o.F();
                final ?? r22 = new OnActivityAvailableListener() { // from class: expo.modules.kotlin.activityresult.ActivityResultsManager$1$invokeSuspend$$inlined$withActivityAvailable$1
                    @Override // expo.modules.kotlin.activityaware.OnActivityAvailableListener
                    public void onActivityAvailable(androidx.appcompat.app.d activity) {
                        Object objB;
                        AbstractC2855l.g(activity, "activity");
                        if (c1425o.d()) {
                            activityResultsManager.removeOnActivityAvailableListener(this);
                            InterfaceC1421m interfaceC1421m = c1425o;
                            try {
                                C2752o.a aVar = C2752o.f28721h;
                                activityResultsManager.registry.restoreInstanceState(activity);
                                objB = C2752o.b(C2735B.f28704a);
                            } catch (Throwable th) {
                                C2752o.a aVar2 = C2752o.f28721h;
                                objB = C2752o.b(AbstractC2753p.a(th));
                            }
                            interfaceC1421m.resumeWith(objB);
                        }
                    }
                };
                activityResultsManager.addOnActivityAvailableListener(r22);
                c1425o.g(new Function1() { // from class: expo.modules.kotlin.activityresult.ActivityResultsManager$1$invokeSuspend$$inlined$withActivityAvailable$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Throwable th) {
                        activityResultsManager.removeOnActivityAvailableListener(r22);
                    }
                });
                Object objZ = c1425o.z();
                if (objZ == AbstractC3016b.e()) {
                    h.c(this);
                }
                if (objZ == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            return C2735B.f28704a;
        }
    }

    public ActivityResultsManager(CurrentActivityProvider currentActivityProvider) {
        AbstractC2855l.g(currentActivityProvider, "currentActivityProvider");
        this.registry = new AppContextActivityResultRegistry(currentActivityProvider);
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityAwareHelper = new AppCompatActivityAwareHelper();
        AbstractC1417k.d(C1435t0.f10219g, null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // expo.modules.kotlin.activityaware.AppCompatActivityAware
    public void addOnActivityAvailableListener(OnActivityAvailableListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.activityAwareHelper.addOnActivityAvailableListener(listener);
    }

    public final void onActivityResult(int requestCode, int resultCode, Intent data) {
        this.registry.dispatchResult(requestCode, resultCode, data);
    }

    public final void onHostDestroy(androidx.appcompat.app.d activity) {
        AbstractC2855l.g(activity, "activity");
        this.registry.persistInstanceState(activity);
    }

    public final void onHostResume(androidx.appcompat.app.d activity) {
        AbstractC2855l.g(activity, "activity");
        this.activityAwareHelper.dispatchOnActivityAvailable(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [expo.modules.kotlin.activityaware.OnActivityAvailableListener, expo.modules.kotlin.activityresult.ActivityResultsManager$registerForActivityResult$$inlined$withActivityAvailable$1] */
    @Override // expo.modules.kotlin.activityresult.AppContextActivityResultCaller
    public <I extends Serializable, O> Object registerForActivityResult(final AppContextActivityResultContract<I, O> appContextActivityResultContract, final AppContextActivityResultFallbackCallback<I, O> appContextActivityResultFallbackCallback, n7.f fVar) {
        final C1425o c1425o = new C1425o(AbstractC3016b.c(fVar), 1);
        c1425o.F();
        final ?? r02 = new OnActivityAvailableListener() { // from class: expo.modules.kotlin.activityresult.ActivityResultsManager$registerForActivityResult$$inlined$withActivityAvailable$1
            @Override // expo.modules.kotlin.activityaware.OnActivityAvailableListener
            public void onActivityAvailable(androidx.appcompat.app.d activity) {
                Object objB;
                AbstractC2855l.g(activity, "activity");
                if (c1425o.d()) {
                    this.removeOnActivityAvailableListener(this);
                    InterfaceC1421m interfaceC1421m = c1425o;
                    try {
                        C2752o.a aVar = C2752o.f28721h;
                        objB = C2752o.b(this.registry.register("AppContext_rq#" + this.nextLocalRequestCode.getAndIncrement(), activity, appContextActivityResultContract, appContextActivityResultFallbackCallback));
                    } catch (Throwable th) {
                        C2752o.a aVar2 = C2752o.f28721h;
                        objB = C2752o.b(AbstractC2753p.a(th));
                    }
                    interfaceC1421m.resumeWith(objB);
                }
            }
        };
        addOnActivityAvailableListener(r02);
        c1425o.g(new Function1() { // from class: expo.modules.kotlin.activityresult.ActivityResultsManager$registerForActivityResult$$inlined$withActivityAvailable$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2735B.f28704a;
            }

            public final void invoke(Throwable th) {
                this.removeOnActivityAvailableListener(r02);
            }
        });
        Object objZ = c1425o.z();
        if (objZ == AbstractC3016b.e()) {
            h.c(fVar);
        }
        return objZ;
    }

    @Override // expo.modules.kotlin.activityaware.AppCompatActivityAware
    public void removeOnActivityAvailableListener(OnActivityAvailableListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.activityAwareHelper.removeOnActivityAvailableListener(listener);
    }
}
