package com.ov.message;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class FileStorageModule extends ReactContextBaseJavaModule {
    public FileStorageModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "FileStorageModule";
    }

    /* JADX WARN: Finally extract failed */
    @ReactMethod
    public void saveToDownloads(String str, String str2, String str3, Promise promise) {
        File file;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        byte[] bArr;
        try {
            if (str.startsWith("file://")) {
                str = str.substring(7);
            }
            file = new File(str);
        } catch (Exception e10) {
            promise.reject("SAVE_ERROR", "Failed to save file: " + e10.getMessage(), e10);
        }
        if (!file.exists()) {
            promise.reject("FILE_NOT_FOUND", "Source file does not exist: " + str);
            return;
        }
        if (Build.VERSION.SDK_INT < 29) {
            File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str2);
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    bArr = new byte[8192];
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
            }
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    fileInputStream.close();
                    promise.resolve(file2.getAbsolutePath());
                    return;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        }
        ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str2);
        contentValues.put("mime_type", str3);
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
        Uri uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            promise.reject("INSERT_FAILED", "Failed to create MediaStore entry");
            return;
        }
        fileInputStream = new FileInputStream(file);
        try {
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
            try {
                if (outputStreamOpenOutputStream == null) {
                    promise.reject("STREAM_ERROR", "Failed to open output stream");
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                    }
                    fileInputStream.close();
                    return;
                }
                byte[] bArr2 = new byte[8192];
                while (true) {
                    int i11 = fileInputStream.read(bArr2);
                    if (i11 == -1) {
                        outputStreamOpenOutputStream.flush();
                        outputStreamOpenOutputStream.close();
                        fileInputStream.close();
                        promise.resolve(uriInsert.toString());
                        return;
                    }
                    outputStreamOpenOutputStream.write(bArr2, 0, i11);
                }
            } finally {
            }
        } finally {
        }
        promise.reject("SAVE_ERROR", "Failed to save file: " + e10.getMessage(), e10);
    }
}
