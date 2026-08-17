package com.facebook.react.fabric;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.PriorityQueue;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import l7.AbstractC2884a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR$\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/fabric/LongStreamingStats;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "n", "Li7/B;", "add", "(J)V", "Ljava/util/Queue;", "minHeap", "Ljava/util/Queue;", "maxHeap", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "average", "D", "getAverage", "()D", PointerEventHelper.POINTER_TYPE_UNKNOWN, "len", "I", "max", "J", "getMax", "()J", "getMedian", "median", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LongStreamingStats {
    private double average;
    private int len;
    private long max;
    private final Queue<Long> minHeap = new PriorityQueue(11);
    private final Queue<Long> maxHeap = new PriorityQueue(11, AbstractC2884a.e());

    public final void add(long n10) {
        double d10;
        if (n10 != 0) {
            if (this.minHeap.size() == this.maxHeap.size()) {
                this.maxHeap.offer(Long.valueOf(n10));
                this.minHeap.offer(this.maxHeap.poll());
            } else {
                this.minHeap.offer(Long.valueOf(n10));
                this.maxHeap.offer(this.minHeap.poll());
            }
        }
        int i10 = this.len;
        int i11 = i10 + 1;
        this.len = i11;
        if (i11 == 1) {
            d10 = n10;
        } else {
            d10 = (n10 / ((long) i11)) + (this.average / ((double) (i11 / i10)));
        }
        this.average = d10;
        long j10 = this.max;
        if (n10 <= j10) {
            n10 = j10;
        }
        this.max = n10;
    }

    public final double getAverage() {
        return this.average;
    }

    public final long getMax() {
        return this.max;
    }

    public final double getMedian() {
        long jLongValue;
        Long lValueOf;
        if (this.minHeap.size() == 0 && this.maxHeap.size() == 0) {
            return 0.0d;
        }
        if (this.minHeap.size() > this.maxHeap.size()) {
            lValueOf = this.minHeap.peek();
        } else {
            Long lPeek = this.minHeap.peek();
            if (lPeek != null) {
                jLongValue = lPeek.longValue();
            } else {
                Long lPeek2 = this.maxHeap.peek();
                AbstractC2855l.d(lPeek2);
                jLongValue = lPeek2.longValue();
            }
            lValueOf = Long.valueOf(jLongValue / ((long) 2));
        }
        return lValueOf.longValue();
    }
}
