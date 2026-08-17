package T6;

import a2.C1592a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import d3.f;
import g2.AbstractC2662a;
import i7.C2735B;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import m2.AbstractC2895b;
import s2.AbstractC3320d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC2895b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f10617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f10618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f10619c;

        a(Context context, Function1 function1, Uri uri) {
            this.f10617a = context;
            this.f10618b = function1;
            this.f10619c = uri;
        }

        @Override // m2.AbstractC2895b
        protected void onFailureImpl(m2.c dataSource) {
            AbstractC2855l.g(dataSource, "dataSource");
            Objects.toString(this.f10619c);
            dataSource.b();
        }

        @Override // m2.AbstractC2895b
        protected void onNewResultImpl(m2.c dataSource) {
            AbstractC2662a abstractC2662a;
            AbstractC2855l.g(dataSource, "dataSource");
            if (dataSource.isFinished() && (abstractC2662a = (AbstractC2662a) dataSource.getResult()) != null) {
                Object objJ = abstractC2662a.J();
                AbstractC2855l.f(objJ, "get(...)");
                d3.e eVar = (d3.e) objJ;
                if (eVar instanceof f) {
                    Bitmap bitmapH0 = ((f) eVar).h0();
                    AbstractC2855l.f(bitmapH0, "getUnderlyingBitmap(...)");
                    Resources resources = this.f10617a.getResources();
                    AbstractC2855l.f(resources, "getResources(...)");
                    this.f10618b.invoke(new BitmapDrawable(resources, bitmapH0));
                }
                abstractC2662a.close();
            }
        }
    }

    public static final void c(Context context, String uri, final com.swmansion.rnscreens.gamma.tabs.a view) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(uri, "uri");
        AbstractC2855l.g(view, "view");
        Uri uriC = new T6.a(context, uri).c(context);
        if (uriC == null) {
            return;
        }
        f(context, uriC, new Function1() { // from class: T6.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.d(view, (Drawable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B d(final com.swmansion.rnscreens.gamma.tabs.a aVar, final Drawable drawable) {
        AbstractC2855l.g(drawable, "drawable");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: T6.d
            @Override // java.lang.Runnable
            public final void run() {
                e.e(aVar, drawable);
            }
        });
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(com.swmansion.rnscreens.gamma.tabs.a aVar, Drawable drawable) {
        aVar.setIcon(drawable);
    }

    private static final void f(Context context, Uri uri, Function1 function1) {
        AbstractC3320d.a().k(com.facebook.imagepipeline.request.c.x(uri).a(), context).c(new a(context, function1, uri), C1592a.d());
    }
}
