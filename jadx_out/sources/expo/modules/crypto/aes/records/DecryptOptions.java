package expo.modules.crypto.aes.records;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.crypto.aes.enums.DataFormat;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.types.Either;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR0\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0004\u0018\u0001`\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lexpo/modules/crypto/aes/records/DecryptOptions;", "Lexpo/modules/kotlin/records/Record;", "<init>", "()V", "output", "Lexpo/modules/crypto/aes/enums/DataFormat;", "getOutput$annotations", "getOutput", "()Lexpo/modules/crypto/aes/enums/DataFormat;", "additionalData", "Lexpo/modules/kotlin/types/Either;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/crypto/aes/BinaryInput;", "getAdditionalData$annotations", "getAdditionalData", "()Lexpo/modules/kotlin/types/Either;", "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DecryptOptions implements Record {
    private final Either<byte[], String> additionalData;
    private final DataFormat output = DataFormat.BYTES;

    public final Either<byte[], String> getAdditionalData() {
        return this.additionalData;
    }

    public final DataFormat getOutput() {
        return this.output;
    }

    @Field
    public static /* synthetic */ void getAdditionalData$annotations() {
    }

    @Field
    public static /* synthetic */ void getOutput$annotations() {
    }
}
