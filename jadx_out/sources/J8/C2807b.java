package j8;

import P8.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import q7.AbstractC3130c;

/* JADX INFO: renamed from: j8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2807b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2807b f28931a = new C2807b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f28932b = AbstractC2800q.o0(AbstractC2800q.m('k', 'o', 't', 'l', 'i', 'n'), PointerEventHelper.POINTER_TYPE_UNKNOWN, null, null, 0, null, null, 62, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f28933c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listM = AbstractC2800q.m("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iB = AbstractC3130c.b(0, listM.size() - 1, 2);
        if (iB >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f28932b;
                sb.append(str);
                sb.append('/');
                sb.append((String) listM.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb.toString(), listM.get(i11));
                linkedHashMap.put(str + '/' + ((String) listM.get(i10)) + "Array", '[' + ((String) listM.get(i11)));
                if (i10 == iB) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f28932b + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : AbstractC2800q.m("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : AbstractC2800q.m("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            StringBuilder sb2 = new StringBuilder();
            String str4 = f28932b;
            sb2.append(str4);
            sb2.append("/jvm/functions/Function");
            sb2.append(i12);
            a(linkedHashMap, "Function" + i12, sb2.toString());
            a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : AbstractC2800q.m("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, str5 + ".Companion", f28932b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f28933c = linkedHashMap;
    }

    private C2807b() {
    }

    private static final void a(Map map, String str, String str2) {
        map.put(f28932b + '/' + str, 'L' + str2 + ';');
    }

    public static final String b(String classId) {
        AbstractC2855l.g(classId, "classId");
        String str = (String) f28933c.get(classId);
        if (str != null) {
            return str;
        }
        return 'L' + q.D(classId, '.', '$', false, 4, null) + ';';
    }
}
