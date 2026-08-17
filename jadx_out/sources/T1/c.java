package T1;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import kotlin.jvm.internal.AbstractC2855l;
import t7.AbstractC3375b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final String a(Context context) {
        AbstractC2855l.g(context, "<this>");
        return context.getPackageName() + ".cropper.fileprovider";
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7 A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0019, B:12:0x0047, B:43:0x00c7, B:45:0x00cc, B:46:0x00cf, B:38:0x00bc, B:40:0x00c1), top: B:57:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc A[Catch: Exception -> 0x004e, TryCatch #1 {Exception -> 0x004e, blocks: (B:6:0x0019, B:12:0x0047, B:43:0x00c7, B:45:0x00cc, B:46:0x00cf, B:38:0x00bc, B:40:0x00c1), top: B:57:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Uri b(Context context, File file) throws Throwable {
        File externalCacheDir;
        FileOutputStream fileOutputStream;
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(file, "file");
        String strA = a(context);
        try {
            Uri uriForFile = FileProvider.getUriForFile(context, strA, file);
            AbstractC2855l.f(uriForFile, "getUriForFile(...)");
            return uriForFile;
        } catch (Exception e10) {
            try {
                e10.getMessage();
                File file2 = new File(new File(context.getCacheDir(), "CROP_LIB_CACHE"), file.getName());
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(file2);
                        try {
                            AbstractC3375b.b(fileInputStream2, fileOutputStream, 0, 2, null);
                            Uri uriForFile2 = FileProvider.getUriForFile(context, strA, file2);
                            AbstractC2855l.f(uriForFile2, "getUriForFile(...)");
                            fileInputStream2.close();
                            fileOutputStream.close();
                            return uriForFile2;
                        } catch (Exception e11) {
                            e = e11;
                            fileInputStream = fileInputStream2;
                            try {
                                e.getMessage();
                                String str = "content://" + strA + "/files/my_images/";
                                if (Build.VERSION.SDK_INT >= 26) {
                                    Files.createDirectories(Paths.get(str, new String[0]), new FileAttribute[0]);
                                } else {
                                    File file3 = new File(str);
                                    if (!file3.exists()) {
                                        file3.mkdirs();
                                    }
                                }
                                Uri uri = Uri.parse(str + file.getName());
                                AbstractC2855l.f(uri, "parse(...)");
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                return uri;
                            } catch (Throwable th) {
                                th = th;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                            }
                            if (fileOutputStream != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        fileOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                } catch (Exception e13) {
                    e = e13;
                    fileOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                }
            } catch (Exception e14) {
                e14.getMessage();
                if (Build.VERSION.SDK_INT < 29 && (externalCacheDir = context.getExternalCacheDir()) != null) {
                    try {
                        Uri uriFromFile = Uri.fromFile(new File(externalCacheDir.getPath(), file.getAbsolutePath()));
                        AbstractC2855l.f(uriFromFile, "fromFile(...)");
                        return uriFromFile;
                    } catch (Exception e15) {
                        e15.getMessage();
                        Uri uriFromFile2 = Uri.fromFile(file);
                        AbstractC2855l.f(uriFromFile2, "fromFile(...)");
                        return uriFromFile2;
                    }
                }
                Uri uriFromFile22 = Uri.fromFile(file);
                AbstractC2855l.f(uriFromFile22, "fromFile(...)");
                return uriFromFile22;
            }
        }
    }
}
