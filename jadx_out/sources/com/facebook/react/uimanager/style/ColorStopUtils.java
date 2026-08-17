package com.facebook.react.uimanager.style;

import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2750m;
import j7.AbstractC2793j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import x0.AbstractC3516d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\t\u001a\u00020\nJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0002¢\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/uimanager/style/ColorStopUtils;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "getFixedColorStops", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/style/ProcessedColorStop;", "colorStops", "Lcom/facebook/react/uimanager/style/ColorStop;", "gradientLineLength", PointerEventHelper.POINTER_TYPE_UNKNOWN, "processColorTransitionHints", "originalStops", PointerEventHelper.POINTER_TYPE_UNKNOWN, "([Lcom/facebook/react/uimanager/style/ProcessedColorStop;)Ljava/util/List;", "resolveColorStopPosition", ViewProps.POSITION, "Lcom/facebook/react/uimanager/LengthPercentage;", "(Lcom/facebook/react/uimanager/LengthPercentage;F)Ljava/lang/Float;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ColorStopUtils {
    public static final ColorStopUtils INSTANCE = new ColorStopUtils();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LengthPercentageType.values().length];
            try {
                iArr[LengthPercentageType.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LengthPercentageType.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ColorStopUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e A[PHI: r6
      0x007e: PHI (r6v2 int) = (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v5 int) binds: [B:5:0x0013, B:8:0x0018, B:11:0x003d, B:12:0x003f, B:13:0x0041, B:24:0x0099, B:21:0x0089, B:17:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<ProcessedColorStop> processColorTransitionHints(ProcessedColorStop[] originalStops) {
        int i10;
        int i11;
        ProcessedColorStop[] processedColorStopArr = originalStops;
        List<ProcessedColorStop> listE0 = AbstractC2793j.E0(processedColorStopArr);
        int i12 = 1;
        int length = processedColorStopArr.length - 1;
        int i13 = 1;
        int i14 = 0;
        while (i13 < length) {
            if (processedColorStopArr[i13].getColor() == null && (i11 = i13 + i14) >= i12) {
                int i15 = i11 - 1;
                Float position = listE0.get(i15).getPosition();
                int i16 = i11 + 1;
                Float position2 = listE0.get(i16).getPosition();
                Float position3 = listE0.get(i11).getPosition();
                if (position == null || position2 == null || position3 == null) {
                    i10 = length;
                } else {
                    float fFloatValue = position3.floatValue() - position.floatValue();
                    float fFloatValue2 = position2.floatValue() - position3.floatValue();
                    float fFloatValue3 = position2.floatValue() - position.floatValue();
                    Integer color = listE0.get(i15).getColor();
                    Integer color2 = listE0.get(i16).getColor();
                    if (FloatUtil.floatsEqual(fFloatValue, fFloatValue2)) {
                        listE0.remove(i11);
                        i14--;
                    } else if (FloatUtil.floatsEqual(fFloatValue, 0.0f)) {
                        listE0.get(i11).setColor(color2);
                    } else if (FloatUtil.floatsEqual(fFloatValue2, 0.0f)) {
                        listE0.get(i11).setColor(color);
                    } else {
                        ArrayList arrayList = new ArrayList(9);
                        if (fFloatValue > fFloatValue2) {
                            int i17 = 0;
                            while (i17 < 7) {
                                arrayList.add(new ProcessedColorStop(null, Float.valueOf(position.floatValue() + (((i17 + 7.0f) / 13.0f) * fFloatValue))));
                                i17++;
                                length = length;
                            }
                            i10 = length;
                            arrayList.add(new ProcessedColorStop(null, Float.valueOf(position3.floatValue() + (0.33333334f * fFloatValue2))));
                            arrayList.add(new ProcessedColorStop(null, Float.valueOf(position3.floatValue() + (fFloatValue2 * 0.6666667f))));
                        } else {
                            i10 = length;
                            arrayList.add(new ProcessedColorStop(null, Float.valueOf(position.floatValue() + (0.33333334f * fFloatValue))));
                            arrayList.add(new ProcessedColorStop(null, Float.valueOf(position.floatValue() + (0.6666667f * fFloatValue))));
                            for (int i18 = 0; i18 < 7; i18++) {
                                arrayList.add(new ProcessedColorStop(null, Float.valueOf(position3.floatValue() + ((i18 / 13.0f) * fFloatValue2))));
                            }
                        }
                        double dLog = Math.log(0.5d) / ((double) ((float) Math.log(fFloatValue / fFloatValue3)));
                        Iterator it = arrayList.iterator();
                        AbstractC2855l.f(it, "iterator(...)");
                        while (it.hasNext()) {
                            Object next = it.next();
                            AbstractC2855l.f(next, "next(...)");
                            ProcessedColorStop processedColorStop = (ProcessedColorStop) next;
                            if (processedColorStop.getPosition() != null) {
                                float fPow = (float) Math.pow((processedColorStop.getPosition().floatValue() - position.floatValue()) / fFloatValue3, dLog);
                                if (Math.abs(fPow) <= Float.MAX_VALUE && !Float.isNaN(fPow) && color != null) {
                                    int iIntValue = color.intValue();
                                    if (color2 != null) {
                                        processedColorStop.setColor(Integer.valueOf(AbstractC3516d.c(iIntValue, color2.intValue(), fPow)));
                                    }
                                }
                            }
                        }
                        listE0.remove(i11);
                        listE0.addAll(i11, arrayList);
                        i14 += 8;
                    }
                    i10 = length;
                }
            }
            i13++;
            processedColorStopArr = originalStops;
            length = i10;
            i12 = 1;
        }
        return listE0;
    }

    private final Float resolveColorStopPosition(LengthPercentage position, float gradientLineLength) {
        if (position == null) {
            return null;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[position.getType().ordinal()];
        if (i10 == 1) {
            return Float.valueOf(PixelUtil.toPixelFromDIP(position.resolve(0.0f)) / gradientLineLength);
        }
        if (i10 == 2) {
            return Float.valueOf(position.resolve(1.0f));
        }
        throw new C2750m();
    }

    public final List<ProcessedColorStop> getFixedColorStops(List<ColorStop> colorStops, float gradientLineLength) {
        AbstractC2855l.g(colorStops, "colorStops");
        int size = colorStops.size();
        ProcessedColorStop[] processedColorStopArr = new ProcessedColorStop[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            processedColorStopArr[i11] = new ProcessedColorStop(null, null, 3, null);
        }
        Float fResolveColorStopPosition = resolveColorStopPosition(colorStops.get(0).getPosition(), gradientLineLength);
        float fFloatValue = fResolveColorStopPosition != null ? fResolveColorStopPosition.floatValue() : 0.0f;
        int size2 = colorStops.size();
        int i12 = 0;
        boolean z10 = false;
        while (i12 < size2) {
            ColorStop colorStop = colorStops.get(i12);
            Float fResolveColorStopPosition2 = resolveColorStopPosition(colorStop.getPosition(), gradientLineLength);
            if (fResolveColorStopPosition2 == null) {
                fResolveColorStopPosition2 = i12 == 0 ? Float.valueOf(0.0f) : i12 == colorStops.size() - 1 ? Float.valueOf(1.0f) : null;
            }
            if (fResolveColorStopPosition2 != null) {
                fFloatValue = Math.max(fResolveColorStopPosition2.floatValue(), fFloatValue);
                processedColorStopArr[i12] = new ProcessedColorStop(colorStop.getColor(), Float.valueOf(fFloatValue));
            } else {
                z10 = true;
            }
            i12++;
        }
        if (z10) {
            for (int i13 = 1; i13 < size; i13++) {
                Float position = processedColorStopArr[i13].getPosition();
                Float position2 = processedColorStopArr[i10].getPosition();
                int i14 = i13 - i10;
                int i15 = i14 - 1;
                if (position != null && position2 != null && i15 > 0) {
                    float fFloatValue2 = (position.floatValue() - position2.floatValue()) / i14;
                    if (1 <= i15) {
                        int i16 = 1;
                        while (true) {
                            int i17 = i10 + i16;
                            processedColorStopArr[i17] = new ProcessedColorStop(colorStops.get(i17).getColor(), Float.valueOf(position2.floatValue() + (i16 * fFloatValue2)));
                            if (i16 == i15) {
                                break;
                            }
                            i16++;
                        }
                    }
                    i10 = i13;
                }
            }
        }
        return processColorTransitionHints(processedColorStopArr);
    }
}
