package com.facebook.react.runtime;

import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u001d\u001eB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0003\u001a\u0004\u0018\u00018\u00008G@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0005R$\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0005R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/runtime/BridgelessAtomicRef;", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "<init>", "(Ljava/lang/Object;)V", "Lcom/facebook/react/runtime/BridgelessAtomicRef$Provider;", "provider", "getOrCreate", "(Lcom/facebook/react/runtime/BridgelessAtomicRef$Provider;)Ljava/lang/Object;", "Li7/B;", "reset", "()V", "get", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getNullable", "setValue", "initialValue", "getInitialValue", "setInitialValue", "Lcom/facebook/react/runtime/BridgelessAtomicRef$State;", "state", "Lcom/facebook/react/runtime/BridgelessAtomicRef$State;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "failureMessage", "Ljava/lang/String;", "getAndReset", "andReset", "Provider", "State", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BridgelessAtomicRef<T> {
    private volatile String failureMessage;
    private T initialValue;
    private volatile State state;
    private volatile T value;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bà\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\r\u0010\u0003\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/facebook/react/runtime/BridgelessAtomicRef$Provider;", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "get", "()Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Provider<T> {
        T get();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/runtime/BridgelessAtomicRef$State;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;I)V", "Init", "Creating", "Success", "Failure", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State Init = new State("Init", 0);
        public static final State Creating = new State("Creating", 1);
        public static final State Success = new State("Success", 2);
        public static final State Failure = new State("Failure", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{Init, Creating, Success, Failure};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = AbstractC3083a.a(stateArr$values);
        }

        private State(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BridgelessAtomicRef() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    public final synchronized T get() {
        T t10;
        t10 = this.value;
        if (t10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return t10;
    }

    public final synchronized T getAndReset() {
        T t10;
        t10 = get();
        reset();
        return t10;
    }

    public final T getInitialValue() {
        return this.initialValue;
    }

    public final synchronized T getNullable() {
        return this.value;
    }

    public final T getOrCreate(Provider<T> provider) {
        boolean z10;
        T t10;
        T t11;
        AbstractC2855l.g(provider, "provider");
        synchronized (this) {
            State state = this.state;
            State state2 = State.Success;
            if (state == state2) {
                return get();
            }
            if (this.state == State.Failure) {
                throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.failureMessage);
            }
            State state3 = this.state;
            State state4 = State.Creating;
            boolean z11 = false;
            if (state3 != state4) {
                this.state = state4;
                z10 = true;
            } else {
                z10 = false;
            }
            C2735B c2735b = C2735B.f28704a;
            if (z10) {
                try {
                    this.value = provider.get();
                    synchronized (this) {
                        this.state = state2;
                        AbstractC2855l.e(this, "null cannot be cast to non-null type java.lang.Object");
                        notifyAll();
                        t10 = get();
                    }
                    return t10;
                } catch (RuntimeException e10) {
                    synchronized (this) {
                        this.state = State.Failure;
                        this.failureMessage = String.valueOf(e10.getMessage());
                        AbstractC2855l.e(this, "null cannot be cast to non-null type java.lang.Object");
                        notifyAll();
                        C2735B c2735b2 = C2735B.f28704a;
                        throw new RuntimeException("BridgelessAtomicRef: Failed to create object.", e10);
                    }
                }
            }
            synchronized (this) {
                while (this.state == State.Creating) {
                    try {
                        AbstractC2855l.e(this, "null cannot be cast to non-null type java.lang.Object");
                        wait();
                    } catch (InterruptedException unused) {
                        z11 = true;
                    }
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                if (this.state == State.Failure) {
                    throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.failureMessage);
                }
                t11 = get();
            }
            return t11;
        }
    }

    public final synchronized void reset() {
        this.value = this.initialValue;
        this.state = State.Init;
        this.failureMessage = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    }

    public final void setInitialValue(T t10) {
        this.initialValue = t10;
    }

    public final void setValue(T t10) {
        this.value = t10;
    }

    public BridgelessAtomicRef(T t10) {
        this.value = t10;
        this.initialValue = this.value;
        this.state = State.Init;
        this.failureMessage = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    }

    public /* synthetic */ BridgelessAtomicRef(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj);
    }
}
