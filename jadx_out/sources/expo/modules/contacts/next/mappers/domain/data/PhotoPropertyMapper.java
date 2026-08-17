package expo.modules.contacts.next.mappers.domain.data;

import P8.C1385d;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.model.photo.operations.AppendablePhoto;
import expo.modules.contacts.next.domain.model.photo.operations.ExistingPhoto;
import expo.modules.contacts.next.services.ImageByteArrayConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J!\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;", "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;", "Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "imageByteArrayConverter", "Lexpo/modules/contacts/next/services/ImageByteArrayConverter;", "<init>", "(Lexpo/modules/contacts/next/services/ImageByteArrayConverter;)V", "getImageByteArrayConverter", "()Lexpo/modules/contacts/next/services/ImageByteArrayConverter;", "toDto", "model", "toUpdatable", "Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "newValue", "toUpdatable-bM46d30", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "toAppendable", "Lexpo/modules/contacts/next/domain/model/Appendable;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendable-MYK5hZQ", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PhotoPropertyMapper implements MutableDataPropertyMapper<ExistingPhoto, String> {
    private final ImageByteArrayConverter imageByteArrayConverter;

    public PhotoPropertyMapper(ImageByteArrayConverter imageByteArrayConverter) {
        AbstractC2855l.g(imageByteArrayConverter, "imageByteArrayConverter");
        this.imageByteArrayConverter = imageByteArrayConverter;
    }

    public final ImageByteArrayConverter getImageByteArrayConverter() {
        return this.imageByteArrayConverter;
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.MutableDataPropertyMapper
    /* JADX INFO: renamed from: toAppendable-MYK5hZQ, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    public Appendable mo174toAppendableMYK5hZQ(String newValue, String rawContactId) {
        AbstractC2855l.g(rawContactId, "rawContactId");
        return new AppendablePhoto(rawContactId, newValue != null ? this.imageByteArrayConverter.toByteArray(Uri.parse(newValue)) : null, null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.DataPropertyMapper
    public String toDto(ExistingPhoto model) {
        AbstractC2855l.g(model, "model");
        byte[] photo = model.getPhoto();
        if (photo != null) {
            return new String(photo, C1385d.f8858b);
        }
        return null;
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.MutableDataPropertyMapper
    /* JADX INFO: renamed from: toUpdatable-bM46d30, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    public Updatable.Data mo175toUpdatablebM46d30(String dataId, String newValue) {
        AbstractC2855l.g(dataId, "dataId");
        return new ExistingPhoto(dataId, newValue != null ? this.imageByteArrayConverter.toByteArray(Uri.parse(newValue)) : null, null);
    }
}
