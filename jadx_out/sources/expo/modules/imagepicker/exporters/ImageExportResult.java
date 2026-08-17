package expo.modules.imagepicker.exporters;

import R8.AbstractC1443x0;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.imagepicker.FailedToReadFileException;
import expo.modules.imagepicker.ImagePickerConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import t7.AbstractC3375b;
import t7.AbstractC3376c;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0015"}, d2 = {"Lexpo/modules/imagepicker/exporters/ImageExportResult;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "height", "Ljava/io/File;", "imageFile", "<init>", "(IILjava/io/File;)V", "Landroid/content/ContentResolver;", "contentResolver", "Ljava/io/ByteArrayOutputStream;", "data", "(Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;", "Landroid/os/Bundle;", "exif", "I", "getWidth", "()I", "getHeight", "Ljava/io/File;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ImageExportResult {
    private final int height;
    private final File imageFile;
    private final int width;

    public ImageExportResult(int i10, int i11, File imageFile) {
        AbstractC2855l.g(imageFile, "imageFile");
        this.width = i10;
        this.height = i11;
        this.imageFile = imageFile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteArrayOutputStream data$lambda$2(ContentResolver contentResolver, ImageExportResult imageExportResult) throws FailedToReadFileException, IOException {
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(Uri.fromFile(imageExportResult.imageFile));
        if (inputStreamOpenInputStream == null) {
            throw new FailedToReadFileException(imageExportResult.imageFile, null, 2, null);
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                AbstractC3375b.b(inputStreamOpenInputStream, byteArrayOutputStream, 0, 2, null);
                AbstractC3376c.a(byteArrayOutputStream, null);
                AbstractC3376c.a(inputStreamOpenInputStream, null);
                return byteArrayOutputStream;
            } finally {
            }
        } finally {
        }
    }

    static /* synthetic */ Object data$suspendImpl(final ImageExportResult imageExportResult, final ContentResolver contentResolver, n7.f fVar) {
        return AbstractC1443x0.c(null, new InterfaceC3487a() { // from class: expo.modules.imagepicker.exporters.f
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ImageExportResult.data$lambda$2(contentResolver, imageExportResult);
            }
        }, fVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle exif$lambda$8(ContentResolver contentResolver, ImageExportResult imageExportResult) throws FailedToReadFileException, IOException {
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(Uri.fromFile(imageExportResult.imageFile));
        if (inputStreamOpenInputStream == null) {
            throw new FailedToReadFileException(imageExportResult.imageFile, null, 2, null);
        }
        try {
            Bundle bundle = new Bundle();
            X0.a aVar = new X0.a(inputStreamOpenInputStream);
            Iterable<Pair<String, String>> exif_tags = ImagePickerConstants.INSTANCE.getEXIF_TAGS();
            ArrayList<Pair> arrayList = new ArrayList();
            for (Pair<String, String> pair : exif_tags) {
                if (aVar.k((String) pair.getSecond()) != null) {
                    arrayList.add(pair);
                }
            }
            for (Pair pair2 : arrayList) {
                String str = (String) pair2.getFirst();
                String str2 = (String) pair2.getSecond();
                int iHashCode = str.hashCode();
                if (iHashCode != -1325958191) {
                    if (iHashCode != -891985903) {
                        if (iHashCode == 104431 && str.equals("int")) {
                            bundle.putInt(str2, aVar.m(str2, 0));
                        }
                    } else if (str.equals("string")) {
                        bundle.putString(str2, aVar.k(str2));
                    }
                } else if (str.equals("double")) {
                    bundle.putDouble(str2, aVar.l(str2, 0.0d));
                }
            }
            double[] dArrQ = aVar.q();
            if (dArrQ != null) {
                bundle.putDouble("GPSLatitude", dArrQ[0]);
                bundle.putDouble("GPSLongitude", dArrQ[1]);
                bundle.putDouble("GPSAltitude", aVar.j(0.0d));
            }
            AbstractC3376c.a(inputStreamOpenInputStream, null);
            return bundle;
        } finally {
        }
    }

    static /* synthetic */ Object exif$suspendImpl(final ImageExportResult imageExportResult, final ContentResolver contentResolver, n7.f fVar) {
        return AbstractC1443x0.c(null, new InterfaceC3487a() { // from class: expo.modules.imagepicker.exporters.e
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ImageExportResult.exif$lambda$8(contentResolver, imageExportResult);
            }
        }, fVar, 1, null);
    }

    public Object data(ContentResolver contentResolver, n7.f fVar) {
        return data$suspendImpl(this, contentResolver, fVar);
    }

    public Object exif(ContentResolver contentResolver, n7.f fVar) {
        return exif$suspendImpl(this, contentResolver, fVar);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
