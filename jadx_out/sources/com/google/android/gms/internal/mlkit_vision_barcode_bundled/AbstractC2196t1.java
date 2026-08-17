package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2196t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f22416a;

    static {
        char[] cArr = new char[80];
        f22416a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(InterfaceC2186r1 interfaceC2186r1, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(interfaceC2186r1, sb, 0);
        return sb.toString();
    }

    static void b(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i10, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(U1.a(new C2166n0(((String) obj).getBytes(X0.f22316a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC2171o0) {
            sb.append(": \"");
            sb.append(U1.a((AbstractC2171o0) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof P0) {
            sb.append(" {");
            d((P0) obj, sb, i10 + 2);
            sb.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            c(i10, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        b(sb, i12, "key", entry.getKey());
        b(sb, i12, "value", entry.getValue());
        sb.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        c(i10, sb);
        sb.append("}");
    }

    private static void c(int i10, StringBuilder sb) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(f22416a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(InterfaceC2186r1 interfaceC2186r1, StringBuilder sb, int i10) {
        int i11;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC2186r1.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb, i10, strSubstring.substring(0, strSubstring.length() - 4), P0.u(method2, interfaceC2186r1, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i10, strSubstring.substring(0, strSubstring.length() - 3), P0.u(method, interfaceC2186r1, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objU = P0.u(method4, interfaceC2186r1, new Object[0]);
                    if (method5 == null) {
                        if (objU instanceof Boolean) {
                            if (((Boolean) objU).booleanValue()) {
                                b(sb, i10, strSubstring, objU);
                            }
                        } else if (objU instanceof Integer) {
                            if (((Integer) objU).intValue() != 0) {
                            }
                        } else if (objU instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objU).floatValue()) != 0) {
                            }
                        } else if (!(objU instanceof Double)) {
                            if (objU instanceof String) {
                                zEquals = objU.equals(PointerEventHelper.POINTER_TYPE_UNKNOWN);
                            } else if (objU instanceof AbstractC2171o0) {
                                zEquals = objU.equals(AbstractC2171o0.f22405h);
                            } else if (objU instanceof InterfaceC2186r1) {
                                if (objU != ((InterfaceC2186r1) objU).c()) {
                                }
                            } else if (!(objU instanceof Enum) || ((Enum) objU).ordinal() != 0) {
                            }
                            if (!zEquals) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objU).doubleValue()) != 0) {
                        }
                    } else if (((Boolean) P0.u(method5, interfaceC2186r1, new Object[0])).booleanValue()) {
                    }
                }
            }
            i11 = 3;
        }
        if (interfaceC2186r1 instanceof M0) {
            Iterator itF = ((M0) interfaceC2186r1).zzb.f();
            while (itF.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itF.next();
                b(sb, i10, "[" + ((N0) entry2.getKey()).f22288g + "]", entry2.getValue());
            }
        }
        X1 x12 = ((P0) interfaceC2186r1).zzc;
        if (x12 != null) {
            x12.i(sb, i10);
        }
    }
}
