package com.canhub.cropper;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import androidx.activity.L;
import androidx.activity.U;
import androidx.appcompat.app.AbstractC1627a;
import androidx.appcompat.app.c;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.q;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d.AbstractC2314b;
import d.InterfaceC2313a;
import e.C2380b;
import e.C2388j;
import i7.C2735B;
import i7.C2750m;
import j7.AbstractC2800q;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2853j;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;
import x0.AbstractC3513a;
import x0.EnumC3514b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0017\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002YZB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001c\u0010\u0014J\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b'\u0010(J/\u0010/\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u000e2\u000e\u0010.\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\u0005J\u0017\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020)H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J1\u0010>\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u000e2\u000e\u0010.\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-2\u0006\u0010=\u001a\u000209H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0006H\u0016¢\u0006\u0004\b@\u0010\u0005J1\u0010B\u001a\u00020A2\b\u0010+\u001a\u0004\u0018\u00010\u000e2\u000e\u0010.\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-2\u0006\u0010=\u001a\u000209H\u0016¢\u0006\u0004\bB\u0010CJ'\u0010F\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010D\u001a\u0002092\u0006\u0010E\u001a\u000209H\u0016¢\u0006\u0004\bF\u0010GJ'\u0010H\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010D\u001a\u0002092\u0006\u0010E\u001a\u000209H\u0016¢\u0006\u0004\bH\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u00106\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010R\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010JR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020T0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u000e0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010V¨\u0006["}, d2 = {"Lcom/canhub/cropper/CropImageActivity;", "Landroidx/appcompat/app/d;", "Lcom/canhub/cropper/CropImageView$j;", "Lcom/canhub/cropper/CropImageView$f;", "<init>", "()V", "Li7/B;", "U", "X", "Lcom/canhub/cropper/CropImageActivity$b;", "source", "S", "(Lcom/canhub/cropper/CropImageActivity$b;)V", "R", "Landroid/net/Uri;", "P", "()Landroid/net/Uri;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lkotlin/Function1;", "openSource", "showImageSourceDialog", "(Lkotlin/jvm/functions/Function1;)V", "onStart", "onStop", "outState", "onSaveInstanceState", "Landroid/view/Menu;", "menu", PointerEventHelper.POINTER_TYPE_UNKNOWN, "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "resultUri", "onPickImageResult", "(Landroid/net/Uri;)V", "Lcom/canhub/cropper/CropImageView;", "view", "uri", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "onSetImageUriComplete", "(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V", "Lcom/canhub/cropper/CropImageView$c;", "result", "onCropImageComplete", "(Lcom/canhub/cropper/CropImageView;Lcom/canhub/cropper/CropImageView$c;)V", "cropImage", "cropImageView", "setCropImageView", "(Lcom/canhub/cropper/CropImageView;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "degrees", "rotateImage", "(I)V", "sampleSize", "setResult", "(Landroid/net/Uri;Ljava/lang/Exception;I)V", "setResultCancel", "Landroid/content/Intent;", "getResultIntent", "(Landroid/net/Uri;Ljava/lang/Exception;I)Landroid/content/Intent;", "itemId", ViewProps.COLOR, "updateMenuItemIconColor", "(Landroid/view/Menu;II)V", "updateMenuItemTextColor", "cropImageUri", "Landroid/net/Uri;", "Lcom/canhub/cropper/CropImageOptions;", "cropImageOptions", "Lcom/canhub/cropper/CropImageOptions;", "Lcom/canhub/cropper/CropImageView;", "LS1/a;", "binding", "LS1/a;", "latestTmpUri", "Ld/b;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "pickImageGallery", "Ld/b;", "takePicture", "Companion", "b", "a", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class CropImageActivity extends androidx.appcompat.app.d implements CropImageView.j, CropImageView.f {

    @Deprecated
    public static final String BUNDLE_KEY_TMP_URI = "bundle_key_tmp_uri";
    private static final a Companion = new a(null);
    private S1.a binding;
    private CropImageOptions cropImageOptions;
    private Uri cropImageUri;
    private CropImageView cropImageView;
    private Uri latestTmpUri;
    private final AbstractC2314b pickImageGallery = registerForActivityResult(new C2380b(), new InterfaceC2313a() { // from class: com.canhub.cropper.f
        @Override // d.InterfaceC2313a
        public final void onActivityResult(Object obj) {
            CropImageActivity.T(this.f19610a, (Uri) obj);
        }
    });
    private final AbstractC2314b takePicture = registerForActivityResult(new C2388j(), new InterfaceC2313a() { // from class: com.canhub.cropper.g
        @Override // d.InterfaceC2313a
        public final void onActivityResult(Object obj) {
            CropImageActivity.Y(this.f19611a, ((Boolean) obj).booleanValue());
        }
    });

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f19339g = new b("CAMERA", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f19340h = new b("GALLERY", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ b[] f19341i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f19342j;

        static {
            b[] bVarArrH = h();
            f19341i = bVarArrH;
            f19342j = AbstractC3083a.a(bVarArrH);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] h() {
            return new b[]{f19339g, f19340h};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f19341i.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19343a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f19339g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f19340h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19343a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class d extends AbstractC2853j implements Function1 {
        d(Object obj) {
            super(1, obj, CropImageActivity.class, "openSource", "openSource(Lcom/canhub/cropper/CropImageActivity$Source;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
            j((b) obj);
            return C2735B.f28704a;
        }

        public final void j(b p02) throws IOException {
            AbstractC2855l.g(p02, "p0");
            ((CropImageActivity) this.receiver).S(p02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e implements q.b {
        e() {
        }

        @Override // com.canhub.cropper.q.b
        public void a(Uri uri) {
            CropImageActivity.this.onPickImageResult(uri);
        }

        @Override // com.canhub.cropper.q.b
        public void b() {
            CropImageActivity.this.setResultCancel();
        }
    }

    private final Uri P() throws IOException {
        File fileCreateTempFile = File.createTempFile("tmp_image_file", ".png", getCacheDir());
        fileCreateTempFile.createNewFile();
        fileCreateTempFile.deleteOnExit();
        AbstractC2855l.d(fileCreateTempFile);
        return T1.c.b(this, fileCreateTempFile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B Q(CropImageActivity this$0, L addCallback) {
        AbstractC2855l.g(this$0, "this$0");
        AbstractC2855l.g(addCallback, "$this$addCallback");
        this$0.setResultCancel();
        return C2735B.f28704a;
    }

    private final void R() throws IOException {
        Uri uriP = P();
        this.latestTmpUri = uriP;
        this.takePicture.a(uriP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(b source) throws IOException {
        int i10 = c.f19343a[source.ordinal()];
        if (i10 == 1) {
            R();
        } else {
            if (i10 != 2) {
                throw new C2750m();
            }
            this.pickImageGallery.a("image/*");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(CropImageActivity this$0, Uri uri) {
        AbstractC2855l.g(this$0, "this$0");
        this$0.onPickImageResult(uri);
    }

    private final void U() {
        CropImageOptions cropImageOptions = this.cropImageOptions;
        CropImageOptions cropImageOptions2 = null;
        if (cropImageOptions == null) {
            AbstractC2855l.y("cropImageOptions");
            cropImageOptions = null;
        }
        int i10 = cropImageOptions.activityBackgroundColor;
        S1.a aVar = this.binding;
        if (aVar == null) {
            AbstractC2855l.y("binding");
            aVar = null;
        }
        aVar.b().setBackgroundColor(i10);
        AbstractC1627a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            CropImageOptions cropImageOptions3 = this.cropImageOptions;
            if (cropImageOptions3 == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions3 = null;
            }
            CharSequence charSequence = cropImageOptions3.activityTitle;
            if (charSequence.length() == 0) {
                charSequence = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
            setTitle(charSequence);
            supportActionBar.s(true);
            CropImageOptions cropImageOptions4 = this.cropImageOptions;
            if (cropImageOptions4 == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions4 = null;
            }
            Integer num = cropImageOptions4.toolbarColor;
            if (num != null) {
                supportActionBar.q(new ColorDrawable(num.intValue()));
            }
            CropImageOptions cropImageOptions5 = this.cropImageOptions;
            if (cropImageOptions5 == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions5 = null;
            }
            Integer num2 = cropImageOptions5.toolbarTitleColor;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                SpannableString spannableString = new SpannableString(getTitle());
                spannableString.setSpan(new ForegroundColorSpan(iIntValue), 0, spannableString.length(), 33);
                setTitle(spannableString);
            }
            CropImageOptions cropImageOptions6 = this.cropImageOptions;
            if (cropImageOptions6 == null) {
                AbstractC2855l.y("cropImageOptions");
            } else {
                cropImageOptions2 = cropImageOptions6;
            }
            Integer num3 = cropImageOptions2.toolbarBackButtonColor;
            if (num3 != null) {
                int iIntValue2 = num3.intValue();
                try {
                    Drawable drawableE = androidx.core.content.a.e(this, w.f19663a);
                    if (drawableE != null) {
                        drawableE.setColorFilter(new PorterDuffColorFilter(iIntValue2, PorterDuff.Mode.SRC_ATOP));
                    }
                    supportActionBar.u(drawableE);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean V(CropImageActivity this$0, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        AbstractC2855l.g(this$0, "this$0");
        if (i10 == 4 && keyEvent.getAction() == 1) {
            this$0.setResultCancel();
            this$0.finish();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(Function1 openSource, DialogInterface dialogInterface, int i10) {
        AbstractC2855l.g(openSource, "$openSource");
        openSource.invoke(i10 == 0 ? b.f19339g : b.f19340h);
    }

    private final void X() {
        q qVar = new q(this, new e());
        CropImageOptions cropImageOptions = this.cropImageOptions;
        if (cropImageOptions == null) {
            AbstractC2855l.y("cropImageOptions");
            cropImageOptions = null;
        }
        String str = cropImageOptions.intentChooserTitle;
        if (str != null) {
            if (P8.q.f0(str)) {
                str = null;
            }
            if (str != null) {
                qVar.g(str);
            }
        }
        List list = cropImageOptions.intentChooserPriorityList;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                qVar.h(list);
            }
        }
        qVar.i(cropImageOptions.imageSourceIncludeCamera, cropImageOptions.imageSourceIncludeGallery, cropImageOptions.imageSourceIncludeCamera ? P() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(CropImageActivity this$0, boolean z10) {
        AbstractC2855l.g(this$0, "this$0");
        if (z10) {
            this$0.onPickImageResult(this$0.latestTmpUri);
        } else {
            this$0.onPickImageResult(null);
        }
    }

    public void cropImage() {
        CropImageOptions cropImageOptions = this.cropImageOptions;
        CropImageOptions cropImageOptions2 = null;
        if (cropImageOptions == null) {
            AbstractC2855l.y("cropImageOptions");
            cropImageOptions = null;
        }
        if (cropImageOptions.noOutputImage) {
            setResult(null, null, 1);
            return;
        }
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            CropImageOptions cropImageOptions3 = this.cropImageOptions;
            if (cropImageOptions3 == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions3 = null;
            }
            Bitmap.CompressFormat compressFormat = cropImageOptions3.outputCompressFormat;
            CropImageOptions cropImageOptions4 = this.cropImageOptions;
            if (cropImageOptions4 == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions4 = null;
            }
            int i10 = cropImageOptions4.outputCompressQuality;
            CropImageOptions cropImageOptions5 = this.cropImageOptions;
            if (cropImageOptions5 == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions5 = null;
            }
            int i11 = cropImageOptions5.outputRequestWidth;
            CropImageOptions cropImageOptions6 = this.cropImageOptions;
            if (cropImageOptions6 == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions6 = null;
            }
            int i12 = cropImageOptions6.outputRequestHeight;
            CropImageOptions cropImageOptions7 = this.cropImageOptions;
            if (cropImageOptions7 == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions7 = null;
            }
            CropImageView.k kVar = cropImageOptions7.outputRequestSizeOptions;
            CropImageOptions cropImageOptions8 = this.cropImageOptions;
            if (cropImageOptions8 == null) {
                AbstractC2855l.y("cropImageOptions");
            } else {
                cropImageOptions2 = cropImageOptions8;
            }
            cropImageView.d(compressFormat, i10, i11, i12, kVar, cropImageOptions2.customOutputUri);
        }
    }

    public Intent getResultIntent(Uri uri, Exception error, int sampleSize) {
        CropImageView cropImageView = this.cropImageView;
        Uri imageUri = cropImageView != null ? cropImageView.getImageUri() : null;
        CropImageView cropImageView2 = this.cropImageView;
        float[] cropPoints = cropImageView2 != null ? cropImageView2.getCropPoints() : null;
        CropImageView cropImageView3 = this.cropImageView;
        Rect cropRect = cropImageView3 != null ? cropImageView3.getCropRect() : null;
        CropImageView cropImageView4 = this.cropImageView;
        int mDegreesRotated = cropImageView4 != null ? cropImageView4.getMDegreesRotated() : 0;
        CropImageView cropImageView5 = this.cropImageView;
        CropImage$ActivityResult cropImage$ActivityResult = new CropImage$ActivityResult(imageUri, uri, error, cropPoints, cropRect, mDegreesRotated, cropImageView5 != null ? cropImageView5.getWholeImageRect() : null, sampleSize);
        Intent intent = new Intent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", cropImage$ActivityResult);
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    @Override // androidx.fragment.app.AbstractActivityC1749q, androidx.activity.AbstractActivityC1618q, androidx.core.app.h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle savedInstanceState) throws IOException {
        Uri uri;
        CropImageOptions cropImageOptions;
        super.onCreate(savedInstanceState);
        S1.a aVarC = S1.a.c(getLayoutInflater());
        this.binding = aVarC;
        CropImageOptions cropImageOptions2 = null;
        if (aVarC == null) {
            AbstractC2855l.y("binding");
            aVarC = null;
        }
        setContentView(aVarC.b());
        S1.a aVar = this.binding;
        if (aVar == null) {
            AbstractC2855l.y("binding");
            aVar = null;
        }
        CropImageView cropImageView = aVar.f10250b;
        AbstractC2855l.f(cropImageView, "cropImageView");
        setCropImageView(cropImageView);
        Bundle bundleExtra = getIntent().getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
        if (bundleExtra != null) {
            Parcelable parcelable = bundleExtra.getParcelable("CROP_IMAGE_EXTRA_SOURCE");
            if (!(parcelable instanceof Uri)) {
                parcelable = null;
            }
            uri = (Uri) parcelable;
        } else {
            uri = null;
        }
        this.cropImageUri = uri;
        if (bundleExtra != null) {
            Parcelable parcelable2 = bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
            if (!(parcelable2 instanceof CropImageOptions)) {
                parcelable2 = null;
            }
            cropImageOptions = (CropImageOptions) parcelable2;
            if (cropImageOptions == null) {
                cropImageOptions = new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 63, null);
            }
        }
        this.cropImageOptions = cropImageOptions;
        if (savedInstanceState == null) {
            Uri uri2 = this.cropImageUri;
            if (uri2 == null || AbstractC2855l.b(uri2, Uri.EMPTY)) {
                CropImageOptions cropImageOptions3 = this.cropImageOptions;
                if (cropImageOptions3 == null) {
                    AbstractC2855l.y("cropImageOptions");
                    cropImageOptions3 = null;
                }
                if (cropImageOptions3.showIntentChooser) {
                    X();
                } else {
                    CropImageOptions cropImageOptions4 = this.cropImageOptions;
                    if (cropImageOptions4 == null) {
                        AbstractC2855l.y("cropImageOptions");
                        cropImageOptions4 = null;
                    }
                    if (cropImageOptions4.imageSourceIncludeGallery) {
                        CropImageOptions cropImageOptions5 = this.cropImageOptions;
                        if (cropImageOptions5 == null) {
                            AbstractC2855l.y("cropImageOptions");
                            cropImageOptions5 = null;
                        }
                        if (cropImageOptions5.imageSourceIncludeCamera) {
                            showImageSourceDialog(new d(this));
                        }
                    } else {
                        CropImageOptions cropImageOptions6 = this.cropImageOptions;
                        if (cropImageOptions6 == null) {
                            AbstractC2855l.y("cropImageOptions");
                            cropImageOptions6 = null;
                        }
                        if (cropImageOptions6.imageSourceIncludeGallery) {
                            this.pickImageGallery.a("image/*");
                        } else {
                            CropImageOptions cropImageOptions7 = this.cropImageOptions;
                            if (cropImageOptions7 == null) {
                                AbstractC2855l.y("cropImageOptions");
                            } else {
                                cropImageOptions2 = cropImageOptions7;
                            }
                            if (cropImageOptions2.imageSourceIncludeCamera) {
                                R();
                            } else {
                                finish();
                            }
                        }
                    }
                }
            } else {
                CropImageView cropImageView2 = this.cropImageView;
                if (cropImageView2 != null) {
                    cropImageView2.setImageUriAsync(this.cropImageUri);
                }
            }
        } else {
            String string = savedInstanceState.getString(BUNDLE_KEY_TMP_URI);
            this.latestTmpUri = string != null ? Uri.parse(string) : null;
        }
        U();
        U.b(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.canhub.cropper.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CropImageActivity.Q(this.f19614g, (L) obj);
            }
        }, 3, null);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Drawable drawableE;
        CropImageOptions cropImageOptions;
        AbstractC2855l.g(menu, "menu");
        CropImageOptions cropImageOptions2 = this.cropImageOptions;
        CropImageOptions cropImageOptions3 = null;
        if (cropImageOptions2 == null) {
            AbstractC2855l.y("cropImageOptions");
            cropImageOptions2 = null;
        }
        if (cropImageOptions2.skipEditing) {
            return true;
        }
        getMenuInflater().inflate(z.f19675a, menu);
        CropImageOptions cropImageOptions4 = this.cropImageOptions;
        if (cropImageOptions4 == null) {
            AbstractC2855l.y("cropImageOptions");
            cropImageOptions4 = null;
        }
        if (cropImageOptions4.allowRotation) {
            CropImageOptions cropImageOptions5 = this.cropImageOptions;
            if (cropImageOptions5 == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions5 = null;
            }
            if (cropImageOptions5.allowCounterRotation) {
                menu.findItem(x.f19671h).setVisible(true);
            }
        } else {
            menu.removeItem(x.f19671h);
            menu.removeItem(x.f19672i);
        }
        CropImageOptions cropImageOptions6 = this.cropImageOptions;
        if (cropImageOptions6 == null) {
            AbstractC2855l.y("cropImageOptions");
            cropImageOptions6 = null;
        }
        if (!cropImageOptions6.allowFlipping) {
            menu.removeItem(x.f19668e);
        }
        CropImageOptions cropImageOptions7 = this.cropImageOptions;
        if (cropImageOptions7 == null) {
            AbstractC2855l.y("cropImageOptions");
            cropImageOptions7 = null;
        }
        if (cropImageOptions7.cropMenuCropButtonTitle != null) {
            MenuItem menuItemFindItem = menu.findItem(x.f19667d);
            CropImageOptions cropImageOptions8 = this.cropImageOptions;
            if (cropImageOptions8 == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions8 = null;
            }
            menuItemFindItem.setTitle(cropImageOptions8.cropMenuCropButtonTitle);
        }
        try {
            cropImageOptions = this.cropImageOptions;
            if (cropImageOptions == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions = null;
            }
        } catch (Exception unused) {
        }
        if (cropImageOptions.cropMenuCropButtonIcon != 0) {
            CropImageOptions cropImageOptions9 = this.cropImageOptions;
            if (cropImageOptions9 == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions9 = null;
            }
            drawableE = androidx.core.content.a.e(this, cropImageOptions9.cropMenuCropButtonIcon);
            try {
                menu.findItem(x.f19667d).setIcon(drawableE);
            } catch (Exception unused2) {
            }
        } else {
            drawableE = null;
        }
        CropImageOptions cropImageOptions10 = this.cropImageOptions;
        if (cropImageOptions10 == null) {
            AbstractC2855l.y("cropImageOptions");
            cropImageOptions10 = null;
        }
        if (cropImageOptions10.activityMenuIconColor != 0) {
            int i10 = x.f19671h;
            CropImageOptions cropImageOptions11 = this.cropImageOptions;
            if (cropImageOptions11 == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions11 = null;
            }
            updateMenuItemIconColor(menu, i10, cropImageOptions11.activityMenuIconColor);
            int i11 = x.f19672i;
            CropImageOptions cropImageOptions12 = this.cropImageOptions;
            if (cropImageOptions12 == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions12 = null;
            }
            updateMenuItemIconColor(menu, i11, cropImageOptions12.activityMenuIconColor);
            int i12 = x.f19668e;
            CropImageOptions cropImageOptions13 = this.cropImageOptions;
            if (cropImageOptions13 == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions13 = null;
            }
            updateMenuItemIconColor(menu, i12, cropImageOptions13.activityMenuIconColor);
            if (drawableE != null) {
                int i13 = x.f19667d;
                CropImageOptions cropImageOptions14 = this.cropImageOptions;
                if (cropImageOptions14 == null) {
                    AbstractC2855l.y("cropImageOptions");
                    cropImageOptions14 = null;
                }
                updateMenuItemIconColor(menu, i13, cropImageOptions14.activityMenuIconColor);
            }
        }
        CropImageOptions cropImageOptions15 = this.cropImageOptions;
        if (cropImageOptions15 == null) {
            AbstractC2855l.y("cropImageOptions");
        } else {
            cropImageOptions3 = cropImageOptions15;
        }
        Integer num = cropImageOptions3.activityMenuTextColor;
        if (num != null) {
            int iIntValue = num.intValue();
            Iterator it = AbstractC2800q.m(Integer.valueOf(x.f19671h), Integer.valueOf(x.f19672i), Integer.valueOf(x.f19668e), Integer.valueOf(x.f19669f), Integer.valueOf(x.f19670g), Integer.valueOf(x.f19667d)).iterator();
            while (it.hasNext()) {
                updateMenuItemTextColor(menu, ((Number) it.next()).intValue(), iIntValue);
            }
        }
        return true;
    }

    @Override // com.canhub.cropper.CropImageView.f
    public void onCropImageComplete(CropImageView view, CropImageView.c result) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(result, "result");
        setResult(result.g(), result.c(), result.f());
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        AbstractC2855l.g(item, "item");
        int itemId = item.getItemId();
        if (itemId == x.f19667d) {
            cropImage();
            return true;
        }
        CropImageOptions cropImageOptions = null;
        if (itemId == x.f19671h) {
            CropImageOptions cropImageOptions2 = this.cropImageOptions;
            if (cropImageOptions2 == null) {
                AbstractC2855l.y("cropImageOptions");
            } else {
                cropImageOptions = cropImageOptions2;
            }
            rotateImage(-cropImageOptions.rotationDegrees);
            return true;
        }
        if (itemId == x.f19672i) {
            CropImageOptions cropImageOptions3 = this.cropImageOptions;
            if (cropImageOptions3 == null) {
                AbstractC2855l.y("cropImageOptions");
            } else {
                cropImageOptions = cropImageOptions3;
            }
            rotateImage(cropImageOptions.rotationDegrees);
            return true;
        }
        if (itemId == x.f19669f) {
            CropImageView cropImageView = this.cropImageView;
            if (cropImageView != null) {
                cropImageView.e();
            }
            return true;
        }
        if (itemId == x.f19670g) {
            CropImageView cropImageView2 = this.cropImageView;
            if (cropImageView2 != null) {
                cropImageView2.f();
            }
            return true;
        }
        if (itemId != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        setResultCancel();
        return true;
    }

    protected void onPickImageResult(Uri resultUri) {
        if (resultUri == null) {
            setResultCancel();
            return;
        }
        this.cropImageUri = resultUri;
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            cropImageView.setImageUriAsync(resultUri);
        }
    }

    @Override // androidx.activity.AbstractActivityC1618q, androidx.core.app.h, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        AbstractC2855l.g(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString(BUNDLE_KEY_TMP_URI, String.valueOf(this.latestTmpUri));
    }

    @Override // com.canhub.cropper.CropImageView.j
    public void onSetImageUriComplete(CropImageView view, Uri uri, Exception error) {
        CropImageView cropImageView;
        CropImageView cropImageView2;
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(uri, "uri");
        CropImageOptions cropImageOptions = null;
        if (error != null) {
            setResult(null, error, 1);
            return;
        }
        CropImageOptions cropImageOptions2 = this.cropImageOptions;
        if (cropImageOptions2 == null) {
            AbstractC2855l.y("cropImageOptions");
            cropImageOptions2 = null;
        }
        if (cropImageOptions2.initialCropWindowRectangle != null && (cropImageView2 = this.cropImageView) != null) {
            CropImageOptions cropImageOptions3 = this.cropImageOptions;
            if (cropImageOptions3 == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions3 = null;
            }
            cropImageView2.setCropRect(cropImageOptions3.initialCropWindowRectangle);
        }
        CropImageOptions cropImageOptions4 = this.cropImageOptions;
        if (cropImageOptions4 == null) {
            AbstractC2855l.y("cropImageOptions");
            cropImageOptions4 = null;
        }
        if (cropImageOptions4.initialRotation > 0 && (cropImageView = this.cropImageView) != null) {
            CropImageOptions cropImageOptions5 = this.cropImageOptions;
            if (cropImageOptions5 == null) {
                AbstractC2855l.y("cropImageOptions");
                cropImageOptions5 = null;
            }
            cropImageView.setRotatedDegrees(cropImageOptions5.initialRotation);
        }
        CropImageOptions cropImageOptions6 = this.cropImageOptions;
        if (cropImageOptions6 == null) {
            AbstractC2855l.y("cropImageOptions");
        } else {
            cropImageOptions = cropImageOptions6;
        }
        if (cropImageOptions.skipEditing) {
            cropImage();
        }
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.AbstractActivityC1749q, android.app.Activity
    public void onStart() {
        super.onStart();
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(this);
        }
        CropImageView cropImageView2 = this.cropImageView;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(this);
        }
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.AbstractActivityC1749q, android.app.Activity
    public void onStop() {
        super.onStop();
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(null);
        }
        CropImageView cropImageView2 = this.cropImageView;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(null);
        }
    }

    public void rotateImage(int degrees) {
        CropImageView cropImageView = this.cropImageView;
        if (cropImageView != null) {
            cropImageView.m(degrees);
        }
    }

    public void setCropImageView(CropImageView cropImageView) {
        AbstractC2855l.g(cropImageView, "cropImageView");
        this.cropImageView = cropImageView;
    }

    public void setResult(Uri uri, Exception error, int sampleSize) {
        setResult(error != null ? 204 : -1, getResultIntent(uri, error, sampleSize));
        finish();
    }

    public void setResultCancel() {
        setResult(0);
        finish();
    }

    public void showImageSourceDialog(final Function1 openSource) {
        AbstractC2855l.g(openSource, "openSource");
        new c.a(this).d(false).k(new DialogInterface.OnKeyListener() { // from class: com.canhub.cropper.h
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                return CropImageActivity.V(this.f19612g, dialogInterface, i10, keyEvent);
            }
        }).n(A.f19295b).g(new String[]{getString(A.f19294a), getString(A.f19296c)}, new DialogInterface.OnClickListener() { // from class: com.canhub.cropper.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CropImageActivity.W(openSource, dialogInterface, i10);
            }
        }).q();
    }

    public void updateMenuItemIconColor(Menu menu, int itemId, int color) {
        Drawable icon;
        AbstractC2855l.g(menu, "menu");
        MenuItem menuItemFindItem = menu.findItem(itemId);
        if (menuItemFindItem == null || (icon = menuItemFindItem.getIcon()) == null) {
            return;
        }
        try {
            icon.mutate();
            icon.setColorFilter(AbstractC3513a.a(color, EnumC3514b.SRC_ATOP));
            menuItemFindItem.setIcon(icon);
        } catch (Exception unused) {
        }
    }

    public void updateMenuItemTextColor(Menu menu, int itemId, int color) {
        CharSequence title;
        AbstractC2855l.g(menu, "menu");
        MenuItem menuItemFindItem = menu.findItem(itemId);
        if (menuItemFindItem == null || (title = menuItemFindItem.getTitle()) == null || !(!P8.q.f0(title))) {
            return;
        }
        try {
            SpannableString spannableString = new SpannableString(title);
            spannableString.setSpan(new ForegroundColorSpan(color), 0, spannableString.length(), 33);
            menuItemFindItem.setTitle(spannableString);
        } catch (Exception unused) {
        }
    }
}
