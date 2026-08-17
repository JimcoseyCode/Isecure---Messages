package com.facebook.react.defaults;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/defaults/DefaultReactActivityDelegate;", "Lcom/facebook/react/ReactActivityDelegate;", "activity", "Lcom/facebook/react/ReactActivity;", "mainComponentName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fabricEnabled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Lcom/facebook/react/ReactActivity;Ljava/lang/String;Z)V", "concurrentReactEnabled", "(Lcom/facebook/react/ReactActivity;Ljava/lang/String;ZZ)V", "isFabricEnabled", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DefaultReactActivityDelegate extends ReactActivityDelegate {
    private final boolean fabricEnabled;

    public /* synthetic */ DefaultReactActivityDelegate(ReactActivity reactActivity, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactActivity, str, (i10 & 4) != 0 ? false : z10);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    /* JADX INFO: renamed from: isFabricEnabled, reason: from getter */
    protected boolean getFabricEnabled() {
        return this.fabricEnabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultReactActivityDelegate(ReactActivity activity, String mainComponentName, boolean z10) {
        super(activity, mainComponentName);
        AbstractC2855l.g(activity, "activity");
        AbstractC2855l.g(mainComponentName, "mainComponentName");
        this.fabricEnabled = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultReactActivityDelegate(ReactActivity activity, String mainComponentName, boolean z10, boolean z11) {
        this(activity, mainComponentName, z10);
        AbstractC2855l.g(activity, "activity");
        AbstractC2855l.g(mainComponentName, "mainComponentName");
    }
}
