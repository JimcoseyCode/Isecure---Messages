package expo.modules.documentpicker;

import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/documentpicker/DocumentPickerOptionsEmptyListException;", "Lexpo/modules/kotlin/exception/CodedException;", "<init>", "()V", "expo-document-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DocumentPickerOptionsEmptyListException extends CodedException {
    public DocumentPickerOptionsEmptyListException() {
        super("The 'type' argument must be a non-empty array.", null, 2, null);
    }
}
