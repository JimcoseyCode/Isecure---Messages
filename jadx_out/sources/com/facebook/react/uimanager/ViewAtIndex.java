package com.facebook.react.uimanager;

import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Comparator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/uimanager/ViewAtIndex;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mTag", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mIndex", "<init>", "(II)V", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "hashCode", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewAtIndex {
    public final int mIndex;
    public final int mTag;
    public static Comparator<ViewAtIndex> COMPARATOR = new Comparator() { // from class: com.facebook.react.uimanager.J
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ViewAtIndex.COMPARATOR$lambda$0((ViewAtIndex) obj, (ViewAtIndex) obj2);
        }
    };

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("ViewAtIndex", LegacyArchitectureLogLevel.ERROR);
    }

    public ViewAtIndex(int i10, int i11) {
        this.mTag = i10;
        this.mIndex = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int COMPARATOR$lambda$0(ViewAtIndex viewAtIndex, ViewAtIndex viewAtIndex2) {
        return viewAtIndex.mIndex - viewAtIndex2.mIndex;
    }

    public boolean equals(Object other) {
        if (other != null && AbstractC2855l.b(other.getClass(), ViewAtIndex.class)) {
            ViewAtIndex viewAtIndex = (ViewAtIndex) other;
            if (this.mIndex == viewAtIndex.mIndex && this.mTag == viewAtIndex.mTag) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mTag), Integer.valueOf(this.mIndex));
    }

    public String toString() {
        return "[" + this.mTag + ", " + this.mIndex + "]";
    }
}
