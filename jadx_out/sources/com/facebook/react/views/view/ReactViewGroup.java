package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import com.facebook.react.R;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.touch.OnInterceptTouchEventListener;
import com.facebook.react.touch.ReactHitSlopView;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.BlendModeHelper;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.MeasureSpecAssertions;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactAxOrderHelper;
import com.facebook.react.uimanager.ReactClippingProhibitedView;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ReactOverflowViewWithInset;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ReactZIndexedViewGroup;
import com.facebook.react.uimanager.ViewGroupDrawingOrderHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.react.x;
import d2.AbstractC2325a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 ï\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0004ð\u0001ï\u0001B\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010!J\u000f\u0010\"\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u000eJ#\u0010*\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010\u00132\b\u0010)\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u000fH\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u000fH\u0002¢\u0006\u0004\b0\u0010\u0012J\u0019\u00103\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u00020\fH\u0010¢\u0006\u0004\b5\u0010\u000eJ\u001f\u00109\u001a\u00020\f2\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000fH\u0014¢\u0006\u0004\b9\u0010:J7\u0010@\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u000fH\u0014¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\fH\u0017¢\u0006\u0004\bB\u0010\u000eJ\u0017\u0010E\u001a\u00020\f2\u0006\u0010D\u001a\u00020CH\u0017¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\f2\u0006\u0010G\u001a\u00020\u000fH\u0016¢\u0006\u0004\bH\u0010\u0012J\u0019\u0010J\u001a\u00020\f2\b\u0010I\u001a\u0004\u0018\u000101H\u0007¢\u0006\u0004\bJ\u00104J\u0017\u0010M\u001a\u00020\f2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00152\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00152\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bS\u0010RJ\u0017\u0010T\u001a\u00020\u00152\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bT\u0010RJ\u0017\u0010V\u001a\u00020\u00152\u0006\u0010U\u001a\u00020OH\u0016¢\u0006\u0004\bV\u0010RJ\u000f\u0010W\u001a\u00020\u0015H\u0016¢\u0006\u0004\bW\u0010#J\u0015\u0010Y\u001a\u00020\f2\u0006\u0010X\u001a\u00020\u0015¢\u0006\u0004\bY\u0010ZJ\u001d\u0010^\u001a\u00020\f2\u0006\u0010[\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020\\¢\u0006\u0004\b^\u0010_J\u001f\u0010`\u001a\u00020\f2\u0006\u0010[\u001a\u00020\u000f2\b\u0010G\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\f2\u0006\u0010b\u001a\u00020\\H\u0007¢\u0006\u0004\bc\u0010dJ\u001f\u0010c\u001a\u00020\f2\u0006\u0010b\u001a\u00020\\2\u0006\u0010[\u001a\u00020\u000fH\u0007¢\u0006\u0004\bc\u0010eJ\u001f\u0010c\u001a\u00020\f2\u0006\u0010g\u001a\u00020f2\b\u0010b\u001a\u0004\u0018\u00010h¢\u0006\u0004\bc\u0010iJ\u0017\u0010l\u001a\u00020\f2\b\u0010k\u001a\u0004\u0018\u00010j¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\f2\u0006\u0010n\u001a\u00020\u0018H\u0016¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\fH\u0016¢\u0006\u0004\bq\u0010\u000eJ\u001f\u0010q\u001a\u00020\f2\u000e\u0010r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001cH\u0016¢\u0006\u0004\bq\u0010sJ\u000f\u0010u\u001a\u00020\fH\u0000¢\u0006\u0004\bt\u0010\u000eJ\u000f\u0010w\u001a\u00020\fH\u0000¢\u0006\u0004\bv\u0010\u000eJ\u0017\u0010x\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\bx\u0010!J)\u0010{\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001cH\u0000¢\u0006\u0004\by\u0010zJ2\u0010\u0080\u0001\u001a\u00020\f2\u0006\u0010|\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020\u000f2\u0006\u0010~\u001a\u00020\u000f2\u0006\u0010\u007f\u001a\u00020\u000fH\u0014¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0011\u0010\u0082\u0001\u001a\u00020\fH\u0014¢\u0006\u0005\b\u0082\u0001\u0010\u000eJ\u0019\u0010\u0083\u0001\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u0083\u0001\u0010!J\u0019\u0010\u0084\u0001\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u0084\u0001\u0010!J#\u0010\u0086\u0001\u001a\u00020\u000f2\u0007\u0010\u0085\u0001\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000fH\u0014¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001a\u0010\u0088\u0001\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0011\u0010\u008a\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b\u008a\u0001\u0010\u000eJ\u001a\u0010\u008c\u0001\u001a\u00020\f2\u0007\u0010\u008b\u0001\u001a\u00020\u0015H\u0014¢\u0006\u0005\b\u008c\u0001\u0010ZJ\u001c\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00132\u0006\u0010)\u001a\u00020\u000fH\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J!\u0010\u0091\u0001\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0090\u0001\u0010/J\u0019\u0010\u0093\u0001\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0013H\u0000¢\u0006\u0005\b\u0092\u0001\u0010!J\u0011\u0010\u0095\u0001\u001a\u00020\fH\u0000¢\u0006\u0005\b\u0094\u0001\u0010\u000eJ2\u0010\u0096\u0001\u001a\u00020\f2\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u000fH\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0081\u0001J\u001c\u0010\u0099\u0001\u001a\u00020\f2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001c\u0010\u009b\u0001\u001a\u00020\f2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0014¢\u0006\u0006\b\u009b\u0001\u0010\u009a\u0001J.\u0010\u009e\u0001\u001a\u00020\u00152\b\u0010\u0098\u0001\u001a\u00030\u0097\u00012\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0014¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0018\u0010¡\u0001\u001a\u00020\f2\u0007\u0010 \u0001\u001a\u00020\\¢\u0006\u0005\b¡\u0001\u0010dJ\u0018\u0010£\u0001\u001a\u00020\f2\u0007\u0010¢\u0001\u001a\u00020j¢\u0006\u0005\b£\u0001\u0010mJ\u000f\u0010¤\u0001\u001a\u00020\f¢\u0006\u0005\b¤\u0001\u0010\u000eJ\"\u0010§\u0001\u001a\u00020\f2\u000e\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130¥\u0001H\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u000f\u0010©\u0001\u001a\u00020\f¢\u0006\u0005\b©\u0001\u0010\u000eR\u001f\u0010ª\u0001\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010®\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R'\u0010°\u0001\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b°\u0001\u0010±\u0001\u001a\u0005\b²\u0001\u0010#\"\u0005\b³\u0001\u0010ZR\u0019\u0010´\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010±\u0001R$\u0010¶\u0001\u001a\r\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010µ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R*\u0010¹\u0001\u001a\u00020\u000f2\u0007\u0010¸\u0001\u001a\u00020\u000f8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¹\u0001\u0010¯\u0001\u001a\u0006\bº\u0001\u0010»\u0001R(\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0019\u0010«\u0001\u001a\u0006\b¼\u0001\u0010\u00ad\u0001\"\u0005\b½\u0001\u0010pR*\u0010¾\u0001\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\b¾\u0001\u0010«\u0001\u001a\u0006\b¿\u0001\u0010\u00ad\u0001\"\u0005\bÀ\u0001\u0010pR*\u0010Â\u0001\u001a\u00030Á\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R2\u0010É\u0001\u001a\u000b\u0012\u0004\u0012\u00020j\u0018\u00010È\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R\u001c\u0010Ð\u0001\u001a\u0005\u0018\u00010Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u001b\u0010Ò\u0001\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u0017\u0010X\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bX\u0010±\u0001R\u0019\u0010Ô\u0001\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0019\u0010Ö\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010±\u0001R\"\u0010Ø\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010×\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u001c\u0010Û\u0001\u001a\u0005\u0018\u00010Ú\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u0019\u0010Ý\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010±\u0001R\u001c\u0010ß\u0001\u001a\u0005\u0018\u00010Þ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u001c\u0010â\u0001\u001a\u0005\u0018\u00010á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0018\u0010æ\u0001\u001a\u00030Þ\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bä\u0001\u0010å\u0001R(\u0010ê\u0001\u001a\u00020\u00152\u0007\u0010ç\u0001\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\bè\u0001\u0010#\"\u0005\bé\u0001\u0010ZR-\u0010ë\u0001\u001a\u0004\u0018\u00010j2\t\u0010ë\u0001\u001a\u0004\u0018\u00010j8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bì\u0001\u0010í\u0001\"\u0005\bî\u0001\u0010m¨\u0006ñ\u0001"}, d2 = {"Lcom/facebook/react/views/view/ReactViewGroup;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/touch/ReactInterceptingViewGroup;", "Lcom/facebook/react/uimanager/ReactClippingViewGroup;", "Lcom/facebook/react/uimanager/ReactPointerEventsView;", "Lcom/facebook/react/touch/ReactHitSlopView;", "Lcom/facebook/react/uimanager/ReactZIndexedViewGroup;", "Lcom/facebook/react/uimanager/ReactOverflowViewWithInset;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Li7/B;", "initView", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "childId", "trackChildViewTransition", "(I)V", "Landroid/view/View;", "child", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isChildRemovedWhileTransitioning", "(Landroid/view/View;)Z", "Landroid/graphics/Rect;", "clippingRect", "idx", "clippedSoFar", PointerEventHelper.POINTER_TYPE_UNKNOWN, "excludedViewsSet", "updateSubviewClipStatus", "(Landroid/graphics/Rect;IILjava/util/Set;)V", "subview", "(Landroid/view/View;)V", "customDrawOrderDisabled", "()Z", "expectedTag", "checkViewClippingTag", "(Landroid/view/View;Z)V", "resetPointerEvents", "view", "index", "isViewClipped", "(Landroid/view/View;Ljava/lang/Integer;)Z", "indexOfChildInAllChildren", "(Landroid/view/View;)I", "addInArray", "(Landroid/view/View;I)V", "removeFromArray", "Landroid/graphics/drawable/Drawable;", "drawable", "updateBackgroundDrawable", "(Landroid/graphics/drawable/Drawable;)V", "recycleView$ReactAndroid_release", "recycleView", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "onLayout", "(ZIIII)V", "requestLayout", "Landroid/view/ViewStructure;", "structure", "dispatchProvideStructure", "(Landroid/view/ViewStructure;)V", ViewProps.COLOR, "setBackgroundColor", AppStateModule.APP_STATE_BACKGROUND, "setTranslucentBackgroundDrawable", "Lcom/facebook/react/touch/OnInterceptTouchEventListener;", "listener", "setOnInterceptTouchEventListener", "(Lcom/facebook/react/touch/OnInterceptTouchEventListener;)V", "Landroid/view/MotionEvent;", "event", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "onHoverEvent", "ev", "dispatchGenericMotionEvent", "hasOverlappingRendering", ViewProps.NEEDS_OFFSCREEN_ALPHA_COMPOSITING, "setNeedsOffscreenAlphaCompositing", "(Z)V", ViewProps.POSITION, PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "setBorderWidth", "(IF)V", "setBorderColor", "(ILjava/lang/Integer;)V", ViewProps.BORDER_RADIUS, "setBorderRadius", "(F)V", "(FI)V", "Lcom/facebook/react/uimanager/style/BorderRadiusProp;", "property", "Lcom/facebook/react/uimanager/LengthPercentage;", "(Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "style", "setBorderStyle", "(Ljava/lang/String;)V", "outClippingRect", "getClippingRect", "(Landroid/graphics/Rect;)V", "updateClippingRect", "excludedViews", "(Ljava/util/Set;)V", "requestFocusFromJS$ReactAndroid_release", "requestFocusFromJS", "clearFocusFromJS$ReactAndroid_release", "clearFocusFromJS", "endViewTransition", "updateClippingToRect$ReactAndroid_release", "(Landroid/graphics/Rect;Ljava/util/Set;)V", "updateClippingToRect", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onAttachedToWindow", "onViewAdded", "onViewRemoved", "childCount", "getChildDrawingOrder", "(II)I", "getZIndexMappedChildIndex", "(I)I", "updateDrawingOrder", "pressed", "dispatchSetPressed", "getChildAtWithSubviewClippingEnabled$ReactAndroid_release", "(I)Landroid/view/View;", "getChildAtWithSubviewClippingEnabled", "addViewWithSubviewClippingEnabled$ReactAndroid_release", "addViewWithSubviewClippingEnabled", "removeViewWithSubviewClippingEnabled$ReactAndroid_release", "removeViewWithSubviewClippingEnabled", "removeAllViewsWithSubviewClippingEnabled$ReactAndroid_release", "removeAllViewsWithSubviewClippingEnabled", "setOverflowInset", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "dispatchDraw", PointerEventHelper.POINTER_TYPE_UNKNOWN, "drawingTime", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", ViewProps.OPACITY, "setOpacityIfPossible", "backfaceVisibility", "setBackfaceVisibility", "setBackfaceVisibilityDependantOpacity", "Ljava/util/ArrayList;", "outChildren", "addChildrenForAccessibility", "(Ljava/util/ArrayList;)V", "cleanUpAxOrderListener", "overflowInset", "Landroid/graphics/Rect;", "getOverflowInset", "()Landroid/graphics/Rect;", "recycleCount", "I", "_removeClippedSubviews", "Z", "get_removeClippedSubviews$ReactAndroid_release", "set_removeClippedSubviews$ReactAndroid_release", "inSubviewClippingLoop", PointerEventHelper.POINTER_TYPE_UNKNOWN, "allChildren", "[Landroid/view/View;", "value", "allChildrenCount", "getAllChildrenCount$ReactAndroid_release", "()I", "getClippingRect$ReactAndroid_release", "setClippingRect$ReactAndroid_release", "hitSlopRect", "getHitSlopRect", "setHitSlopRect", "Lcom/facebook/react/uimanager/PointerEvents;", ViewProps.POINTER_EVENTS, "Lcom/facebook/react/uimanager/PointerEvents;", "getPointerEvents", "()Lcom/facebook/react/uimanager/PointerEvents;", "setPointerEvents", "(Lcom/facebook/react/uimanager/PointerEvents;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "axOrderList", "Ljava/util/List;", "getAxOrderList", "()Ljava/util/List;", "setAxOrderList", "(Ljava/util/List;)V", "Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;", "childrenLayoutChangeListener", "Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;", "onInterceptTouchEventListener", "Lcom/facebook/react/touch/OnInterceptTouchEventListener;", "backfaceOpacity", "F", "backfaceVisible", PointerEventHelper.POINTER_TYPE_UNKNOWN, "childrenRemovedWhileTransitioning", "Ljava/util/Set;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "accessibilityStateChangeListener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "focusOnAttach", "Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;", "_drawingOrderHelper", "Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;", "Lcom/facebook/react/uimanager/style/Overflow;", "_overflow", "Lcom/facebook/react/uimanager/style/Overflow;", "getDrawingOrderHelper", "()Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;", "drawingOrderHelper", "newValue", "getRemoveClippedSubviews", "setRemoveClippedSubviews", ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS, ViewProps.OVERFLOW, "getOverflow", "()Ljava/lang/String;", "setOverflow", "Companion", "ChildrenLayoutChangeListener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactViewGroup extends ViewGroup implements ReactInterceptingViewGroup, ReactClippingViewGroup, ReactPointerEventsView, ReactHitSlopView, ReactZIndexedViewGroup, ReactOverflowViewWithInset {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final Companion Companion = new Companion(null);
    private static final ViewGroup.LayoutParams defaultLayoutParam = new ViewGroup.LayoutParams(0, 0);
    private ViewGroupDrawingOrderHelper _drawingOrderHelper;
    private Overflow _overflow;
    private boolean _removeClippedSubviews;
    private AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
    private View[] allChildren;
    private int allChildrenCount;
    private List<String> axOrderList;
    private float backfaceOpacity;
    private boolean backfaceVisible;
    private ChildrenLayoutChangeListener childrenLayoutChangeListener;
    private Set<Integer> childrenRemovedWhileTransitioning;
    private Rect clippingRect;
    private boolean focusOnAttach;
    private Rect hitSlopRect;
    private volatile boolean inSubviewClippingLoop;
    private boolean needsOffscreenAlphaCompositing;
    private OnInterceptTouchEventListener onInterceptTouchEventListener;
    private final Rect overflowInset;
    private PointerEvents pointerEvents;
    private int recycleCount;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005JW\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;", "Landroid/view/View$OnLayoutChangeListener;", "Lcom/facebook/react/views/view/ReactViewGroup;", "parent", "<init>", "(Lcom/facebook/react/views/view/ReactViewGroup;)V", "Landroid/view/View;", "v", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "oldLeft", "oldTop", "oldRight", "oldBottom", "Li7/B;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "shutdown", "()V", "Lcom/facebook/react/views/view/ReactViewGroup;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class ChildrenLayoutChangeListener implements View.OnLayoutChangeListener {
        private ReactViewGroup parent;

        public ChildrenLayoutChangeListener(ReactViewGroup reactViewGroup) {
            this.parent = reactViewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v10, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            ReactViewGroup reactViewGroup;
            AbstractC2855l.g(v10, "v");
            ReactViewGroup reactViewGroup2 = this.parent;
            if (reactViewGroup2 == null || !reactViewGroup2.get_removeClippedSubviews() || (reactViewGroup = this.parent) == null) {
                return;
            }
            reactViewGroup.updateSubviewClipStatus(v10);
        }

        public final void shutdown() {
            this.parent = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/views/view/ReactViewGroup$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/view/View;", "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, "clipped", "Li7/B;", "setViewClipped", "(Landroid/view/View;Z)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ARRAY_CAPACITY_INCREMENT", "I", "Landroid/view/ViewGroup$LayoutParams;", "defaultLayoutParam", "Landroid/view/ViewGroup$LayoutParams;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setViewClipped(View view, boolean clipped) {
            view.setTag(R.id.view_clipped, Boolean.valueOf(clipped));
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Overflow.values().length];
            try {
                iArr[Overflow.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Overflow.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Overflow.VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReactViewGroup(Context context) {
        super(context);
        this.overflowInset = new Rect();
        this.pointerEvents = PointerEvents.AUTO;
        initView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addChildrenForAccessibility$lambda$1(ReactViewGroup reactViewGroup, boolean z10) {
        if (z10) {
            return;
        }
        int childCount = reactViewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = reactViewGroup.getChildAt(i10);
            AbstractC2855l.f(childAt, "getChildAt(...)");
            ReactAxOrderHelper.restoreFocusability(childAt);
        }
    }

    private final void addInArray(View child, int index) {
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i10 = this.allChildrenCount;
        int length = viewArr.length;
        if (index == i10) {
            if (length == i10) {
                View[] viewArr2 = new View[length + 12];
                System.arraycopy(viewArr, 0, viewArr2, 0, length);
                this.allChildren = viewArr2;
                viewArr = viewArr2;
            }
            int i11 = this.allChildrenCount;
            this.allChildrenCount = i11 + 1;
            viewArr[i11] = child;
            return;
        }
        if (index >= i10) {
            throw new IndexOutOfBoundsException("index=" + index + " count=" + i10);
        }
        if (length == i10) {
            View[] viewArr3 = new View[length + 12];
            System.arraycopy(viewArr, 0, viewArr3, 0, index);
            System.arraycopy(viewArr, index, viewArr3, index + 1, i10 - index);
            this.allChildren = viewArr3;
            viewArr = viewArr3;
        } else {
            System.arraycopy(viewArr, index, viewArr, index + 1, i10 - index);
        }
        viewArr[index] = child;
        this.allChildrenCount++;
    }

    private final void checkViewClippingTag(View child, boolean expectedTag) {
        if (this.inSubviewClippingLoop) {
            Object tag = child.getTag(R.id.view_clipped);
            if (!AbstractC2855l.b(Boolean.valueOf(expectedTag), tag)) {
                ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.RVG_ON_VIEW_REMOVED, new ReactNoCrashSoftException("View clipping tag mismatch: tag=" + tag + " expected=" + expectedTag));
            }
        }
        if (this._removeClippedSubviews) {
            child.setTag(R.id.view_clipped, Boolean.valueOf(expectedTag));
        } else {
            child.setTag(R.id.view_clipped, null);
        }
    }

    private final boolean customDrawOrderDisabled() {
        return getId() != -1 && ViewUtil.getUIManagerType(getId()) == 2;
    }

    private final ViewGroupDrawingOrderHelper getDrawingOrderHelper() {
        if (this._drawingOrderHelper == null) {
            this._drawingOrderHelper = new ViewGroupDrawingOrderHelper(this);
        }
        ViewGroupDrawingOrderHelper viewGroupDrawingOrderHelper = this._drawingOrderHelper;
        if (viewGroupDrawingOrderHelper != null) {
            return viewGroupDrawingOrderHelper;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final int indexOfChildInAllChildren(View child) {
        int i10 = this.allChildrenCount;
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (viewArr[i11] == child) {
                return i11;
            }
        }
        return -1;
    }

    private final void initView() {
        setClipChildren(false);
        this._removeClippedSubviews = false;
        this.inSubviewClippingLoop = false;
        this.allChildren = null;
        this.allChildrenCount = 0;
        this.clippingRect = null;
        setHitSlopRect(null);
        this._overflow = Overflow.VISIBLE;
        setPointerEvents(PointerEvents.AUTO);
        this.childrenLayoutChangeListener = null;
        this.onInterceptTouchEventListener = null;
        this.needsOffscreenAlphaCompositing = false;
        this._drawingOrderHelper = null;
        this.backfaceOpacity = 1.0f;
        this.backfaceVisible = true;
        this.childrenRemovedWhileTransitioning = null;
    }

    private final boolean isChildRemovedWhileTransitioning(View child) {
        Set<Integer> set = this.childrenRemovedWhileTransitioning;
        return set != null && set.contains(Integer.valueOf(child.getId()));
    }

    private final boolean isViewClipped(View view, Integer index) {
        if (view == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object tag = view.getTag(R.id.view_clipped);
        if (tag != null) {
            return ((Boolean) tag).booleanValue();
        }
        ViewParent parent = view.getParent();
        boolean zIsChildRemovedWhileTransitioning = isChildRemovedWhileTransitioning(view);
        if (index != null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.RVG_IS_VIEW_CLIPPED, new ReactNoCrashSoftException("View missing clipping tag: index=" + index + " parentNull=" + (parent == null) + " parentThis=" + (parent == this) + " transitioning=" + zIsChildRemovedWhileTransitioning));
        }
        if (parent == null || zIsChildRemovedWhileTransitioning) {
            return true;
        }
        if (parent == this) {
            return false;
        }
        throw new IllegalStateException("Check failed.");
    }

    private final void removeFromArray(int index) {
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i10 = this.allChildrenCount;
        if (index == i10 - 1) {
            int i11 = i10 - 1;
            this.allChildrenCount = i11;
            viewArr[i11] = null;
        } else {
            if (index < 0 || index >= i10) {
                throw new IndexOutOfBoundsException();
            }
            System.arraycopy(viewArr, index + 1, viewArr, index, (i10 - index) - 1);
            int i12 = this.allChildrenCount - 1;
            this.allChildrenCount = i12;
            viewArr[i12] = null;
        }
    }

    private final void resetPointerEvents() {
        setPointerEvents(PointerEvents.AUTO);
    }

    private final void trackChildViewTransition(int childId) {
        if (this.childrenRemovedWhileTransitioning == null) {
            this.childrenRemovedWhileTransitioning = new LinkedHashSet();
        }
        Set<Integer> set = this.childrenRemovedWhileTransitioning;
        if (set != null) {
            set.add(Integer.valueOf(childId));
        }
    }

    private final void updateBackgroundDrawable(Drawable drawable) {
        super.setBackground(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateClippingToRect$ReactAndroid_release$default(ReactViewGroup reactViewGroup, Rect rect, Set set, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateClippingToRect");
        }
        if ((i10 & 2) != 0) {
            set = null;
        }
        reactViewGroup.updateClippingToRect$ReactAndroid_release(rect, set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateSubviewClipStatus(Rect clippingRect, int idx, int clippedSoFar, Set<Integer> excludedViewsSet) {
        UiThreadUtil.assertOnUiThread();
        View[] viewArr = this.allChildren;
        View view = viewArr != null ? viewArr[idx] : 0;
        if (view == 0) {
            throw new IllegalStateException("Required value was null.");
        }
        boolean zIntersects = clippingRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        Animation animation = view.getAnimation();
        boolean z10 = false;
        boolean z11 = (animation == null || animation.hasEnded()) ? false : true;
        boolean z12 = excludedViewsSet != null && excludedViewsSet.contains(Integer.valueOf(view.getId()));
        boolean z13 = excludedViewsSet != null;
        if (!zIntersects && !isViewClipped(view, Integer.valueOf(idx)) && !z11 && view != getFocusedChild() && !z12) {
            Companion.setViewClipped(view, true);
            removeViewInLayout(view);
        } else {
            if ((!z12 && !zIntersects) || !isViewClipped(view, Integer.valueOf(idx))) {
                if (zIntersects) {
                }
                if (z13) {
                    return;
                }
                ReactClippingViewGroup reactClippingViewGroup = view instanceof ReactClippingViewGroup ? (ReactClippingViewGroup) view : null;
                if (reactClippingViewGroup != null && reactClippingViewGroup.get_removeClippedSubviews()) {
                    z10 = true;
                }
                if (z10) {
                    ((ReactClippingViewGroup) view).updateClippingRect(excludedViewsSet);
                    return;
                }
                return;
            }
            int i10 = idx - clippedSoFar;
            if (i10 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            Companion.setViewClipped(view, false);
            addViewInLayout(view, i10, defaultLayoutParam, true);
            invalidate();
        }
        z13 = true;
        if (z13) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void updateSubviewClipStatus$default(ReactViewGroup reactViewGroup, Rect rect, int i10, int i11, Set set, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSubviewClipStatus");
        }
        if ((i12 & 8) != 0) {
            set = null;
        }
        reactViewGroup.updateSubviewClipStatus(rect, i10, i11, set);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList<View> outChildren) {
        AbstractC2855l.g(outChildren, "outChildren");
        Object tag = getTag(R.id.accessibility_order_parent);
        List<String> list = tag instanceof ReactViewGroup ? ((ReactViewGroup) tag).axOrderList : null;
        List<String> list2 = this.axOrderList;
        int i10 = 0;
        if (list2 == null) {
            if (list == null) {
                super.addChildrenForAccessibility(outChildren);
                return;
            }
            if (!isFocusable()) {
                super.addChildrenForAccessibility(outChildren);
                return;
            }
            if (!isFocusable() || (getContentDescription() != null && !AbstractC2855l.b(getContentDescription(), PointerEventHelper.POINTER_TYPE_UNKNOWN))) {
                if (!isFocusable() || getContentDescription() == null) {
                    return;
                }
                AbstractC2855l.b(getContentDescription(), PointerEventHelper.POINTER_TYPE_UNKNOWN);
                return;
            }
            super.addChildrenForAccessibility(outChildren);
            int childCount = getChildCount();
            while (i10 < childCount) {
                ReactAxOrderHelper reactAxOrderHelper = ReactAxOrderHelper.INSTANCE;
                View childAt = getChildAt(i10);
                AbstractC2855l.f(childAt, "getChildAt(...)");
                reactAxOrderHelper.disableFocusForSubtree(childAt, list);
                i10++;
            }
            return;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        if (this.accessibilityStateChangeListener == null && accessibilityManager != null) {
            AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: com.facebook.react.views.view.d
                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                public final void onAccessibilityStateChanged(boolean z10) {
                    ReactViewGroup.addChildrenForAccessibility$lambda$1(this.f20643a, z10);
                }
            };
            accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
            this.accessibilityStateChangeListener = accessibilityStateChangeListener;
        }
        int size = list2.size();
        View[] viewArr = new View[size];
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            ReactAxOrderHelper reactAxOrderHelper2 = ReactAxOrderHelper.INSTANCE;
            View childAt2 = getChildAt(i11);
            AbstractC2855l.f(childAt2, "getChildAt(...)");
            reactAxOrderHelper2.buildAxOrderList(childAt2, this, list2, viewArr);
        }
        while (i10 < size) {
            View view = viewArr[i10];
            if (view != null) {
                if (view.isFocusable()) {
                    outChildren.add(view);
                } else {
                    view.addChildrenForAccessibility(outChildren);
                }
            }
            i10++;
        }
    }

    public final void addViewWithSubviewClippingEnabled$ReactAndroid_release(final View child, int index) {
        AbstractC2855l.g(child, "child");
        if (!this._removeClippedSubviews) {
            throw new IllegalStateException("Check failed.");
        }
        Companion.setViewClipped(child, true);
        addInArray(child, index);
        Rect rect = this.clippingRect;
        if (rect == null) {
            throw new IllegalStateException("Required value was null.");
        }
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.inSubviewClippingLoop = true;
        int i10 = 0;
        for (int i11 = 0; i11 < index; i11++) {
            if (isViewClipped(viewArr[i11], Integer.valueOf(i11))) {
                i10++;
            }
        }
        updateSubviewClipStatus$default(this, rect, index, i10, null, 8, null);
        this.inSubviewClippingLoop = false;
        child.addOnLayoutChangeListener(this.childrenLayoutChangeListener);
        if (child instanceof ReactClippingProhibitedView) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.views.view.ReactViewGroup$addViewWithSubviewClippingEnabled$1
                @Override // java.lang.Runnable
                public void run() {
                    if (child.isShown()) {
                        return;
                    }
                    ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.CLIPPING_PROHIBITED_VIEW, new ReactNoCrashSoftException("Child view has been added to Parent view in which it is clipped and not visible. This is not legal for this particular child view. Child: [" + child.getId() + "] " + child + " Parent: [" + this.getId() + "] " + this));
                }
            });
        }
    }

    public final void cleanUpAxOrderListener() {
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
        Object systemService = getContext().getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager != null && (accessibilityStateChangeListener = this.accessibilityStateChangeListener) != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
        }
        this.accessibilityStateChangeListener = null;
    }

    public final void clearFocusFromJS$ReactAndroid_release() {
        this.focusOnAttach = false;
        super.clearFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC2855l.g(canvas, "canvas");
        if (this._overflow != Overflow.VISIBLE || getTag(R.id.filter) != null) {
            BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent ev) {
        AbstractC2855l.g(ev, "ev");
        if (PointerEvents.INSTANCE.canChildrenBeTouchTarget(getPointerEvents())) {
            return super.dispatchGenericMotionEvent(ev);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure structure) {
        AbstractC2855l.g(structure, "structure");
        try {
            super.dispatchProvideStructure(structure);
        } catch (NullPointerException e10) {
            AbstractC2325a.n(ReactConstants.TAG, "NullPointerException when executing dispatchProvideStructure", e10);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC2855l.g(canvas, "canvas");
        if (Build.VERSION.SDK_INT < 29 || ViewUtil.getUIManagerType(this) != 2 || !BlendModeHelper.needsIsolatedLayer(this)) {
            super.draw(canvas);
            return;
        }
        Rect overflowInset = getOverflowInset();
        canvas.saveLayer(overflowInset.left, overflowInset.top, getWidth() + (-overflowInset.right), getHeight() + (-overflowInset.bottom), null);
        super.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[PHI: r4
      0x006c: PHI (r4v1 android.graphics.BlendMode) = 
      (r4v0 android.graphics.BlendMode)
      (r4v0 android.graphics.BlendMode)
      (r4v0 android.graphics.BlendMode)
      (r4v3 android.graphics.BlendMode)
     binds: [B:9:0x0022, B:11:0x0029, B:13:0x002f, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean drawChild(Canvas canvas, View child, long drawingTime) {
        Canvas canvas2;
        AbstractC2855l.g(canvas, "canvas");
        AbstractC2855l.g(child, "child");
        boolean z10 = child.getElevation() > 0.0f;
        if (z10) {
            CanvasUtil.enableZ(canvas, true);
        }
        if (Build.VERSION.SDK_INT >= 29 && ViewUtil.getUIManagerType(this) == 2 && BlendModeHelper.needsIsolatedLayer(this)) {
            Object tag = child.getTag(R.id.mix_blend_mode);
            blendModeA = c.a(tag) ? x.a(tag) : null;
            if (blendModeA != null) {
                Paint paint = new Paint();
                paint.setBlendMode(blendModeA);
                Rect overflowInset = getOverflowInset();
                canvas2 = canvas;
                canvas2.saveLayer(overflowInset.left, overflowInset.top, getWidth() + (-overflowInset.right), getHeight() + (-overflowInset.bottom), paint);
            }
        } else {
            canvas2 = canvas;
        }
        boolean zDrawChild = super.drawChild(canvas2, child, drawingTime);
        if (blendModeA != null) {
            canvas2.restore();
        }
        if (z10) {
            CanvasUtil.enableZ(canvas2, false);
        }
        return zDrawChild;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        AbstractC2855l.g(view, "view");
        super.endViewTransition(view);
        Set<Integer> set = this.childrenRemovedWhileTransitioning;
        if (set != null) {
            set.remove(Integer.valueOf(view.getId()));
        }
    }

    /* JADX INFO: renamed from: getAllChildrenCount$ReactAndroid_release, reason: from getter */
    public final int getAllChildrenCount() {
        return this.allChildrenCount;
    }

    public final List<String> getAxOrderList() {
        return this.axOrderList;
    }

    public final View getChildAtWithSubviewClippingEnabled$ReactAndroid_release(int index) {
        if (index < 0 || index >= this.allChildrenCount) {
            return null;
        }
        View[] viewArr = this.allChildren;
        if (viewArr != null) {
            return viewArr[index];
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int childCount, int index) {
        UiThreadUtil.assertOnUiThread();
        return !customDrawOrderDisabled() ? getDrawingOrderHelper().getChildDrawingOrder(childCount, index) : index;
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void getClippingRect(Rect outClippingRect) {
        AbstractC2855l.g(outClippingRect, "outClippingRect");
        Rect rect = this.clippingRect;
        if (rect == null) {
            throw new IllegalStateException("Required value was null.");
        }
        outClippingRect.set(rect);
    }

    /* JADX INFO: renamed from: getClippingRect$ReactAndroid_release, reason: from getter */
    public final Rect getClippingRect() {
        return this.clippingRect;
    }

    @Override // com.facebook.react.touch.ReactHitSlopView
    public Rect getHitSlopRect() {
        return this.hitSlopRect;
    }

    @Override // com.facebook.react.uimanager.ReactOverflowView
    public String getOverflow() {
        Overflow overflow = this._overflow;
        int i10 = overflow == null ? -1 : WhenMappings.$EnumSwitchMapping$0[overflow.ordinal()];
        if (i10 == 1) {
            return ViewProps.HIDDEN;
        }
        if (i10 == 2) {
            return ViewProps.SCROLL;
        }
        if (i10 != 3) {
            return null;
        }
        return ViewProps.VISIBLE;
    }

    @Override // com.facebook.react.uimanager.ReactOverflowViewWithInset
    public Rect getOverflowInset() {
        return this.overflowInset;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    public PointerEvents getPointerEvents() {
        return this.pointerEvents;
    }

    /* JADX INFO: renamed from: getRemoveClippedSubviews, reason: from getter */
    public boolean get_removeClippedSubviews() {
        return this._removeClippedSubviews;
    }

    @Override // com.facebook.react.uimanager.ReactZIndexedViewGroup
    public int getZIndexMappedChildIndex(int index) {
        UiThreadUtil.assertOnUiThread();
        return (customDrawOrderDisabled() || !getDrawingOrderHelper().shouldEnableCustomDrawingOrder()) ? index : getDrawingOrderHelper().getChildDrawingOrder(getChildCount(), index);
    }

    public final boolean get_removeClippedSubviews$ReactAndroid_release() {
        return this._removeClippedSubviews;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.needsOffscreenAlphaCompositing;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this._removeClippedSubviews) {
            updateClippingRect();
        }
        if (this.focusOnAttach) {
            requestFocusFromJS$ReactAndroid_release();
            this.focusOnAttach = false;
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent event) {
        AbstractC2855l.g(event, "event");
        return ReactFeatureFlags.dispatchPointerEvents ? PointerEvents.INSTANCE.canBeTouchTarget(getPointerEvents()) : super.onHoverEvent(event);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        AbstractC2855l.g(event, "event");
        OnInterceptTouchEventListener onInterceptTouchEventListener = this.onInterceptTouchEventListener;
        if ((onInterceptTouchEventListener == null || !onInterceptTouchEventListener.onInterceptTouchEvent(this, event)) && PointerEvents.INSTANCE.canChildrenBeTouchTarget(getPointerEvents())) {
            return super.onInterceptTouchEvent(event);
        }
        return true;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        MeasureSpecAssertions.assertExplicitMeasureSpec(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        if (this._removeClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC2855l.g(event, "event");
        return PointerEvents.INSTANCE.canBeTouchTarget(getPointerEvents());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View child) {
        AbstractC2855l.g(child, "child");
        UiThreadUtil.assertOnUiThread();
        checkViewClippingTag(child, false);
        if (customDrawOrderDisabled()) {
            setChildrenDrawingOrderEnabled(false);
        } else {
            getDrawingOrderHelper().handleAddView(child);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().shouldEnableCustomDrawingOrder());
        }
        super.onViewAdded(child);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View child) {
        AbstractC2855l.g(child, "child");
        UiThreadUtil.assertOnUiThread();
        checkViewClippingTag(child, true);
        if (customDrawOrderDisabled()) {
            setChildrenDrawingOrderEnabled(false);
        } else {
            getDrawingOrderHelper().handleRemoveView(child);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().shouldEnableCustomDrawingOrder());
        }
        if (child.getParent() != null) {
            trackChildViewTransition(child.getId());
        }
        super.onViewRemoved(child);
    }

    public void recycleView$ReactAndroid_release() {
        ChildrenLayoutChangeListener childrenLayoutChangeListener;
        this.recycleCount++;
        View[] viewArr = this.allChildren;
        if (viewArr != null && (childrenLayoutChangeListener = this.childrenLayoutChangeListener) != null) {
            if (childrenLayoutChangeListener != null) {
                childrenLayoutChangeListener.shutdown();
            }
            int i10 = this.allChildrenCount;
            for (int i11 = 0; i11 < i10; i11++) {
                View view = viewArr[i11];
                if (view != null) {
                    view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
                }
            }
        }
        initView();
        getOverflowInset().setEmpty();
        removeAllViews();
        if (getParent() != null) {
            ViewParent parent = getParent();
            AbstractC2855l.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
        updateBackgroundDrawable(null);
        resetPointerEvents();
        this.focusOnAttach = false;
    }

    public final void removeAllViewsWithSubviewClippingEnabled$ReactAndroid_release() {
        if (!this._removeClippedSubviews) {
            throw new IllegalStateException("Check failed.");
        }
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i10 = this.allChildrenCount;
        for (int i11 = 0; i11 < i10; i11++) {
            View view = viewArr[i11];
            if (view != null) {
                view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
            }
        }
        removeAllViewsInLayout();
        this.allChildrenCount = 0;
    }

    public final void removeViewWithSubviewClippingEnabled$ReactAndroid_release(View view) {
        AbstractC2855l.g(view, "view");
        UiThreadUtil.assertOnUiThread();
        if (!this._removeClippedSubviews) {
            throw new IllegalStateException("Check failed.");
        }
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
        int iIndexOfChildInAllChildren = indexOfChildInAllChildren(view);
        if (!isViewClipped(viewArr[iIndexOfChildInAllChildren], Integer.valueOf(iIndexOfChildInAllChildren))) {
            int i10 = 0;
            for (int i11 = 0; i11 < iIndexOfChildInAllChildren; i11++) {
                if (isViewClipped(viewArr[i11], Integer.valueOf(i11))) {
                    i10++;
                }
            }
            removeViewsInLayout(iIndexOfChildInAllChildren - i10, 1);
            invalidate();
        }
        removeFromArray(iIndexOfChildInAllChildren);
    }

    public final void requestFocusFromJS$ReactAndroid_release() {
        if (isAttachedToWindow()) {
            super.requestFocus(130, null);
        } else {
            this.focusOnAttach = true;
        }
    }

    public final void setAxOrderList(List<String> list) {
        this.axOrderList = list;
    }

    public final void setBackfaceVisibility(String backfaceVisibility) {
        AbstractC2855l.g(backfaceVisibility, "backfaceVisibility");
        this.backfaceVisible = AbstractC2855l.b(ViewProps.VISIBLE, backfaceVisibility);
        setBackfaceVisibilityDependantOpacity();
    }

    public final void setBackfaceVisibilityDependantOpacity() {
        if (this.backfaceVisible) {
            setAlpha(this.backfaceOpacity);
            return;
        }
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        if (rotationX < -90.0f || rotationX >= 90.0f || rotationY < -90.0f || rotationY >= 90.0f) {
            setAlpha(0.0f);
        } else {
            setAlpha(this.backfaceOpacity);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(color));
    }

    public final void setBorderColor(int position, Integer color) {
        BackgroundStyleApplicator.setBorderColor(this, (LogicalEdge) LogicalEdge.getEntries().get(position), color);
    }

    public final void setBorderRadius(float borderRadius) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.BORDER_RADIUS, Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
    }

    public final void setBorderStyle(String style) {
        BackgroundStyleApplicator.setBorderStyle(this, style != null ? BorderStyle.INSTANCE.fromString(style) : null);
    }

    public final void setBorderWidth(int position, float width) {
        BackgroundStyleApplicator.setBorderWidth(this, (LogicalEdge) LogicalEdge.getEntries().get(position), Float.valueOf(PixelUtil.toDIPFromPixel(width)));
    }

    public final void setClippingRect$ReactAndroid_release(Rect rect) {
        this.clippingRect = rect;
    }

    public void setHitSlopRect(Rect rect) {
        this.hitSlopRect = rect;
    }

    public final void setNeedsOffscreenAlphaCompositing(boolean needsOffscreenAlphaCompositing) {
        this.needsOffscreenAlphaCompositing = needsOffscreenAlphaCompositing;
    }

    @Override // com.facebook.react.touch.ReactInterceptingViewGroup
    public void setOnInterceptTouchEventListener(OnInterceptTouchEventListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.onInterceptTouchEventListener = listener;
    }

    public final void setOpacityIfPossible(float opacity) {
        this.backfaceOpacity = opacity;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(String str) {
        this._overflow = str == null ? Overflow.VISIBLE : Overflow.INSTANCE.fromString(str);
        invalidate();
    }

    @Override // com.facebook.react.uimanager.ReactOverflowViewWithInset
    public void setOverflowInset(int left, int top, int right, int bottom) {
        if (BlendModeHelper.needsIsolatedLayer(this) && (getOverflowInset().left != left || getOverflowInset().top != top || getOverflowInset().right != right || getOverflowInset().bottom != bottom)) {
            invalidate();
        }
        getOverflowInset().set(left, top, right, bottom);
    }

    public void setPointerEvents(PointerEvents pointerEvents) {
        AbstractC2855l.g(pointerEvents, "<set-?>");
        this.pointerEvents = pointerEvents;
    }

    public void setRemoveClippedSubviews(boolean z10) {
        if (z10 == this._removeClippedSubviews) {
            return;
        }
        this._removeClippedSubviews = z10;
        this.childrenRemovedWhileTransitioning = null;
        if (z10) {
            Rect rect = new Rect();
            ReactClippingViewGroupHelper.calculateClippingRect(this, rect);
            this.clippingRect = rect;
            int childCount = getChildCount();
            this.allChildrenCount = childCount;
            View[] viewArr = new View[Math.max(12, childCount)];
            this.childrenLayoutChangeListener = new ChildrenLayoutChangeListener(this);
            int i10 = this.allChildrenCount;
            for (int i11 = 0; i11 < i10; i11++) {
                View childAt = getChildAt(i11);
                viewArr[i11] = childAt;
                childAt.addOnLayoutChangeListener(this.childrenLayoutChangeListener);
                Companion companion = Companion;
                AbstractC2855l.d(childAt);
                companion.setViewClipped(childAt, false);
            }
            this.allChildren = viewArr;
            updateClippingRect();
            return;
        }
        View[] viewArr2 = this.allChildren;
        if (viewArr2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (this.childrenLayoutChangeListener == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i12 = this.allChildrenCount;
        for (int i13 = 0; i13 < i12; i13++) {
            View view = viewArr2[i13];
            if (view != null) {
                view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
            }
        }
        Rect rect2 = this.clippingRect;
        if (rect2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        getDrawingRect(rect2);
        updateClippingToRect$ReactAndroid_release$default(this, rect2, null, 2, null);
        this.allChildren = null;
        this.clippingRect = null;
        this.allChildrenCount = 0;
        this.childrenLayoutChangeListener = null;
    }

    public final void setTranslucentBackgroundDrawable(Drawable background) {
        BackgroundStyleApplicator.setFeedbackUnderlay(this, background);
    }

    public final void set_removeClippedSubviews$ReactAndroid_release(boolean z10) {
        this._removeClippedSubviews = z10;
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect() {
        updateClippingRect(null);
    }

    public final void updateClippingToRect$ReactAndroid_release(Rect clippingRect, Set<Integer> excludedViewsSet) {
        AbstractC2855l.g(clippingRect, "clippingRect");
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.inSubviewClippingLoop = true;
        int i10 = this.allChildrenCount;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            try {
                updateSubviewClipStatus(clippingRect, i12, i11, excludedViewsSet);
                if (isViewClipped(viewArr[i12], Integer.valueOf(i12))) {
                    i11++;
                }
                if (i12 - i11 > getChildCount()) {
                    throw new IllegalStateException("Invalid clipping state. i=" + i12 + " clippedSoFar=" + i11 + " count=" + getChildCount() + " allChildrenCount=" + this.allChildrenCount + " recycleCount=" + this.recycleCount + "  excludedViews=" + (excludedViewsSet != null ? excludedViewsSet.size() : 0));
                }
            } catch (IndexOutOfBoundsException e10) {
                HashSet hashSet = new HashSet();
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    i13 += isViewClipped(viewArr[i14], Integer.valueOf(i14)) ? 1 : 0;
                    hashSet.add(viewArr[i14]);
                }
                throw new IllegalStateException("Invalid clipping state. i=" + i12 + " clippedSoFar=" + i11 + " count=" + getChildCount() + " allChildrenCount=" + this.allChildrenCount + " recycleCount=" + this.recycleCount + " realClippedSoFar=" + i13 + " uniqueViewsCount=" + hashSet.size() + " excludedViews=" + (excludedViewsSet != null ? excludedViewsSet.size() : 0), e10);
            }
        }
        this.inSubviewClippingLoop = false;
    }

    @Override // com.facebook.react.uimanager.ReactZIndexedViewGroup
    public void updateDrawingOrder() {
        if (customDrawOrderDisabled()) {
            return;
        }
        getDrawingOrderHelper().update();
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().shouldEnableCustomDrawingOrder());
        invalidate();
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect(Set<Integer> excludedViews) {
        if (this._removeClippedSubviews) {
            Rect rect = this.clippingRect;
            if (rect == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ReactClippingViewGroupHelper.calculateClippingRect(this, rect);
            updateClippingToRect$ReactAndroid_release(rect, excludedViews);
        }
    }

    public final void setBorderRadius(float borderRadius, int position) {
        BackgroundStyleApplicator.setBorderRadius(this, (BorderRadiusProp) BorderRadiusProp.getEntries().get(position), Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
    }

    public final void setBorderRadius(BorderRadiusProp property, LengthPercentage borderRadius) {
        AbstractC2855l.g(property, "property");
        BackgroundStyleApplicator.setBorderRadius(this, property, borderRadius);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSubviewClipStatus(View subview) {
        ReactViewGroup reactViewGroup;
        if (this._removeClippedSubviews && getParent() != null) {
            Rect rect = this.clippingRect;
            if (rect != null) {
                View[] viewArr = this.allChildren;
                if (viewArr != null) {
                    if (rect.intersects(subview.getLeft(), subview.getTop(), subview.getRight(), subview.getBottom()) != (!isViewClipped(subview, null))) {
                        this.inSubviewClippingLoop = true;
                        int i10 = this.allChildrenCount;
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            if (i11 >= i10) {
                                reactViewGroup = this;
                                break;
                            }
                            View view = viewArr[i11];
                            if (view == subview) {
                                updateSubviewClipStatus$default(this, rect, i11, i12, null, 8, null);
                                reactViewGroup = this;
                                break;
                            }
                            int i13 = i11;
                            Rect rect2 = rect;
                            if (isViewClipped(view, Integer.valueOf(i13))) {
                                i12++;
                            }
                            rect = rect2;
                            i11 = i13 + 1;
                        }
                        reactViewGroup.inSubviewClippingLoop = false;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean pressed) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }
}
