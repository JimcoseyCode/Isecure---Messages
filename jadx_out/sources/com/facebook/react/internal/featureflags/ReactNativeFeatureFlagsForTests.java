package com.facebook.react.internal.featureflags;

import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsForTests;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsForTests;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Li7/B;", "setUp", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactNativeFeatureFlagsForTests {
    public static final ReactNativeFeatureFlagsForTests INSTANCE = new ReactNativeFeatureFlagsForTests();

    private ReactNativeFeatureFlagsForTests() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactNativeFeatureFlagsAccessor setUp$lambda$0() {
        return new ReactNativeFeatureFlagsLocalAccessor();
    }

    public final void setUp() {
        ReactNativeFeatureFlags.INSTANCE.setAccessorProvider$ReactAndroid_release(new InterfaceC3487a() { // from class: r3.b
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ReactNativeFeatureFlagsForTests.setUp$lambda$0();
            }
        });
    }
}
