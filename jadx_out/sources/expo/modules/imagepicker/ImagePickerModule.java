package expo.modules.imagepicker;

import C7.o;
import R8.AbstractC1413i;
import R8.C1404d0;
import R8.C1425o;
import R8.InterfaceC1421m;
import R8.N;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.OperationCanceledException;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.imagepicker.contracts.CameraContractOptions;
import expo.modules.imagepicker.contracts.CropImageContractOptions;
import expo.modules.imagepicker.contracts.ImageLibraryContractOptions;
import expo.modules.imagepicker.contracts.ImagePickerContractResult;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.interfaces.permissions.PermissionsResponseListener;
import expo.modules.interfaces.permissions.PermissionsStatus;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.activityresult.AppContextActivityResultLauncher;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.C2750m;
import i7.C2752o;
import j7.AbstractC2800q;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import o7.AbstractC3016b;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\u0010\u001a\u00020\f2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u0017\u001a\u00020\u00162\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000b0)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u000b0)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010,R\"\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000b0)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010,R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010=\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lexpo/modules/imagepicker/ImagePickerModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/interfaces/permissions/PermissionsResponseListener;", "createPermissionsDecorator", "(Lexpo/modules/kotlin/Promise;)Lexpo/modules/interfaces/permissions/PermissionsResponseListener;", "Lkotlin/Function1;", "Ln7/f;", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "pickerLauncher", "Lexpo/modules/imagepicker/ImagePickerOptions;", "options", "launchContract", "(Lkotlin/jvm/functions/Function1;Lexpo/modules/imagepicker/ImagePickerOptions;Ln7/f;)Ljava/lang/Object;", "result", "Li7/B;", "handleResultUponActivityDestruction", "(Lexpo/modules/imagepicker/contracts/ImagePickerContractResult;Lexpo/modules/imagepicker/ImagePickerOptions;)V", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult$Success;", "launchPicker", "(Lkotlin/jvm/functions/Function1;Ln7/f;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "writeOnly", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getMediaLibraryPermissions", "(Z)[Ljava/lang/String;", "ensureTargetActivityIsAvailable", "(Lexpo/modules/imagepicker/ImagePickerOptions;)V", "ensureCameraPermissionsAreGranted", "(Ln7/f;)Ljava/lang/Object;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Lexpo/modules/imagepicker/MediaHandler;", "mediaHandler", "Lexpo/modules/imagepicker/MediaHandler;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Lexpo/modules/imagepicker/contracts/CameraContractOptions;", "cameraLauncher", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Lexpo/modules/imagepicker/contracts/ImageLibraryContractOptions;", "imageLibraryLauncher", "Lexpo/modules/imagepicker/contracts/CropImageContractOptions;", "cropImageLauncher", "Lexpo/modules/imagepicker/PendingMediaPickingResult;", "pendingMediaPickingResult", "Lexpo/modules/imagepicker/PendingMediaPickingResult;", "isPickerOpen", "Z", "Ljava/io/File;", "getCacheDirectory", "()Ljava/io/File;", "cacheDirectory", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImagePickerModule extends Module {
    private AppContextActivityResultLauncher<CameraContractOptions, ImagePickerContractResult> cameraLauncher;
    private AppContextActivityResultLauncher<CropImageContractOptions, ImagePickerContractResult> cropImageLauncher;
    private AppContextActivityResultLauncher<ImageLibraryContractOptions, ImagePickerContractResult> imageLibraryLauncher;
    private boolean isPickerOpen;
    private final MediaHandler mediaHandler = new MediaHandler(this);
    private PendingMediaPickingResult pendingMediaPickingResult;

    /* JADX INFO: renamed from: expo.modules.imagepicker.ImagePickerModule$launchContract$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.imagepicker.ImagePickerModule", f = "ImagePickerModule.kt", l = {JfifUtil.MARKER_RST0, 219, 223}, m = "launchContract")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return ImagePickerModule.this.launchContract(null, null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.imagepicker.ImagePickerModule$launchContract$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.imagepicker.ImagePickerModule$launchContract$2", f = "ImagePickerModule.kt", l = {220}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass2 extends l implements Function1 {
        final /* synthetic */ Bitmap.CompressFormat $compressFormat;
        final /* synthetic */ ImagePickerOptions $options;
        final /* synthetic */ File $outputFile;
        final /* synthetic */ Uri $sourceUri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Uri uri, ImagePickerOptions imagePickerOptions, File file, Bitmap.CompressFormat compressFormat, n7.f fVar) {
            super(1, fVar);
            this.$sourceUri = uri;
            this.$options = imagePickerOptions;
            this.$outputFile = file;
            this.$compressFormat = compressFormat;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(n7.f fVar) {
            return ImagePickerModule.this.new AnonymousClass2(this.$sourceUri, this.$options, this.$outputFile, this.$compressFormat, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            AppContextActivityResultLauncher appContextActivityResultLauncher = ImagePickerModule.this.cropImageLauncher;
            if (appContextActivityResultLauncher == null) {
                AbstractC2855l.y("cropImageLauncher");
                appContextActivityResultLauncher = null;
            }
            String string = this.$sourceUri.toString();
            AbstractC2855l.f(string, "toString(...)");
            CropImageContractOptions cropImageContractOptions = new CropImageContractOptions(string, this.$options, this.$outputFile, this.$compressFormat);
            this.label = 1;
            Object objLaunch = appContextActivityResultLauncher.launch(cropImageContractOptions, this);
            return objLaunch == objE ? objE : objLaunch;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(n7.f fVar) {
            return ((AnonymousClass2) create(fVar)).invokeSuspend(C2735B.f28704a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.imagepicker.ImagePickerModule$launchPicker$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.imagepicker.ImagePickerModule$launchPicker$2", f = "ImagePickerModule.kt", l = {247}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Lexpo/modules/imagepicker/contracts/ImagePickerContractResult$Success;", "<anonymous>", "(LR8/N;)Lexpo/modules/imagepicker/contracts/ImagePickerContractResult$Success;"}, k = 3, mv = {2, 1, 0})
    static final class C24752 extends l implements Function2 {
        final /* synthetic */ Function1 $pickerLauncher;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24752(Function1 function1, n7.f fVar) {
            super(2, fVar);
            this.$pickerLauncher = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return new C24752(this.$pickerLauncher, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24752) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws FailedToPickMediaException {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                Function1 function1 = this.$pickerLauncher;
                this.label = 1;
                obj = function1.invoke(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            ImagePickerContractResult imagePickerContractResult = (ImagePickerContractResult) obj;
            if (imagePickerContractResult instanceof ImagePickerContractResult.Success) {
                return (ImagePickerContractResult.Success) imagePickerContractResult;
            }
            if (imagePickerContractResult instanceof ImagePickerContractResult.Cancelled) {
                throw new OperationCanceledException();
            }
            if (imagePickerContractResult instanceof ImagePickerContractResult.Error) {
                throw new FailedToPickMediaException();
            }
            throw new C2750m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PermissionsResponseListener createPermissionsDecorator(final Promise promise) {
        final WeakReference weakReferenceWeak = UtilsKt.weak(getAppContext().getReactContext());
        return new PermissionsResponseListener() { // from class: expo.modules.imagepicker.c
            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map map) {
                ImagePickerModule.createPermissionsDecorator$lambda$14(promise, weakReferenceWeak, this, map);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createPermissionsDecorator$lambda$14(Promise promise, WeakReference weakReference, ImagePickerModule imagePickerModule, Map map) {
        boolean z10;
        boolean z11;
        AbstractC2855l.d(map);
        boolean z12 = false;
        if (map.isEmpty()) {
            z10 = true;
        } else {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (((PermissionsResponse) ((Map.Entry) it.next()).getValue()).getStatus() != PermissionsStatus.GRANTED) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
        }
        if (map.isEmpty()) {
            z11 = false;
            break;
        }
        if (!map.isEmpty()) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                if (((PermissionsResponse) ((Map.Entry) it2.next()).getValue()).getStatus() != PermissionsStatus.DENIED) {
                    z11 = false;
                    break;
                }
            }
        }
        z11 = true;
        if (map.isEmpty()) {
            z12 = true;
        } else {
            Iterator it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                if (!((PermissionsResponse) ((Map.Entry) it3.next()).getValue()).getCanAskAgain()) {
                    break;
                }
            }
            z12 = true;
        }
        Bundle bundle = new Bundle();
        bundle.putString(PermissionsResponse.EXPIRES_KEY, "never");
        bundle.putString(PermissionsResponse.STATUS_KEY, z10 ? PermissionsStatus.GRANTED.getStatus() : z11 ? PermissionsStatus.DENIED.getStatus() : PermissionsStatus.UNDETERMINED.getStatus());
        bundle.putBoolean(PermissionsResponse.CAN_ASK_AGAIN_KEY, z12);
        bundle.putBoolean(PermissionsResponse.GRANTED_KEY, z10);
        if (z10) {
            bundle.putString("accessPrivileges", "all");
            promise.resolve(bundle);
            return;
        }
        if (Build.VERSION.SDK_INT < 34) {
            bundle.putString("accessPrivileges", "none");
            promise.resolve(bundle);
            return;
        }
        Context context = (Context) weakReference.get();
        if (context == null) {
            promise.reject(new Exceptions.ReactContextLost());
            return;
        }
        if (androidx.core.content.a.a(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
            bundle.putBoolean(PermissionsResponse.GRANTED_KEY, true);
            bundle.putBoolean(PermissionsResponse.CAN_ASK_AGAIN_KEY, true);
            bundle.putString(PermissionsResponse.STATUS_KEY, PermissionsStatus.GRANTED.getStatus());
            bundle.putString("accessPrivileges", "limited");
        } else {
            bundle.putString("accessPrivileges", "none");
        }
        promise.resolve(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ensureCameraPermissionsAreGranted(n7.f fVar) {
        final C1425o c1425o = new C1425o(AbstractC3016b.c(fVar), 1);
        c1425o.F();
        Permissions permissions = getAppContext().getPermissions();
        if (permissions == null) {
            C2752o.a aVar = C2752o.f28721h;
            c1425o.resumeWith(C2752o.b(AbstractC2753p.a(new Exceptions.ModuleNotFound(D.b(Permissions.class)))));
        } else {
            PermissionsResponseListener permissionsResponseListener = new PermissionsResponseListener() { // from class: expo.modules.imagepicker.ImagePickerModule$ensureCameraPermissionsAreGranted$2$1
                @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
                public final void onResult(Map<String, PermissionsResponse> map) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        PermissionsResponse permissionsResponse = map.get("android.permission.CAMERA");
                        if ((permissionsResponse != null ? permissionsResponse.getStatus() : null) == PermissionsStatus.GRANTED) {
                            InterfaceC1421m interfaceC1421m = c1425o;
                            C2752o.a aVar2 = C2752o.f28721h;
                            interfaceC1421m.resumeWith(C2752o.b(C2735B.f28704a));
                            return;
                        } else {
                            InterfaceC1421m interfaceC1421m2 = c1425o;
                            C2752o.a aVar3 = C2752o.f28721h;
                            interfaceC1421m2.resumeWith(C2752o.b(AbstractC2753p.a(new UserRejectedPermissionsException())));
                            return;
                        }
                    }
                    PermissionsResponse permissionsResponse2 = map.get("android.permission.WRITE_EXTERNAL_STORAGE");
                    PermissionsStatus status = permissionsResponse2 != null ? permissionsResponse2.getStatus() : null;
                    PermissionsStatus permissionsStatus = PermissionsStatus.GRANTED;
                    if (status == permissionsStatus) {
                        PermissionsResponse permissionsResponse3 = map.get("android.permission.CAMERA");
                        if ((permissionsResponse3 != null ? permissionsResponse3.getStatus() : null) == permissionsStatus) {
                            InterfaceC1421m interfaceC1421m3 = c1425o;
                            C2752o.a aVar4 = C2752o.f28721h;
                            interfaceC1421m3.resumeWith(C2752o.b(C2735B.f28704a));
                            return;
                        }
                    }
                    InterfaceC1421m interfaceC1421m4 = c1425o;
                    C2752o.a aVar5 = C2752o.f28721h;
                    interfaceC1421m4.resumeWith(C2752o.b(AbstractC2753p.a(new UserRejectedPermissionsException())));
                }
            };
            String[] strArr = (String[]) AbstractC2800q.o(Build.VERSION.SDK_INT < 29 ? "android.permission.WRITE_EXTERNAL_STORAGE" : null, "android.permission.CAMERA").toArray(new String[0]);
            permissions.askForPermissions(permissionsResponseListener, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        Object objZ = c1425o.z();
        if (objZ == AbstractC3016b.e()) {
            h.c(fVar);
        }
        return objZ == AbstractC3016b.e() ? objZ : C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureTargetActivityIsAvailable(ImagePickerOptions options) throws MissingActivityToHandleIntent {
        Intent intent = new Intent(options.getNativeMediaTypes().toCameraIntentAction());
        if (intent.resolveActivity(getAppContext().getThrowingActivity().getApplication().getPackageManager()) == null) {
            throw new MissingActivityToHandleIntent(intent.getType());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getCacheDirectory() {
        return getAppContext().getCacheDirectory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String[] getMediaLibraryPermissions(boolean writeOnly) {
        if (Build.VERSION.SDK_INT >= 33) {
            return new String[0];
        }
        return (String[]) AbstractC2800q.o("android.permission.WRITE_EXTERNAL_STORAGE", !writeOnly ? "android.permission.READ_EXTERNAL_STORAGE" : null).toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResultUponActivityDestruction(ImagePickerContractResult result, ImagePickerOptions options) {
        if (result instanceof ImagePickerContractResult.Success) {
            this.pendingMediaPickingResult = new PendingMediaPickingResult(((ImagePickerContractResult.Success) result).getData(), options);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fe, code lost:
    
        if (r0 == r8) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object launchContract(Function1 function1, ImagePickerOptions imagePickerOptions, n7.f fVar) {
        AnonymousClass1 anonymousClass1;
        ImagePickerOptions imagePickerOptions2;
        ImagePickerContractResult.Success success;
        Bitmap.CompressFormat bitmapCompressFormat;
        ImagePickerOptions imagePickerOptions3;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object objLaunchPicker = anonymousClass12.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass12.label;
        try {
            if (i11 == 0) {
                AbstractC2753p.b(objLaunchPicker);
                if (this.isPickerOpen) {
                    return new ImagePickerResponse(true, null, 2, null);
                }
                this.isPickerOpen = true;
                anonymousClass12.L$0 = imagePickerOptions;
                anonymousClass12.label = 1;
                Object objLaunchPicker2 = launchPicker(function1, anonymousClass12);
                if (objLaunchPicker2 == objE) {
                    return objE;
                }
                imagePickerOptions2 = imagePickerOptions;
                objLaunchPicker = objLaunchPicker2;
            } else if (i11 == 1) {
                ImagePickerOptions imagePickerOptions4 = (ImagePickerOptions) anonymousClass12.L$0;
                AbstractC2753p.b(objLaunchPicker);
                imagePickerOptions2 = imagePickerOptions4;
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2753p.b(objLaunchPicker);
                    return (ImagePickerResponse) objLaunchPicker;
                }
                imagePickerOptions3 = (ImagePickerOptions) anonymousClass12.L$0;
                AbstractC2753p.b(objLaunchPicker);
                success = (ImagePickerContractResult.Success) objLaunchPicker;
                imagePickerOptions2 = imagePickerOptions3;
                MediaHandler mediaHandler = this.mediaHandler;
                List<Pair<MediaType, Uri>> data = success.getData();
                anonymousClass12.L$0 = null;
                anonymousClass12.label = 3;
                objLaunchPicker = mediaHandler.readExtras$expo_image_picker_release(data, imagePickerOptions2, anonymousClass12);
            }
            success = (ImagePickerContractResult.Success) objLaunchPicker;
            if (!imagePickerOptions2.getAllowsMultipleSelection() && imagePickerOptions2.getAllowsEditing() && success.getData().size() == 1 && success.getData().get(0).c() == MediaType.IMAGE) {
                Uri uri = (Uri) success.getData().get(0).d();
                ContentResolver contentResolver = getContext().getContentResolver();
                AbstractC2855l.f(contentResolver, "getContentResolver(...)");
                String type = ImagePickerUtilsKt.getType(contentResolver, uri);
                if (type == null || (bitmapCompressFormat = ImagePickerUtilsKt.toBitmapCompressFormat(type)) == null) {
                    bitmapCompressFormat = Bitmap.CompressFormat.JPEG;
                }
                Bitmap.CompressFormat compressFormat = bitmapCompressFormat;
                Function1 anonymousClass2 = new AnonymousClass2(uri, imagePickerOptions2, ImagePickerUtilsKt.createOutputFile(getCacheDirectory(), ImagePickerUtilsKt.toImageFileExtension(compressFormat)), compressFormat, null);
                anonymousClass12.L$0 = imagePickerOptions2;
                anonymousClass12.label = 2;
                objLaunchPicker = launchPicker(anonymousClass2, anonymousClass12);
                if (objLaunchPicker != objE) {
                    imagePickerOptions3 = imagePickerOptions2;
                    success = (ImagePickerContractResult.Success) objLaunchPicker;
                    imagePickerOptions2 = imagePickerOptions3;
                    MediaHandler mediaHandler2 = this.mediaHandler;
                    List<Pair<MediaType, Uri>> data2 = success.getData();
                    anonymousClass12.L$0 = null;
                    anonymousClass12.label = 3;
                    objLaunchPicker = mediaHandler2.readExtras$expo_image_picker_release(data2, imagePickerOptions2, anonymousClass12);
                }
            } else {
                MediaHandler mediaHandler22 = this.mediaHandler;
                List<Pair<MediaType, Uri>> data22 = success.getData();
                anonymousClass12.L$0 = null;
                anonymousClass12.label = 3;
                objLaunchPicker = mediaHandler22.readExtras$expo_image_picker_release(data22, imagePickerOptions2, anonymousClass12);
            }
            return objE;
        } catch (OperationCanceledException unused) {
            return new ImagePickerResponse(true, null, 2, null);
        } finally {
            this.isPickerOpen = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object launchPicker(Function1 function1, n7.f fVar) {
        return AbstractC1413i.g(C1404d0.b(), new C24752(function1, null), fVar);
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Class cls;
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        AnyTypeProvider anyTypeProvider;
        AsyncFunctionComponent intAsyncFunctionComponent;
        AsyncFunctionComponent intAsyncFunctionComponent2;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder2.Name(ImagePickerConstants.TAG);
            TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
            AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
            C7.d dVarB = D.b(Boolean.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(Boolean.class), false, new InterfaceC3487a() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Boolean.TYPE);
                    }
                }), converters);
            }
            moduleDefinitionBuilder2.getAsyncFunctions().put("requestMediaLibraryPermissionsAsync", new AsyncFunctionWithPromiseComponent("requestMediaLibraryPermissionsAsync", new AnyType[]{anyType}, new Function2() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunctionWithPromise$2
                public final void invoke(Object[] objArr, Promise promise) throws Exceptions.PermissionsModuleNotFound {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
                    Permissions permissions = this.this$0.getAppContext().getPermissions();
                    if (permissions == null) {
                        throw new Exceptions.PermissionsModuleNotFound();
                    }
                    String[] mediaLibraryPermissions = this.this$0.getMediaLibraryPermissions(zBooleanValue);
                    permissions.askForPermissions(this.this$0.createPermissionsDecorator(promise), (String[]) Arrays.copyOf(mediaLibraryPermissions, mediaLibraryPermissions.length));
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Exceptions.PermissionsModuleNotFound {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters2 = moduleDefinitionBuilder2.getConverters();
            AnyType anyType2 = anyTypeProvider2.getTypesMap().get(new Pair(D.b(Boolean.class), bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(D.b(Boolean.class), false, new InterfaceC3487a() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunctionWithPromise$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Boolean.TYPE);
                    }
                }), converters2);
            }
            moduleDefinitionBuilder2.getAsyncFunctions().put("getMediaLibraryPermissionsAsync", new AsyncFunctionWithPromiseComponent("getMediaLibraryPermissionsAsync", new AnyType[]{anyType2}, new Function2() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunctionWithPromise$4
                public final void invoke(Object[] objArr, Promise promise) throws Exceptions.PermissionsModuleNotFound {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
                    Permissions permissions = this.this$0.getAppContext().getPermissions();
                    if (permissions == null) {
                        throw new Exceptions.PermissionsModuleNotFound();
                    }
                    String[] mediaLibraryPermissions = this.this$0.getMediaLibraryPermissions(zBooleanValue);
                    permissions.getPermissions(this.this$0.createPermissionsDecorator(promise), (String[]) Arrays.copyOf(mediaLibraryPermissions, mediaLibraryPermissions.length));
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Exceptions.PermissionsModuleNotFound {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
                }
            }));
            boolean zB = AbstractC2855l.b(Promise.class, Promise.class);
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            Class cls5 = Integer.TYPE;
            if (zB) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("requestCameraPermissionsAsync", new AnyType[0], new Function2() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.CAMERA");
                    }
                });
                cls = ImagePickerOptions.class;
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
                anyTypeProvider = anyTypeProvider2;
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder2.getConverters();
                AnyType anyType3 = anyTypeProvider2.getTypesMap().get(new Pair(D.b(Promise.class), bool));
                if (anyType3 == null) {
                    cls = ImagePickerOptions.class;
                    anyTypeProvider = anyTypeProvider2;
                    moduleDefinitionBuilder = moduleDefinitionBuilder2;
                    anyType3 = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters3);
                } else {
                    cls = ImagePickerOptions.class;
                    moduleDefinitionBuilder = moduleDefinitionBuilder2;
                    anyTypeProvider = anyTypeProvider2;
                }
                AnyType[] anyTypeArr = {anyType3};
                Function1 function1 = new Function1() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), (Promise) objArr[0], "android.permission.CAMERA");
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, cls5) ? new IntAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls4) ? new BoolAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls3) ? new DoubleAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, cls2) ? new FloatAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr, function1);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("requestCameraPermissionsAsync", intAsyncFunctionComponent);
            if (AbstractC2855l.b(Promise.class, Promise.class)) {
                intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("getCameraPermissionsAsync", new AnyType[0], new Function2() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.CAMERA");
                    }
                });
            } else {
                TypeConverterProvider converters4 = moduleDefinitionBuilder.getConverters();
                AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Promise.class), bool));
                if (anyType4 == null) {
                    anyType4 = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$5
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters4);
                }
                AnyType[] anyTypeArr2 = {anyType4};
                Function1 function12 = new Function1() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), (Promise) objArr[0], "android.permission.CAMERA");
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent2 = AbstractC2855l.b(C2735B.class, cls5) ? new IntAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls4) ? new BoolAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls3) ? new DoubleAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, cls2) ? new FloatAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr2, function12) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr2, function12) : new UntypedAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr2, function12);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getCameraPermissionsAsync", intAsyncFunctionComponent2);
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction = moduleDefinitionBuilder3.AsyncFunction("launchCameraAsync");
            String name = asyncFunctionBuilderAsyncFunction.getName();
            TypeConverterProvider converters5 = asyncFunctionBuilderAsyncFunction.getConverters();
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$Coroutine$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ImagePickerOptions.class);
                    }
                }), converters5);
            }
            asyncFunctionBuilderAsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, new AnyType[]{anyType5}, new ImagePickerModule$definition$lambda$7$$inlined$Coroutine$2(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction2 = moduleDefinitionBuilder3.AsyncFunction("launchImageLibraryAsync");
            String name2 = asyncFunctionBuilderAsyncFunction2.getName();
            TypeConverterProvider converters6 = asyncFunctionBuilderAsyncFunction2.getConverters();
            AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.imagepicker.ImagePickerModule$definition$lambda$7$$inlined$Coroutine$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ImagePickerOptions.class);
                    }
                }), converters6);
            }
            asyncFunctionBuilderAsyncFunction2.setAsyncFunctionComponent(new SuspendFunctionComponent(name2, new AnyType[]{anyType6}, new ImagePickerModule$definition$lambda$7$$inlined$Coroutine$4(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction3 = moduleDefinitionBuilder3.AsyncFunction("getPendingResultAsync");
            asyncFunctionBuilderAsyncFunction3.setAsyncFunctionComponent(new SuspendFunctionComponent(asyncFunctionBuilderAsyncFunction3.getName(), new AnyType[0], new ImagePickerModule$definition$lambda$7$$inlined$Coroutine$5(null, this)));
            moduleDefinitionBuilder3.RegisterActivityContracts(new ImagePickerModule$definition$1$8(this, null));
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder3.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    public final Context getContext() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new IllegalArgumentException("React Application Context is null");
    }
}
