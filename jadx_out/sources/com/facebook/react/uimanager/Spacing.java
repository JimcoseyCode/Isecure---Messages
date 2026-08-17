package com.facebook.react.uimanager;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2793j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\bJ\u001d\u0010\u0018\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/facebook/react/uimanager/Spacing;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "defaultValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "spacing", "<init>", "(F[F)V", "()V", "(F)V", "original", "(Lcom/facebook/react/uimanager/Spacing;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "spacingType", "value", PointerEventHelper.POINTER_TYPE_UNKNOWN, "set", "(IF)Z", "get", "(I)F", "getRaw", "Li7/B;", "reset", "fallbackType", "getWithFallback", "(II)F", "F", "[F", "valueFlags", "I", "hasAliasesSet", "Z", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Spacing {
    public static final int ALL = 8;
    public static final int BLOCK = 9;
    public static final int BLOCK_END = 10;
    public static final int BLOCK_START = 11;
    public static final int BOTTOM = 3;
    public static final int END = 5;
    public static final int HORIZONTAL = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 2;
    public static final int START = 4;
    public static final int TOP = 1;
    public static final int VERTICAL = 7;
    private final float defaultValue;
    private boolean hasAliasesSet;
    private final float[] spacing;
    private int valueFlags;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int[] flagsMap = {1, 2, 4, 8, 16, 32, 64, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 256, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 2048};

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/uimanager/Spacing$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "LEFT", PointerEventHelper.POINTER_TYPE_UNKNOWN, "TOP", "RIGHT", "BOTTOM", "START", "END", "HORIZONTAL", "VERTICAL", "ALL", "BLOCK", "BLOCK_END", "BLOCK_START", "flagsMap", PointerEventHelper.POINTER_TYPE_UNKNOWN, "newFullSpacingArray", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] newFullSpacingArray() {
            float f10 = com.facebook.yoga.g.f20769b;
            return new float[]{f10, f10, f10, f10, f10, f10, f10, f10, f10, f10, f10, f10};
        }

        private Companion() {
        }
    }

    public Spacing(float f10, float[] spacing) {
        AbstractC2855l.g(spacing, "spacing");
        this.defaultValue = f10;
        this.spacing = spacing;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float get(int spacingType) {
        float f10;
        if (spacingType != 4 && spacingType != 5) {
            switch (spacingType) {
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    f10 = this.defaultValue;
                    break;
            }
        } else {
            f10 = com.facebook.yoga.g.f20769b;
        }
        int i10 = this.valueFlags;
        if (i10 != 0) {
            int[] iArr = flagsMap;
            if ((iArr[spacingType] & i10) != 0) {
                return this.spacing[spacingType];
            }
            if (this.hasAliasesSet) {
                char c10 = (spacingType == 1 || spacingType == 3) ? (char) 7 : (char) 6;
                if ((iArr[c10] & i10) != 0) {
                    return this.spacing[c10];
                }
                if ((i10 & iArr[8]) != 0) {
                    return this.spacing[8];
                }
            }
        }
        return f10;
    }

    public final float getRaw(int spacingType) {
        return this.spacing[spacingType];
    }

    public final float getWithFallback(int spacingType, int fallbackType) {
        return (this.valueFlags & flagsMap[spacingType]) != 0 ? this.spacing[spacingType] : get(fallbackType);
    }

    public final void reset() {
        AbstractC2793j.q(this.spacing, com.facebook.yoga.g.f20769b, 0, 0, 6, null);
        this.hasAliasesSet = false;
        this.valueFlags = 0;
    }

    public final boolean set(int spacingType, float value) {
        if (FloatUtil.floatsEqual(this.spacing[spacingType], value)) {
            return false;
        }
        this.spacing[spacingType] = value;
        int i10 = com.facebook.yoga.g.a(value) ? (~flagsMap[spacingType]) & this.valueFlags : flagsMap[spacingType] | this.valueFlags;
        this.valueFlags = i10;
        int[] iArr = flagsMap;
        this.hasAliasesSet = ((iArr[8] & i10) == 0 && (iArr[7] & i10) == 0 && (iArr[6] & i10) == 0 && (i10 & iArr[9]) == 0) ? false : true;
        return true;
    }

    public Spacing() {
        this(0.0f, INSTANCE.newFullSpacingArray());
    }

    public Spacing(float f10) {
        this(f10, INSTANCE.newFullSpacingArray());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Spacing(Spacing original) {
        AbstractC2855l.g(original, "original");
        float f10 = original.defaultValue;
        float[] fArr = original.spacing;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        AbstractC2855l.f(fArrCopyOf, "copyOf(...)");
        this(f10, fArrCopyOf);
        this.valueFlags = original.valueFlags;
        this.hasAliasesSet = original.hasAliasesSet;
    }
}
