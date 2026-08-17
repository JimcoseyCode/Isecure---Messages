package expo.modules.documentpicker;

import C7.o;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.FileUtils;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.utilities.FileUtilities;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventListenerWithSenderAndPayload;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.OnActivityResultPayload;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import t7.AbstractC3375b;
import t7.AbstractC3376c;
import w7.InterfaceC3487a;
import y9.d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lexpo/modules/documentpicker/DocumentPickerModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Landroid/net/Uri;", "documentUri", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "copyDocumentToCacheDirectory", "(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;", "Landroid/content/Intent;", "intent", "Li7/B;", "handleSingleSelection", "(Landroid/content/Intent;)V", "handleMultipleSelection", "uri", "Lexpo/modules/documentpicker/DocumentInfo;", "readDocumentDetails", "(Landroid/net/Uri;)Lexpo/modules/documentpicker/DocumentInfo;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Lexpo/modules/kotlin/Promise;", "pendingPromise", "Lexpo/modules/kotlin/Promise;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "copyToCacheDirectory", "Z", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "expo-document-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DocumentPickerModule extends Module {
    private boolean copyToCacheDirectory = true;
    private Promise pendingPromise;

    private final Uri copyDocumentToCacheDirectory(Uri documentUri, String name) throws IOException {
        File file = new File(FileUtilities.generateOutputPath(getContext().getCacheDir(), "DocumentPicker", d.a(name)));
        InputStream inputStreamOpenInputStream = getContext().getContentResolver().openInputStream(documentUri);
        try {
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Inputstream for " + documentUri + " was null.");
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    FileUtils.copy(inputStreamOpenInputStream, fileOutputStream);
                } else {
                    AbstractC3375b.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                }
                AbstractC3376c.a(fileOutputStream, null);
                AbstractC3376c.a(inputStreamOpenInputStream, null);
                Uri uriFromFile = Uri.fromFile(file);
                AbstractC2855l.f(uriFromFile, "fromFile(...)");
                return uriFromFile;
            } finally {
            }
        } finally {
        }
    }

    private final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMultipleSelection(Intent intent) throws FailedToReadDocumentException {
        ClipData clipData;
        ClipData.Item itemAt;
        Uri uri;
        ClipData clipData2;
        int itemCount = (intent == null || (clipData2 = intent.getClipData()) == null) ? 0 : clipData2.getItemCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < itemCount; i10++) {
            if (intent == null || (clipData = intent.getClipData()) == null || (itemAt = clipData.getItemAt(i10)) == null || (uri = itemAt.getUri()) == null) {
                throw new FailedToReadDocumentException();
            }
            arrayList.add(readDocumentDetails(uri));
        }
        Promise promise = this.pendingPromise;
        if (promise != null) {
            promise.resolve(new DocumentPickerResult(false, arrayList, 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSingleSelection(Intent intent) throws FailedToReadDocumentException {
        Uri data;
        if (intent != null && (data = intent.getData()) != null) {
            C2735B c2735b = null;
            DocumentPickerResult documentPickerResult = new DocumentPickerResult(false, AbstractC2800q.e(readDocumentDetails(data)), 1, null);
            Promise promise = this.pendingPromise;
            if (promise != null) {
                promise.resolve(documentPickerResult);
                c2735b = C2735B.f28704a;
            }
            if (c2735b != null) {
                return;
            }
        }
        throw new FailedToReadDocumentException();
    }

    private final DocumentInfo readDocumentDetails(Uri uri) throws IOException {
        DocumentInfo documentInfo = new DocumentDetailsReader(getContext()).read(uri);
        return !this.copyToCacheDirectory ? documentInfo : DocumentInfo.copy$default(documentInfo, copyDocumentToCacheDirectory(uri, documentInfo.getName()), null, null, null, 0L, 30, null);
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoDocumentPicker");
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(DocumentPickerOptions.class), Boolean.FALSE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(D.b(DocumentPickerOptions.class), false, new InterfaceC3487a() { // from class: expo.modules.documentpicker.DocumentPickerModule$definition$lambda$3$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(DocumentPickerOptions.class);
                    }
                }), converters);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getDocumentAsync", new AsyncFunctionWithPromiseComponent("getDocumentAsync", new AnyType[]{anyType}, new Function2() { // from class: expo.modules.documentpicker.DocumentPickerModule$definition$lambda$3$$inlined$AsyncFunctionWithPromise$2
                public final void invoke(Object[] objArr, Promise promise) throws DocumentPickerOptionsEmptyListException, PickingInProgressException {
                    String str;
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    DocumentPickerOptions documentPickerOptions = (DocumentPickerOptions) objArr[0];
                    if (this.this$0.pendingPromise != null) {
                        throw new PickingInProgressException();
                    }
                    if (documentPickerOptions.getType().isEmpty()) {
                        throw new DocumentPickerOptionsEmptyListException();
                    }
                    this.this$0.pendingPromise = promise;
                    this.this$0.copyToCacheDirectory = documentPickerOptions.getCopyToCacheDirectory();
                    Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                    intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", documentPickerOptions.getMultiple());
                    if (documentPickerOptions.getType().size() > 1) {
                        intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) documentPickerOptions.getType().toArray(new String[0]));
                        str = "*/*";
                    } else {
                        str = documentPickerOptions.getType().get(0);
                    }
                    intent.setType(str);
                    this.this$0.getAppContext().getThrowingActivity().startActivityForResult(intent, 4137);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws DocumentPickerOptionsEmptyListException, PickingInProgressException {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
                }
            }));
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.ON_ACTIVITY_RESULT;
            eventListeners.put(eventName, new EventListenerWithSenderAndPayload(eventName, new Function2() { // from class: expo.modules.documentpicker.DocumentPickerModule$definition$lambda$3$$inlined$OnActivityResult$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Activity) obj, (OnActivityResultPayload) obj2);
                    return C2735B.f28704a;
                }

                public final void invoke(Activity sender, OnActivityResultPayload payload) {
                    CodedException unexpectedException;
                    CodedException codedException;
                    ClipData clipData;
                    AbstractC2855l.g(sender, "sender");
                    AbstractC2855l.g(payload, "payload");
                    int requestCode = payload.getRequestCode();
                    int resultCode = payload.getResultCode();
                    Intent data = payload.getData();
                    if (requestCode != 4137 || this.this$0.pendingPromise == null) {
                        return;
                    }
                    Promise promise = this.this$0.pendingPromise;
                    AbstractC2855l.d(promise);
                    if (resultCode == -1) {
                        if (data != null) {
                            try {
                                clipData = data.getClipData();
                            } catch (Exception e10) {
                                if (e10 instanceof CodedException) {
                                    codedException = (CodedException) e10;
                                } else {
                                    if (e10 instanceof expo.modules.core.errors.CodedException) {
                                        expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) e10;
                                        String code = codedException2.getCode();
                                        AbstractC2855l.f(code, "getCode(...)");
                                        unexpectedException = new CodedException(code, codedException2.getMessage(), codedException2.getCause());
                                    } else {
                                        unexpectedException = new UnexpectedException(e10);
                                    }
                                    codedException = unexpectedException;
                                }
                                promise.reject(codedException);
                            }
                        } else {
                            clipData = null;
                        }
                        if (clipData != null) {
                            this.this$0.handleMultipleSelection(data);
                        } else {
                            this.this$0.handleSingleSelection(data);
                        }
                    } else {
                        promise.resolve(new DocumentPickerResult(true, null, 2, null));
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
