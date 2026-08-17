package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "downTime", "Li7/B;", "addCoalescingKey", "(J)V", "incrementCoalescingKey", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCoalescingKey", "(J)S", "removeCoalescingKey", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasCoalescingKey", "(J)Z", "Landroid/util/SparseIntArray;", "downTimeToCoalescingKey", "Landroid/util/SparseIntArray;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TouchEventCoalescingKeyHelper {
    private final SparseIntArray downTimeToCoalescingKey = new SparseIntArray();

    public final void addCoalescingKey(long downTime) {
        this.downTimeToCoalescingKey.put((int) downTime, 0);
    }

    public final short getCoalescingKey(long downTime) {
        int i10 = this.downTimeToCoalescingKey.get((int) downTime, -1);
        if (i10 != -1) {
            return (short) (i10 & 65535);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public final boolean hasCoalescingKey(long downTime) {
        return this.downTimeToCoalescingKey.get((int) downTime, -1) != -1;
    }

    public final void incrementCoalescingKey(long downTime) {
        int i10 = (int) downTime;
        int i11 = this.downTimeToCoalescingKey.get(i10, -1);
        if (i11 == -1) {
            throw new RuntimeException("Tried to increment non-existent cookie");
        }
        this.downTimeToCoalescingKey.put(i10, i11 + 1);
    }

    public final void removeCoalescingKey(long downTime) {
        this.downTimeToCoalescingKey.delete((int) downTime);
    }
}
