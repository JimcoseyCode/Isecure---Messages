package com.facebook.react.modules.debug;

import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00022\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\t\u001a\u00020\u00012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00022\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\f\u001a\u00020\u000b2\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00022\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljava/util/ArrayList;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/collections/ArrayList;", "eventArray", "startTime", "endTime", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasEventBetweenTimestamps", "(Ljava/util/ArrayList;JJ)Z", "getLastEventBetweenTimestamps", "(Ljava/util/ArrayList;JJ)J", "Li7/B;", "cleanUp", "(Ljava/util/ArrayList;J)V", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DidJSUpdateUiDuringFrameDetectorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleanUp(ArrayList<Long> arrayList, long j10) {
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (arrayList.get(i11).longValue() < j10) {
                i10++;
            }
        }
        if (i10 > 0) {
            int i12 = size - i10;
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList.set(i13, arrayList.get(i13 + i10));
            }
            AbstractC2800q.a0(arrayList, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getLastEventBetweenTimestamps(ArrayList<Long> arrayList, long j10, long j11) {
        Iterator<Long> it = arrayList.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        long j12 = -1;
        while (it.hasNext()) {
            Long next = it.next();
            AbstractC2855l.f(next, "next(...)");
            long jLongValue = next.longValue();
            if (j10 <= jLongValue && jLongValue < j11) {
                j12 = jLongValue;
            } else if (jLongValue >= j11) {
                break;
            }
        }
        return j12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasEventBetweenTimestamps(ArrayList<Long> arrayList, long j10, long j11) {
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (j10 <= jLongValue && jLongValue < j11) {
                return true;
            }
        }
        return false;
    }
}
