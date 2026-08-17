package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.Y;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: androidx.activity.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1624x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f13874a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f13875b = Color.argb(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 27, 27, 27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static H f13876c;

    public static final void a(AbstractActivityC1618q abstractActivityC1618q, Y statusBarStyle, Y navigationBarStyle) {
        AbstractC2855l.g(abstractActivityC1618q, "<this>");
        AbstractC2855l.g(statusBarStyle, "statusBarStyle");
        AbstractC2855l.g(navigationBarStyle, "navigationBarStyle");
        View decorView = abstractActivityC1618q.getWindow().getDecorView();
        AbstractC2855l.f(decorView, "getDecorView(...)");
        Function1 function1B = statusBarStyle.b();
        Resources resources = decorView.getResources();
        AbstractC2855l.f(resources, "getResources(...)");
        boolean zBooleanValue = ((Boolean) function1B.invoke(resources)).booleanValue();
        Function1 function1B2 = navigationBarStyle.b();
        Resources resources2 = decorView.getResources();
        AbstractC2855l.f(resources2, "getResources(...)");
        boolean zBooleanValue2 = ((Boolean) function1B2.invoke(resources2)).booleanValue();
        H f10 = f13876c;
        if (f10 == null) {
            int i10 = Build.VERSION.SDK_INT;
            f10 = i10 >= 30 ? new F() : i10 >= 29 ? new E() : i10 >= 28 ? new B() : i10 >= 26 ? new C1626z() : new C1625y();
        }
        H h10 = f10;
        Window window = abstractActivityC1618q.getWindow();
        AbstractC2855l.f(window, "getWindow(...)");
        h10.a(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = abstractActivityC1618q.getWindow();
        AbstractC2855l.f(window2, "getWindow(...)");
        h10.b(window2);
    }

    public static /* synthetic */ void b(AbstractActivityC1618q abstractActivityC1618q, Y y10, Y y11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y10 = Y.a.c(Y.f13815e, 0, 0, null, 4, null);
        }
        if ((i10 & 2) != 0) {
            y11 = Y.a.c(Y.f13815e, f13874a, f13875b, null, 4, null);
        }
        a(abstractActivityC1618q, y10, y11);
    }
}
