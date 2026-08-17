package expo.modules.imagepicker;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AbstractC1627a;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.AbstractC1688p0;
import androidx.core.view.I;
import androidx.core.view.L0;
import androidx.core.view.l1;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageOptions;
import com.canhub.cropper.CropImageView;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.AbstractC2753p;
import i7.C2752o;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lexpo/modules/imagepicker/ExpoCropImageActivity;", "Lcom/canhub/cropper/CropImageActivity;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isNight", "Lcom/canhub/cropper/CropImageOptions;", "options", "Li7/B;", "applyCustomization", "(ZLcom/canhub/cropper/CropImageOptions;)V", "getCropOptions", "()Lcom/canhub/cropper/CropImageOptions;", "Li7/o;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "kotlin.jvm.PlatformType", "invokeSetCustomizations-d1pmJ48", "()Ljava/lang/Object;", "invokeSetCustomizations", "Landroid/view/Menu;", "menu", "tintAllMenuItems", "(Landroid/view/Menu;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "onPrepareOptionsMenu", "Lcom/canhub/cropper/CropImageView;", "cropImageView", "setCropImageView", "(Lcom/canhub/cropper/CropImageView;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "currentIconColor", "I", "cropImageViewRef", "Lcom/canhub/cropper/CropImageView;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoCropImageActivity extends CropImageActivity {
    private CropImageView cropImageViewRef;
    private int currentIconColor = -16777216;

    private final void applyCustomization(boolean isNight, CropImageOptions options) {
        int iIntValue = isNight ? -16777216 : -1;
        int i10 = isNight ? -1 : -16777216;
        ExpoCropImageUtils expoCropImageUtils = ExpoCropImageUtils.INSTANCE;
        Resources.Theme theme = getTheme();
        AbstractC2855l.f(theme, "getTheme(...)");
        Integer themeColor = expoCropImageUtils.getThemeColor(theme, R.attr.expoCropBackButtonIconColor);
        if (themeColor == null) {
            Resources resources = getResources();
            AbstractC2855l.f(resources, "getResources(...)");
            themeColor = expoCropImageUtils.getColorResource(resources, R.color.expoCropBackButtonIconColor);
        }
        Resources.Theme theme2 = getTheme();
        AbstractC2855l.f(theme2, "getTheme(...)");
        Integer themeColor2 = expoCropImageUtils.getThemeColor(theme2, R.attr.expoCropBackgroundColor);
        if (themeColor2 == null) {
            Resources resources2 = getResources();
            AbstractC2855l.f(resources2, "getResources(...)");
            themeColor2 = expoCropImageUtils.getColorResource(resources2, R.color.expoCropBackgroundColor);
        }
        Resources.Theme theme3 = getTheme();
        AbstractC2855l.f(theme3, "getTheme(...)");
        Integer themeColor3 = expoCropImageUtils.getThemeColor(theme3, R.attr.expoCropToolbarActionTextColor);
        if (themeColor3 == null) {
            Resources resources3 = getResources();
            AbstractC2855l.f(resources3, "getResources(...)");
            themeColor3 = expoCropImageUtils.getColorResource(resources3, R.color.expoCropToolbarActionTextColor);
        }
        Resources.Theme theme4 = getTheme();
        AbstractC2855l.f(theme4, "getTheme(...)");
        Integer themeColor4 = expoCropImageUtils.getThemeColor(theme4, R.attr.expoCropToolbarColor);
        if (themeColor4 == null) {
            Resources resources4 = getResources();
            AbstractC2855l.f(resources4, "getResources(...)");
            themeColor4 = expoCropImageUtils.getColorResource(resources4, R.color.expoCropToolbarColor);
        }
        Resources.Theme theme5 = getTheme();
        AbstractC2855l.f(theme5, "getTheme(...)");
        Integer themeColor5 = expoCropImageUtils.getThemeColor(theme5, R.attr.expoCropToolbarIconColor);
        if (themeColor5 == null) {
            Resources resources5 = getResources();
            AbstractC2855l.f(resources5, "getResources(...)");
            themeColor5 = expoCropImageUtils.getColorResource(resources5, R.color.expoCropToolbarIconColor);
        }
        int iIntValue2 = themeColor2 != null ? themeColor2.intValue() : iIntValue;
        if (themeColor4 != null) {
            iIntValue = themeColor4.intValue();
        }
        int iIntValue3 = themeColor5 != null ? themeColor5.intValue() : i10;
        this.currentIconColor = iIntValue3;
        AbstractC1627a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(0.0f);
        }
        options.activityBackgroundColor = iIntValue2;
        options.activityMenuIconColor = iIntValue3;
        if (themeColor3 == null) {
            themeColor3 = Integer.valueOf(i10);
        }
        options.activityMenuTextColor = themeColor3;
        if (themeColor == null) {
            themeColor = Integer.valueOf(iIntValue3);
        }
        options.toolbarBackButtonColor = themeColor;
        options.toolbarColor = Integer.valueOf(iIntValue);
        options.toolbarTitleColor = Integer.valueOf(iIntValue3);
        Window window = getWindow();
        final View view = new View(window.getContext());
        view.setBackgroundColor(iIntValue);
        AbstractC1688p0.a(window);
        l1 l1Var = new l1(window, window.getDecorView());
        l1Var.e(!isNight);
        l1Var.d(!isNight);
        window.getDecorView().setBackgroundColor(iIntValue2);
        window.addContentView(view, new ViewGroup.LayoutParams(-1, 0));
        AbstractC1658a0.w0(window.getDecorView(), new I() { // from class: expo.modules.imagepicker.a
            @Override // androidx.core.view.I
            public final L0 a(View view2, L0 l02) {
                return ExpoCropImageActivity.applyCustomization$lambda$8$lambda$7(view, view2, l02);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 applyCustomization$lambda$8$lambda$7(View view, View view2, L0 insets) {
        AbstractC2855l.g(view2, "<unused var>");
        AbstractC2855l.g(insets, "insets");
        x0.e eVarF = insets.f(L0.p.f() | L0.p.a());
        AbstractC2855l.f(eVarF, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = eVarF.f33238b;
        view.setLayoutParams(layoutParams);
        return insets;
    }

    private final CropImageOptions getCropOptions() {
        Object objB;
        try {
            C2752o.a aVar = C2752o.f28721h;
            Field declaredField = CropImageActivity.class.getDeclaredField("cropImageOptions");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            objB = C2752o.b(obj instanceof CropImageOptions ? (CropImageOptions) obj : null);
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            objB = C2752o.b(AbstractC2753p.a(th));
        }
        return (CropImageOptions) (C2752o.f(objB) ? null : objB);
    }

    /* JADX INFO: renamed from: invokeSetCustomizations-d1pmJ48, reason: not valid java name */
    private final Object m222invokeSetCustomizationsd1pmJ48() {
        try {
            C2752o.a aVar = C2752o.f28721h;
            Method declaredMethod = CropImageActivity.class.getDeclaredMethod("U", null);
            declaredMethod.setAccessible(true);
            return C2752o.b(declaredMethod.invoke(this, null));
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            return C2752o.b(AbstractC2753p.a(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 setCropImageView$lambda$3(View view, L0 insets) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(insets, "insets");
        x0.e eVarF = insets.f(L0.p.g() | L0.p.a());
        AbstractC2855l.f(eVarF, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(eVarF.f33237a, eVarF.f33238b, eVarF.f33239c, eVarF.f33240d);
        view.setLayoutParams(marginLayoutParams);
        return insets;
    }

    private final void tintAllMenuItems(Menu menu) {
        Drawable icon;
        Drawable drawableMutate;
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = menu.getItem(i10);
            if (item != null && (icon = item.getIcon()) != null && (drawableMutate = icon.mutate()) != null) {
                drawableMutate.setTint(this.currentIconColor);
            }
        }
    }

    @Override // com.canhub.cropper.CropImageActivity, androidx.fragment.app.AbstractActivityC1749q, androidx.activity.AbstractActivityC1618q, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws IOException {
        super.onCreate(savedInstanceState);
        CropImageOptions cropOptions = getCropOptions();
        if (cropOptions != null) {
            applyCustomization((getResources().getConfiguration().uiMode & 48) == 32, cropOptions);
            m222invokeSetCustomizationsd1pmJ48();
            invalidateOptionsMenu();
        }
    }

    @Override // com.canhub.cropper.CropImageActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        AbstractC2855l.g(menu, "menu");
        boolean zOnCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        tintAllMenuItems(menu);
        return zOnCreateOptionsMenu;
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.AbstractActivityC1749q, android.app.Activity
    protected void onDestroy() {
        AbstractC1658a0.w0(getWindow().getDecorView(), null);
        CropImageView cropImageView = this.cropImageViewRef;
        if (cropImageView != null) {
            AbstractC1658a0.w0(cropImageView, null);
        }
        this.cropImageViewRef = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        AbstractC2855l.g(menu, "menu");
        boolean zOnPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
        tintAllMenuItems(menu);
        return zOnPrepareOptionsMenu;
    }

    @Override // com.canhub.cropper.CropImageActivity
    public void setCropImageView(CropImageView cropImageView) {
        AbstractC2855l.g(cropImageView, "cropImageView");
        super.setCropImageView(cropImageView);
        this.cropImageViewRef = cropImageView;
        AbstractC1658a0.w0(cropImageView, new I() { // from class: expo.modules.imagepicker.b
            @Override // androidx.core.view.I
            public final L0 a(View view, L0 l02) {
                return ExpoCropImageActivity.setCropImageView$lambda$3(view, l02);
            }
        });
    }
}
