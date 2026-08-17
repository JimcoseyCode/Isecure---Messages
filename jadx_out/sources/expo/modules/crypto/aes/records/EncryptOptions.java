package expo.modules.crypto.aes.records;

import android.util.Base64;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.types.Either;
import expo.modules.kotlin.types.EitherOfThree;
import java.security.SecureRandom;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bR0\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u000fR0\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lexpo/modules/crypto/aes/records/EncryptOptions;", "Lexpo/modules/kotlin/records/Record;", "<init>", "()V", "nonce", "Lexpo/modules/kotlin/types/EitherOfThree;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getNonce$annotations", "getNonce", "()Lexpo/modules/kotlin/types/EitherOfThree;", "tagLength", "getTagLength$annotations", "getTagLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "additionalData", "Lexpo/modules/kotlin/types/Either;", "Lexpo/modules/crypto/aes/BinaryInput;", "getAdditionalData$annotations", "getAdditionalData", "()Lexpo/modules/kotlin/types/Either;", "gcmParameterSpec", "Ljavax/crypto/spec/GCMParameterSpec;", "random", "Ljava/security/SecureRandom;", "gcmParameterSpec$expo_crypto_release", "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EncryptOptions implements Record {
    private final Either<byte[], String> additionalData;
    private final EitherOfThree<String, byte[], Integer> nonce;
    private final Integer tagLength;

    public final GCMParameterSpec gcmParameterSpec$expo_crypto_release(SecureRandom random) {
        byte[] bArrDecode;
        AbstractC2855l.g(random, "random");
        EitherOfThree<String, byte[], Integer> eitherOfThree = this.nonce;
        if (eitherOfThree == null && this.tagLength == null) {
            return null;
        }
        if (eitherOfThree == null) {
            bArrDecode = new byte[12];
            random.nextBytes(bArrDecode);
        } else {
            Class cls = Integer.TYPE;
            if (eitherOfThree.isThirdType(D.b(cls))) {
                bArrDecode = new byte[this.nonce.getThirdType(D.b(cls)).intValue()];
                random.nextBytes(bArrDecode);
            } else {
                bArrDecode = this.nonce.isFirstType(D.b(String.class)) ? Base64.decode(this.nonce.getFirstType(D.b(String.class)), 2) : this.nonce.getSecondType(D.b(byte[].class));
            }
        }
        Integer num = this.tagLength;
        return new GCMParameterSpec((num != null ? num.intValue() : 16) * 8, bArrDecode);
    }

    public final Either<byte[], String> getAdditionalData() {
        return this.additionalData;
    }

    public final EitherOfThree<String, byte[], Integer> getNonce() {
        return this.nonce;
    }

    public final Integer getTagLength() {
        return this.tagLength;
    }

    @Field
    public static /* synthetic */ void getAdditionalData$annotations() {
    }

    @Field
    public static /* synthetic */ void getNonce$annotations() {
    }

    @Field
    public static /* synthetic */ void getTagLength$annotations() {
    }
}
