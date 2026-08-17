package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import v1.EnumC3417a;
import w1.AbstractC3464c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final boolean f19185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f19186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ContentResolver f19187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Object f19188j;

    l(ContentResolver contentResolver, Uri uri, boolean z10) {
        this.f19187i = contentResolver;
        this.f19186h = uri;
        this.f19185g = z10;
    }

    protected abstract void a(Object obj);

    protected abstract Object b(Uri uri, ContentResolver contentResolver);

    protected AssetFileDescriptor c(Uri uri) {
        return (this.f19185g && AbstractC3464c.d(uri) && AbstractC3464c.c()) ? AbstractC3464c.h(uri, this.f19187i) : this.f19187i.openAssetFileDescriptor(uri, "r");
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        Object obj = this.f19188j;
        if (obj != null) {
            try {
                a(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public EnumC3417a getDataSource() {
        return EnumC3417a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void loadData(com.bumptech.glide.g gVar, d.a aVar) {
        try {
            Object objB = b(this.f19186h, this.f19187i);
            this.f19188j = objB;
            aVar.c(objB);
        } catch (FileNotFoundException e10) {
            aVar.a(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
