package expo.modules.filesystem;

import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.services.FilePermissionService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/filesystem/InvalidPermissionException;", "Lexpo/modules/kotlin/exception/CodedException;", "permission", "Lexpo/modules/kotlin/services/FilePermissionService$Permission;", "<init>", "(Lexpo/modules/kotlin/services/FilePermissionService$Permission;)V", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InvalidPermissionException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidPermissionException(FilePermissionService.Permission permission) {
        super("Missing '" + permission.name() + "' permission for accessing the file.", null, 2, null);
        AbstractC2855l.g(permission, "permission");
    }
}
