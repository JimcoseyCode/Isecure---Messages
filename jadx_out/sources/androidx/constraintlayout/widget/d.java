package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f15614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f15615b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f15616c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SparseArray f15617d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SparseArray f15618e = new SparseArray();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList f15620b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        e f15622d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f15621c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f16006c7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f16015d7) {
                    this.f15619a = typedArrayObtainStyledAttributes.getResourceId(index, this.f15619a);
                } else if (index == i.f16024e7) {
                    this.f15621c = typedArrayObtainStyledAttributes.getResourceId(index, this.f15621c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f15621c);
                    context.getResources().getResourceName(this.f15621c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f15622d = eVar;
                        eVar.e(context, this.f15621c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f15620b.add(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f15623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f15624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f15625c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f15626d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        e f15628f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f15623a = Float.NaN;
            this.f15624b = Float.NaN;
            this.f15625c = Float.NaN;
            this.f15626d = Float.NaN;
            this.f15627e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f15769A7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f15778B7) {
                    this.f15627e = typedArrayObtainStyledAttributes.getResourceId(index, this.f15627e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f15627e);
                    context.getResources().getResourceName(this.f15627e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f15628f = eVar;
                        eVar.e(context, this.f15627e);
                    }
                } else if (index == i.f15787C7) {
                    this.f15626d = typedArrayObtainStyledAttributes.getDimension(index, this.f15626d);
                } else if (index == i.f15796D7) {
                    this.f15624b = typedArrayObtainStyledAttributes.getDimension(index, this.f15624b);
                } else if (index == i.f15805E7) {
                    this.f15625c = typedArrayObtainStyledAttributes.getDimension(index, this.f15625c);
                } else if (index == i.f15814F7) {
                    this.f15623a = typedArrayObtainStyledAttributes.getDimension(index, this.f15623a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    d(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f15614a = constraintLayout;
        a(context, i10);
    }

    private void a(Context context, int i10) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                aVar = new a(context, xml);
                                this.f15617d.put(aVar.f15619a, aVar);
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xml);
                                if (aVar != null) {
                                    aVar.a(bVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                eVar.l(context, xmlPullParser);
                this.f15618e.put(identifier, eVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }
}
