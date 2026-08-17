package com.facebook.react.views.scroll;

import android.os.SystemClock;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "prevX", PointerEventHelper.POINTER_TYPE_UNKNOWN, "prevY", "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "xFlingVelocity", "getXFlingVelocity", "()F", "yFlingVelocity", "getYFlingVelocity", "lastScrollEventTimeMs", PointerEventHelper.POINTER_TYPE_UNKNOWN, "onScrollChanged", PointerEventHelper.POINTER_TYPE_UNKNOWN, "x", "y", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OnScrollDispatchHelper {
    private static final Companion Companion = new Companion(null);
    private static final int MIN_EVENT_SEPARATION_MS = 10;
    private float xFlingVelocity;
    private float yFlingVelocity;
    private int prevX = androidx.customview.widget.a.INVALID_ID;
    private int prevY = androidx.customview.widget.a.INVALID_ID;
    private long lastScrollEventTimeMs = -11;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/views/scroll/OnScrollDispatchHelper$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "MIN_EVENT_SEPARATION_MS", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final float getXFlingVelocity() {
        return this.xFlingVelocity;
    }

    public final float getYFlingVelocity() {
        return this.yFlingVelocity;
    }

    public final boolean onScrollChanged(int x10, int y10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.lastScrollEventTimeMs;
        boolean z10 = (jUptimeMillis - j10 <= 10 && this.prevX == x10 && this.prevY == y10) ? false : true;
        if (jUptimeMillis - j10 != 0) {
            this.xFlingVelocity = (x10 - this.prevX) / (jUptimeMillis - j10);
            this.yFlingVelocity = (y10 - this.prevY) / (jUptimeMillis - j10);
        }
        this.lastScrollEventTimeMs = jUptimeMillis;
        this.prevX = x10;
        this.prevY = y10;
        return z10;
    }
}
