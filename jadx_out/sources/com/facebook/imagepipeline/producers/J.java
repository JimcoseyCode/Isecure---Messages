package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import d2.AbstractC2325a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class J extends L implements u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Class f19967d = J.class;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f19968e = {"_id", "_data"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f19969f = {"_data"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Rect f19970g = new Rect(0, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, 384);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Rect f19971h = new Rect(0, 0, 96, 96);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f19972c;

    public J(Executor executor, f2.i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        this.f19972c = contentResolver;
    }

    private d3.k g(Uri uri, X2.g gVar) {
        Cursor cursorQuery;
        d3.k kVarJ;
        if (gVar == null || (cursorQuery = this.f19972c.query(uri, f19968e, null, null, null)) == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (kVarJ = j(gVar, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")))) == null) {
                cursorQuery.close();
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("_data");
            if (columnIndex >= 0) {
                kVarJ.N0(i(cursorQuery.getString(columnIndex)));
            }
            cursorQuery.close();
            return kVarJ;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    private static int h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    private static int i(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return JfifUtil.getAutoRotateAngleFromOrientation(new ExifInterface(str).getAttributeInt("Orientation", 1));
        } catch (IOException e10) {
            AbstractC2325a.l(f19967d, e10, "Unable to retrieve thumbnail rotation for %s", str);
            return 0;
        }
    }

    private d3.k j(X2.g gVar, long j10) {
        Cursor cursorQueryMiniThumbnail;
        int columnIndex;
        int iK = k(gVar);
        if (iK == 0 || (cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f19972c, j10, iK, f19969f)) == null) {
            return null;
        }
        try {
            if (cursorQueryMiniThumbnail.moveToFirst() && (columnIndex = cursorQueryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String str = (String) c2.k.g(cursorQueryMiniThumbnail.getString(columnIndex));
                if (new File(str).exists()) {
                    return e(new FileInputStream(str), h(str));
                }
            }
            return null;
        } finally {
            cursorQueryMiniThumbnail.close();
        }
    }

    private static int k(X2.g gVar) {
        Rect rect = f19971h;
        if (v0.b(rect.width(), rect.height(), gVar)) {
            return 3;
        }
        Rect rect2 = f19970g;
        return v0.b(rect2.width(), rect2.height(), gVar) ? 1 : 0;
    }

    @Override // com.facebook.imagepipeline.producers.u0
    public boolean a(X2.g gVar) {
        Rect rect = f19970g;
        return v0.b(rect.width(), rect.height(), gVar);
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected d3.k d(com.facebook.imagepipeline.request.b bVar) {
        Uri sourceUri = bVar.getSourceUri();
        if (k2.f.j(sourceUri)) {
            return g(sourceUri, bVar.getResizeOptions());
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalContentUriThumbnailFetchProducer";
    }
}
