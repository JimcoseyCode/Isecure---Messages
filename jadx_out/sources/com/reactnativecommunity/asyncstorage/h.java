package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    private static void a(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws Throwable {
        Throwable th;
        FileChannel channel;
        FileChannel fileChannel = null;
        try {
            FileChannel channel2 = fileInputStream.getChannel();
            try {
                channel = fileOutputStream.getChannel();
                try {
                    channel2.transferTo(0L, channel2.size(), channel);
                    try {
                        channel2.close();
                        if (channel != null) {
                            channel.close();
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = channel2;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } finally {
                        }
                    }
                    if (channel == null) {
                        throw th;
                    }
                    channel.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                channel = null;
            }
        } catch (Throwable th4) {
            th = th4;
            channel = null;
        }
    }

    private static ArrayList b(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            File[] fileArrListFiles = context.getDatabasePath("noop").getParentFile().listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.getName().startsWith("RKStorage-scoped-experience-") && !file.getName().endsWith("-journal")) {
                        arrayList.add(file);
                    }
                }
            }
            return arrayList;
        } catch (Exception e10) {
            e10.printStackTrace();
            return arrayList;
        }
    }

    private static File c(ArrayList arrayList) {
        File file = null;
        if (arrayList.size() == 0) {
            return null;
        }
        Iterator it = arrayList.iterator();
        long j10 = -1;
        while (it.hasNext()) {
            File file2 = (File) it.next();
            long jE = e(file2);
            if (jE > j10) {
                file = file2;
                j10 = jE;
            }
        }
        return file != null ? file : (File) arrayList.get(0);
    }

    private static long d(File file) {
        try {
            return Files.readAttributes(file.toPath(), d.a(), new LinkOption[0]).creationTime().toMillis();
        } catch (Exception unused) {
            return -1L;
        }
    }

    private static long e(File file) {
        try {
            return Build.VERSION.SDK_INT >= 26 ? d(file) : file.lastModified();
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    private static boolean f(Context context) {
        return context.getDatabasePath("RKStorage").exists();
    }

    public static void g(Context context) throws Throwable {
        ArrayList<File> arrayListB;
        File fileC;
        if (f(context) || (fileC = c((arrayListB = b(context)))) == null) {
            return;
        }
        try {
            k.s(context).r();
            a(new FileInputStream(fileC), new FileOutputStream(context.getDatabasePath("RKStorage")));
            fileC.getName();
            try {
                for (File file : arrayListB) {
                    if (file.delete()) {
                        file.getName();
                    } else {
                        file.getName();
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            fileC.getName();
            e11.printStackTrace();
        }
    }
}
