package expo.modules.camera;

import C7.o;
import C7.q;
import P4.AbstractC1378l;
import P4.InterfaceC1371e;
import P4.InterfaceC1373g;
import P4.InterfaceC1374h;
import R8.AbstractC1417k;
import R8.C1404d0;
import R8.N;
import R8.O;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.camera.CameraExceptions;
import expo.modules.camera.analyzers.BarCodeScannerResultSerializer;
import expo.modules.camera.analyzers.MLKitBarCodeScanner;
import expo.modules.camera.records.BarcodeSettings;
import expo.modules.camera.records.BarcodeType;
import expo.modules.camera.records.CameraMode;
import expo.modules.camera.records.CameraRatio;
import expo.modules.camera.records.CameraType;
import expo.modules.camera.records.FlashMode;
import expo.modules.camera.records.FocusMode;
import expo.modules.camera.records.VideoQuality;
import expo.modules.camera.records.VideoStabilizationMode;
import expo.modules.camera.tasks.ResolveTakenPictureKt;
import expo.modules.camera.utils.CameraUtils;
import expo.modules.core.errors.ModuleDestroyedException;
import expo.modules.core.logging.Logger;
import expo.modules.core.utilities.EmulatorUtilities;
import expo.modules.core.utilities.VRUtilities;
import expo.modules.interfaces.imageloader.ImageLoaderInterface;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.classcomponent.ClassComponentBuilder;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.Queues;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.PropertyComponentBuilder;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis;
import expo.modules.kotlin.services.Service;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.views.AnyViewProp;
import expo.modules.kotlin.views.ConcreteViewProp;
import expo.modules.kotlin.views.ViewDefinitionBuilder;
import expo.modules.kotlin.views.decorators.CSSPropsKt;
import f6.C2615a;
import i6.AbstractC2732c;
import i6.C2731b;
import i6.InterfaceC2730a;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l1.AbstractC2861a;
import t7.AbstractC3376c;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lexpo/modules/camera/CameraViewModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "LR8/N;", "moduleScope", "LR8/N;", "Ljava/io/File;", "getCacheDirectory", "()Ljava/io/File;", "cacheDirectory", "Lexpo/modules/interfaces/permissions/Permissions;", "getPermissionsManager", "()Lexpo/modules/interfaces/permissions/Permissions;", "permissionsManager", "Companion", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraViewModule extends Module {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = CameraViewModule.class.getSimpleName();
    private final N moduleScope = O.a(C1404d0.c());

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/camera/CameraViewModule$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "TAG", PointerEventHelper.POINTER_TYPE_UNKNOWN, "kotlin.jvm.PlatformType", "getTAG$expo_camera_release", "()Ljava/lang/String;", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG$expo_camera_release() {
            return CameraViewModule.TAG;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getCacheDirectory() {
        return getAppContext().getCacheDirectory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Permissions getPermissionsManager() throws Exceptions.PermissionsModuleNotFound {
        Permissions permissions = getAppContext().getPermissions();
        if (permissions != null) {
            return permissions;
        }
        throw new Exceptions.PermissionsModuleNotFound();
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x0aec A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x004d, B:5:0x0086, B:9:0x00a2, B:11:0x00d0, B:12:0x00e4, B:16:0x010e, B:37:0x01b3, B:39:0x01c2, B:60:0x024c, B:62:0x025b, B:83:0x02e5, B:85:0x02f4, B:106:0x037e, B:108:0x03a6, B:110:0x03c1, B:112:0x03d6, B:114:0x03ed, B:116:0x041d, B:117:0x042f, B:119:0x0479, B:121:0x0493, B:123:0x04a9, B:125:0x04df, B:126:0x04f3, B:128:0x0540, B:129:0x0554, B:131:0x058d, B:132:0x059f, B:134:0x05b6, B:136:0x05cc, B:138:0x0636, B:140:0x064d, B:142:0x0675, B:143:0x0687, B:145:0x06af, B:146:0x06c1, B:148:0x06e6, B:149:0x06f8, B:151:0x0720, B:152:0x0732, B:154:0x075c, B:155:0x0770, B:157:0x0795, B:158:0x07a7, B:160:0x07d1, B:161:0x07e5, B:163:0x080f, B:164:0x0823, B:166:0x084b, B:167:0x085d, B:169:0x0882, B:170:0x0894, B:172:0x08bc, B:173:0x08ce, B:175:0x08f8, B:176:0x090c, B:178:0x0936, B:179:0x094a, B:181:0x0972, B:182:0x0984, B:184:0x09ac, B:185:0x09be, B:187:0x09f1, B:188:0x0a03, B:190:0x0a1a, B:191:0x0a2e, B:193:0x0a5d, B:194:0x0a70, B:196:0x0a81, B:213:0x0ac8, B:215:0x0aec, B:217:0x0b03, B:219:0x0b1a, B:221:0x0b33, B:223:0x0b60, B:224:0x0b73, B:226:0x0b84, B:241:0x0bc3, B:243:0x0be1, B:244:0x0bf4, B:246:0x0c03, B:260:0x0c3e, B:262:0x0c5f, B:263:0x0c72, B:265:0x0c81, B:279:0x0cbc, B:281:0x0cda, B:282:0x0ced, B:284:0x0cfc, B:298:0x0d37, B:285:0x0d02, B:287:0x0d08, B:288:0x0d0e, B:290:0x0d14, B:291:0x0d1a, B:293:0x0d20, B:294:0x0d26, B:296:0x0d2c, B:297:0x0d32, B:266:0x0c87, B:268:0x0c8d, B:269:0x0c93, B:271:0x0c99, B:272:0x0c9f, B:274:0x0ca5, B:275:0x0cab, B:277:0x0cb1, B:278:0x0cb7, B:247:0x0c09, B:249:0x0c0f, B:250:0x0c15, B:252:0x0c1b, B:253:0x0c21, B:255:0x0c27, B:256:0x0c2d, B:258:0x0c33, B:259:0x0c39, B:228:0x0b8c, B:230:0x0b92, B:231:0x0b98, B:233:0x0b9e, B:234:0x0ba4, B:236:0x0baa, B:237:0x0bb0, B:239:0x0bb8, B:240:0x0bbe, B:200:0x0a8d, B:202:0x0a93, B:203:0x0a99, B:205:0x0aa1, B:206:0x0aa7, B:208:0x0aaf, B:209:0x0ab5, B:211:0x0abd, B:212:0x0ac3, B:301:0x0d4f, B:302:0x0d56, B:86:0x0303, B:88:0x0320, B:89:0x0332, B:91:0x0341, B:93:0x0348, B:95:0x034e, B:96:0x0354, B:98:0x035a, B:99:0x0360, B:101:0x0366, B:102:0x036c, B:104:0x0372, B:105:0x0378, B:63:0x026a, B:65:0x0287, B:66:0x0299, B:68:0x02a8, B:70:0x02af, B:72:0x02b5, B:73:0x02bb, B:75:0x02c1, B:76:0x02c7, B:78:0x02cd, B:79:0x02d3, B:81:0x02d9, B:82:0x02df, B:40:0x01d1, B:42:0x01ee, B:43:0x0200, B:45:0x020f, B:47:0x0216, B:49:0x021c, B:50:0x0222, B:52:0x0228, B:53:0x022e, B:55:0x0234, B:56:0x023a, B:58:0x0240, B:59:0x0246, B:17:0x0127, B:19:0x014e, B:21:0x0169, B:23:0x0178, B:24:0x017e, B:26:0x0184, B:27:0x018a, B:29:0x0190, B:30:0x0196, B:32:0x019c, B:33:0x01a2, B:35:0x01a8, B:36:0x01ae), top: B:305:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0b1a A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x004d, B:5:0x0086, B:9:0x00a2, B:11:0x00d0, B:12:0x00e4, B:16:0x010e, B:37:0x01b3, B:39:0x01c2, B:60:0x024c, B:62:0x025b, B:83:0x02e5, B:85:0x02f4, B:106:0x037e, B:108:0x03a6, B:110:0x03c1, B:112:0x03d6, B:114:0x03ed, B:116:0x041d, B:117:0x042f, B:119:0x0479, B:121:0x0493, B:123:0x04a9, B:125:0x04df, B:126:0x04f3, B:128:0x0540, B:129:0x0554, B:131:0x058d, B:132:0x059f, B:134:0x05b6, B:136:0x05cc, B:138:0x0636, B:140:0x064d, B:142:0x0675, B:143:0x0687, B:145:0x06af, B:146:0x06c1, B:148:0x06e6, B:149:0x06f8, B:151:0x0720, B:152:0x0732, B:154:0x075c, B:155:0x0770, B:157:0x0795, B:158:0x07a7, B:160:0x07d1, B:161:0x07e5, B:163:0x080f, B:164:0x0823, B:166:0x084b, B:167:0x085d, B:169:0x0882, B:170:0x0894, B:172:0x08bc, B:173:0x08ce, B:175:0x08f8, B:176:0x090c, B:178:0x0936, B:179:0x094a, B:181:0x0972, B:182:0x0984, B:184:0x09ac, B:185:0x09be, B:187:0x09f1, B:188:0x0a03, B:190:0x0a1a, B:191:0x0a2e, B:193:0x0a5d, B:194:0x0a70, B:196:0x0a81, B:213:0x0ac8, B:215:0x0aec, B:217:0x0b03, B:219:0x0b1a, B:221:0x0b33, B:223:0x0b60, B:224:0x0b73, B:226:0x0b84, B:241:0x0bc3, B:243:0x0be1, B:244:0x0bf4, B:246:0x0c03, B:260:0x0c3e, B:262:0x0c5f, B:263:0x0c72, B:265:0x0c81, B:279:0x0cbc, B:281:0x0cda, B:282:0x0ced, B:284:0x0cfc, B:298:0x0d37, B:285:0x0d02, B:287:0x0d08, B:288:0x0d0e, B:290:0x0d14, B:291:0x0d1a, B:293:0x0d20, B:294:0x0d26, B:296:0x0d2c, B:297:0x0d32, B:266:0x0c87, B:268:0x0c8d, B:269:0x0c93, B:271:0x0c99, B:272:0x0c9f, B:274:0x0ca5, B:275:0x0cab, B:277:0x0cb1, B:278:0x0cb7, B:247:0x0c09, B:249:0x0c0f, B:250:0x0c15, B:252:0x0c1b, B:253:0x0c21, B:255:0x0c27, B:256:0x0c2d, B:258:0x0c33, B:259:0x0c39, B:228:0x0b8c, B:230:0x0b92, B:231:0x0b98, B:233:0x0b9e, B:234:0x0ba4, B:236:0x0baa, B:237:0x0bb0, B:239:0x0bb8, B:240:0x0bbe, B:200:0x0a8d, B:202:0x0a93, B:203:0x0a99, B:205:0x0aa1, B:206:0x0aa7, B:208:0x0aaf, B:209:0x0ab5, B:211:0x0abd, B:212:0x0ac3, B:301:0x0d4f, B:302:0x0d56, B:86:0x0303, B:88:0x0320, B:89:0x0332, B:91:0x0341, B:93:0x0348, B:95:0x034e, B:96:0x0354, B:98:0x035a, B:99:0x0360, B:101:0x0366, B:102:0x036c, B:104:0x0372, B:105:0x0378, B:63:0x026a, B:65:0x0287, B:66:0x0299, B:68:0x02a8, B:70:0x02af, B:72:0x02b5, B:73:0x02bb, B:75:0x02c1, B:76:0x02c7, B:78:0x02cd, B:79:0x02d3, B:81:0x02d9, B:82:0x02df, B:40:0x01d1, B:42:0x01ee, B:43:0x0200, B:45:0x020f, B:47:0x0216, B:49:0x021c, B:50:0x0222, B:52:0x0228, B:53:0x022e, B:55:0x0234, B:56:0x023a, B:58:0x0240, B:59:0x0246, B:17:0x0127, B:19:0x014e, B:21:0x0169, B:23:0x0178, B:24:0x017e, B:26:0x0184, B:27:0x018a, B:29:0x0190, B:30:0x0196, B:32:0x019c, B:33:0x01a2, B:35:0x01a8, B:36:0x01ae), top: B:305:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0b60 A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x004d, B:5:0x0086, B:9:0x00a2, B:11:0x00d0, B:12:0x00e4, B:16:0x010e, B:37:0x01b3, B:39:0x01c2, B:60:0x024c, B:62:0x025b, B:83:0x02e5, B:85:0x02f4, B:106:0x037e, B:108:0x03a6, B:110:0x03c1, B:112:0x03d6, B:114:0x03ed, B:116:0x041d, B:117:0x042f, B:119:0x0479, B:121:0x0493, B:123:0x04a9, B:125:0x04df, B:126:0x04f3, B:128:0x0540, B:129:0x0554, B:131:0x058d, B:132:0x059f, B:134:0x05b6, B:136:0x05cc, B:138:0x0636, B:140:0x064d, B:142:0x0675, B:143:0x0687, B:145:0x06af, B:146:0x06c1, B:148:0x06e6, B:149:0x06f8, B:151:0x0720, B:152:0x0732, B:154:0x075c, B:155:0x0770, B:157:0x0795, B:158:0x07a7, B:160:0x07d1, B:161:0x07e5, B:163:0x080f, B:164:0x0823, B:166:0x084b, B:167:0x085d, B:169:0x0882, B:170:0x0894, B:172:0x08bc, B:173:0x08ce, B:175:0x08f8, B:176:0x090c, B:178:0x0936, B:179:0x094a, B:181:0x0972, B:182:0x0984, B:184:0x09ac, B:185:0x09be, B:187:0x09f1, B:188:0x0a03, B:190:0x0a1a, B:191:0x0a2e, B:193:0x0a5d, B:194:0x0a70, B:196:0x0a81, B:213:0x0ac8, B:215:0x0aec, B:217:0x0b03, B:219:0x0b1a, B:221:0x0b33, B:223:0x0b60, B:224:0x0b73, B:226:0x0b84, B:241:0x0bc3, B:243:0x0be1, B:244:0x0bf4, B:246:0x0c03, B:260:0x0c3e, B:262:0x0c5f, B:263:0x0c72, B:265:0x0c81, B:279:0x0cbc, B:281:0x0cda, B:282:0x0ced, B:284:0x0cfc, B:298:0x0d37, B:285:0x0d02, B:287:0x0d08, B:288:0x0d0e, B:290:0x0d14, B:291:0x0d1a, B:293:0x0d20, B:294:0x0d26, B:296:0x0d2c, B:297:0x0d32, B:266:0x0c87, B:268:0x0c8d, B:269:0x0c93, B:271:0x0c99, B:272:0x0c9f, B:274:0x0ca5, B:275:0x0cab, B:277:0x0cb1, B:278:0x0cb7, B:247:0x0c09, B:249:0x0c0f, B:250:0x0c15, B:252:0x0c1b, B:253:0x0c21, B:255:0x0c27, B:256:0x0c2d, B:258:0x0c33, B:259:0x0c39, B:228:0x0b8c, B:230:0x0b92, B:231:0x0b98, B:233:0x0b9e, B:234:0x0ba4, B:236:0x0baa, B:237:0x0bb0, B:239:0x0bb8, B:240:0x0bbe, B:200:0x0a8d, B:202:0x0a93, B:203:0x0a99, B:205:0x0aa1, B:206:0x0aa7, B:208:0x0aaf, B:209:0x0ab5, B:211:0x0abd, B:212:0x0ac3, B:301:0x0d4f, B:302:0x0d56, B:86:0x0303, B:88:0x0320, B:89:0x0332, B:91:0x0341, B:93:0x0348, B:95:0x034e, B:96:0x0354, B:98:0x035a, B:99:0x0360, B:101:0x0366, B:102:0x036c, B:104:0x0372, B:105:0x0378, B:63:0x026a, B:65:0x0287, B:66:0x0299, B:68:0x02a8, B:70:0x02af, B:72:0x02b5, B:73:0x02bb, B:75:0x02c1, B:76:0x02c7, B:78:0x02cd, B:79:0x02d3, B:81:0x02d9, B:82:0x02df, B:40:0x01d1, B:42:0x01ee, B:43:0x0200, B:45:0x020f, B:47:0x0216, B:49:0x021c, B:50:0x0222, B:52:0x0228, B:53:0x022e, B:55:0x0234, B:56:0x023a, B:58:0x0240, B:59:0x0246, B:17:0x0127, B:19:0x014e, B:21:0x0169, B:23:0x0178, B:24:0x017e, B:26:0x0184, B:27:0x018a, B:29:0x0190, B:30:0x0196, B:32:0x019c, B:33:0x01a2, B:35:0x01a8, B:36:0x01ae), top: B:305:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0b84 A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x004d, B:5:0x0086, B:9:0x00a2, B:11:0x00d0, B:12:0x00e4, B:16:0x010e, B:37:0x01b3, B:39:0x01c2, B:60:0x024c, B:62:0x025b, B:83:0x02e5, B:85:0x02f4, B:106:0x037e, B:108:0x03a6, B:110:0x03c1, B:112:0x03d6, B:114:0x03ed, B:116:0x041d, B:117:0x042f, B:119:0x0479, B:121:0x0493, B:123:0x04a9, B:125:0x04df, B:126:0x04f3, B:128:0x0540, B:129:0x0554, B:131:0x058d, B:132:0x059f, B:134:0x05b6, B:136:0x05cc, B:138:0x0636, B:140:0x064d, B:142:0x0675, B:143:0x0687, B:145:0x06af, B:146:0x06c1, B:148:0x06e6, B:149:0x06f8, B:151:0x0720, B:152:0x0732, B:154:0x075c, B:155:0x0770, B:157:0x0795, B:158:0x07a7, B:160:0x07d1, B:161:0x07e5, B:163:0x080f, B:164:0x0823, B:166:0x084b, B:167:0x085d, B:169:0x0882, B:170:0x0894, B:172:0x08bc, B:173:0x08ce, B:175:0x08f8, B:176:0x090c, B:178:0x0936, B:179:0x094a, B:181:0x0972, B:182:0x0984, B:184:0x09ac, B:185:0x09be, B:187:0x09f1, B:188:0x0a03, B:190:0x0a1a, B:191:0x0a2e, B:193:0x0a5d, B:194:0x0a70, B:196:0x0a81, B:213:0x0ac8, B:215:0x0aec, B:217:0x0b03, B:219:0x0b1a, B:221:0x0b33, B:223:0x0b60, B:224:0x0b73, B:226:0x0b84, B:241:0x0bc3, B:243:0x0be1, B:244:0x0bf4, B:246:0x0c03, B:260:0x0c3e, B:262:0x0c5f, B:263:0x0c72, B:265:0x0c81, B:279:0x0cbc, B:281:0x0cda, B:282:0x0ced, B:284:0x0cfc, B:298:0x0d37, B:285:0x0d02, B:287:0x0d08, B:288:0x0d0e, B:290:0x0d14, B:291:0x0d1a, B:293:0x0d20, B:294:0x0d26, B:296:0x0d2c, B:297:0x0d32, B:266:0x0c87, B:268:0x0c8d, B:269:0x0c93, B:271:0x0c99, B:272:0x0c9f, B:274:0x0ca5, B:275:0x0cab, B:277:0x0cb1, B:278:0x0cb7, B:247:0x0c09, B:249:0x0c0f, B:250:0x0c15, B:252:0x0c1b, B:253:0x0c21, B:255:0x0c27, B:256:0x0c2d, B:258:0x0c33, B:259:0x0c39, B:228:0x0b8c, B:230:0x0b92, B:231:0x0b98, B:233:0x0b9e, B:234:0x0ba4, B:236:0x0baa, B:237:0x0bb0, B:239:0x0bb8, B:240:0x0bbe, B:200:0x0a8d, B:202:0x0a93, B:203:0x0a99, B:205:0x0aa1, B:206:0x0aa7, B:208:0x0aaf, B:209:0x0ab5, B:211:0x0abd, B:212:0x0ac3, B:301:0x0d4f, B:302:0x0d56, B:86:0x0303, B:88:0x0320, B:89:0x0332, B:91:0x0341, B:93:0x0348, B:95:0x034e, B:96:0x0354, B:98:0x035a, B:99:0x0360, B:101:0x0366, B:102:0x036c, B:104:0x0372, B:105:0x0378, B:63:0x026a, B:65:0x0287, B:66:0x0299, B:68:0x02a8, B:70:0x02af, B:72:0x02b5, B:73:0x02bb, B:75:0x02c1, B:76:0x02c7, B:78:0x02cd, B:79:0x02d3, B:81:0x02d9, B:82:0x02df, B:40:0x01d1, B:42:0x01ee, B:43:0x0200, B:45:0x020f, B:47:0x0216, B:49:0x021c, B:50:0x0222, B:52:0x0228, B:53:0x022e, B:55:0x0234, B:56:0x023a, B:58:0x0240, B:59:0x0246, B:17:0x0127, B:19:0x014e, B:21:0x0169, B:23:0x0178, B:24:0x017e, B:26:0x0184, B:27:0x018a, B:29:0x0190, B:30:0x0196, B:32:0x019c, B:33:0x01a2, B:35:0x01a8, B:36:0x01ae), top: B:305:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0b8c A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x004d, B:5:0x0086, B:9:0x00a2, B:11:0x00d0, B:12:0x00e4, B:16:0x010e, B:37:0x01b3, B:39:0x01c2, B:60:0x024c, B:62:0x025b, B:83:0x02e5, B:85:0x02f4, B:106:0x037e, B:108:0x03a6, B:110:0x03c1, B:112:0x03d6, B:114:0x03ed, B:116:0x041d, B:117:0x042f, B:119:0x0479, B:121:0x0493, B:123:0x04a9, B:125:0x04df, B:126:0x04f3, B:128:0x0540, B:129:0x0554, B:131:0x058d, B:132:0x059f, B:134:0x05b6, B:136:0x05cc, B:138:0x0636, B:140:0x064d, B:142:0x0675, B:143:0x0687, B:145:0x06af, B:146:0x06c1, B:148:0x06e6, B:149:0x06f8, B:151:0x0720, B:152:0x0732, B:154:0x075c, B:155:0x0770, B:157:0x0795, B:158:0x07a7, B:160:0x07d1, B:161:0x07e5, B:163:0x080f, B:164:0x0823, B:166:0x084b, B:167:0x085d, B:169:0x0882, B:170:0x0894, B:172:0x08bc, B:173:0x08ce, B:175:0x08f8, B:176:0x090c, B:178:0x0936, B:179:0x094a, B:181:0x0972, B:182:0x0984, B:184:0x09ac, B:185:0x09be, B:187:0x09f1, B:188:0x0a03, B:190:0x0a1a, B:191:0x0a2e, B:193:0x0a5d, B:194:0x0a70, B:196:0x0a81, B:213:0x0ac8, B:215:0x0aec, B:217:0x0b03, B:219:0x0b1a, B:221:0x0b33, B:223:0x0b60, B:224:0x0b73, B:226:0x0b84, B:241:0x0bc3, B:243:0x0be1, B:244:0x0bf4, B:246:0x0c03, B:260:0x0c3e, B:262:0x0c5f, B:263:0x0c72, B:265:0x0c81, B:279:0x0cbc, B:281:0x0cda, B:282:0x0ced, B:284:0x0cfc, B:298:0x0d37, B:285:0x0d02, B:287:0x0d08, B:288:0x0d0e, B:290:0x0d14, B:291:0x0d1a, B:293:0x0d20, B:294:0x0d26, B:296:0x0d2c, B:297:0x0d32, B:266:0x0c87, B:268:0x0c8d, B:269:0x0c93, B:271:0x0c99, B:272:0x0c9f, B:274:0x0ca5, B:275:0x0cab, B:277:0x0cb1, B:278:0x0cb7, B:247:0x0c09, B:249:0x0c0f, B:250:0x0c15, B:252:0x0c1b, B:253:0x0c21, B:255:0x0c27, B:256:0x0c2d, B:258:0x0c33, B:259:0x0c39, B:228:0x0b8c, B:230:0x0b92, B:231:0x0b98, B:233:0x0b9e, B:234:0x0ba4, B:236:0x0baa, B:237:0x0bb0, B:239:0x0bb8, B:240:0x0bbe, B:200:0x0a8d, B:202:0x0a93, B:203:0x0a99, B:205:0x0aa1, B:206:0x0aa7, B:208:0x0aaf, B:209:0x0ab5, B:211:0x0abd, B:212:0x0ac3, B:301:0x0d4f, B:302:0x0d56, B:86:0x0303, B:88:0x0320, B:89:0x0332, B:91:0x0341, B:93:0x0348, B:95:0x034e, B:96:0x0354, B:98:0x035a, B:99:0x0360, B:101:0x0366, B:102:0x036c, B:104:0x0372, B:105:0x0378, B:63:0x026a, B:65:0x0287, B:66:0x0299, B:68:0x02a8, B:70:0x02af, B:72:0x02b5, B:73:0x02bb, B:75:0x02c1, B:76:0x02c7, B:78:0x02cd, B:79:0x02d3, B:81:0x02d9, B:82:0x02df, B:40:0x01d1, B:42:0x01ee, B:43:0x0200, B:45:0x020f, B:47:0x0216, B:49:0x021c, B:50:0x0222, B:52:0x0228, B:53:0x022e, B:55:0x0234, B:56:0x023a, B:58:0x0240, B:59:0x0246, B:17:0x0127, B:19:0x014e, B:21:0x0169, B:23:0x0178, B:24:0x017e, B:26:0x0184, B:27:0x018a, B:29:0x0190, B:30:0x0196, B:32:0x019c, B:33:0x01a2, B:35:0x01a8, B:36:0x01ae), top: B:305:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0be1 A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x004d, B:5:0x0086, B:9:0x00a2, B:11:0x00d0, B:12:0x00e4, B:16:0x010e, B:37:0x01b3, B:39:0x01c2, B:60:0x024c, B:62:0x025b, B:83:0x02e5, B:85:0x02f4, B:106:0x037e, B:108:0x03a6, B:110:0x03c1, B:112:0x03d6, B:114:0x03ed, B:116:0x041d, B:117:0x042f, B:119:0x0479, B:121:0x0493, B:123:0x04a9, B:125:0x04df, B:126:0x04f3, B:128:0x0540, B:129:0x0554, B:131:0x058d, B:132:0x059f, B:134:0x05b6, B:136:0x05cc, B:138:0x0636, B:140:0x064d, B:142:0x0675, B:143:0x0687, B:145:0x06af, B:146:0x06c1, B:148:0x06e6, B:149:0x06f8, B:151:0x0720, B:152:0x0732, B:154:0x075c, B:155:0x0770, B:157:0x0795, B:158:0x07a7, B:160:0x07d1, B:161:0x07e5, B:163:0x080f, B:164:0x0823, B:166:0x084b, B:167:0x085d, B:169:0x0882, B:170:0x0894, B:172:0x08bc, B:173:0x08ce, B:175:0x08f8, B:176:0x090c, B:178:0x0936, B:179:0x094a, B:181:0x0972, B:182:0x0984, B:184:0x09ac, B:185:0x09be, B:187:0x09f1, B:188:0x0a03, B:190:0x0a1a, B:191:0x0a2e, B:193:0x0a5d, B:194:0x0a70, B:196:0x0a81, B:213:0x0ac8, B:215:0x0aec, B:217:0x0b03, B:219:0x0b1a, B:221:0x0b33, B:223:0x0b60, B:224:0x0b73, B:226:0x0b84, B:241:0x0bc3, B:243:0x0be1, B:244:0x0bf4, B:246:0x0c03, B:260:0x0c3e, B:262:0x0c5f, B:263:0x0c72, B:265:0x0c81, B:279:0x0cbc, B:281:0x0cda, B:282:0x0ced, B:284:0x0cfc, B:298:0x0d37, B:285:0x0d02, B:287:0x0d08, B:288:0x0d0e, B:290:0x0d14, B:291:0x0d1a, B:293:0x0d20, B:294:0x0d26, B:296:0x0d2c, B:297:0x0d32, B:266:0x0c87, B:268:0x0c8d, B:269:0x0c93, B:271:0x0c99, B:272:0x0c9f, B:274:0x0ca5, B:275:0x0cab, B:277:0x0cb1, B:278:0x0cb7, B:247:0x0c09, B:249:0x0c0f, B:250:0x0c15, B:252:0x0c1b, B:253:0x0c21, B:255:0x0c27, B:256:0x0c2d, B:258:0x0c33, B:259:0x0c39, B:228:0x0b8c, B:230:0x0b92, B:231:0x0b98, B:233:0x0b9e, B:234:0x0ba4, B:236:0x0baa, B:237:0x0bb0, B:239:0x0bb8, B:240:0x0bbe, B:200:0x0a8d, B:202:0x0a93, B:203:0x0a99, B:205:0x0aa1, B:206:0x0aa7, B:208:0x0aaf, B:209:0x0ab5, B:211:0x0abd, B:212:0x0ac3, B:301:0x0d4f, B:302:0x0d56, B:86:0x0303, B:88:0x0320, B:89:0x0332, B:91:0x0341, B:93:0x0348, B:95:0x034e, B:96:0x0354, B:98:0x035a, B:99:0x0360, B:101:0x0366, B:102:0x036c, B:104:0x0372, B:105:0x0378, B:63:0x026a, B:65:0x0287, B:66:0x0299, B:68:0x02a8, B:70:0x02af, B:72:0x02b5, B:73:0x02bb, B:75:0x02c1, B:76:0x02c7, B:78:0x02cd, B:79:0x02d3, B:81:0x02d9, B:82:0x02df, B:40:0x01d1, B:42:0x01ee, B:43:0x0200, B:45:0x020f, B:47:0x0216, B:49:0x021c, B:50:0x0222, B:52:0x0228, B:53:0x022e, B:55:0x0234, B:56:0x023a, B:58:0x0240, B:59:0x0246, B:17:0x0127, B:19:0x014e, B:21:0x0169, B:23:0x0178, B:24:0x017e, B:26:0x0184, B:27:0x018a, B:29:0x0190, B:30:0x0196, B:32:0x019c, B:33:0x01a2, B:35:0x01a8, B:36:0x01ae), top: B:305:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0c03 A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x004d, B:5:0x0086, B:9:0x00a2, B:11:0x00d0, B:12:0x00e4, B:16:0x010e, B:37:0x01b3, B:39:0x01c2, B:60:0x024c, B:62:0x025b, B:83:0x02e5, B:85:0x02f4, B:106:0x037e, B:108:0x03a6, B:110:0x03c1, B:112:0x03d6, B:114:0x03ed, B:116:0x041d, B:117:0x042f, B:119:0x0479, B:121:0x0493, B:123:0x04a9, B:125:0x04df, B:126:0x04f3, B:128:0x0540, B:129:0x0554, B:131:0x058d, B:132:0x059f, B:134:0x05b6, B:136:0x05cc, B:138:0x0636, B:140:0x064d, B:142:0x0675, B:143:0x0687, B:145:0x06af, B:146:0x06c1, B:148:0x06e6, B:149:0x06f8, B:151:0x0720, B:152:0x0732, B:154:0x075c, B:155:0x0770, B:157:0x0795, B:158:0x07a7, B:160:0x07d1, B:161:0x07e5, B:163:0x080f, B:164:0x0823, B:166:0x084b, B:167:0x085d, B:169:0x0882, B:170:0x0894, B:172:0x08bc, B:173:0x08ce, B:175:0x08f8, B:176:0x090c, B:178:0x0936, B:179:0x094a, B:181:0x0972, B:182:0x0984, B:184:0x09ac, B:185:0x09be, B:187:0x09f1, B:188:0x0a03, B:190:0x0a1a, B:191:0x0a2e, B:193:0x0a5d, B:194:0x0a70, B:196:0x0a81, B:213:0x0ac8, B:215:0x0aec, B:217:0x0b03, B:219:0x0b1a, B:221:0x0b33, B:223:0x0b60, B:224:0x0b73, B:226:0x0b84, B:241:0x0bc3, B:243:0x0be1, B:244:0x0bf4, B:246:0x0c03, B:260:0x0c3e, B:262:0x0c5f, B:263:0x0c72, B:265:0x0c81, B:279:0x0cbc, B:281:0x0cda, B:282:0x0ced, B:284:0x0cfc, B:298:0x0d37, B:285:0x0d02, B:287:0x0d08, B:288:0x0d0e, B:290:0x0d14, B:291:0x0d1a, B:293:0x0d20, B:294:0x0d26, B:296:0x0d2c, B:297:0x0d32, B:266:0x0c87, B:268:0x0c8d, B:269:0x0c93, B:271:0x0c99, B:272:0x0c9f, B:274:0x0ca5, B:275:0x0cab, B:277:0x0cb1, B:278:0x0cb7, B:247:0x0c09, B:249:0x0c0f, B:250:0x0c15, B:252:0x0c1b, B:253:0x0c21, B:255:0x0c27, B:256:0x0c2d, B:258:0x0c33, B:259:0x0c39, B:228:0x0b8c, B:230:0x0b92, B:231:0x0b98, B:233:0x0b9e, B:234:0x0ba4, B:236:0x0baa, B:237:0x0bb0, B:239:0x0bb8, B:240:0x0bbe, B:200:0x0a8d, B:202:0x0a93, B:203:0x0a99, B:205:0x0aa1, B:206:0x0aa7, B:208:0x0aaf, B:209:0x0ab5, B:211:0x0abd, B:212:0x0ac3, B:301:0x0d4f, B:302:0x0d56, B:86:0x0303, B:88:0x0320, B:89:0x0332, B:91:0x0341, B:93:0x0348, B:95:0x034e, B:96:0x0354, B:98:0x035a, B:99:0x0360, B:101:0x0366, B:102:0x036c, B:104:0x0372, B:105:0x0378, B:63:0x026a, B:65:0x0287, B:66:0x0299, B:68:0x02a8, B:70:0x02af, B:72:0x02b5, B:73:0x02bb, B:75:0x02c1, B:76:0x02c7, B:78:0x02cd, B:79:0x02d3, B:81:0x02d9, B:82:0x02df, B:40:0x01d1, B:42:0x01ee, B:43:0x0200, B:45:0x020f, B:47:0x0216, B:49:0x021c, B:50:0x0222, B:52:0x0228, B:53:0x022e, B:55:0x0234, B:56:0x023a, B:58:0x0240, B:59:0x0246, B:17:0x0127, B:19:0x014e, B:21:0x0169, B:23:0x0178, B:24:0x017e, B:26:0x0184, B:27:0x018a, B:29:0x0190, B:30:0x0196, B:32:0x019c, B:33:0x01a2, B:35:0x01a8, B:36:0x01ae), top: B:305:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0c09 A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x004d, B:5:0x0086, B:9:0x00a2, B:11:0x00d0, B:12:0x00e4, B:16:0x010e, B:37:0x01b3, B:39:0x01c2, B:60:0x024c, B:62:0x025b, B:83:0x02e5, B:85:0x02f4, B:106:0x037e, B:108:0x03a6, B:110:0x03c1, B:112:0x03d6, B:114:0x03ed, B:116:0x041d, B:117:0x042f, B:119:0x0479, B:121:0x0493, B:123:0x04a9, B:125:0x04df, B:126:0x04f3, B:128:0x0540, B:129:0x0554, B:131:0x058d, B:132:0x059f, B:134:0x05b6, B:136:0x05cc, B:138:0x0636, B:140:0x064d, B:142:0x0675, B:143:0x0687, B:145:0x06af, B:146:0x06c1, B:148:0x06e6, B:149:0x06f8, B:151:0x0720, B:152:0x0732, B:154:0x075c, B:155:0x0770, B:157:0x0795, B:158:0x07a7, B:160:0x07d1, B:161:0x07e5, B:163:0x080f, B:164:0x0823, B:166:0x084b, B:167:0x085d, B:169:0x0882, B:170:0x0894, B:172:0x08bc, B:173:0x08ce, B:175:0x08f8, B:176:0x090c, B:178:0x0936, B:179:0x094a, B:181:0x0972, B:182:0x0984, B:184:0x09ac, B:185:0x09be, B:187:0x09f1, B:188:0x0a03, B:190:0x0a1a, B:191:0x0a2e, B:193:0x0a5d, B:194:0x0a70, B:196:0x0a81, B:213:0x0ac8, B:215:0x0aec, B:217:0x0b03, B:219:0x0b1a, B:221:0x0b33, B:223:0x0b60, B:224:0x0b73, B:226:0x0b84, B:241:0x0bc3, B:243:0x0be1, B:244:0x0bf4, B:246:0x0c03, B:260:0x0c3e, B:262:0x0c5f, B:263:0x0c72, B:265:0x0c81, B:279:0x0cbc, B:281:0x0cda, B:282:0x0ced, B:284:0x0cfc, B:298:0x0d37, B:285:0x0d02, B:287:0x0d08, B:288:0x0d0e, B:290:0x0d14, B:291:0x0d1a, B:293:0x0d20, B:294:0x0d26, B:296:0x0d2c, B:297:0x0d32, B:266:0x0c87, B:268:0x0c8d, B:269:0x0c93, B:271:0x0c99, B:272:0x0c9f, B:274:0x0ca5, B:275:0x0cab, B:277:0x0cb1, B:278:0x0cb7, B:247:0x0c09, B:249:0x0c0f, B:250:0x0c15, B:252:0x0c1b, B:253:0x0c21, B:255:0x0c27, B:256:0x0c2d, B:258:0x0c33, B:259:0x0c39, B:228:0x0b8c, B:230:0x0b92, B:231:0x0b98, B:233:0x0b9e, B:234:0x0ba4, B:236:0x0baa, B:237:0x0bb0, B:239:0x0bb8, B:240:0x0bbe, B:200:0x0a8d, B:202:0x0a93, B:203:0x0a99, B:205:0x0aa1, B:206:0x0aa7, B:208:0x0aaf, B:209:0x0ab5, B:211:0x0abd, B:212:0x0ac3, B:301:0x0d4f, B:302:0x0d56, B:86:0x0303, B:88:0x0320, B:89:0x0332, B:91:0x0341, B:93:0x0348, B:95:0x034e, B:96:0x0354, B:98:0x035a, B:99:0x0360, B:101:0x0366, B:102:0x036c, B:104:0x0372, B:105:0x0378, B:63:0x026a, B:65:0x0287, B:66:0x0299, B:68:0x02a8, B:70:0x02af, B:72:0x02b5, B:73:0x02bb, B:75:0x02c1, B:76:0x02c7, B:78:0x02cd, B:79:0x02d3, B:81:0x02d9, B:82:0x02df, B:40:0x01d1, B:42:0x01ee, B:43:0x0200, B:45:0x020f, B:47:0x0216, B:49:0x021c, B:50:0x0222, B:52:0x0228, B:53:0x022e, B:55:0x0234, B:56:0x023a, B:58:0x0240, B:59:0x0246, B:17:0x0127, B:19:0x014e, B:21:0x0169, B:23:0x0178, B:24:0x017e, B:26:0x0184, B:27:0x018a, B:29:0x0190, B:30:0x0196, B:32:0x019c, B:33:0x01a2, B:35:0x01a8, B:36:0x01ae), top: B:305:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0c5f A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x004d, B:5:0x0086, B:9:0x00a2, B:11:0x00d0, B:12:0x00e4, B:16:0x010e, B:37:0x01b3, B:39:0x01c2, B:60:0x024c, B:62:0x025b, B:83:0x02e5, B:85:0x02f4, B:106:0x037e, B:108:0x03a6, B:110:0x03c1, B:112:0x03d6, B:114:0x03ed, B:116:0x041d, B:117:0x042f, B:119:0x0479, B:121:0x0493, B:123:0x04a9, B:125:0x04df, B:126:0x04f3, B:128:0x0540, B:129:0x0554, B:131:0x058d, B:132:0x059f, B:134:0x05b6, B:136:0x05cc, B:138:0x0636, B:140:0x064d, B:142:0x0675, B:143:0x0687, B:145:0x06af, B:146:0x06c1, B:148:0x06e6, B:149:0x06f8, B:151:0x0720, B:152:0x0732, B:154:0x075c, B:155:0x0770, B:157:0x0795, B:158:0x07a7, B:160:0x07d1, B:161:0x07e5, B:163:0x080f, B:164:0x0823, B:166:0x084b, B:167:0x085d, B:169:0x0882, B:170:0x0894, B:172:0x08bc, B:173:0x08ce, B:175:0x08f8, B:176:0x090c, B:178:0x0936, B:179:0x094a, B:181:0x0972, B:182:0x0984, B:184:0x09ac, B:185:0x09be, B:187:0x09f1, B:188:0x0a03, B:190:0x0a1a, B:191:0x0a2e, B:193:0x0a5d, B:194:0x0a70, B:196:0x0a81, B:213:0x0ac8, B:215:0x0aec, B:217:0x0b03, B:219:0x0b1a, B:221:0x0b33, B:223:0x0b60, B:224:0x0b73, B:226:0x0b84, B:241:0x0bc3, B:243:0x0be1, B:244:0x0bf4, B:246:0x0c03, B:260:0x0c3e, B:262:0x0c5f, B:263:0x0c72, B:265:0x0c81, B:279:0x0cbc, B:281:0x0cda, B:282:0x0ced, B:284:0x0cfc, B:298:0x0d37, B:285:0x0d02, B:287:0x0d08, B:288:0x0d0e, B:290:0x0d14, B:291:0x0d1a, B:293:0x0d20, B:294:0x0d26, B:296:0x0d2c, B:297:0x0d32, B:266:0x0c87, B:268:0x0c8d, B:269:0x0c93, B:271:0x0c99, B:272:0x0c9f, B:274:0x0ca5, B:275:0x0cab, B:277:0x0cb1, B:278:0x0cb7, B:247:0x0c09, B:249:0x0c0f, B:250:0x0c15, B:252:0x0c1b, B:253:0x0c21, B:255:0x0c27, B:256:0x0c2d, B:258:0x0c33, B:259:0x0c39, B:228:0x0b8c, B:230:0x0b92, B:231:0x0b98, B:233:0x0b9e, B:234:0x0ba4, B:236:0x0baa, B:237:0x0bb0, B:239:0x0bb8, B:240:0x0bbe, B:200:0x0a8d, B:202:0x0a93, B:203:0x0a99, B:205:0x0aa1, B:206:0x0aa7, B:208:0x0aaf, B:209:0x0ab5, B:211:0x0abd, B:212:0x0ac3, B:301:0x0d4f, B:302:0x0d56, B:86:0x0303, B:88:0x0320, B:89:0x0332, B:91:0x0341, B:93:0x0348, B:95:0x034e, B:96:0x0354, B:98:0x035a, B:99:0x0360, B:101:0x0366, B:102:0x036c, B:104:0x0372, B:105:0x0378, B:63:0x026a, B:65:0x0287, B:66:0x0299, B:68:0x02a8, B:70:0x02af, B:72:0x02b5, B:73:0x02bb, B:75:0x02c1, B:76:0x02c7, B:78:0x02cd, B:79:0x02d3, B:81:0x02d9, B:82:0x02df, B:40:0x01d1, B:42:0x01ee, B:43:0x0200, B:45:0x020f, B:47:0x0216, B:49:0x021c, B:50:0x0222, B:52:0x0228, B:53:0x022e, B:55:0x0234, B:56:0x023a, B:58:0x0240, B:59:0x0246, B:17:0x0127, B:19:0x014e, B:21:0x0169, B:23:0x0178, B:24:0x017e, B:26:0x0184, B:27:0x018a, B:29:0x0190, B:30:0x0196, B:32:0x019c, B:33:0x01a2, B:35:0x01a8, B:36:0x01ae), top: B:305:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0c81 A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x004d, B:5:0x0086, B:9:0x00a2, B:11:0x00d0, B:12:0x00e4, B:16:0x010e, B:37:0x01b3, B:39:0x01c2, B:60:0x024c, B:62:0x025b, B:83:0x02e5, B:85:0x02f4, B:106:0x037e, B:108:0x03a6, B:110:0x03c1, B:112:0x03d6, B:114:0x03ed, B:116:0x041d, B:117:0x042f, B:119:0x0479, B:121:0x0493, B:123:0x04a9, B:125:0x04df, B:126:0x04f3, B:128:0x0540, B:129:0x0554, B:131:0x058d, B:132:0x059f, B:134:0x05b6, B:136:0x05cc, B:138:0x0636, B:140:0x064d, B:142:0x0675, B:143:0x0687, B:145:0x06af, B:146:0x06c1, B:148:0x06e6, B:149:0x06f8, B:151:0x0720, B:152:0x0732, B:154:0x075c, B:155:0x0770, B:157:0x0795, B:158:0x07a7, B:160:0x07d1, B:161:0x07e5, B:163:0x080f, B:164:0x0823, B:166:0x084b, B:167:0x085d, B:169:0x0882, B:170:0x0894, B:172:0x08bc, B:173:0x08ce, B:175:0x08f8, B:176:0x090c, B:178:0x0936, B:179:0x094a, B:181:0x0972, B:182:0x0984, B:184:0x09ac, B:185:0x09be, B:187:0x09f1, B:188:0x0a03, B:190:0x0a1a, B:191:0x0a2e, B:193:0x0a5d, B:194:0x0a70, B:196:0x0a81, B:213:0x0ac8, B:215:0x0aec, B:217:0x0b03, B:219:0x0b1a, B:221:0x0b33, B:223:0x0b60, B:224:0x0b73, B:226:0x0b84, B:241:0x0bc3, B:243:0x0be1, B:244:0x0bf4, B:246:0x0c03, B:260:0x0c3e, B:262:0x0c5f, B:263:0x0c72, B:265:0x0c81, B:279:0x0cbc, B:281:0x0cda, B:282:0x0ced, B:284:0x0cfc, B:298:0x0d37, B:285:0x0d02, B:287:0x0d08, B:288:0x0d0e, B:290:0x0d14, B:291:0x0d1a, B:293:0x0d20, B:294:0x0d26, B:296:0x0d2c, B:297:0x0d32, B:266:0x0c87, B:268:0x0c8d, B:269:0x0c93, B:271:0x0c99, B:272:0x0c9f, B:274:0x0ca5, B:275:0x0cab, B:277:0x0cb1, B:278:0x0cb7, B:247:0x0c09, B:249:0x0c0f, B:250:0x0c15, B:252:0x0c1b, B:253:0x0c21, B:255:0x0c27, B:256:0x0c2d, B:258:0x0c33, B:259:0x0c39, B:228:0x0b8c, B:230:0x0b92, B:231:0x0b98, B:233:0x0b9e, B:234:0x0ba4, B:236:0x0baa, B:237:0x0bb0, B:239:0x0bb8, B:240:0x0bbe, B:200:0x0a8d, B:202:0x0a93, B:203:0x0a99, B:205:0x0aa1, B:206:0x0aa7, B:208:0x0aaf, B:209:0x0ab5, B:211:0x0abd, B:212:0x0ac3, B:301:0x0d4f, B:302:0x0d56, B:86:0x0303, B:88:0x0320, B:89:0x0332, B:91:0x0341, B:93:0x0348, B:95:0x034e, B:96:0x0354, B:98:0x035a, B:99:0x0360, B:101:0x0366, B:102:0x036c, B:104:0x0372, B:105:0x0378, B:63:0x026a, B:65:0x0287, B:66:0x0299, B:68:0x02a8, B:70:0x02af, B:72:0x02b5, B:73:0x02bb, B:75:0x02c1, B:76:0x02c7, B:78:0x02cd, B:79:0x02d3, B:81:0x02d9, B:82:0x02df, B:40:0x01d1, B:42:0x01ee, B:43:0x0200, B:45:0x020f, B:47:0x0216, B:49:0x021c, B:50:0x0222, B:52:0x0228, B:53:0x022e, B:55:0x0234, B:56:0x023a, B:58:0x0240, B:59:0x0246, B:17:0x0127, B:19:0x014e, B:21:0x0169, B:23:0x0178, B:24:0x017e, B:26:0x0184, B:27:0x018a, B:29:0x0190, B:30:0x0196, B:32:0x019c, B:33:0x01a2, B:35:0x01a8, B:36:0x01ae), top: B:305:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0c87 A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x004d, B:5:0x0086, B:9:0x00a2, B:11:0x00d0, B:12:0x00e4, B:16:0x010e, B:37:0x01b3, B:39:0x01c2, B:60:0x024c, B:62:0x025b, B:83:0x02e5, B:85:0x02f4, B:106:0x037e, B:108:0x03a6, B:110:0x03c1, B:112:0x03d6, B:114:0x03ed, B:116:0x041d, B:117:0x042f, B:119:0x0479, B:121:0x0493, B:123:0x04a9, B:125:0x04df, B:126:0x04f3, B:128:0x0540, B:129:0x0554, B:131:0x058d, B:132:0x059f, B:134:0x05b6, B:136:0x05cc, B:138:0x0636, B:140:0x064d, B:142:0x0675, B:143:0x0687, B:145:0x06af, B:146:0x06c1, B:148:0x06e6, B:149:0x06f8, B:151:0x0720, B:152:0x0732, B:154:0x075c, B:155:0x0770, B:157:0x0795, B:158:0x07a7, B:160:0x07d1, B:161:0x07e5, B:163:0x080f, B:164:0x0823, B:166:0x084b, B:167:0x085d, B:169:0x0882, B:170:0x0894, B:172:0x08bc, B:173:0x08ce, B:175:0x08f8, B:176:0x090c, B:178:0x0936, B:179:0x094a, B:181:0x0972, B:182:0x0984, B:184:0x09ac, B:185:0x09be, B:187:0x09f1, B:188:0x0a03, B:190:0x0a1a, B:191:0x0a2e, B:193:0x0a5d, B:194:0x0a70, B:196:0x0a81, B:213:0x0ac8, B:215:0x0aec, B:217:0x0b03, B:219:0x0b1a, B:221:0x0b33, B:223:0x0b60, B:224:0x0b73, B:226:0x0b84, B:241:0x0bc3, B:243:0x0be1, B:244:0x0bf4, B:246:0x0c03, B:260:0x0c3e, B:262:0x0c5f, B:263:0x0c72, B:265:0x0c81, B:279:0x0cbc, B:281:0x0cda, B:282:0x0ced, B:284:0x0cfc, B:298:0x0d37, B:285:0x0d02, B:287:0x0d08, B:288:0x0d0e, B:290:0x0d14, B:291:0x0d1a, B:293:0x0d20, B:294:0x0d26, B:296:0x0d2c, B:297:0x0d32, B:266:0x0c87, B:268:0x0c8d, B:269:0x0c93, B:271:0x0c99, B:272:0x0c9f, B:274:0x0ca5, B:275:0x0cab, B:277:0x0cb1, B:278:0x0cb7, B:247:0x0c09, B:249:0x0c0f, B:250:0x0c15, B:252:0x0c1b, B:253:0x0c21, B:255:0x0c27, B:256:0x0c2d, B:258:0x0c33, B:259:0x0c39, B:228:0x0b8c, B:230:0x0b92, B:231:0x0b98, B:233:0x0b9e, B:234:0x0ba4, B:236:0x0baa, B:237:0x0bb0, B:239:0x0bb8, B:240:0x0bbe, B:200:0x0a8d, B:202:0x0a93, B:203:0x0a99, B:205:0x0aa1, B:206:0x0aa7, B:208:0x0aaf, B:209:0x0ab5, B:211:0x0abd, B:212:0x0ac3, B:301:0x0d4f, B:302:0x0d56, B:86:0x0303, B:88:0x0320, B:89:0x0332, B:91:0x0341, B:93:0x0348, B:95:0x034e, B:96:0x0354, B:98:0x035a, B:99:0x0360, B:101:0x0366, B:102:0x036c, B:104:0x0372, B:105:0x0378, B:63:0x026a, B:65:0x0287, B:66:0x0299, B:68:0x02a8, B:70:0x02af, B:72:0x02b5, B:73:0x02bb, B:75:0x02c1, B:76:0x02c7, B:78:0x02cd, B:79:0x02d3, B:81:0x02d9, B:82:0x02df, B:40:0x01d1, B:42:0x01ee, B:43:0x0200, B:45:0x020f, B:47:0x0216, B:49:0x021c, B:50:0x0222, B:52:0x0228, B:53:0x022e, B:55:0x0234, B:56:0x023a, B:58:0x0240, B:59:0x0246, B:17:0x0127, B:19:0x014e, B:21:0x0169, B:23:0x0178, B:24:0x017e, B:26:0x0184, B:27:0x018a, B:29:0x0190, B:30:0x0196, B:32:0x019c, B:33:0x01a2, B:35:0x01a8, B:36:0x01ae), top: B:305:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0cda A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x004d, B:5:0x0086, B:9:0x00a2, B:11:0x00d0, B:12:0x00e4, B:16:0x010e, B:37:0x01b3, B:39:0x01c2, B:60:0x024c, B:62:0x025b, B:83:0x02e5, B:85:0x02f4, B:106:0x037e, B:108:0x03a6, B:110:0x03c1, B:112:0x03d6, B:114:0x03ed, B:116:0x041d, B:117:0x042f, B:119:0x0479, B:121:0x0493, B:123:0x04a9, B:125:0x04df, B:126:0x04f3, B:128:0x0540, B:129:0x0554, B:131:0x058d, B:132:0x059f, B:134:0x05b6, B:136:0x05cc, B:138:0x0636, B:140:0x064d, B:142:0x0675, B:143:0x0687, B:145:0x06af, B:146:0x06c1, B:148:0x06e6, B:149:0x06f8, B:151:0x0720, B:152:0x0732, B:154:0x075c, B:155:0x0770, B:157:0x0795, B:158:0x07a7, B:160:0x07d1, B:161:0x07e5, B:163:0x080f, B:164:0x0823, B:166:0x084b, B:167:0x085d, B:169:0x0882, B:170:0x0894, B:172:0x08bc, B:173:0x08ce, B:175:0x08f8, B:176:0x090c, B:178:0x0936, B:179:0x094a, B:181:0x0972, B:182:0x0984, B:184:0x09ac, B:185:0x09be, B:187:0x09f1, B:188:0x0a03, B:190:0x0a1a, B:191:0x0a2e, B:193:0x0a5d, B:194:0x0a70, B:196:0x0a81, B:213:0x0ac8, B:215:0x0aec, B:217:0x0b03, B:219:0x0b1a, B:221:0x0b33, B:223:0x0b60, B:224:0x0b73, B:226:0x0b84, B:241:0x0bc3, B:243:0x0be1, B:244:0x0bf4, B:246:0x0c03, B:260:0x0c3e, B:262:0x0c5f, B:263:0x0c72, B:265:0x0c81, B:279:0x0cbc, B:281:0x0cda, B:282:0x0ced, B:284:0x0cfc, B:298:0x0d37, B:285:0x0d02, B:287:0x0d08, B:288:0x0d0e, B:290:0x0d14, B:291:0x0d1a, B:293:0x0d20, B:294:0x0d26, B:296:0x0d2c, B:297:0x0d32, B:266:0x0c87, B:268:0x0c8d, B:269:0x0c93, B:271:0x0c99, B:272:0x0c9f, B:274:0x0ca5, B:275:0x0cab, B:277:0x0cb1, B:278:0x0cb7, B:247:0x0c09, B:249:0x0c0f, B:250:0x0c15, B:252:0x0c1b, B:253:0x0c21, B:255:0x0c27, B:256:0x0c2d, B:258:0x0c33, B:259:0x0c39, B:228:0x0b8c, B:230:0x0b92, B:231:0x0b98, B:233:0x0b9e, B:234:0x0ba4, B:236:0x0baa, B:237:0x0bb0, B:239:0x0bb8, B:240:0x0bbe, B:200:0x0a8d, B:202:0x0a93, B:203:0x0a99, B:205:0x0aa1, B:206:0x0aa7, B:208:0x0aaf, B:209:0x0ab5, B:211:0x0abd, B:212:0x0ac3, B:301:0x0d4f, B:302:0x0d56, B:86:0x0303, B:88:0x0320, B:89:0x0332, B:91:0x0341, B:93:0x0348, B:95:0x034e, B:96:0x0354, B:98:0x035a, B:99:0x0360, B:101:0x0366, B:102:0x036c, B:104:0x0372, B:105:0x0378, B:63:0x026a, B:65:0x0287, B:66:0x0299, B:68:0x02a8, B:70:0x02af, B:72:0x02b5, B:73:0x02bb, B:75:0x02c1, B:76:0x02c7, B:78:0x02cd, B:79:0x02d3, B:81:0x02d9, B:82:0x02df, B:40:0x01d1, B:42:0x01ee, B:43:0x0200, B:45:0x020f, B:47:0x0216, B:49:0x021c, B:50:0x0222, B:52:0x0228, B:53:0x022e, B:55:0x0234, B:56:0x023a, B:58:0x0240, B:59:0x0246, B:17:0x0127, B:19:0x014e, B:21:0x0169, B:23:0x0178, B:24:0x017e, B:26:0x0184, B:27:0x018a, B:29:0x0190, B:30:0x0196, B:32:0x019c, B:33:0x01a2, B:35:0x01a8, B:36:0x01ae), top: B:305:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0cfc A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x004d, B:5:0x0086, B:9:0x00a2, B:11:0x00d0, B:12:0x00e4, B:16:0x010e, B:37:0x01b3, B:39:0x01c2, B:60:0x024c, B:62:0x025b, B:83:0x02e5, B:85:0x02f4, B:106:0x037e, B:108:0x03a6, B:110:0x03c1, B:112:0x03d6, B:114:0x03ed, B:116:0x041d, B:117:0x042f, B:119:0x0479, B:121:0x0493, B:123:0x04a9, B:125:0x04df, B:126:0x04f3, B:128:0x0540, B:129:0x0554, B:131:0x058d, B:132:0x059f, B:134:0x05b6, B:136:0x05cc, B:138:0x0636, B:140:0x064d, B:142:0x0675, B:143:0x0687, B:145:0x06af, B:146:0x06c1, B:148:0x06e6, B:149:0x06f8, B:151:0x0720, B:152:0x0732, B:154:0x075c, B:155:0x0770, B:157:0x0795, B:158:0x07a7, B:160:0x07d1, B:161:0x07e5, B:163:0x080f, B:164:0x0823, B:166:0x084b, B:167:0x085d, B:169:0x0882, B:170:0x0894, B:172:0x08bc, B:173:0x08ce, B:175:0x08f8, B:176:0x090c, B:178:0x0936, B:179:0x094a, B:181:0x0972, B:182:0x0984, B:184:0x09ac, B:185:0x09be, B:187:0x09f1, B:188:0x0a03, B:190:0x0a1a, B:191:0x0a2e, B:193:0x0a5d, B:194:0x0a70, B:196:0x0a81, B:213:0x0ac8, B:215:0x0aec, B:217:0x0b03, B:219:0x0b1a, B:221:0x0b33, B:223:0x0b60, B:224:0x0b73, B:226:0x0b84, B:241:0x0bc3, B:243:0x0be1, B:244:0x0bf4, B:246:0x0c03, B:260:0x0c3e, B:262:0x0c5f, B:263:0x0c72, B:265:0x0c81, B:279:0x0cbc, B:281:0x0cda, B:282:0x0ced, B:284:0x0cfc, B:298:0x0d37, B:285:0x0d02, B:287:0x0d08, B:288:0x0d0e, B:290:0x0d14, B:291:0x0d1a, B:293:0x0d20, B:294:0x0d26, B:296:0x0d2c, B:297:0x0d32, B:266:0x0c87, B:268:0x0c8d, B:269:0x0c93, B:271:0x0c99, B:272:0x0c9f, B:274:0x0ca5, B:275:0x0cab, B:277:0x0cb1, B:278:0x0cb7, B:247:0x0c09, B:249:0x0c0f, B:250:0x0c15, B:252:0x0c1b, B:253:0x0c21, B:255:0x0c27, B:256:0x0c2d, B:258:0x0c33, B:259:0x0c39, B:228:0x0b8c, B:230:0x0b92, B:231:0x0b98, B:233:0x0b9e, B:234:0x0ba4, B:236:0x0baa, B:237:0x0bb0, B:239:0x0bb8, B:240:0x0bbe, B:200:0x0a8d, B:202:0x0a93, B:203:0x0a99, B:205:0x0aa1, B:206:0x0aa7, B:208:0x0aaf, B:209:0x0ab5, B:211:0x0abd, B:212:0x0ac3, B:301:0x0d4f, B:302:0x0d56, B:86:0x0303, B:88:0x0320, B:89:0x0332, B:91:0x0341, B:93:0x0348, B:95:0x034e, B:96:0x0354, B:98:0x035a, B:99:0x0360, B:101:0x0366, B:102:0x036c, B:104:0x0372, B:105:0x0378, B:63:0x026a, B:65:0x0287, B:66:0x0299, B:68:0x02a8, B:70:0x02af, B:72:0x02b5, B:73:0x02bb, B:75:0x02c1, B:76:0x02c7, B:78:0x02cd, B:79:0x02d3, B:81:0x02d9, B:82:0x02df, B:40:0x01d1, B:42:0x01ee, B:43:0x0200, B:45:0x020f, B:47:0x0216, B:49:0x021c, B:50:0x0222, B:52:0x0228, B:53:0x022e, B:55:0x0234, B:56:0x023a, B:58:0x0240, B:59:0x0246, B:17:0x0127, B:19:0x014e, B:21:0x0169, B:23:0x0178, B:24:0x017e, B:26:0x0184, B:27:0x018a, B:29:0x0190, B:30:0x0196, B:32:0x019c, B:33:0x01a2, B:35:0x01a8, B:36:0x01ae), top: B:305:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0d02 A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:3:0x004d, B:5:0x0086, B:9:0x00a2, B:11:0x00d0, B:12:0x00e4, B:16:0x010e, B:37:0x01b3, B:39:0x01c2, B:60:0x024c, B:62:0x025b, B:83:0x02e5, B:85:0x02f4, B:106:0x037e, B:108:0x03a6, B:110:0x03c1, B:112:0x03d6, B:114:0x03ed, B:116:0x041d, B:117:0x042f, B:119:0x0479, B:121:0x0493, B:123:0x04a9, B:125:0x04df, B:126:0x04f3, B:128:0x0540, B:129:0x0554, B:131:0x058d, B:132:0x059f, B:134:0x05b6, B:136:0x05cc, B:138:0x0636, B:140:0x064d, B:142:0x0675, B:143:0x0687, B:145:0x06af, B:146:0x06c1, B:148:0x06e6, B:149:0x06f8, B:151:0x0720, B:152:0x0732, B:154:0x075c, B:155:0x0770, B:157:0x0795, B:158:0x07a7, B:160:0x07d1, B:161:0x07e5, B:163:0x080f, B:164:0x0823, B:166:0x084b, B:167:0x085d, B:169:0x0882, B:170:0x0894, B:172:0x08bc, B:173:0x08ce, B:175:0x08f8, B:176:0x090c, B:178:0x0936, B:179:0x094a, B:181:0x0972, B:182:0x0984, B:184:0x09ac, B:185:0x09be, B:187:0x09f1, B:188:0x0a03, B:190:0x0a1a, B:191:0x0a2e, B:193:0x0a5d, B:194:0x0a70, B:196:0x0a81, B:213:0x0ac8, B:215:0x0aec, B:217:0x0b03, B:219:0x0b1a, B:221:0x0b33, B:223:0x0b60, B:224:0x0b73, B:226:0x0b84, B:241:0x0bc3, B:243:0x0be1, B:244:0x0bf4, B:246:0x0c03, B:260:0x0c3e, B:262:0x0c5f, B:263:0x0c72, B:265:0x0c81, B:279:0x0cbc, B:281:0x0cda, B:282:0x0ced, B:284:0x0cfc, B:298:0x0d37, B:285:0x0d02, B:287:0x0d08, B:288:0x0d0e, B:290:0x0d14, B:291:0x0d1a, B:293:0x0d20, B:294:0x0d26, B:296:0x0d2c, B:297:0x0d32, B:266:0x0c87, B:268:0x0c8d, B:269:0x0c93, B:271:0x0c99, B:272:0x0c9f, B:274:0x0ca5, B:275:0x0cab, B:277:0x0cb1, B:278:0x0cb7, B:247:0x0c09, B:249:0x0c0f, B:250:0x0c15, B:252:0x0c1b, B:253:0x0c21, B:255:0x0c27, B:256:0x0c2d, B:258:0x0c33, B:259:0x0c39, B:228:0x0b8c, B:230:0x0b92, B:231:0x0b98, B:233:0x0b9e, B:234:0x0ba4, B:236:0x0baa, B:237:0x0bb0, B:239:0x0bb8, B:240:0x0bbe, B:200:0x0a8d, B:202:0x0a93, B:203:0x0a99, B:205:0x0aa1, B:206:0x0aa7, B:208:0x0aaf, B:209:0x0ab5, B:211:0x0abd, B:212:0x0ac3, B:301:0x0d4f, B:302:0x0d56, B:86:0x0303, B:88:0x0320, B:89:0x0332, B:91:0x0341, B:93:0x0348, B:95:0x034e, B:96:0x0354, B:98:0x035a, B:99:0x0360, B:101:0x0366, B:102:0x036c, B:104:0x0372, B:105:0x0378, B:63:0x026a, B:65:0x0287, B:66:0x0299, B:68:0x02a8, B:70:0x02af, B:72:0x02b5, B:73:0x02bb, B:75:0x02c1, B:76:0x02c7, B:78:0x02cd, B:79:0x02d3, B:81:0x02d9, B:82:0x02df, B:40:0x01d1, B:42:0x01ee, B:43:0x0200, B:45:0x020f, B:47:0x0216, B:49:0x021c, B:50:0x0222, B:52:0x0228, B:53:0x022e, B:55:0x0234, B:56:0x023a, B:58:0x0240, B:59:0x0246, B:17:0x0127, B:19:0x014e, B:21:0x0169, B:23:0x0178, B:24:0x017e, B:26:0x0184, B:27:0x018a, B:29:0x0190, B:30:0x0196, B:32:0x019c, B:33:0x01a2, B:35:0x01a8, B:36:0x01ae), top: B:305:0x004d }] */
    @Override // expo.modules.kotlin.modules.Module
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ModuleDefinitionData definition() {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        Class cls5;
        String str;
        AsyncFunctionComponent intAsyncFunctionComponent;
        AsyncFunctionComponent intAsyncFunctionComponent2;
        AsyncFunctionComponent intAsyncFunctionComponent3;
        AsyncFunctionComponent intAsyncFunctionComponent4;
        Object obj;
        AnyTypeProvider anyTypeProvider;
        Class cls6;
        Class cls7;
        Class cls8;
        Class cls9;
        Class cls10;
        Class cls11;
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AnyType anyType;
        ViewDefinitionBuilder viewDefinitionBuilder;
        AnyType anyType2;
        Class cls12;
        AnyType anyType3;
        Object obj2;
        Class cls13;
        AsyncFunctionComponent stringAsyncFunctionComponent2;
        AnyType anyType4;
        AnyType anyType5;
        AnyType anyType6;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder2.Name("ExpoCamera");
            moduleDefinitionBuilder2.Events("onModernBarcodeScanned");
            PropertyComponentBuilder propertyComponentBuilder = new PropertyComponentBuilder("isModernBarcodeScannerAvailable");
            AnyType[] anyTypeArr = new AnyType[0];
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Boolean.class));
            if (returnType == null) {
                returnType = new ReturnType(D.b(Boolean.class));
                cls = PictureRef.class;
                returnTypeProvider.getTypes().put(D.b(Boolean.class), returnType);
            } else {
                cls = PictureRef.class;
            }
            propertyComponentBuilder.setGetter(new SyncFunctionComponent("get", anyTypeArr, returnType, new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return Boolean.valueOf(!VRUtilities.INSTANCE.isQuest() && CameraUtils.INSTANCE.isMLKitAvailable(this.this$0.getAppContext().getReactContext()));
                }
            }));
            moduleDefinitionBuilder2.getProperties().put("isModernBarcodeScannerAvailable", propertyComponentBuilder);
            PropertyComponentBuilder propertyComponentBuilder2 = new PropertyComponentBuilder("toggleRecordingAsyncAvailable");
            AnyType[] anyTypeArr2 = new AnyType[0];
            ReturnType returnType2 = returnTypeProvider.getTypes().get(D.b(Boolean.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(D.b(Boolean.class));
                returnTypeProvider.getTypes().put(D.b(Boolean.class), returnType2);
            }
            propertyComponentBuilder2.setGetter(new SyncFunctionComponent("get", anyTypeArr2, returnType2, new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$Property$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return Boolean.TRUE;
                }
            }));
            moduleDefinitionBuilder2.getProperties().put("toggleRecordingAsyncAvailable", propertyComponentBuilder2);
            boolean zB = AbstractC2855l.b(Promise.class, Promise.class);
            Class cls14 = Integer.TYPE;
            Class cls15 = Float.TYPE;
            Class cls16 = Double.TYPE;
            Class cls17 = Boolean.TYPE;
            if (zB) {
                cls2 = Integer.class;
                cls3 = ExpoCameraView.class;
                cls4 = Boolean.class;
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("requestCameraPermissionsAsync", new AnyType[0], new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) throws Exceptions.PermissionsModuleNotFound {
                        invoke((Object[]) obj3, (Promise) obj4);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) throws Exceptions.PermissionsModuleNotFound {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        Permissions permissionsManager = this.this$0.getPermissionsManager();
                        String[] cameraPermissions = CameraViewModuleKt.getCameraPermissions();
                        Permissions.askForPermissionsWithPermissionsManager(permissionsManager, promise, (String[]) Arrays.copyOf(cameraPermissions, cameraPermissions.length));
                    }
                });
                cls5 = List.class;
                str = "get";
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
            } else {
                cls2 = Integer.class;
                cls3 = ExpoCameraView.class;
                cls4 = Boolean.class;
                TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
                AnyType anyType7 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Promise.class), Boolean.FALSE));
                if (anyType7 == null) {
                    cls5 = List.class;
                    str = "get";
                    anyType7 = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters);
                } else {
                    cls5 = List.class;
                    str = "get";
                }
                AnyType[] anyTypeArr3 = {anyType7};
                Function1 function1 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) throws Exceptions.PermissionsModuleNotFound {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        Permissions permissionsManager = this.this$0.getPermissionsManager();
                        String[] cameraPermissions = CameraViewModuleKt.getCameraPermissions();
                        Permissions.askForPermissionsWithPermissionsManager(permissionsManager, promise, (String[]) Arrays.copyOf(cameraPermissions, cameraPermissions.length));
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent = AbstractC2855l.b(C2735B.class, cls14) ? new IntAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1) : AbstractC2855l.b(C2735B.class, cls17) ? new BoolAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1) : AbstractC2855l.b(C2735B.class, cls16) ? new DoubleAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1) : AbstractC2855l.b(C2735B.class, cls15) ? new FloatAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1) : new UntypedAsyncFunctionComponent("requestCameraPermissionsAsync", anyTypeArr3, function1);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("requestCameraPermissionsAsync", intAsyncFunctionComponent);
            if (AbstractC2855l.b(Promise.class, Promise.class)) {
                intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("requestMicrophonePermissionsAsync", new AnyType[0], new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                        invoke((Object[]) obj3, (Promise) obj4);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        Permissions.askForPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.RECORD_AUDIO");
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
                AnyType anyType8 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Promise.class), Boolean.FALSE));
                if (anyType8 == null) {
                    anyType8 = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$5
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters2);
                }
                AnyType[] anyTypeArr4 = {anyType8};
                Function1 function12 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Permissions.askForPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), (Promise) objArr[0], "android.permission.RECORD_AUDIO");
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent2 = AbstractC2855l.b(C2735B.class, cls14) ? new IntAsyncFunctionComponent("requestMicrophonePermissionsAsync", anyTypeArr4, function12) : AbstractC2855l.b(C2735B.class, cls17) ? new BoolAsyncFunctionComponent("requestMicrophonePermissionsAsync", anyTypeArr4, function12) : AbstractC2855l.b(C2735B.class, cls16) ? new DoubleAsyncFunctionComponent("requestMicrophonePermissionsAsync", anyTypeArr4, function12) : AbstractC2855l.b(C2735B.class, cls15) ? new FloatAsyncFunctionComponent("requestMicrophonePermissionsAsync", anyTypeArr4, function12) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("requestMicrophonePermissionsAsync", anyTypeArr4, function12) : new UntypedAsyncFunctionComponent("requestMicrophonePermissionsAsync", anyTypeArr4, function12);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("requestMicrophonePermissionsAsync", intAsyncFunctionComponent2);
            if (AbstractC2855l.b(Promise.class, Promise.class)) {
                intAsyncFunctionComponent3 = new AsyncFunctionWithPromiseComponent("getCameraPermissionsAsync", new AnyType[0], new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) throws Exceptions.PermissionsModuleNotFound {
                        invoke((Object[]) obj3, (Promise) obj4);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) throws Exceptions.PermissionsModuleNotFound {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        Permissions permissionsManager = this.this$0.getPermissionsManager();
                        String[] cameraPermissions = CameraViewModuleKt.getCameraPermissions();
                        Permissions.getPermissionsWithPermissionsManager(permissionsManager, promise, (String[]) Arrays.copyOf(cameraPermissions, cameraPermissions.length));
                    }
                });
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
                AnyType anyType9 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Promise.class), Boolean.FALSE));
                if (anyType9 == null) {
                    anyType9 = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$8
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters3);
                }
                AnyType[] anyTypeArr5 = {anyType9};
                Function1 function13 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$9
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) throws Exceptions.PermissionsModuleNotFound {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        Permissions permissionsManager = this.this$0.getPermissionsManager();
                        String[] cameraPermissions = CameraViewModuleKt.getCameraPermissions();
                        Permissions.getPermissionsWithPermissionsManager(permissionsManager, promise, (String[]) Arrays.copyOf(cameraPermissions, cameraPermissions.length));
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent3 = AbstractC2855l.b(C2735B.class, cls14) ? new IntAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr5, function13) : AbstractC2855l.b(C2735B.class, cls17) ? new BoolAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr5, function13) : AbstractC2855l.b(C2735B.class, cls16) ? new DoubleAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr5, function13) : AbstractC2855l.b(C2735B.class, cls15) ? new FloatAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr5, function13) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr5, function13) : new UntypedAsyncFunctionComponent("getCameraPermissionsAsync", anyTypeArr5, function13);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getCameraPermissionsAsync", intAsyncFunctionComponent3);
            if (AbstractC2855l.b(Promise.class, Promise.class)) {
                intAsyncFunctionComponent4 = new AsyncFunctionWithPromiseComponent("getMicrophonePermissionsAsync", new AnyType[0], new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$10
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                        invoke((Object[]) obj3, (Promise) obj4);
                        return C2735B.f28704a;
                    }

                    public final void invoke(Object[] objArr, Promise promise) {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        Permissions.getPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), promise, "android.permission.RECORD_AUDIO");
                    }
                });
            } else {
                TypeConverterProvider converters4 = moduleDefinitionBuilder.getConverters();
                AnyType anyType10 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(D.b(Promise.class), Boolean.FALSE));
                if (anyType10 == null) {
                    anyType10 = new AnyType(new LazyKType(D.b(Promise.class), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$11
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(Promise.class);
                        }
                    }), converters4);
                }
                AnyType[] anyTypeArr6 = {anyType10};
                Function1 function14 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$12
                    @Override // kotlin.jvm.functions.Function1
                    public final C2735B invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        Permissions.getPermissionsWithPermissionsManager(this.this$0.getPermissionsManager(), (Promise) objArr[0], "android.permission.RECORD_AUDIO");
                        return C2735B.f28704a;
                    }
                };
                intAsyncFunctionComponent4 = AbstractC2855l.b(C2735B.class, cls14) ? new IntAsyncFunctionComponent("getMicrophonePermissionsAsync", anyTypeArr6, function14) : AbstractC2855l.b(C2735B.class, cls17) ? new BoolAsyncFunctionComponent("getMicrophonePermissionsAsync", anyTypeArr6, function14) : AbstractC2855l.b(C2735B.class, cls16) ? new DoubleAsyncFunctionComponent("getMicrophonePermissionsAsync", anyTypeArr6, function14) : AbstractC2855l.b(C2735B.class, cls15) ? new FloatAsyncFunctionComponent("getMicrophonePermissionsAsync", anyTypeArr6, function14) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("getMicrophonePermissionsAsync", anyTypeArr6, function14) : new UntypedAsyncFunctionComponent("getMicrophonePermissionsAsync", anyTypeArr6, function14);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getMicrophonePermissionsAsync", intAsyncFunctionComponent4);
            TypeConverterProvider converters5 = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
            C7.d dVarB = D.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType11 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType11 == null) {
                anyTypeProvider = anyTypeProvider2;
                obj = C2735B.class;
                anyType11 = new AnyType(new LazyKType(D.b(String.class), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters5);
            } else {
                obj = C2735B.class;
                anyTypeProvider = anyTypeProvider2;
            }
            AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType12 == null) {
                cls6 = String.class;
                anyType12 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.p(List.class, q.f518c.d(D.o(BarcodeType.class)));
                    }
                }), converters5);
            } else {
                cls6 = String.class;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("scanFromURLAsync", new AsyncFunctionWithPromiseComponent("scanFromURLAsync", new AnyType[]{anyType11, anyType12}, new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$3
                public final void invoke(Object[] objArr, final Promise promise) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj3 = objArr[0];
                    final List list = (List) objArr[1];
                    final String str2 = (String) obj3;
                    if (!CameraUtils.INSTANCE.isMLKitAvailable(this.this$0.getAppContext().getReactContext())) {
                        promise.reject(new CameraExceptions.MLKitUnavailableException());
                        return;
                    }
                    Service service = this.this$0.getAppContext().getServices().getRegistry().get(ImageLoaderInterface.class);
                    if (!(service instanceof ImageLoaderInterface)) {
                        service = null;
                    }
                    ImageLoaderInterface imageLoaderInterface = (ImageLoaderInterface) service;
                    if (imageLoaderInterface != null) {
                        final CameraViewModule cameraViewModule = this.this$0;
                        imageLoaderInterface.loadImageForManipulationFromURL(str2, new ImageLoaderInterface.ResultListener() { // from class: expo.modules.camera.CameraViewModule$definition$1$7$1
                            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
                            public void onFailure(Throwable cause) {
                                promise.reject(new CameraExceptions.ImageRetrievalException(str2));
                            }

                            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
                            public void onSuccess(Bitmap bitmap) {
                                AbstractC2855l.g(bitmap, "bitmap");
                                try {
                                    MLKitBarCodeScanner mLKitBarCodeScanner = new MLKitBarCodeScanner();
                                    List<BarcodeType> list2 = list;
                                    ArrayList arrayList = new ArrayList(AbstractC2800q.u(list2, 10));
                                    Iterator<T> it = list2.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(Integer.valueOf(((BarcodeType) it.next()).mapToBarcode()));
                                    }
                                    mLKitBarCodeScanner.setSettings(arrayList);
                                    AbstractC1417k.d(cameraViewModule.moduleScope, null, null, new CameraViewModule$definition$1$7$1$onSuccess$1(mLKitBarCodeScanner, bitmap, promise, arrayList, null), 3, null);
                                } catch (Exception unused) {
                                    promise.reject(new CameraExceptions.MLKitUnavailableException());
                                }
                            }
                        });
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((Object[]) obj3, (Promise) obj4);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters6 = moduleDefinitionBuilder.getConverters();
            AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(D.b(BarcodeSettings.class), bool));
            if (anyType13 == null) {
                anyType13 = new AnyType(new LazyKType(D.b(BarcodeSettings.class), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(BarcodeSettings.class);
                    }
                }), converters6);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("launchScanner", new AsyncFunctionWithPromiseComponent("launchScanner", new AnyType[]{anyType13}, new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$5
                public final void invoke(Object[] objArr, final Promise promise) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    BarcodeSettings barcodeSettings = (BarcodeSettings) objArr[0];
                    CameraUtils cameraUtils = CameraUtils.INSTANCE;
                    if (!cameraUtils.isMLKitBarcodeScannerAvailable()) {
                        promise.reject(new CameraExceptions.MLKitUnavailableException());
                        return;
                    }
                    if (!cameraUtils.hasGooglePlayServices(this.this$0.getAppContext().getReactContext())) {
                        promise.reject(new CameraExceptions.GooglePlayServicesUnavailableException());
                        return;
                    }
                    Context reactContext = this.this$0.getAppContext().getReactContext();
                    if (reactContext == null) {
                        promise.reject(new Exceptions.ReactContextLost());
                        return;
                    }
                    try {
                        C2731b.a aVar = new C2731b.a();
                        if (!barcodeSettings.getBarcodeTypes().isEmpty()) {
                            int iMapToBarcode = ((BarcodeType) AbstractC2800q.e0(barcodeSettings.getBarcodeTypes())).mapToBarcode();
                            List listZ = AbstractC2800q.Z(barcodeSettings.getBarcodeTypes(), 1);
                            ArrayList arrayList = new ArrayList(AbstractC2800q.u(listZ, 10));
                            Iterator it = listZ.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Integer.valueOf(((BarcodeType) it.next()).mapToBarcode()));
                            }
                            int[] iArrO0 = AbstractC2800q.O0(arrayList);
                            aVar.b(iMapToBarcode, Arrays.copyOf(iArrO0, iArrO0.length));
                        }
                        C2731b c2731bA = aVar.a();
                        AbstractC2855l.f(c2731bA, "build(...)");
                        InterfaceC2730a interfaceC2730aA = AbstractC2732c.a(reactContext, c2731bA);
                        AbstractC2855l.f(interfaceC2730aA, "getClient(...)");
                        AbstractC1378l abstractC1378lM = interfaceC2730aA.m();
                        final CameraViewModule cameraViewModule = this.this$0;
                        final Function1 function15 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$1$8$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                invoke((C2615a) obj3);
                                return C2735B.f28704a;
                            }

                            public final void invoke(C2615a c2615a) {
                                BarCodeScannerResultSerializer barCodeScannerResultSerializer = BarCodeScannerResultSerializer.INSTANCE;
                                AbstractC2855l.d(c2615a);
                                cameraViewModule.sendEvent("onModernBarcodeScanned", barCodeScannerResultSerializer.toBundle(BarCodeScannerResultSerializer.parseBarcodeScanningResult$default(barCodeScannerResultSerializer, c2615a, null, 2, null), 1.0f));
                                promise.resolve();
                            }
                        };
                        AbstractC2855l.d(abstractC1378lM.g(new InterfaceC1374h(function15) { // from class: expo.modules.camera.CameraViewModuleKt$sam$com_google_android_gms_tasks_OnSuccessListener$0
                            private final /* synthetic */ Function1 function;

                            {
                                AbstractC2855l.g(function15, "function");
                                this.function = function15;
                            }

                            @Override // P4.InterfaceC1374h
                            public final /* synthetic */ void onSuccess(Object obj3) {
                                this.function.invoke(obj3);
                            }
                        }).a(new InterfaceC1371e() { // from class: expo.modules.camera.CameraViewModule$definition$1$8$2
                            @Override // P4.InterfaceC1371e
                            public final void onCanceled() {
                                promise.reject(new CameraExceptions.BarcodeScanningCancelledException());
                            }
                        }).e(new InterfaceC1373g() { // from class: expo.modules.camera.CameraViewModule$definition$1$8$3
                            @Override // P4.InterfaceC1373g
                            public final void onFailure(Exception it2) {
                                AbstractC2855l.g(it2, "it");
                                promise.reject(new CameraExceptions.BarcodeScanningFailedException());
                            }
                        }));
                    } catch (Exception unused) {
                        promise.reject(new CameraExceptions.GooglePlayServicesUnavailableException());
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((Object[]) obj3, (Promise) obj4);
                    return C2735B.f28704a;
                }
            }));
            moduleDefinitionBuilder.getAsyncFunctions().put("dismissScanner", new UntypedAsyncFunctionComponent("dismissScanner", new AnyType[0], new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithoutArgs$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return C2735B.f28704a;
                }
            }));
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_DESTROY;
            eventListeners.put(eventName, new BasicEventListener(eventName, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$OnDestroy$1
                @Override // w7.InterfaceC3487a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m25invoke();
                    return C2735B.f28704a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m25invoke() {
                    try {
                        O.b(this.this$0.moduleScope, new ModuleDestroyedException(null, 1, null));
                    } catch (IllegalStateException unused) {
                        String unused2 = CameraViewModule.TAG;
                    }
                }
            }));
            C7.d dVarB2 = D.b(cls);
            Module module = moduleDefinitionBuilder.getModule();
            if (module == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AppContext appContext = module.getAppContext();
            AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool));
            ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, "Picture", dVarB2, anyType14 == null ? new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$Class$1
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    return D.o(PictureRef.class);
                }
            }), null) : anyType14, moduleDefinitionBuilder.getConverters());
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "width");
            AnyType[] anyTypeArr7 = {new AnyType(propertyComponentBuilderWithThis.getThisType(), null, 2, null)};
            ReturnType returnType3 = returnTypeProvider.getTypes().get(D.b(cls2));
            if (returnType3 == null) {
                returnType3 = new ReturnType(D.b(cls2));
                returnTypeProvider.getTypes().put(D.b(cls2), returnType3);
            }
            String str2 = str;
            SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(str2, anyTypeArr7, returnType3, new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$18$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return Integer.valueOf(((PictureRef) it[0]).getRef().getWidth());
                }
            });
            syncFunctionComponent.setOwnerType(propertyComponentBuilderWithThis.getThisType());
            syncFunctionComponent.setCanTakeOwner(true);
            propertyComponentBuilderWithThis.setGetter(syncFunctionComponent);
            classComponentBuilder.getProperties().put("width", propertyComponentBuilderWithThis);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis2 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "height");
            AnyType[] anyTypeArr8 = {new AnyType(propertyComponentBuilderWithThis2.getThisType(), null, 2, null)};
            ReturnType returnType4 = returnTypeProvider.getTypes().get(D.b(cls2));
            if (returnType4 == null) {
                returnType4 = new ReturnType(D.b(cls2));
                returnTypeProvider.getTypes().put(D.b(cls2), returnType4);
            }
            SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(str2, anyTypeArr8, returnType4, new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$18$$inlined$Property$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return Integer.valueOf(((PictureRef) it[0]).getRef().getHeight());
                }
            });
            syncFunctionComponent2.setOwnerType(propertyComponentBuilderWithThis2.getThisType());
            syncFunctionComponent2.setCanTakeOwner(true);
            propertyComponentBuilderWithThis2.setGetter(syncFunctionComponent2);
            classComponentBuilder.getProperties().put("height", propertyComponentBuilderWithThis2);
            TypeConverterProvider converters7 = classComponentBuilder.getConverters();
            AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool));
            if (anyType15 == null) {
                anyType15 = new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$18$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(PictureRef.class);
                    }
                }), converters7);
            }
            C7.d dVarB3 = D.b(SavePictureOptions.class);
            Boolean bool2 = Boolean.TRUE;
            AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, bool2));
            if (anyType16 == null) {
                cls7 = cls15;
                anyType16 = new AnyType(new LazyKType(D.b(SavePictureOptions.class), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$18$$inlined$AsyncFunctionWithPromise$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(SavePictureOptions.class);
                    }
                }), converters7);
            } else {
                cls7 = cls15;
            }
            classComponentBuilder.getAsyncFunctions().put("savePictureAsync", new AsyncFunctionWithPromiseComponent("savePictureAsync", new AnyType[]{anyType15, anyType16}, new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$18$$inlined$AsyncFunctionWithPromise$3
                public final void invoke(Object[] objArr, Promise promise) throws IOException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj3 = objArr[0];
                    SavePictureOptions savePictureOptions = (SavePictureOptions) objArr[1];
                    Bitmap ref = ((PictureRef) obj3).getRef();
                    Bundle bundle = new Bundle();
                    File cacheDirectory = this.this$0.getCacheDirectory();
                    bundle.putInt("width", ref.getWidth());
                    bundle.putInt("height", ref.getHeight());
                    Number numberValueOf = savePictureOptions != null ? Double.valueOf(savePictureOptions.getQuality()) : 1;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ref.compress(Bitmap.CompressFormat.JPEG, numberValueOf.intValue() * 100, byteArrayOutputStream);
                        try {
                            String strWriteStreamToFile$default = ResolveTakenPictureKt.writeStreamToFile$default(cacheDirectory, byteArrayOutputStream, null, 4, null);
                            ref.recycle();
                            String string = Uri.fromFile(new File(strWriteStreamToFile$default)).toString();
                            AbstractC2855l.f(string, "toString(...)");
                            bundle.putString("uri", string);
                            if (savePictureOptions != null && savePictureOptions.getBase64()) {
                                bundle.putString("base64", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                            }
                            promise.resolve(bundle);
                        } catch (CodedException e10) {
                            promise.reject(e10);
                        }
                        C2735B c2735b = C2735B.f28704a;
                        AbstractC3376c.a(byteArrayOutputStream, null);
                    } finally {
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) throws IOException {
                    invoke((Object[]) obj3, (Promise) obj4);
                    return C2735B.f28704a;
                }
            }));
            moduleDefinitionBuilder.getClassData().add(classComponentBuilder.buildClass());
            final ViewDefinitionBuilder viewDefinitionBuilder2 = new ViewDefinitionBuilder(D.b(cls3), new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$$inlined$View$1
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    return D.o(ExpoCameraView.class);
                }
            }, 2, null), moduleDefinitionBuilder.getConverters());
            CSSPropsKt.UseCSSProps(viewDefinitionBuilder2);
            viewDefinitionBuilder2.EventsWithArray(CameraViewModuleKt.getCameraEvents());
            Function2 function2 = new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((ExpoCameraView) obj3, (CameraType) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoCameraView view, CameraType cameraType) {
                    AbstractC2855l.g(view, "view");
                    if (cameraType != null) {
                        if (view.getLensFacing() != cameraType) {
                            view.setLensFacing(cameraType);
                        }
                    } else {
                        CameraType lensFacing = view.getLensFacing();
                        CameraType cameraType2 = CameraType.BACK;
                        if (lensFacing != cameraType2) {
                            view.setLensFacing(cameraType2);
                        }
                    }
                }
            };
            Map<String, AnyViewProp> props = viewDefinitionBuilder2.getProps();
            AnyType anyType17 = anyTypeProvider.getTypesMap().get(new Pair(D.b(CameraType.class), bool2));
            if (anyType17 == null) {
                cls8 = cls16;
                anyType17 = new AnyType(new LazyKType(D.b(CameraType.class), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(CameraType.class);
                    }
                }), null);
            } else {
                cls8 = cls16;
            }
            props.put("facing", new ConcreteViewProp("facing", anyType17, function2));
            Function2 function22 = new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((ExpoCameraView) obj3, (FlashMode) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoCameraView view, FlashMode flashMode) {
                    AbstractC2855l.g(view, "view");
                    if (flashMode != null) {
                        if (view.getFlashMode() != flashMode) {
                            view.setFlashMode(flashMode);
                        }
                    } else {
                        FlashMode flashMode2 = view.getFlashMode();
                        FlashMode flashMode3 = FlashMode.OFF;
                        if (flashMode2 != flashMode3) {
                            view.setFlashMode(flashMode3);
                        }
                    }
                }
            };
            Map<String, AnyViewProp> props2 = viewDefinitionBuilder2.getProps();
            AnyType anyType18 = anyTypeProvider.getTypesMap().get(new Pair(D.b(FlashMode.class), bool2));
            if (anyType18 == null) {
                anyType18 = new AnyType(new LazyKType(D.b(FlashMode.class), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(FlashMode.class);
                    }
                }), null);
            }
            props2.put("flashMode", new ConcreteViewProp("flashMode", anyType18, function22));
            Function2 function23 = new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((ExpoCameraView) obj3, (Boolean) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoCameraView view, Boolean bool3) {
                    AbstractC2855l.g(view, "view");
                    if (bool3 == null) {
                        if (view.getEnableTorch()) {
                            view.setEnableTorch(false);
                        }
                    } else {
                        boolean zBooleanValue = bool3.booleanValue();
                        if (view.getEnableTorch() != zBooleanValue) {
                            view.setEnableTorch(zBooleanValue);
                        }
                    }
                }
            };
            Map<String, AnyViewProp> props3 = viewDefinitionBuilder2.getProps();
            AnyType anyType19 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool2));
            if (anyType19 == null) {
                anyType19 = new AnyType(new LazyKType(D.b(cls4), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Boolean.class);
                    }
                }), null);
            }
            props3.put("enableTorch", new ConcreteViewProp("enableTorch", anyType19, function23));
            CameraViewModule$definition$1$12$4 cameraViewModule$definition$1$12$4 = new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((ExpoCameraView) obj3, (Boolean) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoCameraView view, Boolean bool3) {
                    AbstractC2855l.g(view, "view");
                    view.setAnimateShutter(bool3 != null ? bool3.booleanValue() : true);
                }
            };
            Map<String, AnyViewProp> props4 = viewDefinitionBuilder2.getProps();
            AnyType anyType20 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool2));
            if (anyType20 == null) {
                anyType20 = new AnyType(new LazyKType(D.b(cls4), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Boolean.class);
                    }
                }), null);
            }
            props4.put("animateShutter", new ConcreteViewProp("animateShutter", anyType20, cameraViewModule$definition$1$12$4));
            Function2 function24 = new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((ExpoCameraView) obj3, (Float) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoCameraView view, Float f10) {
                    AbstractC2855l.g(view, "view");
                    if (f10 == null) {
                        if (view.getZoom() == 0.0f) {
                            return;
                        }
                        view.setZoom(0.0f);
                    } else {
                        float fFloatValue = f10.floatValue();
                        if (view.getZoom() == fFloatValue) {
                            return;
                        }
                        view.setZoom(fFloatValue);
                    }
                }
            };
            Map<String, AnyViewProp> props5 = viewDefinitionBuilder2.getProps();
            AnyType anyType21 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Float.class), bool2));
            if (anyType21 == null) {
                anyType21 = new AnyType(new LazyKType(D.b(Float.class), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Float.class);
                    }
                }), null);
            }
            props5.put("zoom", new ConcreteViewProp("zoom", anyType21, function24));
            Function2 function25 = new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((ExpoCameraView) obj3, (CameraMode) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoCameraView view, CameraMode cameraMode) {
                    AbstractC2855l.g(view, "view");
                    if (cameraMode != null) {
                        if (view.getCameraMode() != cameraMode) {
                            view.setCameraMode(cameraMode);
                        }
                    } else {
                        CameraMode cameraMode2 = view.getCameraMode();
                        CameraMode cameraMode3 = CameraMode.PICTURE;
                        if (cameraMode2 != cameraMode3) {
                            view.setCameraMode(cameraMode3);
                        }
                    }
                }
            };
            Map<String, AnyViewProp> props6 = viewDefinitionBuilder2.getProps();
            AnyType anyType22 = anyTypeProvider.getTypesMap().get(new Pair(D.b(CameraMode.class), bool2));
            if (anyType22 == null) {
                anyType22 = new AnyType(new LazyKType(D.b(CameraMode.class), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$6
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(CameraMode.class);
                    }
                }), null);
            }
            props6.put("mode", new ConcreteViewProp("mode", anyType22, function25));
            CameraViewModule$definition$1$12$7 cameraViewModule$definition$1$12$7 = new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((ExpoCameraView) obj3, (Boolean) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoCameraView view, Boolean bool3) {
                    AbstractC2855l.g(view, "view");
                    view.setMute(bool3 != null ? bool3.booleanValue() : false);
                }
            };
            Map<String, AnyViewProp> props7 = viewDefinitionBuilder2.getProps();
            AnyType anyType23 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool2));
            if (anyType23 == null) {
                anyType23 = new AnyType(new LazyKType(D.b(cls4), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$7
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Boolean.class);
                    }
                }), null);
            }
            props7.put("mute", new ConcreteViewProp("mute", anyType23, cameraViewModule$definition$1$12$7));
            Function2 function26 = new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$8
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((ExpoCameraView) obj3, (VideoQuality) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoCameraView view, VideoQuality videoQuality) {
                    AbstractC2855l.g(view, "view");
                    if (videoQuality != null) {
                        if (view.getVideoQuality() != videoQuality) {
                            view.setVideoQuality(videoQuality);
                        }
                    } else {
                        VideoQuality videoQuality2 = view.getVideoQuality();
                        VideoQuality videoQuality3 = VideoQuality.VIDEO1080P;
                        if (videoQuality2 != videoQuality3) {
                            view.setVideoQuality(videoQuality3);
                        }
                    }
                }
            };
            Map<String, AnyViewProp> props8 = viewDefinitionBuilder2.getProps();
            AnyType anyType24 = anyTypeProvider.getTypesMap().get(new Pair(D.b(VideoQuality.class), bool2));
            if (anyType24 == null) {
                anyType24 = new AnyType(new LazyKType(D.b(VideoQuality.class), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$8
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(VideoQuality.class);
                    }
                }), null);
            }
            props8.put("videoQuality", new ConcreteViewProp("videoQuality", anyType24, function26));
            Function2 function27 = new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$9
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((ExpoCameraView) obj3, (VideoStabilizationMode) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoCameraView view, VideoStabilizationMode videoStabilizationMode) {
                    AbstractC2855l.g(view, "view");
                    if (videoStabilizationMode != null) {
                        if (view.getVideoStabilizationMode() != videoStabilizationMode) {
                            view.setVideoStabilizationMode(videoStabilizationMode);
                        }
                    } else {
                        VideoStabilizationMode videoStabilizationMode2 = view.getVideoStabilizationMode();
                        VideoStabilizationMode videoStabilizationMode3 = VideoStabilizationMode.AUTO;
                        if (videoStabilizationMode2 != videoStabilizationMode3) {
                            view.setVideoStabilizationMode(videoStabilizationMode3);
                        }
                    }
                }
            };
            Map<String, AnyViewProp> props9 = viewDefinitionBuilder2.getProps();
            AnyType anyType25 = anyTypeProvider.getTypesMap().get(new Pair(D.b(VideoStabilizationMode.class), bool2));
            if (anyType25 == null) {
                anyType25 = new AnyType(new LazyKType(D.b(VideoStabilizationMode.class), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$9
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(VideoStabilizationMode.class);
                    }
                }), null);
            }
            props9.put("videoStabilizationMode", new ConcreteViewProp("videoStabilizationMode", anyType25, function27));
            Function2 function28 = new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$10
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((ExpoCameraView) obj3, (BarcodeSettings) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoCameraView view, BarcodeSettings barcodeSettings) {
                    AbstractC2855l.g(view, "view");
                    if (CameraUtils.INSTANCE.isMLKitBarcodeScannerAvailable()) {
                        if (barcodeSettings != null) {
                            view.setBarcodeScannerSettings(barcodeSettings);
                        }
                    } else {
                        Logger jsLogger = this.this$0.getAppContext().getJsLogger();
                        if (jsLogger != null) {
                            Logger.warn$default(jsLogger, "Barcode scanning has been disabled", null, 2, null);
                        }
                    }
                }
            };
            Map<String, AnyViewProp> props10 = viewDefinitionBuilder2.getProps();
            AnyType anyType26 = anyTypeProvider.getTypesMap().get(new Pair(D.b(BarcodeSettings.class), bool2));
            if (anyType26 == null) {
                anyType26 = new AnyType(new LazyKType(D.b(BarcodeSettings.class), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$10
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(BarcodeSettings.class);
                    }
                }), null);
            }
            props10.put("barcodeScannerSettings", new ConcreteViewProp("barcodeScannerSettings", anyType26, function28));
            CameraViewModule$definition$1$12$11 cameraViewModule$definition$1$12$11 = new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$11
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((ExpoCameraView) obj3, (Boolean) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoCameraView view, Boolean bool3) {
                    AbstractC2855l.g(view, "view");
                    if (!CameraUtils.INSTANCE.isMLKitBarcodeScannerAvailable()) {
                        view.setShouldScanBarcodes(false);
                    } else if (bool3 != null) {
                        view.setShouldScanBarcodes(bool3.booleanValue());
                    }
                }
            };
            Map<String, AnyViewProp> props11 = viewDefinitionBuilder2.getProps();
            AnyType anyType27 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool2));
            if (anyType27 == null) {
                anyType27 = new AnyType(new LazyKType(D.b(cls4), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$11
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Boolean.class);
                    }
                }), null);
            }
            props11.put("barcodeScannerEnabled", new ConcreteViewProp("barcodeScannerEnabled", anyType27, cameraViewModule$definition$1$12$11));
            Function2 function29 = new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$12
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((ExpoCameraView) obj3, (String) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoCameraView view, String str3) {
                    AbstractC2855l.g(view, "view");
                    if (str3 != null) {
                        if (AbstractC2855l.b(view.getPictureSize(), str3)) {
                            return;
                        }
                        view.setPictureSize(str3);
                    } else if (view.getPictureSize().length() > 0) {
                        view.setPictureSize(PointerEventHelper.POINTER_TYPE_UNKNOWN);
                    }
                }
            };
            Map<String, AnyViewProp> props12 = viewDefinitionBuilder2.getProps();
            AnyType anyType28 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool2));
            if (anyType28 == null) {
                anyType28 = new AnyType(new LazyKType(D.b(cls6), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$12
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), null);
            }
            props12.put("pictureSize", new ConcreteViewProp("pictureSize", anyType28, function29));
            Function2 function210 = new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$13
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((ExpoCameraView) obj3, (FocusMode) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoCameraView view, FocusMode focusMode) {
                    AbstractC2855l.g(view, "view");
                    if (focusMode != null) {
                        if (view.getAutoFocus() != focusMode) {
                            view.setAutoFocus(focusMode);
                        }
                    } else {
                        FocusMode autoFocus = view.getAutoFocus();
                        FocusMode focusMode2 = FocusMode.OFF;
                        if (autoFocus != focusMode2) {
                            view.setAutoFocus(focusMode2);
                        }
                    }
                }
            };
            Map<String, AnyViewProp> props13 = viewDefinitionBuilder2.getProps();
            AnyType anyType29 = anyTypeProvider.getTypesMap().get(new Pair(D.b(FocusMode.class), bool2));
            if (anyType29 == null) {
                anyType29 = new AnyType(new LazyKType(D.b(FocusMode.class), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$13
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(FocusMode.class);
                    }
                }), null);
            }
            props13.put("autoFocus", new ConcreteViewProp("autoFocus", anyType29, function210));
            Function2 function211 = new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$14
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((ExpoCameraView) obj3, (CameraRatio) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoCameraView view, CameraRatio cameraRatio) {
                    AbstractC2855l.g(view, "view");
                    if (cameraRatio != null) {
                        if (view.getRatio() != cameraRatio) {
                            view.setRatio(cameraRatio);
                        }
                    } else if (view.getRatio() != null) {
                        view.setRatio(null);
                    }
                }
            };
            Map<String, AnyViewProp> props14 = viewDefinitionBuilder2.getProps();
            AnyType anyType30 = anyTypeProvider.getTypesMap().get(new Pair(D.b(CameraRatio.class), bool2));
            if (anyType30 == null) {
                anyType30 = new AnyType(new LazyKType(D.b(CameraRatio.class), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$14
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(CameraRatio.class);
                    }
                }), null);
            }
            props14.put("ratio", new ConcreteViewProp("ratio", anyType30, function211));
            Function2 function212 = new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$15
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((ExpoCameraView) obj3, (Boolean) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoCameraView view, Boolean bool3) {
                    AbstractC2855l.g(view, "view");
                    if (bool3 == null) {
                        if (view.getMirror()) {
                            view.setMirror(false);
                        }
                    } else {
                        boolean zBooleanValue = bool3.booleanValue();
                        if (view.getMirror() != zBooleanValue) {
                            view.setMirror(zBooleanValue);
                        }
                    }
                }
            };
            Map<String, AnyViewProp> props15 = viewDefinitionBuilder2.getProps();
            AnyType anyType31 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool2));
            if (anyType31 == null) {
                anyType31 = new AnyType(new LazyKType(D.b(cls4), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$15
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Boolean.class);
                    }
                }), null);
            }
            props15.put("mirror", new ConcreteViewProp("mirror", anyType31, function212));
            Function2 function213 = new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$1$12$16
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((ExpoCameraView) obj3, (Integer) obj4);
                    return C2735B.f28704a;
                }

                public final void invoke(ExpoCameraView view, Integer num) {
                    AbstractC2855l.g(view, "view");
                    if (num == null) {
                        if (view.getVideoEncodingBitrate() != null) {
                            view.setVideoEncodingBitrate(null);
                        }
                    } else {
                        int iIntValue = num.intValue();
                        Integer videoEncodingBitrate = view.getVideoEncodingBitrate();
                        if (videoEncodingBitrate != null && videoEncodingBitrate.intValue() == iIntValue) {
                            return;
                        }
                        view.setVideoEncodingBitrate(Integer.valueOf(iIntValue));
                    }
                }
            };
            Map<String, AnyViewProp> props16 = viewDefinitionBuilder2.getProps();
            AnyType anyType32 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool2));
            if (anyType32 == null) {
                anyType32 = new AnyType(new LazyKType(D.b(cls2), true, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$16
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Integer.class);
                    }
                }), null);
            }
            props16.put("videoBitrate", new ConcreteViewProp("videoBitrate", anyType32, function213));
            viewDefinitionBuilder2.setOnViewDidUpdateProps(new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$OnViewDidUpdateProps$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((View) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(View it) {
                    AbstractC2855l.g(it, "it");
                    ((ExpoCameraView) it).recreateCamera();
                }
            });
            viewDefinitionBuilder2.setOnViewDestroys(new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$OnViewDestroys$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((View) obj3);
                    return C2735B.f28704a;
                }

                public final void invoke(View it) {
                    AbstractC2855l.g(it, "it");
                    ((ExpoCameraView) it).cleanupCamera();
                }
            });
            TypeConverterProvider converters8 = viewDefinitionBuilder2.getConverters();
            AnyType anyType33 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType33 == null) {
                anyType33 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ExpoCameraView.class);
                    }
                }), converters8);
            }
            AnyType anyType34 = anyTypeProvider.getTypesMap().get(new Pair(D.b(PictureOptions.class), bool));
            if (anyType34 == null) {
                anyType34 = new AnyType(new LazyKType(D.b(PictureOptions.class), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(PictureOptions.class);
                    }
                }), converters8);
            }
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("takePicture", new AnyType[]{anyType33, anyType34}, new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$3
                public final void invoke(Object[] objArr, Promise promise) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj3 = objArr[0];
                    PictureOptions pictureOptions = (PictureOptions) objArr[1];
                    ExpoCameraView expoCameraView = (ExpoCameraView) obj3;
                    if (!EmulatorUtilities.INSTANCE.isRunningOnEmulator()) {
                        expoCameraView.takePicture(pictureOptions, promise, this.this$0.getCacheDirectory(), this.this$0.getRuntimeContext());
                    } else {
                        AbstractC1417k.d(this.this$0.moduleScope, null, null, new CameraViewModule$definition$1$12$19$1(CameraViewHelper.INSTANCE.generateSimulatorPhoto(expoCameraView.getWidth(), expoCameraView.getHeight()), promise, pictureOptions, this.this$0, expoCameraView, null), 3, null);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((Object[]) obj3, (Promise) obj4);
                    return C2735B.f28704a;
                }
            });
            viewDefinitionBuilder2.getAsyncFunctions().put("takePicture", asyncFunctionWithPromiseComponent);
            Queues queues = Queues.MAIN;
            asyncFunctionWithPromiseComponent.runOnQueue(queues);
            AnyType anyType35 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType35 == null) {
                anyType35 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(ExpoCameraView.class);
                    }
                }), null);
            }
            AnyType[] anyTypeArr9 = {anyType35};
            Function1 function15 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$3
                @Override // kotlin.jvm.functions.Function1
                public final List<? extends String> invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return ((ExpoCameraView) objArr[0]).getAvailablePictureSizes();
                }
            };
            Class cls18 = cls5;
            if (AbstractC2855l.b(cls18, cls14)) {
                stringAsyncFunctionComponent = new IntAsyncFunctionComponent("getAvailablePictureSizes", anyTypeArr9, function15);
            } else {
                if (!AbstractC2855l.b(cls18, cls17)) {
                    cls9 = cls8;
                    if (AbstractC2855l.b(cls18, cls9)) {
                        stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("getAvailablePictureSizes", anyTypeArr9, function15);
                        cls10 = cls7;
                        cls11 = cls6;
                        viewDefinitionBuilder2.getAsyncFunctions().put("getAvailablePictureSizes", stringAsyncFunctionComponent);
                        TypeConverterProvider converters9 = viewDefinitionBuilder2.getConverters();
                        anyType = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                        if (anyType != null) {
                            viewDefinitionBuilder = viewDefinitionBuilder2;
                            anyType = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$4
                                @Override // w7.InterfaceC3487a
                                public final o invoke() {
                                    return D.o(ExpoCameraView.class);
                                }
                            }), converters9);
                        } else {
                            viewDefinitionBuilder = viewDefinitionBuilder2;
                        }
                        anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(RecordingOptions.class), bool));
                        if (anyType2 != null) {
                            cls12 = cls11;
                            anyType2 = new AnyType(new LazyKType(D.b(RecordingOptions.class), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$5
                                @Override // w7.InterfaceC3487a
                                public final o invoke() {
                                    return D.o(RecordingOptions.class);
                                }
                            }), converters9);
                        } else {
                            cls12 = cls11;
                        }
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent("record", new AnyType[]{anyType, anyType2}, new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$6
                            public final void invoke(Object[] objArr, Promise promise) throws Exceptions.MissingPermissions {
                                AbstractC2855l.g(objArr, "<destruct>");
                                AbstractC2855l.g(promise, "promise");
                                Object obj3 = objArr[0];
                                RecordingOptions recordingOptions = (RecordingOptions) objArr[1];
                                ExpoCameraView expoCameraView = (ExpoCameraView) obj3;
                                if (!expoCameraView.getMute() && !this.this$0.getPermissionsManager().hasGrantedPermissions("android.permission.RECORD_AUDIO")) {
                                    throw new Exceptions.MissingPermissions("android.permission.RECORD_AUDIO");
                                }
                                expoCameraView.record(recordingOptions, promise, this.this$0.getCacheDirectory());
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) throws Exceptions.MissingPermissions {
                                invoke((Object[]) obj3, (Promise) obj4);
                                return C2735B.f28704a;
                            }
                        });
                        viewDefinitionBuilder.getAsyncFunctions().put("record", asyncFunctionWithPromiseComponent2);
                        asyncFunctionWithPromiseComponent2.runOnQueue(queues);
                        anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                        if (anyType3 == null) {
                            anyType3 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$5
                                @Override // w7.InterfaceC3487a
                                public final o invoke() {
                                    return D.o(ExpoCameraView.class);
                                }
                            }), null);
                        }
                        AnyType[] anyTypeArr10 = {anyType3};
                        Function1 function16 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$6
                            @Override // kotlin.jvm.functions.Function1
                            public final C2735B invoke(Object[] objArr) {
                                AbstractC2855l.g(objArr, "<destruct>");
                                ((ExpoCameraView) objArr[0]).toggleRecording();
                                return C2735B.f28704a;
                            }
                        };
                        obj2 = obj;
                        if (!AbstractC2855l.b(obj2, cls14)) {
                            stringAsyncFunctionComponent2 = new IntAsyncFunctionComponent("toggleRecording", anyTypeArr10, function16);
                        } else if (AbstractC2855l.b(obj2, cls17)) {
                            stringAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("toggleRecording", anyTypeArr10, function16);
                        } else if (AbstractC2855l.b(obj2, cls9)) {
                            stringAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("toggleRecording", anyTypeArr10, function16);
                        } else {
                            if (!AbstractC2855l.b(obj2, cls10)) {
                                cls13 = cls12;
                                stringAsyncFunctionComponent2 = AbstractC2855l.b(obj2, cls13) ? new StringAsyncFunctionComponent("toggleRecording", anyTypeArr10, function16) : new UntypedAsyncFunctionComponent("toggleRecording", anyTypeArr10, function16);
                                viewDefinitionBuilder.getAsyncFunctions().put("toggleRecording", stringAsyncFunctionComponent2);
                                anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                                if (anyType4 == null) {
                                    anyType4 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$8
                                        @Override // w7.InterfaceC3487a
                                        public final o invoke() {
                                            return D.o(ExpoCameraView.class);
                                        }
                                    }), null);
                                }
                                AnyType[] anyTypeArr11 = {anyType4};
                                Function1 function17 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$9
                                    @Override // kotlin.jvm.functions.Function1
                                    public final C2735B invoke(Object[] objArr) {
                                        AbstractC2855l.g(objArr, "<destruct>");
                                        ((ExpoCameraView) objArr[0]).stopRecording();
                                        return C2735B.f28704a;
                                    }
                                };
                                AsyncFunctionComponent intAsyncFunctionComponent5 = AbstractC2855l.b(obj2, cls14) ? new IntAsyncFunctionComponent("stopRecording", anyTypeArr11, function17) : AbstractC2855l.b(obj2, cls17) ? new BoolAsyncFunctionComponent("stopRecording", anyTypeArr11, function17) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("stopRecording", anyTypeArr11, function17) : AbstractC2855l.b(obj2, cls10) ? new FloatAsyncFunctionComponent("stopRecording", anyTypeArr11, function17) : AbstractC2855l.b(obj2, cls13) ? new StringAsyncFunctionComponent("stopRecording", anyTypeArr11, function17) : new UntypedAsyncFunctionComponent("stopRecording", anyTypeArr11, function17);
                                viewDefinitionBuilder.getAsyncFunctions().put("stopRecording", intAsyncFunctionComponent5);
                                intAsyncFunctionComponent5.runOnQueue(queues);
                                anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                                if (anyType5 == null) {
                                    anyType5 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$11
                                        @Override // w7.InterfaceC3487a
                                        public final o invoke() {
                                            return D.o(ExpoCameraView.class);
                                        }
                                    }), null);
                                }
                                AnyType[] anyTypeArr12 = {anyType5};
                                Function1 function18 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$12
                                    @Override // kotlin.jvm.functions.Function1
                                    public final C2735B invoke(Object[] objArr) {
                                        AbstractC2855l.g(objArr, "<destruct>");
                                        ((ExpoCameraView) objArr[0]).resumePreview();
                                        return C2735B.f28704a;
                                    }
                                };
                                viewDefinitionBuilder.getAsyncFunctions().put("resumePreview", AbstractC2855l.b(obj2, cls14) ? new IntAsyncFunctionComponent("resumePreview", anyTypeArr12, function18) : AbstractC2855l.b(obj2, cls17) ? new BoolAsyncFunctionComponent("resumePreview", anyTypeArr12, function18) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("resumePreview", anyTypeArr12, function18) : AbstractC2855l.b(obj2, cls10) ? new FloatAsyncFunctionComponent("resumePreview", anyTypeArr12, function18) : AbstractC2855l.b(obj2, cls13) ? new StringAsyncFunctionComponent("resumePreview", anyTypeArr12, function18) : new UntypedAsyncFunctionComponent("resumePreview", anyTypeArr12, function18));
                                anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                                if (anyType6 == null) {
                                    anyType6 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$14
                                        @Override // w7.InterfaceC3487a
                                        public final o invoke() {
                                            return D.o(ExpoCameraView.class);
                                        }
                                    }), null);
                                }
                                AnyType[] anyTypeArr13 = {anyType6};
                                Function1 function19 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$15
                                    @Override // kotlin.jvm.functions.Function1
                                    public final C2735B invoke(Object[] objArr) {
                                        AbstractC2855l.g(objArr, "<destruct>");
                                        ((ExpoCameraView) objArr[0]).pausePreview();
                                        return C2735B.f28704a;
                                    }
                                };
                                viewDefinitionBuilder.getAsyncFunctions().put("pausePreview", AbstractC2855l.b(obj2, cls14) ? new IntAsyncFunctionComponent("pausePreview", anyTypeArr13, function19) : AbstractC2855l.b(obj2, cls17) ? new BoolAsyncFunctionComponent("pausePreview", anyTypeArr13, function19) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("pausePreview", anyTypeArr13, function19) : AbstractC2855l.b(obj2, cls10) ? new FloatAsyncFunctionComponent("pausePreview", anyTypeArr13, function19) : AbstractC2855l.b(obj2, cls13) ? new StringAsyncFunctionComponent("pausePreview", anyTypeArr13, function19) : new UntypedAsyncFunctionComponent("pausePreview", anyTypeArr13, function19));
                                ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
                                moduleDefinitionBuilder3.registerViewDefinition(viewDefinitionBuilder.build());
                                ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder3.buildModule();
                                AbstractC2861a.f();
                                return moduleDefinitionDataBuildModule;
                            }
                            stringAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("toggleRecording", anyTypeArr10, function16);
                        }
                        cls13 = cls12;
                        viewDefinitionBuilder.getAsyncFunctions().put("toggleRecording", stringAsyncFunctionComponent2);
                        anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                        if (anyType4 == null) {
                        }
                        AnyType[] anyTypeArr112 = {anyType4};
                        Function1 function172 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$9
                            @Override // kotlin.jvm.functions.Function1
                            public final C2735B invoke(Object[] objArr) {
                                AbstractC2855l.g(objArr, "<destruct>");
                                ((ExpoCameraView) objArr[0]).stopRecording();
                                return C2735B.f28704a;
                            }
                        };
                        if (AbstractC2855l.b(obj2, cls14)) {
                        }
                        viewDefinitionBuilder.getAsyncFunctions().put("stopRecording", intAsyncFunctionComponent5);
                        intAsyncFunctionComponent5.runOnQueue(queues);
                        anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                        if (anyType5 == null) {
                        }
                        AnyType[] anyTypeArr122 = {anyType5};
                        Function1 function182 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$12
                            @Override // kotlin.jvm.functions.Function1
                            public final C2735B invoke(Object[] objArr) {
                                AbstractC2855l.g(objArr, "<destruct>");
                                ((ExpoCameraView) objArr[0]).resumePreview();
                                return C2735B.f28704a;
                            }
                        };
                        viewDefinitionBuilder.getAsyncFunctions().put("resumePreview", AbstractC2855l.b(obj2, cls14) ? new IntAsyncFunctionComponent("resumePreview", anyTypeArr122, function182) : AbstractC2855l.b(obj2, cls17) ? new BoolAsyncFunctionComponent("resumePreview", anyTypeArr122, function182) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("resumePreview", anyTypeArr122, function182) : AbstractC2855l.b(obj2, cls10) ? new FloatAsyncFunctionComponent("resumePreview", anyTypeArr122, function182) : AbstractC2855l.b(obj2, cls13) ? new StringAsyncFunctionComponent("resumePreview", anyTypeArr122, function182) : new UntypedAsyncFunctionComponent("resumePreview", anyTypeArr122, function182));
                        anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                        if (anyType6 == null) {
                        }
                        AnyType[] anyTypeArr132 = {anyType6};
                        Function1 function192 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$15
                            @Override // kotlin.jvm.functions.Function1
                            public final C2735B invoke(Object[] objArr) {
                                AbstractC2855l.g(objArr, "<destruct>");
                                ((ExpoCameraView) objArr[0]).pausePreview();
                                return C2735B.f28704a;
                            }
                        };
                        viewDefinitionBuilder.getAsyncFunctions().put("pausePreview", AbstractC2855l.b(obj2, cls14) ? new IntAsyncFunctionComponent("pausePreview", anyTypeArr132, function192) : AbstractC2855l.b(obj2, cls17) ? new BoolAsyncFunctionComponent("pausePreview", anyTypeArr132, function192) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("pausePreview", anyTypeArr132, function192) : AbstractC2855l.b(obj2, cls10) ? new FloatAsyncFunctionComponent("pausePreview", anyTypeArr132, function192) : AbstractC2855l.b(obj2, cls13) ? new StringAsyncFunctionComponent("pausePreview", anyTypeArr132, function192) : new UntypedAsyncFunctionComponent("pausePreview", anyTypeArr132, function192));
                        ModuleDefinitionBuilder moduleDefinitionBuilder32 = moduleDefinitionBuilder;
                        moduleDefinitionBuilder32.registerViewDefinition(viewDefinitionBuilder.build());
                        ModuleDefinitionData moduleDefinitionDataBuildModule2 = moduleDefinitionBuilder32.buildModule();
                        AbstractC2861a.f();
                        return moduleDefinitionDataBuildModule2;
                    }
                    cls10 = cls7;
                    if (AbstractC2855l.b(cls18, cls10)) {
                        stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("getAvailablePictureSizes", anyTypeArr9, function15);
                        cls11 = cls6;
                        viewDefinitionBuilder2.getAsyncFunctions().put("getAvailablePictureSizes", stringAsyncFunctionComponent);
                        TypeConverterProvider converters92 = viewDefinitionBuilder2.getConverters();
                        anyType = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                        if (anyType != null) {
                        }
                        anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(RecordingOptions.class), bool));
                        if (anyType2 != null) {
                        }
                        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent22 = new AsyncFunctionWithPromiseComponent("record", new AnyType[]{anyType, anyType2}, new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$6
                            public final void invoke(Object[] objArr, Promise promise) throws Exceptions.MissingPermissions {
                                AbstractC2855l.g(objArr, "<destruct>");
                                AbstractC2855l.g(promise, "promise");
                                Object obj3 = objArr[0];
                                RecordingOptions recordingOptions = (RecordingOptions) objArr[1];
                                ExpoCameraView expoCameraView = (ExpoCameraView) obj3;
                                if (!expoCameraView.getMute() && !this.this$0.getPermissionsManager().hasGrantedPermissions("android.permission.RECORD_AUDIO")) {
                                    throw new Exceptions.MissingPermissions("android.permission.RECORD_AUDIO");
                                }
                                expoCameraView.record(recordingOptions, promise, this.this$0.getCacheDirectory());
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) throws Exceptions.MissingPermissions {
                                invoke((Object[]) obj3, (Promise) obj4);
                                return C2735B.f28704a;
                            }
                        });
                        viewDefinitionBuilder.getAsyncFunctions().put("record", asyncFunctionWithPromiseComponent22);
                        asyncFunctionWithPromiseComponent22.runOnQueue(queues);
                        anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                        if (anyType3 == null) {
                        }
                        AnyType[] anyTypeArr102 = {anyType3};
                        Function1 function162 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$6
                            @Override // kotlin.jvm.functions.Function1
                            public final C2735B invoke(Object[] objArr) {
                                AbstractC2855l.g(objArr, "<destruct>");
                                ((ExpoCameraView) objArr[0]).toggleRecording();
                                return C2735B.f28704a;
                            }
                        };
                        obj2 = obj;
                        if (!AbstractC2855l.b(obj2, cls14)) {
                        }
                        cls13 = cls12;
                        viewDefinitionBuilder.getAsyncFunctions().put("toggleRecording", stringAsyncFunctionComponent2);
                        anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                        if (anyType4 == null) {
                        }
                        AnyType[] anyTypeArr1122 = {anyType4};
                        Function1 function1722 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$9
                            @Override // kotlin.jvm.functions.Function1
                            public final C2735B invoke(Object[] objArr) {
                                AbstractC2855l.g(objArr, "<destruct>");
                                ((ExpoCameraView) objArr[0]).stopRecording();
                                return C2735B.f28704a;
                            }
                        };
                        if (AbstractC2855l.b(obj2, cls14)) {
                        }
                        viewDefinitionBuilder.getAsyncFunctions().put("stopRecording", intAsyncFunctionComponent5);
                        intAsyncFunctionComponent5.runOnQueue(queues);
                        anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                        if (anyType5 == null) {
                        }
                        AnyType[] anyTypeArr1222 = {anyType5};
                        Function1 function1822 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$12
                            @Override // kotlin.jvm.functions.Function1
                            public final C2735B invoke(Object[] objArr) {
                                AbstractC2855l.g(objArr, "<destruct>");
                                ((ExpoCameraView) objArr[0]).resumePreview();
                                return C2735B.f28704a;
                            }
                        };
                        viewDefinitionBuilder.getAsyncFunctions().put("resumePreview", AbstractC2855l.b(obj2, cls14) ? new IntAsyncFunctionComponent("resumePreview", anyTypeArr1222, function1822) : AbstractC2855l.b(obj2, cls17) ? new BoolAsyncFunctionComponent("resumePreview", anyTypeArr1222, function1822) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("resumePreview", anyTypeArr1222, function1822) : AbstractC2855l.b(obj2, cls10) ? new FloatAsyncFunctionComponent("resumePreview", anyTypeArr1222, function1822) : AbstractC2855l.b(obj2, cls13) ? new StringAsyncFunctionComponent("resumePreview", anyTypeArr1222, function1822) : new UntypedAsyncFunctionComponent("resumePreview", anyTypeArr1222, function1822));
                        anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                        if (anyType6 == null) {
                        }
                        AnyType[] anyTypeArr1322 = {anyType6};
                        Function1 function1922 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$15
                            @Override // kotlin.jvm.functions.Function1
                            public final C2735B invoke(Object[] objArr) {
                                AbstractC2855l.g(objArr, "<destruct>");
                                ((ExpoCameraView) objArr[0]).pausePreview();
                                return C2735B.f28704a;
                            }
                        };
                        viewDefinitionBuilder.getAsyncFunctions().put("pausePreview", AbstractC2855l.b(obj2, cls14) ? new IntAsyncFunctionComponent("pausePreview", anyTypeArr1322, function1922) : AbstractC2855l.b(obj2, cls17) ? new BoolAsyncFunctionComponent("pausePreview", anyTypeArr1322, function1922) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("pausePreview", anyTypeArr1322, function1922) : AbstractC2855l.b(obj2, cls10) ? new FloatAsyncFunctionComponent("pausePreview", anyTypeArr1322, function1922) : AbstractC2855l.b(obj2, cls13) ? new StringAsyncFunctionComponent("pausePreview", anyTypeArr1322, function1922) : new UntypedAsyncFunctionComponent("pausePreview", anyTypeArr1322, function1922));
                        ModuleDefinitionBuilder moduleDefinitionBuilder322 = moduleDefinitionBuilder;
                        moduleDefinitionBuilder322.registerViewDefinition(viewDefinitionBuilder.build());
                        ModuleDefinitionData moduleDefinitionDataBuildModule22 = moduleDefinitionBuilder322.buildModule();
                        AbstractC2861a.f();
                        return moduleDefinitionDataBuildModule22;
                    }
                    cls11 = cls6;
                    stringAsyncFunctionComponent = AbstractC2855l.b(cls18, cls11) ? new StringAsyncFunctionComponent("getAvailablePictureSizes", anyTypeArr9, function15) : new UntypedAsyncFunctionComponent("getAvailablePictureSizes", anyTypeArr9, function15);
                    viewDefinitionBuilder2.getAsyncFunctions().put("getAvailablePictureSizes", stringAsyncFunctionComponent);
                    TypeConverterProvider converters922 = viewDefinitionBuilder2.getConverters();
                    anyType = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                    if (anyType != null) {
                    }
                    anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(RecordingOptions.class), bool));
                    if (anyType2 != null) {
                    }
                    AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent222 = new AsyncFunctionWithPromiseComponent("record", new AnyType[]{anyType, anyType2}, new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$6
                        public final void invoke(Object[] objArr, Promise promise) throws Exceptions.MissingPermissions {
                            AbstractC2855l.g(objArr, "<destruct>");
                            AbstractC2855l.g(promise, "promise");
                            Object obj3 = objArr[0];
                            RecordingOptions recordingOptions = (RecordingOptions) objArr[1];
                            ExpoCameraView expoCameraView = (ExpoCameraView) obj3;
                            if (!expoCameraView.getMute() && !this.this$0.getPermissionsManager().hasGrantedPermissions("android.permission.RECORD_AUDIO")) {
                                throw new Exceptions.MissingPermissions("android.permission.RECORD_AUDIO");
                            }
                            expoCameraView.record(recordingOptions, promise, this.this$0.getCacheDirectory());
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) throws Exceptions.MissingPermissions {
                            invoke((Object[]) obj3, (Promise) obj4);
                            return C2735B.f28704a;
                        }
                    });
                    viewDefinitionBuilder.getAsyncFunctions().put("record", asyncFunctionWithPromiseComponent222);
                    asyncFunctionWithPromiseComponent222.runOnQueue(queues);
                    anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                    if (anyType3 == null) {
                    }
                    AnyType[] anyTypeArr1022 = {anyType3};
                    Function1 function1622 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$6
                        @Override // kotlin.jvm.functions.Function1
                        public final C2735B invoke(Object[] objArr) {
                            AbstractC2855l.g(objArr, "<destruct>");
                            ((ExpoCameraView) objArr[0]).toggleRecording();
                            return C2735B.f28704a;
                        }
                    };
                    obj2 = obj;
                    if (!AbstractC2855l.b(obj2, cls14)) {
                    }
                    cls13 = cls12;
                    viewDefinitionBuilder.getAsyncFunctions().put("toggleRecording", stringAsyncFunctionComponent2);
                    anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                    if (anyType4 == null) {
                    }
                    AnyType[] anyTypeArr11222 = {anyType4};
                    Function1 function17222 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$9
                        @Override // kotlin.jvm.functions.Function1
                        public final C2735B invoke(Object[] objArr) {
                            AbstractC2855l.g(objArr, "<destruct>");
                            ((ExpoCameraView) objArr[0]).stopRecording();
                            return C2735B.f28704a;
                        }
                    };
                    if (AbstractC2855l.b(obj2, cls14)) {
                    }
                    viewDefinitionBuilder.getAsyncFunctions().put("stopRecording", intAsyncFunctionComponent5);
                    intAsyncFunctionComponent5.runOnQueue(queues);
                    anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                    if (anyType5 == null) {
                    }
                    AnyType[] anyTypeArr12222 = {anyType5};
                    Function1 function18222 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$12
                        @Override // kotlin.jvm.functions.Function1
                        public final C2735B invoke(Object[] objArr) {
                            AbstractC2855l.g(objArr, "<destruct>");
                            ((ExpoCameraView) objArr[0]).resumePreview();
                            return C2735B.f28704a;
                        }
                    };
                    viewDefinitionBuilder.getAsyncFunctions().put("resumePreview", AbstractC2855l.b(obj2, cls14) ? new IntAsyncFunctionComponent("resumePreview", anyTypeArr12222, function18222) : AbstractC2855l.b(obj2, cls17) ? new BoolAsyncFunctionComponent("resumePreview", anyTypeArr12222, function18222) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("resumePreview", anyTypeArr12222, function18222) : AbstractC2855l.b(obj2, cls10) ? new FloatAsyncFunctionComponent("resumePreview", anyTypeArr12222, function18222) : AbstractC2855l.b(obj2, cls13) ? new StringAsyncFunctionComponent("resumePreview", anyTypeArr12222, function18222) : new UntypedAsyncFunctionComponent("resumePreview", anyTypeArr12222, function18222));
                    anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
                    if (anyType6 == null) {
                    }
                    AnyType[] anyTypeArr13222 = {anyType6};
                    Function1 function19222 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$15
                        @Override // kotlin.jvm.functions.Function1
                        public final C2735B invoke(Object[] objArr) {
                            AbstractC2855l.g(objArr, "<destruct>");
                            ((ExpoCameraView) objArr[0]).pausePreview();
                            return C2735B.f28704a;
                        }
                    };
                    viewDefinitionBuilder.getAsyncFunctions().put("pausePreview", AbstractC2855l.b(obj2, cls14) ? new IntAsyncFunctionComponent("pausePreview", anyTypeArr13222, function19222) : AbstractC2855l.b(obj2, cls17) ? new BoolAsyncFunctionComponent("pausePreview", anyTypeArr13222, function19222) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("pausePreview", anyTypeArr13222, function19222) : AbstractC2855l.b(obj2, cls10) ? new FloatAsyncFunctionComponent("pausePreview", anyTypeArr13222, function19222) : AbstractC2855l.b(obj2, cls13) ? new StringAsyncFunctionComponent("pausePreview", anyTypeArr13222, function19222) : new UntypedAsyncFunctionComponent("pausePreview", anyTypeArr13222, function19222));
                    ModuleDefinitionBuilder moduleDefinitionBuilder3222 = moduleDefinitionBuilder;
                    moduleDefinitionBuilder3222.registerViewDefinition(viewDefinitionBuilder.build());
                    ModuleDefinitionData moduleDefinitionDataBuildModule222 = moduleDefinitionBuilder3222.buildModule();
                    AbstractC2861a.f();
                    return moduleDefinitionDataBuildModule222;
                }
                stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("getAvailablePictureSizes", anyTypeArr9, function15);
            }
            cls9 = cls8;
            cls10 = cls7;
            cls11 = cls6;
            viewDefinitionBuilder2.getAsyncFunctions().put("getAvailablePictureSizes", stringAsyncFunctionComponent);
            TypeConverterProvider converters9222 = viewDefinitionBuilder2.getConverters();
            anyType = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType != null) {
            }
            anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(RecordingOptions.class), bool));
            if (anyType2 != null) {
            }
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2222 = new AsyncFunctionWithPromiseComponent("record", new AnyType[]{anyType, anyType2}, new Function2() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$6
                public final void invoke(Object[] objArr, Promise promise) throws Exceptions.MissingPermissions {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj3 = objArr[0];
                    RecordingOptions recordingOptions = (RecordingOptions) objArr[1];
                    ExpoCameraView expoCameraView = (ExpoCameraView) obj3;
                    if (!expoCameraView.getMute() && !this.this$0.getPermissionsManager().hasGrantedPermissions("android.permission.RECORD_AUDIO")) {
                        throw new Exceptions.MissingPermissions("android.permission.RECORD_AUDIO");
                    }
                    expoCameraView.record(recordingOptions, promise, this.this$0.getCacheDirectory());
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) throws Exceptions.MissingPermissions {
                    invoke((Object[]) obj3, (Promise) obj4);
                    return C2735B.f28704a;
                }
            });
            viewDefinitionBuilder.getAsyncFunctions().put("record", asyncFunctionWithPromiseComponent2222);
            asyncFunctionWithPromiseComponent2222.runOnQueue(queues);
            anyType3 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType3 == null) {
            }
            AnyType[] anyTypeArr10222 = {anyType3};
            Function1 function16222 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$6
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((ExpoCameraView) objArr[0]).toggleRecording();
                    return C2735B.f28704a;
                }
            };
            obj2 = obj;
            if (!AbstractC2855l.b(obj2, cls14)) {
            }
            cls13 = cls12;
            viewDefinitionBuilder.getAsyncFunctions().put("toggleRecording", stringAsyncFunctionComponent2);
            anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType4 == null) {
            }
            AnyType[] anyTypeArr112222 = {anyType4};
            Function1 function172222 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$9
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((ExpoCameraView) objArr[0]).stopRecording();
                    return C2735B.f28704a;
                }
            };
            if (AbstractC2855l.b(obj2, cls14)) {
            }
            viewDefinitionBuilder.getAsyncFunctions().put("stopRecording", intAsyncFunctionComponent5);
            intAsyncFunctionComponent5.runOnQueue(queues);
            anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType5 == null) {
            }
            AnyType[] anyTypeArr122222 = {anyType5};
            Function1 function182222 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$12
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((ExpoCameraView) objArr[0]).resumePreview();
                    return C2735B.f28704a;
                }
            };
            viewDefinitionBuilder.getAsyncFunctions().put("resumePreview", AbstractC2855l.b(obj2, cls14) ? new IntAsyncFunctionComponent("resumePreview", anyTypeArr122222, function182222) : AbstractC2855l.b(obj2, cls17) ? new BoolAsyncFunctionComponent("resumePreview", anyTypeArr122222, function182222) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("resumePreview", anyTypeArr122222, function182222) : AbstractC2855l.b(obj2, cls10) ? new FloatAsyncFunctionComponent("resumePreview", anyTypeArr122222, function182222) : AbstractC2855l.b(obj2, cls13) ? new StringAsyncFunctionComponent("resumePreview", anyTypeArr122222, function182222) : new UntypedAsyncFunctionComponent("resumePreview", anyTypeArr122222, function182222));
            anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType6 == null) {
            }
            AnyType[] anyTypeArr132222 = {anyType6};
            Function1 function192222 = new Function1() { // from class: expo.modules.camera.CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$15
                @Override // kotlin.jvm.functions.Function1
                public final C2735B invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((ExpoCameraView) objArr[0]).pausePreview();
                    return C2735B.f28704a;
                }
            };
            viewDefinitionBuilder.getAsyncFunctions().put("pausePreview", AbstractC2855l.b(obj2, cls14) ? new IntAsyncFunctionComponent("pausePreview", anyTypeArr132222, function192222) : AbstractC2855l.b(obj2, cls17) ? new BoolAsyncFunctionComponent("pausePreview", anyTypeArr132222, function192222) : AbstractC2855l.b(obj2, cls9) ? new DoubleAsyncFunctionComponent("pausePreview", anyTypeArr132222, function192222) : AbstractC2855l.b(obj2, cls10) ? new FloatAsyncFunctionComponent("pausePreview", anyTypeArr132222, function192222) : AbstractC2855l.b(obj2, cls13) ? new StringAsyncFunctionComponent("pausePreview", anyTypeArr132222, function192222) : new UntypedAsyncFunctionComponent("pausePreview", anyTypeArr132222, function192222));
            ModuleDefinitionBuilder moduleDefinitionBuilder32222 = moduleDefinitionBuilder;
            moduleDefinitionBuilder32222.registerViewDefinition(viewDefinitionBuilder.build());
            ModuleDefinitionData moduleDefinitionDataBuildModule2222 = moduleDefinitionBuilder32222.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule2222;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
