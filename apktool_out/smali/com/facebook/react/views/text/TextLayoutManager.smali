.class public final Lcom/facebook/react/views/text/TextLayoutManager;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;,
        Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;,
        Lcom/facebook/react/views/text/TextLayoutManager$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008%\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u0004\u009b\u0001\u009c\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J?\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J)\u0010!\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J3\u0010%\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0008\u0010$\u001a\u0004\u0018\u00010#2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002\u00a2\u0006\u0004\u0008%\u0010&Js\u0010:\u001a\u0002092\u0006\u0010\'\u001a\u00020\r2\u0008\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\n2\u0008\u00105\u001a\u0004\u0018\u0001042\u0006\u00106\u001a\u00020\n2\u0006\u00108\u001a\u000207H\u0002\u00a2\u0006\u0004\u0008:\u0010;J\'\u0010>\u001a\u00020\u001e2\u0006\u00108\u001a\u0002072\u0006\u0010=\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008>\u0010?J\u001f\u0010@\u001a\u0002072\u0006\u0010=\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008@\u0010AJ\u001f\u0010B\u001a\u0002072\u0006\u0010=\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008B\u0010AJQ\u0010F\u001a\u0002092\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020,2\u0008\u0010$\u001a\u0004\u0018\u00010#H\u0002\u00a2\u0006\u0004\u0008F\u0010GJO\u0010:\u001a\u0002092\u0006\u0010\'\u001a\u00020\r2\u0006\u00108\u001a\u0002072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020,H\u0002\u00a2\u0006\u0004\u0008:\u0010HJQ\u0010K\u001a\u00020J2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020I2\u0006\u0010C\u001a\u00020I2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020,2\u0008\u0010$\u001a\u0004\u0018\u00010#H\u0007\u00a2\u0006\u0004\u0008K\u0010LJw\u0010O\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\r2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020,2\u0006\u0010M\u001a\u00020*2\u0006\u0010N\u001a\u00020\n2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\n2\u0006\u00108\u001a\u000207H\u0007\u00a2\u0006\u0004\u0008O\u0010PJ[\u0010T\u001a\u00020S2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020,2\u0008\u0010$\u001a\u0004\u0018\u00010#2\u0008\u0010R\u001a\u0004\u0018\u00010QH\u0007\u00a2\u0006\u0004\u0008T\u0010UJ7\u0010W\u001a\u00020Q2\u0006\u0010V\u001a\u00020J2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020,H\u0007\u00a2\u0006\u0004\u0008W\u0010XJ7\u0010[\u001a\u00020*2\u0006\u0010Y\u001a\u0002092\u0006\u0010C\u001a\u00020I2\u0006\u0010D\u001a\u00020*2\u0006\u0010Z\u001a\u00020,2\u0006\u0010N\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008[\u0010\\J\u001f\u0010]\u001a\u00020\n2\u0006\u0010Y\u001a\u0002092\u0006\u0010N\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008]\u0010^J7\u0010a\u001a\u00020*2\u0006\u0010Y\u001a\u0002092\u0006\u0010\'\u001a\u00020_2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010`\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008a\u0010bJ/\u0010c\u001a\u00020*2\u0006\u0010Y\u001a\u0002092\u0006\u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020,2\u0006\u0010`\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008c\u0010dJG\u0010j\u001a\u00020\n2\u0006\u0010Y\u001a\u0002092\u0006\u0010\'\u001a\u00020_2\u0006\u0010e\u001a\u00020*2\u0006\u0010`\u001a\u00020\n2\u0006\u0010f\u001a\u00020\n2\u0006\u0010g\u001a\u00020*2\u0006\u0010i\u001a\u00020hH\u0002\u00a2\u0006\u0004\u0008j\u0010kJA\u0010m\u001a\u00020l2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010D\u001a\u00020*2\u0008\u0010$\u001a\u0004\u0018\u00010#H\u0007\u00a2\u0006\u0004\u0008m\u0010nJ!\u0010o\u001a\u0004\u0018\u00010(2\u0006\u0010\'\u001a\u00020\r2\u0006\u00108\u001a\u000207H\u0002\u00a2\u0006\u0004\u0008o\u0010pJ\u001d\u0010s\u001a\u00020\u001e2\u0006\u0010q\u001a\u00020\n2\u0006\u0010r\u001a\u00020\r\u00a2\u0006\u0004\u0008s\u0010tJ\u0015\u0010u\u001a\u00020\u001e2\u0006\u0010q\u001a\u00020\n\u00a2\u0006\u0004\u0008u\u0010vJ\u0015\u0010w\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008w\u0010xJ\'\u0010y\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010$\u001a\u0004\u0018\u00010#\u00a2\u0006\u0004\u0008y\u0010zR\u0014\u0010{\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008{\u0010|R\u0014\u0010}\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008}\u0010|R\u0014\u0010~\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008~\u0010|R\u0014\u0010\u007f\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u007f\u0010|R\u0016\u0010\u0080\u0001\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0007\n\u0005\u0008\u0080\u0001\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0007\n\u0005\u0008\u0081\u0001\u0010|R\u0016\u0010\u0082\u0001\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0007\n\u0005\u0008\u0082\u0001\u0010|R\u0016\u0010\u0083\u0001\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0007\n\u0005\u0008\u0083\u0001\u0010|R\u0016\u0010\u0084\u0001\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0007\n\u0005\u0008\u0084\u0001\u0010|R\u0016\u0010\u0085\u0001\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0007\n\u0005\u0008\u0085\u0001\u0010|R\u0016\u0010\u0086\u0001\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0007\n\u0005\u0008\u0086\u0001\u0010|R\u0016\u0010\u0087\u0001\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0007\n\u0005\u0008\u0087\u0001\u0010|R\u0016\u0010\u0088\u0001\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0007\n\u0005\u0008\u0088\u0001\u0010|R\u0016\u0010\u0089\u0001\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0007\n\u0005\u0008\u0089\u0001\u0010|R\u0016\u0010\u008a\u0001\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0007\n\u0005\u0008\u008a\u0001\u0010|R\u0016\u0010\u008b\u0001\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0007\n\u0005\u0008\u008b\u0001\u0010|R\u0016\u0010\u008c\u0001\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0007\n\u0005\u0008\u008c\u0001\u0010|R\u0016\u0010\u008d\u0001\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0007\n\u0005\u0008\u008d\u0001\u0010|R\u0016\u0010\u008e\u0001\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0007\n\u0005\u0008\u008e\u0001\u0010|R\u0016\u0010\u008f\u0001\u001a\u00020\n8\u0006X\u0086T\u00a2\u0006\u0007\n\u0005\u0008\u008f\u0001\u0010|R\u0017\u0010\u0090\u0001\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0090\u0001\u0010\u0091\u0001R\u001e\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u0002070\u0092\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001R\u0017\u0010\u0095\u0001\u001a\u00020.8\u0002X\u0082T\u00a2\u0006\u0008\n\u0006\u0008\u0095\u0001\u0010\u0096\u0001R\u0017\u0010\u0097\u0001\u001a\u00020.8\u0002X\u0082T\u00a2\u0006\u0008\n\u0006\u0008\u0097\u0001\u0010\u0096\u0001R$\u0010\u0099\u0001\u001a\u000f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\u0098\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0099\u0001\u0010\u009a\u0001\u00a8\u0006\u009d\u0001"
    }
    d2 = {
        "Lcom/facebook/react/views/text/TextLayoutManager;",
        "",
        "<init>",
        "()V",
        "Lcom/facebook/react/common/mapbuffer/MapBuffer;",
        "attributedString",
        "",
        "getTextAlignmentAttr",
        "(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Ljava/lang/String;",
        "alignmentAttr",
        "",
        "getTextJustificationMode",
        "(Ljava/lang/String;)I",
        "Landroid/text/Spannable;",
        "spanned",
        "Landroid/text/Layout$Alignment;",
        "getTextAlignment",
        "(Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/Spannable;Ljava/lang/String;)Landroid/text/Layout$Alignment;",
        "getTextGravity",
        "(Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/Spannable;)I",
        "Landroid/content/Context;",
        "context",
        "fragments",
        "Landroid/text/SpannableStringBuilder;",
        "sb",
        "",
        "Lcom/facebook/react/views/text/internal/span/SetSpanOperation;",
        "ops",
        "",
        "outputReactTags",
        "Li7/B;",
        "buildSpannableFromFragments",
        "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/SpannableStringBuilder;Ljava/util/List;[I)V",
        "buildSpannableFromFragmentsOptimized",
        "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;[I)Landroid/text/Spannable;",
        "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;",
        "reactTextViewManagerCallback",
        "createSpannableFromAttributedString",
        "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;[I)Landroid/text/Spannable;",
        "text",
        "Landroid/text/BoringLayout$Metrics;",
        "boring",
        "",
        "width",
        "Lcom/facebook/yoga/p;",
        "widthYogaMeasureMode",
        "",
        "includeFontPadding",
        "textBreakStrategy",
        "hyphenationFrequency",
        "alignment",
        "justificationMode",
        "Landroid/text/TextUtils$TruncateAt;",
        "ellipsizeMode",
        "maxNumberOfLines",
        "Landroid/text/TextPaint;",
        "paint",
        "Landroid/text/Layout;",
        "createLayout",
        "(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/p;ZIILandroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;ILandroid/text/TextPaint;)Landroid/text/Layout;",
        "Lcom/facebook/react/views/text/TextAttributeProps;",
        "baseTextAttributes",
        "updateTextPaint",
        "(Landroid/text/TextPaint;Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)V",
        "scratchPaintWithAttributes",
        "(Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)Landroid/text/TextPaint;",
        "newPaintWithAttributes",
        "paragraphAttributes",
        "height",
        "heightYogaMeasureMode",
        "createLayoutForMeasurement",
        "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Layout;",
        "(Landroid/text/Spannable;Landroid/text/TextPaint;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)Landroid/text/Layout;",
        "Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;",
        "Lcom/facebook/react/views/text/PreparedLayout;",
        "createPreparedLayout",
        "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Lcom/facebook/react/views/text/PreparedLayout;",
        "minimumFontSizeAttr",
        "maximumNumberOfLines",
        "adjustSpannableFontToFit",
        "(Landroid/text/Spannable;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;FIZIILandroid/text/Layout$Alignment;ILandroid/text/TextPaint;)V",
        "",
        "attachmentsPositions",
        "",
        "measureText",
        "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;[F)J",
        "preparedLayout",
        "measurePreparedLayout",
        "(Lcom/facebook/react/views/text/PreparedLayout;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)[F",
        "layout",
        "heightMeasureMode",
        "getVerticalOffset",
        "(Landroid/text/Layout;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;FLcom/facebook/yoga/p;I)F",
        "calculateLineCount",
        "(Landroid/text/Layout;I)I",
        "Landroid/text/Spanned;",
        "calculatedLineCount",
        "calculateWidth",
        "(Landroid/text/Layout;Landroid/text/Spanned;FLcom/facebook/yoga/p;I)F",
        "calculateHeight",
        "(Landroid/text/Layout;FLcom/facebook/yoga/p;I)F",
        "calculatedWidth",
        "i",
        "verticalOffset",
        "Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;",
        "metrics",
        "nextAttachmentMetrics",
        "(Landroid/text/Layout;Landroid/text/Spanned;FIIFLcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;)I",
        "Lcom/facebook/react/bridge/WritableArray;",
        "measureLines",
        "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FFLcom/facebook/react/views/text/ReactTextViewManagerCallback;)Lcom/facebook/react/bridge/WritableArray;",
        "isBoring",
        "(Landroid/text/Spannable;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;",
        "reactTag",
        "sp",
        "setCachedSpannableForTag",
        "(ILandroid/text/Spannable;)V",
        "deleteCachedSpannableForTag",
        "(I)V",
        "isRTL",
        "(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Z",
        "getOrCreateSpannableForText",
        "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;",
        "AS_KEY_HASH",
        "I",
        "AS_KEY_STRING",
        "AS_KEY_FRAGMENTS",
        "AS_KEY_CACHE_ID",
        "AS_KEY_BASE_ATTRIBUTES",
        "FR_KEY_STRING",
        "FR_KEY_REACT_TAG",
        "FR_KEY_IS_ATTACHMENT",
        "FR_KEY_WIDTH",
        "FR_KEY_HEIGHT",
        "FR_KEY_TEXT_ATTRIBUTES",
        "PA_KEY_MAX_NUMBER_OF_LINES",
        "PA_KEY_ELLIPSIZE_MODE",
        "PA_KEY_TEXT_BREAK_STRATEGY",
        "PA_KEY_ADJUST_FONT_SIZE_TO_FIT",
        "PA_KEY_INCLUDE_FONT_PADDING",
        "PA_KEY_HYPHENATION_FREQUENCY",
        "PA_KEY_MINIMUM_FONT_SIZE",
        "PA_KEY_MAXIMUM_FONT_SIZE",
        "PA_KEY_TEXT_ALIGN_VERTICAL",
        "TAG",
        "Ljava/lang/String;",
        "Ljava/lang/ThreadLocal;",
        "textPaintInstance",
        "Ljava/lang/ThreadLocal;",
        "DEFAULT_INCLUDE_FONT_PADDING",
        "Z",
        "DEFAULT_ADJUST_FONT_SIZE_TO_FIT",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "tagToSpannableCache",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "FragmentAttributes",
        "AttachmentMetrics",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final AS_KEY_BASE_ATTRIBUTES:I = 0x4

.field public static final AS_KEY_CACHE_ID:I = 0x3

.field public static final AS_KEY_FRAGMENTS:I = 0x2

.field public static final AS_KEY_HASH:I = 0x0

.field public static final AS_KEY_STRING:I = 0x1

.field private static final DEFAULT_ADJUST_FONT_SIZE_TO_FIT:Z = false

.field private static final DEFAULT_INCLUDE_FONT_PADDING:Z = true

.field public static final FR_KEY_HEIGHT:I = 0x4

.field public static final FR_KEY_IS_ATTACHMENT:I = 0x2

.field public static final FR_KEY_REACT_TAG:I = 0x1

.field public static final FR_KEY_STRING:I = 0x0

.field public static final FR_KEY_TEXT_ATTRIBUTES:I = 0x5

.field public static final FR_KEY_WIDTH:I = 0x3

.field public static final INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

.field public static final PA_KEY_ADJUST_FONT_SIZE_TO_FIT:I = 0x3

.field public static final PA_KEY_ELLIPSIZE_MODE:I = 0x1

.field public static final PA_KEY_HYPHENATION_FREQUENCY:I = 0x5

.field public static final PA_KEY_INCLUDE_FONT_PADDING:I = 0x4

.field public static final PA_KEY_MAXIMUM_FONT_SIZE:I = 0x7

.field public static final PA_KEY_MAX_NUMBER_OF_LINES:I = 0x0

.field public static final PA_KEY_MINIMUM_FONT_SIZE:I = 0x6

.field public static final PA_KEY_TEXT_ALIGN_VERTICAL:I = 0x8

.field public static final PA_KEY_TEXT_BREAK_STRATEGY:I = 0x2

.field private static final TAG:Ljava/lang/String;

.field private static final tagToSpannableCache:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Landroid/text/Spannable;",
            ">;"
        }
    .end annotation
.end field

.field private static final textPaintInstance:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Landroid/text/TextPaint;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/text/TextLayoutManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/text/TextLayoutManager;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    .line 7
    .line 8
    const-class v0, Lcom/facebook/react/views/text/TextLayoutManager;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "getSimpleName(...)"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->TAG:Ljava/lang/String;

    .line 20
    .line 21
    new-instance v0, Lcom/facebook/react/views/text/TextLayoutManager$textPaintInstance$1;

    .line 22
    .line 23
    invoke-direct {v0}, Lcom/facebook/react/views/text/TextLayoutManager$textPaintInstance$1;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->textPaintInstance:Ljava/lang/ThreadLocal;

    .line 27
    .line 28
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->tagToSpannableCache:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final adjustSpannableFontToFit(Landroid/text/Spannable;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;FIZIILandroid/text/Layout$Alignment;ILandroid/text/TextPaint;)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v13, p4

    move/from16 v14, p6

    move-object/from16 v12, p12

    const-string v0, "text"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "widthYogaMeasureMode"

    move-object/from16 v4, p2

    invoke-static {v4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heightYogaMeasureMode"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alignment"

    move-object/from16 v8, p10

    invoke-static {v8, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paint"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    invoke-direct {v0, v1, v12}, Lcom/facebook/react/views/text/TextLayoutManager;->isBoring(Landroid/text/Spannable;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;

    move-result-object v2

    const/4 v10, 0x0

    const/4 v11, -0x1

    move/from16 v3, p1

    move/from16 v5, p7

    move/from16 v6, p8

    move/from16 v7, p9

    move/from16 v9, p11

    .line 2
    invoke-direct/range {v0 .. v12}, Lcom/facebook/react/views/text/TextLayoutManager;->createLayout(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/p;ZIILandroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;ILandroid/text/TextPaint;)Landroid/text/Layout;

    move-result-object v0

    .line 3
    invoke-static/range {p5 .. p5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Lcom/facebook/react/uimanager/PixelUtil;->dpToPx(I)F

    move-result v3

    goto :goto_0

    :cond_0
    move/from16 v3, p5

    :goto_0
    float-to-int v15, v3

    .line 4
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v4, 0x0

    const-class v5, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    invoke-interface {v1, v4, v3, v5}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    .line 5
    invoke-static {v3}, Lkotlin/jvm/internal/b;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    move v6, v15

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    .line 6
    invoke-virtual {v7}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    goto :goto_1

    :cond_1
    move v3, v6

    :goto_2
    if-le v3, v15, :cond_7

    const/4 v7, -0x1

    const/4 v8, 0x1

    if-eq v14, v7, :cond_2

    if-eqz v14, :cond_2

    .line 7
    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    move-result v7

    if-gt v7, v14, :cond_4

    .line 8
    :cond_2
    sget-object v7, Lcom/facebook/yoga/p;->h:Lcom/facebook/yoga/p;

    if-eq v13, v7, :cond_3

    invoke-virtual {v0}, Landroid/text/Layout;->getHeight()I

    move-result v7

    int-to-float v7, v7

    cmpl-float v7, v7, p3

    if-gtz v7, :cond_4

    .line 9
    :cond_3
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-ne v7, v8, :cond_7

    invoke-virtual {v0, v4}, Landroid/text/Layout;->getLineWidth(I)F

    move-result v0

    cmpl-float v0, v0, p1

    if-lez v0, :cond_7

    .line 10
    :cond_4
    sget-object v0, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    invoke-virtual {v0, v8}, Lcom/facebook/react/uimanager/PixelUtil;->dpToPx(I)F

    move-result v0

    float-to-int v0, v0

    invoke-static {v8, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    sub-int v0, v3, v0

    int-to-float v3, v0

    int-to-float v7, v6

    div-float/2addr v3, v7

    .line 11
    invoke-virtual {v12}, Landroid/graphics/Paint;->getTextSize()F

    move-result v7

    mul-float/2addr v7, v3

    float-to-int v7, v7

    invoke-static {v7, v15}, Ljava/lang/Math;->max(II)I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v12, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 12
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    invoke-interface {v1, v4, v7, v5}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    .line 13
    invoke-static {v7}, Lkotlin/jvm/internal/b;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    .line 14
    new-instance v9, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    invoke-virtual {v8}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    move-result v10

    int-to-float v10, v10

    mul-float/2addr v10, v3

    float-to-int v10, v10

    invoke-static {v10, v15}, Ljava/lang/Math;->max(II)I

    move-result v10

    invoke-direct {v9, v10}, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;-><init>(I)V

    .line 15
    invoke-interface {v1, v8}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v10

    .line 16
    invoke-interface {v1, v8}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v11

    .line 17
    invoke-interface {v1, v8}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v4

    .line 18
    invoke-interface {v1, v9, v10, v11, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 19
    invoke-interface {v1, v8}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    const/4 v4, 0x0

    goto :goto_3

    :cond_5
    if-eqz v2, :cond_6

    .line 20
    sget-object v2, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    invoke-direct {v2, v1, v12}, Lcom/facebook/react/views/text/TextLayoutManager;->isBoring(Landroid/text/Spannable;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;

    move-result-object v2

    :cond_6
    move v3, v0

    .line 21
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    const/4 v10, 0x0

    const/4 v11, -0x1

    move-object/from16 v4, p2

    move/from16 v7, p9

    move-object/from16 v8, p10

    move/from16 v9, p11

    move/from16 v16, v3

    move-object/from16 v18, v5

    move/from16 v17, v6

    const/16 v19, 0x0

    move/from16 v3, p1

    move/from16 v5, p7

    move/from16 v6, p8

    invoke-direct/range {v0 .. v12}, Lcom/facebook/react/views/text/TextLayoutManager;->createLayout(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/p;ZIILandroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;ILandroid/text/TextPaint;)Landroid/text/Layout;

    move-result-object v0

    move-object/from16 v1, p0

    move-object/from16 v12, p12

    move/from16 v3, v16

    move/from16 v6, v17

    move-object/from16 v5, v18

    move/from16 v4, v19

    goto/16 :goto_2

    :cond_7
    return-void
.end method

.method private final buildSpannableFromFragments(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/SpannableStringBuilder;Ljava/util/List;[I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/react/common/mapbuffer/MapBuffer;",
            "Landroid/text/SpannableStringBuilder;",
            "Ljava/util/List<",
            "Lcom/facebook/react/views/text/internal/span/SetSpanOperation;",
            ">;[I)V"
        }
    .end annotation

    move-object/from16 v0, p4

    .line 1
    invoke-interface/range {p2 .. p2}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getCount()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_12

    move-object/from16 v4, p2

    .line 2
    invoke-interface {v4, v3}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move-result-object v5

    .line 3
    invoke-virtual/range {p3 .. p3}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v6

    .line 4
    sget-object v7, Lcom/facebook/react/views/text/TextAttributeProps;->Companion:Lcom/facebook/react/views/text/TextAttributeProps$Companion;

    const/4 v8, 0x5

    invoke-interface {v5, v8}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/facebook/react/views/text/TextAttributeProps$Companion;->fromMapBuffer(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Lcom/facebook/react/views/text/TextAttributeProps;

    move-result-object v7

    .line 5
    sget-object v8, Lcom/facebook/react/views/text/TextTransform;->Companion:Lcom/facebook/react/views/text/TextTransform$Companion;

    invoke-interface {v5, v2}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextTransform$ReactAndroid_release()Lcom/facebook/react/views/text/TextTransform;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Lcom/facebook/react/views/text/TextTransform$Companion;->apply(Ljava/lang/String;Lcom/facebook/react/views/text/TextTransform;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v9, p3

    .line 6
    invoke-virtual {v9, v8}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 7
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    const/4 v10, 0x1

    .line 8
    invoke-interface {v5, v10}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v11

    const/4 v12, -0x1

    if-eqz v11, :cond_0

    invoke-interface {v5, v10}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getInt(I)I

    move-result v11

    goto :goto_1

    :cond_0
    move v11, v12

    :goto_1
    const/4 v13, 0x2

    .line 9
    invoke-interface {v5, v13}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v14

    if-eqz v14, :cond_1

    invoke-interface {v5, v13}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getBoolean(I)Z

    move-result v13

    if-eqz v13, :cond_1

    const/4 v6, 0x3

    .line 10
    invoke-interface {v5, v6}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getDouble(I)D

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(D)F

    move-result v6

    const/4 v7, 0x4

    .line 11
    invoke-interface {v5, v7}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getDouble(I)D

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(D)F

    move-result v5

    .line 12
    new-instance v7, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    .line 13
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v8

    sub-int/2addr v8, v10

    .line 14
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v10

    .line 15
    new-instance v12, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;

    float-to-int v6, v6

    float-to-int v5, v5

    invoke-direct {v12, v11, v6, v5}, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;-><init>(III)V

    .line 16
    invoke-direct {v7, v8, v10, v12}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    .line 17
    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    :cond_1
    if-lt v8, v6, :cond_11

    .line 18
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getRole()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 19
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getRole()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;

    move-result-object v5

    sget-object v10, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;->LINK:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;

    if-ne v5, v10, :cond_4

    goto :goto_2

    .line 20
    :cond_2
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getAccessibilityRole()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;

    move-result-object v5

    .line 21
    sget-object v10, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;->LINK:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;

    if-ne v5, v10, :cond_4

    .line 22
    :goto_2
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enablePreparedTextLayout()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 23
    new-instance v5, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v10, Lcom/facebook/react/views/text/internal/span/ReactLinkSpan;

    invoke-direct {v10, v3}, Lcom/facebook/react/views/text/internal/span/ReactLinkSpan;-><init>(I)V

    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 24
    :cond_3
    new-instance v5, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v10, Lcom/facebook/react/views/text/internal/span/ReactClickableSpan;

    invoke-direct {v10, v11}, Lcom/facebook/react/views/text/internal/span/ReactClickableSpan;-><init>(I)V

    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    :cond_4
    :goto_3
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->isColorSet()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 26
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getColor()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_5

    .line 27
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    new-instance v10, Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;

    invoke-direct {v10, v5}, Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;-><init>(I)V

    .line 28
    new-instance v5, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    .line 29
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    :cond_5
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->isBackgroundColorSet()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 31
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getBackgroundColor()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_6

    .line 32
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    new-instance v10, Lcom/facebook/react/views/text/internal/span/ReactBackgroundColorSpan;

    invoke-direct {v10, v5}, Lcom/facebook/react/views/text/internal/span/ReactBackgroundColorSpan;-><init>(I)V

    .line 33
    new-instance v5, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    .line 34
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    :cond_6
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getOpacity()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_7

    .line 36
    new-instance v5, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v10, Lcom/facebook/react/views/text/internal/span/ReactOpacitySpan;

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getOpacity()F

    move-result v13

    invoke-direct {v10, v13}, Lcom/facebook/react/views/text/internal/span/ReactOpacitySpan;-><init>(F)V

    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    :cond_7
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getLetterSpacing()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_8

    .line 38
    new-instance v5, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v10, Lcom/facebook/react/views/text/internal/span/CustomLetterSpacingSpan;

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getLetterSpacing()F

    move-result v13

    invoke-direct {v10, v13}, Lcom/facebook/react/views/text/internal/span/CustomLetterSpacingSpan;-><init>(F)V

    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    .line 39
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    :cond_8
    new-instance v5, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v10, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontSize()I

    move-result v13

    invoke-direct {v10, v13}, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;-><init>(I)V

    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontStyle()I

    move-result v5

    if-ne v5, v12, :cond_9

    .line 42
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontWeight()I

    move-result v5

    if-ne v5, v12, :cond_9

    .line 43
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontFamily()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_a

    .line 44
    :cond_9
    new-instance v5, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    .line 45
    new-instance v12, Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;

    .line 46
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontStyle()I

    move-result v13

    .line 47
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontWeight()I

    move-result v14

    .line 48
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object v15

    .line 49
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontFamily()Ljava/lang/String;

    move-result-object v16

    .line 50
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v10

    const-string v2, "getAssets(...)"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v10

    .line 51
    invoke-direct/range {v12 .. v17}, Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;-><init>(IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V

    .line 52
    invoke-direct {v5, v6, v8, v12}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    .line 53
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    :cond_a
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->isUnderlineTextDecorationSet()Z

    move-result v2

    if-eqz v2, :cond_b

    .line 55
    new-instance v2, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v5, Lcom/facebook/react/views/text/internal/span/ReactUnderlineSpan;

    invoke-direct {v5}, Lcom/facebook/react/views/text/internal/span/ReactUnderlineSpan;-><init>()V

    invoke-direct {v2, v6, v8, v5}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    :cond_b
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->isLineThroughTextDecorationSet()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 57
    new-instance v2, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v5, Lcom/facebook/react/views/text/internal/span/ReactStrikethroughSpan;

    invoke-direct {v5}, Lcom/facebook/react/views/text/internal/span/ReactStrikethroughSpan;-><init>()V

    invoke-direct {v2, v6, v8, v5}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    :cond_c
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowOffsetDx()F

    move-result v2

    const/4 v5, 0x0

    cmpg-float v2, v2, v5

    if-nez v2, :cond_d

    .line 59
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowOffsetDy()F

    move-result v2

    cmpg-float v2, v2, v5

    if-nez v2, :cond_d

    .line 60
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowRadius()F

    move-result v2

    cmpg-float v2, v2, v5

    if-nez v2, :cond_d

    goto :goto_4

    .line 61
    :cond_d
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowColor()I

    move-result v2

    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    if-eqz v2, :cond_e

    .line 62
    new-instance v2, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    .line 63
    new-instance v5, Lcom/facebook/react/views/text/internal/span/ShadowStyleSpan;

    .line 64
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowOffsetDx()F

    move-result v10

    .line 65
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowOffsetDy()F

    move-result v12

    .line 66
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowRadius()F

    move-result v13

    .line 67
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowColor()I

    move-result v14

    .line 68
    invoke-direct {v5, v10, v12, v13, v14}, Lcom/facebook/react/views/text/internal/span/ShadowStyleSpan;-><init>(FFFI)V

    .line 69
    invoke-direct {v2, v6, v8, v5}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    .line 70
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    :cond_e
    :goto_4
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getLineHeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_f

    .line 72
    new-instance v2, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v5, Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;

    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getLineHeight()F

    move-result v7

    invoke-direct {v5, v7}, Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;-><init>(F)V

    invoke-direct {v2, v6, v8, v5}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    :cond_f
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enablePreparedTextLayout()Z

    move-result v2

    if-eqz v2, :cond_10

    .line 74
    new-instance v2, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v5, Lcom/facebook/react/views/text/internal/span/ReactFragmentIndexSpan;

    invoke-direct {v5, v3}, Lcom/facebook/react/views/text/internal/span/ReactFragmentIndexSpan;-><init>(I)V

    invoke-direct {v2, v6, v8, v5}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p5, :cond_11

    .line 75
    aput v11, p5, v3

    goto :goto_5

    .line 76
    :cond_10
    new-instance v2, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    new-instance v5, Lcom/facebook/react/views/text/internal/span/ReactTagSpan;

    invoke-direct {v5, v11}, Lcom/facebook/react/views/text/internal/span/ReactTagSpan;-><init>(I)V

    invoke-direct {v2, v6, v8, v5}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;-><init>(IILcom/facebook/react/views/text/internal/span/ReactSpan;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_11
    :goto_5
    add-int/lit8 v3, v3, 0x1

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_12
    return-void
.end method

.method private final buildSpannableFromFragmentsOptimized(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;[I)Landroid/text/Spannable;
    .locals 19

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-interface/range {p2 .. p2}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getCount()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface/range {p2 .. p2}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getCount()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    const/4 v5, -0x1

    .line 22
    if-ge v4, v2, :cond_4

    .line 23
    .line 24
    move-object/from16 v6, p2

    .line 25
    .line 26
    invoke-interface {v6, v4}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    sget-object v8, Lcom/facebook/react/views/text/TextAttributeProps;->Companion:Lcom/facebook/react/views/text/TextAttributeProps$Companion;

    .line 31
    .line 32
    const/4 v9, 0x5

    .line 33
    invoke-interface {v7, v9}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    invoke-virtual {v8, v9}, Lcom/facebook/react/views/text/TextAttributeProps$Companion;->fromMapBuffer(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Lcom/facebook/react/views/text/TextAttributeProps;

    .line 38
    .line 39
    .line 40
    move-result-object v11

    .line 41
    sget-object v8, Lcom/facebook/react/views/text/TextTransform;->Companion:Lcom/facebook/react/views/text/TextTransform$Companion;

    .line 42
    .line 43
    invoke-interface {v7, v3}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    invoke-virtual {v11}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextTransform$ReactAndroid_release()Lcom/facebook/react/views/text/TextTransform;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    invoke-virtual {v8, v9, v10}, Lcom/facebook/react/views/text/TextTransform$Companion;->apply(Ljava/lang/String;Lcom/facebook/react/views/text/TextTransform;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    new-instance v10, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;

    .line 59
    .line 60
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v12

    .line 64
    const/4 v8, 0x1

    .line 65
    invoke-interface {v7, v8}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    if-eqz v9, :cond_0

    .line 70
    .line 71
    invoke-interface {v7, v8}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getInt(I)I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    :cond_0
    move v13, v5

    .line 76
    const/4 v5, 0x2

    .line 77
    invoke-interface {v7, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-eqz v9, :cond_1

    .line 82
    .line 83
    invoke-interface {v7, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getBoolean(I)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_1

    .line 88
    .line 89
    move v14, v8

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    move v14, v3

    .line 92
    :goto_1
    const/4 v5, 0x3

    .line 93
    invoke-interface {v7, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    const-wide/high16 v15, 0x7ff8000000000000L    # Double.NaN

    .line 98
    .line 99
    if-eqz v8, :cond_2

    .line 100
    .line 101
    invoke-interface {v7, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getDouble(I)D

    .line 102
    .line 103
    .line 104
    move-result-wide v8

    .line 105
    goto :goto_2

    .line 106
    :cond_2
    move-wide v8, v15

    .line 107
    :goto_2
    const/4 v5, 0x4

    .line 108
    invoke-interface {v7, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 109
    .line 110
    .line 111
    move-result v17

    .line 112
    if-eqz v17, :cond_3

    .line 113
    .line 114
    invoke-interface {v7, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getDouble(I)D

    .line 115
    .line 116
    .line 117
    move-result-wide v15

    .line 118
    :cond_3
    move-wide/from16 v17, v15

    .line 119
    .line 120
    move-wide v15, v8

    .line 121
    invoke-direct/range {v10 .. v18}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;-><init>(Lcom/facebook/react/views/text/TextAttributeProps;IIZDD)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    add-int/lit8 v4, v4, 0x1

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_4
    new-instance v2, Landroid/text/SpannableString;

    .line 131
    .line 132
    invoke-direct {v2, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    move v1, v3

    .line 140
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-eqz v4, :cond_19

    .line 145
    .line 146
    add-int/lit8 v4, v3, 0x1

    .line 147
    .line 148
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    check-cast v6, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;

    .line 153
    .line 154
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getLength()I

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    add-int/2addr v7, v1

    .line 159
    if-nez v1, :cond_5

    .line 160
    .line 161
    const/16 v8, 0x12

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_5
    const/16 v8, 0x22

    .line 165
    .line 166
    :goto_4
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->isAttachment()Z

    .line 167
    .line 168
    .line 169
    move-result v9

    .line 170
    if-eqz v9, :cond_6

    .line 171
    .line 172
    new-instance v3, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;

    .line 173
    .line 174
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getReactTag()I

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getWidth()D

    .line 179
    .line 180
    .line 181
    move-result-wide v10

    .line 182
    invoke-static {v10, v11}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(D)F

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    float-to-int v10, v10

    .line 187
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getHeight()D

    .line 188
    .line 189
    .line 190
    move-result-wide v11

    .line 191
    invoke-static {v11, v12}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(D)F

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    float-to-int v6, v6

    .line 196
    invoke-direct {v3, v9, v10, v6}, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;-><init>(III)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v3, v1, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_9

    .line 203
    .line 204
    :cond_6
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getRole()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    if-eqz v9, :cond_7

    .line 213
    .line 214
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getRole()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;

    .line 219
    .line 220
    .line 221
    move-result-object v9

    .line 222
    sget-object v10, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;->LINK:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;

    .line 223
    .line 224
    if-ne v9, v10, :cond_9

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_7
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getAccessibilityRole()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    sget-object v10, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;->LINK:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;

    .line 236
    .line 237
    if-ne v9, v10, :cond_9

    .line 238
    .line 239
    :goto_5
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enablePreparedTextLayout()Z

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    if-eqz v9, :cond_8

    .line 244
    .line 245
    new-instance v9, Lcom/facebook/react/views/text/internal/span/ReactLinkSpan;

    .line 246
    .line 247
    invoke-direct {v9, v3}, Lcom/facebook/react/views/text/internal/span/ReactLinkSpan;-><init>(I)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v9, v1, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 251
    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_8
    new-instance v9, Lcom/facebook/react/views/text/internal/span/ReactClickableSpan;

    .line 255
    .line 256
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getReactTag()I

    .line 257
    .line 258
    .line 259
    move-result v10

    .line 260
    invoke-direct {v9, v10}, Lcom/facebook/react/views/text/internal/span/ReactClickableSpan;-><init>(I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v9, v1, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 264
    .line 265
    .line 266
    :cond_9
    :goto_6
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->isColorSet()Z

    .line 271
    .line 272
    .line 273
    move-result v9

    .line 274
    const/4 v10, 0x0

    .line 275
    if-eqz v9, :cond_b

    .line 276
    .line 277
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 278
    .line 279
    .line 280
    move-result-object v9

    .line 281
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getColor()Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    if-eqz v9, :cond_a

    .line 286
    .line 287
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 288
    .line 289
    .line 290
    move-result v9

    .line 291
    new-instance v11, Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;

    .line 292
    .line 293
    invoke-direct {v11, v9}, Lcom/facebook/react/views/text/internal/span/ReactForegroundColorSpan;-><init>(I)V

    .line 294
    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_a
    move-object v11, v10

    .line 298
    :goto_7
    invoke-virtual {v2, v11, v1, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 299
    .line 300
    .line 301
    :cond_b
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->isBackgroundColorSet()Z

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    if-eqz v9, :cond_d

    .line 310
    .line 311
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 312
    .line 313
    .line 314
    move-result-object v9

    .line 315
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getBackgroundColor()Ljava/lang/Integer;

    .line 316
    .line 317
    .line 318
    move-result-object v9

    .line 319
    if-eqz v9, :cond_c

    .line 320
    .line 321
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 322
    .line 323
    .line 324
    move-result v9

    .line 325
    new-instance v10, Lcom/facebook/react/views/text/internal/span/ReactBackgroundColorSpan;

    .line 326
    .line 327
    invoke-direct {v10, v9}, Lcom/facebook/react/views/text/internal/span/ReactBackgroundColorSpan;-><init>(I)V

    .line 328
    .line 329
    .line 330
    :cond_c
    invoke-virtual {v2, v10, v1, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 331
    .line 332
    .line 333
    :cond_d
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 334
    .line 335
    .line 336
    move-result-object v9

    .line 337
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getOpacity()F

    .line 338
    .line 339
    .line 340
    move-result v9

    .line 341
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    .line 342
    .line 343
    .line 344
    move-result v9

    .line 345
    if-nez v9, :cond_e

    .line 346
    .line 347
    new-instance v9, Lcom/facebook/react/views/text/internal/span/ReactOpacitySpan;

    .line 348
    .line 349
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 350
    .line 351
    .line 352
    move-result-object v10

    .line 353
    invoke-virtual {v10}, Lcom/facebook/react/views/text/TextAttributeProps;->getOpacity()F

    .line 354
    .line 355
    .line 356
    move-result v10

    .line 357
    invoke-direct {v9, v10}, Lcom/facebook/react/views/text/internal/span/ReactOpacitySpan;-><init>(F)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2, v9, v1, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 361
    .line 362
    .line 363
    :cond_e
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 364
    .line 365
    .line 366
    move-result-object v9

    .line 367
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getLetterSpacing()F

    .line 368
    .line 369
    .line 370
    move-result v9

    .line 371
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    .line 372
    .line 373
    .line 374
    move-result v9

    .line 375
    if-nez v9, :cond_f

    .line 376
    .line 377
    new-instance v9, Lcom/facebook/react/views/text/internal/span/CustomLetterSpacingSpan;

    .line 378
    .line 379
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 380
    .line 381
    .line 382
    move-result-object v10

    .line 383
    invoke-virtual {v10}, Lcom/facebook/react/views/text/TextAttributeProps;->getLetterSpacing()F

    .line 384
    .line 385
    .line 386
    move-result v10

    .line 387
    invoke-direct {v9, v10}, Lcom/facebook/react/views/text/internal/span/CustomLetterSpacingSpan;-><init>(F)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2, v9, v1, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 391
    .line 392
    .line 393
    :cond_f
    new-instance v9, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;

    .line 394
    .line 395
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 396
    .line 397
    .line 398
    move-result-object v10

    .line 399
    invoke-virtual {v10}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontSize()I

    .line 400
    .line 401
    .line 402
    move-result v10

    .line 403
    invoke-direct {v9, v10}, Lcom/facebook/react/views/text/internal/span/ReactAbsoluteSizeSpan;-><init>(I)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v9, v1, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 410
    .line 411
    .line 412
    move-result-object v9

    .line 413
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontStyle()I

    .line 414
    .line 415
    .line 416
    move-result v9

    .line 417
    if-ne v9, v5, :cond_10

    .line 418
    .line 419
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 420
    .line 421
    .line 422
    move-result-object v9

    .line 423
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontWeight()I

    .line 424
    .line 425
    .line 426
    move-result v9

    .line 427
    if-ne v9, v5, :cond_10

    .line 428
    .line 429
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 430
    .line 431
    .line 432
    move-result-object v9

    .line 433
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontFamily()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v9

    .line 437
    if-eqz v9, :cond_11

    .line 438
    .line 439
    :cond_10
    new-instance v10, Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;

    .line 440
    .line 441
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 442
    .line 443
    .line 444
    move-result-object v9

    .line 445
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontStyle()I

    .line 446
    .line 447
    .line 448
    move-result v11

    .line 449
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 450
    .line 451
    .line 452
    move-result-object v9

    .line 453
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontWeight()I

    .line 454
    .line 455
    .line 456
    move-result v12

    .line 457
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 458
    .line 459
    .line 460
    move-result-object v9

    .line 461
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontFeatureSettings()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v13

    .line 465
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 466
    .line 467
    .line 468
    move-result-object v9

    .line 469
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontFamily()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v14

    .line 473
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 474
    .line 475
    .line 476
    move-result-object v15

    .line 477
    const-string v9, "getAssets(...)"

    .line 478
    .line 479
    invoke-static {v15, v9}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    invoke-direct/range {v10 .. v15}, Lcom/facebook/react/views/text/internal/span/CustomStyleSpan;-><init>(IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v2, v10, v1, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 486
    .line 487
    .line 488
    :cond_11
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 489
    .line 490
    .line 491
    move-result-object v9

    .line 492
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->isUnderlineTextDecorationSet()Z

    .line 493
    .line 494
    .line 495
    move-result v9

    .line 496
    if-eqz v9, :cond_12

    .line 497
    .line 498
    new-instance v9, Lcom/facebook/react/views/text/internal/span/ReactUnderlineSpan;

    .line 499
    .line 500
    invoke-direct {v9}, Lcom/facebook/react/views/text/internal/span/ReactUnderlineSpan;-><init>()V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2, v9, v1, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 504
    .line 505
    .line 506
    :cond_12
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 507
    .line 508
    .line 509
    move-result-object v9

    .line 510
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->isLineThroughTextDecorationSet()Z

    .line 511
    .line 512
    .line 513
    move-result v9

    .line 514
    if-eqz v9, :cond_13

    .line 515
    .line 516
    new-instance v9, Lcom/facebook/react/views/text/internal/span/ReactStrikethroughSpan;

    .line 517
    .line 518
    invoke-direct {v9}, Lcom/facebook/react/views/text/internal/span/ReactStrikethroughSpan;-><init>()V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v2, v9, v1, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 522
    .line 523
    .line 524
    :cond_13
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 525
    .line 526
    .line 527
    move-result-object v9

    .line 528
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowOffsetDx()F

    .line 529
    .line 530
    .line 531
    move-result v9

    .line 532
    const/4 v10, 0x0

    .line 533
    cmpg-float v9, v9, v10

    .line 534
    .line 535
    if-nez v9, :cond_14

    .line 536
    .line 537
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 538
    .line 539
    .line 540
    move-result-object v9

    .line 541
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowOffsetDy()F

    .line 542
    .line 543
    .line 544
    move-result v9

    .line 545
    cmpg-float v9, v9, v10

    .line 546
    .line 547
    if-nez v9, :cond_14

    .line 548
    .line 549
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 550
    .line 551
    .line 552
    move-result-object v9

    .line 553
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowRadius()F

    .line 554
    .line 555
    .line 556
    move-result v9

    .line 557
    cmpg-float v9, v9, v10

    .line 558
    .line 559
    if-nez v9, :cond_14

    .line 560
    .line 561
    goto :goto_8

    .line 562
    :cond_14
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 563
    .line 564
    .line 565
    move-result-object v9

    .line 566
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowColor()I

    .line 567
    .line 568
    .line 569
    move-result v9

    .line 570
    invoke-static {v9}, Landroid/graphics/Color;->alpha(I)I

    .line 571
    .line 572
    .line 573
    move-result v9

    .line 574
    if-eqz v9, :cond_15

    .line 575
    .line 576
    new-instance v9, Lcom/facebook/react/views/text/internal/span/ShadowStyleSpan;

    .line 577
    .line 578
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 579
    .line 580
    .line 581
    move-result-object v10

    .line 582
    invoke-virtual {v10}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowOffsetDx()F

    .line 583
    .line 584
    .line 585
    move-result v10

    .line 586
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 587
    .line 588
    .line 589
    move-result-object v11

    .line 590
    invoke-virtual {v11}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowOffsetDy()F

    .line 591
    .line 592
    .line 593
    move-result v11

    .line 594
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 595
    .line 596
    .line 597
    move-result-object v12

    .line 598
    invoke-virtual {v12}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowRadius()F

    .line 599
    .line 600
    .line 601
    move-result v12

    .line 602
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 603
    .line 604
    .line 605
    move-result-object v13

    .line 606
    invoke-virtual {v13}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextShadowColor()I

    .line 607
    .line 608
    .line 609
    move-result v13

    .line 610
    invoke-direct {v9, v10, v11, v12, v13}, Lcom/facebook/react/views/text/internal/span/ShadowStyleSpan;-><init>(FFFI)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v2, v9, v1, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 614
    .line 615
    .line 616
    :cond_15
    :goto_8
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 617
    .line 618
    .line 619
    move-result-object v9

    .line 620
    invoke-virtual {v9}, Lcom/facebook/react/views/text/TextAttributeProps;->getLineHeight()F

    .line 621
    .line 622
    .line 623
    move-result v9

    .line 624
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    .line 625
    .line 626
    .line 627
    move-result v9

    .line 628
    if-nez v9, :cond_16

    .line 629
    .line 630
    new-instance v9, Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;

    .line 631
    .line 632
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getProps()Lcom/facebook/react/views/text/TextAttributeProps;

    .line 633
    .line 634
    .line 635
    move-result-object v10

    .line 636
    invoke-virtual {v10}, Lcom/facebook/react/views/text/TextAttributeProps;->getLineHeight()F

    .line 637
    .line 638
    .line 639
    move-result v10

    .line 640
    invoke-direct {v9, v10}, Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;-><init>(F)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v2, v9, v1, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 644
    .line 645
    .line 646
    :cond_16
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enablePreparedTextLayout()Z

    .line 647
    .line 648
    .line 649
    move-result v9

    .line 650
    if-eqz v9, :cond_17

    .line 651
    .line 652
    new-instance v9, Lcom/facebook/react/views/text/internal/span/ReactFragmentIndexSpan;

    .line 653
    .line 654
    invoke-direct {v9, v3}, Lcom/facebook/react/views/text/internal/span/ReactFragmentIndexSpan;-><init>(I)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v2, v9, v1, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 658
    .line 659
    .line 660
    if-eqz p3, :cond_18

    .line 661
    .line 662
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getReactTag()I

    .line 663
    .line 664
    .line 665
    move-result v1

    .line 666
    aput v1, p3, v3

    .line 667
    .line 668
    goto :goto_9

    .line 669
    :cond_17
    new-instance v3, Lcom/facebook/react/views/text/internal/span/ReactTagSpan;

    .line 670
    .line 671
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;->getReactTag()I

    .line 672
    .line 673
    .line 674
    move-result v6

    .line 675
    invoke-direct {v3, v6}, Lcom/facebook/react/views/text/internal/span/ReactTagSpan;-><init>(I)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v2, v3, v1, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 679
    .line 680
    .line 681
    :cond_18
    :goto_9
    move v3, v4

    .line 682
    move v1, v7

    .line 683
    goto/16 :goto_3

    .line 684
    .line 685
    :cond_19
    return-object v2
.end method

.method private final calculateHeight(Landroid/text/Layout;FLcom/facebook/yoga/p;I)F
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/yoga/p;->i:Lcom/facebook/yoga/p;

    .line 2
    .line 3
    if-eq p3, v0, :cond_1

    .line 4
    .line 5
    add-int/lit8 p4, p4, -0x1

    .line 6
    .line 7
    invoke-virtual {p1, p4}, Landroid/text/Layout;->getLineBottom(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    int-to-float p1, p1

    .line 12
    sget-object p4, Lcom/facebook/yoga/p;->j:Lcom/facebook/yoga/p;

    .line 13
    .line 14
    if-ne p3, p4, :cond_0

    .line 15
    .line 16
    cmpl-float p3, p1, p2

    .line 17
    .line 18
    if-lez p3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return p1

    .line 22
    :cond_1
    :goto_0
    return p2
.end method

.method private final calculateLineCount(Landroid/text/Layout;I)I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p2, v0, :cond_0

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/text/Layout;->getLineCount()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_0
    invoke-virtual {p1}, Landroid/text/Layout;->getLineCount()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
.end method

.method private final calculateWidth(Landroid/text/Layout;Landroid/text/Spanned;FLcom/facebook/yoga/p;I)F
    .locals 0

    .line 1
    sget-object p2, Lcom/facebook/yoga/p;->i:Lcom/facebook/yoga/p;

    .line 2
    .line 3
    if-ne p4, p2, :cond_0

    .line 4
    .line 5
    return p3

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroid/text/Layout;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    int-to-float p1, p1

    .line 11
    return p1
.end method

.method private final createLayout(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/p;ZIILandroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;ILandroid/text/TextPaint;)Landroid/text/Layout;
    .locals 3

    if-eqz p2, :cond_0

    .line 1
    sget-object v0, Lcom/facebook/yoga/p;->h:Lcom/facebook/yoga/p;

    if-eq p4, v0, :cond_1

    iget v0, p2, Landroid/text/BoringLayout$Metrics;->width:I

    int-to-float v0, v0

    float-to-double v1, p3

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    move p2, p5

    move-object p5, p8

    move-object p8, p12

    goto :goto_3

    .line 2
    :cond_1
    :goto_0
    sget-object p6, Lcom/facebook/yoga/p;->i:Lcom/facebook/yoga/p;

    if-ne p4, p6, :cond_2

    float-to-double p3, p3

    invoke-static {p3, p4}, Ljava/lang/Math;->floor(D)D

    move-result-wide p3

    double-to-float p3, p3

    float-to-int p3, p3

    :goto_1
    move p6, p3

    move-object p7, p8

    goto :goto_2

    .line 3
    :cond_2
    iget p3, p2, Landroid/text/BoringLayout$Metrics;->width:I

    goto :goto_1

    :goto_2
    const/high16 p8, 0x3f800000    # 1.0f

    const/4 p9, 0x0

    move-object p4, p1

    move-object p10, p2

    move p11, p5

    move-object p5, p12

    .line 4
    invoke-static/range {p4 .. p11}, Landroid/text/BoringLayout;->make(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFLandroid/text/BoringLayout$Metrics;Z)Landroid/text/BoringLayout;

    move-result-object p1

    const-string p2, "make(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 5
    :goto_3
    invoke-static {p1, p8}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    move-result p12

    float-to-double v0, p12

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float p12, v0

    float-to-int p12, p12

    .line 6
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    aget p4, v0, p4

    const/4 v0, 0x1

    if-eq p4, v0, :cond_4

    const/4 v1, 0x2

    if-eq p4, v1, :cond_3

    goto :goto_4

    :cond_3
    float-to-double p3, p3

    .line 7
    invoke-static {p3, p4}, Ljava/lang/Math;->floor(D)D

    move-result-wide p3

    double-to-float p3, p3

    float-to-int p3, p3

    invoke-static {p12, p3}, Ljava/lang/Math;->min(II)I

    move-result p12

    goto :goto_4

    :cond_4
    float-to-double p3, p3

    .line 8
    invoke-static {p3, p4}, Ljava/lang/Math;->floor(D)D

    move-result-wide p3

    double-to-float p3, p3

    float-to-int p12, p3

    :goto_4
    const/4 p3, 0x0

    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p4

    invoke-static {p1, p3, p4, p8, p12}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 10
    invoke-virtual {p1, p5}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    const/4 p3, 0x0

    const/high16 p4, 0x3f800000    # 1.0f

    .line 11
    invoke-virtual {p1, p3, p4}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 12
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 13
    invoke-virtual {p1, p6}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 14
    invoke-virtual {p1, p7}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    const-string p2, "setHyphenationFrequency(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, -0x1

    if-eq p11, p2, :cond_5

    if-eqz p11, :cond_5

    .line 15
    invoke-virtual {p1, p10}, Landroid/text/StaticLayout$Builder;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)Landroid/text/StaticLayout$Builder;

    move-result-object p2

    invoke-virtual {p2, p11}, Landroid/text/StaticLayout$Builder;->setMaxLines(I)Landroid/text/StaticLayout$Builder;

    .line 16
    :cond_5
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1a

    if-lt p2, p3, :cond_6

    .line 17
    invoke-static {p1, p9}, Lcom/facebook/react/views/text/b;->a(Landroid/text/StaticLayout$Builder;I)Landroid/text/StaticLayout$Builder;

    :cond_6
    const/16 p3, 0x1c

    if-lt p2, p3, :cond_7

    .line 18
    invoke-static {p1, v0}, Lcom/facebook/react/views/text/c;->a(Landroid/text/StaticLayout$Builder;Z)Landroid/text/StaticLayout$Builder;

    .line 19
    :cond_7
    invoke-virtual {p1}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    move-result-object p1

    const-string p2, "build(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final createLayout(Landroid/text/Spannable;Landroid/text/TextPaint;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)Landroid/text/Layout;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    .line 20
    invoke-direct/range {p0 .. p2}, Lcom/facebook/react/views/text/TextLayoutManager;->isBoring(Landroid/text/Spannable;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;

    move-result-object v3

    .line 21
    sget-object v4, Lcom/facebook/react/views/text/TextAttributeProps;->Companion:Lcom/facebook/react/views/text/TextAttributeProps$Companion;

    const/4 v5, 0x2

    .line 22
    invoke-interface {v2, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 23
    invoke-virtual {v4, v5}, Lcom/facebook/react/views/text/TextAttributeProps$Companion;->getTextBreakStrategy(Ljava/lang/String;)I

    move-result v14

    const/4 v5, 0x4

    .line 24
    invoke-interface {v2, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_0

    .line 25
    invoke-interface {v2, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getBoolean(I)Z

    move-result v5

    move v13, v5

    goto :goto_0

    :cond_0
    move v13, v7

    :goto_0
    const/4 v5, 0x5

    .line 26
    invoke-interface {v2, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 27
    invoke-virtual {v4, v5}, Lcom/facebook/react/views/text/TextAttributeProps$Companion;->getHyphenationFrequency(Ljava/lang/String;)I

    move-result v15

    const/4 v5, 0x3

    .line 28
    invoke-interface {v2, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v6

    const/4 v8, 0x0

    if-eqz v6, :cond_1

    .line 29
    invoke-interface {v2, v5}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getBoolean(I)Z

    move-result v5

    goto :goto_1

    :cond_1
    move v5, v8

    .line 30
    :goto_1
    invoke-interface {v2, v8}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 31
    invoke-interface {v2, v8}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getInt(I)I

    move-result v6

    :goto_2
    move v11, v6

    goto :goto_3

    :cond_2
    const/4 v6, -0x1

    goto :goto_2

    .line 32
    :goto_3
    invoke-interface {v2, v7}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 33
    invoke-interface {v2, v7}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 34
    invoke-virtual {v4, v6}, Lcom/facebook/react/views/text/TextAttributeProps$Companion;->getEllipsizeMode(Ljava/lang/String;)Landroid/text/TextUtils$TruncateAt;

    move-result-object v4

    goto :goto_4

    :cond_3
    const/4 v4, 0x0

    .line 35
    :goto_4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/TextLayoutManager;->getTextAlignmentAttr(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v7, p1

    .line 36
    invoke-direct {v0, v1, v7, v6}, Lcom/facebook/react/views/text/TextLayoutManager;->getTextAlignment(Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/Spannable;Ljava/lang/String;)Landroid/text/Layout$Alignment;

    move-result-object v8

    .line 37
    invoke-direct {v0, v6}, Lcom/facebook/react/views/text/TextLayoutManager;->getTextJustificationMode(Ljava/lang/String;)I

    move-result v9

    if-eqz v5, :cond_5

    const/4 v1, 0x6

    .line 38
    invoke-interface {v2, v1}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 39
    invoke-interface {v2, v1}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getDouble(I)D

    move-result-wide v1

    double-to-float v1, v1

    :goto_5
    move-object/from16 v16, v8

    goto :goto_6

    :cond_4
    const/high16 v1, 0x7fc00000    # Float.NaN

    goto :goto_5

    .line 40
    :goto_6
    sget-object v8, Lcom/facebook/yoga/p;->i:Lcom/facebook/yoga/p;

    move-object/from16 v18, p2

    move-object/from16 v10, p8

    move-object v6, v7

    move/from16 v17, v9

    move v12, v11

    move/from16 v7, p5

    move/from16 v9, p7

    move v11, v1

    .line 41
    invoke-static/range {v6 .. v18}, Lcom/facebook/react/views/text/TextLayoutManager;->adjustSpannableFontToFit(Landroid/text/Spannable;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;FIZIILandroid/text/Layout$Alignment;ILandroid/text/TextPaint;)V

    move v11, v12

    move-object/from16 v8, v16

    move/from16 v9, v17

    move-object/from16 v1, p1

    move-object v2, v3

    move-object v10, v4

    move v5, v13

    move v6, v14

    move v7, v15

    move-object/from16 v12, p2

    :goto_7
    move/from16 v3, p5

    move-object/from16 v4, p6

    goto :goto_8

    :cond_5
    move-object/from16 v1, p1

    move-object/from16 v12, p2

    move-object v2, v3

    move-object v10, v4

    move v5, v13

    move v6, v14

    move v7, v15

    goto :goto_7

    .line 42
    :goto_8
    invoke-direct/range {v0 .. v12}, Lcom/facebook/react/views/text/TextLayoutManager;->createLayout(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/p;ZIILandroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;ILandroid/text/TextPaint;)Landroid/text/Layout;

    move-result-object v1

    return-object v1
.end method

.method private final createLayoutForMeasurement(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Layout;
    .locals 9

    .line 1
    move-object/from16 v0, p8

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/react/views/text/TextLayoutManager;->getOrCreateSpannableForText(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v0, 0x3

    .line 8
    invoke-interface {p2, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const-class p1, Lcom/facebook/react/views/text/internal/span/ReactTextPaintHolderSpan;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-interface {v1, v0, v0, p1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, [Lcom/facebook/react/views/text/internal/span/ReactTextPaintHolderSpan;

    .line 22
    .line 23
    aget-object p1, p1, v0

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/facebook/react/views/text/internal/span/ReactTextPaintHolderSpan;->getTextPaint()Landroid/text/TextPaint;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_0
    move-object v0, p0

    .line 30
    move-object v2, p1

    .line 31
    move-object v3, p2

    .line 32
    move-object v4, p3

    .line 33
    move v5, p4

    .line 34
    move-object v6, p5

    .line 35
    move v7, p6

    .line 36
    move-object/from16 v8, p7

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    sget-object v0, Lcom/facebook/react/views/text/TextAttributeProps;->Companion:Lcom/facebook/react/views/text/TextAttributeProps$Companion;

    .line 40
    .line 41
    const/4 v2, 0x4

    .line 42
    invoke-interface {p2, v2}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v0, v2}, Lcom/facebook/react/views/text/TextAttributeProps$Companion;->fromMapBuffer(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Lcom/facebook/react/views/text/TextAttributeProps;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/views/text/TextLayoutManager;->scratchPaintWithAttributes(Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)Landroid/text/TextPaint;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    goto :goto_0

    .line 55
    :goto_1
    invoke-direct/range {v0 .. v8}, Lcom/facebook/react/views/text/TextLayoutManager;->createLayout(Landroid/text/Spannable;Landroid/text/TextPaint;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)Landroid/text/Layout;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1
.end method

.method public static final createPreparedLayout(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Lcom/facebook/react/views/text/PreparedLayout;
    .locals 10

    .line 1
    const-string v1, "context"

    .line 2
    .line 3
    invoke-static {p0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "attributedString"

    .line 7
    .line 8
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "paragraphAttributes"

    .line 12
    .line 13
    invoke-static {p2, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "widthYogaMeasureMode"

    .line 17
    .line 18
    invoke-static {p4, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "heightYogaMeasureMode"

    .line 22
    .line 23
    move-object/from16 v8, p6

    .line 24
    .line 25
    invoke-static {v8, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-virtual {p1, v1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->getCount()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    new-array v9, v4, [I

    .line 38
    .line 39
    sget-object v4, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    .line 40
    .line 41
    move-object/from16 v5, p7

    .line 42
    .line 43
    invoke-direct {v4, p0, v1, v5, v9}, Lcom/facebook/react/views/text/TextLayoutManager;->createSpannableFromAttributedString(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;[I)Landroid/text/Spannable;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    sget-object v5, Lcom/facebook/react/views/text/TextAttributeProps;->Companion:Lcom/facebook/react/views/text/TextAttributeProps$Companion;

    .line 48
    .line 49
    const/4 v7, 0x4

    .line 50
    invoke-virtual {p1, v7}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-virtual {v5, v7}, Lcom/facebook/react/views/text/TextAttributeProps$Companion;->fromMapBuffer(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Lcom/facebook/react/views/text/TextAttributeProps;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-direct {v4, v5, p0}, Lcom/facebook/react/views/text/TextLayoutManager;->newPaintWithAttributes(Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)Landroid/text/TextPaint;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    move-object v3, p1

    .line 63
    move v5, p3

    .line 64
    move-object v6, p4

    .line 65
    move v7, p5

    .line 66
    move-object v2, v0

    .line 67
    move-object v0, v4

    .line 68
    move-object v4, p2

    .line 69
    invoke-direct/range {v0 .. v8}, Lcom/facebook/react/views/text/TextLayoutManager;->createLayout(Landroid/text/Spannable;Landroid/text/TextPaint;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)Landroid/text/Layout;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-virtual {p2, v3}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->contains(I)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_0

    .line 79
    .line 80
    invoke-virtual {p2, v3}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->getInt(I)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    :goto_0
    move-object v2, p2

    .line 85
    move-object/from16 v4, p6

    .line 86
    .line 87
    move v5, v3

    .line 88
    move v3, p5

    .line 89
    goto :goto_1

    .line 90
    :cond_0
    const/4 v3, -0x1

    .line 91
    goto :goto_0

    .line 92
    :goto_1
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/views/text/TextLayoutManager;->getVerticalOffset(Landroid/text/Layout;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;FLcom/facebook/yoga/p;I)F

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    move v3, v5

    .line 97
    new-instance v2, Lcom/facebook/react/views/text/PreparedLayout;

    .line 98
    .line 99
    invoke-direct {v2, v1, v3, v0, v9}, Lcom/facebook/react/views/text/PreparedLayout;-><init>(Landroid/text/Layout;IF[I)V

    .line 100
    .line 101
    .line 102
    return-object v2
.end method

.method private final createSpannableFromAttributedString(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;[I)Landroid/text/Spannable;
    .locals 6

    .line 1
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableAndroidTextMeasurementOptimizations()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0, p1, p2, p4}, Lcom/facebook/react/views/text/TextLayoutManager;->buildSpannableFromFragmentsOptimized(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;[I)Landroid/text/Spannable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    invoke-interface {p3, p1}, Lcom/facebook/react/views/text/ReactTextViewManagerCallback;->onPostProcessSpannable(Landroid/text/Spannable;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object p1

    .line 17
    :cond_1
    new-instance v3, Landroid/text/SpannableStringBuilder;

    .line 18
    .line 19
    invoke-direct {v3}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v4, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    move-object v0, p0

    .line 28
    move-object v1, p1

    .line 29
    move-object v2, p2

    .line 30
    move-object v5, p4

    .line 31
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/views/text/TextLayoutManager;->buildSpannableFromFragments(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/SpannableStringBuilder;Ljava/util/List;[I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const/4 p2, 0x0

    .line 39
    :goto_0
    if-ge p2, p1, :cond_2

    .line 40
    .line 41
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result p4

    .line 45
    sub-int/2addr p4, p2

    .line 46
    add-int/lit8 p4, p4, -0x1

    .line 47
    .line 48
    invoke-interface {v4, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p4

    .line 52
    check-cast p4, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;

    .line 53
    .line 54
    invoke-virtual {p4, v3, p2}, Lcom/facebook/react/views/text/internal/span/SetSpanOperation;->execute(Landroid/text/SpannableStringBuilder;I)V

    .line 55
    .line 56
    .line 57
    add-int/lit8 p2, p2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    if-eqz p3, :cond_3

    .line 61
    .line 62
    invoke-interface {p3, v3}, Lcom/facebook/react/views/text/ReactTextViewManagerCallback;->onPostProcessSpannable(Landroid/text/Spannable;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    return-object v3
.end method

.method private final getTextAlignment(Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/Spannable;Ljava/lang/String;)Landroid/text/Layout$Alignment;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/text/TextLayoutManager;->isRTL(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget-object v0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-interface {v0, p2, v2, v1}, Landroid/text/TextDirectionHeuristic;->isRtl(Ljava/lang/CharSequence;II)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eq p1, p2, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    :cond_0
    if-eqz v2, :cond_1

    .line 20
    .line 21
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 25
    .line 26
    :goto_0
    if-nez p3, :cond_2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    const-string p2, "center"

    .line 30
    .line 31
    invoke-static {p3, p2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_3

    .line 36
    .line 37
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_3
    const-string p2, "right"

    .line 41
    .line 42
    invoke-static {p3, p2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_5

    .line 47
    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_4
    sget-object p1, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 54
    .line 55
    :cond_5
    :goto_1
    return-object p1
.end method

.method private final getTextAlignmentAttr(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-object v2

    .line 10
    :cond_0
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getCount()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v0, 0x5

    .line 26
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/16 v0, 0xc

    .line 31
    .line 32
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_1
    return-object v2
.end method

.method public static final getTextGravity(Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/Spannable;)I
    .locals 4

    .line 1
    const-string v0, "attributedString"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "spanned"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/facebook/react/views/text/TextLayoutManager;->getTextAlignmentAttr(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, p0, p1, v1}, Lcom/facebook/react/views/text/TextLayoutManager;->getTextAlignment(Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/Spannable;Ljava/lang/String;)Landroid/text/Layout$Alignment;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object v0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-interface {v0, p1, v1, v2}, Landroid/text/TextDirectionHeuristic;->isRtl(Ljava/lang/CharSequence;II)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    aget p0, v0, p0

    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    const/4 v1, 0x3

    .line 42
    const/4 v2, 0x1

    .line 43
    if-eq p0, v2, :cond_3

    .line 44
    .line 45
    const/4 v3, 0x2

    .line 46
    if-eq p0, v3, :cond_1

    .line 47
    .line 48
    if-ne p0, v1, :cond_0

    .line 49
    .line 50
    return v2

    .line 51
    :cond_0
    new-instance p0, Li7/m;

    .line 52
    .line 53
    invoke-direct {p0}, Li7/m;-><init>()V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_1
    if-eqz p1, :cond_2

    .line 58
    .line 59
    return v1

    .line 60
    :cond_2
    return v0

    .line 61
    :cond_3
    if-eqz p1, :cond_4

    .line 62
    .line 63
    return v0

    .line 64
    :cond_4
    return v1
.end method

.method private final getTextJustificationMode(Ljava/lang/String;)I
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    return p1

    .line 9
    :cond_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const-string v0, "justified"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_1
    const/4 p1, 0x0

    .line 22
    return p1
.end method

.method private final getVerticalOffset(Landroid/text/Layout;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;FLcom/facebook/yoga/p;I)F
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->contains(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->getString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p2, 0x0

    .line 15
    :goto_0
    const/4 v0, 0x0

    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    return v0

    .line 19
    :cond_1
    invoke-virtual {p1}, Landroid/text/Layout;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-direct {p0, p1, p5}, Lcom/facebook/react/views/text/TextLayoutManager;->calculateLineCount(Landroid/text/Layout;I)I

    .line 24
    .line 25
    .line 26
    move-result p5

    .line 27
    invoke-direct {p0, p1, p3, p4, p5}, Lcom/facebook/react/views/text/TextLayoutManager;->calculateHeight(Landroid/text/Layout;FLcom/facebook/yoga/p;I)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    int-to-float p3, v1

    .line 32
    cmpl-float p4, p3, p1

    .line 33
    .line 34
    if-lez p4, :cond_2

    .line 35
    .line 36
    return v0

    .line 37
    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result p4

    .line 41
    sparse-switch p4, :sswitch_data_0

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :sswitch_0
    const-string p1, "auto"

    .line 46
    .line 47
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :sswitch_1
    const-string p1, "top"

    .line 55
    .line 56
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    return v0

    .line 64
    :sswitch_2
    const-string p4, "center"

    .line 65
    .line 66
    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p4

    .line 70
    if-nez p4, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    sub-float/2addr p1, p3

    .line 74
    const/high16 p2, 0x40000000    # 2.0f

    .line 75
    .line 76
    div-float/2addr p1, p2

    .line 77
    return p1

    .line 78
    :sswitch_3
    const-string p4, "bottom"

    .line 79
    .line 80
    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    if-nez p4, :cond_5

    .line 85
    .line 86
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string p3, "Invalid textAlignVertical: "

    .line 92
    .line 93
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    const-string p2, "ReactNative"

    .line 104
    .line 105
    invoke-static {p2, p1}, Ld2/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return v0

    .line 109
    :cond_5
    sub-float/2addr p1, p3

    .line 110
    return p1

    .line 111
    :sswitch_data_0
    .sparse-switch
        -0x527265d5 -> :sswitch_3
        -0x514d33ab -> :sswitch_2
        0x1c155 -> :sswitch_1
        0x2dddaf -> :sswitch_0
    .end sparse-switch
.end method

.method private final isBoring(Landroid/text/Spannable;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p2}, Landroid/text/BoringLayout;->isBoring(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object v0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {p1, p2, v0, v1, v2}, Lcom/facebook/react/views/text/i;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;ZLandroid/text/BoringLayout$Metrics;)Landroid/text/BoringLayout$Metrics;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public static final measureLines(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FFLcom/facebook/react/views/text/ReactTextViewManagerCallback;)Lcom/facebook/react/bridge/WritableArray;
    .locals 10

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "attributedString"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "paragraphAttributes"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    .line 17
    .line 18
    sget-object v6, Lcom/facebook/yoga/p;->i:Lcom/facebook/yoga/p;

    .line 19
    .line 20
    move-object v8, v6

    .line 21
    move-object v2, p0

    .line 22
    move-object v3, p1

    .line 23
    move-object v4, p2

    .line 24
    move v5, p3

    .line 25
    move v7, p4

    .line 26
    move-object v9, p5

    .line 27
    invoke-direct/range {v1 .. v9}, Lcom/facebook/react/views/text/TextLayoutManager;->createLayoutForMeasurement(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Layout;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string p2, "getText(...)"

    .line 36
    .line 37
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1, p0, v2}, Lcom/facebook/react/views/text/FontMetricsUtil;->getFontMetrics(Ljava/lang/CharSequence;Landroid/text/Layout;Landroid/content/Context;)Lcom/facebook/react/bridge/WritableArray;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public static final measurePreparedLayout(Lcom/facebook/react/views/text/PreparedLayout;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)[F
    .locals 9

    .line 1
    const-string v0, "preparedLayout"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "widthYogaMeasureMode"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "heightYogaMeasureMode"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/facebook/react/views/text/PreparedLayout;->getLayout()Landroid/text/Layout;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "null cannot be cast to non-null type android.text.Spanned"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object v3, v0

    .line 30
    check-cast v3, Landroid/text/Spanned;

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/facebook/react/views/text/PreparedLayout;->getMaximumNumberOfLines()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    sget-object v1, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    .line 37
    .line 38
    invoke-direct {v1, v2, v0}, Lcom/facebook/react/views/text/TextLayoutManager;->calculateLineCount(Landroid/text/Layout;I)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    move v4, p1

    .line 43
    move v6, v5

    .line 44
    move-object v5, p2

    .line 45
    invoke-direct/range {v1 .. v6}, Lcom/facebook/react/views/text/TextLayoutManager;->calculateWidth(Landroid/text/Layout;Landroid/text/Spanned;FLcom/facebook/yoga/p;I)F

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    move v5, v6

    .line 50
    invoke-direct {v1, v2, p3, p4, v5}, Lcom/facebook/react/views/text/TextLayoutManager;->calculateHeight(Landroid/text/Layout;FLcom/facebook/yoga/p;I)F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    new-instance p2, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    sget-object p3, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    .line 60
    .line 61
    invoke-virtual {p3, v4}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 66
    .line 67
    .line 68
    move-result-object p4

    .line 69
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    invoke-virtual {p3, p1}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    new-instance v8, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;

    .line 84
    .line 85
    invoke-direct {v8}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;-><init>()V

    .line 86
    .line 87
    .line 88
    const/4 p1, 0x0

    .line 89
    move v6, p1

    .line 90
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 91
    .line 92
    .line 93
    move-result p3

    .line 94
    if-ge v6, p3, :cond_1

    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/facebook/react/views/text/PreparedLayout;->getVerticalOffset()F

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    invoke-direct/range {v1 .. v8}, Lcom/facebook/react/views/text/TextLayoutManager;->nextAttachmentMetrics(Landroid/text/Layout;Landroid/text/Spanned;FIIFLcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;)I

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    invoke-virtual {v8}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getWasFound()Z

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    if-eqz p3, :cond_0

    .line 109
    .line 110
    sget-object p3, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    .line 111
    .line 112
    invoke-virtual {v8}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getTop()F

    .line 113
    .line 114
    .line 115
    move-result p4

    .line 116
    invoke-virtual {p3, p4}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    .line 117
    .line 118
    .line 119
    move-result p4

    .line 120
    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 121
    .line 122
    .line 123
    move-result-object p4

    .line 124
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    invoke-virtual {v8}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getLeft()F

    .line 128
    .line 129
    .line 130
    move-result p4

    .line 131
    invoke-virtual {p3, p4}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    .line 132
    .line 133
    .line 134
    move-result p4

    .line 135
    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 136
    .line 137
    .line 138
    move-result-object p4

    .line 139
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    invoke-virtual {v8}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getWidth()F

    .line 143
    .line 144
    .line 145
    move-result p4

    .line 146
    invoke-virtual {p3, p4}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    .line 147
    .line 148
    .line 149
    move-result p4

    .line 150
    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 151
    .line 152
    .line 153
    move-result-object p4

    .line 154
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    invoke-virtual {v8}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getHeight()F

    .line 158
    .line 159
    .line 160
    move-result p4

    .line 161
    invoke-virtual {p3, p4}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    .line 162
    .line 163
    .line 164
    move-result p3

    .line 165
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    new-array p0, p0, [F

    .line 178
    .line 179
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 180
    .line 181
    .line 182
    move-result p3

    .line 183
    :goto_1
    if-ge p1, p3, :cond_2

    .line 184
    .line 185
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p4

    .line 189
    const-string v0, "get(...)"

    .line 190
    .line 191
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    check-cast p4, Ljava/lang/Number;

    .line 195
    .line 196
    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    .line 197
    .line 198
    .line 199
    move-result p4

    .line 200
    aput p4, p0, p1

    .line 201
    .line 202
    add-int/lit8 p1, p1, 0x1

    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_2
    return-object p0
.end method

.method public static final measureText(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;[F)J
    .locals 9

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "attributedString"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "paragraphAttributes"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "widthYogaMeasureMode"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "heightYogaMeasureMode"

    .line 22
    .line 23
    invoke-static {p6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    .line 27
    .line 28
    move-object v1, p0

    .line 29
    move-object v2, p1

    .line 30
    move-object v3, p2

    .line 31
    move v4, p3

    .line 32
    move-object v5, p4

    .line 33
    move v6, p5

    .line 34
    move-object v7, p6

    .line 35
    move-object/from16 v8, p7

    .line 36
    .line 37
    invoke-direct/range {v0 .. v8}, Lcom/facebook/react/views/text/TextLayoutManager;->createLayoutForMeasurement(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Layout;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const/4 p0, 0x0

    .line 42
    invoke-interface {p2, p0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-interface {p2, p0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getInt(I)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 p2, -0x1

    .line 54
    :goto_0
    invoke-virtual {p1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-string v2, "null cannot be cast to non-null type android.text.Spanned"

    .line 59
    .line 60
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object v3, v1

    .line 64
    check-cast v3, Landroid/text/Spanned;

    .line 65
    .line 66
    invoke-direct {v0, p1, p2}, Lcom/facebook/react/views/text/TextLayoutManager;->calculateLineCount(Landroid/text/Layout;I)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    move-object v2, p1

    .line 71
    move v4, p3

    .line 72
    move-object v5, p4

    .line 73
    move-object v1, v0

    .line 74
    invoke-direct/range {v1 .. v6}, Lcom/facebook/react/views/text/TextLayoutManager;->calculateWidth(Landroid/text/Layout;Landroid/text/Spanned;FLcom/facebook/yoga/p;I)F

    .line 75
    .line 76
    .line 77
    move-result p3

    .line 78
    move-object p2, v3

    .line 79
    move p4, v6

    .line 80
    invoke-direct {v0, p1, p5, p6, p4}, Lcom/facebook/react/views/text/TextLayoutManager;->calculateHeight(Landroid/text/Layout;FLcom/facebook/yoga/p;I)F

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz p8, :cond_2

    .line 85
    .line 86
    new-instance v1, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;

    .line 87
    .line 88
    invoke-direct {v1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;-><init>()V

    .line 89
    .line 90
    .line 91
    move v2, p0

    .line 92
    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-ge p0, v3, :cond_2

    .line 97
    .line 98
    sget-object v3, Lcom/facebook/react/views/text/TextLayoutManager;->INSTANCE:Lcom/facebook/react/views/text/TextLayoutManager;

    .line 99
    .line 100
    const/4 v4, 0x0

    .line 101
    move p5, p0

    .line 102
    move-object/from16 p7, v1

    .line 103
    .line 104
    move-object p0, v3

    .line 105
    move p6, v4

    .line 106
    invoke-direct/range {p0 .. p7}, Lcom/facebook/react/views/text/TextLayoutManager;->nextAttachmentMetrics(Landroid/text/Layout;Landroid/text/Spanned;FIIFLcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;)I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getWasFound()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_1

    .line 115
    .line 116
    sget-object v3, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    .line 117
    .line 118
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getTop()F

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    invoke-virtual {v3, v4}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    aput v4, p8, v2

    .line 127
    .line 128
    add-int/lit8 v4, v2, 0x1

    .line 129
    .line 130
    invoke-virtual {v1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getLeft()F

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    invoke-virtual {v3, v5}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    aput v3, p8, v4

    .line 139
    .line 140
    add-int/lit8 v2, v2, 0x2

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_2
    sget-object p0, Lcom/facebook/react/uimanager/PixelUtil;->INSTANCE:Lcom/facebook/react/uimanager/PixelUtil;

    .line 144
    .line 145
    invoke-virtual {p0, p3}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/PixelUtil;->pxToDp(F)F

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    invoke-static {p1, p0}, Lcom/facebook/yoga/q;->a(FF)J

    .line 154
    .line 155
    .line 156
    move-result-wide p0

    .line 157
    return-wide p0
.end method

.method private final newPaintWithAttributes(Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)Landroid/text/TextPaint;
    .locals 2

    .line 1
    new-instance v0, Landroid/text/TextPaint;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0, p1, p2}, Lcom/facebook/react/views/text/TextLayoutManager;->updateTextPaint(Landroid/text/TextPaint;Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private final nextAttachmentMetrics(Landroid/text/Layout;Landroid/text/Spanned;FIIFLcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;)I
    .locals 13

    .line 1
    move/from16 v1, p5

    .line 2
    .line 3
    move-object/from16 v2, p7

    .line 4
    .line 5
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    const-class v4, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;

    .line 10
    .line 11
    invoke-interface {p2, v1, v3, v4}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-interface {p2, v1, v3, v4}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, [Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;

    .line 20
    .line 21
    array-length v4, v1

    .line 22
    const/4 v5, 0x0

    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    invoke-virtual {v2, v5}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setWasFound(Z)V

    .line 26
    .line 27
    .line 28
    return v3

    .line 29
    :cond_0
    array-length v4, v1

    .line 30
    const/4 v6, 0x1

    .line 31
    if-ne v4, v6, :cond_1

    .line 32
    .line 33
    move v4, v6

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v4, v5

    .line 36
    :goto_0
    invoke-static {v4}, Lo3/a;->a(Z)V

    .line 37
    .line 38
    .line 39
    aget-object v1, v1, v5

    .line 40
    .line 41
    invoke-interface {p2, v1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-virtual {p1, v4}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    if-lez v8, :cond_2

    .line 54
    .line 55
    move v9, v6

    .line 56
    :goto_1
    move/from16 v8, p4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move v9, v5

    .line 60
    goto :goto_1

    .line 61
    :goto_2
    if-gt v7, v8, :cond_b

    .line 62
    .line 63
    if-eqz v9, :cond_3

    .line 64
    .line 65
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getLineStart(I)I

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getEllipsisStart(I)I

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    add-int/2addr v8, v9

    .line 74
    if-lt v4, v8, :cond_3

    .line 75
    .line 76
    goto/16 :goto_7

    .line 77
    .line 78
    :cond_3
    invoke-virtual {v1}, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;->getWidth()I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    int-to-float v8, v8

    .line 83
    invoke-virtual {v1}, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;->getHeight()I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    int-to-float v9, v9

    .line 88
    invoke-virtual {p1, v4}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 93
    .line 94
    .line 95
    move-result v11

    .line 96
    const/4 v12, -0x1

    .line 97
    if-ne v11, v12, :cond_4

    .line 98
    .line 99
    move v5, v6

    .line 100
    :cond_4
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->disableOldAndroidAttachmentMetricsWorkarounds()Z

    .line 101
    .line 102
    .line 103
    move-result v11

    .line 104
    if-nez v11, :cond_7

    .line 105
    .line 106
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    sub-int/2addr v11, v6

    .line 111
    if-ne v4, v11, :cond_7

    .line 112
    .line 113
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-lez v4, :cond_5

    .line 118
    .line 119
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getLineEnd(I)I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    sub-int/2addr v4, v6

    .line 124
    invoke-interface {p2, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    const/16 v4, 0xa

    .line 129
    .line 130
    if-ne v0, v4, :cond_5

    .line 131
    .line 132
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getLineMax(I)F

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    goto :goto_3

    .line 137
    :cond_5
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getLineWidth(I)F

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    :goto_3
    if-eqz v5, :cond_6

    .line 142
    .line 143
    sub-float v0, p3, v0

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_6
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getLineRight(I)F

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    goto :goto_5

    .line 151
    :cond_7
    if-ne v5, v10, :cond_8

    .line 152
    .line 153
    invoke-virtual {p1, v4}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    goto :goto_4

    .line 158
    :cond_8
    invoke-virtual {p1, v4}, Landroid/text/Layout;->getSecondaryHorizontal(I)F

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    :goto_4
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->disableOldAndroidAttachmentMetricsWorkarounds()Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-nez v4, :cond_9

    .line 167
    .line 168
    if-eqz v5, :cond_9

    .line 169
    .line 170
    if-nez v10, :cond_9

    .line 171
    .line 172
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getLineRight(I)F

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    sub-float/2addr v4, v0

    .line 177
    sub-float v0, p3, v4

    .line 178
    .line 179
    :cond_9
    if-eqz v10, :cond_a

    .line 180
    .line 181
    :goto_5
    sub-float/2addr v0, v8

    .line 182
    :cond_a
    :goto_6
    invoke-virtual {p1, v7}, Landroid/text/Layout;->getLineBaseline(I)I

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    int-to-float p1, p1

    .line 187
    sub-float/2addr p1, v9

    .line 188
    invoke-virtual {v2, p1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setTop(F)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v0}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setLeft(F)V

    .line 192
    .line 193
    .line 194
    goto :goto_8

    .line 195
    :cond_b
    :goto_7
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 196
    .line 197
    invoke-virtual {v2, p1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setTop(F)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, p1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setLeft(F)V

    .line 201
    .line 202
    .line 203
    :goto_8
    invoke-virtual {v2}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->getTop()F

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    add-float p1, p1, p6

    .line 208
    .line 209
    invoke-virtual {v2, p1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setTop(F)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v6}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setWasFound(Z)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v1}, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;->getWidth()I

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    int-to-float p1, p1

    .line 220
    invoke-virtual {v2, p1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setWidth(F)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Lcom/facebook/react/views/text/internal/span/TextInlineViewPlaceholderSpan;->getHeight()I

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    int-to-float p1, p1

    .line 228
    invoke-virtual {v2, p1}, Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;->setHeight(F)V

    .line 229
    .line 230
    .line 231
    return v3
.end method

.method private final scratchPaintWithAttributes(Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)Landroid/text/TextPaint;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->textPaintInstance:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/text/TextPaint;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 13
    .line 14
    .line 15
    const/high16 v1, 0x41400000    # 12.0f

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, v0, p1, p2}, Lcom/facebook/react/views/text/TextLayoutManager;->updateTextPaint(Landroid/text/TextPaint;Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string p2, "Required value was null."

    .line 35
    .line 36
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
.end method

.method private final updateTextPaint(Landroid/text/TextPaint;Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontSize()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    int-to-float v0, v0

    .line 13
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontStyle()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontWeight()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontFamily()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    :cond_1
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontStyle()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontWeight()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontFamily()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {p3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    const-string v4, "getAssets(...)"

    .line 51
    .line 52
    invoke-static {p3, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-static {v4, v0, v2, v3, p3}, Lcom/facebook/react/views/text/ReactTypefaceUtils;->applyStyles(Landroid/graphics/Typeface;IILjava/lang/String;Landroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontStyle()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eq v0, v1, :cond_4

    .line 68
    .line 69
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontStyle()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-virtual {p3}, Landroid/graphics/Typeface;->getStyle()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eq v0, v1, :cond_4

    .line 78
    .line 79
    invoke-virtual {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getFontStyle()I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    invoke-virtual {p3}, Landroid/graphics/Typeface;->getStyle()I

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    not-int p3, p3

    .line 88
    and-int/2addr p2, p3

    .line 89
    and-int/lit8 p3, p2, 0x1

    .line 90
    .line 91
    if-eqz p3, :cond_2

    .line 92
    .line 93
    const/4 p3, 0x1

    .line 94
    goto :goto_0

    .line 95
    :cond_2
    const/4 p3, 0x0

    .line 96
    :goto_0
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 97
    .line 98
    .line 99
    and-int/lit8 p2, p2, 0x2

    .line 100
    .line 101
    if-eqz p2, :cond_3

    .line 102
    .line 103
    const/high16 p2, -0x41800000    # -0.25f

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    const/4 p2, 0x0

    .line 107
    :goto_1
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 108
    .line 109
    .line 110
    :cond_4
    return-void
.end method


# virtual methods
.method public final deleteCachedSpannableForTag(I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->tagToSpannableCache:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final getOrCreateSpannableForText(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "attributedString"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    invoke-interface {p2, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p2, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getInt(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    sget-object p2, Lcom/facebook/react/views/text/TextLayoutManager;->tagToSpannableCache:Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    check-cast p1, Landroid/text/Spannable;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string p2, "Required value was null."

    .line 40
    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    const/4 v0, 0x2

    .line 46
    invoke-interface {p2, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/react/views/text/TextLayoutManager;->createSpannableFromAttributedString(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;[I)Landroid/text/Spannable;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1
.end method

.method public final isRTL(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Z
    .locals 3

    .line 1
    const-string v0, "attributedString"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getCount()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    return v2

    .line 26
    :cond_1
    invoke-interface {p1, v2}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v0, 0x5

    .line 31
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const/16 v0, 0x17

    .line 36
    .line 37
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    return v2

    .line 44
    :cond_2
    sget-object v1, Lcom/facebook/react/views/text/TextAttributeProps;->Companion:Lcom/facebook/react/views/text/TextAttributeProps$Companion;

    .line 45
    .line 46
    invoke-interface {p1, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v1, p1}, Lcom/facebook/react/views/text/TextAttributeProps$Companion;->getLayoutDirection(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    const/4 v0, 0x1

    .line 55
    if-ne p1, v0, :cond_3

    .line 56
    .line 57
    return v0

    .line 58
    :cond_3
    return v2
.end method

.method public final setCachedSpannableForTag(ILandroid/text/Spannable;)V
    .locals 1

    .line 1
    const-string v0, "sp"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->tagToSpannableCache:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void
.end method
