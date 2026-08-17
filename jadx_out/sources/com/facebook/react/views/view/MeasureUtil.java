package com.facebook.react.views.view;

import android.view.View;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.yoga.p;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/views/view/MeasureUtil;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "size", "Lcom/facebook/yoga/p;", "mode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getMeasureSpec", "(FLcom/facebook/yoga/p;)I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MeasureUtil {
    public static final MeasureUtil INSTANCE = new MeasureUtil();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.EXACTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.AT_MOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private MeasureUtil() {
    }

    public static final int getMeasureSpec(float size, p mode) {
        AbstractC2855l.g(mode, "mode");
        int i10 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        return i10 != 1 ? i10 != 2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec((int) size, androidx.customview.widget.a.INVALID_ID) : View.MeasureSpec.makeMeasureSpec((int) size, 1073741824);
    }
}
