package expo.modules.filesystem;

import P8.AbstractC1387f;
import P8.C1385d;
import P8.q;
import android.net.Uri;
import android.util.Base64;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import expo.modules.filesystem.unifiedfile.UnifiedFileInterface;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.services.FilePermissionService;
import expo.modules.kotlin.typedarray.TypedArray;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import t7.AbstractC3375b;
import t7.AbstractC3376c;
import t7.u;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00142\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0015J\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\b\u0010\u000b\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#R\u0017\u0010&\u001a\u00020\u000e8F¢\u0006\f\u0012\u0004\b%\u0010\b\u001a\u0004\b$\u0010\u0019R\u0011\u0010)\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010-\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010/\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b.\u0010\u0019¨\u00060"}, d2 = {"Lexpo/modules/filesystem/FileSystemFile;", "Lexpo/modules/filesystem/FileSystemPath;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "Li7/B;", "validatePath", "()V", "validateType", "Lexpo/modules/filesystem/CreateOptions;", "options", "create", "(Lexpo/modules/filesystem/CreateOptions;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "content", PointerEventHelper.POINTER_TYPE_UNKNOWN, "append", "write", "(Ljava/lang/String;Z)V", "Lexpo/modules/kotlin/typedarray/TypedArray;", "(Lexpo/modules/kotlin/typedarray/TypedArray;Z)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "([BZ)V", "asString", "()Ljava/lang/String;", ReactTextInputShadowNode.PROP_TEXT, "base64", "bytes", "()[B", "asContentUri", "()Landroid/net/Uri;", "Lexpo/modules/filesystem/InfoOptions;", "Lexpo/modules/filesystem/FileInfo;", "info", "(Lexpo/modules/filesystem/InfoOptions;)Lexpo/modules/filesystem/FileInfo;", "getMd5", "getMd5$annotations", "md5", "getExists", "()Z", "exists", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getSize", "()Ljava/lang/Long;", "size", "getType", NotificationsService.EVENT_TYPE_KEY, "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileSystemFile extends FileSystemPath {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemFile(Uri uri) {
        super(uri);
        AbstractC2855l.g(uri, "uri");
    }

    public static /* synthetic */ void create$default(FileSystemFile fileSystemFile, CreateOptions createOptions, int i10, Object obj) throws InvalidTypeFileException, UnableToCreateException {
        if ((i10 & 1) != 0) {
            createOptions = new CreateOptions(false, false, false, 7, null);
        }
        fileSystemFile.create(createOptions);
    }

    public static /* synthetic */ void write$default(FileSystemFile fileSystemFile, String str, boolean z10, int i10, Object obj) throws InvalidTypeFileException, IOException, UnableToCreateException {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystemFile.write(str, z10);
    }

    public final Uri asContentUri() throws InvalidTypeFileException, MissingAppContextException {
        validateType();
        validatePermission(FilePermissionService.Permission.READ);
        UnifiedFileInterface file = getFile();
        AppContext appContext = getAppContext();
        if (appContext != null) {
            return file.getContentUri(appContext);
        }
        throw new MissingAppContextException();
    }

    public final String asString() {
        String string = getFile().getUri().toString();
        AbstractC2855l.f(string, "toString(...)");
        return q.w(string, "/", false, 2, null) ? q.f1(string, 1) : string;
    }

    public final String base64() throws InvalidTypeFileException, IOException {
        validateType();
        validatePermission(FilePermissionService.Permission.READ);
        InputStream inputStream = getFile().inputStream();
        try {
            String strEncodeToString = Base64.encodeToString(AbstractC3375b.c(inputStream), 2);
            AbstractC2855l.f(strEncodeToString, "encodeToString(...)");
            AbstractC3376c.a(inputStream, null);
            return strEncodeToString;
        } finally {
        }
    }

    public final byte[] bytes() throws InvalidTypeFileException, IOException {
        validateType();
        validatePermission(FilePermissionService.Permission.READ);
        InputStream inputStream = getFile().inputStream();
        try {
            byte[] bArrC = AbstractC3375b.c(inputStream);
            AbstractC3376c.a(inputStream, null);
            return bArrC;
        } finally {
        }
    }

    public final void create(CreateOptions options) throws InvalidTypeFileException, UnableToCreateException {
        File parentFile;
        AbstractC2855l.g(options, "options");
        validateType();
        validatePermission(FilePermissionService.Permission.WRITE);
        validateCanCreate(options);
        if (FileSystemPathKt.isContentUri(getUri())) {
            throw new UnableToCreateException("create function does not work with SAF Uris, use `createDirectory` and `createFile` instead");
        }
        if (options.getOverwrite() && getExists()) {
            getJavaFile().delete();
        }
        if (options.getIntermediates() && (parentFile = getJavaFile().getParentFile()) != null) {
            parentFile.mkdirs();
        }
        if (!getJavaFile().createNewFile()) {
            throw new UnableToCreateException("file already exists or could not be created");
        }
    }

    public final boolean getExists() {
        if (checkPermission(FilePermissionService.Permission.READ)) {
            return getFile().isFile();
        }
        return false;
    }

    public final String getMd5() throws NoSuchAlgorithmException, IOException {
        validatePermission(FilePermissionService.Permission.READ);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        InputStream inputStream = getFile().inputStream();
        try {
            byte[] bArrDigest = messageDigest.digest(AbstractC3375b.c(inputStream));
            AbstractC2855l.d(bArrDigest);
            String strV = AbstractC1387f.v(bArrDigest, null, 1, null);
            AbstractC3376c.a(inputStream, null);
            return strV;
        } finally {
        }
    }

    public final Long getSize() {
        if (getFile().exists()) {
            return Long.valueOf(getFile().length());
        }
        return null;
    }

    public final String getType() {
        return getFile().getType();
    }

    public final FileInfo info(InfoOptions options) throws InvalidTypeFileException {
        validateType();
        validatePermission(FilePermissionService.Permission.READ);
        if (!getFile().exists()) {
            return new FileInfo(false, FileSystemPathKt.slashifyFilePath(getFile().getUri().toString()), null, null, null, null, 60, null);
        }
        FileInfo fileInfo = new FileInfo(true, FileSystemPathKt.slashifyFilePath(getFile().getUri().toString()), null, getSize(), getModificationTime(), getCreationTime(), 4, null);
        if (options != null && AbstractC2855l.b(options.getMd5(), Boolean.TRUE)) {
            fileInfo.setMd5(getMd5());
        }
        return fileInfo;
    }

    public final String text() throws InvalidTypeFileException, IOException {
        validateType();
        validatePermission(FilePermissionService.Permission.READ);
        InputStream inputStream = getFile().inputStream();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C1385d.f8858b), 8192);
            try {
                String strE = u.e(bufferedReader);
                AbstractC3376c.a(bufferedReader, null);
                AbstractC3376c.a(inputStream, null);
                return strE;
            } finally {
            }
        } finally {
        }
    }

    @Override // expo.modules.filesystem.FileSystemPath
    public void validateType() throws InvalidTypeFileException {
        validatePermission(FilePermissionService.Permission.READ);
        if (getFile().exists() && getFile().isDirectory()) {
            throw new InvalidTypeFileException();
        }
    }

    public final void write(String content, boolean append) throws InvalidTypeFileException, IOException, UnableToCreateException {
        AbstractC2855l.g(content, "content");
        validateType();
        validatePermission(FilePermissionService.Permission.WRITE);
        if (!getExists()) {
            create$default(this, null, 1, null);
        }
        OutputStream outputStream = getFile().outputStream(append);
        try {
            byte[] bytes = content.getBytes(C1385d.f8858b);
            AbstractC2855l.f(bytes, "getBytes(...)");
            outputStream.write(bytes);
            C2735B c2735b = C2735B.f28704a;
            AbstractC3376c.a(outputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void write$default(FileSystemFile fileSystemFile, TypedArray typedArray, boolean z10, int i10, Object obj) throws InvalidTypeFileException, IOException, UnableToCreateException {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystemFile.write(typedArray, z10);
    }

    public static /* synthetic */ void write$default(FileSystemFile fileSystemFile, byte[] bArr, boolean z10, int i10, Object obj) throws InvalidTypeFileException, IOException, UnableToCreateException {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fileSystemFile.write(bArr, z10);
    }

    public final void write(TypedArray content, boolean append) throws InvalidTypeFileException, IOException, UnableToCreateException {
        AbstractC2855l.g(content, "content");
        validateType();
        validatePermission(FilePermissionService.Permission.WRITE);
        if (!getExists()) {
            create$default(this, null, 1, null);
        }
        if (FileSystemPathKt.isContentUri(getUri())) {
            OutputStream outputStream = getFile().outputStream(append);
            try {
                byte[] bArr = new byte[content.getLength()];
                content.toDirectBuffer().get(bArr);
                outputStream.write(bArr);
                C2735B c2735b = C2735B.f28704a;
                AbstractC3376c.a(outputStream, null);
            } finally {
            }
        } else {
            FileOutputStream fileOutputStream = new FileOutputStream(getJavaFile(), append);
            try {
                fileOutputStream.getChannel().write(content.toDirectBuffer());
                AbstractC3376c.a(fileOutputStream, null);
            } finally {
            }
        }
    }

    public static /* synthetic */ void getMd5$annotations() {
    }

    public final void validatePath() {
    }

    public final void write(byte[] content, boolean append) throws InvalidTypeFileException, IOException, UnableToCreateException {
        AbstractC2855l.g(content, "content");
        validateType();
        validatePermission(FilePermissionService.Permission.WRITE);
        if (!getExists()) {
            create$default(this, null, 1, null);
        }
        if (FileSystemPathKt.isContentUri(getUri())) {
            OutputStream outputStream = getFile().outputStream(append);
            try {
                outputStream.write(content);
                C2735B c2735b = C2735B.f28704a;
                AbstractC3376c.a(outputStream, null);
            } finally {
            }
        } else {
            FileOutputStream fileOutputStream = new FileOutputStream(getJavaFile(), append);
            try {
                fileOutputStream.write(content);
                C2735B c2735b2 = C2735B.f28704a;
                AbstractC3376c.a(fileOutputStream, null);
            } finally {
            }
        }
    }
}
