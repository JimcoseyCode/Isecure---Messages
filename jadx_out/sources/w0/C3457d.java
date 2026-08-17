package w0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: w0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3457d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Shader f33044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f33045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33046c;

    private C3457d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f33044a = shader;
        this.f33045b = colorStateList;
        this.f33046c = i10;
    }

    private static C3457d a(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return d(AbstractC3459f.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(AbstractC3456c.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static C3457d b(int i10) {
        return new C3457d(null, null, i10);
    }

    static C3457d c(ColorStateList colorStateList) {
        return new C3457d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static C3457d d(Shader shader) {
        return new C3457d(shader, null, 0);
    }

    public static C3457d g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public int e() {
        return this.f33046c;
    }

    public Shader f() {
        return this.f33044a;
    }

    public boolean h() {
        return this.f33044a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f33044a == null && (colorStateList = this.f33045b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (!i()) {
            return false;
        }
        ColorStateList colorStateList = this.f33045b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f33046c) {
            return false;
        }
        this.f33046c = colorForState;
        return true;
    }

    public void k(int i10) {
        this.f33046c = i10;
    }

    public boolean l() {
        return h() || this.f33046c != 0;
    }
}
