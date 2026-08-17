package N0;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: N0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1301a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1301a f7727a = new C1301a();

    private C1301a() {
    }

    public final boolean a(File srcFile, File dstFile) {
        AbstractC2855l.g(srcFile, "srcFile");
        AbstractC2855l.g(dstFile, "dstFile");
        try {
            Files.move(srcFile.toPath(), dstFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
