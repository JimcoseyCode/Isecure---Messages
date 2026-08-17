package expo.modules.sharing;

import C7.o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.errors.InvalidArgumentException;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventListenerWithSenderAndPayload;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.OnActivityResultPayload;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.services.FilePermissionService;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.File;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lexpo/modules/sharing/SharingModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "pendingPromise", "Lexpo/modules/kotlin/Promise;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "getLocalFileFoUrl", "Ljava/io/File;", "url", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isAllowedToRead", PointerEventHelper.POINTER_TYPE_UNKNOWN, "createSharingIntent", "Landroid/content/Intent;", "uri", "Landroid/net/Uri;", "mimeType", "Companion", "expo-sharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SharingModule extends Module {
    private static final int REQUEST_CODE = 8524;
    private Promise pendingPromise;

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent createSharingIntent(Uri uri, String mimeType) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setTypeAndNormalize(mimeType);
        intent.addFlags(1);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getLocalFileFoUrl(String url) throws InvalidArgumentException {
        if (url == null) {
            throw new InvalidArgumentException("URL to share cannot be null.");
        }
        Uri uri = Uri.parse(url);
        if (AbstractC2855l.b("file", uri.getScheme())) {
            String path = uri.getPath();
            if (path == null) {
                throw new InvalidArgumentException("Path component of the URL to share cannot be null.");
            }
            if (isAllowedToRead(path)) {
                return new File(path);
            }
            throw new InvalidArgumentException("Not allowed to read file under given URL.");
        }
        throw new InvalidArgumentException("Only local file URLs are supported (expected scheme to be 'file', got '" + uri.getScheme() + "'.");
    }

    private final boolean isAllowedToRead(String url) {
        FilePermissionService filePermission = getAppContext().getFilePermission();
        if (url == null) {
            return false;
        }
        return filePermission.getPathPermissions(getContext(), url).contains(FilePermissionService.Permission.READ);
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoSharing");
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(D.b(String.class), Boolean.TRUE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(String.class), true, new InterfaceC3487a() { // from class: expo.modules.sharing.SharingModule$definition$lambda$6$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters);
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(SharingOptions.class), Boolean.FALSE));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(D.b(SharingOptions.class), false, new InterfaceC3487a() { // from class: expo.modules.sharing.SharingModule$definition$lambda$6$$inlined$AsyncFunctionWithPromise$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(SharingOptions.class);
                    }
                }), converters);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("shareAsync", new AsyncFunctionWithPromiseComponent("shareAsync", new AnyType[]{anyType, anyType2}, new Function2() { // from class: expo.modules.sharing.SharingModule$definition$lambda$6$$inlined$AsyncFunctionWithPromise$3
                public final void invoke(Object[] objArr, Promise promise) throws SharingInvalidArgsException, SharingInProgressException, SharingFailedException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj = objArr[0];
                    SharingOptions sharingOptions = (SharingOptions) objArr[1];
                    String str = (String) obj;
                    if (this.this$0.pendingPromise != null) {
                        throw new SharingInProgressException();
                    }
                    try {
                        File localFileFoUrl = this.this$0.getLocalFileFoUrl(str);
                        Uri uriForFile = FileProvider.getUriForFile(this.this$0.getContext(), this.this$0.getContext().getApplicationInfo().packageName + ".SharingFileProvider", localFileFoUrl);
                        String mimeType = sharingOptions.getMimeType();
                        if (mimeType == null && (mimeType = URLConnection.guessContentTypeFromName(localFileFoUrl.getName())) == null) {
                            mimeType = "*/*";
                        }
                        SharingModule sharingModule = this.this$0;
                        AbstractC2855l.d(uriForFile);
                        Intent intentCreateChooser = Intent.createChooser(sharingModule.createSharingIntent(uriForFile, mimeType), sharingOptions.getDialogTitle());
                        List<ResolveInfo> listQueryIntentActivities = this.this$0.getContext().getPackageManager().queryIntentActivities(intentCreateChooser, 65536);
                        AbstractC2855l.f(listQueryIntentActivities, "queryIntentActivities(...)");
                        Iterator<T> it = listQueryIntentActivities.iterator();
                        while (it.hasNext()) {
                            this.this$0.getContext().grantUriPermission(((ResolveInfo) it.next()).activityInfo.packageName, uriForFile, 1);
                        }
                        this.this$0.pendingPromise = promise;
                        this.this$0.getAppContext().getThrowingActivity().startActivityForResult(intentCreateChooser, 8524);
                    } catch (InvalidArgumentException e10) {
                        throw new SharingInvalidArgsException(e10.getMessage(), e10);
                    } catch (Exception e11) {
                        throw new SharingFailedException("Failed to share the file: " + e11.getMessage(), e11);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SharingInvalidArgsException, SharingInProgressException, SharingFailedException {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
                }
            }));
            AnyType[] anyTypeArr = new AnyType[0];
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Object.class));
            if (returnType == null) {
                returnType = new ReturnType(D.b(Object.class));
                returnTypeProvider.getTypes().put(D.b(Object.class), returnType);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("getSharedPayloads", new SyncFunctionComponent("getSharedPayloads", anyTypeArr, returnType, new Function1() { // from class: expo.modules.sharing.SharingModule$definition$lambda$6$$inlined$FunctionWithoutArgs$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    Intent intent = SharingSingleton.INSTANCE.getIntent();
                    return intent == null ? AbstractC2800q.j() : SimpleShareIntentDataParser.INSTANCE.parse(this.this$0.getContext(), intent);
                }
            }));
            moduleDefinitionBuilder.getAsyncFunctions().put("getResolvedSharedPayloadsAsync", new UntypedAsyncFunctionComponent("getResolvedSharedPayloadsAsync", new AnyType[0], new Function1() { // from class: expo.modules.sharing.SharingModule$definition$lambda$6$$inlined$AsyncFunctionWithoutArgs$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    Intent intent = SharingSingleton.INSTANCE.getIntent();
                    return intent == null ? AbstractC2800q.j() : ResolvingShareIntentDataParser.INSTANCE.parse(this.this$0.getContext(), intent);
                }
            }));
            AnyType[] anyTypeArr2 = new AnyType[0];
            ReturnType returnType2 = returnTypeProvider.getTypes().get(D.b(Object.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(D.b(Object.class));
                returnTypeProvider.getTypes().put(D.b(Object.class), returnType2);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("clearSharedPayloads", new SyncFunctionComponent("clearSharedPayloads", anyTypeArr2, returnType2, new Function1() { // from class: expo.modules.sharing.SharingModule$definition$lambda$6$$inlined$FunctionWithoutArgs$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    SharingSingleton.INSTANCE.setIntent(null);
                    return C2735B.f28704a;
                }
            }));
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.ON_ACTIVITY_RESULT;
            eventListeners.put(eventName, new EventListenerWithSenderAndPayload(eventName, new Function2() { // from class: expo.modules.sharing.SharingModule$definition$lambda$6$$inlined$OnActivityResult$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Activity) obj, (OnActivityResultPayload) obj2);
                    return C2735B.f28704a;
                }

                public final void invoke(Activity sender, OnActivityResultPayload payload) {
                    AbstractC2855l.g(sender, "sender");
                    AbstractC2855l.g(payload, "payload");
                    if (payload.getRequestCode() != 8524 || this.this$0.pendingPromise == null) {
                        return;
                    }
                    Promise promise = this.this$0.pendingPromise;
                    if (promise != null) {
                        promise.resolve((Object) null);
                    }
                    this.this$0.pendingPromise = null;
                }
            }));
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
