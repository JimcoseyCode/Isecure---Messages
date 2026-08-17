package expo.modules.filesystem;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.filesystem.unifiedfile.AssetFile;
import expo.modules.filesystem.unifiedfile.JavaFile;
import expo.modules.filesystem.unifiedfile.SAFDocumentFile;
import expo.modules.filesystem.unifiedfile.UnifiedFileInterface;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.services.FilePermissionService;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import t7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u0005R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0011\u0010*\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010-\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u00101\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00103\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b2\u00100¨\u00064"}, d2 = {"Lexpo/modules/filesystem/FileSystemPath;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "Li7/B;", "delete", "()V", "validateType", "destination", "Ljava/io/File;", "getMoveOrCopyPath", "(Lexpo/modules/filesystem/FileSystemPath;)Ljava/io/File;", "Lexpo/modules/kotlin/services/FilePermissionService$Permission;", "permission", "validatePermission", "(Lexpo/modules/kotlin/services/FilePermissionService$Permission;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "checkPermission", "(Lexpo/modules/kotlin/services/FilePermissionService$Permission;)Z", "Lexpo/modules/filesystem/CreateOptions;", "options", "validateCanCreate", "(Lexpo/modules/filesystem/CreateOptions;)V", "to", "copy", "(Lexpo/modules/filesystem/FileSystemPath;)V", "move", PointerEventHelper.POINTER_TYPE_UNKNOWN, "newName", "rename", "(Ljava/lang/String;)V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "fileAdapter", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "getFile", "()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "file", "getJavaFile", "()Ljava/io/File;", "javaFile", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getModificationTime", "()Ljava/lang/Long;", "modificationTime", "getCreationTime", "creationTime", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class FileSystemPath extends SharedObject {
    private UnifiedFileInterface fileAdapter;
    private Uri uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemPath(Uri uri) {
        super(null, 1, null);
        AbstractC2855l.g(uri, "uri");
        this.uri = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean checkPermission(FilePermissionService.Permission permission) throws Exceptions.ReactContextLost {
        EnumSet<FilePermissionService.Permission> enumSetNoneOf;
        FilePermissionService filePermission;
        Context reactContext;
        AbstractC2855l.g(permission, "permission");
        if (FileSystemPathKt.isContentUri(this.uri) || FileSystemPathKt.isAssetUri(this.uri)) {
            return true;
        }
        AppContext appContext = getAppContext();
        if (appContext == null || (filePermission = appContext.getFilePermission()) == null) {
            enumSetNoneOf = EnumSet.noneOf(FilePermissionService.Permission.class);
        } else {
            AppContext appContext2 = getAppContext();
            if (appContext2 == null || (reactContext = appContext2.getReactContext()) == null) {
                throw new Exceptions.ReactContextLost();
            }
            String path = getJavaFile().getPath();
            AbstractC2855l.f(path, "getPath(...)");
            enumSetNoneOf = filePermission.getPathPermissions(reactContext, path);
            if (enumSetNoneOf == null) {
            }
        }
        return enumSetNoneOf.contains(permission);
    }

    public final void copy(FileSystemPath to) {
        AbstractC2855l.g(to, "to");
        validateType();
        to.validateType();
        validatePermission(FilePermissionService.Permission.READ);
        to.validatePermission(FilePermissionService.Permission.WRITE);
        j.t(getJavaFile(), getMoveOrCopyPath(to), false, null, 6, null);
    }

    public final void delete() throws UnableToDeleteException {
        if (!getFile().exists()) {
            throw new UnableToDeleteException("uri '" + getFile().getUri() + "' does not exist");
        }
        if (getFile().isDirectory()) {
            if (getFile().deleteRecursively()) {
                return;
            }
            throw new UnableToDeleteException("failed to delete '" + getFile().getUri() + "'");
        }
        if (getFile().delete()) {
            return;
        }
        throw new UnableToDeleteException("failed to delete '" + getFile().getUri() + "'");
    }

    public final Long getCreationTime() {
        return getFile().getCreationTime();
    }

    public final UnifiedFileInterface getFile() {
        UnifiedFileInterface javaFile;
        Context reactContext;
        Context reactContext2;
        UnifiedFileInterface unifiedFileInterface = this.fileAdapter;
        if (AbstractC2855l.b(unifiedFileInterface != null ? unifiedFileInterface.getUri() : null, this.uri)) {
            return unifiedFileInterface;
        }
        if (FileSystemPathKt.isContentUri(this.uri)) {
            AppContext appContext = getAppContext();
            if (appContext == null || (reactContext2 = appContext.getReactContext()) == null) {
                throw new Exception("No context");
            }
            javaFile = new SAFDocumentFile(reactContext2, this.uri);
        } else if (FileSystemPathKt.isAssetUri(this.uri)) {
            AppContext appContext2 = getAppContext();
            if (appContext2 == null || (reactContext = appContext2.getReactContext()) == null) {
                throw new Exception("No context");
            }
            javaFile = new AssetFile(reactContext, this.uri);
        } else {
            javaFile = new JavaFile(this.uri);
        }
        this.fileAdapter = javaFile;
        return javaFile;
    }

    public final File getJavaFile() throws Exception {
        if (!FileSystemPathKt.isContentUri(this.uri)) {
            Object file = getFile();
            AbstractC2855l.e(file, "null cannot be cast to non-null type java.io.File");
            return (File) file;
        }
        throw new Exception("This method cannot be used with content URIs: " + this.uri);
    }

    public final Long getModificationTime() {
        validateType();
        return getFile().lastModified();
    }

    public final File getMoveOrCopyPath(FileSystemPath destination) throws CopyOrMoveDirectoryToFileException, DestinationDoesNotExistException {
        AbstractC2855l.g(destination, "destination");
        if (!(destination instanceof FileSystemDirectory)) {
            if (!(this instanceof FileSystemFile)) {
                throw new CopyOrMoveDirectoryToFileException();
            }
            File parentFile = destination.getJavaFile().getParentFile();
            if (parentFile == null || !parentFile.exists()) {
                throw new DestinationDoesNotExistException();
            }
            return destination.getJavaFile();
        }
        if (this instanceof FileSystemFile) {
            if (((FileSystemDirectory) destination).getExists()) {
                return new File(destination.getJavaFile(), getJavaFile().getName());
            }
            throw new DestinationDoesNotExistException();
        }
        if (((FileSystemDirectory) destination).getExists()) {
            return new File(destination.getJavaFile(), getJavaFile().getName());
        }
        File parentFile2 = destination.getJavaFile().getParentFile();
        if (parentFile2 == null || !parentFile2.exists()) {
            throw new DestinationDoesNotExistException();
        }
        return destination.getJavaFile();
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final void move(FileSystemPath to) throws CopyOrMoveDirectoryToFileException, DestinationDoesNotExistException {
        AbstractC2855l.g(to, "to");
        validateType();
        to.validateType();
        FilePermissionService.Permission permission = FilePermissionService.Permission.WRITE;
        validatePermission(permission);
        to.validatePermission(permission);
        if (Build.VERSION.SDK_INT < 26) {
            j.w(getJavaFile(), getMoveOrCopyPath(to), false, 0, 6, null);
            getJavaFile().delete();
            this.uri = Uri.fromFile(getMoveOrCopyPath(to));
            return;
        }
        File moveOrCopyPath = getMoveOrCopyPath(to);
        Path path = getJavaFile().toPath();
        AbstractC2855l.f(path, "toPath(...)");
        Path path2 = moveOrCopyPath.toPath();
        AbstractC2855l.f(path2, "toPath(...)");
        AbstractC2855l.f(Files.move(path, path2, (CopyOption[]) Arrays.copyOf(new CopyOption[0], 0)), "move(...)");
        this.uri = Uri.fromFile(moveOrCopyPath);
    }

    public final void rename(String newName) {
        AbstractC2855l.g(newName, "newName");
        validateType();
        validatePermission(FilePermissionService.Permission.WRITE);
        File file = new File(getJavaFile().getParent(), newName);
        if (Build.VERSION.SDK_INT < 26) {
            j.w(getJavaFile(), file, false, 0, 6, null);
            getJavaFile().delete();
            this.uri = Uri.fromFile(file);
        } else {
            Path path = getJavaFile().toPath();
            AbstractC2855l.f(path, "toPath(...)");
            Path path2 = file.toPath();
            AbstractC2855l.f(path2, "toPath(...)");
            AbstractC2855l.f(Files.move(path, path2, (CopyOption[]) Arrays.copyOf(new CopyOption[0], 0)), "move(...)");
            this.uri = Uri.fromFile(file);
        }
    }

    public final void setUri(Uri uri) {
        AbstractC2855l.g(uri, "<set-?>");
        this.uri = uri;
    }

    public final void validateCanCreate(CreateOptions options) {
        AbstractC2855l.g(options, "options");
        if (!options.getOverwrite() && getFile().exists()) {
            throw new UnableToCreateException("it already exists");
        }
    }

    public final void validatePermission(FilePermissionService.Permission permission) {
        AbstractC2855l.g(permission, "permission");
        if (!checkPermission(permission)) {
            throw new InvalidPermissionException(permission);
        }
    }

    public abstract void validateType();
}
