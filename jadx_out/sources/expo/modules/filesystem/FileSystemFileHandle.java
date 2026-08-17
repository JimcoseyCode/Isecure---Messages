package expo.modules.filesystem;

import B7.d;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.sharedobjects.SharedRef;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001a¨\u0006 "}, d2 = {"Lexpo/modules/filesystem/FileSystemFileHandle;", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Ljava/nio/channels/FileChannel;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lexpo/modules/filesystem/FileSystemFile;", "file", "<init>", "(Lexpo/modules/filesystem/FileSystemFile;)V", "Li7/B;", "ensureIsOpen", "()V", "sharedObjectDidRelease", "close", PointerEventHelper.POINTER_TYPE_UNKNOWN, "length", PointerEventHelper.POINTER_TYPE_UNKNOWN, "read", "(J)[B", "data", "write", "([B)V", "fileChannel", "Ljava/nio/channels/FileChannel;", "value", "getOffset", "()Ljava/lang/Long;", "setOffset", "(Ljava/lang/Long;)V", "offset", "getSize", "size", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileSystemFileHandle extends SharedRef<FileChannel> implements AutoCloseable {
    private final FileChannel fileChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemFileHandle(FileSystemFile file) {
        super(new RandomAccessFile(file.getJavaFile(), "rw").getChannel(), null, 2, null);
        AbstractC2855l.g(file, "file");
        this.fileChannel = getRef();
    }

    private final void ensureIsOpen() throws UnableToReadHandleException {
        if (!this.fileChannel.isOpen()) {
            throw new UnableToReadHandleException("file handle is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() throws IOException {
        this.fileChannel.close();
    }

    public final Long getOffset() {
        try {
            return Long.valueOf(this.fileChannel.position());
        } catch (Exception unused) {
            return null;
        }
    }

    public final Long getSize() {
        try {
            return Long.valueOf(this.fileChannel.size());
        } catch (Exception unused) {
            return null;
        }
    }

    public final byte[] read(long length) throws UnableToReadHandleException {
        ensureIsOpen();
        try {
            int i10 = (int) d.i(Math.min(length, this.fileChannel.size() - this.fileChannel.position()), 2147483647L);
            int i11 = 0;
            if (i10 <= 0) {
                return new byte[0];
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
            while (i11 < i10) {
                int i12 = this.fileChannel.read(byteBufferAllocate);
                if (i12 == -1) {
                    break;
                }
                i11 += i12;
            }
            byte[] bArrArray = byteBufferAllocate.array();
            AbstractC2855l.f(bArrArray, "array(...)");
            return bArrArray;
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            throw new UnableToReadHandleException(message);
        }
    }

    public final void setOffset(Long l10) throws IOException {
        if (l10 == null) {
            return;
        }
        this.fileChannel.position(l10.longValue());
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public void sharedObjectDidRelease() throws IOException {
        close();
    }

    public final void write(byte[] data) throws UnableToReadHandleException, UnableToWriteHandleException {
        AbstractC2855l.g(data, "data");
        ensureIsOpen();
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(data);
            while (byteBufferWrap.hasRemaining()) {
                this.fileChannel.write(byteBufferWrap);
            }
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            throw new UnableToWriteHandleException(message);
        }
    }
}
