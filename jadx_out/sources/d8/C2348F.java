package d8;

import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: d8.F, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2348F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2348F f25682a = new C2348F();

    private C2348F() {
    }

    private final String c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence k(String it) {
        AbstractC2855l.g(it, "it");
        return f25682a.c(it);
    }

    public final String[] b(String... signatures) {
        AbstractC2855l.g(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final Set d(String internalName, String... signatures) {
        AbstractC2855l.g(internalName, "internalName");
        AbstractC2855l.g(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public final Set e(String name, String... signatures) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(signatures, "signatures");
        return d(h(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final Set f(String name, String... signatures) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(signatures, "signatures");
        return d(i(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final String g(String name) {
        AbstractC2855l.g(name, "name");
        return "java/util/function/" + name;
    }

    public final String h(String name) {
        AbstractC2855l.g(name, "name");
        return "java/lang/" + name;
    }

    public final String i(String name) {
        AbstractC2855l.g(name, "name");
        return "java/util/" + name;
    }

    public final String j(String name, List parameters, String ret) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(parameters, "parameters");
        AbstractC2855l.g(ret, "ret");
        return name + '(' + AbstractC2800q.o0(parameters, PointerEventHelper.POINTER_TYPE_UNKNOWN, null, null, 0, null, C2347E.f25681g, 30, null) + ')' + c(ret);
    }

    public final String l(String internalName, String jvmDescriptor) {
        AbstractC2855l.g(internalName, "internalName");
        AbstractC2855l.g(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }
}
