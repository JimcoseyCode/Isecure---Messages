package com.facebook.react.devsupport;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/facebook/react/devsupport/DevMenuConfiguration;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "devMenuEnabled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shakeGestureEnabled", "keyboardShortcutsEnabled", "<init>", "(ZZZ)V", "getDevMenuEnabled", "()Z", "getShakeGestureEnabled", "getKeyboardShortcutsEnabled", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DevMenuConfiguration {
    private final boolean devMenuEnabled;
    private final boolean keyboardShortcutsEnabled;
    private final boolean shakeGestureEnabled;

    public DevMenuConfiguration() {
        this(false, false, false, 7, null);
    }

    public final boolean getDevMenuEnabled() {
        return this.devMenuEnabled;
    }

    public final boolean getKeyboardShortcutsEnabled() {
        return this.keyboardShortcutsEnabled;
    }

    public final boolean getShakeGestureEnabled() {
        return this.shakeGestureEnabled;
    }

    public DevMenuConfiguration(boolean z10, boolean z11, boolean z12) {
        this.devMenuEnabled = z10;
        this.shakeGestureEnabled = z11;
        this.keyboardShortcutsEnabled = z12;
    }

    public /* synthetic */ DevMenuConfiguration(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12);
    }
}
