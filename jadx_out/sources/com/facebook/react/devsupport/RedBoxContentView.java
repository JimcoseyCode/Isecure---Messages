package com.facebook.react.devsupport;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.react.R;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.inspector.DevSupportHttpClient;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.ErrorType;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import e9.B;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002:;B#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\rJ5\u0010\u001e\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000b¢\u0006\u0004\b \u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/facebook/react/devsupport/RedBoxContentView;", "Landroid/widget/LinearLayout;", "Landroid/widget/AdapterView$OnItemClickListener;", "Landroid/content/Context;", "context", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;", "redBoxHandler", "<init>", "(Landroid/content/Context;Lcom/facebook/react/devsupport/interfaces/DevSupportManager;Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;)V", "Li7/B;", "init", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, AlertFragment.ARG_TITLE, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/devsupport/interfaces/StackFrame;", StackTraceHelper.STACK_KEY, "setExceptionDetails", "(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)V", "resetReporting", "Landroid/widget/AdapterView;", "parent", "Landroid/view/View;", "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.POSITION, PointerEventHelper.POINTER_TYPE_UNKNOWN, "id", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "refreshContentView", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;", "Landroid/widget/ListView;", "stackView", "Landroid/widget/ListView;", "Landroid/widget/Button;", "reportButton", "Landroid/widget/Button;", "Landroid/widget/TextView;", "reportTextView", "Landroid/widget/TextView;", "Landroid/widget/ProgressBar;", "loadingIndicator", "Landroid/widget/ProgressBar;", "lineSeparator", "Landroid/view/View;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isReporting", "Z", "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;", "reportCompletedListener", "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;", "Landroid/view/View$OnClickListener;", "reportButtonOnClickListener", "Landroid/view/View$OnClickListener;", "StackAdapter", "OpenStackFrameTask", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RedBoxContentView extends LinearLayout implements AdapterView.OnItemClickListener {
    private final DevSupportManager devSupportManager;
    private boolean isReporting;
    private View lineSeparator;
    private ProgressBar loadingIndicator;
    private final RedBoxHandler redBoxHandler;
    private Button reportButton;
    private final View.OnClickListener reportButtonOnClickListener;
    private final RedBoxHandler.ReportCompletedListener reportCompletedListener;
    private TextView reportTextView;
    private ListView stackView;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0002\u0018\u0000 \f2\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\n\"\u0004\u0018\u00010\u0002H\u0015¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/devsupport/RedBoxContentView$OpenStackFrameTask;", "Landroid/os/AsyncTask;", "Lcom/facebook/react/devsupport/interfaces/StackFrame;", "Ljava/lang/Void;", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "<init>", "(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)V", "doInBackground", "stackFrames", PointerEventHelper.POINTER_TYPE_UNKNOWN, "([Lcom/facebook/react/devsupport/interfaces/StackFrame;)Ljava/lang/Void;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class OpenStackFrameTask extends AsyncTask<StackFrame, Void, Void> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final e9.x JSON = e9.x.f26347g.a("application/json; charset=utf-8");
        private final DevSupportManager devSupportManager;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/react/devsupport/RedBoxContentView$OpenStackFrameTask$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/devsupport/interfaces/StackFrame;", "frame", "Lorg/json/JSONObject;", "stackFrameToJson", "(Lcom/facebook/react/devsupport/interfaces/StackFrame;)Lorg/json/JSONObject;", "Le9/x;", "JSON", "Le9/x;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final JSONObject stackFrameToJson(StackFrame frame) {
                return new JSONObject(j7.K.l(i7.t.a("file", frame.getFile()), i7.t.a("methodName", frame.getMethod()), i7.t.a("lineNumber", Integer.valueOf(frame.getLine())), i7.t.a("column", Integer.valueOf(frame.getColumn()))));
            }

            private Companion() {
            }
        }

        public OpenStackFrameTask(DevSupportManager devSupportManager) {
            AbstractC2855l.g(devSupportManager, "devSupportManager");
            this.devSupportManager = devSupportManager;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(StackFrame... stackFrames) {
            String string;
            e9.z httpClient$ReactAndroid_release;
            int i10;
            AbstractC2855l.g(stackFrames, "stackFrames");
            try {
                string = Uri.parse(this.devSupportManager.getSourceUrl()).buildUpon().path("/open-stack-frame").query(null).build().toString();
                AbstractC2855l.f(string, "toString(...)");
                httpClient$ReactAndroid_release = DevSupportHttpClient.INSTANCE.getHttpClient$ReactAndroid_release();
            } catch (Exception e10) {
                AbstractC2325a.n(ReactConstants.TAG, "Could not open stack frame", e10);
            }
            for (StackFrame stackFrame : stackFrames) {
                Companion companion = INSTANCE;
                if (stackFrame == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                String string2 = companion.stackFrameToJson(stackFrame).toString();
                AbstractC2855l.f(string2, "toString(...)");
                httpClient$ReactAndroid_release.a(new B.a().m(string).h(e9.C.Companion.b(JSON, string2)).b()).execute();
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;", "Landroid/widget/BaseAdapter;", AlertFragment.ARG_TITLE, PointerEventHelper.POINTER_TYPE_UNKNOWN, StackTraceHelper.STACK_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/devsupport/interfaces/StackFrame;", "<init>", "(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)V", "[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "areAllItemsEnabled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isEnabled", ViewProps.POSITION, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCount", "getItem", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getItemId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getViewTypeCount", "getItemViewType", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "FrameViewHolder", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class StackAdapter extends BaseAdapter {
        private static final int VIEW_TYPE_COUNT = 2;
        private static final int VIEW_TYPE_STACKFRAME = 1;
        private static final int VIEW_TYPE_TITLE = 0;
        private final StackFrame[] stack;
        private final String title;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter$FrameViewHolder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "v", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "methodView", "Landroid/widget/TextView;", "getMethodView", "()Landroid/widget/TextView;", "fileView", "getFileView", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class FrameViewHolder {
            private final TextView fileView;
            private final TextView methodView;

            public FrameViewHolder(View v10) {
                AbstractC2855l.g(v10, "v");
                View viewFindViewById = v10.findViewById(R.id.rn_frame_method);
                AbstractC2855l.f(viewFindViewById, "findViewById(...)");
                this.methodView = (TextView) viewFindViewById;
                View viewFindViewById2 = v10.findViewById(R.id.rn_frame_file);
                AbstractC2855l.f(viewFindViewById2, "findViewById(...)");
                this.fileView = (TextView) viewFindViewById2;
            }

            public final TextView getFileView() {
                return this.fileView;
            }

            public final TextView getMethodView() {
                return this.methodView;
            }
        }

        public StackAdapter(String title, StackFrame[] stack) {
            AbstractC2855l.g(title, "title");
            AbstractC2855l.g(stack, "stack");
            this.title = title;
            this.stack = stack;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.stack.length + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int position) {
            return position == 0 ? this.title : this.stack[position - 1];
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int position) {
            return position == 0 ? 0 : 1;
        }

        @Override // android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView textView;
            AbstractC2855l.g(parent, "parent");
            if (position == 0) {
                if (convertView != null) {
                    textView = (TextView) convertView;
                } else {
                    View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.redbox_item_title, parent, false);
                    AbstractC2855l.e(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                    textView = (TextView) viewInflate;
                }
                textView.setText(new P8.o("\\x1b\\[[0-9;]*m").e(this.title, PointerEventHelper.POINTER_TYPE_UNKNOWN));
                return textView;
            }
            if (convertView == null) {
                convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.redbox_item_frame, parent, false);
                AbstractC2855l.d(convertView);
                convertView.setTag(new FrameViewHolder(convertView));
            }
            StackFrame stackFrame = this.stack[position - 1];
            Object tag = convertView.getTag();
            AbstractC2855l.e(tag, "null cannot be cast to non-null type com.facebook.react.devsupport.RedBoxContentView.StackAdapter.FrameViewHolder");
            FrameViewHolder frameViewHolder = (FrameViewHolder) tag;
            frameViewHolder.getMethodView().setText(stackFrame.getMethod());
            frameViewHolder.getFileView().setText(StackTraceHelper.INSTANCE.formatFrameSource(stackFrame));
            frameViewHolder.getMethodView().setTextColor(stackFrame.getIsCollapsed() ? -5592406 : -1);
            frameViewHolder.getFileView().setTextColor(stackFrame.getIsCollapsed() ? -8355712 : -5000269);
            return convertView;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int position) {
            return position > 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedBoxContentView(Context context, DevSupportManager devSupportManager, RedBoxHandler redBoxHandler) {
        super(context);
        AbstractC2855l.g(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
        this.redBoxHandler = redBoxHandler;
        this.reportCompletedListener = new RedBoxHandler.ReportCompletedListener() { // from class: com.facebook.react.devsupport.RedBoxContentView$reportCompletedListener$1
            @Override // com.facebook.react.devsupport.interfaces.RedBoxHandler.ReportCompletedListener
            public void onReportError(SpannedString spannedString) {
                this.this$0.isReporting = false;
                Button button = this.this$0.reportButton;
                TextView textView = null;
                if (button == null) {
                    AbstractC2855l.y("reportButton");
                    button = null;
                }
                button.setEnabled(true);
                ProgressBar progressBar = this.this$0.loadingIndicator;
                if (progressBar == null) {
                    AbstractC2855l.y("loadingIndicator");
                    progressBar = null;
                }
                progressBar.setVisibility(8);
                TextView textView2 = this.this$0.reportTextView;
                if (textView2 == null) {
                    AbstractC2855l.y("reportTextView");
                } else {
                    textView = textView2;
                }
                textView.setText(spannedString);
            }

            @Override // com.facebook.react.devsupport.interfaces.RedBoxHandler.ReportCompletedListener
            public void onReportSuccess(SpannedString spannedString) {
                this.this$0.isReporting = false;
                Button button = this.this$0.reportButton;
                TextView textView = null;
                if (button == null) {
                    AbstractC2855l.y("reportButton");
                    button = null;
                }
                button.setEnabled(true);
                ProgressBar progressBar = this.this$0.loadingIndicator;
                if (progressBar == null) {
                    AbstractC2855l.y("loadingIndicator");
                    progressBar = null;
                }
                progressBar.setVisibility(8);
                TextView textView2 = this.this$0.reportTextView;
                if (textView2 == null) {
                    AbstractC2855l.y("reportTextView");
                } else {
                    textView = textView2;
                }
                textView.setText(spannedString);
            }
        };
        this.reportButtonOnClickListener = new View.OnClickListener() { // from class: com.facebook.react.devsupport.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RedBoxContentView.reportButtonOnClickListener$lambda$0(this.f20351g, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$2(RedBoxContentView redBoxContentView, View view) {
        redBoxContentView.devSupportManager.handleReloadJS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$3(RedBoxContentView redBoxContentView, View view) {
        redBoxContentView.devSupportManager.hideRedboxDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportButtonOnClickListener$lambda$0(RedBoxContentView redBoxContentView, View view) {
        RedBoxHandler redBoxHandler = redBoxContentView.redBoxHandler;
        if (redBoxHandler == null || !redBoxHandler.isReportEnabled() || redBoxContentView.isReporting) {
            return;
        }
        redBoxContentView.isReporting = true;
        TextView textView = redBoxContentView.reportTextView;
        Button button = null;
        if (textView == null) {
            AbstractC2855l.y("reportTextView");
            textView = null;
        }
        textView.setText("Reporting...");
        TextView textView2 = redBoxContentView.reportTextView;
        if (textView2 == null) {
            AbstractC2855l.y("reportTextView");
            textView2 = null;
        }
        textView2.setVisibility(0);
        ProgressBar progressBar = redBoxContentView.loadingIndicator;
        if (progressBar == null) {
            AbstractC2855l.y("loadingIndicator");
            progressBar = null;
        }
        progressBar.setVisibility(0);
        View view2 = redBoxContentView.lineSeparator;
        if (view2 == null) {
            AbstractC2855l.y("lineSeparator");
            view2 = null;
        }
        view2.setVisibility(0);
        Button button2 = redBoxContentView.reportButton;
        if (button2 == null) {
            AbstractC2855l.y("reportButton");
        } else {
            button = button2;
        }
        button.setEnabled(false);
        String lastErrorTitle = redBoxContentView.devSupportManager.getLastErrorTitle();
        if (lastErrorTitle == null) {
            throw new IllegalStateException("Required value was null.");
        }
        StackFrame[] lastErrorStack = redBoxContentView.devSupportManager.getLastErrorStack();
        if (lastErrorStack == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String sourceUrl = redBoxContentView.devSupportManager.getSourceUrl();
        if (sourceUrl == null) {
            throw new IllegalStateException("Required value was null.");
        }
        RedBoxHandler redBoxHandler2 = redBoxContentView.redBoxHandler;
        Context context = view.getContext();
        AbstractC2855l.f(context, "getContext(...)");
        redBoxHandler2.reportRedbox(context, lastErrorTitle, lastErrorStack, sourceUrl, redBoxContentView.reportCompletedListener);
    }

    public final void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.redbox_view, this);
        ListView listView = (ListView) findViewById(R.id.rn_redbox_stack);
        listView.setOnItemClickListener(this);
        this.stackView = listView;
        ((Button) findViewById(R.id.rn_redbox_reload_button)).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RedBoxContentView.init$lambda$2(this.f20354g, view);
            }
        });
        ((Button) findViewById(R.id.rn_redbox_dismiss_button)).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RedBoxContentView.init$lambda$3(this.f20356g, view);
            }
        });
        RedBoxHandler redBoxHandler = this.redBoxHandler;
        if (redBoxHandler == null || !redBoxHandler.isReportEnabled()) {
            return;
        }
        this.loadingIndicator = (ProgressBar) findViewById(R.id.rn_redbox_loading_indicator);
        this.lineSeparator = findViewById(R.id.rn_redbox_line_separator);
        TextView textView = (TextView) findViewById(R.id.rn_redbox_report_label);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        this.reportTextView = textView;
        Button button = (Button) findViewById(R.id.rn_redbox_report_button);
        button.setOnClickListener(this.reportButtonOnClickListener);
        this.reportButton = button;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        AbstractC2855l.g(view, "view");
        OpenStackFrameTask openStackFrameTask = new OpenStackFrameTask(this.devSupportManager);
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        StackFrame[] stackFrameArr = new StackFrame[1];
        ListView listView = this.stackView;
        if (listView == null) {
            AbstractC2855l.y("stackView");
            listView = null;
        }
        Object item = listView.getAdapter().getItem(position);
        AbstractC2855l.e(item, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.StackFrame");
        stackFrameArr[0] = item;
        openStackFrameTask.executeOnExecutor(executor, stackFrameArr);
    }

    public final void refreshContentView() {
        String lastErrorTitle = this.devSupportManager.getLastErrorTitle();
        StackFrame[] lastErrorStack = this.devSupportManager.getLastErrorStack();
        if (lastErrorStack == null) {
            lastErrorStack = new StackFrame[0];
        }
        ErrorType lastErrorType = this.devSupportManager.getLastErrorType();
        if (lastErrorType == null) {
            throw new IllegalStateException("Required value was null.");
        }
        DevSupportManager devSupportManager = this.devSupportManager;
        Pair<String, StackFrame[]> pairCreate = Pair.create(lastErrorTitle, lastErrorStack);
        AbstractC2855l.f(pairCreate, "create(...)");
        Pair<String, StackFrame[]> pairProcessErrorCustomizers = devSupportManager.processErrorCustomizers(pairCreate);
        if (pairProcessErrorCustomizers == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object first = pairProcessErrorCustomizers.first;
        AbstractC2855l.f(first, "first");
        Object second = pairProcessErrorCustomizers.second;
        AbstractC2855l.f(second, "second");
        setExceptionDetails((String) first, (StackFrame[]) second);
        RedBoxHandler redBoxHandler = this.devSupportManager.getRedBoxHandler();
        if (redBoxHandler != null) {
            redBoxHandler.handleRedbox(lastErrorTitle, lastErrorStack, lastErrorType);
            resetReporting();
        }
    }

    public final void resetReporting() {
        RedBoxHandler redBoxHandler = this.redBoxHandler;
        if (redBoxHandler == null || redBoxHandler.isReportEnabled()) {
            this.isReporting = false;
            TextView textView = this.reportTextView;
            Button button = null;
            if (textView == null) {
                AbstractC2855l.y("reportTextView");
                textView = null;
            }
            textView.setVisibility(8);
            ProgressBar progressBar = this.loadingIndicator;
            if (progressBar == null) {
                AbstractC2855l.y("loadingIndicator");
                progressBar = null;
            }
            progressBar.setVisibility(8);
            View view = this.lineSeparator;
            if (view == null) {
                AbstractC2855l.y("lineSeparator");
                view = null;
            }
            view.setVisibility(8);
            Button button2 = this.reportButton;
            if (button2 == null) {
                AbstractC2855l.y("reportButton");
                button2 = null;
            }
            button2.setVisibility(0);
            Button button3 = this.reportButton;
            if (button3 == null) {
                AbstractC2855l.y("reportButton");
            } else {
                button = button3;
            }
            button.setEnabled(true);
        }
    }

    public final void setExceptionDetails(String title, StackFrame[] stack) {
        AbstractC2855l.g(title, "title");
        AbstractC2855l.g(stack, "stack");
        ListView listView = this.stackView;
        if (listView == null) {
            AbstractC2855l.y("stackView");
            listView = null;
        }
        listView.setAdapter((ListAdapter) new StackAdapter(title, stack));
    }
}
