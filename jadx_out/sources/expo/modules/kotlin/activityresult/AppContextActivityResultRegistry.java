package expo.modules.kotlin.activityresult;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.InterfaceC1768o;
import androidx.lifecycle.r;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d.InterfaceC2313a;
import expo.modules.kotlin.providers.CurrentActivityProvider;
import i7.C2735B;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002DEB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JO\u0010\u0012\u001a\u00020\u0011\"\b\b\u0000\u0010\u0007*\u00020\u0006\"\u0004\b\u0001\u0010\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u001a\u001a\u00020\u0011\"\b\b\u0000\u0010\u0007*\u00020\u0006\"\u0004\b\u0001\u0010\b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00172\b\b\u0001\u0010\u0019\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJc\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 \"\b\b\u0000\u0010\u0007*\u00020\u0006\"\u0004\b\u0001\u0010\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00172\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0007¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b(\u0010)J)\u0010+\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u000205018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R&\u00109\u001a\u0012\u0012\u0004\u0012\u00020\t07j\b\u0012\u0004\u0012\u00020\t`88\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R(\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00103R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00103R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/providers/CurrentActivityProvider;", "currentActivityProvider", "<init>", "(Lexpo/modules/kotlin/providers/CurrentActivityProvider;)V", "Ljava/io/Serializable;", "I", "O", PointerEventHelper.POINTER_TYPE_UNKNOWN, "key", PointerEventHelper.POINTER_TYPE_UNKNOWN, "resultCode", "Landroid/content/Intent;", "data", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$CallbacksAndContract;", "callbacksAndContract", "Li7/B;", "doDispatch", "(Ljava/lang/String;ILandroid/content/Intent;Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$CallbacksAndContract;)V", "generateRandomNumber", "()I", "requestCode", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "contract", "input", "onLaunch", "(ILexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Ljava/io/Serializable;)V", "Landroidx/lifecycle/r;", "lifecycleOwner", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;", "fallbackCallback", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "register", "(Ljava/lang/String;Landroidx/lifecycle/r;Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;)Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Landroid/content/Context;", "context", "persistInstanceState", "(Landroid/content/Context;)V", "restoreInstanceState", "unregister", "(Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "dispatchResult", "(IILandroid/content/Intent;)Z", "Lexpo/modules/kotlin/providers/CurrentActivityProvider;", "Ljava/util/Random;", "random", "Ljava/util/Random;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestCodeToKey", "Ljava/util/Map;", "keyToRequestCode", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$LifecycleContainer;", "keyToLifecycleContainers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "launchedKeys", "Ljava/util/ArrayList;", "keyToCallbacksAndContract", "keyToInputParam", "Landroid/os/Bundle;", "pendingResults", "Landroid/os/Bundle;", "Landroidx/appcompat/app/d;", "getActivity", "()Landroidx/appcompat/app/d;", "activity", "CallbacksAndContract", "LifecycleContainer", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppContextActivityResultRegistry {
    private final CurrentActivityProvider currentActivityProvider;
    private final Map<String, CallbacksAndContract<?, ?>> keyToCallbacksAndContract;
    private final Map<String, Serializable> keyToInputParam;
    private final Map<String, LifecycleContainer> keyToLifecycleContainers;
    private final Map<String, Integer> keyToRequestCode;
    private ArrayList<String> launchedKeys;
    private final Bundle pendingResults;
    private Random random;
    private final Map<Integer, String> requestCodeToKey;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004B?\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JZ\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0012¨\u0006%"}, d2 = {"Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$CallbacksAndContract;", "Ljava/io/Serializable;", "I", "O", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;", "fallbackCallback", "Ld/a;", "mainCallback", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "contract", "<init>", "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Ld/a;Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;)V", "component1", "()Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;", "component2", "()Ld/a;", "component3", "()Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "copy", "(Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Ld/a;Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;)Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$CallbacksAndContract;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "()Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "equals", "(Ljava/lang/Object;)Z", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;", "getFallbackCallback", "Ld/a;", "getMainCallback", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "getContract", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class CallbacksAndContract<I extends Serializable, O> {
        private final AppContextActivityResultContract<I, O> contract;
        private final AppContextActivityResultFallbackCallback<I, O> fallbackCallback;
        private final InterfaceC2313a mainCallback;

        public CallbacksAndContract(AppContextActivityResultFallbackCallback<I, O> fallbackCallback, InterfaceC2313a interfaceC2313a, AppContextActivityResultContract<I, O> contract) {
            AbstractC2855l.g(fallbackCallback, "fallbackCallback");
            AbstractC2855l.g(contract, "contract");
            this.fallbackCallback = fallbackCallback;
            this.mainCallback = interfaceC2313a;
            this.contract = contract;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CallbacksAndContract copy$default(CallbacksAndContract callbacksAndContract, AppContextActivityResultFallbackCallback appContextActivityResultFallbackCallback, InterfaceC2313a interfaceC2313a, AppContextActivityResultContract appContextActivityResultContract, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                appContextActivityResultFallbackCallback = callbacksAndContract.fallbackCallback;
            }
            if ((i10 & 2) != 0) {
                interfaceC2313a = callbacksAndContract.mainCallback;
            }
            if ((i10 & 4) != 0) {
                appContextActivityResultContract = callbacksAndContract.contract;
            }
            return callbacksAndContract.copy(appContextActivityResultFallbackCallback, interfaceC2313a, appContextActivityResultContract);
        }

        public final AppContextActivityResultFallbackCallback<I, O> component1() {
            return this.fallbackCallback;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final InterfaceC2313a getMainCallback() {
            return this.mainCallback;
        }

        public final AppContextActivityResultContract<I, O> component3() {
            return this.contract;
        }

        public final CallbacksAndContract<I, O> copy(AppContextActivityResultFallbackCallback<I, O> fallbackCallback, InterfaceC2313a mainCallback, AppContextActivityResultContract<I, O> contract) {
            AbstractC2855l.g(fallbackCallback, "fallbackCallback");
            AbstractC2855l.g(contract, "contract");
            return new CallbacksAndContract<>(fallbackCallback, mainCallback, contract);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CallbacksAndContract)) {
                return false;
            }
            CallbacksAndContract callbacksAndContract = (CallbacksAndContract) other;
            return AbstractC2855l.b(this.fallbackCallback, callbacksAndContract.fallbackCallback) && AbstractC2855l.b(this.mainCallback, callbacksAndContract.mainCallback) && AbstractC2855l.b(this.contract, callbacksAndContract.contract);
        }

        public final AppContextActivityResultContract<I, O> getContract() {
            return this.contract;
        }

        public final AppContextActivityResultFallbackCallback<I, O> getFallbackCallback() {
            return this.fallbackCallback;
        }

        public final InterfaceC2313a getMainCallback() {
            return this.mainCallback;
        }

        public int hashCode() {
            int iHashCode = this.fallbackCallback.hashCode() * 31;
            InterfaceC2313a interfaceC2313a = this.mainCallback;
            return ((iHashCode + (interfaceC2313a == null ? 0 : interfaceC2313a.hashCode())) * 31) + this.contract.hashCode();
        }

        public String toString() {
            return "CallbacksAndContract(fallbackCallback=" + this.fallbackCallback + ", mainCallback=" + this.mainCallback + ", contract=" + this.contract + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\u0006`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$LifecycleContainer;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroidx/lifecycle/k;", "lifecycle", "<init>", "(Landroidx/lifecycle/k;)V", "Landroidx/lifecycle/o;", "observer", "Li7/B;", "addObserver", "(Landroidx/lifecycle/o;)V", "clearObservers", "()V", "Landroidx/lifecycle/k;", "getLifecycle", "()Landroidx/lifecycle/k;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "observers", "Ljava/util/ArrayList;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LifecycleContainer {
        private final AbstractC1764k lifecycle;
        private final ArrayList<InterfaceC1768o> observers;

        public LifecycleContainer(AbstractC1764k lifecycle) {
            AbstractC2855l.g(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
            this.observers = new ArrayList<>();
        }

        public final void addObserver(InterfaceC1768o observer) {
            AbstractC2855l.g(observer, "observer");
            this.lifecycle.a(observer);
            this.observers.add(observer);
        }

        public final void clearObservers() {
            Iterator<T> it = this.observers.iterator();
            while (it.hasNext()) {
                this.lifecycle.d((InterfaceC1768o) it.next());
            }
            this.observers.clear();
        }

        public final AbstractC1764k getLifecycle() {
            return this.lifecycle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC1764k.a.values().length];
            try {
                iArr[AbstractC1764k.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1764k.a.ON_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AppContextActivityResultRegistry(CurrentActivityProvider currentActivityProvider) {
        AbstractC2855l.g(currentActivityProvider, "currentActivityProvider");
        this.currentActivityProvider = currentActivityProvider;
        this.random = new Random();
        this.requestCodeToKey = new HashMap();
        this.keyToRequestCode = new HashMap();
        this.keyToLifecycleContainers = new HashMap();
        this.launchedKeys = new ArrayList<>();
        this.keyToCallbacksAndContract = new HashMap();
        this.keyToInputParam = new HashMap();
        this.pendingResults = new Bundle();
    }

    private final <I extends Serializable, O> void doDispatch(String key, int resultCode, Intent data, CallbacksAndContract<I, O> callbacksAndContract) {
        AbstractC1764k lifecycle;
        LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(key);
        AbstractC1764k.b bVarB = (lifecycleContainer == null || (lifecycle = lifecycleContainer.getLifecycle()) == null) ? null : lifecycle.b();
        if ((callbacksAndContract != null ? callbacksAndContract.getMainCallback() : null) != null && this.launchedKeys.contains(key)) {
            Serializable serializable = this.keyToInputParam.get(key);
            AbstractC2855l.e(serializable, "null cannot be cast to non-null type I of expo.modules.kotlin.activityresult.AppContextActivityResultRegistry.doDispatch");
            callbacksAndContract.getMainCallback().onActivityResult(callbacksAndContract.getContract().parseResult(serializable, resultCode, data));
            this.launchedKeys.remove(key);
            return;
        }
        if (bVarB == null || !bVarB.j(AbstractC1764k.b.f17593j) || callbacksAndContract == null || !this.launchedKeys.contains(key)) {
            this.pendingResults.putParcelable(key, new ActivityResult(resultCode, data));
            return;
        }
        Serializable serializable2 = this.keyToInputParam.get(key);
        AbstractC2855l.e(serializable2, "null cannot be cast to non-null type I of expo.modules.kotlin.activityresult.AppContextActivityResultRegistry.doDispatch");
        Serializable serializable3 = serializable2;
        callbacksAndContract.getFallbackCallback().onActivityResult(serializable3, callbacksAndContract.getContract().parseResult(serializable3, resultCode, data));
        this.launchedKeys.remove(key);
    }

    private final int generateRandomNumber() {
        int iNextInt = this.random.nextInt(2147418112);
        while (true) {
            int i10 = iNextInt + 65536;
            if (!this.requestCodeToKey.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            iNextInt = this.random.nextInt(2147418112);
        }
    }

    private final androidx.appcompat.app.d getActivity() {
        Activity currentActivity = this.currentActivityProvider.getCurrentActivity();
        androidx.appcompat.app.d dVar = currentActivity instanceof androidx.appcompat.app.d ? (androidx.appcompat.app.d) currentActivity : null;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Current Activity is not available at the moment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLaunch$lambda$1(AppContextActivityResultRegistry appContextActivityResultRegistry, int i10, IntentSender.SendIntentException sendIntentException) {
        appContextActivityResultRegistry.dispatchResult(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$4(AppContextActivityResultRegistry appContextActivityResultRegistry, String str, r rVar, AbstractC1764k.a event) {
        AbstractC2855l.g(rVar, "<unused var>");
        AbstractC2855l.g(event, "event");
        int i10 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            appContextActivityResultRegistry.unregister(str);
            return;
        }
        CallbacksAndContract<?, ?> callbacksAndContract = appContextActivityResultRegistry.keyToCallbacksAndContract.get(str);
        if (callbacksAndContract == null) {
            return;
        }
        Bundle bundle = appContextActivityResultRegistry.pendingResults;
        ActivityResult activityResult = (ActivityResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable(str, ActivityResult.class) : bundle.getParcelable(str));
        if (activityResult != null) {
            appContextActivityResultRegistry.pendingResults.remove(str);
            Serializable serializable = appContextActivityResultRegistry.keyToInputParam.get(str);
            AbstractC2855l.e(serializable, "null cannot be cast to non-null type I of expo.modules.kotlin.activityresult.AppContextActivityResultRegistry.register");
            Serializable serializable2 = serializable;
            Object result = callbacksAndContract.getContract().parseResult(serializable2, activityResult.getResultCode(), activityResult.getData());
            if (callbacksAndContract.getMainCallback() != null) {
                callbacksAndContract.getMainCallback().onActivityResult(result);
            } else {
                callbacksAndContract.getFallbackCallback().onActivityResult(serializable2, result);
            }
        }
    }

    public final boolean dispatchResult(int requestCode, int resultCode, Intent data) {
        String str = this.requestCodeToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        doDispatch(str, resultCode, data, this.keyToCallbacksAndContract.get(str));
        return true;
    }

    public final <I extends Serializable, O> void onLaunch(int requestCode, AppContextActivityResultContract<I, O> contract, @SuppressLint({"UnknownNullness"}) I input) {
        Bundle bundleExtra;
        int i10;
        final int i11;
        AbstractC2855l.g(contract, "contract");
        AbstractC2855l.g(input, "input");
        Intent intentCreateIntent = contract.createIntent(getActivity(), input);
        if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        String action = intentCreateIntent.getAction();
        if (action == null) {
            i10 = requestCode;
        } else {
            int iHashCode = action.hashCode();
            if (iHashCode != -1837081951) {
                if (iHashCode == -591152331 && action.equals("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST")) {
                    Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", IntentSenderRequest.class) : intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    AbstractC2855l.d(parcelableExtra);
                    IntentSenderRequest intentSenderRequest = (IntentSenderRequest) parcelableExtra;
                    try {
                        i11 = requestCode;
                    } catch (IntentSender.SendIntentException e10) {
                        e = e10;
                        i11 = requestCode;
                    }
                    try {
                        androidx.core.app.b.w(getActivity(), intentSenderRequest.getIntentSender(), i11, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle);
                        C2735B c2735b = C2735B.f28704a;
                        return;
                    } catch (IntentSender.SendIntentException e11) {
                        e = e11;
                        final IntentSender.SendIntentException sendIntentException = e;
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: expo.modules.kotlin.activityresult.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                AppContextActivityResultRegistry.onLaunch$lambda$1(this.f26570g, i11, sendIntentException);
                            }
                        });
                        return;
                    }
                }
                i10 = requestCode;
            } else {
                i10 = requestCode;
                if (action.equals("androidx.activity.result.contract.action.REQUEST_PERMISSIONS")) {
                    String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    androidx.core.app.b.r(getActivity(), stringArrayExtra, i10);
                    return;
                }
            }
        }
        androidx.core.app.b.v(getActivity(), intentCreateIntent, i10, bundle);
    }

    public final void persistInstanceState(Context context) {
        AbstractC2855l.g(context, "context");
        DataPersistor dataPersistorAddStringToIntMap = new DataPersistor(context).addStringArrayList("launchedKeys", this.launchedKeys).addStringToIntMap("keyToRequestCode", this.keyToRequestCode);
        Map<String, Serializable> map = this.keyToInputParam;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Serializable> entry : map.entrySet()) {
            if (this.launchedKeys.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        dataPersistorAddStringToIntMap.addStringToSerializableMap("keyToParamsForFallbackCallback", linkedHashMap).addBundle("pendingResult", this.pendingResults).addSerializable("random", this.random).persist();
    }

    public final <I extends Serializable, O> AppContextActivityResultLauncher<I, O> register(final String key, r lifecycleOwner, AppContextActivityResultContract<I, O> contract, AppContextActivityResultFallbackCallback<I, O> fallbackCallback) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(lifecycleOwner, "lifecycleOwner");
        AbstractC2855l.g(contract, "contract");
        AbstractC2855l.g(fallbackCallback, "fallbackCallback");
        AbstractC1764k lifecycle = lifecycleOwner.getLifecycle();
        this.keyToCallbacksAndContract.put(key, new CallbacksAndContract<>(fallbackCallback, null, contract));
        if (this.keyToRequestCode.get(key) == null) {
            int iGenerateRandomNumber = generateRandomNumber();
            this.requestCodeToKey.put(Integer.valueOf(iGenerateRandomNumber), key);
            this.keyToRequestCode.put(key, Integer.valueOf(iGenerateRandomNumber));
            C2735B c2735b = C2735B.f28704a;
        }
        InterfaceC1768o interfaceC1768o = new InterfaceC1768o() { // from class: expo.modules.kotlin.activityresult.c
            @Override // androidx.lifecycle.InterfaceC1768o
            public final void k(r rVar, AbstractC1764k.a aVar) {
                AppContextActivityResultRegistry.register$lambda$4(this.f26573g, key, rVar, aVar);
            }
        };
        LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(key);
        if (lifecycleContainer == null) {
            lifecycleContainer = new LifecycleContainer(lifecycle);
        }
        lifecycleContainer.addObserver(interfaceC1768o);
        this.keyToLifecycleContainers.put(key, lifecycleContainer);
        return (AppContextActivityResultLauncher<I, O>) new AppContextActivityResultLauncher<I, O>(contract, this, key, fallbackCallback) { // from class: expo.modules.kotlin.activityresult.AppContextActivityResultRegistry.register.2
            final /* synthetic */ AppContextActivityResultContract<I, O> $contract;
            final /* synthetic */ AppContextActivityResultFallbackCallback<I, O> $fallbackCallback;
            final /* synthetic */ String $key;
            private final AppContextActivityResultContract<I, O> contract;
            final /* synthetic */ AppContextActivityResultRegistry this$0;

            {
                this.$contract = contract;
                this.this$0 = this;
                this.$key = key;
                this.$fallbackCallback = fallbackCallback;
                this.contract = contract;
            }

            @Override // expo.modules.kotlin.activityresult.AppContextActivityResultLauncher
            public AppContextActivityResultContract<I, O> getContract() {
                return this.contract;
            }

            /* JADX WARN: Incorrect types in method signature: (TI;Ld/a;)V */
            @Override // expo.modules.kotlin.activityresult.AppContextActivityResultLauncher
            public void launch(Serializable input, InterfaceC2313a callback) throws Exception {
                AbstractC2855l.g(input, "input");
                AbstractC2855l.g(callback, "callback");
                Integer num = (Integer) this.this$0.keyToRequestCode.get(this.$key);
                if (num == null) {
                    throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.$contract + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch()");
                }
                int iIntValue = num.intValue();
                this.this$0.keyToCallbacksAndContract.put(this.$key, new CallbacksAndContract(this.$fallbackCallback, callback, this.$contract));
                this.this$0.keyToInputParam.put(this.$key, input);
                this.this$0.launchedKeys.add(this.$key);
                try {
                    this.this$0.onLaunch(iIntValue, this.$contract, input);
                } catch (Exception e10) {
                    this.this$0.launchedKeys.remove(this.$key);
                    throw e10;
                }
            }
        };
    }

    public final void restoreInstanceState(Context context) {
        AbstractC2855l.g(context, "context");
        DataPersistor dataPersistor = new DataPersistor(context);
        ArrayList<String> arrayListRetrieveStringArrayList = dataPersistor.retrieveStringArrayList("launchedKeys");
        if (arrayListRetrieveStringArrayList != null) {
            this.launchedKeys = arrayListRetrieveStringArrayList;
        }
        Map<String, Serializable> mapRetrieveStringToSerializableMap = dataPersistor.retrieveStringToSerializableMap("keyToParamsForFallbackCallback");
        if (mapRetrieveStringToSerializableMap != null) {
            this.keyToInputParam.putAll(mapRetrieveStringToSerializableMap);
        }
        Bundle bundleRetrieveBundle = dataPersistor.retrieveBundle("pendingResult");
        if (bundleRetrieveBundle != null) {
            this.pendingResults.putAll(bundleRetrieveBundle);
        }
        Serializable serializableRetrieveSerializable = dataPersistor.retrieveSerializable("random");
        if (serializableRetrieveSerializable != null) {
            this.random = (Random) serializableRetrieveSerializable;
        }
        Map<String, Integer> mapRetrieveStringToIntMap = dataPersistor.retrieveStringToIntMap("keyToRequestCode");
        if (mapRetrieveStringToIntMap != null) {
            Iterator<T> it = mapRetrieveStringToIntMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                this.keyToRequestCode.put(str, Integer.valueOf(iIntValue));
                this.requestCodeToKey.put(Integer.valueOf(iIntValue), str);
            }
        }
    }

    public final void unregister(String key) {
        Integer numRemove;
        AbstractC2855l.g(key, "key");
        if (!this.launchedKeys.contains(key) && (numRemove = this.keyToRequestCode.remove(key)) != null) {
            this.requestCodeToKey.remove(Integer.valueOf(numRemove.intValue()));
        }
        this.keyToCallbacksAndContract.remove(key);
        if (this.pendingResults.containsKey(key)) {
            Bundle bundle = this.pendingResults;
            Objects.toString(Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable(key, ActivityResult.class) : bundle.getParcelable(key));
            this.pendingResults.remove(key);
        }
        LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(key);
        if (lifecycleContainer != null) {
            lifecycleContainer.clearObservers();
            this.keyToLifecycleContainers.remove(key);
        }
    }
}
