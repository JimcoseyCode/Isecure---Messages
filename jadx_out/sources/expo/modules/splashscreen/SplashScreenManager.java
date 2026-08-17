package expo.modules.splashscreen;

import F0.g;
import F0.r;
import F0.s;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0003R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lexpo/modules/splashscreen/SplashScreenManager;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lexpo/modules/splashscreen/SplashScreenOptions;", "options", "Li7/B;", "configureSplashScreen", "(Lexpo/modules/splashscreen/SplashScreenOptions;)V", "Landroid/app/Activity;", "activity", "registerOnActivity", "(Landroid/app/Activity;)V", "hide", "setSplashScreenOptions", "unregisterContentAppearedListener", PointerEventHelper.POINTER_TYPE_UNKNOWN, "keepSplashScreenOnScreen", "Z", "preventAutoHideCalled", "getPreventAutoHideCalled", "()Z", "setPreventAutoHideCalled", "(Z)V", "LF0/g;", "splashScreen", "LF0/g;", "Lcom/facebook/react/bridge/ReactMarker$MarkerListener;", "contentAppearedListener", "Lcom/facebook/react/bridge/ReactMarker$MarkerListener;", "expo-splash-screen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SplashScreenManager {
    private static boolean preventAutoHideCalled;
    private static g splashScreen;
    public static final SplashScreenManager INSTANCE = new SplashScreenManager();
    private static boolean keepSplashScreenOnScreen = true;
    private static final ReactMarker.MarkerListener contentAppearedListener = new ReactMarker.MarkerListener() { // from class: expo.modules.splashscreen.b
        @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
        public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
            SplashScreenManager.contentAppearedListener$lambda$0(reactMarkerConstants, str, i10);
        }
    };

    private SplashScreenManager() {
    }

    private final void configureSplashScreen(SplashScreenOptions options) {
        if (splashScreen == null) {
            return;
        }
        final long duration = options.getDuration();
        g gVar = splashScreen;
        if (gVar == null) {
            AbstractC2855l.y("splashScreen");
            gVar = null;
        }
        gVar.c(new g.e() { // from class: expo.modules.splashscreen.a
            @Override // F0.g.e
            public final void a(s sVar) {
                SplashScreenManager.configureSplashScreen$lambda$2(duration, sVar);
            }
        });
    }

    static /* synthetic */ void configureSplashScreen$default(SplashScreenManager splashScreenManager, SplashScreenOptions splashScreenOptions, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            splashScreenOptions = new SplashScreenOptions();
        }
        splashScreenManager.configureSplashScreen(splashScreenOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureSplashScreen$lambda$2(long j10, final s splashScreenViewProvider) {
        AbstractC2855l.g(splashScreenViewProvider, "splashScreenViewProvider");
        final View viewA = splashScreenViewProvider.a();
        viewA.animate().setDuration(j10).alpha(0.0f).setInterpolator(new AccelerateInterpolator()).withEndAction(new Runnable() { // from class: expo.modules.splashscreen.c
            @Override // java.lang.Runnable
            public final void run() {
                SplashScreenManager.configureSplashScreen$lambda$2$lambda$1(splashScreenViewProvider, viewA);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureSplashScreen$lambda$2$lambda$1(s sVar, View view) {
        if (Build.VERSION.SDK_INT < 31) {
            sVar.b();
        } else {
            AbstractC2855l.e(view, "null cannot be cast to non-null type android.window.SplashScreenView");
            r.a(view).remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void contentAppearedListener$lambda$0(ReactMarkerConstants name, String str, int i10) {
        AbstractC2855l.g(name, "name");
        if (name != ReactMarkerConstants.CONTENT_APPEARED || preventAutoHideCalled) {
            return;
        }
        INSTANCE.hide();
    }

    public final boolean getPreventAutoHideCalled() {
        return preventAutoHideCalled;
    }

    public final void hide() {
        keepSplashScreenOnScreen = false;
    }

    public final void registerOnActivity(Activity activity) {
        AbstractC2855l.g(activity, "activity");
        splashScreen = g.f1767b.a(activity);
        ReactMarker.addListener(contentAppearedListener);
        final View viewFindViewById = activity.findViewById(android.R.id.content);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: expo.modules.splashscreen.SplashScreenManager.registerOnActivity.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (SplashScreenManager.keepSplashScreenOnScreen) {
                    return false;
                }
                viewFindViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
        configureSplashScreen$default(this, null, 1, null);
    }

    public final void setPreventAutoHideCalled(boolean z10) {
        preventAutoHideCalled = z10;
    }

    public final void setSplashScreenOptions(SplashScreenOptions options) {
        AbstractC2855l.g(options, "options");
        configureSplashScreen(options);
    }

    public final void unregisterContentAppearedListener() {
        ReactMarker.removeListener(contentAppearedListener);
    }
}
