package expo.modules.interfaces.permissions;

import expo.modules.core.Promise;
import expo.modules.medialibrary.MediaLibraryConstantsKt;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface Permissions {
    static void askForPermissionsWithPermissionsManager(Permissions permissions, Promise promise, String... strArr) {
        if (permissions == null) {
            promise.reject(MediaLibraryConstantsKt.ERROR_NO_PERMISSIONS, "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else {
            permissions.askForPermissionsWithPromise(promise, strArr);
        }
    }

    static void getPermissionsWithPermissionsManager(Permissions permissions, Promise promise, String... strArr) {
        if (permissions == null) {
            promise.reject(MediaLibraryConstantsKt.ERROR_NO_PERMISSIONS, "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else {
            permissions.getPermissionsWithPromise(promise, strArr);
        }
    }

    void askForPermissions(PermissionsResponseListener permissionsResponseListener, String... strArr);

    void askForPermissionsWithPromise(Promise promise, String... strArr);

    void getPermissions(PermissionsResponseListener permissionsResponseListener, String... strArr);

    void getPermissionsWithPromise(Promise promise, String... strArr);

    boolean hasGrantedPermissions(String... strArr);

    boolean isPermissionPresentInManifest(String str);

    static void askForPermissionsWithPermissionsManager(Permissions permissions, final expo.modules.kotlin.Promise promise, String... strArr) {
        askForPermissionsWithPermissionsManager(permissions, new Promise() { // from class: expo.modules.interfaces.permissions.Permissions.2
            @Override // expo.modules.core.Promise
            public void reject(String str, String str2, Throwable th) {
                promise.reject(str, str2, th);
            }

            @Override // expo.modules.core.Promise
            public void resolve(Object obj) {
                promise.resolve(obj);
            }
        }, strArr);
    }

    static void getPermissionsWithPermissionsManager(Permissions permissions, final expo.modules.kotlin.Promise promise, String... strArr) {
        getPermissionsWithPermissionsManager(permissions, new Promise() { // from class: expo.modules.interfaces.permissions.Permissions.1
            @Override // expo.modules.core.Promise
            public void reject(String str, String str2, Throwable th) {
                promise.reject(str, str2, th);
            }

            @Override // expo.modules.core.Promise
            public void resolve(Object obj) {
                promise.resolve(obj);
            }
        }, strArr);
    }
}
