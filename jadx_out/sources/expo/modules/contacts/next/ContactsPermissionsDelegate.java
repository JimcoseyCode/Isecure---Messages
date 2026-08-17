package expo.modules.contacts.next;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.MissingPermissionException;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.Exceptions;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\rR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lexpo/modules/contacts/next/ContactsPermissionsDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/AppContext;", "appContext", "<init>", "(Lexpo/modules/kotlin/AppContext;)V", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Li7/B;", "requestPermissions", "(Lexpo/modules/kotlin/Promise;)V", "getPermissions", "ensureReadPermission", "()V", "ensureWritePermission", "ensurePermissions", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "weakAppContextRef", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/interfaces/permissions/Permissions;", "getPermissionsManager", "()Lexpo/modules/interfaces/permissions/Permissions;", "permissionsManager", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactsPermissionsDelegate {
    private final WeakReference<AppContext> weakAppContextRef;

    public ContactsPermissionsDelegate(AppContext appContext) {
        AbstractC2855l.g(appContext, "appContext");
        this.weakAppContextRef = new WeakReference<>(appContext);
    }

    private final Permissions getPermissionsManager() throws Exceptions.PermissionsModuleNotFound {
        Permissions permissions;
        AppContext appContext = this.weakAppContextRef.get();
        if (appContext == null || (permissions = appContext.getPermissions()) == null) {
            throw new Exceptions.PermissionsModuleNotFound();
        }
        return permissions;
    }

    public final void ensurePermissions() throws MissingPermissionException {
        ensureReadPermission();
        ensureWritePermission();
    }

    public final void ensureReadPermission() throws MissingPermissionException {
        if (!getPermissionsManager().hasGrantedPermissions("android.permission.READ_CONTACTS")) {
            throw new MissingPermissionException("android.permission.READ_CONTACTS");
        }
    }

    public final void ensureWritePermission() throws MissingPermissionException {
        if (!getPermissionsManager().hasGrantedPermissions("android.permission.WRITE_CONTACTS")) {
            throw new MissingPermissionException("android.permission.WRITE_CONTACTS");
        }
    }

    public final void getPermissions(Promise promise) {
        AbstractC2855l.g(promise, "promise");
        String[] strArr = getPermissionsManager().isPermissionPresentInManifest("android.permission.WRITE_CONTACTS") ? new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"} : new String[]{"android.permission.READ_CONTACTS"};
        Permissions.getPermissionsWithPermissionsManager(getPermissionsManager(), promise, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void requestPermissions(Promise promise) {
        AbstractC2855l.g(promise, "promise");
        String[] strArr = getPermissionsManager().isPermissionPresentInManifest("android.permission.WRITE_CONTACTS") ? new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"} : new String[]{"android.permission.READ_CONTACTS"};
        Permissions.askForPermissionsWithPermissionsManager(getPermissionsManager(), promise, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
