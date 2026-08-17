.class public abstract Lcom/facebook/react/devsupport/DevSupportManagerBase;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/devsupport/interfaces/DevSupportManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;,
        Lcom/facebook/react/devsupport/DevSupportManagerBase$Companion;,
        Lcom/facebook/react/devsupport/DevSupportManagerBase$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d8\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008&\u0018\u0000 \u009b\u00022\u00020\u0001:\u0004\u009c\u0002\u009b\u0002By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001b\u0010\u001f\u001a\u00020\u001e2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J7\u0010*\u001a\u00020\u001e2\u0008\u0010#\u001a\u0004\u0018\u00010\u00062\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0$2\u0006\u0010\'\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\u0008*\u0010+J\u0019\u0010.\u001a\u00020\u001e2\u0008\u0010-\u001a\u0004\u0018\u00010,H\u0002\u00a2\u0006\u0004\u0008.\u0010/J\u0017\u00101\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u00081\u00102J\u0017\u00103\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u00083\u00102J\u000f\u00104\u001a\u00020\u001eH\u0003\u00a2\u0006\u0004\u00084\u0010\"J7\u00105\u001a\u00020\u001e2\u0008\u0010#\u001a\u0004\u0018\u00010\u00062\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0$2\u0006\u0010\'\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\u00085\u0010+J\u001b\u00107\u001a\u00020\u001e2\n\u00106\u001a\u00060\u001bj\u0002`\u001cH\u0002\u00a2\u0006\u0004\u00087\u0010 J\u000f\u00108\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u00088\u0010\"J\u000f\u00109\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u00089\u0010\"J\u000f\u0010:\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008:\u0010\"J/\u0010A\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u00022\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008A\u0010BJ\u0017\u0010D\u001a\u00020C2\u0006\u0010;\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008D\u0010EJ\u0017\u0010F\u001a\u00020C2\u0006\u0010;\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008F\u0010EJ\u001b\u0010G\u001a\u00020\u001e2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0016\u00a2\u0006\u0004\u0008G\u0010 J!\u0010I\u001a\u00020\u001e2\u0008\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020HH\u0016\u00a2\u0006\u0004\u0008I\u0010JJ\u001f\u0010N\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u00062\u0006\u0010M\u001a\u00020LH\u0016\u00a2\u0006\u0004\u0008N\u0010OJ+\u0010R\u001a\u00020\u001e2\u0008\u0010#\u001a\u0004\u0018\u00010\u00062\u0008\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010\'\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008R\u0010SJ\u0017\u0010V\u001a\u00020\u001e2\u0006\u0010U\u001a\u00020TH\u0016\u00a2\u0006\u0004\u0008V\u0010WJ;\u0010Z\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020%0$0X2\u0018\u0010Y\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020%0$0XH\u0016\u00a2\u0006\u0004\u0008Z\u0010[J\u000f\u0010\\\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008\\\u0010\"J\u0019\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010]\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008_\u0010`J\u0019\u0010b\u001a\u00020\u001e2\u0008\u0010a\u001a\u0004\u0018\u00010^H\u0016\u00a2\u0006\u0004\u0008b\u0010cJ\u000f\u0010d\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008d\u0010\"J\u0017\u0010e\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,H\u0016\u00a2\u0006\u0004\u0008e\u0010/J\u0017\u0010f\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,H\u0016\u00a2\u0006\u0004\u0008f\u0010/J\u000f\u0010g\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008g\u0010hJ\u000f\u0010i\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008i\u0010\"J\u000f\u0010j\u001a\u00020\u001eH\u0005\u00a2\u0006\u0004\u0008j\u0010\"J\u000f\u0010k\u001a\u00020\u001eH\u0005\u00a2\u0006\u0004\u0008k\u0010\"J\u001d\u0010o\u001a\u00020\u001e2\u0006\u0010l\u001a\u00020\u00062\u0006\u0010n\u001a\u00020m\u00a2\u0006\u0004\u0008o\u0010pJ\u0017\u0010r\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020qH\u0016\u00a2\u0006\u0004\u0008r\u0010sJ!\u0010w\u001a\u0004\u0018\u00010u2\u0006\u0010t\u001a\u00020\u00062\u0006\u0010v\u001a\u00020uH\u0016\u00a2\u0006\u0004\u0008w\u0010xJ\u001f\u0010{\u001a\u00020\u001e2\u0006\u0010y\u001a\u00020\u00062\u0006\u0010n\u001a\u00020zH\u0016\u00a2\u0006\u0004\u0008{\u0010|J\u000f\u0010}\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008}\u0010\"J\u000f\u0010~\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008~\u0010\"J\u001a\u0010\u0080\u0001\u001a\u00020\u001e2\u0006\u0010\u007f\u001a\u00020\u0008H\u0016\u00a2\u0006\u0006\u0008\u0080\u0001\u0010\u0081\u0001J\u001b\u0010\u0083\u0001\u001a\u00020\u001e2\u0007\u0010\u0082\u0001\u001a\u00020\u0008H\u0016\u00a2\u0006\u0006\u0008\u0083\u0001\u0010\u0081\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\u001eH\u0016\u00a2\u0006\u0005\u0008\u0084\u0001\u0010\"J\u001c\u0010\u0087\u0001\u001a\u00020\u001e2\u0008\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0016\u00a2\u0006\u0006\u0008\u0087\u0001\u0010\u0088\u0001J\u001e\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00012\u0007\u0010\u0089\u0001\u001a\u00020\u0006H\u0016\u00a2\u0006\u0006\u0008\u008b\u0001\u0010\u008c\u0001J\u001c\u0010\u008e\u0001\u001a\u00020\u001e2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0005\u0008\u008e\u0001\u00102J$\u0010\u0091\u0001\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00062\u0008\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0016\u00a2\u0006\u0006\u0008\u0091\u0001\u0010\u0092\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\u001eH\u0016\u00a2\u0006\u0005\u0008\u0093\u0001\u0010\"J$\u0010\u0096\u0001\u001a\u00020\u001e2\u0007\u0010\u0094\u0001\u001a\u00020\u00062\u0007\u0010\u0095\u0001\u001a\u00020\u0006H\u0016\u00a2\u0006\u0006\u0008\u0096\u0001\u0010\u0097\u0001J\u001e\u0010\u009c\u0001\u001a\u00020\u001e2\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0000\u00a2\u0006\u0006\u0008\u009a\u0001\u0010\u009b\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004\u00a2\u0006\u000f\n\u0005\u0008\u0003\u0010\u009d\u0001\u001a\u0006\u0008\u009e\u0001\u0010\u009f\u0001R\u001a\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000f\n\u0005\u0008\u0005\u0010\u00a0\u0001\u001a\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001R(\u0010\u0007\u001a\u0004\u0018\u00010\u00068G@\u0006X\u0086\u000e\u00a2\u0006\u0016\n\u0005\u0008\u0007\u0010\u00a3\u0001\u001a\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001\"\u0005\u0008\u00a6\u0001\u00102R\u001f\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008\u000b\u0010\u00a7\u0001\u001a\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001R\u0017\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\r\u0010\u00aa\u0001R#\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0012\u0010\u00ab\u0001R\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0014\u0010\u00ac\u0001R)\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0005\u0008\u0016\u0010\u00ad\u0001\u001a\u0006\u0008\u00ae\u0001\u0010\u00af\u0001\"\u0006\u0008\u00b0\u0001\u0010\u00b1\u0001R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0018\u0010\u00b2\u0001R.\u0010\u00b3\u0001\u001a\u0004\u0018\u00010,2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010,8\u0006@BX\u0086\u000e\u00a2\u0006\u0010\n\u0006\u0008\u00b3\u0001\u0010\u00b4\u0001\u001a\u0006\u0008\u00b5\u0001\u0010\u00b6\u0001R\u001d\u0010\u00b8\u0001\u001a\u00030\u00b7\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00b8\u0001\u0010\u00b9\u0001\u001a\u0006\u0008\u00ba\u0001\u0010\u00bb\u0001R1\u0010\u00bc\u0001\u001a\u00020\u00082\u0007\u0010\u0095\u0001\u001a\u00020\u00088F@FX\u0086\u000e\u00a2\u0006\u0017\n\u0006\u0008\u00bc\u0001\u0010\u00bd\u0001\u001a\u0005\u0008\u00be\u0001\u0010h\"\u0006\u0008\u00bf\u0001\u0010\u0081\u0001R5\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u00062\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e\u00a2\u0006\u0017\n\u0006\u0008\u00c0\u0001\u0010\u00a3\u0001\u001a\u0006\u0008\u00c1\u0001\u0010\u00a5\u0001\"\u0005\u0008\u00c2\u0001\u00102R\u001d\u0010\u00c4\u0001\u001a\u00030\u00c3\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00c4\u0001\u0010\u00c5\u0001\u001a\u0006\u0008\u00c6\u0001\u0010\u00c7\u0001R*\u0010\u00c8\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0006\u0008\u00c8\u0001\u0010\u00a3\u0001\u001a\u0006\u0008\u00c9\u0001\u0010\u00a5\u0001\"\u0005\u0008\u00ca\u0001\u00102R1\u0010\u00cb\u0001\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00cb\u0001\u0010\u00cc\u0001\u001a\u0006\u0008\u00cd\u0001\u0010\u00ce\u0001\"\u0006\u0008\u00cf\u0001\u0010\u00d0\u0001R+\u0010\u00d1\u0001\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00d1\u0001\u0010\u00d2\u0001\u001a\u0006\u0008\u00d3\u0001\u0010\u00d4\u0001\"\u0006\u0008\u00d5\u0001\u0010\u00d6\u0001R)\u0010\u00d7\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00d7\u0001\u0010\u00d8\u0001\u001a\u0006\u0008\u00d9\u0001\u0010\u00da\u0001\"\u0006\u0008\u00db\u0001\u0010\u00dc\u0001R\u0018\u0010\u00de\u0001\u001a\u00030\u00dd\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00de\u0001\u0010\u00df\u0001R\u0017\u0010\u00e0\u0001\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e0\u0001\u0010\u00e1\u0001R5\u0010\u00e4\u0001\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020L0\u00e2\u0001j\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020L`\u00e3\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e4\u0001\u0010\u00e5\u0001R\u0017\u0010\u00e6\u0001\u001a\u00020u8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e6\u0001\u0010\u00e7\u0001R\u0017\u0010\u00e8\u0001\u001a\u00020u8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e8\u0001\u0010\u00e7\u0001R\u0018\u0010\u00ea\u0001\u001a\u00030\u00e9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ea\u0001\u0010\u00eb\u0001R\u001c\u0010\u00ec\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ec\u0001\u0010\u00ed\u0001R\u001c\u0010\u00ef\u0001\u001a\u0005\u0018\u00010\u00ee\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ef\u0001\u0010\u00f0\u0001R\u001c\u0010\u00f2\u0001\u001a\u0005\u0018\u00010\u00f1\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00f2\u0001\u0010\u00f3\u0001R\u0019\u0010\u00f4\u0001\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00f4\u0001\u0010\u00bd\u0001R\u0019\u0010\u00f5\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00f5\u0001\u0010\u00d8\u0001R\u0019\u0010\u00f6\u0001\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00f6\u0001\u0010\u00bd\u0001R\u0019\u0010\u00f7\u0001\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00f7\u0001\u0010\u00bd\u0001R\u0019\u0010\u00f8\u0001\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00f8\u0001\u0010\u00bd\u0001R\u0019\u0010\u00f9\u0001\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00f9\u0001\u0010\u00bd\u0001R\u001e\u0010\u00fb\u0001\u001a\t\u0012\u0004\u0012\u00020T0\u00fa\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00fb\u0001\u0010\u00fc\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0086\u0001\u0010\u00fd\u0001R\u001c\u0010\u00ff\u0001\u001a\u0005\u0018\u00010\u00fe\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ff\u0001\u0010\u0080\u0002R\u0019\u0010\u0081\u0002\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0081\u0002\u0010\u00bd\u0001R\u001c\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0082\u0002\u0010\u0083\u0002R(\u0010\u0084\u0002\u001a\u00020\u00088\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0017\n\u0006\u0008\u0084\u0002\u0010\u00bd\u0001\u001a\u0005\u0008\u0085\u0002\u0010h\"\u0006\u0008\u0086\u0002\u0010\u0081\u0001R(\u0010\u0087\u0002\u001a\u00020\u00088\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0017\n\u0006\u0008\u0087\u0002\u0010\u00bd\u0001\u001a\u0005\u0008\u0088\u0002\u0010h\"\u0006\u0008\u0089\u0002\u0010\u0081\u0001R\u0019\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u008a\u0002\u0010\u00a5\u0001R\u0017\u0010\u008d\u0002\u001a\u00020\u00068$X\u00a4\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u008c\u0002\u0010\u00a5\u0001R\u001a\u0010\u0091\u0002\u001a\u0005\u0018\u00010\u008e\u00028VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u008f\u0002\u0010\u0090\u0002R)\u0010\u0094\u0002\u001a\u00020\u00082\u0007\u0010\u00f8\u0001\u001a\u00020\u00088F@FX\u0086\u000e\u00a2\u0006\u000f\u001a\u0005\u0008\u0092\u0002\u0010h\"\u0006\u0008\u0093\u0002\u0010\u0081\u0001R\u0017\u0010\u0096\u0002\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0095\u0002\u0010\u00a5\u0001R\u0017\u0010\u0098\u0002\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0097\u0002\u0010\u00a5\u0001R\u0017\u0010\u009a\u0002\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0099\u0002\u0010\u00a5\u0001\u00a8\u0006\u009d\u0002"
    }
    d2 = {
        "Lcom/facebook/react/devsupport/DevSupportManagerBase;",
        "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;",
        "Landroid/content/Context;",
        "applicationContext",
        "Lcom/facebook/react/devsupport/ReactInstanceDevHelper;",
        "reactInstanceDevHelper",
        "",
        "jsAppBundleName",
        "",
        "enableOnCreate",
        "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;",
        "redBoxHandler",
        "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;",
        "devBundleDownloadListener",
        "",
        "minNumShakes",
        "",
        "Lcom/facebook/react/packagerconnection/RequestHandler;",
        "customPackagerCommandHandlers",
        "Lcom/facebook/react/common/SurfaceDelegateFactory;",
        "surfaceDelegateFactory",
        "Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;",
        "devLoadingViewManager",
        "Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;",
        "pausedInDebuggerOverlayManager",
        "<init>",
        "(Landroid/content/Context;Lcom/facebook/react/devsupport/ReactInstanceDevHelper;Ljava/lang/String;ZLcom/facebook/react/devsupport/interfaces/RedBoxHandler;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;ILjava/util/Map;Lcom/facebook/react/common/SurfaceDelegateFactory;Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;)V",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "e",
        "Li7/B;",
        "logJSException",
        "(Ljava/lang/Exception;)V",
        "hideDevOptionsDialog",
        "()V",
        "message",
        "",
        "Lcom/facebook/react/devsupport/interfaces/StackFrame;",
        "stack",
        "errorCookie",
        "Lcom/facebook/react/devsupport/interfaces/ErrorType;",
        "errorType",
        "showNewError",
        "(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;ILcom/facebook/react/devsupport/interfaces/ErrorType;)V",
        "Lcom/facebook/react/bridge/ReactContext;",
        "reactContext",
        "resetCurrentContext",
        "(Lcom/facebook/react/bridge/ReactContext;)V",
        "bundleUrl",
        "showDevLoadingViewForUrl",
        "(Ljava/lang/String;)V",
        "showSplitBundleDevLoadingView",
        "hideSplitBundleDevLoadingView",
        "updateLastErrorInfo",
        "cause",
        "reportBundleLoadingFailure",
        "startShakeDetector",
        "stopShakeDetector",
        "reload",
        "context",
        "Landroid/content/BroadcastReceiver;",
        "receiver",
        "Landroid/content/IntentFilter;",
        "filter",
        "exported",
        "compatRegisterReceiver",
        "(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Z)V",
        "Landroid/content/res/ColorStateList;",
        "safeGetDefaultTextColor",
        "(Landroid/content/Context;)Landroid/content/res/ColorStateList;",
        "safeGetTextColorSecondary",
        "handleException",
        "",
        "showNewJavaError",
        "(Ljava/lang/String;Ljava/lang/Throwable;)V",
        "optionName",
        "Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;",
        "optionHandler",
        "addCustomDevOption",
        "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;)V",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "details",
        "showNewJSError",
        "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;I)V",
        "Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;",
        "errorCustomizer",
        "registerErrorCustomizer",
        "(Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;)V",
        "Landroid/util/Pair;",
        "errorInfo",
        "processErrorCustomizers",
        "(Landroid/util/Pair;)Landroid/util/Pair;",
        "hideRedboxDialog",
        "appKey",
        "Landroid/view/View;",
        "createRootView",
        "(Ljava/lang/String;)Landroid/view/View;",
        "rootView",
        "destroyRootView",
        "(Landroid/view/View;)V",
        "showDevOptionsDialog",
        "onNewReactContextCreated",
        "onReactInstanceDestroyed",
        "hasUpToDateJSBundleInCache",
        "()Z",
        "reloadSettings",
        "showDevLoadingViewForRemoteJSEnabled",
        "hideDevLoadingView",
        "bundlePath",
        "Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;",
        "callback",
        "fetchSplitBundleAndCreateBundleLoader",
        "(Ljava/lang/String;Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;)V",
        "Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;",
        "isPackagerRunning",
        "(Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V",
        "resourceURL",
        "Ljava/io/File;",
        "outputFile",
        "downloadBundleResourceFromUrlSync",
        "(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;",
        "bundleURL",
        "Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;",
        "reloadJSFromServer",
        "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;)V",
        "startInspector",
        "stopInspector",
        "isHotModuleReplacementEnabled",
        "setHotModuleReplacementEnabled",
        "(Z)V",
        "isFpsDebugEnabled",
        "setFpsDebugEnabled",
        "toggleElementInspector",
        "Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;",
        "packagerLocationCustomizer",
        "setPackagerLocationCustomizer",
        "(Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;)V",
        "moduleName",
        "Lcom/facebook/react/common/SurfaceDelegate;",
        "createSurfaceDelegate",
        "(Ljava/lang/String;)Lcom/facebook/react/common/SurfaceDelegate;",
        "panel",
        "openDebugger",
        "Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;",
        "listener",
        "showPausedInDebuggerOverlay",
        "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;)V",
        "hidePausedInDebuggerOverlay",
        "name",
        "value",
        "setAdditionalOptionForPackager",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Lcom/facebook/react/devsupport/interfaces/TracingStateProvider;",
        "provider",
        "setTracingStateProvider$ReactAndroid_release",
        "(Lcom/facebook/react/devsupport/interfaces/TracingStateProvider;)V",
        "setTracingStateProvider",
        "Landroid/content/Context;",
        "getApplicationContext",
        "()Landroid/content/Context;",
        "Lcom/facebook/react/devsupport/ReactInstanceDevHelper;",
        "getReactInstanceDevHelper",
        "()Lcom/facebook/react/devsupport/ReactInstanceDevHelper;",
        "Ljava/lang/String;",
        "getJSAppBundleName",
        "()Ljava/lang/String;",
        "setJsAppBundleName",
        "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;",
        "getRedBoxHandler",
        "()Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;",
        "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;",
        "Ljava/util/Map;",
        "Lcom/facebook/react/common/SurfaceDelegateFactory;",
        "Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;",
        "getDevLoadingViewManager",
        "()Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;",
        "setDevLoadingViewManager",
        "(Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;)V",
        "Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;",
        "currentReactContext",
        "Lcom/facebook/react/bridge/ReactContext;",
        "getCurrentReactContext",
        "()Lcom/facebook/react/bridge/ReactContext;",
        "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;",
        "devSettings",
        "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;",
        "getDevSettings",
        "()Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;",
        "shakeGestureEnabled",
        "Z",
        "getShakeGestureEnabled",
        "setShakeGestureEnabled",
        "bundleFilePath",
        "getBundleFilePath",
        "setBundleFilePath",
        "Lcom/facebook/react/devsupport/DevServerHelper;",
        "devServerHelper",
        "Lcom/facebook/react/devsupport/DevServerHelper;",
        "getDevServerHelper",
        "()Lcom/facebook/react/devsupport/DevServerHelper;",
        "lastErrorTitle",
        "getLastErrorTitle",
        "setLastErrorTitle",
        "lastErrorStack",
        "[Lcom/facebook/react/devsupport/interfaces/StackFrame;",
        "getLastErrorStack",
        "()[Lcom/facebook/react/devsupport/interfaces/StackFrame;",
        "setLastErrorStack",
        "([Lcom/facebook/react/devsupport/interfaces/StackFrame;)V",
        "lastErrorType",
        "Lcom/facebook/react/devsupport/interfaces/ErrorType;",
        "getLastErrorType",
        "()Lcom/facebook/react/devsupport/interfaces/ErrorType;",
        "setLastErrorType",
        "(Lcom/facebook/react/devsupport/interfaces/ErrorType;)V",
        "lastErrorCookie",
        "I",
        "getLastErrorCookie",
        "()I",
        "setLastErrorCookie",
        "(I)V",
        "Lcom/facebook/react/common/ShakeDetector;",
        "shakeDetector",
        "Lcom/facebook/react/common/ShakeDetector;",
        "reloadAppBroadcastReceiver",
        "Landroid/content/BroadcastReceiver;",
        "Ljava/util/LinkedHashMap;",
        "Lkotlin/collections/LinkedHashMap;",
        "customDevOptions",
        "Ljava/util/LinkedHashMap;",
        "jsBundleDownloadedFile",
        "Ljava/io/File;",
        "jsSplitBundlesDir",
        "Lcom/facebook/react/bridge/DefaultJSExceptionHandler;",
        "defaultJSExceptionHandler",
        "Lcom/facebook/react/bridge/DefaultJSExceptionHandler;",
        "redBoxSurfaceDelegate",
        "Lcom/facebook/react/common/SurfaceDelegate;",
        "Landroid/app/AlertDialog;",
        "devOptionsDialog",
        "Landroid/app/AlertDialog;",
        "Lcom/facebook/react/devsupport/DebugOverlayController;",
        "debugOverlayController",
        "Lcom/facebook/react/devsupport/DebugOverlayController;",
        "devLoadingViewVisible",
        "pendingJSSplitBundleRequests",
        "isReceiverRegistered",
        "isShakeDetectorStarted",
        "isDevSupportEnabled",
        "isPackagerConnected",
        "",
        "errorCustomizers",
        "Ljava/util/List;",
        "Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;",
        "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;",
        "perfMonitorOverlayManager",
        "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;",
        "perfMonitorInitialized",
        "tracingStateProvider",
        "Lcom/facebook/react/devsupport/interfaces/TracingStateProvider;",
        "keyboardShortcutsEnabled",
        "getKeyboardShortcutsEnabled",
        "setKeyboardShortcutsEnabled",
        "devMenuEnabled",
        "getDevMenuEnabled",
        "setDevMenuEnabled",
        "getJSExecutorDescription",
        "jSExecutorDescription",
        "getUniqueTag",
        "uniqueTag",
        "Landroid/app/Activity;",
        "getCurrentActivity",
        "()Landroid/app/Activity;",
        "currentActivity",
        "getDevSupportEnabled",
        "setDevSupportEnabled",
        "devSupportEnabled",
        "getSourceMapUrl",
        "sourceMapUrl",
        "getSourceUrl",
        "sourceUrl",
        "getDownloadedJSBundleFile",
        "downloadedJSBundleFile",
        "Companion",
        "CallbackWithBundleLoader",
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
.field public static final Companion:Lcom/facebook/react/devsupport/DevSupportManagerBase$Companion;

.field private static final EXOPACKAGE_LOCATION_FORMAT:Ljava/lang/String; = "/data/local/tmp/exopackage/%s//secondary-dex"

.field private static final JAVA_ERROR_COOKIE:I = -0x1

.field private static final JSEXCEPTION_ERROR_COOKIE:I = -0x1

.field private static final RELOAD_APP_ACTION_SUFFIX:Ljava/lang/String; = ".RELOAD_APP_ACTION"


# instance fields
.field private final applicationContext:Landroid/content/Context;

.field private bundleFilePath:Ljava/lang/String;

.field private currentReactContext:Lcom/facebook/react/bridge/ReactContext;

.field private final customDevOptions:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;",
            ">;"
        }
    .end annotation
.end field

.field private final customPackagerCommandHandlers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/packagerconnection/RequestHandler;",
            ">;"
        }
    .end annotation
.end field

.field private debugOverlayController:Lcom/facebook/react/devsupport/DebugOverlayController;

.field private final defaultJSExceptionHandler:Lcom/facebook/react/bridge/DefaultJSExceptionHandler;

.field private final devBundleDownloadListener:Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;

.field private devLoadingViewManager:Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;

.field private devLoadingViewVisible:Z

.field private devMenuEnabled:Z

.field private devOptionsDialog:Landroid/app/AlertDialog;

.field private final devServerHelper:Lcom/facebook/react/devsupport/DevServerHelper;

.field private final devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

.field private final errorCustomizers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;",
            ">;"
        }
    .end annotation
.end field

.field private isDevSupportEnabled:Z

.field private isPackagerConnected:Z

.field private isReceiverRegistered:Z

.field private isShakeDetectorStarted:Z

.field private jsAppBundleName:Ljava/lang/String;

.field private final jsBundleDownloadedFile:Ljava/io/File;

.field private final jsSplitBundlesDir:Ljava/io/File;

.field private keyboardShortcutsEnabled:Z

.field private lastErrorCookie:I

.field private lastErrorStack:[Lcom/facebook/react/devsupport/interfaces/StackFrame;

.field private lastErrorTitle:Ljava/lang/String;

.field private lastErrorType:Lcom/facebook/react/devsupport/interfaces/ErrorType;

.field private packagerLocationCustomizer:Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;

.field private pausedInDebuggerOverlayManager:Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;

.field private pendingJSSplitBundleRequests:I

.field private perfMonitorInitialized:Z

.field private perfMonitorOverlayManager:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;

.field private final reactInstanceDevHelper:Lcom/facebook/react/devsupport/ReactInstanceDevHelper;

.field private final redBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

.field private redBoxSurfaceDelegate:Lcom/facebook/react/common/SurfaceDelegate;

.field private final reloadAppBroadcastReceiver:Landroid/content/BroadcastReceiver;

.field private final shakeDetector:Lcom/facebook/react/common/ShakeDetector;

.field private shakeGestureEnabled:Z

.field private final surfaceDelegateFactory:Lcom/facebook/react/common/SurfaceDelegateFactory;

.field private tracingStateProvider:Lcom/facebook/react/devsupport/interfaces/TracingStateProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/DevSupportManagerBase$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/DevSupportManagerBase$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->Companion:Lcom/facebook/react/devsupport/DevSupportManagerBase$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/react/devsupport/ReactInstanceDevHelper;Ljava/lang/String;ZLcom/facebook/react/devsupport/interfaces/RedBoxHandler;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;ILjava/util/Map;Lcom/facebook/react/common/SurfaceDelegateFactory;Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/react/devsupport/ReactInstanceDevHelper;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;",
            "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/facebook/react/packagerconnection/RequestHandler;",
            ">;",
            "Lcom/facebook/react/common/SurfaceDelegateFactory;",
            "Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;",
            "Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;",
            ")V"
        }
    .end annotation

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactInstanceDevHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reactInstanceDevHelper:Lcom/facebook/react/devsupport/ReactInstanceDevHelper;

    .line 4
    iput-object p3, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->jsAppBundleName:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->redBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 6
    iput-object p6, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devBundleDownloadListener:Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;

    .line 7
    iput-object p8, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->customPackagerCommandHandlers:Ljava/util/Map;

    .line 8
    iput-object p9, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->surfaceDelegateFactory:Lcom/facebook/react/common/SurfaceDelegateFactory;

    .line 9
    iput-object p10, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devLoadingViewManager:Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;

    .line 10
    iput-object p11, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->pausedInDebuggerOverlayManager:Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;

    .line 11
    new-instance p3, Lcom/facebook/react/devsupport/DevInternalSettings;

    .line 12
    new-instance p5, Lcom/facebook/react/devsupport/DevSupportManagerBase$devSettings$1;

    invoke-direct {p5, p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase$devSettings$1;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 13
    invoke-direct {p3, p1, p5}, Lcom/facebook/react/devsupport/DevInternalSettings;-><init>(Landroid/content/Context;Lcom/facebook/react/devsupport/DevInternalSettings$Listener;)V

    iput-object p3, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    const/4 p5, 0x1

    .line 14
    iput-boolean p5, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->shakeGestureEnabled:Z

    .line 15
    new-instance p6, Lcom/facebook/react/devsupport/DevServerHelper;

    invoke-interface {p3}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->getPackagerConnectionSettings()Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;

    move-result-object p8

    invoke-direct {p6, p3, p1, p8}, Lcom/facebook/react/devsupport/DevServerHelper;-><init>(Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;Landroid/content/Context;Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;)V

    iput-object p6, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devServerHelper:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 16
    new-instance p3, Lcom/facebook/react/common/ShakeDetector;

    new-instance p6, Lcom/facebook/react/devsupport/D;

    invoke-direct {p6, p0}, Lcom/facebook/react/devsupport/D;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    invoke-direct {p3, p6, p7}, Lcom/facebook/react/common/ShakeDetector;-><init>(Lcom/facebook/react/common/ShakeDetector$ShakeListener;I)V

    iput-object p3, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->shakeDetector:Lcom/facebook/react/common/ShakeDetector;

    .line 17
    new-instance p3, Lcom/facebook/react/devsupport/DevSupportManagerBase$reloadAppBroadcastReceiver$1;

    invoke-direct {p3, p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase$reloadAppBroadcastReceiver$1;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    iput-object p3, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reloadAppBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 18
    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p3, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->customDevOptions:Ljava/util/LinkedHashMap;

    .line 19
    new-instance p3, Lcom/facebook/react/bridge/DefaultJSExceptionHandler;

    invoke-direct {p3}, Lcom/facebook/react/bridge/DefaultJSExceptionHandler;-><init>()V

    iput-object p3, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->defaultJSExceptionHandler:Lcom/facebook/react/bridge/DefaultJSExceptionHandler;

    .line 20
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->errorCustomizers:Ljava/util/List;

    .line 21
    iput-boolean p5, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->keyboardShortcutsEnabled:Z

    .line 22
    iput-boolean p5, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devMenuEnabled:Z

    .line 23
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->getUniqueTag()Ljava/lang/String;

    move-result-object p3

    .line 24
    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p6, "ReactNativeDevBundle.js"

    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    .line 25
    new-instance p6, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p7

    invoke-direct {p6, p7, p5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p6, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->jsBundleDownloadedFile:Ljava/io/File;

    .line 26
    sget-object p5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p3, p5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p3

    const-string p5, "toLowerCase(...)"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "_dev_js_split_bundles"

    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const/4 p5, 0x0

    .line 27
    invoke-virtual {p1, p3, p5}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p1

    const-string p3, "getDir(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->jsSplitBundlesDir:Ljava/io/File;

    .line 28
    invoke-virtual {p0, p4}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->setDevSupportEnabled(Z)V

    .line 29
    iget-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devLoadingViewManager:Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;

    if-nez p1, :cond_0

    .line 30
    new-instance p1, Lcom/facebook/react/devsupport/DefaultDevLoadingViewImplementation;

    invoke-direct {p1, p2}, Lcom/facebook/react/devsupport/DefaultDevLoadingViewImplementation;-><init>(Lcom/facebook/react/devsupport/ReactInstanceDevHelper;)V

    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devLoadingViewManager:Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;

    .line 31
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->pausedInDebuggerOverlayManager:Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;

    if-nez p1, :cond_1

    .line 32
    new-instance p1, Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;

    .line 33
    new-instance p3, Lcom/facebook/react/devsupport/E;

    invoke-direct {p3, p0}, Lcom/facebook/react/devsupport/E;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 34
    invoke-direct {p1, p3}, Lcom/facebook/react/devsupport/PausedInDebuggerOverlayDialogManager;-><init>(LH0/i;)V

    .line 35
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->pausedInDebuggerOverlayManager:Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;

    .line 36
    :cond_1
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeNewArchitectureFeatureFlags;->enableBridgelessArchitecture()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 37
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->perfMonitorV2Enabled()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 38
    instance-of p1, p2, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;

    if-eqz p1, :cond_2

    .line 39
    new-instance p1, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;

    .line 40
    check-cast p2, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;

    .line 41
    new-instance p3, Lcom/facebook/react/devsupport/F;

    invoke-direct {p3, p0}, Lcom/facebook/react/devsupport/F;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 42
    invoke-direct {p1, p2, p3}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;-><init>(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;Lw7/a;)V

    .line 43
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->perfMonitorOverlayManager:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;

    :cond_2
    return-void
.end method

.method public static synthetic A(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->toggleElementInspector$lambda$36(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final _init_$lambda$3(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Landroid/content/Context;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reactInstanceDevHelper:Lcom/facebook/react/devsupport/ReactInstanceDevHelper;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/facebook/react/devsupport/ReactInstanceDevHelper;->getCurrentActivity()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object p0

    .line 17
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method private static final _init_$lambda$4(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Li7/B;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/devsupport/interfaces/DebuggerFrontendPanelName;->PERFORMANCE:Lcom/facebook/react/devsupport/interfaces/DebuggerFrontendPanelName;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/interfaces/DebuggerFrontendPanelName;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->openDebugger(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Li7/B;->a:Li7/B;

    .line 11
    .line 12
    return-object p0
.end method

.method public static synthetic a(Lcom/facebook/react/devsupport/DevSupportManagerBase;Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isPackagerRunning$lambda$32(Lcom/facebook/react/devsupport/DevSupportManagerBase;Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getCustomPackagerCommandHandlers$p(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->customPackagerCommandHandlers:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getDevBundleDownloadListener$p(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devBundleDownloadListener:Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPerfMonitorOverlayManager$p(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->perfMonitorOverlayManager:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$hideSplitBundleDevLoadingView(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->hideSplitBundleDevLoadingView()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$reportBundleLoadingFailure(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reportBundleLoadingFailure(Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$safeGetDefaultTextColor(Lcom/facebook/react/devsupport/DevSupportManagerBase;Landroid/content/Context;)Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->safeGetDefaultTextColor(Landroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$safeGetTextColorSecondary(Lcom/facebook/react/devsupport/DevSupportManagerBase;Landroid/content/Context;)Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->safeGetTextColorSecondary(Landroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$setPackagerConnected$p(Lcom/facebook/react/devsupport/DevSupportManagerBase;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isPackagerConnected:Z

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reloadSettings$lambda$30(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog$lambda$19(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final compatRegisterReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Z)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 12
    .line 13
    if-lt v0, v1, :cond_1

    .line 14
    .line 15
    if-eqz p4, :cond_0

    .line 16
    .line 17
    const/4 p4, 0x2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p4, 0x4

    .line 20
    :goto_0
    invoke-static {p1, p2, p3, p4}, Lcom/facebook/react/devsupport/p;->a(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static synthetic d(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog$lambda$18$lambda$17(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog$lambda$9(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog$lambda$21(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final fetchSplitBundleAndCreateBundleLoader$lambda$31(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/String;Ljava/io/File;Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;)V
    .locals 8

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showSplitBundleDevLoadingView(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devServerHelper:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 5
    .line 6
    new-instance v1, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/facebook/react/devsupport/DevSupportManagerBase$fetchSplitBundleAndCreateBundleLoader$1$1;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/String;Ljava/io/File;Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;)V

    .line 9
    .line 10
    .line 11
    const/16 v6, 0x10

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    move-object v3, p1

    .line 17
    move-object v2, p2

    .line 18
    invoke-static/range {v0 .. v7}, Lcom/facebook/react/devsupport/DevServerHelper;->downloadBundleFromURL$default(Lcom/facebook/react/devsupport/DevServerHelper;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;Ljava/io/File;Ljava/lang/String;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Le9/B$a;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static synthetic g(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog$lambda$15(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final getJSExecutorDescription()Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reactInstanceDevHelper:Lcom/facebook/react/devsupport/ReactInstanceDevHelper;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/devsupport/ReactInstanceDevHelper;->getJavaScriptExecutorFactory()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return-object v0

    .line 12
    :catch_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public static synthetic h(Ljava/lang/Exception;Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reportBundleLoadingFailure$lambda$33(Ljava/lang/Exception;Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final hideDevOptionsDialog()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devOptionsDialog:Landroid/app/AlertDialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devOptionsDialog:Landroid/app/AlertDialog;

    .line 10
    .line 11
    return-void
.end method

.method private final hideSplitBundleDevLoadingView()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->pendingJSSplitBundleRequests:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->pendingJSSplitBundleRequests:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->hideDevLoadingView()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static synthetic i(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;ILcom/facebook/react/devsupport/interfaces/ErrorType;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showNewError$lambda$7(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;ILcom/facebook/react/devsupport/interfaces/ErrorType;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final isPackagerRunning$lambda$32(Lcom/facebook/react/devsupport/DevSupportManagerBase;Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devServerHelper:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/DevServerHelper;->isPackagerRunning(Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic j(Lcom/facebook/react/devsupport/DevSupportManagerBase;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->setHotModuleReplacementEnabled$lambda$34(Lcom/facebook/react/devsupport/DevSupportManagerBase;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog$lambda$22(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l(Lcom/facebook/react/devsupport/DevSupportManagerBase;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog$lambda$26(Lcom/facebook/react/devsupport/DevSupportManagerBase;Landroid/content/DialogInterface;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final logJSException(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "Exception in native call from JS"

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    move-object v1, v2

    .line 12
    :cond_0
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    if-eqz v1, :cond_1

    .line 20
    .line 21
    const-string v3, "\n\n"

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    instance-of v1, p1, Lcom/facebook/react/common/JavascriptException;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    const-string v0, "ReactNative"

    .line 43
    .line 44
    invoke-static {v0, v2, p1}, Ld2/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const/4 v0, 0x0

    .line 52
    new-array v0, v0, [Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 53
    .line 54
    const/4 v1, -0x1

    .line 55
    sget-object v2, Lcom/facebook/react/devsupport/interfaces/ErrorType;->JS:Lcom/facebook/react/devsupport/interfaces/ErrorType;

    .line 56
    .line 57
    invoke-direct {p0, p1, v0, v1, v2}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showNewError(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;ILcom/facebook/react/devsupport/interfaces/ErrorType;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showNewJavaError(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public static synthetic m(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog$lambda$18(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic n(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->shakeDetector$lambda$2(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic o(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog$lambda$13(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic p(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->_init_$lambda$4(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic q(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog$lambda$8(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic r([Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;Lcom/facebook/react/devsupport/DevSupportManagerBase;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog$lambda$25([Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;Lcom/facebook/react/devsupport/DevSupportManagerBase;Landroid/content/DialogInterface;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final reload()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isDevSupportEnabled:Z

    .line 5
    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->debugOverlayController:Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 13
    .line 14
    invoke-interface {v1}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->isFpsDebugEnabled()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0, v1}, Lcom/facebook/react/devsupport/DebugOverlayController;->setFpsDebugViewVisible(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isShakeDetectorStarted:Z

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->getShakeGestureEnabled()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-direct {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->startShakeDetector()V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isReceiverRegistered:Z

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    new-instance v0, Landroid/content/IntentFilter;

    .line 39
    .line 40
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 41
    .line 42
    .line 43
    sget-object v1, Lcom/facebook/react/devsupport/DevSupportManagerBase;->Companion:Lcom/facebook/react/devsupport/DevSupportManagerBase$Companion;

    .line 44
    .line 45
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 46
    .line 47
    invoke-static {v1, v2}, Lcom/facebook/react/devsupport/DevSupportManagerBase$Companion;->access$getReloadAppAction(Lcom/facebook/react/devsupport/DevSupportManagerBase$Companion;Landroid/content/Context;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 55
    .line 56
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reloadAppBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    invoke-direct {p0, v1, v2, v0, v3}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->compatRegisterReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Z)V

    .line 60
    .line 61
    .line 62
    iput-boolean v3, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isReceiverRegistered:Z

    .line 63
    .line 64
    :cond_2
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devLoadingViewVisible:Z

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devLoadingViewManager:Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    const-string v1, "Reloading..."

    .line 73
    .line 74
    invoke-interface {v0, v1}, Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;->showMessage(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devServerHelper:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    new-instance v2, Lcom/facebook/react/devsupport/DevSupportManagerBase$reload$1;

    .line 88
    .line 89
    invoke-direct {v2, p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase$reload$1;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/devsupport/DevServerHelper;->openPackagerConnection(Ljava/lang/String;Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_4
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->debugOverlayController:Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 97
    .line 98
    const/4 v1, 0x0

    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Lcom/facebook/react/devsupport/DebugOverlayController;->setFpsDebugViewVisible(Z)V

    .line 102
    .line 103
    .line 104
    :cond_5
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isShakeDetectorStarted:Z

    .line 105
    .line 106
    if-eqz v0, :cond_6

    .line 107
    .line 108
    invoke-direct {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->stopShakeDetector()V

    .line 109
    .line 110
    .line 111
    :cond_6
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isReceiverRegistered:Z

    .line 112
    .line 113
    if-eqz v0, :cond_7

    .line 114
    .line 115
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 116
    .line 117
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reloadAppBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 118
    .line 119
    invoke-virtual {v0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 120
    .line 121
    .line 122
    iput-boolean v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isReceiverRegistered:Z

    .line 123
    .line 124
    :cond_7
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->hideRedboxDialog()V

    .line 125
    .line 126
    .line 127
    invoke-direct {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->hideDevOptionsDialog()V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devLoadingViewManager:Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;

    .line 131
    .line 132
    if-eqz v0, :cond_8

    .line 133
    .line 134
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;->hide()V

    .line 135
    .line 136
    .line 137
    :cond_8
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->perfMonitorOverlayManager:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;

    .line 138
    .line 139
    if-eqz v0, :cond_9

    .line 140
    .line 141
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->disable()V

    .line 142
    .line 143
    .line 144
    :cond_9
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devServerHelper:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 145
    .line 146
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/DevServerHelper;->closePackagerConnection()V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method private static final reloadSettings$lambda$30(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reload()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final reportBundleLoadingFailure(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/J;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lcom/facebook/react/devsupport/J;-><init>(Ljava/lang/Exception;Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final reportBundleLoadingFailure$lambda$33(Ljava/lang/Exception;Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 2

    .line 1
    instance-of v0, p0, Lcom/facebook/react/common/DebugServerException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0, p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showNewJavaError(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p1, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 14
    .line 15
    sget v1, Lcom/facebook/react/R$string;->catalyst_reload_error:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, v0, p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showNewJavaError(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final resetCurrentContext(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->currentReactContext:Lcom/facebook/react/bridge/ReactContext;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->currentReactContext:Lcom/facebook/react/bridge/ReactContext;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->debugOverlayController:Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Lcom/facebook/react/devsupport/DebugOverlayController;->setFpsDebugViewVisible(Z)V

    .line 14
    .line 15
    .line 16
    :cond_1
    if-eqz p1, :cond_2

    .line 17
    .line 18
    new-instance v0, Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lcom/facebook/react/devsupport/DebugOverlayController;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->debugOverlayController:Lcom/facebook/react/devsupport/DebugOverlayController;

    .line 24
    .line 25
    :cond_2
    if-eqz p1, :cond_5

    .line 26
    .line 27
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->getSourceUrl()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v2, "substring(...)"

    .line 48
    .line 49
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_3
    move-object v2, v1

    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception v0

    .line 55
    move-object p1, v0

    .line 56
    goto :goto_3

    .line 57
    :goto_0
    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-virtual {v0}, Ljava/net/URL;->getPort()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    const/4 v4, -0x1

    .line 70
    if-eq v1, v4, :cond_4

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/net/URL;->getPort()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    :goto_1
    move v4, v0

    .line 77
    goto :goto_2

    .line 78
    :cond_4
    invoke-virtual {v0}, Ljava/net/URL;->getDefaultPort()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    goto :goto_1

    .line 83
    :goto_2
    const-class v0, Lcom/facebook/react/devsupport/HMRClient;

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    move-object v0, p1

    .line 90
    check-cast v0, Lcom/facebook/react/devsupport/HMRClient;

    .line 91
    .line 92
    const-string v1, "android"

    .line 93
    .line 94
    iget-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 95
    .line 96
    invoke-interface {p1}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->isHotModuleReplacementEnabled()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    invoke-interface/range {v0 .. v6}, Lcom/facebook/react/devsupport/HMRClient;->setup(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    .line 103
    goto :goto_4

    .line 104
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showNewJavaError(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    :cond_5
    :goto_4
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reloadSettings()V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public static synthetic s()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog$lambda$14()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final safeGetDefaultTextColor(Landroid/content/Context;)Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/facebook/react/views/text/DefaultStyleValuesUtil;->getDefaultTextColor(Landroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p1}, Lcom/facebook/react/views/common/UiModeUtils;->isDarkMode(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const-string v0, "valueOf(...)"

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    const/high16 p1, -0x1000000

    .line 25
    .line 26
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_1
    return-object v0
.end method

.method private final safeGetTextColorSecondary(Landroid/content/Context;)Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/facebook/react/views/text/DefaultStyleValuesUtil;->getTextColorSecondary(Landroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const p1, -0x777778

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "valueOf(...)"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-object p1
.end method

.method private static final setFpsDebugEnabled$lambda$35(Lcom/facebook/react/devsupport/DevSupportManagerBase;Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->setFpsDebugEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static final setHotModuleReplacementEnabled$lambda$34(Lcom/facebook/react/devsupport/DevSupportManagerBase;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->setHotModuleReplacementEnabled(Z)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->handleReloadJS()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final shakeDetector$lambda$2(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final showDevLoadingViewForUrl(Ljava/lang/String;)V
    .locals 5

    .line 1
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URL;->getPort()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 v1, -0x1

    .line 11
    if-eq p1, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/net/URL;->getPort()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0}, Ljava/net/URL;->getDefaultPort()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    :goto_0
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devLoadingViewManager:Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 27
    .line 28
    sget v3, Lcom/facebook/react/R$string;->catalyst_loading_from_url:I

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v4, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v0, ":"

    .line 43
    .line 44
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v2, v3, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string v0, "getString(...)"

    .line 63
    .line 64
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v1, p1}, Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;->showMessage(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    const/4 p1, 0x1

    .line 71
    iput-boolean p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devLoadingViewVisible:Z

    .line 72
    .line 73
    return-void

    .line 74
    :catch_0
    move-exception p1

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v1, "Bundle url format is invalid. \n\n"

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const-string v0, "ReactNative"

    .line 93
    .line 94
    invoke-static {v0, p1}, Ld2/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method private static final showDevOptionsDialog$lambda$12(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/B;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/B;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final showDevOptionsDialog$lambda$12$lambda$11(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reactInstanceDevHelper:Lcom/facebook/react/devsupport/ReactInstanceDevHelper;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;->getInspectorTarget()Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTarget;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTargetBinding;->pauseAndAnalyzeBackgroundTrace()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    sget-object v0, Lcom/facebook/react/devsupport/interfaces/DebuggerFrontendPanelName;->PERFORMANCE:Lcom/facebook/react/devsupport/interfaces/DebuggerFrontendPanelName;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/interfaces/DebuggerFrontendPanelName;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0, v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->openDebugger(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method private static final showDevOptionsDialog$lambda$13(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reactInstanceDevHelper:Lcom/facebook/react/devsupport/ReactInstanceDevHelper;

    .line 2
    .line 3
    instance-of v0, p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;

    .line 8
    .line 9
    invoke-interface {p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;->getInspectorTarget()Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTarget;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTargetBinding;->resumeBackgroundTrace()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method private static final showDevOptionsDialog$lambda$14()V
    .locals 0

    .line 1
    return-void
.end method

.method private static final showDevOptionsDialog$lambda$15(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->perfMonitorOverlayManager:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->disable()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private static final showDevOptionsDialog$lambda$16(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->perfMonitorOverlayManager:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->enable()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private static final showDevOptionsDialog$lambda$18(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reactInstanceDevHelper:Lcom/facebook/react/devsupport/ReactInstanceDevHelper;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/devsupport/ReactInstanceDevHelper;->getCurrentActivity()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v1, Lcom/facebook/react/devsupport/ChangeBundleLocationDialog;->INSTANCE:Lcom/facebook/react/devsupport/ChangeBundleLocationDialog;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 19
    .line 20
    new-instance v3, Lcom/facebook/react/devsupport/M;

    .line 21
    .line 22
    invoke-direct {v3, p0}, Lcom/facebook/react/devsupport/M;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0, v2, v3}, Lcom/facebook/react/devsupport/ChangeBundleLocationDialog;->show(Landroid/content/Context;Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;Lcom/facebook/react/devsupport/ChangeBundleLocationDialog$ChangeBundleLocationDialogListener;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    :goto_0
    const-string p0, "ReactNative"

    .line 30
    .line 31
    const-string v0, "Unable to launch change bundle location because react activity is not available"

    .line 32
    .line 33
    invoke-static {p0, v0}, Ld2/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method private static final showDevOptionsDialog$lambda$18$lambda$17(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->getPackagerConnectionSettings()Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;->setDebugServerHost(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->handleReloadJS()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private static final showDevOptionsDialog$lambda$19(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->isElementInspectorEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    xor-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->setElementInspectorEnabled(Z)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reactInstanceDevHelper:Lcom/facebook/react/devsupport/ReactInstanceDevHelper;

    .line 13
    .line 14
    invoke-interface {p0}, Lcom/facebook/react/devsupport/ReactInstanceDevHelper;->toggleElementInspector()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private static final showDevOptionsDialog$lambda$20(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->isHotModuleReplacementEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v1, v0, 0x1

    .line 8
    .line 9
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 10
    .line 11
    invoke-interface {v2, v1}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->setHotModuleReplacementEnabled(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->currentReactContext:Lcom/facebook/react/bridge/ReactContext;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    const-class v2, Lcom/facebook/react/devsupport/HMRClient;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lcom/facebook/react/devsupport/HMRClient;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v1}, Lcom/facebook/react/devsupport/HMRClient;->enable()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lcom/facebook/react/devsupport/HMRClient;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-interface {v1}, Lcom/facebook/react/devsupport/HMRClient;->disable()V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 46
    .line 47
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 48
    .line 49
    invoke-interface {v0}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->isJSDevModeEnabled()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 56
    .line 57
    sget v1, Lcom/facebook/react/R$string;->catalyst_hot_reloading_auto_enable:I

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const/4 v2, 0x1

    .line 64
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 72
    .line 73
    invoke-interface {v0, v2}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->setJSDevModeEnabled(Z)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->handleReloadJS()V

    .line 77
    .line 78
    .line 79
    :cond_2
    return-void
.end method

.method private static final showDevOptionsDialog$lambda$21(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->isFpsDebugEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reactInstanceDevHelper:Lcom/facebook/react/devsupport/ReactInstanceDevHelper;

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/facebook/react/devsupport/ReactInstanceDevHelper;->getCurrentActivity()Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, "ReactNative"

    .line 18
    .line 19
    const-string v1, "Unable to get reference to react activity"

    .line 20
    .line 21
    invoke-static {v0, v1}, Ld2/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object v1, Lcom/facebook/react/devsupport/DebugOverlayController;->Companion:Lcom/facebook/react/devsupport/DebugOverlayController$Companion;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lcom/facebook/react/devsupport/DebugOverlayController$Companion;->requestPermission(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    iget-object p0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 31
    .line 32
    invoke-interface {p0}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->isFpsDebugEnabled()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    xor-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    invoke-interface {p0, v0}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->setFpsDebugEnabled(Z)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private static final showDevOptionsDialog$lambda$22(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 4
    .line 5
    const-class v2, Lcom/facebook/react/devsupport/DevSettingsActivity;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    const/high16 v1, 0x10000000

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private static final showDevOptionsDialog$lambda$25([Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;Lcom/facebook/react/devsupport/DevSupportManagerBase;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    aget-object p0, p0, p3

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;->onOptionSelected()V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    iput-object p0, p1, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devOptionsDialog:Landroid/app/AlertDialog;

    .line 8
    .line 9
    return-void
.end method

.method private static final showDevOptionsDialog$lambda$26(Lcom/facebook/react/devsupport/DevSupportManagerBase;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devOptionsDialog:Landroid/app/AlertDialog;

    .line 3
    .line 4
    return-void
.end method

.method private static final showDevOptionsDialog$lambda$8(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->isJSDevModeEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->isHotModuleReplacementEnabled()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 18
    .line 19
    sget v1, Lcom/facebook/react/R$string;->catalyst_hot_reloading_auto_disable:I

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-interface {v0, v1}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->setHotModuleReplacementEnabled(Z)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-interface {p0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->handleReloadJS()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method private static final showDevOptionsDialog$lambda$9(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, v0, v1, v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->openDebugger$default(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;Ljava/lang/String;ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final showNewError(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;ILcom/facebook/react/devsupport/interfaces/ErrorType;)V
    .locals 6

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/L;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move v4, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/devsupport/L;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;ILcom/facebook/react/devsupport/interfaces/ErrorType;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final showNewError$lambda$7(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;ILcom/facebook/react/devsupport/interfaces/ErrorType;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->updateLastErrorInfo(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;ILcom/facebook/react/devsupport/interfaces/ErrorType;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->redBoxSurfaceDelegate:Lcom/facebook/react/common/SurfaceDelegate;

    .line 5
    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    const-string p1, "RedBox"

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->createSurfaceDelegate(Ljava/lang/String;)Lcom/facebook/react/common/SurfaceDelegate;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    new-instance p2, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;

    .line 17
    .line 18
    invoke-direct {p2, p0}, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;-><init>(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate;->createContentView(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iput-object p2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->redBoxSurfaceDelegate:Lcom/facebook/react/common/SurfaceDelegate;

    .line 25
    .line 26
    :cond_1
    iget-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->redBoxSurfaceDelegate:Lcom/facebook/react/common/SurfaceDelegate;

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-interface {p1}, Lcom/facebook/react/common/SurfaceDelegate;->isShowing()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    const/4 p2, 0x1

    .line 35
    if-ne p1, p2, :cond_2

    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    iget-object p0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->redBoxSurfaceDelegate:Lcom/facebook/react/common/SurfaceDelegate;

    .line 39
    .line 40
    if-eqz p0, :cond_3

    .line 41
    .line 42
    invoke-interface {p0}, Lcom/facebook/react/common/SurfaceDelegate;->show()V

    .line 43
    .line 44
    .line 45
    :cond_3
    return-void
.end method

.method private final showSplitBundleDevLoadingView(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevLoadingViewForUrl(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->pendingJSSplitBundleRequests:I

    .line 5
    .line 6
    add-int/lit8 p1, p1, 0x1

    .line 7
    .line 8
    iput p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->pendingJSSplitBundleRequests:I

    .line 9
    .line 10
    return-void
.end method

.method private final startShakeDetector()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "sensor"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "null cannot be cast to non-null type android.hardware.SensorManager"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v0, Landroid/hardware/SensorManager;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->shakeDetector:Lcom/facebook/react/common/ShakeDetector;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lcom/facebook/react/common/ShakeDetector;->start(Landroid/hardware/SensorManager;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isShakeDetectorStarted:Z

    .line 23
    .line 24
    return-void
.end method

.method private final stopShakeDetector()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->shakeDetector:Lcom/facebook/react/common/ShakeDetector;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/common/ShakeDetector;->stop()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isShakeDetectorStarted:Z

    .line 8
    .line 9
    return-void
.end method

.method public static synthetic t(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog$lambda$16(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final toggleElementInspector$lambda$36(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->isElementInspectorEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    xor-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->setElementInspectorEnabled(Z)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reactInstanceDevHelper:Lcom/facebook/react/devsupport/ReactInstanceDevHelper;

    .line 13
    .line 14
    invoke-interface {p0}, Lcom/facebook/react/devsupport/ReactInstanceDevHelper;->toggleElementInspector()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static synthetic u(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog$lambda$12$lambda$11(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final updateLastErrorInfo(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;ILcom/facebook/react/devsupport/interfaces/ErrorType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->lastErrorTitle:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->lastErrorStack:[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 4
    .line 5
    iput p3, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->lastErrorCookie:I

    .line 6
    .line 7
    iput-object p4, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->lastErrorType:Lcom/facebook/react/devsupport/interfaces/ErrorType;

    .line 8
    .line 9
    return-void
.end method

.method public static synthetic v(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog$lambda$12(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic w(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog$lambda$20(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic x(Lcom/facebook/react/devsupport/DevSupportManagerBase;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->setFpsDebugEnabled$lambda$35(Lcom/facebook/react/devsupport/DevSupportManagerBase;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic y(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->_init_$lambda$3(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic z(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/String;Ljava/io/File;Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->fetchSplitBundleAndCreateBundleLoader$lambda$31(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/String;Ljava/io/File;Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public addCustomDevOption(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;)V
    .locals 1

    .line 1
    const-string v0, "optionName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "optionHandler"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->customDevOptions:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public createRootView(Ljava/lang/String;)Landroid/view/View;
    .locals 1

    .line 1
    const-string v0, "appKey"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reactInstanceDevHelper:Lcom/facebook/react/devsupport/ReactInstanceDevHelper;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/facebook/react/devsupport/ReactInstanceDevHelper;->createRootView(Ljava/lang/String;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public createSurfaceDelegate(Ljava/lang/String;)Lcom/facebook/react/common/SurfaceDelegate;
    .locals 1

    .line 1
    const-string v0, "moduleName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->surfaceDelegateFactory:Lcom/facebook/react/common/SurfaceDelegateFactory;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lcom/facebook/react/common/SurfaceDelegateFactory;->createSurfaceDelegate(Ljava/lang/String;)Lcom/facebook/react/common/SurfaceDelegate;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return-object p1
.end method

.method public destroyRootView(Landroid/view/View;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reactInstanceDevHelper:Lcom/facebook/react/devsupport/ReactInstanceDevHelper;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/facebook/react/devsupport/ReactInstanceDevHelper;->destroyRootView(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public downloadBundleResourceFromUrlSync(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    .locals 1

    .line 1
    const-string v0, "resourceURL"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "outputFile"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devServerHelper:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/devsupport/DevServerHelper;->downloadBundleResourceFromUrlSync(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final fetchSplitBundleAndCreateBundleLoader(Ljava/lang/String;Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;)V
    .locals 5

    .line 1
    const-string v0, "bundlePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devServerHelper:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/facebook/react/devsupport/DevServerHelper;->getDevServerSplitBundleURL(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ljava/io/File;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->jsSplitBundlesDir:Ljava/io/File;

    .line 20
    .line 21
    new-instance v3, LP8/o;

    .line 22
    .line 23
    const-string v4, "/"

    .line 24
    .line 25
    invoke-direct {v3, v4}, LP8/o;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v4, "_"

    .line 29
    .line 30
    invoke-virtual {v3, p1, v4}, LP8/o;->e(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v3, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p1, ".jsbundle"

    .line 43
    .line 44
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {v1, v2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance p1, Lcom/facebook/react/devsupport/A;

    .line 55
    .line 56
    invoke-direct {p1, p0, v0, v1, p2}, Lcom/facebook/react/devsupport/A;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/String;Ljava/io/File;Lcom/facebook/react/devsupport/DevSupportManagerBase$CallbackWithBundleLoader;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method protected final getApplicationContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBundleFilePath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->bundleFilePath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCurrentActivity()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reactInstanceDevHelper:Lcom/facebook/react/devsupport/ReactInstanceDevHelper;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/devsupport/ReactInstanceDevHelper;->getCurrentActivity()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getCurrentReactContext()Lcom/facebook/react/bridge/ReactContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->currentReactContext:Lcom/facebook/react/bridge/ReactContext;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDevLoadingViewManager()Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devLoadingViewManager:Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDevMenuEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devMenuEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getDevServerHelper()Lcom/facebook/react/devsupport/DevServerHelper;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devServerHelper:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDevSettings()Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDevSupportEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isDevSupportEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public getDownloadedJSBundleFile()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->jsBundleDownloadedFile:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getAbsolutePath(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final getJSAppBundleName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->jsAppBundleName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getKeyboardShortcutsEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->keyboardShortcutsEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getLastErrorCookie()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->lastErrorCookie:I

    .line 2
    .line 3
    return v0
.end method

.method public final getLastErrorStack()[Lcom/facebook/react/devsupport/interfaces/StackFrame;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->lastErrorStack:[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLastErrorTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->lastErrorTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLastErrorType()Lcom/facebook/react/devsupport/interfaces/ErrorType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->lastErrorType:Lcom/facebook/react/devsupport/interfaces/ErrorType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReactInstanceDevHelper()Lcom/facebook/react/devsupport/ReactInstanceDevHelper;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reactInstanceDevHelper:Lcom/facebook/react/devsupport/ReactInstanceDevHelper;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRedBoxHandler()Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->redBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getShakeGestureEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->shakeGestureEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public getSourceMapUrl()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->jsAppBundleName:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devServerHelper:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lcom/facebook/react/devsupport/DevServerHelper;->getSourceMapUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object v0

    .line 15
    :cond_1
    :goto_0
    const-string v0, ""

    .line 16
    .line 17
    return-object v0
.end method

.method public getSourceUrl()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->jsAppBundleName:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devServerHelper:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lcom/facebook/react/devsupport/DevServerHelper;->getSourceUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object v0

    .line 15
    :cond_1
    :goto_0
    const-string v0, ""

    .line 16
    .line 17
    return-object v0
.end method

.method protected abstract getUniqueTag()Ljava/lang/String;
.end method

.method public handleException(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isDevSupportEnabled:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->logJSException(Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->defaultJSExceptionHandler:Lcom/facebook/react/bridge/DefaultJSExceptionHandler;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/DefaultJSExceptionHandler;->handleException(Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public hasUpToDateJSBundleInCache()Z
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isDevSupportEnabled:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->jsBundleDownloadedFile:Ljava/io/File;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v3, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->jsBundleDownloadedFile:Ljava/io/File;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/io/File;->lastModified()J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    iget-wide v5, v2, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 39
    .line 40
    cmp-long v2, v3, v5

    .line 41
    .line 42
    if-lez v2, :cond_2

    .line 43
    .line 44
    new-instance v2, Ljava/io/File;

    .line 45
    .line 46
    sget-object v3, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/H;

    .line 47
    .line 48
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 49
    .line 50
    const-string v4, "/data/local/tmp/exopackage/%s//secondary-dex"

    .line 51
    .line 52
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v5, 0x1

    .line 57
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v3, v4, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v3, "format(...)"

    .line 66
    .line 67
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->jsBundleDownloadedFile:Ljava/io/File;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 82
    .line 83
    .line 84
    move-result-wide v3

    .line 85
    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    .line 86
    .line 87
    .line 88
    move-result-wide v6
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    cmp-long v0, v3, v6

    .line 90
    .line 91
    if-lez v0, :cond_0

    .line 92
    .line 93
    return v5

    .line 94
    :cond_0
    return v1

    .line 95
    :cond_1
    return v5

    .line 96
    :catch_0
    const-string v0, "ReactNative"

    .line 97
    .line 98
    const-string v2, "DevSupport is unable to get current app info"

    .line 99
    .line 100
    invoke-static {v0, v2}, Ld2/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    return v1
.end method

.method protected final hideDevLoadingView()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devLoadingViewManager:Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;->hide()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devLoadingViewVisible:Z

    .line 10
    .line 11
    return-void
.end method

.method public hidePausedInDebuggerOverlay()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->pausedInDebuggerOverlayManager:Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;->hidePausedInDebuggerOverlay()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public hideRedboxDialog()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->redBoxSurfaceDelegate:Lcom/facebook/react/common/SurfaceDelegate;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/facebook/react/common/SurfaceDelegate;->hide()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public isPackagerRunning(Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V
    .locals 1

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/facebook/react/devsupport/G;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/facebook/react/devsupport/G;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->packagerLocationCustomizer:Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-interface {p1, v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;->run(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public onNewReactContextCreated(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 2

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->perfMonitorInitialized:Z

    .line 7
    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reactInstanceDevHelper:Lcom/facebook/react/devsupport/ReactInstanceDevHelper;

    .line 11
    .line 12
    instance-of v1, v0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;

    .line 13
    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->perfMonitorOverlayManager:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    check-cast v0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;

    .line 21
    .line 22
    invoke-interface {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;->getInspectorTarget()Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTarget;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {v0, v1}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorEventDispatcher;->addPerfMonitorListener(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorUpdateListener;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isPackagerConnected:Z

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->perfMonitorOverlayManager:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->enable()V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->perfMonitorOverlayManager:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->startBackgroundTrace()V

    .line 47
    .line 48
    .line 49
    :cond_2
    const/4 v0, 0x1

    .line 50
    iput-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->perfMonitorInitialized:Z

    .line 51
    .line 52
    :cond_3
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->resetCurrentContext(Lcom/facebook/react/bridge/ReactContext;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public onReactInstanceDestroyed(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->currentReactContext:Lcom/facebook/react/bridge/ReactContext;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->resetCurrentContext(Lcom/facebook/react/bridge/ReactContext;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public openDebugger(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devServerHelper:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->currentReactContext:Lcom/facebook/react/bridge/ReactContext;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 6
    .line 7
    sget v3, Lcom/facebook/react/R$string;->catalyst_open_debugger_error:I

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v0, v1, v2, p1}, Lcom/facebook/react/devsupport/DevServerHelper;->openDebugger(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public processErrorCustomizers(Landroid/util/Pair;)Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "[",
            "Lcom/facebook/react/devsupport/interfaces/StackFrame;",
            ">;)",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "[",
            "Lcom/facebook/react/devsupport/interfaces/StackFrame;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "errorInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->errorCustomizers:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    move-object v1, p1

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;

    .line 24
    .line 25
    invoke-interface {v1, p1}, Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;->customizeErrorInfo(Landroid/util/Pair;)Landroid/util/Pair;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-object v1
.end method

.method public registerErrorCustomizer(Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;)V
    .locals 1

    .line 1
    const-string v0, "errorCustomizer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->errorCustomizers:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public reloadJSFromServer(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;)V
    .locals 9

    .line 1
    const-string v0, "bundleURL"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->DOWNLOAD_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevLoadingViewForUrl(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v5, Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;

    .line 20
    .line 21
    invoke-direct {v5}, Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devServerHelper:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 25
    .line 26
    new-instance v2, Lcom/facebook/react/devsupport/DevSupportManagerBase$reloadJSFromServer$1;

    .line 27
    .line 28
    invoke-direct {v2, p0, v5, p2}, Lcom/facebook/react/devsupport/DevSupportManagerBase$reloadJSFromServer$1;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;)V

    .line 29
    .line 30
    .line 31
    iget-object v3, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->jsBundleDownloadedFile:Ljava/io/File;

    .line 32
    .line 33
    const/16 v7, 0x10

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    move-object v4, p1

    .line 38
    invoke-static/range {v1 .. v8}, Lcom/facebook/react/devsupport/DevServerHelper;->downloadBundleFromURL$default(Lcom/facebook/react/devsupport/DevServerHelper;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;Ljava/io/File;Ljava/lang/String;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Le9/B$a;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public reloadSettings()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->isOnUiThread()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reload()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/K;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/K;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setAdditionalOptionForPackager(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->getPackagerConnectionSettings()Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;->setAdditionalOptionForPackager(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setBundleFilePath(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->bundleFilePath:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setDevLoadingViewManager(Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devLoadingViewManager:Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;

    .line 2
    .line 3
    return-void
.end method

.method public setDevMenuEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devMenuEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setDevSupportEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isDevSupportEnabled:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reloadSettings()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setFpsDebugEnabled(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isDevSupportEnabled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/C;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/facebook/react/devsupport/C;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;Z)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setHotModuleReplacementEnabled(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isDevSupportEnabled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/H;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/facebook/react/devsupport/H;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;Z)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setJsAppBundleName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->jsAppBundleName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setKeyboardShortcutsEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->keyboardShortcutsEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setLastErrorCookie(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->lastErrorCookie:I

    .line 2
    .line 3
    return-void
.end method

.method public final setLastErrorStack([Lcom/facebook/react/devsupport/interfaces/StackFrame;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->lastErrorStack:[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 2
    .line 3
    return-void
.end method

.method public final setLastErrorTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->lastErrorTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setLastErrorType(Lcom/facebook/react/devsupport/interfaces/ErrorType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->lastErrorType:Lcom/facebook/react/devsupport/interfaces/ErrorType;

    .line 2
    .line 3
    return-void
.end method

.method public setPackagerLocationCustomizer(Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;)V
    .locals 1

    .line 1
    const-string v0, "packagerLocationCustomizer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->packagerLocationCustomizer:Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;

    .line 7
    .line 8
    return-void
.end method

.method public final setShakeGestureEnabled(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->shakeGestureEnabled:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->startShakeDetector()V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->stopShakeDetector()V

    .line 13
    .line 14
    .line 15
    :goto_0
    iput-boolean p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->shakeGestureEnabled:Z

    .line 16
    .line 17
    return-void
.end method

.method public final setTracingStateProvider$ReactAndroid_release(Lcom/facebook/react/devsupport/interfaces/TracingStateProvider;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->tracingStateProvider:Lcom/facebook/react/devsupport/interfaces/TracingStateProvider;

    .line 2
    .line 3
    return-void
.end method

.method protected final showDevLoadingViewForRemoteJSEnabled()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devLoadingViewManager:Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 6
    .line 7
    sget v2, Lcom/facebook/react/R$string;->catalyst_debug_connecting:I

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "getString(...)"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;->showMessage(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devLoadingViewVisible:Z

    .line 23
    .line 24
    return-void
.end method

.method public showDevOptionsDialog()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devOptionsDialog:Landroid/app/AlertDialog;

    .line 2
    .line 3
    if-nez v0, :cond_1d

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isDevSupportEnabled:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1d

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->getDevMenuEnabled()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1d

    .line 14
    .line 15
    invoke-static {}, Landroid/app/ActivityManager;->isUserAMonkey()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_8

    .line 22
    .line 23
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v1, Ljava/util/HashSet;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 34
    .line 35
    sget v3, Lcom/facebook/react/R$string;->catalyst_reload:I

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v3, Lcom/facebook/react/devsupport/N;

    .line 42
    .line 43
    invoke-direct {v3, p0}, Lcom/facebook/react/devsupport/N;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 50
    .line 51
    invoke-interface {v2}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->isDeviceDebugEnabled()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    iget-boolean v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isPackagerConnected:Z

    .line 58
    .line 59
    iget-object v3, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 60
    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    sget v4, Lcom/facebook/react/R$string;->catalyst_debug_open:I

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    sget v4, Lcom/facebook/react/R$string;->catalyst_debug_open_disabled:I

    .line 67
    .line 68
    :goto_0
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    const-string v4, "getString(...)"

    .line 73
    .line 74
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    if-nez v2, :cond_2

    .line 78
    .line 79
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    :cond_2
    new-instance v2, Lcom/facebook/react/devsupport/r;

    .line 83
    .line 84
    invoke-direct {v2, p0}, Lcom/facebook/react/devsupport/r;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->perfMonitorV2Enabled()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    const/4 v3, 0x1

    .line 95
    if-eqz v2, :cond_e

    .line 96
    .line 97
    iget-boolean v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isPackagerConnected:Z

    .line 98
    .line 99
    iget-object v4, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->tracingStateProvider:Lcom/facebook/react/devsupport/interfaces/TracingStateProvider;

    .line 100
    .line 101
    if-eqz v4, :cond_4

    .line 102
    .line 103
    invoke-interface {v4}, Lcom/facebook/react/devsupport/interfaces/TracingStateProvider;->getTracingState()Lcom/facebook/react/devsupport/interfaces/TracingState;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    if-nez v4, :cond_5

    .line 108
    .line 109
    :cond_4
    sget-object v4, Lcom/facebook/react/devsupport/interfaces/TracingState;->DISABLED:Lcom/facebook/react/devsupport/interfaces/TracingState;

    .line 110
    .line 111
    :cond_5
    sget-object v5, Lcom/facebook/react/devsupport/DevSupportManagerBase$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 112
    .line 113
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    aget v6, v5, v6

    .line 118
    .line 119
    const/4 v7, 0x3

    .line 120
    const/4 v8, 0x2

    .line 121
    if-eq v6, v3, :cond_8

    .line 122
    .line 123
    if-eq v6, v8, :cond_7

    .line 124
    .line 125
    if-ne v6, v7, :cond_6

    .line 126
    .line 127
    iget-object v6, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 128
    .line 129
    sget v9, Lcom/facebook/react/R$string;->catalyst_performance_disabled:I

    .line 130
    .line 131
    invoke-virtual {v6, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    goto :goto_1

    .line 136
    :cond_6
    new-instance v0, Li7/m;

    .line 137
    .line 138
    invoke-direct {v0}, Li7/m;-><init>()V

    .line 139
    .line 140
    .line 141
    throw v0

    .line 142
    :cond_7
    iget-object v6, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 143
    .line 144
    sget v9, Lcom/facebook/react/R$string;->catalyst_performance_cdp:I

    .line 145
    .line 146
    invoke-virtual {v6, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    goto :goto_1

    .line 151
    :cond_8
    iget-object v6, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 152
    .line 153
    sget v9, Lcom/facebook/react/R$string;->catalyst_performance_background:I

    .line 154
    .line 155
    invoke-virtual {v6, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    :goto_1
    invoke-static {v6}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    if-eqz v2, :cond_9

    .line 163
    .line 164
    sget-object v2, Lcom/facebook/react/devsupport/interfaces/TracingState;->ENABLEDINCDPMODE:Lcom/facebook/react/devsupport/interfaces/TracingState;

    .line 165
    .line 166
    if-ne v4, v2, :cond_a

    .line 167
    .line 168
    :cond_9
    invoke-interface {v1, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    :cond_a
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    aget v2, v5, v2

    .line 176
    .line 177
    if-eq v2, v3, :cond_d

    .line 178
    .line 179
    if-eq v2, v8, :cond_c

    .line 180
    .line 181
    if-ne v2, v7, :cond_b

    .line 182
    .line 183
    new-instance v2, Lcom/facebook/react/devsupport/t;

    .line 184
    .line 185
    invoke-direct {v2, p0}, Lcom/facebook/react/devsupport/t;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 186
    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_b
    new-instance v0, Li7/m;

    .line 190
    .line 191
    invoke-direct {v0}, Li7/m;-><init>()V

    .line 192
    .line 193
    .line 194
    throw v0

    .line 195
    :cond_c
    new-instance v2, Lcom/facebook/react/devsupport/u;

    .line 196
    .line 197
    invoke-direct {v2}, Lcom/facebook/react/devsupport/u;-><init>()V

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_d
    new-instance v2, Lcom/facebook/react/devsupport/s;

    .line 202
    .line 203
    invoke-direct {v2, p0}, Lcom/facebook/react/devsupport/s;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 204
    .line 205
    .line 206
    :goto_2
    invoke-interface {v0, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    :cond_e
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->perfMonitorV2Enabled()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eqz v2, :cond_12

    .line 214
    .line 215
    iget-boolean v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isPackagerConnected:Z

    .line 216
    .line 217
    iget-object v4, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->perfMonitorOverlayManager:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;

    .line 218
    .line 219
    if-eqz v4, :cond_f

    .line 220
    .line 221
    invoke-virtual {v4}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->isEnabled()Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-ne v4, v3, :cond_f

    .line 226
    .line 227
    iget-object v4, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 228
    .line 229
    sget v5, Lcom/facebook/react/R$string;->catalyst_performance_disable:I

    .line 230
    .line 231
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    goto :goto_3

    .line 236
    :cond_f
    iget-object v4, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 237
    .line 238
    sget v5, Lcom/facebook/react/R$string;->catalyst_performance_enable:I

    .line 239
    .line 240
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    :goto_3
    invoke-static {v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    if-nez v2, :cond_10

    .line 248
    .line 249
    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    :cond_10
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->perfMonitorOverlayManager:Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;

    .line 253
    .line 254
    if-eqz v2, :cond_11

    .line 255
    .line 256
    invoke-virtual {v2}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->isEnabled()Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-ne v2, v3, :cond_11

    .line 261
    .line 262
    new-instance v2, Lcom/facebook/react/devsupport/v;

    .line 263
    .line 264
    invoke-direct {v2, p0}, Lcom/facebook/react/devsupport/v;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 265
    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_11
    new-instance v2, Lcom/facebook/react/devsupport/w;

    .line 269
    .line 270
    invoke-direct {v2, p0}, Lcom/facebook/react/devsupport/w;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 271
    .line 272
    .line 273
    :goto_4
    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    :cond_12
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 277
    .line 278
    sget v4, Lcom/facebook/react/R$string;->catalyst_change_bundle_location:I

    .line 279
    .line 280
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    new-instance v4, Lcom/facebook/react/devsupport/x;

    .line 285
    .line 286
    invoke-direct {v4, p0}, Lcom/facebook/react/devsupport/x;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 287
    .line 288
    .line 289
    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 293
    .line 294
    sget v4, Lcom/facebook/react/R$string;->catalyst_inspector_toggle:I

    .line 295
    .line 296
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    new-instance v4, Lcom/facebook/react/devsupport/y;

    .line 301
    .line 302
    invoke-direct {v4, p0}, Lcom/facebook/react/devsupport/y;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 303
    .line 304
    .line 305
    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 309
    .line 310
    invoke-interface {v2}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->isHotModuleReplacementEnabled()Z

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    if-eqz v2, :cond_13

    .line 315
    .line 316
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 317
    .line 318
    sget v4, Lcom/facebook/react/R$string;->catalyst_hot_reloading_stop:I

    .line 319
    .line 320
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    goto :goto_5

    .line 325
    :cond_13
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 326
    .line 327
    sget v4, Lcom/facebook/react/R$string;->catalyst_hot_reloading:I

    .line 328
    .line 329
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    :goto_5
    invoke-static {v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    new-instance v4, Lcom/facebook/react/devsupport/z;

    .line 337
    .line 338
    invoke-direct {v4, p0}, Lcom/facebook/react/devsupport/z;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 339
    .line 340
    .line 341
    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->perfMonitorV2Enabled()Z

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    if-nez v2, :cond_15

    .line 349
    .line 350
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 351
    .line 352
    invoke-interface {v2}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->isFpsDebugEnabled()Z

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    if-eqz v2, :cond_14

    .line 357
    .line 358
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 359
    .line 360
    sget v4, Lcom/facebook/react/R$string;->catalyst_perf_monitor_stop:I

    .line 361
    .line 362
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    goto :goto_6

    .line 367
    :cond_14
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 368
    .line 369
    sget v4, Lcom/facebook/react/R$string;->catalyst_perf_monitor:I

    .line 370
    .line 371
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    :goto_6
    invoke-static {v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    new-instance v4, Lcom/facebook/react/devsupport/O;

    .line 379
    .line 380
    invoke-direct {v4, p0}, Lcom/facebook/react/devsupport/O;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 381
    .line 382
    .line 383
    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->applicationContext:Landroid/content/Context;

    .line 387
    .line 388
    sget v4, Lcom/facebook/react/R$string;->catalyst_settings:I

    .line 389
    .line 390
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    new-instance v4, Lcom/facebook/react/devsupport/P;

    .line 395
    .line 396
    invoke-direct {v4, p0}, Lcom/facebook/react/devsupport/P;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 397
    .line 398
    .line 399
    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    :cond_15
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->customDevOptions:Ljava/util/LinkedHashMap;

    .line 403
    .line 404
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    if-nez v2, :cond_16

    .line 409
    .line 410
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->customDevOptions:Ljava/util/LinkedHashMap;

    .line 411
    .line 412
    invoke-virtual {v0, v2}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 413
    .line 414
    .line 415
    :cond_16
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    const-string v4, "<get-values>(...)"

    .line 420
    .line 421
    invoke-static {v2, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    const/4 v4, 0x0

    .line 425
    new-array v5, v4, [Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;

    .line 426
    .line 427
    invoke-interface {v2, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    check-cast v2, [Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;

    .line 432
    .line 433
    iget-object v5, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->reactInstanceDevHelper:Lcom/facebook/react/devsupport/ReactInstanceDevHelper;

    .line 434
    .line 435
    invoke-interface {v5}, Lcom/facebook/react/devsupport/ReactInstanceDevHelper;->getCurrentActivity()Landroid/app/Activity;

    .line 436
    .line 437
    .line 438
    move-result-object v5

    .line 439
    if-eqz v5, :cond_1c

    .line 440
    .line 441
    invoke-virtual {v5}, Landroid/app/Activity;->isFinishing()Z

    .line 442
    .line 443
    .line 444
    move-result v6

    .line 445
    if-eqz v6, :cond_17

    .line 446
    .line 447
    goto/16 :goto_7

    .line 448
    .line 449
    :cond_17
    new-instance v6, Landroid/widget/LinearLayout;

    .line 450
    .line 451
    invoke-direct {v6, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v6, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 455
    .line 456
    .line 457
    new-instance v7, Landroid/widget/TextView;

    .line 458
    .line 459
    invoke-direct {v7, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 460
    .line 461
    .line 462
    sget v8, Lcom/facebook/react/R$string;->catalyst_dev_menu_header:I

    .line 463
    .line 464
    invoke-virtual {v5, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v8

    .line 468
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 469
    .line 470
    .line 471
    const/16 v8, 0x32

    .line 472
    .line 473
    invoke-virtual {v7, v4, v8, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 474
    .line 475
    .line 476
    const/16 v8, 0x11

    .line 477
    .line 478
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 479
    .line 480
    .line 481
    const/high16 v9, 0x41800000    # 16.0f

    .line 482
    .line 483
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v7}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 487
    .line 488
    .line 489
    move-result-object v9

    .line 490
    invoke-virtual {v7, v9, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 494
    .line 495
    .line 496
    invoke-direct {p0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->getJSExecutorDescription()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    if-eqz v3, :cond_18

    .line 501
    .line 502
    new-instance v7, Landroid/widget/TextView;

    .line 503
    .line 504
    invoke-direct {v7, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 505
    .line 506
    .line 507
    sget v9, Lcom/facebook/react/R$string;->catalyst_dev_menu_sub_header:I

    .line 508
    .line 509
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    invoke-virtual {v5, v9, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 518
    .line 519
    .line 520
    const/16 v3, 0x14

    .line 521
    .line 522
    invoke-virtual {v7, v4, v3, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 526
    .line 527
    .line 528
    const/high16 v3, 0x41600000    # 14.0f

    .line 529
    .line 530
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 534
    .line 535
    .line 536
    :cond_18
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    const-string v3, "<get-keys>(...)"

    .line 541
    .line 542
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    new-array v3, v4, [Ljava/lang/String;

    .line 546
    .line 547
    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    check-cast v0, [Ljava/lang/String;

    .line 552
    .line 553
    new-instance v3, Lcom/facebook/react/devsupport/DevSupportManagerBase$showDevOptionsDialog$adapter$1;

    .line 554
    .line 555
    invoke-direct {v3, v5, v1, p0, v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase$showDevOptionsDialog$adapter$1;-><init>(Landroid/app/Activity;Ljava/util/Set;Lcom/facebook/react/devsupport/DevSupportManagerBase;[Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 559
    .line 560
    invoke-direct {v0, v5}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0, v6}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    new-instance v1, Lcom/facebook/react/devsupport/Q;

    .line 568
    .line 569
    invoke-direct {v1, v2, p0}, Lcom/facebook/react/devsupport/Q;-><init>([Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v0, v3, v1}, Landroid/app/AlertDialog$Builder;->setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    new-instance v1, Lcom/facebook/react/devsupport/q;

    .line 577
    .line 578
    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/q;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    iput-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devOptionsDialog:Landroid/app/AlertDialog;

    .line 590
    .line 591
    if-eqz v0, :cond_19

    .line 592
    .line 593
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 594
    .line 595
    .line 596
    :cond_19
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 597
    .line 598
    const/16 v1, 0x1e

    .line 599
    .line 600
    if-gt v0, v1, :cond_1b

    .line 601
    .line 602
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devOptionsDialog:Landroid/app/AlertDialog;

    .line 603
    .line 604
    if-eqz v0, :cond_1b

    .line 605
    .line 606
    invoke-virtual {v0}, Landroid/app/AlertDialog;->getListView()Landroid/widget/ListView;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    if-eqz v0, :cond_1b

    .line 611
    .line 612
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 617
    .line 618
    .line 619
    move-result-object v1

    .line 620
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 621
    .line 622
    int-to-double v1, v1

    .line 623
    const-wide v3, 0x3fe6666666666666L    # 0.7

    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    mul-double/2addr v1, v3

    .line 629
    double-to-int v1, v1

    .line 630
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    if-nez v2, :cond_1a

    .line 635
    .line 636
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    .line 637
    .line 638
    const/4 v3, -0x1

    .line 639
    const/4 v4, -0x2

    .line 640
    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 641
    .line 642
    .line 643
    :cond_1a
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 644
    .line 645
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 646
    .line 647
    .line 648
    :cond_1b
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->currentReactContext:Lcom/facebook/react/bridge/ReactContext;

    .line 649
    .line 650
    if-eqz v0, :cond_1d

    .line 651
    .line 652
    const-class v1, Lcom/facebook/react/modules/core/RCTNativeAppEventEmitter;

    .line 653
    .line 654
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    check-cast v0, Lcom/facebook/react/modules/core/RCTNativeAppEventEmitter;

    .line 659
    .line 660
    if-eqz v0, :cond_1d

    .line 661
    .line 662
    const-string v1, "RCTDevMenuShown"

    .line 663
    .line 664
    const/4 v2, 0x0

    .line 665
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/modules/core/RCTNativeAppEventEmitter;->emit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    return-void

    .line 669
    :cond_1c
    :goto_7
    const-string v0, "ReactNative"

    .line 670
    .line 671
    const-string v1, "Unable to launch dev options menu because react activity isn\'t available"

    .line 672
    .line 673
    invoke-static {v0, v1}, Ld2/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    :cond_1d
    :goto_8
    return-void
.end method

.method public showNewJSError(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;I)V
    .locals 1

    .line 1
    invoke-static {p2}, Lcom/facebook/react/devsupport/StackTraceHelper;->convertJsStackTrace(Lcom/facebook/react/bridge/ReadableArray;)[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    sget-object v0, Lcom/facebook/react/devsupport/interfaces/ErrorType;->JS:Lcom/facebook/react/devsupport/interfaces/ErrorType;

    .line 6
    .line 7
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showNewError(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;ILcom/facebook/react/devsupport/interfaces/ErrorType;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public showNewJavaError(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "ReactNative"

    .line 7
    .line 8
    const-string v1, "Exception in native call"

    .line 9
    .line 10
    invoke-static {v0, v1, p2}, Ld2/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, Lcom/facebook/react/devsupport/StackTraceHelper;->convertJavaStackTrace(Ljava/lang/Throwable;)[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const/4 v0, -0x1

    .line 18
    sget-object v1, Lcom/facebook/react/devsupport/interfaces/ErrorType;->NATIVE:Lcom/facebook/react/devsupport/interfaces/ErrorType;

    .line 19
    .line 20
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->showNewError(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;ILcom/facebook/react/devsupport/interfaces/ErrorType;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public showPausedInDebuggerOverlay(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;)V
    .locals 1

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "listener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->pausedInDebuggerOverlayManager:Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, p1, p2}, Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;->showPausedInDebuggerOverlay(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public startInspector()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isDevSupportEnabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devServerHelper:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/DevServerHelper;->openInspectorConnection()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public stopInspector()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->devServerHelper:Lcom/facebook/react/devsupport/DevServerHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/DevServerHelper;->closeInspectorConnection()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public toggleElementInspector()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase;->isDevSupportEnabled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/I;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/I;-><init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method
