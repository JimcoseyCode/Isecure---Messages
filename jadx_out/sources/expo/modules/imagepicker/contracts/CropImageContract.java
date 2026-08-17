package expo.modules.imagepicker.contracts;

import D0.c;
import R8.AbstractC1415j;
import R8.N;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.canhub.cropper.CropImage$ActivityResult;
import com.canhub.cropper.CropImageOptions;
import com.canhub.cropper.CropImageView;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.imagepicker.CropShape;
import expo.modules.imagepicker.ExpoCropImageActivity;
import expo.modules.imagepicker.ImagePickerUtilsKt;
import expo.modules.imagepicker.MediaType;
import expo.modules.imagepicker.contracts.ImagePickerContractResult;
import expo.modules.kotlin.activityresult.AppContextActivityResultContract;
import expo.modules.kotlin.providers.AppContextProvider;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2750m;
import i7.t;
import j7.AbstractC2800q;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\"\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lexpo/modules/imagepicker/contracts/CropImageContract;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "Lexpo/modules/imagepicker/contracts/CropImageContractOptions;", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult;", "appContextProvider", "Lexpo/modules/kotlin/providers/AppContextProvider;", "<init>", "(Lexpo/modules/kotlin/providers/AppContextProvider;)V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "intent", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CropImageContract implements AppContextActivityResultContract<CropImageContractOptions, ImagePickerContractResult> {
    private final AppContextProvider appContextProvider;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CropShape.values().length];
            try {
                iArr[CropShape.RECTANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropShape.OVAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: expo.modules.imagepicker.contracts.CropImageContract$parseResult$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.imagepicker.contracts.CropImageContract$parseResult$1", f = "CropImageContract.kt", l = {68}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ ContentResolver $contentResolver;
        final /* synthetic */ CropImageContractOptions $input;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CropImageContractOptions cropImageContractOptions, ContentResolver contentResolver, n7.f fVar) {
            super(2, fVar);
            this.$input = cropImageContractOptions;
            this.$contentResolver = contentResolver;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new AnonymousClass1(this.$input, this.$contentResolver, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                Uri uri = Uri.parse(this.$input.getSourceUri());
                File outputFile = this.$input.getOutputFile();
                ContentResolver contentResolver = this.$contentResolver;
                AbstractC2855l.d(contentResolver);
                this.label = 1;
                if (ImagePickerUtilsKt.copyExifData(uri, outputFile, contentResolver, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            return C2735B.f28704a;
        }
    }

    public CropImageContract(AppContextProvider appContextProvider) {
        AbstractC2855l.g(appContextProvider, "appContextProvider");
        this.appContextProvider = appContextProvider;
    }

    @Override // expo.modules.kotlin.activityresult.AppContextActivityResultContract
    public Intent createIntent(Context context, CropImageContractOptions input) {
        CropImageView.d dVar;
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(input, "input");
        Intent intent = new Intent(context, (Class<?>) ExpoCropImageActivity.class);
        Uri contentUri = ImagePickerUtilsKt.getContentUri(input.getOutputFile(), context);
        Pair pairA = t.a("CROP_IMAGE_EXTRA_SOURCE", Uri.parse(input.getSourceUri()));
        CropImageOptions cropImageOptions = new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 63, null);
        cropImageOptions.outputCompressFormat = input.getCompressFormat();
        cropImageOptions.outputCompressQuality = (int) (input.getOptions().getQuality() * ((double) 100));
        cropImageOptions.customOutputUri = contentUri;
        Pair<Integer, Integer> aspect = input.getOptions().getAspect();
        if (aspect != null) {
            int iIntValue = ((Number) aspect.getFirst()).intValue();
            int iIntValue2 = ((Number) aspect.getSecond()).intValue();
            cropImageOptions.aspectRatioX = iIntValue;
            cropImageOptions.aspectRatioY = iIntValue2;
            cropImageOptions.fixAspectRatio = true;
            cropImageOptions.initialCropWindowPaddingRatio = 0.0f;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[input.getOptions().getShape().ordinal()];
        if (i10 == 1) {
            dVar = CropImageView.d.f19469g;
        } else {
            if (i10 != 2) {
                throw new C2750m();
            }
            dVar = CropImageView.d.f19470h;
        }
        cropImageOptions.cropShape = dVar;
        C2735B c2735b = C2735B.f28704a;
        intent.putExtra("CROP_IMAGE_EXTRA_BUNDLE", c.a(pairA, t.a("CROP_IMAGE_EXTRA_OPTIONS", cropImageOptions)));
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @Override // expo.modules.kotlin.activityresult.AppContextActivityResultContract
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImagePickerContractResult parseResult(CropImageContractOptions input, int resultCode, Intent intent) {
        CropImage$ActivityResult cropImage$ActivityResult;
        AbstractC2855l.g(input, "input");
        if (Build.VERSION.SDK_INT >= 33) {
            cropImage$ActivityResult = intent != null ? (CropImage$ActivityResult) intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT", CropImage$ActivityResult.class) : null;
        } else if (intent != null) {
            cropImage$ActivityResult = (CropImage$ActivityResult) intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT");
        }
        if (resultCode == 0 || cropImage$ActivityResult == null) {
            return ImagePickerContractResult.Cancelled.INSTANCE;
        }
        Uri uriG = cropImage$ActivityResult.g();
        if (uriG == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Context reactContext = this.appContextProvider.getAppContext().getReactContext();
        if (reactContext == null) {
            throw new IllegalArgumentException("React Application Context is null");
        }
        AbstractC1415j.b(null, new AnonymousClass1(input, reactContext.getContentResolver(), null), 1, null);
        return new ImagePickerContractResult.Success(AbstractC2800q.e(t.a(MediaType.IMAGE, uriG)));
    }
}
