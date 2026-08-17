package expo.modules.kotlin.uuidv5;

import P8.C1385d;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.serverregistration.InstallationId;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¨\u0006\b"}, d2 = {"uuidv5", "Ljava/util/UUID;", "namespace", "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toBytes", PointerEventHelper.POINTER_TYPE_UNKNOWN, InstallationId.LEGACY_PREFERENCES_UUID_KEY, "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Uuidv5Kt {
    public static final byte[] toBytes(UUID uuid) {
        AbstractC2855l.g(uuid, "uuid");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        AbstractC2855l.f(bArrArray, "array(...)");
        return bArrArray;
    }

    public static final UUID uuidv5(UUID namespace, String name) throws NoSuchAlgorithmException {
        AbstractC2855l.g(namespace, "namespace");
        AbstractC2855l.g(name, "name");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(toBytes(namespace));
        byte[] bytes = name.getBytes(C1385d.f8858b);
        AbstractC2855l.f(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[6] = (byte) ((bArrDigest[6] & 15) | 80);
        bArrDigest[8] = (byte) ((bArrDigest[8] & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrDigest);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }
}
