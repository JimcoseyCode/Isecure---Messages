package t7;

import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p extends n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f32515g = new a();

        a() {
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(File file, IOException exception) throws IOException {
            AbstractC2855l.g(file, "<unused var>");
            AbstractC2855l.g(exception, "exception");
            throw exception;
        }
    }

    private static final f A(f fVar) {
        return new f(fVar.a(), z(fVar.b()));
    }

    public static File B(File file, File base) {
        AbstractC2855l.g(file, "<this>");
        AbstractC2855l.g(base, "base");
        return new File(D(file, base));
    }

    public static boolean C(File file, File other) {
        AbstractC2855l.g(file, "<this>");
        AbstractC2855l.g(other, "other");
        f fVarB = k.b(file);
        f fVarB2 = k.b(other);
        if (AbstractC2855l.b(fVarB.a(), fVarB2.a()) && fVarB.c() >= fVarB2.c()) {
            return fVarB.b().subList(0, fVarB2.c()).equals(fVarB2.b());
        }
        return false;
    }

    public static final String D(File file, File base) {
        AbstractC2855l.g(file, "<this>");
        AbstractC2855l.g(base, "base");
        String strE = E(file, base);
        if (strE != null) {
            return strE;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }

    private static final String E(File file, File file2) {
        f fVarA = A(k.b(file));
        f fVarA2 = A(k.b(file2));
        if (!AbstractC2855l.b(fVarA.a(), fVarA2.a())) {
            return null;
        }
        int iC = fVarA2.c();
        int iC2 = fVarA.c();
        int iMin = Math.min(iC2, iC);
        int i10 = 0;
        while (i10 < iMin && AbstractC2855l.b(fVarA.b().get(i10), fVarA2.b().get(i10))) {
            i10++;
        }
        StringBuilder sb = new StringBuilder();
        int i11 = iC - 1;
        if (i10 <= i11) {
            while (!AbstractC2855l.b(((File) fVarA2.b().get(i11)).getName(), "..")) {
                sb.append("..");
                if (i11 != i10) {
                    sb.append(File.separatorChar);
                }
                if (i11 != i10) {
                    i11--;
                }
            }
            return null;
        }
        if (i10 < iC2) {
            if (i10 < iC) {
                sb.append(File.separatorChar);
            }
            List listZ = AbstractC2800q.Z(fVarA.b(), i10);
            String separator = File.separator;
            AbstractC2855l.f(separator, "separator");
            AbstractC2800q.m0(listZ, sb, separator, null, null, 0, null, null, 124, null);
        }
        return sb.toString();
    }

    public static final boolean s(File file, File target, boolean z10, final Function2 onError) {
        AbstractC2855l.g(file, "<this>");
        AbstractC2855l.g(target, "target");
        AbstractC2855l.g(onError, "onError");
        if (!file.exists()) {
            return onError.invoke(file, new r(file, null, "The source file doesn't exist.", 2, null)) != s.f32521h;
        }
        try {
            for (File file2 : n.q(file).i(new Function2() { // from class: t7.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p.u(onError, (File) obj, (IOException) obj2);
                }
            })) {
                if (file2.exists()) {
                    File file3 = new File(target, D(file2, file));
                    if (file3.exists() && (!file2.isDirectory() || !file3.isDirectory())) {
                        if (z10) {
                            if (file3.isDirectory()) {
                                if (!x(file3)) {
                                }
                            } else if (!file3.delete()) {
                            }
                        }
                        if (onError.invoke(file3, new e(file2, file3, "The destination file already exists.")) == s.f32521h) {
                            return false;
                        }
                    }
                    if (file2.isDirectory()) {
                        file3.mkdirs();
                    } else {
                        boolean z11 = z10;
                        if (w(file2, file3, z11, 0, 4, null).length() != file2.length() && onError.invoke(file2, new IOException("Source file wasn't copied completely, length of destination file differs.")) == s.f32521h) {
                            return false;
                        }
                        z10 = z11;
                    }
                } else if (onError.invoke(file2, new r(file2, null, "The source file doesn't exist.", 2, null)) == s.f32521h) {
                    return false;
                }
            }
            return true;
        } catch (t unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean t(File file, File file2, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            function2 = a.f32515g;
        }
        return s(file, file2, z10, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B u(Function2 function2, File f10, IOException e10) throws t {
        AbstractC2855l.g(f10, "f");
        AbstractC2855l.g(e10, "e");
        if (function2.invoke(f10, e10) != s.f32521h) {
            return C2735B.f28704a;
        }
        throw new t(f10);
    }

    public static final File v(File file, File target, boolean z10, int i10) throws IOException {
        AbstractC2855l.g(file, "<this>");
        AbstractC2855l.g(target, "target");
        if (!file.exists()) {
            throw new r(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z10) {
                throw new e(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new e(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (target.mkdirs()) {
                return target;
            }
            throw new g(file, target, "Failed to create target directory.");
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                AbstractC3375b.a(fileInputStream, fileOutputStream, i10);
                AbstractC3376c.a(fileOutputStream, null);
                AbstractC3376c.a(fileInputStream, null);
                return target;
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ File w(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return v(file, file2, z10, i10);
    }

    public static boolean x(File file) {
        AbstractC2855l.g(file, "<this>");
        while (true) {
            boolean z10 = true;
            for (File file2 : n.p(file)) {
                if (!file2.delete() && file2.exists()) {
                    z10 = false;
                } else {
                    if (z10) {
                        break;
                    }
                    z10 = false;
                }
            }
            return z10;
        }
    }

    public static String y(File file) {
        AbstractC2855l.g(file, "<this>");
        String name = file.getName();
        AbstractC2855l.f(name, "getName(...)");
        return P8.q.Q0(name, '.', PointerEventHelper.POINTER_TYPE_UNKNOWN);
    }

    private static final List z(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            if (!AbstractC2855l.b(name, ".")) {
                if (!AbstractC2855l.b(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || AbstractC2855l.b(((File) AbstractC2800q.q0(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }
}
