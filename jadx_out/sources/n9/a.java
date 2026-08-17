package n9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.D;
import t9.F;
import t9.s;
import t9.t;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0328a f30217b = new C0328a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f30216a = new C0328a.C0329a();

    /* JADX INFO: renamed from: n9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0328a {

        /* JADX INFO: renamed from: n9.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static final class C0329a implements a {
            @Override // n9.a
            public F a(File file) {
                AbstractC2855l.g(file, "file");
                return s.j(file);
            }

            @Override // n9.a
            public D b(File file) {
                AbstractC2855l.g(file, "file");
                try {
                    return t.g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return t.g(file, false, 1, null);
                }
            }

            @Override // n9.a
            public void c(File directory) throws IOException {
                AbstractC2855l.g(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    AbstractC2855l.f(file, "file");
                    if (file.isDirectory()) {
                        c(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // n9.a
            public boolean d(File file) {
                AbstractC2855l.g(file, "file");
                return file.exists();
            }

            @Override // n9.a
            public void e(File from, File to) throws IOException {
                AbstractC2855l.g(from, "from");
                AbstractC2855l.g(to, "to");
                f(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // n9.a
            public void f(File file) throws IOException {
                AbstractC2855l.g(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // n9.a
            public D g(File file) {
                AbstractC2855l.g(file, "file");
                try {
                    return s.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return s.a(file);
                }
            }

            @Override // n9.a
            public long h(File file) {
                AbstractC2855l.g(file, "file");
                return file.length();
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private C0328a() {
        }

        public /* synthetic */ C0328a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    F a(File file);

    D b(File file);

    void c(File file);

    boolean d(File file);

    void e(File file, File file2);

    void f(File file);

    D g(File file);

    long h(File file);
}
