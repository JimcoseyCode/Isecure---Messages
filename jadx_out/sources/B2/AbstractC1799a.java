package b2;

import java.io.File;

/* JADX INFO: renamed from: b2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1799a {
    public static boolean a(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zB = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                zB &= b(file2);
            }
        }
        return zB;
    }

    public static boolean b(File file) {
        if (file.isDirectory()) {
            a(file);
        }
        return file.delete();
    }

    public static void c(File file, InterfaceC1800b interfaceC1800b) {
        interfaceC1800b.b(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    c(file2, interfaceC1800b);
                } else {
                    interfaceC1800b.a(file2);
                }
            }
        }
        interfaceC1800b.c(file);
    }
}
