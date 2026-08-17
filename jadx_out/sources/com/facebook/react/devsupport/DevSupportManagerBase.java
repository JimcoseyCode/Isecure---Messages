package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.R;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.ShakeDetector;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.devsupport.BundleDownloader;
import com.facebook.react.devsupport.ChangeBundleLocationDialog;
import com.facebook.react.devsupport.DevInternalSettings;
import com.facebook.react.devsupport.DevServerHelper;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;
import com.facebook.react.devsupport.interfaces.DebuggerFrontendPanelName;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.ErrorCustomizer;
import com.facebook.react.devsupport.interfaces.ErrorType;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.devsupport.interfaces.TracingState;
import com.facebook.react.devsupport.interfaces.TracingStateProvider;
import com.facebook.react.devsupport.perfmonitor.PerfMonitorDevHelper;
import com.facebook.react.devsupport.perfmonitor.PerfMonitorInspectorTarget;
import com.facebook.react.devsupport.perfmonitor.PerfMonitorOverlayManager;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.common.UiModeUtils;
import com.facebook.react.views.text.DefaultStyleValuesUtil;
import d2.AbstractC2325a;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import i7.C2750m;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ø\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 \u009b\u00022\u00020\u0001:\u0004\u009c\u0002\u009b\u0002By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001f\u001a\u00020\u001e2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J7\u0010*\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u00020\u001e2\b\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u0006H\u0003¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u0006H\u0003¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\u001eH\u0003¢\u0006\u0004\b4\u0010\"J7\u00105\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b5\u0010+J\u001b\u00107\u001a\u00020\u001e2\n\u00106\u001a\u00060\u001bj\u0002`\u001cH\u0002¢\u0006\u0004\b7\u0010 J\u000f\u00108\u001a\u00020\u001eH\u0002¢\u0006\u0004\b8\u0010\"J\u000f\u00109\u001a\u00020\u001eH\u0002¢\u0006\u0004\b9\u0010\"J\u000f\u0010:\u001a\u00020\u001eH\u0002¢\u0006\u0004\b:\u0010\"J/\u0010A\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u00022\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\bH\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020C2\u0006\u0010;\u001a\u00020\u0002H\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020C2\u0006\u0010;\u001a\u00020\u0002H\u0002¢\u0006\u0004\bF\u0010EJ\u001b\u0010G\u001a\u00020\u001e2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0016¢\u0006\u0004\bG\u0010 J!\u0010I\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010N\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u00062\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ+\u0010R\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010'\u001a\u00020\u000eH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020\u001e2\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ;\u0010Z\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0X2\u0018\u0010Y\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0XH\u0016¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\\\u0010\"J\u0019\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010]\u001a\u00020\u0006H\u0016¢\u0006\u0004\b_\u0010`J\u0019\u0010b\u001a\u00020\u001e2\b\u0010a\u001a\u0004\u0018\u00010^H\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u001eH\u0016¢\u0006\u0004\bd\u0010\"J\u0017\u0010e\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\be\u0010/J\u0017\u0010f\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\bf\u0010/J\u000f\u0010g\u001a\u00020\bH\u0016¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u001eH\u0016¢\u0006\u0004\bi\u0010\"J\u000f\u0010j\u001a\u00020\u001eH\u0005¢\u0006\u0004\bj\u0010\"J\u000f\u0010k\u001a\u00020\u001eH\u0005¢\u0006\u0004\bk\u0010\"J\u001d\u0010o\u001a\u00020\u001e2\u0006\u0010l\u001a\u00020\u00062\u0006\u0010n\u001a\u00020m¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ!\u0010w\u001a\u0004\u0018\u00010u2\u0006\u0010t\u001a\u00020\u00062\u0006\u0010v\u001a\u00020uH\u0016¢\u0006\u0004\bw\u0010xJ\u001f\u0010{\u001a\u00020\u001e2\u0006\u0010y\u001a\u00020\u00062\u0006\u0010n\u001a\u00020zH\u0016¢\u0006\u0004\b{\u0010|J\u000f\u0010}\u001a\u00020\u001eH\u0016¢\u0006\u0004\b}\u0010\"J\u000f\u0010~\u001a\u00020\u001eH\u0016¢\u0006\u0004\b~\u0010\"J\u001a\u0010\u0080\u0001\u001a\u00020\u001e2\u0006\u0010\u007f\u001a\u00020\bH\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001b\u0010\u0083\u0001\u001a\u00020\u001e2\u0007\u0010\u0082\u0001\u001a\u00020\bH\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0081\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\u001eH\u0016¢\u0006\u0005\b\u0084\u0001\u0010\"J\u001c\u0010\u0087\u0001\u001a\u00020\u001e2\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001e\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00012\u0007\u0010\u0089\u0001\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001c\u0010\u008e\u0001\u001a\u00020\u001e2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0005\b\u008e\u0001\u00102J$\u0010\u0091\u0001\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00062\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\u001eH\u0016¢\u0006\u0005\b\u0093\u0001\u0010\"J$\u0010\u0096\u0001\u001a\u00020\u001e2\u0007\u0010\u0094\u0001\u001a\u00020\u00062\u0007\u0010\u0095\u0001\u001a\u00020\u0006H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001e\u0010\u009c\u0001\u001a\u00020\u001e2\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001a\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000f\n\u0005\b\u0005\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R(\u0010\u0007\u001a\u0004\u0018\u00010\u00068G@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0007\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0005\b¦\u0001\u00102R\u001f\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u000b\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R\u0017\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010ª\u0001R#\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010«\u0001R\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010¬\u0001R)\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0016\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0018\u0010²\u0001R.\u0010³\u0001\u001a\u0004\u0018\u00010,2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010,8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R\u001d\u0010¸\u0001\u001a\u00030·\u00018\u0006¢\u0006\u0010\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R1\u0010¼\u0001\u001a\u00020\b2\u0007\u0010\u0095\u0001\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u0017\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0005\b¾\u0001\u0010h\"\u0006\b¿\u0001\u0010\u0081\u0001R5\u0010À\u0001\u001a\u0004\u0018\u00010\u00062\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\u0017\n\u0006\bÀ\u0001\u0010£\u0001\u001a\u0006\bÁ\u0001\u0010¥\u0001\"\u0005\bÂ\u0001\u00102R\u001d\u0010Ä\u0001\u001a\u00030Ã\u00018\u0006¢\u0006\u0010\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R*\u0010È\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÈ\u0001\u0010£\u0001\u001a\u0006\bÉ\u0001\u0010¥\u0001\"\u0005\bÊ\u0001\u00102R1\u0010Ë\u0001\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R+\u0010Ñ\u0001\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R)\u0010×\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b×\u0001\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R\u0018\u0010Þ\u0001\u001a\u00030Ý\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u0017\u0010à\u0001\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R5\u0010ä\u0001\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020L0â\u0001j\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020L`ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0017\u0010æ\u0001\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0017\u0010è\u0001\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bè\u0001\u0010ç\u0001R\u0018\u0010ê\u0001\u001a\u00030é\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u001c\u0010ì\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u001c\u0010ï\u0001\u001a\u0005\u0018\u00010î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R\u001c\u0010ò\u0001\u001a\u0005\u0018\u00010ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R\u0019\u0010ô\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0001\u0010½\u0001R\u0019\u0010õ\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010Ø\u0001R\u0019\u0010ö\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0001\u0010½\u0001R\u0019\u0010÷\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010½\u0001R\u0019\u0010ø\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010½\u0001R\u0019\u0010ù\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0001\u0010½\u0001R\u001e\u0010û\u0001\u001a\t\u0012\u0004\u0012\u00020T0ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bû\u0001\u0010ü\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010ý\u0001R\u001c\u0010ÿ\u0001\u001a\u0005\u0018\u00010þ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R\u0019\u0010\u0081\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0002\u0010½\u0001R\u001c\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R(\u0010\u0084\u0002\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\b\u0084\u0002\u0010½\u0001\u001a\u0005\b\u0085\u0002\u0010h\"\u0006\b\u0086\u0002\u0010\u0081\u0001R(\u0010\u0087\u0002\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\b\u0087\u0002\u0010½\u0001\u001a\u0005\b\u0088\u0002\u0010h\"\u0006\b\u0089\u0002\u0010\u0081\u0001R\u0019\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008a\u0002\u0010¥\u0001R\u0017\u0010\u008d\u0002\u001a\u00020\u00068$X¤\u0004¢\u0006\b\u001a\u0006\b\u008c\u0002\u0010¥\u0001R\u001a\u0010\u0091\u0002\u001a\u0005\u0018\u00010\u008e\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002R)\u0010\u0094\u0002\u001a\u00020\b2\u0007\u0010ø\u0001\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u0092\u0002\u0010h\"\u0006\b\u0093\u0002\u0010\u0081\u0001R\u0017\u0010\u0096\u0002\u001a\u00020\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010¥\u0001R\u0017\u0010\u0098\u0002\u001a\u00020\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010¥\u0001R\u0017\u0010\u009a\u0002\u001a\u00020\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0099\u0002\u0010¥\u0001¨\u0006\u009d\u0002"}, d2 = {"Lcom/facebook/react/devsupport/DevSupportManagerBase;", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "Landroid/content/Context;", "applicationContext", "Lcom/facebook/react/devsupport/ReactInstanceDevHelper;", "reactInstanceDevHelper", PointerEventHelper.POINTER_TYPE_UNKNOWN, "jsAppBundleName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "enableOnCreate", "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;", "redBoxHandler", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "devBundleDownloadListener", PointerEventHelper.POINTER_TYPE_UNKNOWN, "minNumShakes", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/packagerconnection/RequestHandler;", "customPackagerCommandHandlers", "Lcom/facebook/react/common/SurfaceDelegateFactory;", "surfaceDelegateFactory", "Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;", "devLoadingViewManager", "Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;", "pausedInDebuggerOverlayManager", "<init>", "(Landroid/content/Context;Lcom/facebook/react/devsupport/ReactInstanceDevHelper;Ljava/lang/String;ZLcom/facebook/react/devsupport/interfaces/RedBoxHandler;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;ILjava/util/Map;Lcom/facebook/react/common/SurfaceDelegateFactory;Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Li7/B;", "logJSException", "(Ljava/lang/Exception;)V", "hideDevOptionsDialog", "()V", "message", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/devsupport/interfaces/StackFrame;", StackTraceHelper.STACK_KEY, "errorCookie", "Lcom/facebook/react/devsupport/interfaces/ErrorType;", "errorType", "showNewError", "(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;ILcom/facebook/react/devsupport/interfaces/ErrorType;)V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "resetCurrentContext", "(Lcom/facebook/react/bridge/ReactContext;)V", "bundleUrl", "showDevLoadingViewForUrl", "(Ljava/lang/String;)V", "showSplitBundleDevLoadingView", "hideSplitBundleDevLoadingView", "updateLastErrorInfo", "cause", "reportBundleLoadingFailure", "startShakeDetector", "stopShakeDetector", "reload", "context", "Landroid/content/BroadcastReceiver;", NotificationsService.RECEIVER_KEY, "Landroid/content/IntentFilter;", ViewProps.FILTER, "exported", "compatRegisterReceiver", "(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Z)V", "Landroid/content/res/ColorStateList;", "safeGetDefaultTextColor", "(Landroid/content/Context;)Landroid/content/res/ColorStateList;", "safeGetTextColorSecondary", "handleException", PointerEventHelper.POINTER_TYPE_UNKNOWN, "showNewJavaError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "optionName", "Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;", "optionHandler", "addCustomDevOption", "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;)V", "Lcom/facebook/react/bridge/ReadableArray;", "details", "showNewJSError", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;I)V", "Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;", "errorCustomizer", "registerErrorCustomizer", "(Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;)V", "Landroid/util/Pair;", "errorInfo", "processErrorCustomizers", "(Landroid/util/Pair;)Landroid/util/Pair;", "hideRedboxDialog", "appKey", "Landroid/view/View;", "createRootView", "(Ljava/lang/String;)Landroid/view/View;", "rootView", "destroyRootView", "(Landroid/view/View;)V", "showDevOptionsDialog", "onNewReactContextCreated", "onReactInstanceDestroyed", "hasUpToDateJSBundleInCache", "()Z", "reloadSettings", "showDevLoadingViewForRemoteJSEnabled", "hideDevLoadingView", "bundlePath", "Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;", "callback", "fetchSplitBundleAndCreateBundleLoader", "(Ljava/lang/String;Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;)V", "Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;", "isPackagerRunning", "(Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V", "resourceURL", "Ljava/io/File;", "outputFile", "downloadBundleResourceFromUrlSync", "(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;", "bundleURL", "Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;", "reloadJSFromServer", "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;)V", "startInspector", "stopInspector", "isHotModuleReplacementEnabled", "setHotModuleReplacementEnabled", "(Z)V", "isFpsDebugEnabled", "setFpsDebugEnabled", "toggleElementInspector", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;", "packagerLocationCustomizer", "setPackagerLocationCustomizer", "(Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;)V", "moduleName", "Lcom/facebook/react/common/SurfaceDelegate;", "createSurfaceDelegate", "(Ljava/lang/String;)Lcom/facebook/react/common/SurfaceDelegate;", "panel", "openDebugger", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;", "listener", "showPausedInDebuggerOverlay", "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;)V", "hidePausedInDebuggerOverlay", "name", "value", "setAdditionalOptionForPackager", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/react/devsupport/interfaces/TracingStateProvider;", "provider", "setTracingStateProvider$ReactAndroid_release", "(Lcom/facebook/react/devsupport/interfaces/TracingStateProvider;)V", "setTracingStateProvider", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "Lcom/facebook/react/devsupport/ReactInstanceDevHelper;", "getReactInstanceDevHelper", "()Lcom/facebook/react/devsupport/ReactInstanceDevHelper;", "Ljava/lang/String;", "getJSAppBundleName", "()Ljava/lang/String;", "setJsAppBundleName", "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;", "getRedBoxHandler", "()Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "Ljava/util/Map;", "Lcom/facebook/react/common/SurfaceDelegateFactory;", "Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;", "getDevLoadingViewManager", "()Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;", "setDevLoadingViewManager", "(Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;)V", "Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;", "currentReactContext", "Lcom/facebook/react/bridge/ReactContext;", "getCurrentReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "devSettings", "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "getDevSettings", "()Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "shakeGestureEnabled", "Z", "getShakeGestureEnabled", "setShakeGestureEnabled", "bundleFilePath", "getBundleFilePath", "setBundleFilePath", "Lcom/facebook/react/devsupport/DevServerHelper;", "devServerHelper", "Lcom/facebook/react/devsupport/DevServerHelper;", "getDevServerHelper", "()Lcom/facebook/react/devsupport/DevServerHelper;", "lastErrorTitle", "getLastErrorTitle", "setLastErrorTitle", "lastErrorStack", "[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "getLastErrorStack", "()[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "setLastErrorStack", "([Lcom/facebook/react/devsupport/interfaces/StackFrame;)V", "lastErrorType", "Lcom/facebook/react/devsupport/interfaces/ErrorType;", "getLastErrorType", "()Lcom/facebook/react/devsupport/interfaces/ErrorType;", "setLastErrorType", "(Lcom/facebook/react/devsupport/interfaces/ErrorType;)V", "lastErrorCookie", "I", "getLastErrorCookie", "()I", "setLastErrorCookie", "(I)V", "Lcom/facebook/react/common/ShakeDetector;", "shakeDetector", "Lcom/facebook/react/common/ShakeDetector;", "reloadAppBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "customDevOptions", "Ljava/util/LinkedHashMap;", "jsBundleDownloadedFile", "Ljava/io/File;", "jsSplitBundlesDir", "Lcom/facebook/react/bridge/DefaultJSExceptionHandler;", "defaultJSExceptionHandler", "Lcom/facebook/react/bridge/DefaultJSExceptionHandler;", "redBoxSurfaceDelegate", "Lcom/facebook/react/common/SurfaceDelegate;", "Landroid/app/AlertDialog;", "devOptionsDialog", "Landroid/app/AlertDialog;", "Lcom/facebook/react/devsupport/DebugOverlayController;", "debugOverlayController", "Lcom/facebook/react/devsupport/DebugOverlayController;", "devLoadingViewVisible", "pendingJSSplitBundleRequests", "isReceiverRegistered", "isShakeDetectorStarted", "isDevSupportEnabled", "isPackagerConnected", PointerEventHelper.POINTER_TYPE_UNKNOWN, "errorCustomizers", "Ljava/util/List;", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;", "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;", "perfMonitorOverlayManager", "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;", "perfMonitorInitialized", "tracingStateProvider", "Lcom/facebook/react/devsupport/interfaces/TracingStateProvider;", "keyboardShortcutsEnabled", "getKeyboardShortcutsEnabled", "setKeyboardShortcutsEnabled", "devMenuEnabled", "getDevMenuEnabled", "setDevMenuEnabled", "getJSExecutorDescription", "jSExecutorDescription", "getUniqueTag", "uniqueTag", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "currentActivity", "getDevSupportEnabled", "setDevSupportEnabled", "devSupportEnabled", "getSourceMapUrl", "sourceMapUrl", "getSourceUrl", "sourceUrl", "getDownloadedJSBundleFile", "downloadedJSBundleFile", "Companion", "CallbackWithBundleLoader", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class DevSupportManagerBase implements DevSupportManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXOPACKAGE_LOCATION_FORMAT = "/data/local/tmp/exopackage/%s//secondary-dex";
    private static final int JAVA_ERROR_COOKIE = -1;
    private static final int JSEXCEPTION_ERROR_COOKIE = -1;
    private static final String RELOAD_APP_ACTION_SUFFIX = ".RELOAD_APP_ACTION";
    private final Context applicationContext;
    private String bundleFilePath;
    private ReactContext currentReactContext;
    private final LinkedHashMap<String, DevOptionHandler> customDevOptions;
    private final Map<String, RequestHandler> customPackagerCommandHandlers;
    private DebugOverlayController debugOverlayController;
    private final DefaultJSExceptionHandler defaultJSExceptionHandler;
    private final DevBundleDownloadListener devBundleDownloadListener;
    private DevLoadingViewManager devLoadingViewManager;
    private boolean devLoadingViewVisible;
    private boolean devMenuEnabled;
    private AlertDialog devOptionsDialog;
    private final DevServerHelper devServerHelper;
    private final DeveloperSettings devSettings;
    private final List<ErrorCustomizer> errorCustomizers;
    private boolean isDevSupportEnabled;
    private boolean isPackagerConnected;
    private boolean isReceiverRegistered;
    private boolean isShakeDetectorStarted;
    private String jsAppBundleName;
    private final File jsBundleDownloadedFile;
    private final File jsSplitBundlesDir;
    private boolean keyboardShortcutsEnabled;
    private int lastErrorCookie;
    private StackFrame[] lastErrorStack;
    private String lastErrorTitle;
    private ErrorType lastErrorType;
    private DevSupportManager.PackagerLocationCustomizer packagerLocationCustomizer;
    private PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager;
    private int pendingJSSplitBundleRequests;
    private boolean perfMonitorInitialized;
    private PerfMonitorOverlayManager perfMonitorOverlayManager;
    private final ReactInstanceDevHelper reactInstanceDevHelper;
    private final RedBoxHandler redBoxHandler;
    private SurfaceDelegate redBoxSurfaceDelegate;
    private final BroadcastReceiver reloadAppBroadcastReceiver;
    private final ShakeDetector shakeDetector;
    private boolean shakeGestureEnabled;
    private final SurfaceDelegateFactory surfaceDelegateFactory;
    private TracingStateProvider tracingStateProvider;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/JSBundleLoader;", "bundleLoader", "Li7/B;", "onSuccess", "(Lcom/facebook/react/bridge/JSBundleLoader;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "url", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cause", "onError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CallbackWithBundleLoader {
        void onError(String url, Throwable cause);

        void onSuccess(JSBundleLoader bundleLoader);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/devsupport/DevSupportManagerBase$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "JAVA_ERROR_COOKIE", PointerEventHelper.POINTER_TYPE_UNKNOWN, "JSEXCEPTION_ERROR_COOKIE", "RELOAD_APP_ACTION_SUFFIX", PointerEventHelper.POINTER_TYPE_UNKNOWN, "EXOPACKAGE_LOCATION_FORMAT", "getReloadAppAction", "context", "Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getReloadAppAction(Context context) {
            return context.getPackageName() + DevSupportManagerBase.RELOAD_APP_ACTION_SUFFIX;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TracingState.values().length];
            try {
                iArr[TracingState.ENABLEDINBACKGROUNDMODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TracingState.ENABLEDINCDPMODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TracingState.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.DevSupportManagerBase$reload$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u001d\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/facebook/react/devsupport/DevSupportManagerBase$reload$1", "Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;", "Li7/B;", "onPackagerConnected", "()V", "onPackagerDisconnected", "onPackagerReloadCommand", "onPackagerDevMenuCommand", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/packagerconnection/RequestHandler;", "customCommandHandlers", "()Ljava/util/Map;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 implements DevServerHelper.PackagerCommandListener {
        AnonymousClass1() {
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public Map<String, RequestHandler> customCommandHandlers() {
            return DevSupportManagerBase.this.customPackagerCommandHandlers;
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onPackagerConnected() {
            DevSupportManagerBase.this.isPackagerConnected = true;
            PerfMonitorOverlayManager perfMonitorOverlayManager = DevSupportManagerBase.this.perfMonitorOverlayManager;
            if (perfMonitorOverlayManager != null) {
                perfMonitorOverlayManager.enable();
            }
            PerfMonitorOverlayManager perfMonitorOverlayManager2 = DevSupportManagerBase.this.perfMonitorOverlayManager;
            if (perfMonitorOverlayManager2 != null) {
                perfMonitorOverlayManager2.startBackgroundTrace();
            }
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onPackagerDevMenuCommand() {
            final DevSupportManagerBase devSupportManagerBase = DevSupportManagerBase.this;
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.V
                @Override // java.lang.Runnable
                public final void run() {
                    devSupportManagerBase.showDevOptionsDialog();
                }
            });
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onPackagerDisconnected() {
            DevSupportManagerBase.this.isPackagerConnected = false;
            PerfMonitorOverlayManager perfMonitorOverlayManager = DevSupportManagerBase.this.perfMonitorOverlayManager;
            if (perfMonitorOverlayManager != null) {
                perfMonitorOverlayManager.disable();
            }
            PerfMonitorOverlayManager perfMonitorOverlayManager2 = DevSupportManagerBase.this.perfMonitorOverlayManager;
            if (perfMonitorOverlayManager2 != null) {
                perfMonitorOverlayManager2.stopBackgroundTrace();
            }
        }

        @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
        public void onPackagerReloadCommand() {
            if (!InspectorFlags.getFuseboxEnabled()) {
                DevSupportManagerBase.this.getDevServerHelper().disableDebugger();
            }
            final DevSupportManagerBase devSupportManagerBase = DevSupportManagerBase.this;
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.U
                @Override // java.lang.Runnable
                public final void run() {
                    devSupportManagerBase.handleReloadJS();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DevSupportManagerBase(Context applicationContext, ReactInstanceDevHelper reactInstanceDevHelper, String str, boolean z10, RedBoxHandler redBoxHandler, DevBundleDownloadListener devBundleDownloadListener, int i10, Map<String, ? extends RequestHandler> map, SurfaceDelegateFactory surfaceDelegateFactory, DevLoadingViewManager devLoadingViewManager, PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager) {
        AbstractC2855l.g(applicationContext, "applicationContext");
        AbstractC2855l.g(reactInstanceDevHelper, "reactInstanceDevHelper");
        this.applicationContext = applicationContext;
        this.reactInstanceDevHelper = reactInstanceDevHelper;
        this.jsAppBundleName = str;
        this.redBoxHandler = redBoxHandler;
        this.devBundleDownloadListener = devBundleDownloadListener;
        this.customPackagerCommandHandlers = map;
        this.surfaceDelegateFactory = surfaceDelegateFactory;
        this.devLoadingViewManager = devLoadingViewManager;
        this.pausedInDebuggerOverlayManager = pausedInDebuggerOverlayManager;
        DevInternalSettings devInternalSettings = new DevInternalSettings(applicationContext, new DevInternalSettings.Listener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$devSettings$1
            @Override // com.facebook.react.devsupport.DevInternalSettings.Listener
            public void onInternalSettingsChanged() {
                this.this$0.reloadSettings();
            }
        });
        this.devSettings = devInternalSettings;
        this.shakeGestureEnabled = true;
        this.devServerHelper = new DevServerHelper(devInternalSettings, applicationContext, devInternalSettings.getPackagerConnectionSettings());
        this.shakeDetector = new ShakeDetector(new ShakeDetector.ShakeListener() { // from class: com.facebook.react.devsupport.D
            @Override // com.facebook.react.common.ShakeDetector.ShakeListener
            public final void onShake() {
                this.f20304a.showDevOptionsDialog();
            }
        }, i10);
        this.reloadAppBroadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.react.devsupport.DevSupportManagerBase$reloadAppBroadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC2855l.g(context, "context");
                AbstractC2855l.g(intent, "intent");
                if (AbstractC2855l.b(DevSupportManagerBase.INSTANCE.getReloadAppAction(context), intent.getAction())) {
                    this.this$0.handleReloadJS();
                }
            }
        };
        this.customDevOptions = new LinkedHashMap<>();
        this.defaultJSExceptionHandler = new DefaultJSExceptionHandler();
        this.errorCustomizers = new ArrayList();
        this.keyboardShortcutsEnabled = true;
        this.devMenuEnabled = true;
        String uniqueTag = getUniqueTag();
        this.jsBundleDownloadedFile = new File(applicationContext.getFilesDir(), uniqueTag + "ReactNativeDevBundle.js");
        String lowerCase = uniqueTag.toLowerCase(Locale.ROOT);
        AbstractC2855l.f(lowerCase, "toLowerCase(...)");
        File dir = applicationContext.getDir(lowerCase + "_dev_js_split_bundles", 0);
        AbstractC2855l.f(dir, "getDir(...)");
        this.jsSplitBundlesDir = dir;
        setDevSupportEnabled(z10);
        if (this.devLoadingViewManager == null) {
            this.devLoadingViewManager = new DefaultDevLoadingViewImplementation(reactInstanceDevHelper);
        }
        if (this.pausedInDebuggerOverlayManager == null) {
            this.pausedInDebuggerOverlayManager = new PausedInDebuggerOverlayDialogManager(new H0.i() { // from class: com.facebook.react.devsupport.E
                @Override // H0.i
                public final Object get() {
                    return DevSupportManagerBase._init_$lambda$3(this.f20305a);
                }
            });
        }
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && ReactNativeFeatureFlags.perfMonitorV2Enabled() && (reactInstanceDevHelper instanceof PerfMonitorDevHelper)) {
            this.perfMonitorOverlayManager = new PerfMonitorOverlayManager((PerfMonitorDevHelper) reactInstanceDevHelper, new InterfaceC3487a() { // from class: com.facebook.react.devsupport.F
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return DevSupportManagerBase._init_$lambda$4(this.f20306g);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context _init_$lambda$3(DevSupportManagerBase devSupportManagerBase) {
        Activity currentActivity = devSupportManagerBase.reactInstanceDevHelper.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return null;
        }
        return currentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B _init_$lambda$4(DevSupportManagerBase devSupportManagerBase) {
        devSupportManagerBase.openDebugger(DebuggerFrontendPanelName.PERFORMANCE.toString());
        return C2735B.f28704a;
    }

    private final void compatRegisterReceiver(Context context, BroadcastReceiver receiver, IntentFilter filter, boolean exported) {
        if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(receiver, filter);
        } else {
            context.registerReceiver(receiver, filter, exported ? 2 : 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchSplitBundleAndCreateBundleLoader$lambda$31(DevSupportManagerBase devSupportManagerBase, String str, File file, CallbackWithBundleLoader callbackWithBundleLoader) {
        devSupportManagerBase.showSplitBundleDevLoadingView(str);
        DevServerHelper.downloadBundleFromURL$default(devSupportManagerBase.devServerHelper, new DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1(devSupportManagerBase, str, file, callbackWithBundleLoader), file, str, null, null, 16, null);
    }

    private final String getJSExecutorDescription() {
        try {
            return this.reactInstanceDevHelper.getJavaScriptExecutorFactory().toString();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    private final void hideDevOptionsDialog() {
        AlertDialog alertDialog = this.devOptionsDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.devOptionsDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideSplitBundleDevLoadingView() {
        int i10 = this.pendingJSSplitBundleRequests - 1;
        this.pendingJSSplitBundleRequests = i10;
        if (i10 == 0) {
            hideDevLoadingView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isPackagerRunning$lambda$32(DevSupportManagerBase devSupportManagerBase, PackagerStatusCallback packagerStatusCallback) {
        devSupportManagerBase.devServerHelper.isPackagerRunning(packagerStatusCallback);
    }

    private final void logJSException(Exception e10) {
        String message = e10.getMessage();
        if (message == null) {
            message = "Exception in native call from JS";
        }
        StringBuilder sb = new StringBuilder(message);
        for (Throwable cause = e10.getCause(); cause != null; cause = cause.getCause()) {
            sb.append("\n\n");
            sb.append(cause.getMessage());
        }
        if (!(e10 instanceof JavascriptException)) {
            showNewJavaError(sb.toString(), e10);
        } else {
            AbstractC2325a.n(ReactConstants.TAG, "Exception in native call from JS", e10);
            showNewError(e10.getMessage(), new StackFrame[0], -1, ErrorType.JS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reload() {
        DevLoadingViewManager devLoadingViewManager;
        UiThreadUtil.assertOnUiThread();
        if (this.isDevSupportEnabled) {
            DebugOverlayController debugOverlayController = this.debugOverlayController;
            if (debugOverlayController != null) {
                debugOverlayController.setFpsDebugViewVisible(this.devSettings.isFpsDebugEnabled());
            }
            if (!this.isShakeDetectorStarted && getShakeGestureEnabled()) {
                startShakeDetector();
            }
            if (!this.isReceiverRegistered) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(INSTANCE.getReloadAppAction(this.applicationContext));
                compatRegisterReceiver(this.applicationContext, this.reloadAppBroadcastReceiver, intentFilter, true);
                this.isReceiverRegistered = true;
            }
            if (this.devLoadingViewVisible && (devLoadingViewManager = this.devLoadingViewManager) != null) {
                devLoadingViewManager.showMessage("Reloading...");
            }
            this.devServerHelper.openPackagerConnection(getClass().getSimpleName(), new AnonymousClass1());
            return;
        }
        DebugOverlayController debugOverlayController2 = this.debugOverlayController;
        if (debugOverlayController2 != null) {
            debugOverlayController2.setFpsDebugViewVisible(false);
        }
        if (this.isShakeDetectorStarted) {
            stopShakeDetector();
        }
        if (this.isReceiverRegistered) {
            this.applicationContext.unregisterReceiver(this.reloadAppBroadcastReceiver);
            this.isReceiverRegistered = false;
        }
        hideRedboxDialog();
        hideDevOptionsDialog();
        DevLoadingViewManager devLoadingViewManager2 = this.devLoadingViewManager;
        if (devLoadingViewManager2 != null) {
            devLoadingViewManager2.hide();
        }
        PerfMonitorOverlayManager perfMonitorOverlayManager = this.perfMonitorOverlayManager;
        if (perfMonitorOverlayManager != null) {
            perfMonitorOverlayManager.disable();
        }
        this.devServerHelper.closePackagerConnection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportBundleLoadingFailure(final Exception cause) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.J
            @Override // java.lang.Runnable
            public final void run() {
                DevSupportManagerBase.reportBundleLoadingFailure$lambda$33(cause, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportBundleLoadingFailure$lambda$33(Exception exc, DevSupportManagerBase devSupportManagerBase) {
        if (exc instanceof DebugServerException) {
            devSupportManagerBase.showNewJavaError(exc.getMessage(), exc);
        } else {
            devSupportManagerBase.showNewJavaError(devSupportManagerBase.applicationContext.getString(R.string.catalyst_reload_error), exc);
        }
    }

    private final void resetCurrentContext(ReactContext reactContext) {
        if (this.currentReactContext == reactContext) {
            return;
        }
        this.currentReactContext = reactContext;
        DebugOverlayController debugOverlayController = this.debugOverlayController;
        if (debugOverlayController != null) {
            debugOverlayController.setFpsDebugViewVisible(false);
        }
        if (reactContext != null) {
            this.debugOverlayController = new DebugOverlayController(reactContext);
        }
        if (reactContext != null) {
            try {
                URL url = new URL(getSourceUrl());
                String path = url.getPath();
                if (path != null) {
                    path = path.substring(1);
                    AbstractC2855l.f(path, "substring(...)");
                }
                ((HMRClient) reactContext.getJSModule(HMRClient.class)).setup("android", path, url.getHost(), url.getPort() != -1 ? url.getPort() : url.getDefaultPort(), this.devSettings.isHotModuleReplacementEnabled(), url.getProtocol());
            } catch (MalformedURLException e10) {
                showNewJavaError(e10.getMessage(), e10);
            }
        }
        reloadSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ColorStateList safeGetDefaultTextColor(Context context) {
        ColorStateList defaultTextColor = DefaultStyleValuesUtil.getDefaultTextColor(context);
        if (defaultTextColor != null) {
            return defaultTextColor;
        }
        if (UiModeUtils.isDarkMode(context)) {
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(-1);
            AbstractC2855l.f(colorStateListValueOf, "valueOf(...)");
            return colorStateListValueOf;
        }
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(-16777216);
        AbstractC2855l.f(colorStateListValueOf2, "valueOf(...)");
        return colorStateListValueOf2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ColorStateList safeGetTextColorSecondary(Context context) {
        ColorStateList textColorSecondary = DefaultStyleValuesUtil.getTextColorSecondary(context);
        if (textColorSecondary != null) {
            return textColorSecondary;
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(-7829368);
        AbstractC2855l.f(colorStateListValueOf, "valueOf(...)");
        return colorStateListValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFpsDebugEnabled$lambda$35(DevSupportManagerBase devSupportManagerBase, boolean z10) {
        devSupportManagerBase.devSettings.setFpsDebugEnabled(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHotModuleReplacementEnabled$lambda$34(DevSupportManagerBase devSupportManagerBase, boolean z10) {
        devSupportManagerBase.devSettings.setHotModuleReplacementEnabled(z10);
        devSupportManagerBase.handleReloadJS();
    }

    private final void showDevLoadingViewForUrl(String bundleUrl) {
        try {
            URL url = new URL(bundleUrl);
            int port = url.getPort() != -1 ? url.getPort() : url.getDefaultPort();
            DevLoadingViewManager devLoadingViewManager = this.devLoadingViewManager;
            if (devLoadingViewManager != null) {
                String string = this.applicationContext.getString(R.string.catalyst_loading_from_url, url.getHost() + ":" + port);
                AbstractC2855l.f(string, "getString(...)");
                devLoadingViewManager.showMessage(string);
            }
            this.devLoadingViewVisible = true;
        } catch (MalformedURLException e10) {
            AbstractC2325a.m(ReactConstants.TAG, "Bundle url format is invalid. \n\n" + e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$12(final DevSupportManagerBase devSupportManagerBase) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.B
            @Override // java.lang.Runnable
            public final void run() {
                DevSupportManagerBase.showDevOptionsDialog$lambda$12$lambda$11(this.f20301g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$12$lambda$11(DevSupportManagerBase devSupportManagerBase) {
        PerfMonitorInspectorTarget inspectorTarget;
        ReactInstanceDevHelper reactInstanceDevHelper = devSupportManagerBase.reactInstanceDevHelper;
        if (!(reactInstanceDevHelper instanceof PerfMonitorDevHelper) || (inspectorTarget = ((PerfMonitorDevHelper) reactInstanceDevHelper).getInspectorTarget()) == null || inspectorTarget.pauseAndAnalyzeBackgroundTrace()) {
            return;
        }
        devSupportManagerBase.openDebugger(DebuggerFrontendPanelName.PERFORMANCE.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$13(DevSupportManagerBase devSupportManagerBase) {
        PerfMonitorInspectorTarget inspectorTarget;
        ReactInstanceDevHelper reactInstanceDevHelper = devSupportManagerBase.reactInstanceDevHelper;
        if (!(reactInstanceDevHelper instanceof PerfMonitorDevHelper) || (inspectorTarget = ((PerfMonitorDevHelper) reactInstanceDevHelper).getInspectorTarget()) == null) {
            return;
        }
        inspectorTarget.resumeBackgroundTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$15(DevSupportManagerBase devSupportManagerBase) {
        PerfMonitorOverlayManager perfMonitorOverlayManager = devSupportManagerBase.perfMonitorOverlayManager;
        if (perfMonitorOverlayManager != null) {
            perfMonitorOverlayManager.disable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$16(DevSupportManagerBase devSupportManagerBase) {
        PerfMonitorOverlayManager perfMonitorOverlayManager = devSupportManagerBase.perfMonitorOverlayManager;
        if (perfMonitorOverlayManager != null) {
            perfMonitorOverlayManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$18(final DevSupportManagerBase devSupportManagerBase) {
        Activity currentActivity = devSupportManagerBase.reactInstanceDevHelper.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            AbstractC2325a.m(ReactConstants.TAG, "Unable to launch change bundle location because react activity is not available");
        } else {
            ChangeBundleLocationDialog.INSTANCE.show(currentActivity, devSupportManagerBase.devSettings, new ChangeBundleLocationDialog.ChangeBundleLocationDialogListener() { // from class: com.facebook.react.devsupport.M
                @Override // com.facebook.react.devsupport.ChangeBundleLocationDialog.ChangeBundleLocationDialogListener
                public final void onClick(String str) {
                    DevSupportManagerBase.showDevOptionsDialog$lambda$18$lambda$17(this.f20320a, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$18$lambda$17(DevSupportManagerBase devSupportManagerBase, String host) {
        AbstractC2855l.g(host, "host");
        devSupportManagerBase.devSettings.getPackagerConnectionSettings().setDebugServerHost(host);
        devSupportManagerBase.handleReloadJS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$19(DevSupportManagerBase devSupportManagerBase) {
        devSupportManagerBase.devSettings.setElementInspectorEnabled(!r0.isElementInspectorEnabled());
        devSupportManagerBase.reactInstanceDevHelper.toggleElementInspector();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$20(DevSupportManagerBase devSupportManagerBase) {
        boolean zIsHotModuleReplacementEnabled = devSupportManagerBase.devSettings.isHotModuleReplacementEnabled();
        devSupportManagerBase.devSettings.setHotModuleReplacementEnabled(!zIsHotModuleReplacementEnabled);
        ReactContext reactContext = devSupportManagerBase.currentReactContext;
        if (reactContext != null) {
            if (zIsHotModuleReplacementEnabled) {
                HMRClient hMRClient = (HMRClient) reactContext.getJSModule(HMRClient.class);
                if (hMRClient != null) {
                    hMRClient.disable();
                }
            } else {
                HMRClient hMRClient2 = (HMRClient) reactContext.getJSModule(HMRClient.class);
                if (hMRClient2 != null) {
                    hMRClient2.enable();
                }
            }
        }
        if (zIsHotModuleReplacementEnabled || devSupportManagerBase.devSettings.isJSDevModeEnabled()) {
            return;
        }
        Context context = devSupportManagerBase.applicationContext;
        Toast.makeText(context, context.getString(R.string.catalyst_hot_reloading_auto_enable), 1).show();
        devSupportManagerBase.devSettings.setJSDevModeEnabled(true);
        devSupportManagerBase.handleReloadJS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$21(DevSupportManagerBase devSupportManagerBase) {
        if (!devSupportManagerBase.devSettings.isFpsDebugEnabled()) {
            Activity currentActivity = devSupportManagerBase.reactInstanceDevHelper.getCurrentActivity();
            if (currentActivity == null) {
                AbstractC2325a.m(ReactConstants.TAG, "Unable to get reference to react activity");
            } else {
                DebugOverlayController.INSTANCE.requestPermission(currentActivity);
            }
        }
        devSupportManagerBase.devSettings.setFpsDebugEnabled(!r2.isFpsDebugEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$22(DevSupportManagerBase devSupportManagerBase) {
        Intent intent = new Intent(devSupportManagerBase.applicationContext, (Class<?>) DevSettingsActivity.class);
        intent.setFlags(268435456);
        devSupportManagerBase.applicationContext.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$25(DevOptionHandler[] devOptionHandlerArr, DevSupportManagerBase devSupportManagerBase, DialogInterface dialogInterface, int i10) {
        devOptionHandlerArr[i10].onOptionSelected();
        devSupportManagerBase.devOptionsDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$8(DevSupportManagerBase devSupportManagerBase) {
        if (!devSupportManagerBase.devSettings.isJSDevModeEnabled() && devSupportManagerBase.devSettings.isHotModuleReplacementEnabled()) {
            Context context = devSupportManagerBase.applicationContext;
            Toast.makeText(context, context.getString(R.string.catalyst_hot_reloading_auto_disable), 1).show();
            devSupportManagerBase.devSettings.setHotModuleReplacementEnabled(false);
        }
        devSupportManagerBase.handleReloadJS();
    }

    private final void showNewError(final String message, final StackFrame[] stack, final int errorCookie, final ErrorType errorType) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.L
            @Override // java.lang.Runnable
            public final void run() {
                DevSupportManagerBase.showNewError$lambda$7(this.f20315g, message, stack, errorCookie, errorType);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showNewError$lambda$7(DevSupportManagerBase devSupportManagerBase, String str, StackFrame[] stackFrameArr, int i10, ErrorType errorType) {
        SurfaceDelegate surfaceDelegate;
        devSupportManagerBase.updateLastErrorInfo(str, stackFrameArr, i10, errorType);
        if (devSupportManagerBase.redBoxSurfaceDelegate == null) {
            SurfaceDelegate surfaceDelegateCreateSurfaceDelegate = devSupportManagerBase.createSurfaceDelegate(NativeRedBoxSpec.NAME);
            if (surfaceDelegateCreateSurfaceDelegate == null) {
                surfaceDelegateCreateSurfaceDelegate = new RedBoxDialogSurfaceDelegate(devSupportManagerBase);
                surfaceDelegateCreateSurfaceDelegate.createContentView(NativeRedBoxSpec.NAME);
            }
            devSupportManagerBase.redBoxSurfaceDelegate = surfaceDelegateCreateSurfaceDelegate;
        }
        SurfaceDelegate surfaceDelegate2 = devSupportManagerBase.redBoxSurfaceDelegate;
        if ((surfaceDelegate2 == null || !surfaceDelegate2.isShowing()) && (surfaceDelegate = devSupportManagerBase.redBoxSurfaceDelegate) != null) {
            surfaceDelegate.show();
        }
    }

    private final void showSplitBundleDevLoadingView(String bundleUrl) {
        showDevLoadingViewForUrl(bundleUrl);
        this.pendingJSSplitBundleRequests++;
    }

    private final void startShakeDetector() {
        Object systemService = this.applicationContext.getSystemService("sensor");
        AbstractC2855l.e(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        this.shakeDetector.start((SensorManager) systemService);
        this.isShakeDetectorStarted = true;
    }

    private final void stopShakeDetector() {
        this.shakeDetector.stop();
        this.isShakeDetectorStarted = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleElementInspector$lambda$36(DevSupportManagerBase devSupportManagerBase) {
        devSupportManagerBase.devSettings.setElementInspectorEnabled(!r0.isElementInspectorEnabled());
        devSupportManagerBase.reactInstanceDevHelper.toggleElementInspector();
    }

    private final void updateLastErrorInfo(String message, StackFrame[] stack, int errorCookie, ErrorType errorType) {
        this.lastErrorTitle = message;
        this.lastErrorStack = stack;
        this.lastErrorCookie = errorCookie;
        this.lastErrorType = errorType;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void addCustomDevOption(String optionName, DevOptionHandler optionHandler) {
        AbstractC2855l.g(optionName, "optionName");
        AbstractC2855l.g(optionHandler, "optionHandler");
        this.customDevOptions.put(optionName, optionHandler);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public View createRootView(String appKey) {
        AbstractC2855l.g(appKey, "appKey");
        return this.reactInstanceDevHelper.createRootView(appKey);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public SurfaceDelegate createSurfaceDelegate(String moduleName) {
        AbstractC2855l.g(moduleName, "moduleName");
        SurfaceDelegateFactory surfaceDelegateFactory = this.surfaceDelegateFactory;
        if (surfaceDelegateFactory != null) {
            return surfaceDelegateFactory.createSurfaceDelegate(moduleName);
        }
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void destroyRootView(View rootView) {
        if (rootView != null) {
            this.reactInstanceDevHelper.destroyRootView(rootView);
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public File downloadBundleResourceFromUrlSync(String resourceURL, File outputFile) {
        AbstractC2855l.g(resourceURL, "resourceURL");
        AbstractC2855l.g(outputFile, "outputFile");
        return this.devServerHelper.downloadBundleResourceFromUrlSync(resourceURL, outputFile);
    }

    public final void fetchSplitBundleAndCreateBundleLoader(String bundlePath, final CallbackWithBundleLoader callback) {
        AbstractC2855l.g(bundlePath, "bundlePath");
        AbstractC2855l.g(callback, "callback");
        final String devServerSplitBundleURL = this.devServerHelper.getDevServerSplitBundleURL(bundlePath);
        final File file = new File(this.jsSplitBundlesDir, new P8.o("/").e(bundlePath, "_") + ".jsbundle");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.A
            @Override // java.lang.Runnable
            public final void run() {
                DevSupportManagerBase.fetchSplitBundleAndCreateBundleLoader$lambda$31(this.f20297g, devServerSplitBundleURL, file, callback);
            }
        });
    }

    protected final Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getBundleFilePath() {
        return this.bundleFilePath;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public Activity getCurrentActivity() {
        return this.reactInstanceDevHelper.getCurrentActivity();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public final ReactContext getCurrentReactContext() {
        return this.currentReactContext;
    }

    public final DevLoadingViewManager getDevLoadingViewManager() {
        return this.devLoadingViewManager;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean getDevMenuEnabled() {
        return this.devMenuEnabled;
    }

    public final DevServerHelper getDevServerHelper() {
        return this.devServerHelper;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public final DeveloperSettings getDevSettings() {
        return this.devSettings;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    /* JADX INFO: renamed from: getDevSupportEnabled, reason: from getter */
    public final boolean getIsDevSupportEnabled() {
        return this.isDevSupportEnabled;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getDownloadedJSBundleFile() {
        String absolutePath = this.jsBundleDownloadedFile.getAbsolutePath();
        AbstractC2855l.f(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    /* JADX INFO: renamed from: getJSAppBundleName, reason: from getter */
    public final String getJsAppBundleName() {
        return this.jsAppBundleName;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean getKeyboardShortcutsEnabled() {
        return this.keyboardShortcutsEnabled;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public final int getLastErrorCookie() {
        return this.lastErrorCookie;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public final StackFrame[] getLastErrorStack() {
        return this.lastErrorStack;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public final String getLastErrorTitle() {
        return this.lastErrorTitle;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public final ErrorType getLastErrorType() {
        return this.lastErrorType;
    }

    public final ReactInstanceDevHelper getReactInstanceDevHelper() {
        return this.reactInstanceDevHelper;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public RedBoxHandler getRedBoxHandler() {
        return this.redBoxHandler;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public final boolean getShakeGestureEnabled() {
        return this.shakeGestureEnabled;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getSourceMapUrl() {
        String sourceMapUrl;
        String str = this.jsAppBundleName;
        return (str == null || (sourceMapUrl = this.devServerHelper.getSourceMapUrl(str)) == null) ? PointerEventHelper.POINTER_TYPE_UNKNOWN : sourceMapUrl;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getSourceUrl() {
        String sourceUrl;
        String str = this.jsAppBundleName;
        return (str == null || (sourceUrl = this.devServerHelper.getSourceUrl(str)) == null) ? PointerEventHelper.POINTER_TYPE_UNKNOWN : sourceUrl;
    }

    protected abstract String getUniqueTag();

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception e10) {
        AbstractC2855l.g(e10, "e");
        if (this.isDevSupportEnabled) {
            logJSException(e10);
        } else {
            this.defaultJSExceptionHandler.handleException(e10);
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean hasUpToDateJSBundleInCache() {
        if (this.isDevSupportEnabled && this.jsBundleDownloadedFile.exists()) {
            try {
                String packageName = this.applicationContext.getPackageName();
                PackageManager packageManager = this.applicationContext.getPackageManager();
                if (packageManager != null) {
                    if (this.jsBundleDownloadedFile.lastModified() > packageManager.getPackageInfo(packageName, 0).lastUpdateTime) {
                        kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f29375a;
                        String str = String.format(Locale.US, EXOPACKAGE_LOCATION_FORMAT, Arrays.copyOf(new Object[]{packageName}, 1));
                        AbstractC2855l.f(str, "format(...)");
                        File file = new File(str);
                        if (file.exists()) {
                            return this.jsBundleDownloadedFile.lastModified() > file.lastModified();
                        }
                        return true;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                AbstractC2325a.m(ReactConstants.TAG, "DevSupport is unable to get current app info");
            }
        }
        return false;
    }

    protected final void hideDevLoadingView() {
        DevLoadingViewManager devLoadingViewManager = this.devLoadingViewManager;
        if (devLoadingViewManager != null) {
            devLoadingViewManager.hide();
        }
        this.devLoadingViewVisible = false;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void hidePausedInDebuggerOverlay() {
        PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager = this.pausedInDebuggerOverlayManager;
        if (pausedInDebuggerOverlayManager != null) {
            pausedInDebuggerOverlayManager.hidePausedInDebuggerOverlay();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void hideRedboxDialog() {
        SurfaceDelegate surfaceDelegate = this.redBoxSurfaceDelegate;
        if (surfaceDelegate != null) {
            surfaceDelegate.hide();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void isPackagerRunning(final PackagerStatusCallback callback) {
        AbstractC2855l.g(callback, "callback");
        Runnable runnable = new Runnable() { // from class: com.facebook.react.devsupport.G
            @Override // java.lang.Runnable
            public final void run() {
                DevSupportManagerBase.isPackagerRunning$lambda$32(this.f20307g, callback);
            }
        };
        DevSupportManager.PackagerLocationCustomizer packagerLocationCustomizer = this.packagerLocationCustomizer;
        if (packagerLocationCustomizer != null) {
            packagerLocationCustomizer.run(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void onNewReactContextCreated(ReactContext reactContext) {
        PerfMonitorInspectorTarget inspectorTarget;
        AbstractC2855l.g(reactContext, "reactContext");
        if (!this.perfMonitorInitialized) {
            ReactInstanceDevHelper reactInstanceDevHelper = this.reactInstanceDevHelper;
            if (reactInstanceDevHelper instanceof PerfMonitorDevHelper) {
                PerfMonitorOverlayManager perfMonitorOverlayManager = this.perfMonitorOverlayManager;
                if (perfMonitorOverlayManager != null && (inspectorTarget = ((PerfMonitorDevHelper) reactInstanceDevHelper).getInspectorTarget()) != null) {
                    inspectorTarget.addPerfMonitorListener(perfMonitorOverlayManager);
                }
                if (this.isPackagerConnected) {
                    PerfMonitorOverlayManager perfMonitorOverlayManager2 = this.perfMonitorOverlayManager;
                    if (perfMonitorOverlayManager2 != null) {
                        perfMonitorOverlayManager2.enable();
                    }
                    PerfMonitorOverlayManager perfMonitorOverlayManager3 = this.perfMonitorOverlayManager;
                    if (perfMonitorOverlayManager3 != null) {
                        perfMonitorOverlayManager3.startBackgroundTrace();
                    }
                }
                this.perfMonitorInitialized = true;
            }
        }
        resetCurrentContext(reactContext);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void onReactInstanceDestroyed(ReactContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        if (reactContext == this.currentReactContext) {
            resetCurrentContext(null);
        }
        System.gc();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void openDebugger(String panel) {
        this.devServerHelper.openDebugger(this.currentReactContext, this.applicationContext.getString(R.string.catalyst_open_debugger_error), panel);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public Pair<String, StackFrame[]> processErrorCustomizers(Pair<String, StackFrame[]> errorInfo) {
        AbstractC2855l.g(errorInfo, "errorInfo");
        Iterator<ErrorCustomizer> it = this.errorCustomizers.iterator();
        Pair<String, StackFrame[]> pairCustomizeErrorInfo = errorInfo;
        while (it.hasNext()) {
            pairCustomizeErrorInfo = it.next().customizeErrorInfo(errorInfo);
        }
        return pairCustomizeErrorInfo;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void registerErrorCustomizer(ErrorCustomizer errorCustomizer) {
        AbstractC2855l.g(errorCustomizer, "errorCustomizer");
        this.errorCustomizers.add(errorCustomizer);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadJSFromServer(String bundleURL, final BundleLoadCallback callback) {
        AbstractC2855l.g(bundleURL, "bundleURL");
        AbstractC2855l.g(callback, "callback");
        ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_START);
        showDevLoadingViewForUrl(bundleURL);
        final BundleDownloader.BundleInfo bundleInfo = new BundleDownloader.BundleInfo();
        DevServerHelper.downloadBundleFromURL$default(this.devServerHelper, new DevBundleDownloadListener() { // from class: com.facebook.react.devsupport.DevSupportManagerBase.reloadJSFromServer.1
            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onFailure(Exception cause) {
                AbstractC2855l.g(cause, "cause");
                DevSupportManagerBase.this.hideDevLoadingView();
                DevBundleDownloadListener devBundleDownloadListener = DevSupportManagerBase.this.devBundleDownloadListener;
                if (devBundleDownloadListener != null) {
                    devBundleDownloadListener.onFailure(cause);
                }
                AbstractC2325a.n(ReactConstants.TAG, "Unable to download JS bundle", cause);
                DevSupportManagerBase.this.reportBundleLoadingFailure(cause);
                callback.onError(cause);
            }

            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onProgress(String status, Integer done, Integer total) {
                DevLoadingViewManager devLoadingViewManager = DevSupportManagerBase.this.getDevLoadingViewManager();
                if (devLoadingViewManager != null) {
                    devLoadingViewManager.updateProgress(status, done, total);
                }
                DevBundleDownloadListener devBundleDownloadListener = DevSupportManagerBase.this.devBundleDownloadListener;
                if (devBundleDownloadListener != null) {
                    devBundleDownloadListener.onProgress(status, done, total);
                }
            }

            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onSuccess() {
                DevSupportManagerBase.this.hideDevLoadingView();
                DevBundleDownloadListener devBundleDownloadListener = DevSupportManagerBase.this.devBundleDownloadListener;
                if (devBundleDownloadListener != null) {
                    devBundleDownloadListener.onSuccess();
                }
                ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_END, bundleInfo.toJSONString());
                callback.onSuccess();
            }
        }, this.jsBundleDownloadedFile, bundleURL, bundleInfo, null, 16, null);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadSettings() {
        if (UiThreadUtil.isOnUiThread()) {
            reload();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.K
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20314g.reload();
                }
            });
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setAdditionalOptionForPackager(String name, String value) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(value, "value");
        this.devSettings.getPackagerConnectionSettings().setAdditionalOptionForPackager(name, value);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setBundleFilePath(String str) {
        this.bundleFilePath = str;
    }

    public final void setDevLoadingViewManager(DevLoadingViewManager devLoadingViewManager) {
        this.devLoadingViewManager = devLoadingViewManager;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setDevMenuEnabled(boolean z10) {
        this.devMenuEnabled = z10;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public final void setDevSupportEnabled(boolean z10) {
        this.isDevSupportEnabled = z10;
        reloadSettings();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setFpsDebugEnabled(final boolean isFpsDebugEnabled) {
        if (this.isDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.C
                @Override // java.lang.Runnable
                public final void run() {
                    DevSupportManagerBase.setFpsDebugEnabled$lambda$35(this.f20302g, isFpsDebugEnabled);
                }
            });
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setHotModuleReplacementEnabled(final boolean isHotModuleReplacementEnabled) {
        if (this.isDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.H
                @Override // java.lang.Runnable
                public final void run() {
                    DevSupportManagerBase.setHotModuleReplacementEnabled$lambda$34(this.f20309g, isHotModuleReplacementEnabled);
                }
            });
        }
    }

    public final void setJsAppBundleName(String str) {
        this.jsAppBundleName = str;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setKeyboardShortcutsEnabled(boolean z10) {
        this.keyboardShortcutsEnabled = z10;
    }

    public final void setLastErrorCookie(int i10) {
        this.lastErrorCookie = i10;
    }

    public final void setLastErrorStack(StackFrame[] stackFrameArr) {
        this.lastErrorStack = stackFrameArr;
    }

    public final void setLastErrorTitle(String str) {
        this.lastErrorTitle = str;
    }

    public final void setLastErrorType(ErrorType errorType) {
        this.lastErrorType = errorType;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setPackagerLocationCustomizer(DevSupportManager.PackagerLocationCustomizer packagerLocationCustomizer) {
        AbstractC2855l.g(packagerLocationCustomizer, "packagerLocationCustomizer");
        this.packagerLocationCustomizer = packagerLocationCustomizer;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public final void setShakeGestureEnabled(boolean z10) {
        if (this.shakeGestureEnabled == z10) {
            return;
        }
        if (z10) {
            startShakeDetector();
        } else {
            stopShakeDetector();
        }
        this.shakeGestureEnabled = z10;
    }

    public final void setTracingStateProvider$ReactAndroid_release(TracingStateProvider provider) {
        this.tracingStateProvider = provider;
    }

    protected final void showDevLoadingViewForRemoteJSEnabled() {
        DevLoadingViewManager devLoadingViewManager = this.devLoadingViewManager;
        if (devLoadingViewManager != null) {
            String string = this.applicationContext.getString(R.string.catalyst_debug_connecting);
            AbstractC2855l.f(string, "getString(...)");
            devLoadingViewManager.showMessage(string);
        }
        this.devLoadingViewVisible = true;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showDevOptionsDialog() {
        RCTNativeAppEventEmitter rCTNativeAppEventEmitter;
        AlertDialog alertDialog;
        ListView listView;
        TracingState tracingState;
        String string;
        DevOptionHandler devOptionHandler;
        if (this.devOptionsDialog == null && this.isDevSupportEnabled && getDevMenuEnabled() && !ActivityManager.isUserAMonkey()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            final HashSet hashSet = new HashSet();
            linkedHashMap.put(this.applicationContext.getString(R.string.catalyst_reload), new DevOptionHandler() { // from class: com.facebook.react.devsupport.N
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public final void onOptionSelected() {
                    DevSupportManagerBase.showDevOptionsDialog$lambda$8(this.f20321a);
                }
            });
            if (this.devSettings.getIsDeviceDebugEnabled()) {
                boolean z10 = this.isPackagerConnected;
                String string2 = this.applicationContext.getString(z10 ? R.string.catalyst_debug_open : R.string.catalyst_debug_open_disabled);
                AbstractC2855l.f(string2, "getString(...)");
                if (!z10) {
                    hashSet.add(string2);
                }
                linkedHashMap.put(string2, new DevOptionHandler() { // from class: com.facebook.react.devsupport.r
                    @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                    public final void onOptionSelected() {
                        DevSupportManager.openDebugger$default(this.f20383a, null, 1, null);
                    }
                });
            }
            if (ReactNativeFeatureFlags.perfMonitorV2Enabled()) {
                boolean z11 = this.isPackagerConnected;
                TracingStateProvider tracingStateProvider = this.tracingStateProvider;
                if (tracingStateProvider == null || (tracingState = tracingStateProvider.getTracingState()) == null) {
                    tracingState = TracingState.DISABLED;
                }
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                int i10 = iArr[tracingState.ordinal()];
                if (i10 == 1) {
                    string = this.applicationContext.getString(R.string.catalyst_performance_background);
                } else if (i10 == 2) {
                    string = this.applicationContext.getString(R.string.catalyst_performance_cdp);
                } else {
                    if (i10 != 3) {
                        throw new C2750m();
                    }
                    string = this.applicationContext.getString(R.string.catalyst_performance_disabled);
                }
                AbstractC2855l.d(string);
                if (!z11 || tracingState == TracingState.ENABLEDINCDPMODE) {
                    hashSet.add(string);
                }
                int i11 = iArr[tracingState.ordinal()];
                if (i11 == 1) {
                    devOptionHandler = new DevOptionHandler() { // from class: com.facebook.react.devsupport.s
                        @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                        public final void onOptionSelected() {
                            DevSupportManagerBase.showDevOptionsDialog$lambda$12(this.f20384a);
                        }
                    };
                } else if (i11 == 2) {
                    devOptionHandler = new DevOptionHandler() { // from class: com.facebook.react.devsupport.u
                        @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                        public final void onOptionSelected() {
                            DevSupportManagerBase.showDevOptionsDialog$lambda$14();
                        }
                    };
                } else {
                    if (i11 != 3) {
                        throw new C2750m();
                    }
                    devOptionHandler = new DevOptionHandler() { // from class: com.facebook.react.devsupport.t
                        @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                        public final void onOptionSelected() {
                            DevSupportManagerBase.showDevOptionsDialog$lambda$13(this.f20385a);
                        }
                    };
                }
                linkedHashMap.put(string, devOptionHandler);
            }
            if (ReactNativeFeatureFlags.perfMonitorV2Enabled()) {
                boolean z12 = this.isPackagerConnected;
                PerfMonitorOverlayManager perfMonitorOverlayManager = this.perfMonitorOverlayManager;
                String string3 = (perfMonitorOverlayManager == null || !perfMonitorOverlayManager.getEnabled()) ? this.applicationContext.getString(R.string.catalyst_performance_enable) : this.applicationContext.getString(R.string.catalyst_performance_disable);
                AbstractC2855l.d(string3);
                if (!z12) {
                    hashSet.add(string3);
                }
                PerfMonitorOverlayManager perfMonitorOverlayManager2 = this.perfMonitorOverlayManager;
                linkedHashMap.put(string3, (perfMonitorOverlayManager2 == null || !perfMonitorOverlayManager2.getEnabled()) ? new DevOptionHandler() { // from class: com.facebook.react.devsupport.w
                    @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                    public final void onOptionSelected() {
                        DevSupportManagerBase.showDevOptionsDialog$lambda$16(this.f20387a);
                    }
                } : new DevOptionHandler() { // from class: com.facebook.react.devsupport.v
                    @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                    public final void onOptionSelected() {
                        DevSupportManagerBase.showDevOptionsDialog$lambda$15(this.f20386a);
                    }
                });
            }
            linkedHashMap.put(this.applicationContext.getString(R.string.catalyst_change_bundle_location), new DevOptionHandler() { // from class: com.facebook.react.devsupport.x
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public final void onOptionSelected() {
                    DevSupportManagerBase.showDevOptionsDialog$lambda$18(this.f20388a);
                }
            });
            linkedHashMap.put(this.applicationContext.getString(R.string.catalyst_inspector_toggle), new DevOptionHandler() { // from class: com.facebook.react.devsupport.y
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public final void onOptionSelected() {
                    DevSupportManagerBase.showDevOptionsDialog$lambda$19(this.f20389a);
                }
            });
            String string4 = this.devSettings.isHotModuleReplacementEnabled() ? this.applicationContext.getString(R.string.catalyst_hot_reloading_stop) : this.applicationContext.getString(R.string.catalyst_hot_reloading);
            AbstractC2855l.d(string4);
            linkedHashMap.put(string4, new DevOptionHandler() { // from class: com.facebook.react.devsupport.z
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public final void onOptionSelected() {
                    DevSupportManagerBase.showDevOptionsDialog$lambda$20(this.f20390a);
                }
            });
            if (!ReactNativeFeatureFlags.perfMonitorV2Enabled()) {
                String string5 = this.devSettings.isFpsDebugEnabled() ? this.applicationContext.getString(R.string.catalyst_perf_monitor_stop) : this.applicationContext.getString(R.string.catalyst_perf_monitor);
                AbstractC2855l.d(string5);
                linkedHashMap.put(string5, new DevOptionHandler() { // from class: com.facebook.react.devsupport.O
                    @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                    public final void onOptionSelected() {
                        DevSupportManagerBase.showDevOptionsDialog$lambda$21(this.f20322a);
                    }
                });
                linkedHashMap.put(this.applicationContext.getString(R.string.catalyst_settings), new DevOptionHandler() { // from class: com.facebook.react.devsupport.P
                    @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                    public final void onOptionSelected() {
                        DevSupportManagerBase.showDevOptionsDialog$lambda$22(this.f20323a);
                    }
                });
            }
            if (!this.customDevOptions.isEmpty()) {
                linkedHashMap.putAll(this.customDevOptions);
            }
            Collection collectionValues = linkedHashMap.values();
            AbstractC2855l.f(collectionValues, "<get-values>(...)");
            final DevOptionHandler[] devOptionHandlerArr = (DevOptionHandler[]) collectionValues.toArray(new DevOptionHandler[0]);
            final Activity currentActivity = this.reactInstanceDevHelper.getCurrentActivity();
            if (currentActivity == null || currentActivity.isFinishing()) {
                AbstractC2325a.m(ReactConstants.TAG, "Unable to launch dev options menu because react activity isn't available");
                return;
            }
            LinearLayout linearLayout = new LinearLayout(currentActivity);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(currentActivity);
            textView.setText(currentActivity.getString(R.string.catalyst_dev_menu_header));
            textView.setPadding(0, 50, 0, 0);
            textView.setGravity(17);
            textView.setTextSize(16.0f);
            textView.setTypeface(textView.getTypeface(), 1);
            linearLayout.addView(textView);
            String jSExecutorDescription = getJSExecutorDescription();
            if (jSExecutorDescription != null) {
                TextView textView2 = new TextView(currentActivity);
                textView2.setText(currentActivity.getString(R.string.catalyst_dev_menu_sub_header, jSExecutorDescription));
                textView2.setPadding(0, 20, 0, 0);
                textView2.setGravity(17);
                textView2.setTextSize(14.0f);
                linearLayout.addView(textView2);
            }
            Set setKeySet = linkedHashMap.keySet();
            AbstractC2855l.f(setKeySet, "<get-keys>(...)");
            final String[] strArr = (String[]) setKeySet.toArray(new String[0]);
            AlertDialog alertDialogCreate = new AlertDialog.Builder(currentActivity).setCustomTitle(linearLayout).setAdapter(new ArrayAdapter<String>(currentActivity, hashSet, this, strArr) { // from class: com.facebook.react.devsupport.DevSupportManagerBase$showDevOptionsDialog$adapter$1
                final /* synthetic */ Activity $context;
                final /* synthetic */ Set<String> $disabledItemKeys;
                final /* synthetic */ DevSupportManagerBase this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(currentActivity, android.R.layout.simple_list_item_1, strArr);
                    this.$context = currentActivity;
                    this.$disabledItemKeys = hashSet;
                    this.this$0 = this;
                }

                @Override // android.widget.BaseAdapter, android.widget.ListAdapter
                public boolean areAllItemsEnabled() {
                    return false;
                }

                @Override // android.widget.ArrayAdapter, android.widget.Adapter
                public View getView(int position, View convertView, ViewGroup parent) {
                    AbstractC2855l.g(parent, "parent");
                    View view = super.getView(position, convertView, parent);
                    AbstractC2855l.f(view, "getView(...)");
                    DevSupportManagerBase devSupportManagerBase = this.this$0;
                    Activity activity = this.$context;
                    view.setEnabled(isEnabled(position));
                    if (view instanceof TextView) {
                        TextView textView3 = (TextView) view;
                        textView3.setTextColor(textView3.isEnabled() ? devSupportManagerBase.safeGetDefaultTextColor(activity) : devSupportManagerBase.safeGetTextColorSecondary(activity));
                    }
                    return view;
                }

                @Override // android.widget.BaseAdapter, android.widget.ListAdapter
                public boolean isEnabled(int position) {
                    return !this.$disabledItemKeys.contains(getItem(position));
                }
            }, new DialogInterface.OnClickListener() { // from class: com.facebook.react.devsupport.Q
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    DevSupportManagerBase.showDevOptionsDialog$lambda$25(devOptionHandlerArr, this, dialogInterface, i12);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.react.devsupport.q
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f20382g.devOptionsDialog = null;
                }
            }).create();
            this.devOptionsDialog = alertDialogCreate;
            if (alertDialogCreate != null) {
                alertDialogCreate.show();
            }
            if (Build.VERSION.SDK_INT <= 30 && (alertDialog = this.devOptionsDialog) != null && (listView = alertDialog.getListView()) != null) {
                int i12 = (int) (((double) currentActivity.getResources().getDisplayMetrics().heightPixels) * 0.7d);
                ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-1, -2);
                }
                layoutParams.height = i12;
                listView.setLayoutParams(layoutParams);
            }
            ReactContext reactContext = this.currentReactContext;
            if (reactContext == null || (rCTNativeAppEventEmitter = (RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)) == null) {
                return;
            }
            rCTNativeAppEventEmitter.emit("RCTDevMenuShown", null);
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJSError(String message, ReadableArray details, int errorCookie) {
        showNewError(message, StackTraceHelper.convertJsStackTrace(details), errorCookie, ErrorType.JS);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJavaError(String message, Throwable e10) {
        AbstractC2855l.g(e10, "e");
        AbstractC2325a.n(ReactConstants.TAG, "Exception in native call", e10);
        showNewError(message, StackTraceHelper.convertJavaStackTrace(e10), -1, ErrorType.NATIVE);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showPausedInDebuggerOverlay(String message, DevSupportManager.PausedInDebuggerOverlayCommandListener listener) {
        AbstractC2855l.g(message, "message");
        AbstractC2855l.g(listener, "listener");
        PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager = this.pausedInDebuggerOverlayManager;
        if (pausedInDebuggerOverlayManager != null) {
            pausedInDebuggerOverlayManager.showPausedInDebuggerOverlay(message, listener);
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void startInspector() {
        if (this.isDevSupportEnabled) {
            this.devServerHelper.openInspectorConnection();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void stopInspector() {
        this.devServerHelper.closeInspectorConnection();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void toggleElementInspector() {
        if (this.isDevSupportEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.I
                @Override // java.lang.Runnable
                public final void run() {
                    DevSupportManagerBase.toggleElementInspector$lambda$36(this.f20311g);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDevOptionsDialog$lambda$14() {
    }
}
