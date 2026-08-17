package expo.modules.camera;

import R8.AbstractC1417k;
import R8.C1404d0;
import R8.N;
import R8.O;
import S.c;
import Y.k;
import Z.AbstractC1577p;
import Z.AbstractC1582v;
import Z.C1578q;
import Z.C1581u;
import Z.C1585y;
import Z.S;
import Z.b0;
import Z.m0;
import Z.y0;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.ColorDrawable;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.AudioManager;
import android.media.MediaActionSound;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.view.OrientationEventListener;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.camera.core.g;
import androidx.camera.core.o;
import androidx.camera.view.m;
import androidx.lifecycle.AbstractC1776x;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import expo.modules.camera.CameraExceptions;
import expo.modules.camera.ExpoCameraView;
import expo.modules.camera.analyzers.BarcodeAnalyzer;
import expo.modules.camera.analyzers.BarcodeAnalyzerKt;
import expo.modules.camera.common.BarcodeScannedEvent;
import expo.modules.camera.common.CameraMountErrorEvent;
import expo.modules.camera.common.PictureSavedEvent;
import expo.modules.camera.records.BarcodeSettings;
import expo.modules.camera.records.BarcodeType;
import expo.modules.camera.records.CameraMode;
import expo.modules.camera.records.CameraRatio;
import expo.modules.camera.records.CameraType;
import expo.modules.camera.records.FlashMode;
import expo.modules.camera.records.FocusMode;
import expo.modules.camera.records.VideoQuality;
import expo.modules.camera.records.VideoStabilizationMode;
import expo.modules.camera.utils.BarCodeScannerResult;
import expo.modules.camera.utils.CameraUtils;
import expo.modules.camera.utils.FileSystemUtils;
import expo.modules.core.errors.ModuleDestroyedException;
import expo.modules.interfaces.camera.CameraViewInterface;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.runtime.Runtime;
import expo.modules.kotlin.viewevent.ViewEventCallback;
import expo.modules.kotlin.viewevent.ViewEventDelegate;
import expo.modules.kotlin.views.ExpoView;
import expo.modules.notifications.service.NotificationsService;
import i7.AbstractC2746i;
import i7.AbstractC2753p;
import i7.C2735B;
import i7.t;
import j7.AbstractC2800q;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.v;
import o7.AbstractC3016b;
import q7.AbstractC3130c;
import w7.InterfaceC3487a;
import y.AbstractC3599t;
import y.C3562G;
import y.C3565J;
import y.C3598s;
import y.I0;
import y.InterfaceC3584i;
import y.InterfaceC3586j;
import y.InterfaceC3597q;
import y.K0;
import y.M0;
import y.V;
import y.X;
import y.p0;
import y7.AbstractC3624a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000û\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001u\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0083@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,JA\u00106\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020403j\b\u0012\u0004\u0012\u000204`5\u0012\u0004\u0012\u000204022\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b8\u0010,J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020.H\u0014¢\u0006\u0004\b>\u0010?J7\u0010E\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020.2\u0006\u0010B\u001a\u00020.2\u0006\u0010C\u001a\u00020.2\u0006\u0010D\u001a\u00020.H\u0014¢\u0006\u0004\bE\u0010FJ\u0019\u0010I\u001a\u00020\u000b2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJ1\u0010T\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\n\u0010S\u001a\u00060Qj\u0002`R¢\u0006\u0004\bT\u0010UJ\u0015\u0010X\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YJ%\u0010[\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020Z2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020\u000b¢\u0006\u0004\b]\u0010 J\r\u0010^\u001a\u00020\u000b¢\u0006\u0004\b^\u0010 J\r\u0010_\u001a\u00020\u000b¢\u0006\u0004\b_\u0010 J\u0015\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00160-H\u0007¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\u000b¢\u0006\u0004\bb\u0010 J\r\u0010c\u001a\u00020\u000b¢\u0006\u0004\bc\u0010 J\u0015\u0010e\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020\t¢\u0006\u0004\be\u0010\rJ\u0017\u0010h\u001a\u00020\u000b2\b\u0010g\u001a\u0004\u0018\u00010f¢\u0006\u0004\bh\u0010iJ\u0019\u0010l\u001a\u00020\u000b2\b\u0010k\u001a\u0004\u0018\u00010jH\u0016¢\u0006\u0004\bl\u0010mJ\u000f\u0010o\u001a\u00020nH\u0016¢\u0006\u0004\bo\u0010pJ\u0015\u0010r\u001a\u00020\u000b2\u0006\u0010q\u001a\u000204¢\u0006\u0004\br\u0010sJ\r\u0010t\u001a\u00020\u000b¢\u0006\u0004\bt\u0010 R\u001b\u0010z\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR&\u0010|\u001a\u0004\u0018\u00010{8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R \u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001b\u0010\u0092\u0001\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001a\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0095\u0001R\u0019\u0010\u009d\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0095\u0001R3\u0010\u009f\u0001\u001a\u00030\u009e\u00012\u0007\u0010\"\u001a\u00030\u009e\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R0\u0010¥\u0001\u001a\u00020V2\u0006\u0010\"\u001a\u00020V8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0005\b©\u0001\u0010YR3\u0010«\u0001\u001a\u00030ª\u00012\u0007\u0010\"\u001a\u00030ª\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R0\u0010±\u0001\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0005\bµ\u0001\u0010$R3\u0010·\u0001\u001a\u00030¶\u00012\u0007\u0010\"\u001a\u00030¶\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R3\u0010¾\u0001\u001a\u00030½\u00012\u0007\u0010\"\u001a\u00030½\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R5\u0010Ä\u0001\u001a\u0004\u0018\u00010.2\b\u0010\"\u001a\u0004\u0018\u00010.8\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R3\u0010Ë\u0001\u001a\u00030Ê\u00012\u0007\u0010\"\u001a\u00030Ê\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R7\u0010Ò\u0001\u001a\u0005\u0018\u00010Ñ\u00012\t\u0010\"\u001a\u0005\u0018\u00010Ñ\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R1\u0010Ø\u0001\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R0\u0010Þ\u0001\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\bÞ\u0001\u0010\u0095\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0005\bá\u0001\u0010\rR(\u0010â\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bâ\u0001\u0010\u0095\u0001\u001a\u0006\bã\u0001\u0010à\u0001\"\u0005\bä\u0001\u0010\rR(\u0010å\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bå\u0001\u0010\u0095\u0001\u001a\u0006\bæ\u0001\u0010à\u0001\"\u0005\bç\u0001\u0010\rR2\u0010í\u0001\u001a\u00020\t2\u0007\u0010è\u0001\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0006\bë\u0001\u0010à\u0001\"\u0005\bì\u0001\u0010\rR\u0019\u0010î\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u0019\u0010ð\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010ï\u0001R'\u0010ö\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0ñ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\bô\u0001\u0010õ\u0001R(\u0010ú\u0001\u001a\n\u0012\u0005\u0012\u00030÷\u00010ñ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bø\u0001\u0010ó\u0001\u001a\u0006\bù\u0001\u0010õ\u0001R'\u00108\u001a\n\u0012\u0005\u0012\u00030û\u00010ñ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bü\u0001\u0010ó\u0001\u001a\u0006\bý\u0001\u0010õ\u0001R'\u0010r\u001a\n\u0012\u0005\u0012\u00030þ\u00010ñ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÿ\u0001\u0010ó\u0001\u001a\u0006\b\u0080\u0002\u0010õ\u0001R\u0017\u0010d\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bd\u0010\u0095\u0001R\u0018\u0010\u0084\u0002\u001a\u00030\u0081\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002¨\u0006\u0085\u0002"}, d2 = {"Lexpo/modules/camera/ExpoCameraView;", "Lexpo/modules/kotlin/views/ExpoView;", "Lexpo/modules/interfaces/camera/CameraViewInterface;", "Landroid/content/Context;", "context", "Lexpo/modules/kotlin/AppContext;", "appContext", "<init>", "(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.ENABLED, "Li7/B;", "setTorchEnabled", "(Z)V", "createCamera", "(Ln7/f;)Ljava/lang/Object;", "Landroidx/camera/core/g;", "createImageAnalyzer", "()Landroidx/camera/core/g;", "LS/c;", "buildResolutionSelector", "()LS/c;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "size", "Landroid/util/Size;", "parseSizeSafely", "(Ljava/lang/String;)Landroid/util/Size;", "LZ/m0;", "LZ/S;", "createVideoCapture", "()LZ/m0;", "startFocusMetering", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "setCameraZoom", "(F)V", "Ly/q;", "cameraInfo", "observeCameraState", "(Ly/q;)V", "Lexpo/modules/camera/utils/BarCodeScannerResult;", "barcode", "transformBarcodeScannerResultToViewCoordinates", "(Lexpo/modules/camera/utils/BarCodeScannerResult;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "cornerPoints", "Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;", "boundingBox", "Lkotlin/Pair;", "Ljava/util/ArrayList;", "Landroid/os/Bundle;", "Lkotlin/collections/ArrayList;", "getCornerPointsAndBoundingBox", "(Ljava/util/List;Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;)Lkotlin/Pair;", "onBarcodeScanned", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cancelCoroutineScope", "()Ljava/lang/Object;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "onLayout", "(ZIIII)V", "Landroid/view/View;", "child", "onViewAdded", "(Landroid/view/View;)V", "Lexpo/modules/camera/PictureOptions;", "options", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljava/io/File;", "cacheDirectory", "Lexpo/modules/kotlin/runtime/Runtime;", "Lexpo/modules/kotlin/RuntimeContext;", "runtimeContext", "takePicture", "(Lexpo/modules/camera/PictureOptions;Lexpo/modules/kotlin/Promise;Ljava/io/File;Lexpo/modules/kotlin/runtime/Runtime;)V", "Lexpo/modules/camera/records/FlashMode;", "mode", "setCameraFlashMode", "(Lexpo/modules/camera/records/FlashMode;)V", "Lexpo/modules/camera/RecordingOptions;", "record", "(Lexpo/modules/camera/RecordingOptions;Lexpo/modules/kotlin/Promise;Ljava/io/File;)V", "stopRecording", "toggleRecording", "recreateCamera", "getAvailablePictureSizes", "()Ljava/util/List;", "resumePreview", "pausePreview", "shouldScanBarcodes", "setShouldScanBarcodes", "Lexpo/modules/camera/records/BarcodeSettings;", "settings", "setBarcodeScannerSettings", "(Lexpo/modules/camera/records/BarcodeSettings;)V", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "setPreviewTexture", "(Landroid/graphics/SurfaceTexture;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getPreviewSizeAsArray", "()[I", "response", "onPictureSaved", "(Landroid/os/Bundle;)V", "cleanupCamera", "expo/modules/camera/ExpoCameraView$orientationEventListener$2$1", "orientationEventListener$delegate", "Lkotlin/Lazy;", "getOrientationEventListener", "()Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;", "orientationEventListener", "Ly/i;", "camera", "Ly/i;", "getCamera", "()Ly/i;", "setCamera", "(Ly/i;)V", "LZ/b0;", "activeRecording", "LZ/b0;", "LY/k;", "cameraProvider", "LY/k;", "Ly/V;", "imageCaptureUseCase", "Ly/V;", "imageAnalysisUseCase", "Landroidx/camera/core/g;", "recorder", "LZ/S;", "Lexpo/modules/camera/records/BarcodeType;", "barcodeFormats", "Ljava/util/List;", "glSurfaceTexture", "Landroid/graphics/SurfaceTexture;", "isRecording", "Z", "Landroidx/camera/view/m;", "previewView", "Landroidx/camera/view/m;", "LR8/N;", PermissionsResponse.SCOPE_KEY, "LR8/N;", "shouldCreateCamera", "previewPaused", "Lexpo/modules/camera/records/CameraType;", "lensFacing", "Lexpo/modules/camera/records/CameraType;", "getLensFacing", "()Lexpo/modules/camera/records/CameraType;", "setLensFacing", "(Lexpo/modules/camera/records/CameraType;)V", "flashMode", "Lexpo/modules/camera/records/FlashMode;", "getFlashMode", "()Lexpo/modules/camera/records/FlashMode;", "setFlashMode", "Lexpo/modules/camera/records/CameraMode;", "cameraMode", "Lexpo/modules/camera/records/CameraMode;", "getCameraMode", "()Lexpo/modules/camera/records/CameraMode;", "setCameraMode", "(Lexpo/modules/camera/records/CameraMode;)V", "zoom", "F", "getZoom", "()F", "setZoom", "Lexpo/modules/camera/records/FocusMode;", "autoFocus", "Lexpo/modules/camera/records/FocusMode;", "getAutoFocus", "()Lexpo/modules/camera/records/FocusMode;", "setAutoFocus", "(Lexpo/modules/camera/records/FocusMode;)V", "Lexpo/modules/camera/records/VideoQuality;", "videoQuality", "Lexpo/modules/camera/records/VideoQuality;", "getVideoQuality", "()Lexpo/modules/camera/records/VideoQuality;", "setVideoQuality", "(Lexpo/modules/camera/records/VideoQuality;)V", "videoEncodingBitrate", "Ljava/lang/Integer;", "getVideoEncodingBitrate", "()Ljava/lang/Integer;", "setVideoEncodingBitrate", "(Ljava/lang/Integer;)V", "Lexpo/modules/camera/records/VideoStabilizationMode;", "videoStabilizationMode", "Lexpo/modules/camera/records/VideoStabilizationMode;", "getVideoStabilizationMode", "()Lexpo/modules/camera/records/VideoStabilizationMode;", "setVideoStabilizationMode", "(Lexpo/modules/camera/records/VideoStabilizationMode;)V", "Lexpo/modules/camera/records/CameraRatio;", "ratio", "Lexpo/modules/camera/records/CameraRatio;", "getRatio", "()Lexpo/modules/camera/records/CameraRatio;", "setRatio", "(Lexpo/modules/camera/records/CameraRatio;)V", "pictureSize", "Ljava/lang/String;", "getPictureSize", "()Ljava/lang/String;", "setPictureSize", "(Ljava/lang/String;)V", "mirror", "getMirror", "()Z", "setMirror", "mute", "getMute", "setMute", "animateShutter", "getAnimateShutter", "setAnimateShutter", "<set-?>", "enableTorch$delegate", "Lkotlin/properties/d;", "getEnableTorch", "setEnableTorch", "enableTorch", "lastWidth", "I", "lastHeight", "Lexpo/modules/kotlin/viewevent/ViewEventCallback;", "onCameraReady$delegate", "Lexpo/modules/kotlin/viewevent/ViewEventDelegate;", "getOnCameraReady", "()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", "onCameraReady", "Lexpo/modules/camera/common/CameraMountErrorEvent;", "onMountError$delegate", "getOnMountError", "onMountError", "Lexpo/modules/camera/common/BarcodeScannedEvent;", "onBarcodeScanned$delegate", "getOnBarcodeScanned", "Lexpo/modules/camera/common/PictureSavedEvent;", "onPictureSaved$delegate", "getOnPictureSaved", "Landroidx/appcompat/app/d;", "getCurrentActivity", "()Landroidx/appcompat/app/d;", "currentActivity", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class ExpoCameraView extends ExpoView implements CameraViewInterface {
    static final /* synthetic */ C7.k[] $$delegatedProperties = {D.e(new p(ExpoCameraView.class, "enableTorch", "getEnableTorch()Z", 0)), D.k(new v(ExpoCameraView.class, "onCameraReady", "getOnCameraReady()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), D.k(new v(ExpoCameraView.class, "onMountError", "getOnMountError()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), D.k(new v(ExpoCameraView.class, "onBarcodeScanned", "getOnBarcodeScanned()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0)), D.k(new v(ExpoCameraView.class, "onPictureSaved", "getOnPictureSaved()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0))};
    private b0 activeRecording;
    private boolean animateShutter;
    private FocusMode autoFocus;
    private List<? extends BarcodeType> barcodeFormats;
    private InterfaceC3584i camera;
    private CameraMode cameraMode;
    private Y.k cameraProvider;

    /* JADX INFO: renamed from: enableTorch$delegate, reason: from kotlin metadata */
    private final kotlin.properties.d enableTorch;
    private FlashMode flashMode;
    private SurfaceTexture glSurfaceTexture;
    private androidx.camera.core.g imageAnalysisUseCase;
    private V imageCaptureUseCase;
    private boolean isRecording;
    private int lastHeight;
    private int lastWidth;
    private CameraType lensFacing;
    private boolean mirror;
    private boolean mute;

    /* JADX INFO: renamed from: onBarcodeScanned$delegate, reason: from kotlin metadata */
    private final ViewEventDelegate onBarcodeScanned;

    /* JADX INFO: renamed from: onCameraReady$delegate, reason: from kotlin metadata */
    private final ViewEventDelegate onCameraReady;

    /* JADX INFO: renamed from: onMountError$delegate, reason: from kotlin metadata */
    private final ViewEventDelegate onMountError;

    /* JADX INFO: renamed from: onPictureSaved$delegate, reason: from kotlin metadata */
    private final ViewEventDelegate onPictureSaved;

    /* JADX INFO: renamed from: orientationEventListener$delegate, reason: from kotlin metadata */
    private final Lazy orientationEventListener;
    private String pictureSize;
    private boolean previewPaused;
    private m previewView;
    private CameraRatio ratio;
    private S recorder;
    private final N scope;
    private boolean shouldCreateCamera;
    private boolean shouldScanBarcodes;
    private Integer videoEncodingBitrate;
    private VideoQuality videoQuality;
    private VideoStabilizationMode videoStabilizationMode;
    private float zoom;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AbstractC3599t.b.values().length];
            try {
                iArr[AbstractC3599t.b.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[m.d.values().length];
            try {
                iArr2[m.d.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[m.d.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: expo.modules.camera.ExpoCameraView$createCamera$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.camera.ExpoCameraView", f = "ExpoCameraView.kt", l = {440}, m = "createCamera")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C24531 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C24531(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return ExpoCameraView.this.createCamera(this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.camera.ExpoCameraView$recreateCamera$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.camera.ExpoCameraView$recreateCamera$1", f = "ExpoCameraView.kt", l = {430}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class C24541 extends kotlin.coroutines.jvm.internal.l implements Function2 {
        int label;

        C24541(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ExpoCameraView.this.new C24541(fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24541) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                ExpoCameraView expoCameraView = ExpoCameraView.this;
                this.label = 1;
                if (expoCameraView.createCamera(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.camera.ExpoCameraView$resumePreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.camera.ExpoCameraView$resumePreview$1", f = "ExpoCameraView.kt", l = {668}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class C24551 extends kotlin.coroutines.jvm.internal.l implements Function2 {
        int label;

        C24551(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ExpoCameraView.this.new C24551(fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24551) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                ExpoCameraView expoCameraView = ExpoCameraView.this;
                this.label = 1;
                if (expoCameraView.createCamera(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.camera.ExpoCameraView$setPreviewTexture$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @kotlin.coroutines.jvm.internal.f(c = "expo.modules.camera.ExpoCameraView$setPreviewTexture$1", f = "ExpoCameraView.kt", l = {814}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class C24561 extends kotlin.coroutines.jvm.internal.l implements Function2 {
        int label;

        C24561(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return ExpoCameraView.this.new C24561(fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C24561) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                ExpoCameraView expoCameraView = ExpoCameraView.this;
                this.label = 1;
                if (expoCameraView.createCamera(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.camera.ExpoCameraView$takePicture$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"expo/modules/camera/ExpoCameraView$takePicture$1", "Ly/V$e;", "Li7/B;", "onCaptureStarted", "()V", "Landroidx/camera/core/o;", "image", "onCaptureSuccess", "(Landroidx/camera/core/o;)V", "Ly/X;", NotificationsService.EXCEPTION_KEY, "onError", "(Ly/X;)V", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C24571 extends V.e {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ boolean $hasShutterSound;
        final /* synthetic */ PictureOptions $options;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ Runtime $runtimeContext;
        final /* synthetic */ int $volume;
        final /* synthetic */ ExpoCameraView this$0;

        C24571(boolean z10, int i10, ExpoCameraView expoCameraView, PictureOptions pictureOptions, Promise promise, File file, Runtime runtime) {
            this.$hasShutterSound = z10;
            this.$volume = i10;
            this.this$0 = expoCameraView;
            this.$options = pictureOptions;
            this.$promise = promise;
            this.$cacheDirectory = file;
            this.$runtimeContext = runtime;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onCaptureStarted$lambda$1(final ExpoCameraView expoCameraView) {
            expoCameraView.getRootView().setForeground(new ColorDrawable(-1));
            expoCameraView.getRootView().postDelayed(new Runnable() { // from class: expo.modules.camera.k
                @Override // java.lang.Runnable
                public final void run() {
                    ExpoCameraView.C24571.onCaptureStarted$lambda$1$lambda$0(expoCameraView);
                }
            }, 50L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onCaptureStarted$lambda$1$lambda$0(ExpoCameraView expoCameraView) {
            expoCameraView.getRootView().setForeground(null);
        }

        @Override // y.V.e
        public void onCaptureStarted() {
            if (this.$hasShutterSound && this.$volume != 0) {
                new MediaActionSound().play(0);
            }
            if (this.this$0.getAnimateShutter()) {
                View rootView = this.this$0.getRootView();
                final ExpoCameraView expoCameraView = this.this$0;
                rootView.postDelayed(new Runnable() { // from class: expo.modules.camera.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExpoCameraView.C24571.onCaptureStarted$lambda$1(expoCameraView);
                    }
                }, 100L);
            }
        }

        @Override // y.V.e
        public void onCaptureSuccess(o image) {
            AbstractC2855l.g(image, "image");
            o.a[] aVarArrP = image.p();
            AbstractC2855l.f(aVarArrP, "getPlanes(...)");
            byte[] byteArray = BarcodeAnalyzerKt.toByteArray(aVarArrP);
            if (this.$options.getFastMode()) {
                this.$promise.resolve((Object) null);
            }
            File file = this.$cacheDirectory;
            ExpoCameraView expoCameraView = this.this$0;
            AbstractC1417k.d(expoCameraView.scope, null, null, new ExpoCameraView$takePicture$1$onCaptureSuccess$1$1(expoCameraView, byteArray, this.$promise, this.$options, this.$runtimeContext, file, null), 3, null);
            image.close();
        }

        @Override // y.V.e
        public void onError(X exception) {
            AbstractC2855l.g(exception, "exception");
            this.$promise.reject(new CameraExceptions.ImageCaptureFailed());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpoCameraView(Context context, final AppContext appContext) {
        super(context, appContext);
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(appContext, "appContext");
        this.orientationEventListener = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.camera.c
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return ExpoCameraView.orientationEventListener_delegate$lambda$0(appContext, this);
            }
        });
        this.barcodeFormats = AbstractC2800q.j();
        m mVar = new m(context);
        mVar.setElevation(0.0f);
        this.previewView = mVar;
        this.scope = O.a(C1404d0.c());
        this.lensFacing = CameraType.BACK;
        this.flashMode = FlashMode.OFF;
        this.cameraMode = CameraMode.PICTURE;
        this.autoFocus = FocusMode.OFF;
        this.videoQuality = VideoQuality.VIDEO1080P;
        this.videoStabilizationMode = VideoStabilizationMode.AUTO;
        this.pictureSize = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        this.animateShutter = true;
        kotlin.properties.a aVar = kotlin.properties.a.f29400a;
        final Boolean bool = Boolean.FALSE;
        this.enableTorch = new kotlin.properties.b(bool) { // from class: expo.modules.camera.ExpoCameraView$special$$inlined$observable$1
            @Override // kotlin.properties.b
            protected void afterChange(C7.k property, Boolean oldValue, Boolean newValue) {
                AbstractC2855l.g(property, "property");
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.getClass();
                this.setTorchEnabled(zBooleanValue);
            }
        };
        this.onCameraReady = new ViewEventDelegate(this, null);
        this.onMountError = new ViewEventDelegate(this, null);
        this.onBarcodeScanned = new ViewEventDelegate(this, new Function1() { // from class: expo.modules.camera.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Short.valueOf(ExpoCameraView.onBarcodeScanned_delegate$lambda$4((BarcodeScannedEvent) obj));
            }
        });
        this.onPictureSaved = new ViewEventDelegate(this, new Function1() { // from class: expo.modules.camera.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Short.valueOf(ExpoCameraView.onPictureSaved_delegate$lambda$5((PictureSavedEvent) obj));
            }
        });
        getOrientationEventListener().enable();
        this.previewView.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: expo.modules.camera.ExpoCameraView.1
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View parent, View child) {
                if (parent != null) {
                    parent.measure(View.MeasureSpec.makeMeasureSpec(ExpoCameraView.this.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ExpoCameraView.this.getMeasuredHeight(), 1073741824));
                }
                if (parent != null) {
                    parent.layout(0, 0, parent.getMeasuredWidth(), parent.getMeasuredHeight());
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View parent, View child) {
            }
        });
        addView(this.previewView, new ViewGroup.LayoutParams(-1, -1));
    }

    private final S.c buildResolutionSelector() {
        S.d HIGHEST_AVAILABLE_STRATEGY;
        if (this.pictureSize.length() > 0) {
            Size sizeSafely = parseSizeSafely(this.pictureSize);
            if (sizeSafely != null) {
                HIGHEST_AVAILABLE_STRATEGY = new S.d(sizeSafely, 3);
            } else {
                HIGHEST_AVAILABLE_STRATEGY = S.d.f10241c;
                AbstractC2855l.f(HIGHEST_AVAILABLE_STRATEGY, "HIGHEST_AVAILABLE_STRATEGY");
            }
        } else {
            HIGHEST_AVAILABLE_STRATEGY = S.d.f10241c;
            AbstractC2855l.d(HIGHEST_AVAILABLE_STRATEGY);
        }
        if (this.ratio == CameraRatio.ONE_ONE) {
            S.c cVarA = new c.a().e(new S.b() { // from class: expo.modules.camera.f
                @Override // S.b
                public final List a(List list, int i10) {
                    return ExpoCameraView.buildResolutionSelector$lambda$27(list, i10);
                }
            }).f(HIGHEST_AVAILABLE_STRATEGY).a();
            AbstractC2855l.d(cVarA);
            return cVarA;
        }
        c.a aVar = new c.a();
        CameraRatio cameraRatio = this.ratio;
        if (cameraRatio != null) {
            aVar.d(cameraRatio.mapToStrategy());
        }
        aVar.f(HIGHEST_AVAILABLE_STRATEGY);
        S.c cVarA2 = aVar.a();
        AbstractC2855l.d(cVarA2);
        return cVarA2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List buildResolutionSelector$lambda$27(List supportedSizes, int i10) {
        AbstractC2855l.g(supportedSizes, "supportedSizes");
        ArrayList arrayList = new ArrayList();
        for (Object obj : supportedSizes) {
            Size size = (Size) obj;
            if (size.getWidth() == size.getHeight()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final Object cancelCoroutineScope() {
        try {
            O.b(this.scope, new ModuleDestroyedException(null, 1, null));
            return C2735B.f28704a;
        } catch (Exception unused) {
            return Integer.valueOf(Log.e(CameraViewModule.INSTANCE.getTAG$expo_camera_release(), "The scope does not have a job in it"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @SuppressLint({"UnsafeOptInUsageError"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createCamera(n7.f fVar) {
        C24531 c24531;
        V.i screenFlash;
        Activity currentActivity;
        Window window;
        if (fVar instanceof C24531) {
            c24531 = (C24531) fVar;
            int i10 = c24531.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c24531.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c24531 = new C24531(fVar);
            }
        }
        Object objA = c24531.result;
        Object objE = AbstractC3016b.e();
        int i11 = c24531.label;
        if (i11 == 0) {
            AbstractC2753p.b(objA);
            if (!this.shouldCreateCamera || this.previewPaused) {
                return C2735B.f28704a;
            }
            this.shouldCreateCamera = false;
            k.a aVar = Y.k.f12592b;
            Context context = getContext();
            AbstractC2855l.f(context, "getContext(...)");
            c24531.label = 1;
            objA = Y.l.a(aVar, context, c24531);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(objA);
        }
        Y.k kVar = (Y.k) objA;
        CameraRatio cameraRatio = this.ratio;
        if (cameraRatio != null) {
            this.previewView.setScaleType((cameraRatio == CameraRatio.FOUR_THREE || cameraRatio == CameraRatio.SIXTEEN_NINE) ? m.d.FIT_CENTER : m.d.FILL_CENTER);
        }
        S.c cVarBuildResolutionSelector = buildResolutionSelector();
        p0 p0VarE = new p0.a().k(cVarBuildResolutionSelector).e();
        p0VarE.p0(this.previewView.getSurfaceProvider());
        AbstractC2855l.f(p0VarE, "also(...)");
        final SurfaceTexture surfaceTexture = this.glSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.previewView.getWidth(), this.previewView.getHeight());
            p0VarE.p0(new p0.c() { // from class: expo.modules.camera.i
                @Override // y.p0.c
                public final void a(I0 i02) {
                    ExpoCameraView.createCamera$lambda$16$lambda$15(surfaceTexture, this, i02);
                }
            });
        }
        C3598s c3598sA = new C3598s.a().b(this.lensFacing.mapToCharacteristic()).a();
        AbstractC2855l.f(c3598sA, "build(...)");
        FlashMode flashMode = this.flashMode;
        FlashMode flashMode2 = FlashMode.SCREEN;
        if (flashMode == flashMode2 && this.lensFacing != CameraType.FRONT) {
            flashMode = FlashMode.ON;
        }
        if (flashMode == flashMode2 && (currentActivity = getAppContext().getCurrentActivity()) != null && (window = currentActivity.getWindow()) != null) {
            this.previewView.setScreenFlashWindow(window);
        }
        V.b bVarJ = new V.b().l(cVarBuildResolutionSelector).j(flashMode.mapToLens());
        AbstractC2855l.f(bVarJ, "setFlashMode(...)");
        if (flashMode == flashMode2 && (screenFlash = this.previewView.getScreenFlash()) != null) {
            bVarJ.m(screenFlash);
        }
        this.imageCaptureUseCase = bVarJ.e();
        m0 m0VarCreateVideoCapture = createVideoCapture();
        this.imageAnalysisUseCase = createImageAnalyzer();
        K0.a aVar2 = new K0.a();
        aVar2.a(p0VarE);
        if (this.cameraMode == CameraMode.PICTURE) {
            V v10 = this.imageCaptureUseCase;
            if (v10 != null) {
                aVar2.a(v10);
            }
            androidx.camera.core.g gVar = this.imageAnalysisUseCase;
            if (gVar != null) {
                aVar2.a(gVar);
            }
        } else {
            aVar2.a(m0VarCreateVideoCapture);
        }
        K0 k0B = aVar2.b();
        AbstractC2855l.f(k0B, "build(...)");
        try {
            kVar.f();
            InterfaceC3584i interfaceC3584iD = kVar.d(getCurrentActivity(), c3598sA, k0B);
            this.camera = interfaceC3584iD;
            if (interfaceC3584iD != null) {
                InterfaceC3597q interfaceC3597qD = interfaceC3584iD.d();
                AbstractC2855l.f(interfaceC3597qD, "getCameraInfo(...)");
                observeCameraState(interfaceC3597qD);
            }
            setCameraZoom(this.zoom);
            this.cameraProvider = kVar;
        } catch (Exception unused) {
            getOnMountError().invoke(new CameraMountErrorEvent("Camera component could not be rendered - is there any other instance running?"));
        }
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCamera$lambda$16$lambda$15(SurfaceTexture surfaceTexture, ExpoCameraView expoCameraView, I0 request) {
        AbstractC2855l.g(request, "request");
        final Surface surface = new Surface(surfaceTexture);
        request.w(surface, androidx.core.content.a.h(expoCameraView.getContext()), new H0.a() { // from class: expo.modules.camera.b
            @Override // H0.a
            public final void accept(Object obj) {
                surface.release();
            }
        });
    }

    private final androidx.camera.core.g createImageAnalyzer() {
        androidx.camera.core.g gVarE = new g.c().l(new c.a().f(S.d.f10241c).a()).h(0).e();
        AbstractC2855l.f(gVarE, "build(...)");
        if (this.shouldScanBarcodes && CameraUtils.INSTANCE.isMLKitBarcodeScannerAvailable()) {
            try {
                gVarE.t0(androidx.core.content.a.h(getContext()), new BarcodeAnalyzer(this.barcodeFormats, new Function1() { // from class: expo.modules.camera.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ExpoCameraView.createImageAnalyzer$lambda$24$lambda$23(this.f26455g, (BarCodeScannerResult) obj);
                    }
                }));
                return gVarE;
            } catch (Exception e10) {
                CameraViewModule.INSTANCE.getTAG$expo_camera_release();
                e10.getMessage();
            }
        }
        return gVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B createImageAnalyzer$lambda$24$lambda$23(ExpoCameraView expoCameraView, BarCodeScannerResult it) {
        AbstractC2855l.g(it, "it");
        expoCameraView.onBarcodeScanned(it);
        return C2735B.f28704a;
    }

    private final m0 createVideoCapture() {
        AbstractC1582v abstractC1582vMapToQuality = this.videoQuality.mapToQuality();
        AbstractC1577p abstractC1577pA = AbstractC1577p.a(abstractC1582vMapToQuality);
        AbstractC2855l.f(abstractC1577pA, "higherQualityOrLowerThan(...)");
        C1585y c1585yD = C1585y.d(abstractC1582vMapToQuality, abstractC1577pA);
        AbstractC2855l.f(c1585yD, "from(...)");
        S.i iVar = new S.i();
        Integer num = this.videoEncodingBitrate;
        if (num != null) {
            iVar.f(num.intValue());
        }
        S sC = iVar.d(androidx.core.content.a.h(getContext())).e(c1585yD).c();
        this.recorder = sC;
        AbstractC2855l.f(sC, "also(...)");
        m0.d dVar = new m0.d(sC);
        if (this.mirror) {
            dVar.k(2);
        }
        dVar.s(this.videoStabilizationMode.isEnabled());
        m0 m0VarE = dVar.e();
        AbstractC2855l.f(m0VarE, "build(...)");
        return m0VarE;
    }

    private final Pair<ArrayList<Bundle>, Bundle> getCornerPointsAndBoundingBox(List<Integer> cornerPoints, BarCodeScannerResult.BoundingBox boundingBox) {
        float f10 = this.previewView.getResources().getDisplayMetrics().density;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int iB = AbstractC3130c.b(0, cornerPoints.size() - 1, 2);
        if (iB >= 0) {
            while (true) {
                Bundle bundle = new Bundle();
                bundle.putFloat("x", cornerPoints.get(i10).intValue() / f10);
                bundle.putFloat("y", cornerPoints.get(i10 + 1).intValue() / f10);
                arrayList.add(bundle);
                if (i10 == iB) {
                    break;
                }
                i10 += 2;
            }
        }
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        bundle3.putFloat("x", boundingBox.getX() / f10);
        bundle3.putFloat("y", boundingBox.getY() / f10);
        C2735B c2735b = C2735B.f28704a;
        bundle2.putParcelable("origin", bundle3);
        Bundle bundle4 = new Bundle();
        bundle4.putFloat("width", boundingBox.getWidth() / f10);
        bundle4.putFloat("height", boundingBox.getHeight() / f10);
        bundle2.putParcelable("size", bundle4);
        return t.a(arrayList, bundle2);
    }

    private final androidx.appcompat.app.d getCurrentActivity() throws Exceptions.MissingActivity {
        Activity throwingActivity = getAppContext().getThrowingActivity();
        AbstractC2855l.e(throwingActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return (androidx.appcompat.app.d) throwingActivity;
    }

    private final ViewEventCallback<BarcodeScannedEvent> getOnBarcodeScanned() {
        return this.onBarcodeScanned.getValue(this, $$delegatedProperties[3]);
    }

    private final ViewEventCallback<C2735B> getOnCameraReady() {
        return this.onCameraReady.getValue(this, $$delegatedProperties[1]);
    }

    private final ViewEventCallback<CameraMountErrorEvent> getOnMountError() {
        return this.onMountError.getValue(this, $$delegatedProperties[2]);
    }

    private final ViewEventCallback<PictureSavedEvent> getOnPictureSaved() {
        return this.onPictureSaved.getValue(this, $$delegatedProperties[4]);
    }

    private final ExpoCameraView$orientationEventListener$2$1 getOrientationEventListener() {
        return (ExpoCameraView$orientationEventListener$2$1) this.orientationEventListener.getValue();
    }

    private final void observeCameraState(InterfaceC3597q cameraInfo) {
        cameraInfo.c().h(getCurrentActivity(), new ExpoCameraViewKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: expo.modules.camera.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExpoCameraView.observeCameraState$lambda$35(this.f26446g, (AbstractC3599t) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B observeCameraState$lambda$35(ExpoCameraView expoCameraView, AbstractC3599t abstractC3599t) {
        if (WhenMappings.$EnumSwitchMapping$0[abstractC3599t.d().ordinal()] == 1) {
            expoCameraView.getOnCameraReady().invoke(C2735B.f28704a);
            expoCameraView.setTorchEnabled(expoCameraView.getEnableTorch());
        }
        return C2735B.f28704a;
    }

    private final void onBarcodeScanned(BarCodeScannerResult barcode) {
        if (this.shouldScanBarcodes) {
            transformBarcodeScannerResultToViewCoordinates(barcode);
            Pair<ArrayList<Bundle>, Bundle> cornerPointsAndBoundingBox = getCornerPointsAndBoundingBox(barcode.getCornerPoints(), barcode.getBoundingBox());
            getOnBarcodeScanned().invoke(new BarcodeScannedEvent(getId(), String.valueOf(barcode.getValue()), String.valueOf(barcode.getRaw()), BarcodeType.INSTANCE.mapFormatToString(barcode.getType()), (ArrayList) cornerPointsAndBoundingBox.getFirst(), (Bundle) cornerPointsAndBoundingBox.getSecond(), barcode.getExtra()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final short onBarcodeScanned_delegate$lambda$4(BarcodeScannedEvent event) {
        AbstractC2855l.g(event, "event");
        return (short) (event.getData().hashCode() % 32767);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final short onPictureSaved_delegate$lambda$5(PictureSavedEvent event) {
        AbstractC2855l.g(event, "event");
        String string = event.getData().getString("uri");
        return (short) ((string != null ? string.hashCode() : -1) % 32767);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [expo.modules.camera.ExpoCameraView$orientationEventListener$2$1] */
    public static final ExpoCameraView$orientationEventListener$2$1 orientationEventListener_delegate$lambda$0(AppContext appContext, final ExpoCameraView expoCameraView) throws Exceptions.MissingActivity {
        final Activity throwingActivity = appContext.getThrowingActivity();
        return new OrientationEventListener(throwingActivity) { // from class: expo.modules.camera.ExpoCameraView$orientationEventListener$2$1
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int orientation) {
                if (orientation == -1) {
                    return;
                }
                int i10 = (45 > orientation || orientation >= 135) ? (135 > orientation || orientation >= 225) ? (225 > orientation || orientation >= 315) ? 0 : 1 : 2 : 3;
                androidx.camera.core.g gVar = this.this$0.imageAnalysisUseCase;
                if (gVar != null) {
                    gVar.u0(i10);
                }
                V v10 = this.this$0.imageCaptureUseCase;
                if (v10 != null) {
                    v10.Q0(i10);
                }
            }
        };
    }

    private final Size parseSizeSafely(String size) {
        if (!new P8.o("\\d+x\\d+").d(size)) {
            return null;
        }
        try {
            return Size.parseSize(size);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void record$lambda$10$lambda$9(ExpoCameraView expoCameraView, Promise promise, y0 event) {
        String message;
        String message2;
        AbstractC2855l.g(event, "event");
        if (event instanceof y0.b) {
            expoCameraView.isRecording = false;
            return;
        }
        if (event instanceof y0.c) {
            expoCameraView.isRecording = true;
            return;
        }
        if (event instanceof y0.d) {
            expoCameraView.isRecording = true;
            return;
        }
        if (event instanceof y0.a) {
            y0.a aVar = (y0.a) event;
            int iJ = aVar.j();
            if (iJ == 0 || iJ == 2 || iJ == 4 || iJ == 9) {
                Bundle bundle = new Bundle();
                bundle.putString("uri", aVar.k().a().toString());
                promise.resolve(bundle);
                return;
            }
            Throwable thI = aVar.i();
            if (thI == null || (message2 = thI.getMessage()) == null) {
                Throwable thI2 = aVar.i();
                if (thI2 == null || (message = thI2.getMessage()) == null) {
                    message = "Unknown error";
                }
                message2 = "Video recording Failed: " + message;
            }
            promise.reject(new CameraExceptions.VideoRecordingFailed(message2));
        }
    }

    private final void setCameraZoom(float value) {
        InterfaceC3586j interfaceC3586jB;
        InterfaceC3597q interfaceC3597qD;
        AbstractC1776x abstractC1776xY;
        M0 m02;
        InterfaceC3584i interfaceC3584i = this.camera;
        float fA = (interfaceC3584i == null || (interfaceC3597qD = interfaceC3584i.d()) == null || (abstractC1776xY = interfaceC3597qD.y()) == null || (m02 = (M0) abstractC1776xY.e()) == null) ? 1.0f : m02.a();
        float fMax = Float.max(1.0f, Float.min(fA, B7.d.k(value, 0.0f, 1.0f) * fA));
        InterfaceC3584i interfaceC3584i2 = this.camera;
        if (interfaceC3584i2 == null || (interfaceC3586jB = interfaceC3584i2.b()) == null) {
            return;
        }
        interfaceC3586jB.g(fMax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTorchEnabled(boolean enabled) {
        InterfaceC3597q interfaceC3597qD;
        InterfaceC3584i interfaceC3584i;
        InterfaceC3586j interfaceC3586jB;
        InterfaceC3584i interfaceC3584i2 = this.camera;
        if (interfaceC3584i2 == null || (interfaceC3597qD = interfaceC3584i2.d()) == null || !interfaceC3597qD.s() || (interfaceC3584i = this.camera) == null || (interfaceC3586jB = interfaceC3584i.b()) == null) {
            return;
        }
        interfaceC3586jB.k(enabled);
    }

    private final void startFocusMetering() {
        InterfaceC3584i interfaceC3584i = this.camera;
        if (interfaceC3584i != null) {
            C3565J c3565jB = new C3565J.a(new C3562G(this.previewView.getDisplay(), interfaceC3584i.d(), this.previewView.getWidth(), this.previewView.getHeight()).b(1.0f, 1.0f), 1).b();
            AbstractC2855l.f(c3565jB, "build(...)");
            interfaceC3584i.b().i(c3565jB);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void transformBarcodeScannerResultToViewCoordinates(BarCodeScannerResult barcode) {
        float f10;
        float f11;
        float f12;
        List<Integer> cornerPoints = barcode.getCornerPoints();
        float width = this.previewView.getWidth();
        float height = this.previewView.getHeight();
        float width2 = barcode.getWidth();
        float height2 = barcode.getHeight();
        float f13 = 0.0f;
        if (width <= 0.0f || height <= 0.0f || width2 <= 0.0f || height2 <= 0.0f) {
            return;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$1[this.previewView.getScaleType().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                f12 = width / width2;
                f10 = height / height2;
                f11 = 0.0f;
            } else if (width / height > width2 / height2) {
                f12 = width / width2;
                f11 = (height - (height2 * f12)) / 2.0f;
                f10 = f12;
            } else {
                f10 = height / height2;
                f11 = 0.0f;
                f13 = (width - (width2 * f10)) / 2.0f;
                f12 = f10;
            }
        } else if (width / height > width2 / height2) {
        }
        B7.a aVarO = B7.d.o(B7.d.p(0, cornerPoints.size()), 2);
        int iD = aVarO.d();
        int iO = aVarO.o();
        int iP = aVarO.p();
        if ((iP > 0 && iD <= iO) || (iP < 0 && iO <= iD)) {
            while (true) {
                cornerPoints.set(iD, Integer.valueOf(AbstractC3624a.c((cornerPoints.get(iD).intValue() * f12) + f13)));
                if (iD == iO) {
                    break;
                } else {
                    iD += iP;
                }
            }
        }
        B7.a aVarO2 = B7.d.o(B7.d.p(1, cornerPoints.size()), 2);
        int iD2 = aVarO2.d();
        int iO2 = aVarO2.o();
        int iP2 = aVarO2.p();
        if ((iP2 > 0 && iD2 <= iO2) || (iP2 < 0 && iO2 <= iD2)) {
            while (true) {
                cornerPoints.set(iD2, Integer.valueOf(AbstractC3624a.c((cornerPoints.get(iD2).intValue() * f10) + f11)));
                if (iD2 == iO2) {
                    break;
                } else {
                    iD2 += iP2;
                }
            }
        }
        barcode.setCornerPoints(cornerPoints);
        barcode.setHeight((int) height);
        barcode.setWidth((int) width);
    }

    public final void cleanupCamera() {
        getOrientationEventListener().disable();
        cancelCoroutineScope();
        Y.k kVar = this.cameraProvider;
        if (kVar != null) {
            kVar.f();
        }
        SurfaceTexture surfaceTexture = this.glSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final boolean getAnimateShutter() {
        return this.animateShutter;
    }

    public final FocusMode getAutoFocus() {
        return this.autoFocus;
    }

    public final List<String> getAvailablePictureSizes() {
        InterfaceC3597q interfaceC3597qD;
        ArrayList arrayList;
        Size[] outputSizes;
        InterfaceC3584i interfaceC3584i = this.camera;
        if (interfaceC3584i != null && (interfaceC3597qD = interfaceC3584i.d()) != null) {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) x.h.a(interfaceC3597qD).b(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(256)) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(outputSizes.length);
                for (Size size : outputSizes) {
                    String string = size.toString();
                    AbstractC2855l.f(string, "toString(...)");
                    arrayList.add(string);
                }
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        return AbstractC2800q.j();
    }

    public final InterfaceC3584i getCamera() {
        return this.camera;
    }

    public final CameraMode getCameraMode() {
        return this.cameraMode;
    }

    public final boolean getEnableTorch() {
        return ((Boolean) this.enableTorch.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final FlashMode getFlashMode() {
        return this.flashMode;
    }

    public final CameraType getLensFacing() {
        return this.lensFacing;
    }

    public final boolean getMirror() {
        return this.mirror;
    }

    public final boolean getMute() {
        return this.mute;
    }

    public final String getPictureSize() {
        return this.pictureSize;
    }

    @Override // expo.modules.interfaces.camera.CameraViewInterface
    public int[] getPreviewSizeAsArray() {
        return new int[]{this.previewView.getWidth(), this.previewView.getHeight()};
    }

    public final CameraRatio getRatio() {
        return this.ratio;
    }

    public final Integer getVideoEncodingBitrate() {
        return this.videoEncodingBitrate;
    }

    public final VideoQuality getVideoQuality() {
        return this.videoQuality;
    }

    public final VideoStabilizationMode getVideoStabilizationMode() {
        return this.videoStabilizationMode;
    }

    public final float getZoom() {
        return this.zoom;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i10 = right - left;
        int i11 = bottom - top;
        if (i10 == this.lastWidth && i11 == this.lastHeight) {
            return;
        }
        this.previewView.layout(0, 0, i10, i11);
        SurfaceTexture surfaceTexture = this.glSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i10, i11);
        }
        this.lastWidth = i10;
        this.lastHeight = i11;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        measureChild(this.previewView, widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(View.resolveSize(this.previewView.getMeasuredWidth(), widthMeasureSpec), View.resolveSize(this.previewView.getMeasuredHeight(), heightMeasureSpec));
    }

    public final void onPictureSaved(Bundle response) {
        AbstractC2855l.g(response, "response");
        ViewEventCallback<PictureSavedEvent> onPictureSaved = getOnPictureSaved();
        int i10 = response.getInt("id");
        Bundle bundle = response.getBundle("data");
        AbstractC2855l.d(bundle);
        onPictureSaved.invoke(new PictureSavedEvent(i10, bundle));
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View child) {
        super.onViewAdded(child);
        if (AbstractC2855l.b(child, this.previewView)) {
            return;
        }
        if (child != null) {
            child.bringToFront();
        }
        removeView(this.previewView);
        addView(this.previewView, 0);
    }

    public final void pausePreview() {
        this.previewPaused = true;
        Y.k kVar = this.cameraProvider;
        if (kVar != null) {
            kVar.f();
        }
    }

    public final void record(RecordingOptions options, final Promise promise, File cacheDirectory) {
        AbstractC2855l.g(options, "options");
        AbstractC2855l.g(promise, "promise");
        AbstractC2855l.g(cacheDirectory, "cacheDirectory");
        C1578q c1578qC = ((C1578q.a) ((C1578q.a) new C1578q.a(FileSystemUtils.INSTANCE.generateOutputFile(cacheDirectory, "Camera", ".mp4")).b(options.getMaxFileSize())).a(((long) options.getMaxDuration()) * ((long) ProgressBarContainerView.MAX_PROGRESS))).c();
        AbstractC2855l.f(c1578qC, "build(...)");
        S s10 = this.recorder;
        if (s10 == null) {
            promise.reject("E_RECORDING_FAILED", "Starting video recording failed - could not create video file.", null);
            return;
        }
        if (!this.mute && androidx.core.content.a.a(getContext(), "android.permission.RECORD_AUDIO") != 0) {
            promise.reject(new Exceptions.MissingPermissions("android.permission.RECORD_AUDIO"));
            return;
        }
        C1581u c1581uG0 = s10.g0(getContext(), c1578qC);
        if (!this.mute) {
            C1581u.k(c1581uG0, false, 1, null);
        }
        Executor executorH = androidx.core.content.a.h(getContext());
        AbstractC2855l.f(executorH, "getMainExecutor(...)");
        this.activeRecording = c1581uG0.i(executorH, new H0.a() { // from class: expo.modules.camera.h
            @Override // H0.a
            public final void accept(Object obj) {
                ExpoCameraView.record$lambda$10$lambda$9(this.f26456a, promise, (y0) obj);
            }
        });
    }

    public final void recreateCamera() {
        AbstractC1417k.d(this.scope, null, null, new C24541(null), 3, null);
    }

    public final void resumePreview() {
        this.shouldCreateCamera = true;
        this.previewPaused = false;
        AbstractC1417k.d(this.scope, null, null, new C24551(null), 3, null);
    }

    public final void setAnimateShutter(boolean z10) {
        this.animateShutter = z10;
    }

    public final void setAutoFocus(FocusMode value) {
        InterfaceC3586j interfaceC3586jB;
        AbstractC2855l.g(value, "value");
        this.autoFocus = value;
        InterfaceC3584i interfaceC3584i = this.camera;
        if (interfaceC3584i == null || (interfaceC3586jB = interfaceC3584i.b()) == null) {
            return;
        }
        if (this.autoFocus == FocusMode.OFF) {
            AbstractC2855l.d(interfaceC3586jB.f());
        } else {
            startFocusMetering();
        }
    }

    public final void setBarcodeScannerSettings(BarcodeSettings settings) {
        List<BarcodeType> listJ;
        if (settings == null || (listJ = settings.getBarcodeTypes()) == null) {
            listJ = AbstractC2800q.j();
        }
        this.barcodeFormats = listJ;
    }

    public final void setCamera(InterfaceC3584i interfaceC3584i) {
        this.camera = interfaceC3584i;
    }

    public final void setCameraFlashMode(FlashMode mode) {
        Activity currentActivity;
        Window window;
        AbstractC2855l.g(mode, "mode");
        FlashMode flashMode = FlashMode.SCREEN;
        if (mode == flashMode && this.lensFacing != CameraType.FRONT) {
            mode = FlashMode.ON;
        }
        if (mode == flashMode && (currentActivity = getAppContext().getCurrentActivity()) != null && (window = currentActivity.getWindow()) != null) {
            this.previewView.setScreenFlashWindow(window);
            V v10 = this.imageCaptureUseCase;
            if (v10 != null) {
                v10.N0(this.previewView.getScreenFlash());
            }
        }
        V v11 = this.imageCaptureUseCase;
        if (v11 != null) {
            v11.M0(mode.mapToLens());
        }
    }

    public final void setCameraMode(CameraMode value) {
        AbstractC2855l.g(value, "value");
        this.cameraMode = value;
        this.shouldCreateCamera = true;
    }

    public final void setEnableTorch(boolean z10) {
        this.enableTorch.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z10));
    }

    public final void setFlashMode(FlashMode value) {
        AbstractC2855l.g(value, "value");
        this.flashMode = value;
        setCameraFlashMode(value);
    }

    public final void setLensFacing(CameraType value) {
        AbstractC2855l.g(value, "value");
        this.lensFacing = value;
        this.shouldCreateCamera = true;
    }

    public final void setMirror(boolean z10) {
        this.mirror = z10;
        this.shouldCreateCamera = true;
    }

    public final void setMute(boolean z10) {
        this.mute = z10;
    }

    public final void setPictureSize(String value) {
        AbstractC2855l.g(value, "value");
        this.pictureSize = value;
        this.shouldCreateCamera = true;
    }

    @Override // expo.modules.interfaces.camera.CameraViewInterface
    public void setPreviewTexture(SurfaceTexture surfaceTexture) {
        this.glSurfaceTexture = surfaceTexture;
        this.shouldCreateCamera = true;
        AbstractC1417k.d(this.scope, null, null, new C24561(null), 3, null);
    }

    public final void setRatio(CameraRatio cameraRatio) {
        this.ratio = cameraRatio;
        this.shouldCreateCamera = true;
    }

    public final void setShouldScanBarcodes(boolean shouldScanBarcodes) {
        this.shouldScanBarcodes = shouldScanBarcodes;
        this.shouldCreateCamera = true;
    }

    public final void setVideoEncodingBitrate(Integer num) {
        this.videoEncodingBitrate = num;
        this.shouldCreateCamera = true;
    }

    public final void setVideoQuality(VideoQuality value) {
        AbstractC2855l.g(value, "value");
        this.videoQuality = value;
        this.shouldCreateCamera = true;
    }

    public final void setVideoStabilizationMode(VideoStabilizationMode value) {
        AbstractC2855l.g(value, "value");
        this.videoStabilizationMode = value;
        this.shouldCreateCamera = true;
    }

    public final void setZoom(float f10) {
        this.zoom = f10;
        setCameraZoom(f10);
    }

    public final void stopRecording() {
        this.isRecording = false;
        b0 b0Var = this.activeRecording;
        if (b0Var != null) {
            b0Var.close();
        }
    }

    public final void takePicture(PictureOptions options, Promise promise, File cacheDirectory, Runtime runtimeContext) {
        AbstractC2855l.g(options, "options");
        AbstractC2855l.g(promise, "promise");
        AbstractC2855l.g(cacheDirectory, "cacheDirectory");
        AbstractC2855l.g(runtimeContext, "runtimeContext");
        Object systemService = getContext().getSystemService("audio");
        AbstractC2855l.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        int streamVolume = ((AudioManager) systemService).getStreamVolume(3);
        boolean shutterSound = options.getShutterSound();
        V v10 = this.imageCaptureUseCase;
        if (v10 != null) {
            v10.S0(androidx.core.content.a.h(getContext()), new C24571(shutterSound, streamVolume, this, options, promise, cacheDirectory, runtimeContext));
        }
    }

    public final void toggleRecording() {
        b0 b0Var = this.activeRecording;
        if (b0Var != null) {
            if (this.isRecording) {
                b0Var.r();
            } else {
                b0Var.s();
            }
        }
    }
}
