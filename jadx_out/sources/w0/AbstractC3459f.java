package w0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import expo.modules.notifications.service.NotificationsService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v0.AbstractC3416d;

/* JADX INFO: renamed from: w0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC3459f {
    private static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        return aVar != null ? aVar : z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, AbstractC3416d.f32827F);
        float f10 = k.f(typedArrayI, xmlPullParser, "startX", AbstractC3416d.f32836O, 0.0f);
        float f11 = k.f(typedArrayI, xmlPullParser, "startY", AbstractC3416d.f32837P, 0.0f);
        float f12 = k.f(typedArrayI, xmlPullParser, "endX", AbstractC3416d.f32838Q, 0.0f);
        float f13 = k.f(typedArrayI, xmlPullParser, "endY", AbstractC3416d.f32839R, 0.0f);
        float f14 = k.f(typedArrayI, xmlPullParser, "centerX", AbstractC3416d.f32831J, 0.0f);
        float f15 = k.f(typedArrayI, xmlPullParser, "centerY", AbstractC3416d.f32832K, 0.0f);
        int iG = k.g(typedArrayI, xmlPullParser, NotificationsService.EVENT_TYPE_KEY, AbstractC3416d.f32830I, 0);
        int iB = k.b(typedArrayI, xmlPullParser, "startColor", AbstractC3416d.f32828G, 0);
        boolean zH = k.h(xmlPullParser, "centerColor");
        int iB2 = k.b(typedArrayI, xmlPullParser, "centerColor", AbstractC3416d.f32835N, 0);
        int iB3 = k.b(typedArrayI, xmlPullParser, "endColor", AbstractC3416d.f32829H, 0);
        int iG2 = k.g(typedArrayI, xmlPullParser, "tileMode", AbstractC3416d.f32834M, 0);
        float f16 = k.f(typedArrayI, xmlPullParser, "gradientRadius", AbstractC3416d.f32833L, 0.0f);
        typedArrayI.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iB, iB3, zH, iB2);
        if (iG != 1) {
            return iG != 2 ? new LinearGradient(f10, f11, f12, f13, aVarA.f33058a, aVarA.f33059b, d(iG2)) : new SweepGradient(f14, f15, aVarA.f33058a, aVarA.f33059b);
        }
        if (f16 > 0.0f) {
            return new RadialGradient(f14, f15, f16, aVarA.f33058a, aVarA.f33059b, d(iG2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        return new w0.AbstractC3459f.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayI = k.i(resources, theme, attributeSet, AbstractC3416d.f32840S);
                boolean zHasValue = typedArrayI.hasValue(AbstractC3416d.f32841T);
                boolean zHasValue2 = typedArrayI.hasValue(AbstractC3416d.f32842U);
                if (!zHasValue || !zHasValue2) {
                    break;
                }
                int color = typedArrayI.getColor(AbstractC3416d.f32841T, 0);
                float f10 = typedArrayI.getFloat(AbstractC3416d.f32842U, 0.0f);
                typedArrayI.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f10));
            }
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    private static Shader.TileMode d(int i10) {
        return i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* JADX INFO: renamed from: w0.f$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f33058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f33059b;

        a(List list, List list2) {
            int size = list.size();
            this.f33058a = new int[size];
            this.f33059b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f33058a[i10] = ((Integer) list.get(i10)).intValue();
                this.f33059b[i10] = ((Float) list2.get(i10)).floatValue();
            }
        }

        a(int i10, int i11) {
            this.f33058a = new int[]{i10, i11};
            this.f33059b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f33058a = new int[]{i10, i11, i12};
            this.f33059b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
