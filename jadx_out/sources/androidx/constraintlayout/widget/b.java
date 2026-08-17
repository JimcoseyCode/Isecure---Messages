package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f15587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f15588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EnumC0154b f15589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f15591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f15592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f15593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f15594h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15595a;

        static {
            int[] iArr = new int[EnumC0154b.values().length];
            f15595a = iArr;
            try {
                iArr[EnumC0154b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15595a[EnumC0154b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15595a[EnumC0154b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15595a[EnumC0154b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15595a[EnumC0154b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15595a[EnumC0154b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15595a[EnumC0154b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15595a[EnumC0154b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum EnumC0154b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public b(String str, EnumC0154b enumC0154b, Object obj, boolean z10) {
        this.f15588b = str;
        this.f15589c = enumC0154b;
        this.f15587a = z10;
        d(obj);
    }

    public static HashMap a(HashMap map, View view) {
        HashMap map2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            b bVar = (b) map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
        }
        return map2;
    }

    public static void b(Context context, XmlPullParser xmlPullParser, HashMap map) {
        EnumC0154b enumC0154b;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f15847J4);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        EnumC0154b enumC0154b2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == i.f15856K4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == i.f15937U4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == i.f15865L4) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0154b2 = EnumC0154b.BOOLEAN_TYPE;
            } else {
                if (index == i.f15881N4) {
                    enumC0154b = EnumC0154b.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == i.f15873M4) {
                    enumC0154b = EnumC0154b.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == i.f15913R4) {
                    enumC0154b = EnumC0154b.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == i.f15889O4) {
                    enumC0154b = EnumC0154b.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == i.f15897P4) {
                    enumC0154b = EnumC0154b.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == i.f15905Q4) {
                    enumC0154b = EnumC0154b.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == i.f15929T4) {
                    enumC0154b = EnumC0154b.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == i.f15921S4) {
                    enumC0154b = EnumC0154b.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                enumC0154b2 = enumC0154b;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new b(string, enumC0154b2, objValueOf2, z10));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void c(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            b bVar = (b) map.get(str);
            if (!bVar.f15587a) {
                str = "set" + str;
            }
            try {
                int i10 = a.f15595a[bVar.f15589c.ordinal()];
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (i10) {
                    case 1:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(bVar.f15590d));
                        break;
                    case 2:
                        cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f15593g));
                        break;
                    case 3:
                        cls.getMethod(str, CharSequence.class).invoke(view, bVar.f15592f);
                        break;
                    case 4:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(bVar.f15594h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f15594h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(bVar.f15590d));
                        break;
                    case 7:
                        cls.getMethod(str, cls2).invoke(view, Float.valueOf(bVar.f15591e));
                        break;
                    case 8:
                        cls.getMethod(str, cls2).invoke(view, Float.valueOf(bVar.f15591e));
                        break;
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                e11.getMessage();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
        }
    }

    public void d(Object obj) {
        switch (a.f15595a[this.f15589c.ordinal()]) {
            case 1:
            case 6:
                this.f15590d = ((Integer) obj).intValue();
                break;
            case 2:
                this.f15593g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f15592f = (String) obj;
                break;
            case 4:
            case 5:
                this.f15594h = ((Integer) obj).intValue();
                break;
            case 7:
                this.f15591e = ((Float) obj).floatValue();
                break;
            case 8:
                this.f15591e = ((Float) obj).floatValue();
                break;
        }
    }

    public b(b bVar, Object obj) {
        this.f15587a = false;
        this.f15588b = bVar.f15588b;
        this.f15589c = bVar.f15589c;
        d(obj);
    }
}
