package com.bumptech.glide;

import B1.a;
import B1.b;
import B1.d;
import B1.e;
import B1.g;
import B1.l;
import B1.o;
import B1.s;
import B1.t;
import B1.u;
import B1.v;
import B1.w;
import B1.x;
import B1.y;
import C1.a;
import C1.b;
import C1.c;
import C1.d;
import C1.g;
import E1.a;
import F1.m;
import Q1.f;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.resource.bitmap.C1931a;
import com.bumptech.glide.load.resource.bitmap.C1932b;
import com.bumptech.glide.load.resource.bitmap.C1933c;
import com.bumptech.glide.load.resource.bitmap.C1939i;
import com.bumptech.glide.load.resource.bitmap.C1941k;
import com.bumptech.glide.load.resource.bitmap.C1943m;
import com.bumptech.glide.load.resource.bitmap.C1949t;
import com.bumptech.glide.load.resource.bitmap.C1952w;
import com.bumptech.glide.load.resource.bitmap.U;
import com.bumptech.glide.load.resource.bitmap.W;
import com.bumptech.glide.load.resource.bitmap.Y;
import com.bumptech.glide.load.resource.bitmap.Z;
import com.bumptech.glide.load.resource.bitmap.b0;
import com.bumptech.glide.load.resource.bitmap.d0;
import com.bumptech.glide.module.AppGlideModule;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import l1.AbstractC2861a;
import s1.InterfaceC3316a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class i {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f19098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f19099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f19100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AppGlideModule f19101d;

        a(b bVar, List list, AppGlideModule appGlideModule) {
            this.f19099b = bVar;
            this.f19100c = list;
            this.f19101d = appGlideModule;
        }

        @Override // Q1.f.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h get() {
            if (this.f19098a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            AbstractC2861a.c("Glide registry");
            this.f19098a = true;
            try {
                return i.a(this.f19099b, this.f19100c, this.f19101d);
            } finally {
                this.f19098a = false;
                AbstractC2861a.f();
            }
        }
    }

    static h a(b bVar, List list, AppGlideModule appGlideModule) {
        y1.d dVarG = bVar.g();
        y1.b bVarF = bVar.f();
        Context applicationContext = bVar.j().getApplicationContext();
        e eVarF = bVar.j().f();
        h hVar = new h();
        b(applicationContext, hVar, dVarG, bVarF, eVarF);
        c(applicationContext, bVar, hVar, list, appGlideModule);
        return hVar;
    }

    private static void b(Context context, h hVar, y1.d dVar, y1.b bVar, e eVar) {
        v1.j c1939i;
        v1.j z10;
        String str;
        h hVar2;
        hVar.r(new C1943m());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            hVar.r(new C1952w());
        }
        Resources resources = context.getResources();
        List listG = hVar.g();
        H1.a aVar = new H1.a(context, listG, dVar, bVar);
        v1.j jVarK = d0.k(dVar);
        C1949t c1949t = new C1949t(hVar.g(), resources.getDisplayMetrics(), dVar, bVar);
        if (i10 < 28 || !eVar.a(c.b.class)) {
            c1939i = new C1939i(c1949t);
            z10 = new Z(c1949t, bVar);
        } else {
            z10 = new U();
            c1939i = new C1941k();
        }
        if (i10 >= 28) {
            hVar.e("Animation", InputStream.class, Drawable.class, F1.h.f(listG, bVar));
            hVar.e("Animation", ByteBuffer.class, Drawable.class, F1.h.a(listG, bVar));
        }
        F1.l lVar = new F1.l(context);
        C1933c c1933c = new C1933c(bVar);
        I1.a aVar2 = new I1.a();
        I1.d dVar2 = new I1.d();
        ContentResolver contentResolver = context.getContentResolver();
        hVar.c(ByteBuffer.class, new B1.c()).c(InputStream.class, new u(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, c1939i).e("Bitmap", InputStream.class, Bitmap.class, z10);
        if (ParcelFileDescriptorRewinder.b()) {
            str = "Animation";
            hVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new W(c1949t));
        } else {
            str = "Animation";
        }
        hVar.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, d0.a(dVar));
        String str2 = str;
        hVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, jVarK).a(Bitmap.class, Bitmap.class, w.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new b0()).d(Bitmap.class, c1933c).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1931a(resources, c1939i)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1931a(resources, z10)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C1931a(resources, jVarK)).d(BitmapDrawable.class, new C1932b(dVar, c1933c)).e(str2, InputStream.class, H1.c.class, new H1.j(listG, aVar, bVar)).e(str2, ByteBuffer.class, H1.c.class, aVar).d(H1.c.class, new H1.d()).a(InterfaceC3316a.class, InterfaceC3316a.class, w.a.a()).e("Bitmap", InterfaceC3316a.class, Bitmap.class, new H1.h(dVar)).b(Uri.class, Drawable.class, lVar).b(Uri.class, Bitmap.class, new Y(lVar, dVar)).s(new a.C0035a()).a(File.class, ByteBuffer.class, new d.b()).a(File.class, InputStream.class, new g.e()).b(File.class, File.class, new G1.a()).a(File.class, ParcelFileDescriptor.class, new g.b()).a(File.class, File.class, w.a.a()).s(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.b()) {
            hVar2 = hVar;
            hVar2.s(new ParcelFileDescriptorRewinder.a());
        } else {
            hVar2 = hVar;
        }
        o oVarE = B1.f.e(context);
        o oVarA = B1.f.a(context);
        o oVarC = B1.f.c(context);
        Class cls = Integer.TYPE;
        hVar2.a(cls, InputStream.class, oVarE).a(Integer.class, InputStream.class, oVarE).a(cls, AssetFileDescriptor.class, oVarA).a(Integer.class, AssetFileDescriptor.class, oVarA).a(cls, Drawable.class, oVarC).a(Integer.class, Drawable.class, oVarC).a(Uri.class, InputStream.class, t.d(context)).a(Uri.class, AssetFileDescriptor.class, t.c(context));
        s.c cVar = new s.c(resources);
        s.a aVar3 = new s.a(resources);
        s.b bVar2 = new s.b(resources);
        hVar2.a(Integer.class, Uri.class, cVar).a(cls, Uri.class, cVar).a(Integer.class, AssetFileDescriptor.class, aVar3).a(cls, AssetFileDescriptor.class, aVar3).a(Integer.class, InputStream.class, bVar2).a(cls, InputStream.class, bVar2);
        hVar2.a(String.class, InputStream.class, new e.c()).a(Uri.class, InputStream.class, new e.c()).a(String.class, InputStream.class, new v.c()).a(String.class, ParcelFileDescriptor.class, new v.b()).a(String.class, AssetFileDescriptor.class, new v.a()).a(Uri.class, InputStream.class, new a.c(context.getAssets())).a(Uri.class, AssetFileDescriptor.class, new a.b(context.getAssets())).a(Uri.class, InputStream.class, new b.a(context)).a(Uri.class, InputStream.class, new c.a(context));
        if (i10 >= 29) {
            hVar2.a(Uri.class, InputStream.class, new d.c(context));
            hVar2.a(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        boolean zA = eVar.a(c.e.class);
        hVar2.a(Uri.class, InputStream.class, new x.d(contentResolver, zA)).a(Uri.class, ParcelFileDescriptor.class, new x.b(contentResolver, zA)).a(Uri.class, AssetFileDescriptor.class, new x.a(contentResolver, zA)).a(Uri.class, InputStream.class, new y.a()).a(URL.class, InputStream.class, new g.a()).a(Uri.class, File.class, new l.a(context)).a(B1.h.class, InputStream.class, new a.C0021a()).a(byte[].class, ByteBuffer.class, new b.a()).a(byte[].class, InputStream.class, new b.d()).a(Uri.class, Uri.class, w.a.a()).a(Drawable.class, Drawable.class, w.a.a()).b(Drawable.class, Drawable.class, new m()).t(Bitmap.class, BitmapDrawable.class, new I1.b(resources)).t(Bitmap.class, byte[].class, aVar2).t(Drawable.class, byte[].class, new I1.c(dVar, aVar2, dVar2)).t(H1.c.class, byte[].class, dVar2);
        v1.j jVarB = d0.b(dVar);
        hVar2.b(ByteBuffer.class, Bitmap.class, jVarB);
        hVar2.b(ByteBuffer.class, BitmapDrawable.class, new C1931a(resources, jVarB));
    }

    private static void c(Context context, b bVar, h hVar, List list, AppGlideModule appGlideModule) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            K1.a aVar = (K1.a) it.next();
            try {
                aVar.b(context, bVar, hVar);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + aVar.getClass().getName(), e10);
            }
        }
        if (appGlideModule != null) {
            appGlideModule.registerComponents(context, bVar, hVar);
        }
    }

    static f.b d(b bVar, List list, AppGlideModule appGlideModule) {
        return new a(bVar, list, appGlideModule);
    }
}
