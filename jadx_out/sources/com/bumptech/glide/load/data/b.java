package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import v1.EnumC3417a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AssetManager f19162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Object f19163i;

    public b(AssetManager assetManager, String str) {
        this.f19162h = assetManager;
        this.f19161g = str;
    }

    protected abstract void a(Object obj);

    protected abstract Object b(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        Object obj = this.f19163i;
        if (obj == null) {
            return;
        }
        try {
            a(obj);
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public EnumC3417a getDataSource() {
        return EnumC3417a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void loadData(com.bumptech.glide.g gVar, d.a aVar) {
        try {
            Object objB = b(this.f19162h, this.f19161g);
            this.f19163i = objB;
            aVar.c(objB);
        } catch (IOException e10) {
            aVar.a(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
