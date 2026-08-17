package w0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.facebook.react.common.assets.ReactFontManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q.AbstractC3105o;
import v0.AbstractC3416d;

/* JADX INFO: renamed from: w0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3458e {

    /* JADX INFO: renamed from: w0.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* JADX INFO: renamed from: w0.e$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
    }

    /* JADX INFO: renamed from: w0.e$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d[] f33047a;

        public c(d[] dVarArr) {
            this.f33047a = dVarArr;
        }

        public d[] a() {
            return this.f33047a;
        }
    }

    /* JADX INFO: renamed from: w0.e$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f33049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f33050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f33051d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f33052e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f33053f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f33048a = str;
            this.f33049b = i10;
            this.f33050c = z10;
            this.f33051d = str2;
            this.f33052e = i11;
            this.f33053f = i12;
        }

        public String a() {
            return this.f33048a;
        }

        public int b() {
            return this.f33053f;
        }

        public int c() {
            return this.f33052e;
        }

        public String d() {
            return this.f33051d;
        }

        public int e() {
            return this.f33049b;
        }

        public boolean f() {
            return this.f33050c;
        }
    }

    /* JADX INFO: renamed from: w0.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0364e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f33054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f33055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f33056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f33057d;

        public C0364e(List list, int i10, int i11, String str) {
            this.f33054a = list;
            this.f33056c = i10;
            this.f33055b = i11;
            this.f33057d = str;
        }

        public int a() {
            return this.f33056c;
        }

        public List b() {
            return this.f33054a;
        }

        public String c() {
            return this.f33057d;
        }

        public int d() {
            return this.f33055b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return e(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(i(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(i(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static E0.f d(XmlPullParser xmlPullParser, Resources resources, String str, String str2, List list) throws Exception {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC3416d.f32823B);
        try {
            String string = typedArrayObtainAttributes.getString(AbstractC3416d.f32824C);
            String string2 = typedArrayObtainAttributes.getString(AbstractC3416d.f32825D);
            String string3 = typedArrayObtainAttributes.getString(AbstractC3416d.f32826E);
            if (string == null) {
                throw new XmlPullParserException("query attribute must be set in fallback element");
            }
            while (xmlPullParser.next() != 3) {
                h(xmlPullParser);
            }
            E0.f fVar = new E0.f(str, str2, string, list, string2, string3);
            AbstractC3105o.a(typedArrayObtainAttributes);
            return fVar;
        } catch (Throwable th) {
            if (typedArrayObtainAttributes == null) {
                throw th;
            }
            try {
                AbstractC3105o.a(typedArrayObtainAttributes);
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return f(xmlPullParser, resources);
        }
        h(xmlPullParser);
        return null;
    }

    private static b f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC3416d.f32850h);
        String string = typedArrayObtainAttributes.getString(AbstractC3416d.f32851i);
        String string2 = typedArrayObtainAttributes.getString(AbstractC3416d.f32856n);
        String string3 = typedArrayObtainAttributes.getString(AbstractC3416d.f32857o);
        String string4 = typedArrayObtainAttributes.getString(AbstractC3416d.f32853k);
        int resourceId = typedArrayObtainAttributes.getResourceId(AbstractC3416d.f32852j, 0);
        int integer = typedArrayObtainAttributes.getInteger(AbstractC3416d.f32854l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(AbstractC3416d.f32855m, 500);
        String string5 = typedArrayObtainAttributes.getString(AbstractC3416d.f32858p);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(g(xmlPullParser, resources));
                    } else {
                        h(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        List listC = c(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("fallback")) {
                    arrayList2.add(d(xmlPullParser, resources, string, string2, listC));
                } else {
                    h(xmlPullParser);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return new C0364e(arrayList2, integer, integer2, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new E0.f(string, string2, string3, listC, null, null));
        if (string4 != null) {
            arrayList2.add(new E0.f(string, string2, string4, listC, null, null));
        }
        return new C0364e(arrayList2, integer, integer2, string5);
    }

    private static d g(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC3416d.f32859q);
        int i10 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(AbstractC3416d.f32868z) ? AbstractC3416d.f32868z : AbstractC3416d.f32861s, ReactFontManager.TypefaceStyle.NORMAL);
        boolean z10 = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(AbstractC3416d.f32866x) ? AbstractC3416d.f32866x : AbstractC3416d.f32862t, 0);
        int i11 = typedArrayObtainAttributes.hasValue(AbstractC3416d.f32822A) ? AbstractC3416d.f32822A : AbstractC3416d.f32863u;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(AbstractC3416d.f32867y) ? AbstractC3416d.f32867y : AbstractC3416d.f32864v);
        int i12 = typedArrayObtainAttributes.getInt(i11, 0);
        int i13 = typedArrayObtainAttributes.hasValue(AbstractC3416d.f32865w) ? AbstractC3416d.f32865w : AbstractC3416d.f32860r;
        int resourceId = typedArrayObtainAttributes.getResourceId(i13, 0);
        String string2 = typedArrayObtainAttributes.getString(i13);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            h(xmlPullParser);
        }
        return new d(string2, i10, z10, string, i12, resourceId);
    }

    private static void h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
