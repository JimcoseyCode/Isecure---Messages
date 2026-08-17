package expo.modules.imagepicker;

import android.content.res.Resources;
import android.util.TypedValue;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.AbstractC2753p;
import i7.C2752o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u00060\u0007R\u00020\b2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/imagepicker/ExpoCropImageUtils;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "getThemeColor", PointerEventHelper.POINTER_TYPE_UNKNOWN, "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "attr", "(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;", "getColorResource", "resources", "colorResId", "(Landroid/content/res/Resources;I)Ljava/lang/Integer;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoCropImageUtils {
    public static final ExpoCropImageUtils INSTANCE = new ExpoCropImageUtils();

    private ExpoCropImageUtils() {
    }

    public final Integer getColorResource(Resources resources, int colorResId) {
        Object objB;
        AbstractC2855l.g(resources, "resources");
        try {
            C2752o.a aVar = C2752o.f28721h;
            objB = C2752o.b(Integer.valueOf(resources.getColor(colorResId, null)));
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            objB = C2752o.b(AbstractC2753p.a(th));
        }
        return (Integer) (C2752o.f(objB) ? null : objB);
    }

    public final Integer getThemeColor(Resources.Theme theme, int attr) {
        Object objB;
        AbstractC2855l.g(theme, "theme");
        try {
            C2752o.a aVar = C2752o.f28721h;
            TypedValue typedValue = new TypedValue();
            objB = C2752o.b(theme.resolveAttribute(attr, typedValue, true) ? Integer.valueOf(typedValue.data) : null);
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            objB = C2752o.b(AbstractC2753p.a(th));
        }
        return (Integer) (C2752o.f(objB) ? null : objB);
    }
}
