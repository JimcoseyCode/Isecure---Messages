package expo.modules.filesystem;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.filesystem.FilePickerContractResult;
import expo.modules.kotlin.activityresult.AppContextActivityResultContract;
import expo.modules.kotlin.providers.AppContextProvider;
import i7.C2750m;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\"\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lexpo/modules/filesystem/FilePickerContract;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "Lexpo/modules/filesystem/FilePickerContractOptions;", "Lexpo/modules/filesystem/FilePickerContractResult;", "appContextProvider", "Lexpo/modules/kotlin/providers/AppContextProvider;", "<init>", "(Lexpo/modules/kotlin/providers/AppContextProvider;)V", "contentResolver", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "intent", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"WrongConstant"})
public final class FilePickerContract implements AppContextActivityResultContract<FilePickerContractOptions, FilePickerContractResult> {
    private final AppContextProvider appContextProvider;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PickerType.values().length];
            try {
                iArr[PickerType.DIRECTORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PickerType.FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FilePickerContract(AppContextProvider appContextProvider) {
        AbstractC2855l.g(appContextProvider, "appContextProvider");
        this.appContextProvider = appContextProvider;
    }

    private final ContentResolver getContentResolver() {
        Context reactContext = this.appContextProvider.getAppContext().getReactContext();
        if (reactContext == null) {
            throw new IllegalArgumentException("React Application Context is null");
        }
        ContentResolver contentResolver = reactContext.getContentResolver();
        AbstractC2855l.f(contentResolver, "getContentResolver(...)");
        return contentResolver;
    }

    @Override // expo.modules.kotlin.activityresult.AppContextActivityResultContract
    public Intent createIntent(Context context, FilePickerContractOptions input) {
        Intent intent;
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(input, "input");
        if (input.getPickerType() == PickerType.FILE) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            String mimeType = input.getMimeType();
            if (mimeType == null) {
                mimeType = "*/*";
            }
            intent.setType(mimeType);
        } else {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            intent.putExtra("android.provider.extra.INITIAL_URI", input.getInitialUri());
        }
        return intent;
    }

    @Override // expo.modules.kotlin.activityresult.AppContextActivityResultContract
    public FilePickerContractResult parseResult(FilePickerContractOptions input, int resultCode, Intent intent) {
        AbstractC2855l.g(input, "input");
        if (resultCode == 0 || intent == null) {
            return FilePickerContractResult.Cancelled.INSTANCE;
        }
        Uri data = intent.getData();
        int flags = intent.getFlags() & 3;
        if (data != null) {
            getContentResolver().takePersistableUriPermission(data, flags);
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[input.getPickerType().ordinal()];
        if (i10 == 1) {
            if (data == null) {
                data = Uri.EMPTY;
            }
            AbstractC2855l.d(data);
            return new FilePickerContractResult.Success(new FileSystemDirectory(data));
        }
        if (i10 != 2) {
            throw new C2750m();
        }
        if (data == null) {
            data = Uri.EMPTY;
        }
        AbstractC2855l.d(data);
        return new FilePickerContractResult.Success(new FileSystemFile(data));
    }
}
