package expo.modules;

import R8.AbstractC1417k;
import R8.AbstractC1444y;
import R8.C1404d0;
import R8.InterfaceC1440w;
import R8.N;
import R8.O;
import R8.P;
import a9.InterfaceC1601a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC1771s;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactDelegate;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.interfaces.Package;
import expo.modules.core.interfaces.ReactActivityHandler;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import expo.modules.kotlin.Utils;
import expo.modules.kotlin.exception.Exceptions;
import i7.AbstractC2746i;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2752o;
import j7.AbstractC2800q;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import m0.C2892a;
import o7.AbstractC3016b;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0094\u00012\u00020\u0001:\u0002\u0094\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\tJ\u001d\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00182\"\u0010\u001e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\"\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b%\u0010&J\u0011\u0010(\u001a\u0004\u0018\u00010'H\u0014¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0011\u00100\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u00020\u00112\b\u00104\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0011H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0011H\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\u0011H\u0016¢\u0006\u0004\b:\u00108J\u000f\u0010;\u001a\u00020\u0011H\u0016¢\u0006\u0004\b;\u00108J)\u0010A\u001a\u00020\u00112\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010F\u001a\u00020\u00042\u0006\u0010C\u001a\u00020<2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u001f\u0010H\u001a\u00020\u00042\u0006\u0010C\u001a\u00020<2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bH\u0010GJ\u001f\u0010I\u001a\u00020\u00042\u0006\u0010C\u001a\u00020<2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bI\u0010GJ\u000f\u0010J\u001a\u00020\u0004H\u0016¢\u0006\u0004\bJ\u0010KJ\u0019\u0010M\u001a\u00020\u00042\b\u0010L\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u0004H\u0016¢\u0006\u0004\bP\u0010QJ1\u0010V\u001a\u00020\u00112\u000e\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0R2\u0006\u0010=\u001a\u00020<2\b\u0010U\u001a\u0004\u0018\u00010TH\u0016¢\u0006\u0004\bV\u0010WJ/\u0010Z\u001a\u00020\u00112\u0006\u0010=\u001a\u00020<2\u000e\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0R2\u0006\u0010Y\u001a\u00020XH\u0016¢\u0006\u0004\bZ\u0010[J\u000f\u0010]\u001a\u00020\\H\u0014¢\u0006\u0004\b]\u0010^J\u000f\u0010`\u001a\u00020_H\u0014¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u0004H\u0014¢\u0006\u0004\bb\u0010KJ\u000f\u0010c\u001a\u00020\u0004H\u0014¢\u0006\u0004\bc\u0010KJ\u0011\u0010d\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\bd\u0010#J\u0017\u0010g\u001a\u00020\u00112\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJC\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010i2\u0006\u0010\f\u001a\u00020\u000b2\u0010\u0010k\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030j0R2\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00010RH\u0001¢\u0006\u0004\bm\u0010nJ\u000f\u0010p\u001a\u00020\u0011H\u0001¢\u0006\u0004\bo\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010qR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010rR\"\u0010\u0006\u001a\u00020\u00018A@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010{\u001a\u0010\u0012\f\u0012\n z*\u0004\u0018\u00010y0y0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\"\u0010~\u001a\u0010\u0012\f\u0012\n z*\u0004\u0018\u00010}0}0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010|R$\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0005\u0012\u00030\u0080\u00010\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R!\u0010\u0086\u0001\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010,R!\u0010\u0015\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0084\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0093\u0001\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0084\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0095\u0001"}, d2 = {"Lexpo/modules/ReactActivityDelegateWrapper;", "Lcom/facebook/react/ReactActivityDelegate;", "Lcom/facebook/react/ReactActivity;", "activity", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isNewArchitectureEnabled", "delegate", "<init>", "(Lcom/facebook/react/ReactActivity;ZLcom/facebook/react/ReactActivityDelegate;)V", "(Lcom/facebook/react/ReactActivity;Lcom/facebook/react/ReactActivityDelegate;)V", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "invokeDelegateMethod", "(Ljava/lang/String;)Ljava/lang/Object;", "appKey", "supportsDelayLoad", "Li7/B;", "loadAppImpl", "(Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;", "Lexpo/modules/core/interfaces/ReactActivityHandler$DelayLoadAppHandler;", "delayLoadAppHandler", "awaitDelayLoadAppWhenReady", "(Lexpo/modules/core/interfaces/ReactActivityHandler$DelayLoadAppHandler;Ln7/f;)Ljava/lang/Object;", "LR8/P;", ViewProps.START, "Lkotlin/Function2;", "LR8/N;", "Ln7/f;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "block", "launchLifecycleScopeWithLock", "(LR8/P;Lkotlin/jvm/functions/Function2;)V", "Landroid/os/Bundle;", "getLaunchOptions", "()Landroid/os/Bundle;", "Lcom/facebook/react/ReactRootView;", "createRootView", "()Lcom/facebook/react/ReactRootView;", "Lcom/facebook/react/ReactDelegate;", "getReactDelegate", "()Lcom/facebook/react/ReactDelegate;", "Lcom/facebook/react/ReactHost;", "getReactHost", "()Lcom/facebook/react/ReactHost;", "Lcom/facebook/react/ReactInstanceManager;", "getReactInstanceManager", "()Lcom/facebook/react/ReactInstanceManager;", "getMainComponentName", "()Ljava/lang/String;", "loadApp", "(Ljava/lang/String;)V", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "()V", "onPause", "onUserLeaveHint", "onDestroy", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "onKeyUp", "onKeyLongPress", "onBackPressed", "()Z", "intent", "onNewIntent", "(Landroid/content/Intent;)Z", "hasFocus", "onWindowFocusChanged", "(Z)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "permissions", "Lcom/facebook/react/modules/core/PermissionListener;", "listener", "requestPermissions", "([Ljava/lang/String;ILcom/facebook/react/modules/core/PermissionListener;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "getPlainActivity", "()Landroid/app/Activity;", "isFabricEnabled", "isWideColorGamutEnabled", "composeLaunchOptions", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "A", "Ljava/lang/Class;", "argTypes", "args", "invokeDelegateMethod$expo_release", "(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;", "setLoadAppReadyForTesting$expo_release", "setLoadAppReadyForTesting", "Lcom/facebook/react/ReactActivity;", "Z", "Lcom/facebook/react/ReactActivityDelegate;", "getDelegate$expo_release", "()Lcom/facebook/react/ReactActivityDelegate;", "setDelegate$expo_release", "(Lcom/facebook/react/ReactActivityDelegate;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;", "kotlin.jvm.PlatformType", "reactActivityLifecycleListeners", "Ljava/util/List;", "Lexpo/modules/core/interfaces/ReactActivityHandler;", "reactActivityHandlers", "Lm0/a;", "Ljava/lang/reflect/Method;", "methodMap", "Lm0/a;", "_reactHost$delegate", "Lkotlin/Lazy;", "get_reactHost", "_reactHost", "delayLoadAppHandler$delegate", "getDelayLoadAppHandler", "()Lexpo/modules/core/interfaces/ReactActivityHandler$DelayLoadAppHandler;", "LR8/w;", "loadAppReady", "LR8/w;", "La9/a;", "mutex", "La9/a;", "applicationCoroutineScope$delegate", "getApplicationCoroutineScope", "()LR8/N;", "applicationCoroutineScope", "Companion", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactActivityDelegateWrapper extends ReactActivityDelegate {
    private static final String TAG = D.b(ReactActivityDelegate.class).o();

    /* JADX INFO: renamed from: _reactHost$delegate, reason: from kotlin metadata */
    private final Lazy _reactHost;
    private final ReactActivity activity;

    /* JADX INFO: renamed from: applicationCoroutineScope$delegate, reason: from kotlin metadata */
    private final Lazy applicationCoroutineScope;

    /* JADX INFO: renamed from: delayLoadAppHandler$delegate, reason: from kotlin metadata */
    private final Lazy delayLoadAppHandler;
    private ReactActivityDelegate delegate;
    private final boolean isNewArchitectureEnabled;
    private final InterfaceC1440w loadAppReady;
    private final C2892a methodMap;
    private final InterfaceC1601a mutex;
    private final List<ReactActivityHandler> reactActivityHandlers;
    private final List<ReactActivityLifecycleListener> reactActivityLifecycleListeners;

    /* JADX INFO: renamed from: expo.modules.ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1", f = "ReactActivityDelegateWrapper.kt", l = {478, 452}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ Function2 $block;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function2 function2, n7.f fVar) {
            super(2, fVar);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            AnonymousClass1 anonymousClass1 = ReactActivityDelegateWrapper.this.new AnonymousClass1(this.$block, fVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            N n10;
            InterfaceC1601a interfaceC1601a;
            Function2 function2;
            InterfaceC1601a interfaceC1601a2;
            Throwable th;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    AbstractC2753p.b(obj);
                    n10 = (N) this.L$0;
                    interfaceC1601a = ReactActivityDelegateWrapper.this.mutex;
                    function2 = this.$block;
                    this.L$0 = n10;
                    this.L$1 = interfaceC1601a;
                    this.L$2 = function2;
                    this.label = 1;
                    if (interfaceC1601a.a(null, this) != objE) {
                    }
                    return objE;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC1601a2 = (InterfaceC1601a) this.L$0;
                    try {
                        AbstractC2753p.b(obj);
                        C2735B c2735b = C2735B.f28704a;
                        interfaceC1601a2.c(null);
                        return C2735B.f28704a;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC1601a2.c(null);
                        throw th;
                    }
                }
                function2 = (Function2) this.L$2;
                InterfaceC1601a interfaceC1601a3 = (InterfaceC1601a) this.L$1;
                n10 = (N) this.L$0;
                AbstractC2753p.b(obj);
                interfaceC1601a = interfaceC1601a3;
                this.L$0 = interfaceC1601a;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                if (function2.invoke(n10, this) != objE) {
                    interfaceC1601a2 = interfaceC1601a;
                    C2735B c2735b2 = C2735B.f28704a;
                    interfaceC1601a2.c(null);
                    return C2735B.f28704a;
                }
                return objE;
            } catch (Throwable th3) {
                interfaceC1601a2 = interfaceC1601a;
                th = th3;
                interfaceC1601a2.c(null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: expo.modules.ReactActivityDelegateWrapper$loadApp$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.ReactActivityDelegateWrapper$loadApp$1", f = "ReactActivityDelegateWrapper.kt", l = {112}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class C24421 extends l implements Function2 {
        final /* synthetic */ String $appKey;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24421(String str, n7.f fVar) {
            super(2, fVar);
            this.$appKey = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ReactActivityDelegateWrapper.this.new C24421(this.$appKey, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24421) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                ReactActivityDelegateWrapper reactActivityDelegateWrapper = ReactActivityDelegateWrapper.this;
                String str = this.$appKey;
                this.label = 1;
                if (reactActivityDelegateWrapper.loadAppImpl(str, true, this) == objE) {
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

    /* JADX INFO: renamed from: expo.modules.ReactActivityDelegateWrapper$loadAppImpl$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.ReactActivityDelegateWrapper", f = "ReactActivityDelegateWrapper.kt", l = {420}, m = "loadAppImpl")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C24431 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C24431(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return ReactActivityDelegateWrapper.this.loadAppImpl(null, false, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.ReactActivityDelegateWrapper$onActivityResult$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.ReactActivityDelegateWrapper$onActivityResult$1", f = "ReactActivityDelegateWrapper.kt", l = {257}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class C24441 extends l implements Function2 {
        final /* synthetic */ Intent $data;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ int $resultCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24441(int i10, int i11, Intent intent, n7.f fVar) {
            super(2, fVar);
            this.$requestCode = i10;
            this.$resultCode = i11;
            this.$data = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ReactActivityDelegateWrapper.this.new C24441(this.$requestCode, this.$resultCode, this.$data, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24441) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                InterfaceC1440w interfaceC1440w = ReactActivityDelegateWrapper.this.loadAppReady;
                this.label = 1;
                if (interfaceC1440w.I(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            ReactActivityDelegateWrapper.this.getDelegate().onActivityResult(this.$requestCode, this.$resultCode, this.$data);
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.ReactActivityDelegateWrapper$onConfigurationChanged$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.ReactActivityDelegateWrapper$onConfigurationChanged$1", f = "ReactActivityDelegateWrapper.kt", l = {360}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class C24451 extends l implements Function2 {
        final /* synthetic */ Configuration $newConfig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24451(Configuration configuration, n7.f fVar) {
            super(2, fVar);
            this.$newConfig = configuration;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ReactActivityDelegateWrapper.this.new C24451(this.$newConfig, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24451) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                InterfaceC1440w interfaceC1440w = ReactActivityDelegateWrapper.this.loadAppReady;
                this.label = 1;
                if (interfaceC1440w.I(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            ReactActivityDelegateWrapper.this.getDelegate().onConfigurationChanged(this.$newConfig);
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.ReactActivityDelegateWrapper$onCreate$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.ReactActivityDelegateWrapper$onCreate$2", f = "ReactActivityDelegateWrapper.kt", l = {145, 164}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass2 extends l implements Function2 {
        int label;

        AnonymousClass2(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ReactActivityDelegateWrapper.this.new AnonymousClass2(fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass2) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
        
            if (r8.loadAppImpl(r1, false, r7) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchFieldException {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                ReactActivityDelegateWrapper reactActivityDelegateWrapper = ReactActivityDelegateWrapper.this;
                ReactActivityHandler.DelayLoadAppHandler delayLoadAppHandler = reactActivityDelegateWrapper.getDelayLoadAppHandler();
                this.label = 1;
                if (reactActivityDelegateWrapper.awaitDelayLoadAppWhenReady(delayLoadAppHandler, this) != objE) {
                }
                return objE;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return C2735B.f28704a;
            }
            AbstractC2753p.b(obj);
            ReactActivityDelegateWrapper.this.loadAppReady.l0(C2735B.f28704a);
            if (Build.VERSION.SDK_INT >= 26 && ReactActivityDelegateWrapper.this.isWideColorGamutEnabled()) {
                ReactActivityDelegateWrapper.this.activity.getWindow().setColorMode(1);
            }
            ReactDelegate reactDelegate = new ReactDelegate(ReactActivityDelegateWrapper.this.getPlainActivity(), ReactActivityDelegateWrapper.this.getReactHost(), ReactActivityDelegateWrapper.this.getMainComponentName(), ReactActivityDelegateWrapper.this.composeLaunchOptions());
            Field declaredField = ReactActivityDelegate.class.getDeclaredField("mReactDelegate");
            declaredField.setAccessible(true);
            declaredField.set(ReactActivityDelegateWrapper.this.getDelegate(), reactDelegate);
            if (ReactActivityDelegateWrapper.this.getMainComponentName() != null) {
                ReactActivityDelegateWrapper reactActivityDelegateWrapper2 = ReactActivityDelegateWrapper.this;
                String mainComponentName = reactActivityDelegateWrapper2.getMainComponentName();
                this.label = 2;
            }
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.ReactActivityDelegateWrapper$onDestroy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.ReactActivityDelegateWrapper$onDestroy$1", f = "ReactActivityDelegateWrapper.kt", l = {478, 221}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class C24461 extends l implements Function2 {
        Object L$0;
        Object L$1;
        int label;

        C24461(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ReactActivityDelegateWrapper.this.new C24461(fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24461) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[Catch: all -> 0x001b, LOOP:0: B:22:0x0066->B:24:0x006c, LOOP_END, TryCatch #2 {all -> 0x001b, blocks: (B:7:0x0017, B:21:0x005e, B:22:0x0066, B:24:0x006c, B:25:0x007a, B:27:0x0080, B:32:0x00a0, B:31:0x0099, B:30:0x008b), top: B:43:0x0017, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:7:0x0017, B:21:0x005e, B:22:0x0066, B:24:0x006c, B:25:0x007a, B:27:0x0080, B:32:0x00a0, B:31:0x0099, B:30:0x008b), top: B:43:0x0017, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC1601a interfaceC1601a;
            ReactActivityDelegateWrapper reactActivityDelegateWrapper;
            InterfaceC1601a interfaceC1601a2;
            Throwable th;
            ReactActivityDelegateWrapper reactActivityDelegateWrapper2;
            Iterator it;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    AbstractC2753p.b(obj);
                    interfaceC1601a = ReactActivityDelegateWrapper.this.mutex;
                    reactActivityDelegateWrapper = ReactActivityDelegateWrapper.this;
                    this.L$0 = interfaceC1601a;
                    this.L$1 = reactActivityDelegateWrapper;
                    this.label = 1;
                    if (interfaceC1601a.a(null, this) != objE) {
                    }
                    return objE;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    reactActivityDelegateWrapper2 = (ReactActivityDelegateWrapper) this.L$1;
                    interfaceC1601a2 = (InterfaceC1601a) this.L$0;
                    try {
                        AbstractC2753p.b(obj);
                        it = reactActivityDelegateWrapper2.reactActivityLifecycleListeners.iterator();
                        while (it.hasNext()) {
                            ((ReactActivityLifecycleListener) it.next()).onDestroy(reactActivityDelegateWrapper2.activity);
                        }
                        if (reactActivityDelegateWrapper2.getDelayLoadAppHandler() == null) {
                            try {
                                reactActivityDelegateWrapper2.getDelegate().onDestroy();
                                C2735B c2735b = C2735B.f28704a;
                            } catch (Exception e10) {
                                kotlin.coroutines.jvm.internal.b.c(Log.e(ReactActivityDelegateWrapper.TAG, "Exception occurred during onDestroy with delayed app loading", e10));
                            }
                        } else {
                            reactActivityDelegateWrapper2.getDelegate().onDestroy();
                        }
                        C2735B c2735b2 = C2735B.f28704a;
                        interfaceC1601a2.c(null);
                        return C2735B.f28704a;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC1601a2.c(null);
                        throw th;
                    }
                }
                reactActivityDelegateWrapper = (ReactActivityDelegateWrapper) this.L$1;
                InterfaceC1601a interfaceC1601a3 = (InterfaceC1601a) this.L$0;
                AbstractC2753p.b(obj);
                interfaceC1601a = interfaceC1601a3;
                InterfaceC1440w interfaceC1440w = reactActivityDelegateWrapper.loadAppReady;
                this.L$0 = interfaceC1601a;
                this.L$1 = reactActivityDelegateWrapper;
                this.label = 2;
                if (interfaceC1440w.I(this) != objE) {
                    reactActivityDelegateWrapper2 = reactActivityDelegateWrapper;
                    interfaceC1601a2 = interfaceC1601a;
                    it = reactActivityDelegateWrapper2.reactActivityLifecycleListeners.iterator();
                    while (it.hasNext()) {
                    }
                    if (reactActivityDelegateWrapper2.getDelayLoadAppHandler() == null) {
                    }
                    C2735B c2735b22 = C2735B.f28704a;
                    interfaceC1601a2.c(null);
                    return C2735B.f28704a;
                }
                return objE;
            } catch (Throwable th3) {
                interfaceC1601a2 = interfaceC1601a;
                th = th3;
                interfaceC1601a2.c(null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: expo.modules.ReactActivityDelegateWrapper$onPause$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.ReactActivityDelegateWrapper$onPause$1", f = "ReactActivityDelegateWrapper.kt", l = {186}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class C24471 extends l implements Function2 {
        int label;

        C24471(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ReactActivityDelegateWrapper.this.new C24471(fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24471) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                InterfaceC1440w interfaceC1440w = ReactActivityDelegateWrapper.this.loadAppReady;
                this.label = 1;
                if (interfaceC1440w.I(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            List list = ReactActivityDelegateWrapper.this.reactActivityLifecycleListeners;
            ReactActivityDelegateWrapper reactActivityDelegateWrapper = ReactActivityDelegateWrapper.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ReactActivityLifecycleListener) it.next()).onPause(reactActivityDelegateWrapper.activity);
            }
            if (ReactActivityDelegateWrapper.this.getDelayLoadAppHandler() != null) {
                try {
                    ReactActivityDelegateWrapper.this.getDelegate().onPause();
                    C2735B c2735b = C2735B.f28704a;
                } catch (Exception e10) {
                    kotlin.coroutines.jvm.internal.b.c(Log.e(ReactActivityDelegateWrapper.TAG, "Exception occurred during onPause with delayed app loading", e10));
                }
            } else {
                ReactActivityDelegateWrapper.this.getDelegate().onPause();
            }
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.ReactActivityDelegateWrapper$onRequestPermissionsResult$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.ReactActivityDelegateWrapper$onRequestPermissionsResult$1", f = "ReactActivityDelegateWrapper.kt", l = {333}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class C24481 extends l implements Function2 {
        final /* synthetic */ int[] $grantResults;
        final /* synthetic */ String[] $permissions;
        final /* synthetic */ int $requestCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24481(int i10, String[] strArr, int[] iArr, n7.f fVar) {
            super(2, fVar);
            this.$requestCode = i10;
            this.$permissions = strArr;
            this.$grantResults = iArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ReactActivityDelegateWrapper.this.new C24481(this.$requestCode, this.$permissions, this.$grantResults, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24481) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                InterfaceC1440w interfaceC1440w = ReactActivityDelegateWrapper.this.loadAppReady;
                this.label = 1;
                if (interfaceC1440w.I(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            ReactActivityDelegateWrapper.this.getDelegate().onRequestPermissionsResult(this.$requestCode, this.$permissions, this.$grantResults);
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.ReactActivityDelegateWrapper$onResume$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.ReactActivityDelegateWrapper$onResume$1", f = "ReactActivityDelegateWrapper.kt", l = {176}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class C24491 extends l implements Function2 {
        int label;

        C24491(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ReactActivityDelegateWrapper.this.new C24491(fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24491) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                InterfaceC1440w interfaceC1440w = ReactActivityDelegateWrapper.this.loadAppReady;
                this.label = 1;
                if (interfaceC1440w.I(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            ReactActivityDelegateWrapper.this.getDelegate().onResume();
            List list = ReactActivityDelegateWrapper.this.reactActivityLifecycleListeners;
            ReactActivityDelegateWrapper reactActivityDelegateWrapper = ReactActivityDelegateWrapper.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ReactActivityLifecycleListener) it.next()).onResume(reactActivityDelegateWrapper.activity);
            }
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.ReactActivityDelegateWrapper$onUserLeaveHint$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.ReactActivityDelegateWrapper$onUserLeaveHint$1", f = "ReactActivityDelegateWrapper.kt", l = {JfifUtil.MARKER_RST0}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class C24501 extends l implements Function2 {
        int label;

        C24501(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ReactActivityDelegateWrapper.this.new C24501(fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24501) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                InterfaceC1440w interfaceC1440w = ReactActivityDelegateWrapper.this.loadAppReady;
                this.label = 1;
                if (interfaceC1440w.I(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            List list = ReactActivityDelegateWrapper.this.reactActivityLifecycleListeners;
            ReactActivityDelegateWrapper reactActivityDelegateWrapper = ReactActivityDelegateWrapper.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ReactActivityLifecycleListener) it.next()).onUserLeaveHint(reactActivityDelegateWrapper.activity);
            }
            ReactActivityDelegateWrapper.this.getDelegate().onUserLeaveHint();
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.ReactActivityDelegateWrapper$onWindowFocusChanged$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.ReactActivityDelegateWrapper$onWindowFocusChanged$1", f = "ReactActivityDelegateWrapper.kt", l = {319}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class C24511 extends l implements Function2 {
        final /* synthetic */ boolean $hasFocus;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24511(boolean z10, n7.f fVar) {
            super(2, fVar);
            this.$hasFocus = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ReactActivityDelegateWrapper.this.new C24511(this.$hasFocus, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24511) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                InterfaceC1440w interfaceC1440w = ReactActivityDelegateWrapper.this.loadAppReady;
                this.label = 1;
                if (interfaceC1440w.I(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            ReactActivityDelegateWrapper.this.getDelegate().onWindowFocusChanged(this.$hasFocus);
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.ReactActivityDelegateWrapper$requestPermissions$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.ReactActivityDelegateWrapper$requestPermissions$1", f = "ReactActivityDelegateWrapper.kt", l = {326}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class C24521 extends l implements Function2 {
        final /* synthetic */ PermissionListener $listener;
        final /* synthetic */ String[] $permissions;
        final /* synthetic */ int $requestCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24521(String[] strArr, int i10, PermissionListener permissionListener, n7.f fVar) {
            super(2, fVar);
            this.$permissions = strArr;
            this.$requestCode = i10;
            this.$listener = permissionListener;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ReactActivityDelegateWrapper.this.new C24521(this.$permissions, this.$requestCode, this.$listener, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24521) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                InterfaceC1440w interfaceC1440w = ReactActivityDelegateWrapper.this.loadAppReady;
                this.label = 1;
                if (interfaceC1440w.I(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            ReactActivityDelegateWrapper.this.getDelegate().requestPermissions(this.$permissions, this.$requestCode, this.$listener);
            return C2735B.f28704a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactActivityDelegateWrapper(ReactActivity activity, boolean z10, ReactActivityDelegate delegate) {
        super(activity, (String) null);
        AbstractC2855l.g(activity, "activity");
        AbstractC2855l.g(delegate, "delegate");
        this.activity = activity;
        this.isNewArchitectureEnabled = z10;
        this.delegate = delegate;
        List<Package> packageList = ExpoModulesPackage.INSTANCE.getPackageList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = packageList.iterator();
        while (it.hasNext()) {
            List<? extends ReactActivityLifecycleListener> listCreateReactActivityLifecycleListeners = ((Package) it.next()).createReactActivityLifecycleListeners(this.activity);
            AbstractC2855l.f(listCreateReactActivityLifecycleListeners, "createReactActivityLifecycleListeners(...)");
            AbstractC2800q.A(arrayList, listCreateReactActivityLifecycleListeners);
        }
        this.reactActivityLifecycleListeners = arrayList;
        List<Package> packageList2 = ExpoModulesPackage.INSTANCE.getPackageList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = packageList2.iterator();
        while (it2.hasNext()) {
            List<? extends ReactActivityHandler> listCreateReactActivityHandlers = ((Package) it2.next()).createReactActivityHandlers(this.activity);
            AbstractC2855l.f(listCreateReactActivityHandlers, "createReactActivityHandlers(...)");
            AbstractC2800q.A(arrayList2, listCreateReactActivityHandlers);
        }
        this.reactActivityHandlers = arrayList2;
        this.methodMap = new C2892a();
        this._reactHost = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.g
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ReactActivityDelegateWrapper._reactHost_delegate$lambda$2(this.f26526g);
            }
        });
        this.delayLoadAppHandler = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.h
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ReactActivityDelegateWrapper.delayLoadAppHandler_delegate$lambda$4(this.f26527g);
            }
        });
        this.loadAppReady = AbstractC1444y.b(null, 1, null);
        this.mutex = a9.g.b(false, 1, null);
        this.applicationCoroutineScope = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.i
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ReactActivityDelegateWrapper.applicationCoroutineScope_delegate$lambda$5();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactHost _reactHost_delegate$lambda$2(ReactActivityDelegateWrapper reactActivityDelegateWrapper) {
        return reactActivityDelegateWrapper.delegate.getReactHost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final N applicationCoroutineScope_delegate$lambda$5() {
        return O.a(C1404d0.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitDelayLoadAppWhenReady(ReactActivityHandler.DelayLoadAppHandler delayLoadAppHandler, n7.f fVar) {
        if (delayLoadAppHandler == null) {
            return C2735B.f28704a;
        }
        final n7.l lVar = new n7.l(AbstractC3016b.c(fVar));
        delayLoadAppHandler.whenReady(new Runnable() { // from class: expo.modules.ReactActivityDelegateWrapper$awaitDelayLoadAppWhenReady$2$1
            @Override // java.lang.Runnable
            public final void run() throws Exceptions.IncorrectThreadException {
                Utils utils = Utils.INSTANCE;
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    n7.f fVar2 = lVar;
                    C2752o.a aVar = C2752o.f28721h;
                    fVar2.resumeWith(C2752o.b(C2735B.f28704a));
                } else {
                    String name = Thread.currentThread().getName();
                    AbstractC2855l.f(name, "getName(...)");
                    String name2 = Looper.getMainLooper().getThread().getName();
                    AbstractC2855l.f(name2, "getName(...)");
                    throw new Exceptions.IncorrectThreadException(name, name2);
                }
            }
        });
        Object objA = lVar.a();
        if (objA == AbstractC3016b.e()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objA == AbstractC3016b.e() ? objA : C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactActivityHandler.DelayLoadAppHandler delayLoadAppHandler_delegate$lambda$4(final ReactActivityDelegateWrapper reactActivityDelegateWrapper) {
        return (ReactActivityHandler.DelayLoadAppHandler) O8.l.C(O8.l.K(AbstractC2800q.V(reactActivityDelegateWrapper.reactActivityHandlers), new Function1() { // from class: expo.modules.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactActivityDelegateWrapper.delayLoadAppHandler_delegate$lambda$4$lambda$3(this.f26562g, (ReactActivityHandler) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactActivityHandler.DelayLoadAppHandler delayLoadAppHandler_delegate$lambda$4$lambda$3(ReactActivityDelegateWrapper reactActivityDelegateWrapper, ReactActivityHandler reactActivityHandler) {
        return reactActivityHandler.getDelayLoadAppHandler(reactActivityDelegateWrapper.activity, reactActivityDelegateWrapper.getReactHost());
    }

    private final N getApplicationCoroutineScope() {
        return (N) this.applicationCoroutineScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReactActivityHandler.DelayLoadAppHandler getDelayLoadAppHandler() {
        return (ReactActivityHandler.DelayLoadAppHandler) this.delayLoadAppHandler.getValue();
    }

    private final ReactHost get_reactHost() {
        return (ReactHost) this._reactHost.getValue();
    }

    private final <T> T invokeDelegateMethod(String name) throws NoSuchMethodException {
        Method declaredMethod = (Method) this.methodMap.get(name);
        if (declaredMethod == null) {
            declaredMethod = ReactActivityDelegate.class.getDeclaredMethod(name, null);
            declaredMethod.setAccessible(true);
            this.methodMap.put(name, declaredMethod);
        }
        AbstractC2855l.d(declaredMethod);
        return (T) declaredMethod.invoke(this.delegate, null);
    }

    private final void launchLifecycleScopeWithLock(P start, Function2 block) {
        AbstractC1417k.d(AbstractC1771s.a(this.activity), null, start, new AnonymousClass1(block, null), 1, null);
    }

    static /* synthetic */ void launchLifecycleScopeWithLock$default(ReactActivityDelegateWrapper reactActivityDelegateWrapper, P p10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            p10 = P.f10148g;
        }
        reactActivityDelegateWrapper.launchLifecycleScopeWithLock(p10, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadAppImpl(String str, boolean z10, n7.f fVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        C24431 c24431;
        if (fVar instanceof C24431) {
            c24431 = (C24431) fVar;
            int i10 = c24431.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c24431.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c24431 = new C24431(fVar);
            }
        }
        Object obj = c24431.result;
        Object objE = AbstractC3016b.e();
        int i11 = c24431.label;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            ViewGroup viewGroup = (ViewGroup) O8.l.C(O8.l.K(AbstractC2800q.V(this.reactActivityHandlers), new Function1() { // from class: expo.modules.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ReactActivityDelegateWrapper.loadAppImpl$lambda$18(this.f26518g, (ReactActivityHandler) obj2);
                }
            }));
            if (viewGroup != null) {
                Field declaredField = ReactActivityDelegate.class.getDeclaredField("mReactDelegate");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this.delegate);
                AbstractC2855l.e(obj2, "null cannot be cast to non-null type com.facebook.react.ReactDelegate");
                ReactDelegate reactDelegate = (ReactDelegate) obj2;
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                reactDelegate.loadApp(str);
                ReactRootView reactRootView = reactDelegate.getReactRootView();
                ViewParent parent = reactRootView != null ? reactRootView.getParent() : null;
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(reactRootView);
                }
                viewGroup.addView(reactRootView, -1);
                this.activity.setContentView(viewGroup);
                Iterator<T> it = this.reactActivityLifecycleListeners.iterator();
                while (it.hasNext()) {
                    ((ReactActivityLifecycleListener) it.next()).onContentChanged(this.activity);
                }
                return C2735B.f28704a;
            }
            if (!z10) {
                invokeDelegateMethod$expo_release("loadApp", new Class[]{String.class}, new String[]{str});
                Iterator<T> it2 = this.reactActivityLifecycleListeners.iterator();
                while (it2.hasNext()) {
                    ((ReactActivityLifecycleListener) it2.next()).onContentChanged(this.activity);
                }
                return C2735B.f28704a;
            }
            ReactActivityHandler.DelayLoadAppHandler delayLoadAppHandler = getDelayLoadAppHandler();
            c24431.L$0 = str;
            c24431.label = 1;
            if (awaitDelayLoadAppWhenReady(delayLoadAppHandler, c24431) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c24431.L$0;
            AbstractC2753p.b(obj);
        }
        invokeDelegateMethod$expo_release("loadApp", new Class[]{String.class}, new String[]{str});
        Iterator<T> it3 = this.reactActivityLifecycleListeners.iterator();
        while (it3.hasNext()) {
            ((ReactActivityLifecycleListener) it3.next()).onContentChanged(this.activity);
        }
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup loadAppImpl$lambda$18(ReactActivityDelegateWrapper reactActivityDelegateWrapper, ReactActivityHandler reactActivityHandler) {
        return reactActivityHandler.createReactRootViewContainer(reactActivityDelegateWrapper.activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactActivityDelegate onCreate$lambda$6(ReactActivityDelegateWrapper reactActivityDelegateWrapper, ReactActivityHandler reactActivityHandler) {
        return reactActivityHandler.onDidCreateReactActivityDelegate(reactActivityDelegateWrapper.activity, reactActivityDelegateWrapper);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected Bundle composeLaunchOptions() {
        return (Bundle) invokeDelegateMethod("composeLaunchOptions");
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected ReactRootView createRootView() {
        return (ReactRootView) invokeDelegateMethod("createRootView");
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected Context getContext() {
        return (Context) invokeDelegateMethod("getContext");
    }

    /* JADX INFO: renamed from: getDelegate$expo_release, reason: from getter */
    public final ReactActivityDelegate getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected Bundle getLaunchOptions() {
        return (Bundle) invokeDelegateMethod("getLaunchOptions");
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public String getMainComponentName() {
        return this.delegate.getMainComponentName();
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected Activity getPlainActivity() {
        return (Activity) invokeDelegateMethod("getPlainActivity");
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected ReactDelegate getReactDelegate() {
        return (ReactDelegate) invokeDelegateMethod("getReactDelegate");
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public ReactHost getReactHost() {
        return get_reactHost();
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public ReactInstanceManager getReactInstanceManager() {
        ReactInstanceManager reactInstanceManager = this.delegate.getReactInstanceManager();
        AbstractC2855l.f(reactInstanceManager, "getReactInstanceManager(...)");
        return reactInstanceManager;
    }

    public final <T, A> T invokeDelegateMethod$expo_release(String name, Class<?>[] argTypes, A[] args) throws NoSuchMethodException {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(argTypes, "argTypes");
        AbstractC2855l.g(args, "args");
        Method declaredMethod = (Method) this.methodMap.get(name);
        if (declaredMethod == null) {
            declaredMethod = ReactActivityDelegate.class.getDeclaredMethod(name, (Class[]) Arrays.copyOf(argTypes, argTypes.length));
            declaredMethod.setAccessible(true);
            this.methodMap.put(name, declaredMethod);
        }
        AbstractC2855l.d(declaredMethod);
        return (T) declaredMethod.invoke(this.delegate, Arrays.copyOf(args, args.length));
    }

    @Override // com.facebook.react.ReactActivityDelegate
    /* JADX INFO: renamed from: isFabricEnabled */
    protected boolean getFabricEnabled() {
        return ((Boolean) invokeDelegateMethod("isFabricEnabled")).booleanValue();
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected boolean isWideColorGamutEnabled() {
        return ((Boolean) invokeDelegateMethod("isWideColorGamutEnabled")).booleanValue();
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected void loadApp(String appKey) {
        launchLifecycleScopeWithLock(P.f10151j, new C24421(appKey, null));
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        launchLifecycleScopeWithLock$default(this, null, new C24441(requestCode, resultCode, data, null), 1, null);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public boolean onBackPressed() {
        boolean z10;
        if (!this.loadAppReady.isCompleted()) {
            return false;
        }
        List<ReactActivityLifecycleListener> list = this.reactActivityLifecycleListeners;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((ReactActivityLifecycleListener) it.next()).onBackPressed()));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z10 = false;
            while (it2.hasNext()) {
                boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                if (z10 || zBooleanValue) {
                    z10 = true;
                }
            }
        }
        return z10 || this.delegate.onBackPressed();
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC2855l.g(newConfig, "newConfig");
        launchLifecycleScopeWithLock$default(this, null, new C24451(newConfig, null), 1, null);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    @SuppressLint({"DiscouragedPrivateApi"})
    public void onCreate(Bundle savedInstanceState) throws IllegalAccessException, NoSuchFieldException {
        ReactActivityDelegate reactActivityDelegate = (ReactActivityDelegate) O8.l.C(O8.l.K(AbstractC2800q.V(this.reactActivityHandlers), new Function1() { // from class: expo.modules.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactActivityDelegateWrapper.onCreate$lambda$6(this.f26517g, (ReactActivityHandler) obj);
            }
        }));
        Iterator<T> it = this.reactActivityHandlers.iterator();
        while (it.hasNext()) {
            ((ReactActivityHandler) it.next()).onDidCreateReactActivityDelegateNotification(this.activity, reactActivityDelegate);
        }
        if (reactActivityDelegate == null || AbstractC2855l.b(reactActivityDelegate, this)) {
            launchLifecycleScopeWithLock(P.f10151j, new AnonymousClass2(null));
        } else {
            Field declaredField = ReactActivity.class.getDeclaredField("mDelegate");
            declaredField.setAccessible(true);
            Field declaredField2 = Field.class.getDeclaredField("accessFlags");
            declaredField2.setAccessible(true);
            declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            declaredField.set(this.activity, reactActivityDelegate);
            this.delegate = reactActivityDelegate;
            reactActivityDelegate.onCreate(savedInstanceState);
        }
        Iterator<T> it2 = this.reactActivityLifecycleListeners.iterator();
        while (it2.hasNext()) {
            ((ReactActivityLifecycleListener) it2.next()).onCreate(this.activity, savedInstanceState);
        }
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onDestroy() {
        AbstractC1417k.d(getApplicationCoroutineScope(), null, null, new C24461(null), 3, null);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        boolean z10;
        AbstractC2855l.g(event, "event");
        if (!this.loadAppReady.isCompleted()) {
            return false;
        }
        List<ReactActivityHandler> list = this.reactActivityHandlers;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((ReactActivityHandler) it.next()).onKeyDown(keyCode, event)));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z10 = false;
            while (it2.hasNext()) {
                boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                if (z10 || zBooleanValue) {
                    z10 = true;
                }
            }
        }
        return z10 || this.delegate.onKeyDown(keyCode, event);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        boolean z10;
        AbstractC2855l.g(event, "event");
        if (!this.loadAppReady.isCompleted()) {
            return false;
        }
        List<ReactActivityHandler> list = this.reactActivityHandlers;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((ReactActivityHandler) it.next()).onKeyLongPress(keyCode, event)));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z10 = false;
            while (it2.hasNext()) {
                boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                if (z10 || zBooleanValue) {
                    z10 = true;
                }
            }
        }
        return z10 || this.delegate.onKeyLongPress(keyCode, event);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        boolean z10;
        AbstractC2855l.g(event, "event");
        if (!this.loadAppReady.isCompleted()) {
            return false;
        }
        List<ReactActivityHandler> list = this.reactActivityHandlers;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((ReactActivityHandler) it.next()).onKeyUp(keyCode, event)));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z10 = false;
            while (it2.hasNext()) {
                boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                if (z10 || zBooleanValue) {
                    z10 = true;
                }
            }
        }
        return z10 || this.delegate.onKeyUp(keyCode, event);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public boolean onNewIntent(Intent intent) {
        boolean z10;
        if (!this.loadAppReady.isCompleted()) {
            return false;
        }
        List<ReactActivityLifecycleListener> list = this.reactActivityLifecycleListeners;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((ReactActivityLifecycleListener) it.next()).onNewIntent(intent)));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z10 = false;
            while (it2.hasNext()) {
                boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                if (z10 || zBooleanValue) {
                    z10 = true;
                }
            }
        }
        return z10 || this.delegate.onNewIntent(intent);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onPause() {
        launchLifecycleScopeWithLock$default(this, null, new C24471(null), 1, null);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        AbstractC2855l.g(permissions, "permissions");
        AbstractC2855l.g(grantResults, "grantResults");
        launchLifecycleScopeWithLock$default(this, null, new C24481(requestCode, permissions, grantResults, null), 1, null);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onResume() {
        launchLifecycleScopeWithLock$default(this, null, new C24491(null), 1, null);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onUserLeaveHint() {
        launchLifecycleScopeWithLock$default(this, null, new C24501(null), 1, null);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onWindowFocusChanged(boolean hasFocus) {
        launchLifecycleScopeWithLock$default(this, null, new C24511(hasFocus, null), 1, null);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void requestPermissions(String[] permissions, int requestCode, PermissionListener listener) {
        AbstractC2855l.g(permissions, "permissions");
        launchLifecycleScopeWithLock$default(this, null, new C24521(permissions, requestCode, listener, null), 1, null);
    }

    public final void setDelegate$expo_release(ReactActivityDelegate reactActivityDelegate) {
        AbstractC2855l.g(reactActivityDelegate, "<set-?>");
        this.delegate = reactActivityDelegate;
    }

    public final void setLoadAppReadyForTesting$expo_release() {
        this.loadAppReady.l0(C2735B.f28704a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactActivityDelegateWrapper(ReactActivity activity, ReactActivityDelegate delegate) {
        this(activity, false, delegate);
        AbstractC2855l.g(activity, "activity");
        AbstractC2855l.g(delegate, "delegate");
    }
}
