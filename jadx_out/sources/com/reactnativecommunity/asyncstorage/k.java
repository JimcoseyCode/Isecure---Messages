package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import expo.modules.kotlin.devtools.ExpoNetworkInspectOkHttpNetworkInterceptor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class k extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static k f24857j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f24858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SQLiteDatabase f24859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f24860i;

    private k(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f24860i = j.f24856a.longValue() * ExpoNetworkInspectOkHttpNetworkInterceptor.MAX_BODY_SIZE;
        this.f24858g = context;
    }

    private synchronized boolean k() {
        e();
        return this.f24858g.deleteDatabase("RKStorage");
    }

    public static k s(Context context) {
        if (f24857j == null) {
            f24857j = new k(context.getApplicationContext());
        }
        return f24857j;
    }

    synchronized void d() {
        r().delete("catalystLocalStorage", null, null);
    }

    public synchronized void e() {
        SQLiteDatabase sQLiteDatabase = this.f24859h;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f24859h.close();
            this.f24859h = null;
        }
    }

    synchronized boolean m() {
        SQLiteDatabase sQLiteDatabase = this.f24859h;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return true;
        }
        SQLiteException e10 = null;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 > 0) {
                try {
                    k();
                } catch (SQLiteException e11) {
                    e10 = e11;
                    try {
                        Thread.sleep(30L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            this.f24859h = getWritableDatabase();
        }
        SQLiteDatabase sQLiteDatabase2 = this.f24859h;
        if (sQLiteDatabase2 == null) {
            throw e10;
        }
        sQLiteDatabase2.setMaximumSize(this.f24860i);
        return true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 != i11) {
            k();
            onCreate(sQLiteDatabase);
        }
    }

    public synchronized SQLiteDatabase r() {
        m();
        return this.f24859h;
    }
}
