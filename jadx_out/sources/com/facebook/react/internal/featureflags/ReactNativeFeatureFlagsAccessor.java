package com.facebook.react.internal.featureflags;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsAccessor;", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;", "provider", "Li7/B;", "override", "(Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;)V", "dangerouslyReset", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "dangerouslyForceOverride", "(Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;)Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ReactNativeFeatureFlagsAccessor extends ReactNativeFeatureFlagsProvider {
    String dangerouslyForceOverride(ReactNativeFeatureFlagsProvider provider);

    void dangerouslyReset();

    void override(ReactNativeFeatureFlagsProvider provider);
}
