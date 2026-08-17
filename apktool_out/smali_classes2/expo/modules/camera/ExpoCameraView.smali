.class public final Lexpo/modules/camera/ExpoCameraView;
.super Lexpo/modules/kotlin/views/ExpoView;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/interfaces/camera/CameraViewInterface;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/camera/ExpoCameraView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00fb\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0002\u0008\u0006\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u001f\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001u\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0083@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010\'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008+\u0010,JA\u00106\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020403j\u0008\u0012\u0004\u0012\u000204`5\u0012\u0004\u0012\u000204022\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020.0-2\u0006\u00101\u001a\u000200H\u0002\u00a2\u0006\u0004\u00086\u00107J\u0017\u00108\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u00088\u0010,J\u000f\u0010:\u001a\u000209H\u0002\u00a2\u0006\u0004\u0008:\u0010;J\u001f\u0010>\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020.H\u0014\u00a2\u0006\u0004\u0008>\u0010?J7\u0010E\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020.2\u0006\u0010B\u001a\u00020.2\u0006\u0010C\u001a\u00020.2\u0006\u0010D\u001a\u00020.H\u0014\u00a2\u0006\u0004\u0008E\u0010FJ\u0019\u0010I\u001a\u00020\u000b2\u0008\u0010H\u001a\u0004\u0018\u00010GH\u0016\u00a2\u0006\u0004\u0008I\u0010JJ1\u0010T\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\n\u0010S\u001a\u00060Qj\u0002`R\u00a2\u0006\u0004\u0008T\u0010UJ\u0015\u0010X\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020V\u00a2\u0006\u0004\u0008X\u0010YJ%\u0010[\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020Z2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O\u00a2\u0006\u0004\u0008[\u0010\\J\r\u0010]\u001a\u00020\u000b\u00a2\u0006\u0004\u0008]\u0010 J\r\u0010^\u001a\u00020\u000b\u00a2\u0006\u0004\u0008^\u0010 J\r\u0010_\u001a\u00020\u000b\u00a2\u0006\u0004\u0008_\u0010 J\u0015\u0010`\u001a\u0008\u0012\u0004\u0012\u00020\u00160-H\u0007\u00a2\u0006\u0004\u0008`\u0010aJ\r\u0010b\u001a\u00020\u000b\u00a2\u0006\u0004\u0008b\u0010 J\r\u0010c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008c\u0010 J\u0015\u0010e\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020\t\u00a2\u0006\u0004\u0008e\u0010\rJ\u0017\u0010h\u001a\u00020\u000b2\u0008\u0010g\u001a\u0004\u0018\u00010f\u00a2\u0006\u0004\u0008h\u0010iJ\u0019\u0010l\u001a\u00020\u000b2\u0008\u0010k\u001a\u0004\u0018\u00010jH\u0016\u00a2\u0006\u0004\u0008l\u0010mJ\u000f\u0010o\u001a\u00020nH\u0016\u00a2\u0006\u0004\u0008o\u0010pJ\u0015\u0010r\u001a\u00020\u000b2\u0006\u0010q\u001a\u000204\u00a2\u0006\u0004\u0008r\u0010sJ\r\u0010t\u001a\u00020\u000b\u00a2\u0006\u0004\u0008t\u0010 R\u001b\u0010z\u001a\u00020u8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008v\u0010w\u001a\u0004\u0008x\u0010yR&\u0010|\u001a\u0004\u0018\u00010{8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0014\n\u0004\u0008|\u0010}\u001a\u0004\u0008~\u0010\u007f\"\u0006\u0008\u0080\u0001\u0010\u0081\u0001R\u001c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0086\u0001\u0010\u0087\u0001R\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0089\u0001\u0010\u008a\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008b\u0001\u0010\u008c\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008d\u0001\u0010\u008e\u0001R \u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0090\u0001\u0010\u0091\u0001R\u001b\u0010\u0092\u0001\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0094\u0001\u0010\u0095\u0001R\u001a\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009c\u0001\u0010\u0095\u0001R\u0019\u0010\u009d\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009d\u0001\u0010\u0095\u0001R3\u0010\u009f\u0001\u001a\u00030\u009e\u00012\u0007\u0010\"\u001a\u00030\u009e\u00018\u0006@FX\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u009f\u0001\u0010\u00a0\u0001\u001a\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001\"\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001R0\u0010\u00a5\u0001\u001a\u00020V2\u0006\u0010\"\u001a\u00020V8\u0006@FX\u0086\u000e\u00a2\u0006\u0017\n\u0006\u0008\u00a5\u0001\u0010\u00a6\u0001\u001a\u0006\u0008\u00a7\u0001\u0010\u00a8\u0001\"\u0005\u0008\u00a9\u0001\u0010YR3\u0010\u00ab\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\"\u001a\u00030\u00aa\u00018\u0006@FX\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001\u001a\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001\"\u0006\u0008\u00af\u0001\u0010\u00b0\u0001R0\u0010\u00b1\u0001\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@FX\u0086\u000e\u00a2\u0006\u0017\n\u0006\u0008\u00b1\u0001\u0010\u00b2\u0001\u001a\u0006\u0008\u00b3\u0001\u0010\u00b4\u0001\"\u0005\u0008\u00b5\u0001\u0010$R3\u0010\u00b7\u0001\u001a\u00030\u00b6\u00012\u0007\u0010\"\u001a\u00030\u00b6\u00018\u0006@FX\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00b7\u0001\u0010\u00b8\u0001\u001a\u0006\u0008\u00b9\u0001\u0010\u00ba\u0001\"\u0006\u0008\u00bb\u0001\u0010\u00bc\u0001R3\u0010\u00be\u0001\u001a\u00030\u00bd\u00012\u0007\u0010\"\u001a\u00030\u00bd\u00018\u0006@FX\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00be\u0001\u0010\u00bf\u0001\u001a\u0006\u0008\u00c0\u0001\u0010\u00c1\u0001\"\u0006\u0008\u00c2\u0001\u0010\u00c3\u0001R5\u0010\u00c4\u0001\u001a\u0004\u0018\u00010.2\u0008\u0010\"\u001a\u0004\u0018\u00010.8\u0006@FX\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00c4\u0001\u0010\u00c5\u0001\u001a\u0006\u0008\u00c6\u0001\u0010\u00c7\u0001\"\u0006\u0008\u00c8\u0001\u0010\u00c9\u0001R3\u0010\u00cb\u0001\u001a\u00030\u00ca\u00012\u0007\u0010\"\u001a\u00030\u00ca\u00018\u0006@FX\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00cb\u0001\u0010\u00cc\u0001\u001a\u0006\u0008\u00cd\u0001\u0010\u00ce\u0001\"\u0006\u0008\u00cf\u0001\u0010\u00d0\u0001R7\u0010\u00d2\u0001\u001a\u0005\u0018\u00010\u00d1\u00012\t\u0010\"\u001a\u0005\u0018\u00010\u00d1\u00018\u0006@FX\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00d2\u0001\u0010\u00d3\u0001\u001a\u0006\u0008\u00d4\u0001\u0010\u00d5\u0001\"\u0006\u0008\u00d6\u0001\u0010\u00d7\u0001R1\u0010\u00d8\u0001\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00168\u0006@FX\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00d8\u0001\u0010\u00d9\u0001\u001a\u0006\u0008\u00da\u0001\u0010\u00db\u0001\"\u0006\u0008\u00dc\u0001\u0010\u00dd\u0001R0\u0010\u00de\u0001\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8\u0006@FX\u0086\u000e\u00a2\u0006\u0017\n\u0006\u0008\u00de\u0001\u0010\u0095\u0001\u001a\u0006\u0008\u00df\u0001\u0010\u00e0\u0001\"\u0005\u0008\u00e1\u0001\u0010\rR(\u0010\u00e2\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0006\u0008\u00e2\u0001\u0010\u0095\u0001\u001a\u0006\u0008\u00e3\u0001\u0010\u00e0\u0001\"\u0005\u0008\u00e4\u0001\u0010\rR(\u0010\u00e5\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0006\u0008\u00e5\u0001\u0010\u0095\u0001\u001a\u0006\u0008\u00e6\u0001\u0010\u00e0\u0001\"\u0005\u0008\u00e7\u0001\u0010\rR2\u0010\u00ed\u0001\u001a\u00020\t2\u0007\u0010\u00e8\u0001\u001a\u00020\t8F@FX\u0086\u008e\u0002\u00a2\u0006\u0017\n\u0006\u0008\u00e9\u0001\u0010\u00ea\u0001\u001a\u0006\u0008\u00eb\u0001\u0010\u00e0\u0001\"\u0005\u0008\u00ec\u0001\u0010\rR\u0019\u0010\u00ee\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ee\u0001\u0010\u00ef\u0001R\u0019\u0010\u00f0\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00f0\u0001\u0010\u00ef\u0001R\'\u0010\u00f6\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0\u00f1\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00f2\u0001\u0010\u00f3\u0001\u001a\u0006\u0008\u00f4\u0001\u0010\u00f5\u0001R(\u0010\u00fa\u0001\u001a\n\u0012\u0005\u0012\u00030\u00f7\u00010\u00f1\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00f8\u0001\u0010\u00f3\u0001\u001a\u0006\u0008\u00f9\u0001\u0010\u00f5\u0001R\'\u00108\u001a\n\u0012\u0005\u0012\u00030\u00fb\u00010\u00f1\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00fc\u0001\u0010\u00f3\u0001\u001a\u0006\u0008\u00fd\u0001\u0010\u00f5\u0001R\'\u0010r\u001a\n\u0012\u0005\u0012\u00030\u00fe\u00010\u00f1\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00ff\u0001\u0010\u00f3\u0001\u001a\u0006\u0008\u0080\u0002\u0010\u00f5\u0001R\u0017\u0010d\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008d\u0010\u0095\u0001R\u0018\u0010\u0084\u0002\u001a\u00030\u0081\u00028BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0082\u0002\u0010\u0083\u0002\u00a8\u0006\u0085\u0002"
    }
    d2 = {
        "Lexpo/modules/camera/ExpoCameraView;",
        "Lexpo/modules/kotlin/views/ExpoView;",
        "Lexpo/modules/interfaces/camera/CameraViewInterface;",
        "Landroid/content/Context;",
        "context",
        "Lexpo/modules/kotlin/AppContext;",
        "appContext",
        "<init>",
        "(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V",
        "",
        "enabled",
        "Li7/B;",
        "setTorchEnabled",
        "(Z)V",
        "createCamera",
        "(Ln7/f;)Ljava/lang/Object;",
        "Landroidx/camera/core/g;",
        "createImageAnalyzer",
        "()Landroidx/camera/core/g;",
        "LS/c;",
        "buildResolutionSelector",
        "()LS/c;",
        "",
        "size",
        "Landroid/util/Size;",
        "parseSizeSafely",
        "(Ljava/lang/String;)Landroid/util/Size;",
        "LZ/m0;",
        "LZ/S;",
        "createVideoCapture",
        "()LZ/m0;",
        "startFocusMetering",
        "()V",
        "",
        "value",
        "setCameraZoom",
        "(F)V",
        "Ly/q;",
        "cameraInfo",
        "observeCameraState",
        "(Ly/q;)V",
        "Lexpo/modules/camera/utils/BarCodeScannerResult;",
        "barcode",
        "transformBarcodeScannerResultToViewCoordinates",
        "(Lexpo/modules/camera/utils/BarCodeScannerResult;)V",
        "",
        "",
        "cornerPoints",
        "Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;",
        "boundingBox",
        "Lkotlin/Pair;",
        "Ljava/util/ArrayList;",
        "Landroid/os/Bundle;",
        "Lkotlin/collections/ArrayList;",
        "getCornerPointsAndBoundingBox",
        "(Ljava/util/List;Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;)Lkotlin/Pair;",
        "onBarcodeScanned",
        "",
        "cancelCoroutineScope",
        "()Ljava/lang/Object;",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "(II)V",
        "changed",
        "left",
        "top",
        "right",
        "bottom",
        "onLayout",
        "(ZIIII)V",
        "Landroid/view/View;",
        "child",
        "onViewAdded",
        "(Landroid/view/View;)V",
        "Lexpo/modules/camera/PictureOptions;",
        "options",
        "Lexpo/modules/kotlin/Promise;",
        "promise",
        "Ljava/io/File;",
        "cacheDirectory",
        "Lexpo/modules/kotlin/runtime/Runtime;",
        "Lexpo/modules/kotlin/RuntimeContext;",
        "runtimeContext",
        "takePicture",
        "(Lexpo/modules/camera/PictureOptions;Lexpo/modules/kotlin/Promise;Ljava/io/File;Lexpo/modules/kotlin/runtime/Runtime;)V",
        "Lexpo/modules/camera/records/FlashMode;",
        "mode",
        "setCameraFlashMode",
        "(Lexpo/modules/camera/records/FlashMode;)V",
        "Lexpo/modules/camera/RecordingOptions;",
        "record",
        "(Lexpo/modules/camera/RecordingOptions;Lexpo/modules/kotlin/Promise;Ljava/io/File;)V",
        "stopRecording",
        "toggleRecording",
        "recreateCamera",
        "getAvailablePictureSizes",
        "()Ljava/util/List;",
        "resumePreview",
        "pausePreview",
        "shouldScanBarcodes",
        "setShouldScanBarcodes",
        "Lexpo/modules/camera/records/BarcodeSettings;",
        "settings",
        "setBarcodeScannerSettings",
        "(Lexpo/modules/camera/records/BarcodeSettings;)V",
        "Landroid/graphics/SurfaceTexture;",
        "surfaceTexture",
        "setPreviewTexture",
        "(Landroid/graphics/SurfaceTexture;)V",
        "",
        "getPreviewSizeAsArray",
        "()[I",
        "response",
        "onPictureSaved",
        "(Landroid/os/Bundle;)V",
        "cleanupCamera",
        "expo/modules/camera/ExpoCameraView$orientationEventListener$2$1",
        "orientationEventListener$delegate",
        "Lkotlin/Lazy;",
        "getOrientationEventListener",
        "()Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;",
        "orientationEventListener",
        "Ly/i;",
        "camera",
        "Ly/i;",
        "getCamera",
        "()Ly/i;",
        "setCamera",
        "(Ly/i;)V",
        "LZ/b0;",
        "activeRecording",
        "LZ/b0;",
        "LY/k;",
        "cameraProvider",
        "LY/k;",
        "Ly/V;",
        "imageCaptureUseCase",
        "Ly/V;",
        "imageAnalysisUseCase",
        "Landroidx/camera/core/g;",
        "recorder",
        "LZ/S;",
        "Lexpo/modules/camera/records/BarcodeType;",
        "barcodeFormats",
        "Ljava/util/List;",
        "glSurfaceTexture",
        "Landroid/graphics/SurfaceTexture;",
        "isRecording",
        "Z",
        "Landroidx/camera/view/m;",
        "previewView",
        "Landroidx/camera/view/m;",
        "LR8/N;",
        "scope",
        "LR8/N;",
        "shouldCreateCamera",
        "previewPaused",
        "Lexpo/modules/camera/records/CameraType;",
        "lensFacing",
        "Lexpo/modules/camera/records/CameraType;",
        "getLensFacing",
        "()Lexpo/modules/camera/records/CameraType;",
        "setLensFacing",
        "(Lexpo/modules/camera/records/CameraType;)V",
        "flashMode",
        "Lexpo/modules/camera/records/FlashMode;",
        "getFlashMode",
        "()Lexpo/modules/camera/records/FlashMode;",
        "setFlashMode",
        "Lexpo/modules/camera/records/CameraMode;",
        "cameraMode",
        "Lexpo/modules/camera/records/CameraMode;",
        "getCameraMode",
        "()Lexpo/modules/camera/records/CameraMode;",
        "setCameraMode",
        "(Lexpo/modules/camera/records/CameraMode;)V",
        "zoom",
        "F",
        "getZoom",
        "()F",
        "setZoom",
        "Lexpo/modules/camera/records/FocusMode;",
        "autoFocus",
        "Lexpo/modules/camera/records/FocusMode;",
        "getAutoFocus",
        "()Lexpo/modules/camera/records/FocusMode;",
        "setAutoFocus",
        "(Lexpo/modules/camera/records/FocusMode;)V",
        "Lexpo/modules/camera/records/VideoQuality;",
        "videoQuality",
        "Lexpo/modules/camera/records/VideoQuality;",
        "getVideoQuality",
        "()Lexpo/modules/camera/records/VideoQuality;",
        "setVideoQuality",
        "(Lexpo/modules/camera/records/VideoQuality;)V",
        "videoEncodingBitrate",
        "Ljava/lang/Integer;",
        "getVideoEncodingBitrate",
        "()Ljava/lang/Integer;",
        "setVideoEncodingBitrate",
        "(Ljava/lang/Integer;)V",
        "Lexpo/modules/camera/records/VideoStabilizationMode;",
        "videoStabilizationMode",
        "Lexpo/modules/camera/records/VideoStabilizationMode;",
        "getVideoStabilizationMode",
        "()Lexpo/modules/camera/records/VideoStabilizationMode;",
        "setVideoStabilizationMode",
        "(Lexpo/modules/camera/records/VideoStabilizationMode;)V",
        "Lexpo/modules/camera/records/CameraRatio;",
        "ratio",
        "Lexpo/modules/camera/records/CameraRatio;",
        "getRatio",
        "()Lexpo/modules/camera/records/CameraRatio;",
        "setRatio",
        "(Lexpo/modules/camera/records/CameraRatio;)V",
        "pictureSize",
        "Ljava/lang/String;",
        "getPictureSize",
        "()Ljava/lang/String;",
        "setPictureSize",
        "(Ljava/lang/String;)V",
        "mirror",
        "getMirror",
        "()Z",
        "setMirror",
        "mute",
        "getMute",
        "setMute",
        "animateShutter",
        "getAnimateShutter",
        "setAnimateShutter",
        "<set-?>",
        "enableTorch$delegate",
        "Lkotlin/properties/d;",
        "getEnableTorch",
        "setEnableTorch",
        "enableTorch",
        "lastWidth",
        "I",
        "lastHeight",
        "Lexpo/modules/kotlin/viewevent/ViewEventCallback;",
        "onCameraReady$delegate",
        "Lexpo/modules/kotlin/viewevent/ViewEventDelegate;",
        "getOnCameraReady",
        "()Lexpo/modules/kotlin/viewevent/ViewEventCallback;",
        "onCameraReady",
        "Lexpo/modules/camera/common/CameraMountErrorEvent;",
        "onMountError$delegate",
        "getOnMountError",
        "onMountError",
        "Lexpo/modules/camera/common/BarcodeScannedEvent;",
        "onBarcodeScanned$delegate",
        "getOnBarcodeScanned",
        "Lexpo/modules/camera/common/PictureSavedEvent;",
        "onPictureSaved$delegate",
        "getOnPictureSaved",
        "Landroidx/appcompat/app/d;",
        "getCurrentActivity",
        "()Landroidx/appcompat/app/d;",
        "currentActivity",
        "expo-camera_release"
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
.field static final synthetic $$delegatedProperties:[LC7/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "LC7/k;"
        }
    .end annotation
.end field


# instance fields
.field private activeRecording:LZ/b0;

.field private animateShutter:Z

.field private autoFocus:Lexpo/modules/camera/records/FocusMode;

.field private barcodeFormats:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lexpo/modules/camera/records/BarcodeType;",
            ">;"
        }
    .end annotation
.end field

.field private camera:Ly/i;

.field private cameraMode:Lexpo/modules/camera/records/CameraMode;

.field private cameraProvider:LY/k;

.field private final enableTorch$delegate:Lkotlin/properties/d;

.field private flashMode:Lexpo/modules/camera/records/FlashMode;

.field private glSurfaceTexture:Landroid/graphics/SurfaceTexture;

.field private imageAnalysisUseCase:Landroidx/camera/core/g;

.field private imageCaptureUseCase:Ly/V;

.field private isRecording:Z

.field private lastHeight:I

.field private lastWidth:I

.field private lensFacing:Lexpo/modules/camera/records/CameraType;

.field private mirror:Z

.field private mute:Z

.field private final onBarcodeScanned$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

.field private final onCameraReady$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

.field private final onMountError$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

.field private final onPictureSaved$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

.field private final orientationEventListener$delegate:Lkotlin/Lazy;

.field private pictureSize:Ljava/lang/String;

.field private previewPaused:Z

.field private previewView:Landroidx/camera/view/m;

.field private ratio:Lexpo/modules/camera/records/CameraRatio;

.field private recorder:LZ/S;

.field private final scope:LR8/N;

.field private shouldCreateCamera:Z

.field private shouldScanBarcodes:Z

.field private videoEncodingBitrate:Ljava/lang/Integer;

.field private videoQuality:Lexpo/modules/camera/records/VideoQuality;

.field private videoStabilizationMode:Lexpo/modules/camera/records/VideoStabilizationMode;

.field private zoom:F


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lkotlin/jvm/internal/p;

    .line 2
    .line 3
    const-class v1, Lexpo/modules/camera/ExpoCameraView;

    .line 4
    .line 5
    const-string v2, "enableTorch"

    .line 6
    .line 7
    const-string v3, "getEnableTorch()Z"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v2, Lkotlin/jvm/internal/v;

    .line 18
    .line 19
    const-string v3, "onCameraReady"

    .line 20
    .line 21
    const-string v5, "getOnCameraReady()Lexpo/modules/kotlin/viewevent/ViewEventCallback;"

    .line 22
    .line 23
    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/v;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/D;->k(Lkotlin/jvm/internal/u;)LC7/m;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-instance v3, Lkotlin/jvm/internal/v;

    .line 31
    .line 32
    const-string v5, "onMountError"

    .line 33
    .line 34
    const-string v6, "getOnMountError()Lexpo/modules/kotlin/viewevent/ViewEventCallback;"

    .line 35
    .line 36
    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/v;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Lkotlin/jvm/internal/D;->k(Lkotlin/jvm/internal/u;)LC7/m;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-instance v5, Lkotlin/jvm/internal/v;

    .line 44
    .line 45
    const-string v6, "onBarcodeScanned"

    .line 46
    .line 47
    const-string v7, "getOnBarcodeScanned()Lexpo/modules/kotlin/viewevent/ViewEventCallback;"

    .line 48
    .line 49
    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/v;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v5}, Lkotlin/jvm/internal/D;->k(Lkotlin/jvm/internal/u;)LC7/m;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    new-instance v6, Lkotlin/jvm/internal/v;

    .line 57
    .line 58
    const-string v7, "onPictureSaved"

    .line 59
    .line 60
    const-string v8, "getOnPictureSaved()Lexpo/modules/kotlin/viewevent/ViewEventCallback;"

    .line 61
    .line 62
    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/v;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v6}, Lkotlin/jvm/internal/D;->k(Lkotlin/jvm/internal/u;)LC7/m;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const/4 v6, 0x5

    .line 70
    new-array v6, v6, [LC7/k;

    .line 71
    .line 72
    aput-object v0, v6, v4

    .line 73
    .line 74
    const/4 v0, 0x1

    .line 75
    aput-object v2, v6, v0

    .line 76
    .line 77
    const/4 v0, 0x2

    .line 78
    aput-object v3, v6, v0

    .line 79
    .line 80
    const/4 v0, 0x3

    .line 81
    aput-object v5, v6, v0

    .line 82
    .line 83
    const/4 v0, 0x4

    .line 84
    aput-object v1, v6, v0

    .line 85
    .line 86
    sput-object v6, Lexpo/modules/camera/ExpoCameraView;->$$delegatedProperties:[LC7/k;

    .line 87
    .line 88
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "appContext"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lexpo/modules/kotlin/views/ExpoView;-><init>(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Lexpo/modules/camera/c;

    .line 15
    .line 16
    invoke-direct {v0, p2, p0}, Lexpo/modules/camera/c;-><init>(Lexpo/modules/kotlin/AppContext;Lexpo/modules/camera/ExpoCameraView;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iput-object p2, p0, Lexpo/modules/camera/ExpoCameraView;->orientationEventListener$delegate:Lkotlin/Lazy;

    .line 24
    .line 25
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iput-object p2, p0, Lexpo/modules/camera/ExpoCameraView;->barcodeFormats:Ljava/util/List;

    .line 30
    .line 31
    new-instance p2, Landroidx/camera/view/m;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Landroidx/camera/view/m;-><init>(Landroid/content/Context;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    invoke-virtual {p2, p1}, Landroid/view/View;->setElevation(F)V

    .line 38
    .line 39
    .line 40
    iput-object p2, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 41
    .line 42
    invoke-static {}, LR8/d0;->c()LR8/K0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, LR8/O;->a(Ln7/j;)LR8/N;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->scope:LR8/N;

    .line 51
    .line 52
    sget-object p1, Lexpo/modules/camera/records/CameraType;->BACK:Lexpo/modules/camera/records/CameraType;

    .line 53
    .line 54
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->lensFacing:Lexpo/modules/camera/records/CameraType;

    .line 55
    .line 56
    sget-object p1, Lexpo/modules/camera/records/FlashMode;->OFF:Lexpo/modules/camera/records/FlashMode;

    .line 57
    .line 58
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->flashMode:Lexpo/modules/camera/records/FlashMode;

    .line 59
    .line 60
    sget-object p1, Lexpo/modules/camera/records/CameraMode;->PICTURE:Lexpo/modules/camera/records/CameraMode;

    .line 61
    .line 62
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->cameraMode:Lexpo/modules/camera/records/CameraMode;

    .line 63
    .line 64
    sget-object p1, Lexpo/modules/camera/records/FocusMode;->OFF:Lexpo/modules/camera/records/FocusMode;

    .line 65
    .line 66
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->autoFocus:Lexpo/modules/camera/records/FocusMode;

    .line 67
    .line 68
    sget-object p1, Lexpo/modules/camera/records/VideoQuality;->VIDEO1080P:Lexpo/modules/camera/records/VideoQuality;

    .line 69
    .line 70
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->videoQuality:Lexpo/modules/camera/records/VideoQuality;

    .line 71
    .line 72
    sget-object p1, Lexpo/modules/camera/records/VideoStabilizationMode;->AUTO:Lexpo/modules/camera/records/VideoStabilizationMode;

    .line 73
    .line 74
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->videoStabilizationMode:Lexpo/modules/camera/records/VideoStabilizationMode;

    .line 75
    .line 76
    const-string p1, ""

    .line 77
    .line 78
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->pictureSize:Ljava/lang/String;

    .line 79
    .line 80
    const/4 p1, 0x1

    .line 81
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->animateShutter:Z

    .line 82
    .line 83
    sget-object p1, Lkotlin/properties/a;->a:Lkotlin/properties/a;

    .line 84
    .line 85
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 86
    .line 87
    new-instance p2, Lexpo/modules/camera/ExpoCameraView$special$$inlined$observable$1;

    .line 88
    .line 89
    invoke-direct {p2, p1, p0}, Lexpo/modules/camera/ExpoCameraView$special$$inlined$observable$1;-><init>(Ljava/lang/Object;Lexpo/modules/camera/ExpoCameraView;)V

    .line 90
    .line 91
    .line 92
    iput-object p2, p0, Lexpo/modules/camera/ExpoCameraView;->enableTorch$delegate:Lkotlin/properties/d;

    .line 93
    .line 94
    new-instance p1, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 95
    .line 96
    const/4 p2, 0x0

    .line 97
    invoke-direct {p1, p0, p2}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 98
    .line 99
    .line 100
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->onCameraReady$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 101
    .line 102
    new-instance p1, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 103
    .line 104
    invoke-direct {p1, p0, p2}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 105
    .line 106
    .line 107
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->onMountError$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 108
    .line 109
    new-instance p1, Lexpo/modules/camera/d;

    .line 110
    .line 111
    invoke-direct {p1}, Lexpo/modules/camera/d;-><init>()V

    .line 112
    .line 113
    .line 114
    new-instance p2, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 115
    .line 116
    invoke-direct {p2, p0, p1}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 117
    .line 118
    .line 119
    iput-object p2, p0, Lexpo/modules/camera/ExpoCameraView;->onBarcodeScanned$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 120
    .line 121
    new-instance p1, Lexpo/modules/camera/e;

    .line 122
    .line 123
    invoke-direct {p1}, Lexpo/modules/camera/e;-><init>()V

    .line 124
    .line 125
    .line 126
    new-instance p2, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 127
    .line 128
    invoke-direct {p2, p0, p1}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 129
    .line 130
    .line 131
    iput-object p2, p0, Lexpo/modules/camera/ExpoCameraView;->onPictureSaved$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 132
    .line 133
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->getOrientationEventListener()Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p1}, Landroid/view/OrientationEventListener;->enable()V

    .line 138
    .line 139
    .line 140
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 141
    .line 142
    new-instance p2, Lexpo/modules/camera/ExpoCameraView$1;

    .line 143
    .line 144
    invoke-direct {p2, p0}, Lexpo/modules/camera/ExpoCameraView$1;-><init>(Lexpo/modules/camera/ExpoCameraView;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    .line 148
    .line 149
    .line 150
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 151
    .line 152
    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    .line 153
    .line 154
    const/4 v0, -0x1

    .line 155
    invoke-direct {p2, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 159
    .line 160
    .line 161
    return-void
.end method

.method public static final synthetic access$createCamera(Lexpo/modules/camera/ExpoCameraView;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->createCamera(Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getImageAnalysisUseCase$p(Lexpo/modules/camera/ExpoCameraView;)Landroidx/camera/core/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/camera/ExpoCameraView;->imageAnalysisUseCase:Landroidx/camera/core/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getImageCaptureUseCase$p(Lexpo/modules/camera/ExpoCameraView;)Ly/V;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/camera/ExpoCameraView;->imageCaptureUseCase:Ly/V;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getScope$p(Lexpo/modules/camera/ExpoCameraView;)LR8/N;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/camera/ExpoCameraView;->scope:LR8/N;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$setTorchEnabled(Lexpo/modules/camera/ExpoCameraView;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->setTorchEnabled(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/camera/utils/BarCodeScannerResult;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->createImageAnalyzer$lambda$24$lambda$23(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/camera/utils/BarCodeScannerResult;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final buildResolutionSelector()LS/c;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->pictureSize:Ljava/lang/String;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->pictureSize:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lexpo/modules/camera/ExpoCameraView;->parseSizeSafely(Ljava/lang/String;)Landroid/util/Size;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v1, LS/d;

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    invoke-direct {v1, v0, v2}, LS/d;-><init>(Landroid/util/Size;I)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v1, LS/d;->c:LS/d;

    .line 25
    .line 26
    const-string v0, "HIGHEST_AVAILABLE_STRATEGY"

    .line 27
    .line 28
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    sget-object v1, LS/d;->c:LS/d;

    .line 33
    .line 34
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->ratio:Lexpo/modules/camera/records/CameraRatio;

    .line 38
    .line 39
    sget-object v2, Lexpo/modules/camera/records/CameraRatio;->ONE_ONE:Lexpo/modules/camera/records/CameraRatio;

    .line 40
    .line 41
    if-ne v0, v2, :cond_2

    .line 42
    .line 43
    new-instance v0, LS/c$a;

    .line 44
    .line 45
    invoke-direct {v0}, LS/c$a;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v2, Lexpo/modules/camera/f;

    .line 49
    .line 50
    invoke-direct {v2}, Lexpo/modules/camera/f;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, LS/c$a;->e(LS/b;)LS/c$a;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0, v1}, LS/c$a;->f(LS/d;)LS/c$a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, LS/c$a;->a()LS/c;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_2
    new-instance v0, LS/c$a;

    .line 70
    .line 71
    invoke-direct {v0}, LS/c$a;-><init>()V

    .line 72
    .line 73
    .line 74
    iget-object v2, p0, Lexpo/modules/camera/ExpoCameraView;->ratio:Lexpo/modules/camera/records/CameraRatio;

    .line 75
    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    invoke-virtual {v2}, Lexpo/modules/camera/records/CameraRatio;->mapToStrategy()LS/a;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v0, v2}, LS/c$a;->d(LS/a;)LS/c$a;

    .line 83
    .line 84
    .line 85
    :cond_3
    invoke-virtual {v0, v1}, LS/c$a;->f(LS/d;)LS/c$a;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, LS/c$a;->a()LS/c;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-object v0
.end method

.method private static final buildResolutionSelector$lambda$27(Ljava/util/List;I)Ljava/util/List;
    .locals 3

    .line 1
    const-string p1, "supportedSizes"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v1, v0

    .line 26
    check-cast v1, Landroid/util/Size;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-ne v2, v1, :cond_0

    .line 37
    .line 38
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-object p1
.end method

.method public static synthetic c(Lexpo/modules/camera/common/PictureSavedEvent;)S
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/camera/ExpoCameraView;->onPictureSaved_delegate$lambda$5(Lexpo/modules/camera/common/PictureSavedEvent;)S

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final cancelCoroutineScope()Ljava/lang/Object;
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->scope:LR8/N;

    .line 2
    .line 3
    new-instance v1, Lexpo/modules/core/errors/ModuleDestroyedException;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v1, v3, v2, v3}, Lexpo/modules/core/errors/ModuleDestroyedException;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, LR8/O;->b(LR8/N;Ljava/util/concurrent/CancellationException;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :catch_0
    sget-object v0, Lexpo/modules/camera/CameraViewModule;->Companion:Lexpo/modules/camera/CameraViewModule$Companion;

    .line 17
    .line 18
    invoke-virtual {v0}, Lexpo/modules/camera/CameraViewModule$Companion;->getTAG$expo_camera_release()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "The scope does not have a job in it"

    .line 23
    .line 24
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method

.method private final createCamera(Ln7/f;)Ljava/lang/Object;
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnsafeOptInUsageError"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lexpo/modules/camera/ExpoCameraView$createCamera$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lexpo/modules/camera/ExpoCameraView$createCamera$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/camera/ExpoCameraView$createCamera$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/camera/ExpoCameraView$createCamera$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/camera/ExpoCameraView$createCamera$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lexpo/modules/camera/ExpoCameraView$createCamera$1;-><init>(Lexpo/modules/camera/ExpoCameraView;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lexpo/modules/camera/ExpoCameraView$createCamera$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/camera/ExpoCameraView$createCamera$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    .line 54
    .line 55
    if-eqz p1, :cond_10

    .line 56
    .line 57
    iget-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->previewPaused:Z

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    goto/16 :goto_6

    .line 62
    .line 63
    :cond_3
    const/4 p1, 0x0

    .line 64
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    .line 65
    .line 66
    sget-object p1, LY/k;->b:LY/k$a;

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const-string v4, "getContext(...)"

    .line 73
    .line 74
    invoke-static {v2, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iput v3, v0, Lexpo/modules/camera/ExpoCameraView$createCamera$1;->label:I

    .line 78
    .line 79
    invoke-static {p1, v2, v0}, LY/l;->a(LY/k$a;Landroid/content/Context;Ln7/f;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-ne p1, v1, :cond_4

    .line 84
    .line 85
    return-object v1

    .line 86
    :cond_4
    :goto_1
    check-cast p1, LY/k;

    .line 87
    .line 88
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->ratio:Lexpo/modules/camera/records/CameraRatio;

    .line 89
    .line 90
    if-eqz v0, :cond_7

    .line 91
    .line 92
    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 93
    .line 94
    sget-object v2, Lexpo/modules/camera/records/CameraRatio;->FOUR_THREE:Lexpo/modules/camera/records/CameraRatio;

    .line 95
    .line 96
    if-eq v0, v2, :cond_6

    .line 97
    .line 98
    sget-object v2, Lexpo/modules/camera/records/CameraRatio;->SIXTEEN_NINE:Lexpo/modules/camera/records/CameraRatio;

    .line 99
    .line 100
    if-ne v0, v2, :cond_5

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    sget-object v0, Landroidx/camera/view/m$d;->i:Landroidx/camera/view/m$d;

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    :goto_2
    sget-object v0, Landroidx/camera/view/m$d;->l:Landroidx/camera/view/m$d;

    .line 107
    .line 108
    :goto_3
    invoke-virtual {v1, v0}, Landroidx/camera/view/m;->setScaleType(Landroidx/camera/view/m$d;)V

    .line 109
    .line 110
    .line 111
    :cond_7
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->buildResolutionSelector()LS/c;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    new-instance v1, Ly/p0$a;

    .line 116
    .line 117
    invoke-direct {v1}, Ly/p0$a;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v0}, Ly/p0$a;->k(LS/c;)Ly/p0$a;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v1}, Ly/p0$a;->e()Ly/p0;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    iget-object v2, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 129
    .line 130
    invoke-virtual {v2}, Landroidx/camera/view/m;->getSurfaceProvider()Ly/p0$c;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v1, v2}, Ly/p0;->p0(Ly/p0$c;)V

    .line 135
    .line 136
    .line 137
    const-string v2, "also(...)"

    .line 138
    .line 139
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    iget-object v2, p0, Lexpo/modules/camera/ExpoCameraView;->glSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 143
    .line 144
    if-eqz v2, :cond_8

    .line 145
    .line 146
    iget-object v3, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 147
    .line 148
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    iget-object v4, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 153
    .line 154
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    invoke-virtual {v2, v3, v4}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 159
    .line 160
    .line 161
    new-instance v3, Lexpo/modules/camera/i;

    .line 162
    .line 163
    invoke-direct {v3, v2, p0}, Lexpo/modules/camera/i;-><init>(Landroid/graphics/SurfaceTexture;Lexpo/modules/camera/ExpoCameraView;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v3}, Ly/p0;->p0(Ly/p0$c;)V

    .line 167
    .line 168
    .line 169
    :cond_8
    new-instance v2, Ly/s$a;

    .line 170
    .line 171
    invoke-direct {v2}, Ly/s$a;-><init>()V

    .line 172
    .line 173
    .line 174
    iget-object v3, p0, Lexpo/modules/camera/ExpoCameraView;->lensFacing:Lexpo/modules/camera/records/CameraType;

    .line 175
    .line 176
    invoke-virtual {v3}, Lexpo/modules/camera/records/CameraType;->mapToCharacteristic()I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    invoke-virtual {v2, v3}, Ly/s$a;->b(I)Ly/s$a;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v2}, Ly/s$a;->a()Ly/s;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    const-string v3, "build(...)"

    .line 189
    .line 190
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    iget-object v4, p0, Lexpo/modules/camera/ExpoCameraView;->flashMode:Lexpo/modules/camera/records/FlashMode;

    .line 194
    .line 195
    sget-object v5, Lexpo/modules/camera/records/FlashMode;->SCREEN:Lexpo/modules/camera/records/FlashMode;

    .line 196
    .line 197
    if-ne v4, v5, :cond_9

    .line 198
    .line 199
    iget-object v6, p0, Lexpo/modules/camera/ExpoCameraView;->lensFacing:Lexpo/modules/camera/records/CameraType;

    .line 200
    .line 201
    sget-object v7, Lexpo/modules/camera/records/CameraType;->FRONT:Lexpo/modules/camera/records/CameraType;

    .line 202
    .line 203
    if-eq v6, v7, :cond_9

    .line 204
    .line 205
    sget-object v4, Lexpo/modules/camera/records/FlashMode;->ON:Lexpo/modules/camera/records/FlashMode;

    .line 206
    .line 207
    :cond_9
    if-ne v4, v5, :cond_a

    .line 208
    .line 209
    invoke-virtual {p0}, Lexpo/modules/kotlin/views/ExpoView;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    invoke-virtual {v6}, Lexpo/modules/kotlin/AppContext;->getCurrentActivity()Landroid/app/Activity;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    if-eqz v6, :cond_a

    .line 218
    .line 219
    invoke-virtual {v6}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    if-eqz v6, :cond_a

    .line 224
    .line 225
    iget-object v7, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 226
    .line 227
    invoke-virtual {v7, v6}, Landroidx/camera/view/m;->setScreenFlashWindow(Landroid/view/Window;)V

    .line 228
    .line 229
    .line 230
    :cond_a
    new-instance v6, Ly/V$b;

    .line 231
    .line 232
    invoke-direct {v6}, Ly/V$b;-><init>()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v6, v0}, Ly/V$b;->l(LS/c;)Ly/V$b;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {v4}, Lexpo/modules/camera/records/FlashMode;->mapToLens()I

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    invoke-virtual {v0, v6}, Ly/V$b;->j(I)Ly/V$b;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    const-string v6, "setFlashMode(...)"

    .line 248
    .line 249
    invoke-static {v0, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    if-ne v4, v5, :cond_b

    .line 253
    .line 254
    iget-object v4, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 255
    .line 256
    invoke-virtual {v4}, Landroidx/camera/view/m;->getScreenFlash()Ly/V$i;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    if-eqz v4, :cond_b

    .line 261
    .line 262
    invoke-virtual {v0, v4}, Ly/V$b;->m(Ly/V$i;)Ly/V$b;

    .line 263
    .line 264
    .line 265
    :cond_b
    invoke-virtual {v0}, Ly/V$b;->e()Ly/V;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    iput-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->imageCaptureUseCase:Ly/V;

    .line 270
    .line 271
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->createVideoCapture()LZ/m0;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->createImageAnalyzer()Landroidx/camera/core/g;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    iput-object v4, p0, Lexpo/modules/camera/ExpoCameraView;->imageAnalysisUseCase:Landroidx/camera/core/g;

    .line 280
    .line 281
    new-instance v4, Ly/K0$a;

    .line 282
    .line 283
    invoke-direct {v4}, Ly/K0$a;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v4, v1}, Ly/K0$a;->a(Ly/J0;)Ly/K0$a;

    .line 287
    .line 288
    .line 289
    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView;->cameraMode:Lexpo/modules/camera/records/CameraMode;

    .line 290
    .line 291
    sget-object v5, Lexpo/modules/camera/records/CameraMode;->PICTURE:Lexpo/modules/camera/records/CameraMode;

    .line 292
    .line 293
    if-ne v1, v5, :cond_d

    .line 294
    .line 295
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->imageCaptureUseCase:Ly/V;

    .line 296
    .line 297
    if-eqz v0, :cond_c

    .line 298
    .line 299
    invoke-virtual {v4, v0}, Ly/K0$a;->a(Ly/J0;)Ly/K0$a;

    .line 300
    .line 301
    .line 302
    :cond_c
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->imageAnalysisUseCase:Landroidx/camera/core/g;

    .line 303
    .line 304
    if-eqz v0, :cond_e

    .line 305
    .line 306
    invoke-virtual {v4, v0}, Ly/K0$a;->a(Ly/J0;)Ly/K0$a;

    .line 307
    .line 308
    .line 309
    goto :goto_4

    .line 310
    :cond_d
    invoke-virtual {v4, v0}, Ly/K0$a;->a(Ly/J0;)Ly/K0$a;

    .line 311
    .line 312
    .line 313
    :cond_e
    :goto_4
    invoke-virtual {v4}, Ly/K0$a;->b()Ly/K0;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    :try_start_0
    invoke-virtual {p1}, LY/k;->f()V

    .line 321
    .line 322
    .line 323
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->getCurrentActivity()Landroidx/appcompat/app/d;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    invoke-virtual {p1, v1, v2, v0}, LY/k;->d(Landroidx/lifecycle/r;Ly/s;Ly/K0;)Ly/i;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    iput-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Ly/i;

    .line 332
    .line 333
    if-eqz v0, :cond_f

    .line 334
    .line 335
    invoke-interface {v0}, Ly/i;->d()Ly/q;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    const-string v1, "getCameraInfo(...)"

    .line 340
    .line 341
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-direct {p0, v0}, Lexpo/modules/camera/ExpoCameraView;->observeCameraState(Ly/q;)V

    .line 345
    .line 346
    .line 347
    :cond_f
    iget v0, p0, Lexpo/modules/camera/ExpoCameraView;->zoom:F

    .line 348
    .line 349
    invoke-direct {p0, v0}, Lexpo/modules/camera/ExpoCameraView;->setCameraZoom(F)V

    .line 350
    .line 351
    .line 352
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->cameraProvider:LY/k;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :catch_0
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->getOnMountError()Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    new-instance v0, Lexpo/modules/camera/common/CameraMountErrorEvent;

    .line 360
    .line 361
    const-string v1, "Camera component could not be rendered - is there any other instance running?"

    .line 362
    .line 363
    invoke-direct {v0, v1}, Lexpo/modules/camera/common/CameraMountErrorEvent;-><init>(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    invoke-interface {p1, v0}, Lexpo/modules/kotlin/viewevent/ViewEventCallback;->invoke(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    :goto_5
    sget-object p1, Li7/B;->a:Li7/B;

    .line 370
    .line 371
    return-object p1

    .line 372
    :cond_10
    :goto_6
    sget-object p1, Li7/B;->a:Li7/B;

    .line 373
    .line 374
    return-object p1
.end method

.method private static final createCamera$lambda$16$lambda$15(Landroid/graphics/SurfaceTexture;Lexpo/modules/camera/ExpoCameraView;Ly/I0;)V
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/view/Surface;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Landroidx/core/content/a;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance p1, Lexpo/modules/camera/b;

    .line 20
    .line 21
    invoke-direct {p1, v0}, Lexpo/modules/camera/b;-><init>(Landroid/view/Surface;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, v0, p0, p1}, Ly/I0;->w(Landroid/view/Surface;Ljava/util/concurrent/Executor;LH0/a;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private static final createCamera$lambda$16$lambda$15$lambda$14(Landroid/view/Surface;Ly/I0$g;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/Surface;->release()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final createImageAnalyzer()Landroidx/camera/core/g;
    .locals 5

    .line 1
    new-instance v0, Landroidx/camera/core/g$c;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/camera/core/g$c;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LS/c$a;

    .line 7
    .line 8
    invoke-direct {v1}, LS/c$a;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v2, LS/d;->c:LS/d;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, LS/c$a;->f(LS/d;)LS/c$a;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, LS/c$a;->a()LS/c;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Landroidx/camera/core/g$c;->l(LS/c;)Landroidx/camera/core/g$c;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {v0, v1}, Landroidx/camera/core/g$c;->h(I)Landroidx/camera/core/g$c;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Landroidx/camera/core/g$c;->e()Landroidx/camera/core/g;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "build(...)"

    .line 35
    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-boolean v1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldScanBarcodes:Z

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    sget-object v1, Lexpo/modules/camera/utils/CameraUtils;->INSTANCE:Lexpo/modules/camera/utils/CameraUtils;

    .line 44
    .line 45
    invoke-virtual {v1}, Lexpo/modules/camera/utils/CameraUtils;->isMLKitBarcodeScannerAvailable()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1}, Landroidx/core/content/a;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    new-instance v2, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;

    .line 60
    .line 61
    iget-object v3, p0, Lexpo/modules/camera/ExpoCameraView;->barcodeFormats:Ljava/util/List;

    .line 62
    .line 63
    new-instance v4, Lexpo/modules/camera/g;

    .line 64
    .line 65
    invoke-direct {v4, p0}, Lexpo/modules/camera/g;-><init>(Lexpo/modules/camera/ExpoCameraView;)V

    .line 66
    .line 67
    .line 68
    invoke-direct {v2, v3, v4}, Lexpo/modules/camera/analyzers/BarcodeAnalyzer;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1, v2}, Landroidx/camera/core/g;->t0(Ljava/util/concurrent/Executor;Landroidx/camera/core/g$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :catch_0
    move-exception v1

    .line 76
    sget-object v2, Lexpo/modules/camera/CameraViewModule;->Companion:Lexpo/modules/camera/CameraViewModule$Companion;

    .line 77
    .line 78
    invoke-virtual {v2}, Lexpo/modules/camera/CameraViewModule$Companion;->getTAG$expo_camera_release()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    :cond_0
    return-object v0
.end method

.method private static final createImageAnalyzer$lambda$24$lambda$23(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/camera/utils/BarCodeScannerResult;)Li7/B;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->onBarcodeScanned(Lexpo/modules/camera/utils/BarCodeScannerResult;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Li7/B;->a:Li7/B;

    .line 10
    .line 11
    return-object p0
.end method

.method private final createVideoCapture()LZ/m0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ/m0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->videoQuality:Lexpo/modules/camera/records/VideoQuality;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/camera/records/VideoQuality;->mapToQuality()LZ/v;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, LZ/p;->a(LZ/v;)LZ/p;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "higherQualityOrLowerThan(...)"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, LZ/y;->d(LZ/v;LZ/p;)LZ/y;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "from(...)"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, LZ/S$i;

    .line 26
    .line 27
    invoke-direct {v1}, LZ/S$i;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lexpo/modules/camera/ExpoCameraView;->videoEncodingBitrate:Ljava/lang/Integer;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {v1, v2}, LZ/S$i;->f(I)LZ/S$i;

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2}, Landroidx/core/content/a;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v1, v2}, LZ/S$i;->d(Ljava/util/concurrent/Executor;)LZ/S$i;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1, v0}, LZ/S$i;->e(LZ/y;)LZ/S$i;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, LZ/S$i;->c()LZ/S;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->recorder:LZ/S;

    .line 62
    .line 63
    const-string v1, "also(...)"

    .line 64
    .line 65
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance v1, LZ/m0$d;

    .line 69
    .line 70
    invoke-direct {v1, v0}, LZ/m0$d;-><init>(LZ/x0;)V

    .line 71
    .line 72
    .line 73
    iget-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->mirror:Z

    .line 74
    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    const/4 v0, 0x2

    .line 78
    invoke-virtual {v1, v0}, LZ/m0$d;->k(I)LZ/m0$d;

    .line 79
    .line 80
    .line 81
    :cond_1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->videoStabilizationMode:Lexpo/modules/camera/records/VideoStabilizationMode;

    .line 82
    .line 83
    invoke-virtual {v0}, Lexpo/modules/camera/records/VideoStabilizationMode;->isEnabled()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-virtual {v1, v0}, LZ/m0$d;->s(Z)LZ/m0$d;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, LZ/m0$d;->e()LZ/m0;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v1, "build(...)"

    .line 95
    .line 96
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-object v0
.end method

.method public static synthetic d(Landroid/graphics/SurfaceTexture;Lexpo/modules/camera/ExpoCameraView;Ly/I0;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/camera/ExpoCameraView;->createCamera$lambda$16$lambda$15(Landroid/graphics/SurfaceTexture;Lexpo/modules/camera/ExpoCameraView;Ly/I0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lexpo/modules/kotlin/AppContext;Lexpo/modules/camera/ExpoCameraView;)Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->orientationEventListener_delegate$lambda$0(Lexpo/modules/kotlin/AppContext;Lexpo/modules/camera/ExpoCameraView;)Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(Landroid/view/Surface;Ly/I0$g;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->createCamera$lambda$16$lambda$15$lambda$14(Landroid/view/Surface;Ly/I0$g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lexpo/modules/camera/common/BarcodeScannedEvent;)S
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/camera/ExpoCameraView;->onBarcodeScanned_delegate$lambda$4(Lexpo/modules/camera/common/BarcodeScannedEvent;)S

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final getCornerPointsAndBoundingBox(Ljava/util/List;Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;)Lkotlin/Pair;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/util/ArrayList<",
            "Landroid/os/Bundle;",
            ">;",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/lit8 v2, v2, -0x1

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-static {v4, v2, v3}, Lq7/c;->b(III)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const-string v3, "y"

    .line 31
    .line 32
    const-string v5, "x"

    .line 33
    .line 34
    if-ltz v2, :cond_0

    .line 35
    .line 36
    :goto_0
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    check-cast v6, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    int-to-float v6, v6

    .line 47
    div-float/2addr v6, v0

    .line 48
    add-int/lit8 v7, v4, 0x1

    .line 49
    .line 50
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    check-cast v7, Ljava/lang/Number;

    .line 55
    .line 56
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    int-to-float v7, v7

    .line 61
    div-float/2addr v7, v0

    .line 62
    new-instance v8, Landroid/os/Bundle;

    .line 63
    .line 64
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v8, v5, v6}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v8, v3, v7}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    if-eq v4, v2, :cond_0

    .line 77
    .line 78
    add-int/lit8 v4, v4, 0x2

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    new-instance p1, Landroid/os/Bundle;

    .line 82
    .line 83
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 84
    .line 85
    .line 86
    new-instance v2, Landroid/os/Bundle;

    .line 87
    .line 88
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;->getX()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    int-to-float v4, v4

    .line 96
    div-float/2addr v4, v0

    .line 97
    invoke-virtual {v2, v5, v4}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;->getY()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    int-to-float v4, v4

    .line 105
    div-float/2addr v4, v0

    .line 106
    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 107
    .line 108
    .line 109
    sget-object v3, Li7/B;->a:Li7/B;

    .line 110
    .line 111
    const-string v3, "origin"

    .line 112
    .line 113
    invoke-virtual {p1, v3, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 114
    .line 115
    .line 116
    new-instance v2, Landroid/os/Bundle;

    .line 117
    .line 118
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;->getWidth()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    int-to-float v3, v3

    .line 126
    div-float/2addr v3, v0

    .line 127
    const-string v4, "width"

    .line 128
    .line 129
    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2}, Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;->getHeight()I

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    int-to-float p2, p2

    .line 137
    div-float/2addr p2, v0

    .line 138
    const-string v0, "height"

    .line 139
    .line 140
    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 141
    .line 142
    .line 143
    const-string p2, "size"

    .line 144
    .line 145
    invoke-virtual {p1, p2, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v1, p1}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    return-object p1
.end method

.method private final getCurrentActivity()Landroidx/appcompat/app/d;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/views/ExpoView;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getThrowingActivity()Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v0, Landroidx/appcompat/app/d;

    .line 15
    .line 16
    return-object v0
.end method

.method private final getOnBarcodeScanned()Lexpo/modules/kotlin/viewevent/ViewEventCallback;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/viewevent/ViewEventCallback<",
            "Lexpo/modules/camera/common/BarcodeScannedEvent;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->onBarcodeScanned$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/camera/ExpoCameraView;->$$delegatedProperties:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;->getValue(Landroid/view/View;LC7/k;)Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method private final getOnCameraReady()Lexpo/modules/kotlin/viewevent/ViewEventCallback;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/viewevent/ViewEventCallback<",
            "Li7/B;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->onCameraReady$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/camera/ExpoCameraView;->$$delegatedProperties:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;->getValue(Landroid/view/View;LC7/k;)Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method private final getOnMountError()Lexpo/modules/kotlin/viewevent/ViewEventCallback;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/viewevent/ViewEventCallback<",
            "Lexpo/modules/camera/common/CameraMountErrorEvent;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->onMountError$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/camera/ExpoCameraView;->$$delegatedProperties:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;->getValue(Landroid/view/View;LC7/k;)Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method private final getOnPictureSaved()Lexpo/modules/kotlin/viewevent/ViewEventCallback;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/viewevent/ViewEventCallback<",
            "Lexpo/modules/camera/common/PictureSavedEvent;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->onPictureSaved$delegate:Lexpo/modules/kotlin/viewevent/ViewEventDelegate;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/camera/ExpoCameraView;->$$delegatedProperties:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lexpo/modules/kotlin/viewevent/ViewEventDelegate;->getValue(Landroid/view/View;LC7/k;)Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method private final getOrientationEventListener()Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->orientationEventListener$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;

    .line 8
    .line 9
    return-object v0
.end method

.method public static synthetic h(Lexpo/modules/camera/ExpoCameraView;Ly/t;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->observeCameraState$lambda$35(Lexpo/modules/camera/ExpoCameraView;Ly/t;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic i(Ljava/util/List;I)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->buildResolutionSelector$lambda$27(Ljava/util/List;I)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic j(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/kotlin/Promise;LZ/y0;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/camera/ExpoCameraView;->record$lambda$10$lambda$9(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/kotlin/Promise;LZ/y0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final observeCameraState(Ly/q;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Ly/q;->c()Landroidx/lifecycle/x;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->getCurrentActivity()Landroidx/appcompat/app/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lexpo/modules/camera/a;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lexpo/modules/camera/a;-><init>(Lexpo/modules/camera/ExpoCameraView;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lexpo/modules/camera/ExpoCameraViewKt$sam$androidx_lifecycle_Observer$0;

    .line 15
    .line 16
    invoke-direct {v2, v1}, Lexpo/modules/camera/ExpoCameraViewKt$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0, v2}, Landroidx/lifecycle/x;->h(Landroidx/lifecycle/r;Landroidx/lifecycle/B;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private static final observeCameraState$lambda$35(Lexpo/modules/camera/ExpoCameraView;Ly/t;)Li7/B;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ly/t;->d()Ly/t$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lexpo/modules/camera/ExpoCameraView$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    aget p1, v0, p1

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->getOnCameraReady()Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object v0, Li7/B;->a:Li7/B;

    .line 21
    .line 22
    invoke-interface {p1, v0}, Lexpo/modules/kotlin/viewevent/ViewEventCallback;->invoke(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lexpo/modules/camera/ExpoCameraView;->getEnableTorch()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-direct {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->setTorchEnabled(Z)V

    .line 30
    .line 31
    .line 32
    :cond_0
    sget-object p0, Li7/B;->a:Li7/B;

    .line 33
    .line 34
    return-object p0
.end method

.method private final onBarcodeScanned(Lexpo/modules/camera/utils/BarCodeScannerResult;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->shouldScanBarcodes:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->transformBarcodeScannerResultToViewCoordinates(Lexpo/modules/camera/utils/BarCodeScannerResult;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getCornerPoints()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getBoundingBox()Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {p0, v0, v1}, Lexpo/modules/camera/ExpoCameraView;->getCornerPointsAndBoundingBox(Ljava/util/List;Lexpo/modules/camera/utils/BarCodeScannerResult$BoundingBox;)Lkotlin/Pair;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    move-object v7, v1

    .line 25
    check-cast v7, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v8, v0

    .line 32
    check-cast v8, Landroid/os/Bundle;

    .line 33
    .line 34
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->getOnBarcodeScanned()Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v2, Lexpo/modules/camera/common/BarcodeScannedEvent;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getValue()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getRaw()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    sget-object v1, Lexpo/modules/camera/records/BarcodeType;->Companion:Lexpo/modules/camera/records/BarcodeType$Companion;

    .line 61
    .line 62
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getType()I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-virtual {v1, v6}, Lexpo/modules/camera/records/BarcodeType$Companion;->mapFormatToString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getExtra()Landroid/os/Bundle;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    invoke-direct/range {v2 .. v9}, Lexpo/modules/camera/common/BarcodeScannedEvent;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v0, v2}, Lexpo/modules/kotlin/viewevent/ViewEventCallback;->invoke(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_0
    return-void
.end method

.method private static final onBarcodeScanned_delegate$lambda$4(Lexpo/modules/camera/common/BarcodeScannedEvent;)S
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lexpo/modules/camera/common/BarcodeScannedEvent;->getData()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    rem-int/lit16 p0, p0, 0x7fff

    .line 15
    .line 16
    int-to-short p0, p0

    .line 17
    return p0
.end method

.method private static final onPictureSaved_delegate$lambda$5(Lexpo/modules/camera/common/PictureSavedEvent;)S
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lexpo/modules/camera/common/PictureSavedEvent;->getData()Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "uri"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, -0x1

    .line 24
    :goto_0
    rem-int/lit16 p0, p0, 0x7fff

    .line 25
    .line 26
    int-to-short p0, p0

    .line 27
    return p0
.end method

.method private static final orientationEventListener_delegate$lambda$0(Lexpo/modules/kotlin/AppContext;Lexpo/modules/camera/ExpoCameraView;)Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/AppContext;->getThrowingActivity()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;

    .line 6
    .line 7
    invoke-direct {v0, p1, p0}, Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;-><init>(Lexpo/modules/camera/ExpoCameraView;Landroid/app/Activity;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private final parseSizeSafely(Ljava/lang/String;)Landroid/util/Size;
    .locals 2

    .line 1
    new-instance v0, LP8/o;

    .line 2
    .line 3
    const-string v1, "\\d+x\\d+"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LP8/o;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, LP8/o;->d(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    :try_start_0
    invoke-static {p1}, Landroid/util/Size;->parseSize(Ljava/lang/String;)Landroid/util/Size;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    return-object p1

    .line 21
    :catchall_0
    return-object v1
.end method

.method private static final record$lambda$10$lambda$9(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/kotlin/Promise;LZ/y0;)V
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, LZ/y0$b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->isRecording:Z

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    instance-of v0, p2, LZ/y0$c;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iput-boolean v1, p0, Lexpo/modules/camera/ExpoCameraView;->isRecording:Z

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    instance-of v0, p2, LZ/y0$d;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iput-boolean v1, p0, Lexpo/modules/camera/ExpoCameraView;->isRecording:Z

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    instance-of p0, p2, LZ/y0$a;

    .line 30
    .line 31
    if-eqz p0, :cond_8

    .line 32
    .line 33
    check-cast p2, LZ/y0$a;

    .line 34
    .line 35
    invoke-virtual {p2}, LZ/y0$a;->j()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_7

    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    if-eq p0, v0, :cond_7

    .line 43
    .line 44
    const/4 v0, 0x4

    .line 45
    if-eq p0, v0, :cond_7

    .line 46
    .line 47
    const/16 v0, 0x9

    .line 48
    .line 49
    if-eq p0, v0, :cond_7

    .line 50
    .line 51
    new-instance p0, Lexpo/modules/camera/CameraExceptions$VideoRecordingFailed;

    .line 52
    .line 53
    invoke-virtual {p2}, LZ/y0$a;->i()Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    :cond_3
    invoke-virtual {p2}, LZ/y0$a;->i()Ljava/lang/Throwable;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    if-eqz p2, :cond_4

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    if-nez p2, :cond_5

    .line 76
    .line 77
    :cond_4
    const-string p2, "Unknown error"

    .line 78
    .line 79
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v1, "Video recording Failed: "

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    :cond_6
    invoke-direct {p0, v0}, Lexpo/modules/camera/CameraExceptions$VideoRecordingFailed;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {p1, p0}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_7
    new-instance p0, Landroid/os/Bundle;

    .line 104
    .line 105
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2}, LZ/y0$a;->k()LZ/t;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {p2}, LZ/t;->a()Landroid/net/Uri;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    const-string v0, "uri"

    .line 121
    .line 122
    invoke-virtual {p0, v0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-interface {p1, p0}, Lexpo/modules/kotlin/Promise;->resolve(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_8
    return-void
.end method

.method private final setCameraZoom(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Ly/i;

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ly/i;->d()Ly/q;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ly/q;->y()Landroidx/lifecycle/x;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/lifecycle/x;->e()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ly/M0;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ly/M0;->a()F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v0, v1

    .line 33
    :goto_0
    const/4 v2, 0x0

    .line 34
    invoke-static {p1, v2, v1}, LB7/d;->k(FFF)F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    mul-float/2addr p1, v0

    .line 39
    invoke-static {v0, p1}, Ljava/lang/Float;->min(FF)F

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {v1, p1}, Ljava/lang/Float;->max(FF)F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Ly/i;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-interface {v0}, Ly/i;->b()Ly/j;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    invoke-interface {v0, p1}, Ly/j;->g(F)Lm5/a;

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void
.end method

.method private final setTorchEnabled(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Ly/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ly/i;->d()Ly/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Ly/q;->s()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Ly/i;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Ly/i;->b()Ly/j;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {v0, p1}, Ly/j;->k(Z)Lm5/a;

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method private final startFocusMetering()V
    .locals 6

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Ly/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Ly/G;

    .line 6
    .line 7
    iget-object v2, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v0}, Ly/i;->d()Ly/q;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v4, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 18
    .line 19
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    int-to-float v4, v4

    .line 24
    iget-object v5, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 25
    .line 26
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    int-to-float v5, v5

    .line 31
    invoke-direct {v1, v2, v3, v4, v5}, Ly/G;-><init>(Landroid/view/Display;Ly/q;FF)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Ly/J$a;

    .line 35
    .line 36
    const/high16 v3, 0x3f800000    # 1.0f

    .line 37
    .line 38
    invoke-virtual {v1, v3, v3}, Ly/l0;->b(FF)Ly/k0;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v3, 0x1

    .line 43
    invoke-direct {v2, v1, v3}, Ly/J$a;-><init>(Ly/k0;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ly/J$a;->b()Ly/J;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v2, "build(...)"

    .line 51
    .line 52
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v0}, Ly/i;->b()Ly/j;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-interface {v0, v1}, Ly/j;->i(Ly/J;)Lm5/a;

    .line 60
    .line 61
    .line 62
    :cond_0
    return-void
.end method

.method private final transformBarcodeScannerResultToViewCoordinates(Lexpo/modules/camera/utils/BarCodeScannerResult;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getCornerPoints()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    int-to-float v1, v1

    .line 12
    iget-object v2, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    int-to-float v2, v2

    .line 19
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    int-to-float v3, v3

    .line 24
    invoke-virtual {p1}, Lexpo/modules/camera/utils/BarCodeScannerResult;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    int-to-float v4, v4

    .line 29
    const/4 v5, 0x0

    .line 30
    cmpg-float v6, v1, v5

    .line 31
    .line 32
    if-lez v6, :cond_b

    .line 33
    .line 34
    cmpg-float v6, v2, v5

    .line 35
    .line 36
    if-lez v6, :cond_b

    .line 37
    .line 38
    cmpg-float v6, v3, v5

    .line 39
    .line 40
    if-lez v6, :cond_b

    .line 41
    .line 42
    cmpg-float v6, v4, v5

    .line 43
    .line 44
    if-gtz v6, :cond_0

    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_0
    iget-object v6, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 49
    .line 50
    invoke-virtual {v6}, Landroidx/camera/view/m;->getScaleType()Landroidx/camera/view/m$d;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    sget-object v7, Lexpo/modules/camera/ExpoCameraView$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    aget v6, v7, v6

    .line 61
    .line 62
    const/4 v7, 0x1

    .line 63
    const/4 v8, 0x2

    .line 64
    const/high16 v9, 0x40000000    # 2.0f

    .line 65
    .line 66
    if-eq v6, v7, :cond_4

    .line 67
    .line 68
    if-eq v6, v8, :cond_1

    .line 69
    .line 70
    div-float v3, v1, v3

    .line 71
    .line 72
    div-float v4, v2, v4

    .line 73
    .line 74
    move v6, v5

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    div-float v6, v1, v2

    .line 77
    .line 78
    div-float v10, v3, v4

    .line 79
    .line 80
    cmpl-float v6, v6, v10

    .line 81
    .line 82
    if-lez v6, :cond_3

    .line 83
    .line 84
    :cond_2
    div-float v3, v1, v3

    .line 85
    .line 86
    mul-float/2addr v4, v3

    .line 87
    sub-float v4, v2, v4

    .line 88
    .line 89
    div-float/2addr v4, v9

    .line 90
    move v6, v4

    .line 91
    move v4, v3

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    :goto_0
    div-float v4, v2, v4

    .line 94
    .line 95
    mul-float/2addr v3, v4

    .line 96
    sub-float v3, v1, v3

    .line 97
    .line 98
    div-float/2addr v3, v9

    .line 99
    move v6, v5

    .line 100
    move v5, v3

    .line 101
    move v3, v4

    .line 102
    goto :goto_1

    .line 103
    :cond_4
    div-float v6, v1, v2

    .line 104
    .line 105
    div-float v10, v3, v4

    .line 106
    .line 107
    cmpl-float v6, v6, v10

    .line 108
    .line 109
    if-lez v6, :cond_2

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :goto_1
    const/4 v9, 0x0

    .line 113
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    invoke-static {v9, v10}, LB7/d;->p(II)LB7/c;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    invoke-static {v9, v8}, LB7/d;->o(LB7/a;I)LB7/a;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    invoke-virtual {v9}, LB7/a;->d()I

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    invoke-virtual {v9}, LB7/a;->o()I

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    invoke-virtual {v9}, LB7/a;->p()I

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    if-lez v9, :cond_5

    .line 138
    .line 139
    if-le v10, v11, :cond_6

    .line 140
    .line 141
    :cond_5
    if-gez v9, :cond_7

    .line 142
    .line 143
    if-gt v11, v10, :cond_7

    .line 144
    .line 145
    :cond_6
    :goto_2
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    check-cast v12, Ljava/lang/Number;

    .line 150
    .line 151
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v12

    .line 155
    int-to-float v12, v12

    .line 156
    mul-float/2addr v12, v3

    .line 157
    add-float/2addr v12, v5

    .line 158
    invoke-static {v12}, Ly7/a;->c(F)I

    .line 159
    .line 160
    .line 161
    move-result v12

    .line 162
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v12

    .line 166
    invoke-interface {v0, v10, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    if-eq v10, v11, :cond_7

    .line 170
    .line 171
    add-int/2addr v10, v9

    .line 172
    goto :goto_2

    .line 173
    :cond_7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    invoke-static {v7, v3}, LB7/d;->p(II)LB7/c;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-static {v3, v8}, LB7/d;->o(LB7/a;I)LB7/a;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-virtual {v3}, LB7/a;->d()I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    invoke-virtual {v3}, LB7/a;->o()I

    .line 190
    .line 191
    .line 192
    move-result v7

    .line 193
    invoke-virtual {v3}, LB7/a;->p()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-lez v3, :cond_8

    .line 198
    .line 199
    if-le v5, v7, :cond_9

    .line 200
    .line 201
    :cond_8
    if-gez v3, :cond_a

    .line 202
    .line 203
    if-gt v7, v5, :cond_a

    .line 204
    .line 205
    :cond_9
    :goto_3
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    check-cast v8, Ljava/lang/Number;

    .line 210
    .line 211
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result v8

    .line 215
    int-to-float v8, v8

    .line 216
    mul-float/2addr v8, v4

    .line 217
    add-float/2addr v8, v6

    .line 218
    invoke-static {v8}, Ly7/a;->c(F)I

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    invoke-interface {v0, v5, v8}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    if-eq v5, v7, :cond_a

    .line 230
    .line 231
    add-int/2addr v5, v3

    .line 232
    goto :goto_3

    .line 233
    :cond_a
    invoke-virtual {p1, v0}, Lexpo/modules/camera/utils/BarCodeScannerResult;->setCornerPoints(Ljava/util/List;)V

    .line 234
    .line 235
    .line 236
    float-to-int v0, v2

    .line 237
    invoke-virtual {p1, v0}, Lexpo/modules/camera/utils/BarCodeScannerResult;->setHeight(I)V

    .line 238
    .line 239
    .line 240
    float-to-int v0, v1

    .line 241
    invoke-virtual {p1, v0}, Lexpo/modules/camera/utils/BarCodeScannerResult;->setWidth(I)V

    .line 242
    .line 243
    .line 244
    :cond_b
    :goto_4
    return-void
.end method


# virtual methods
.method public final cleanupCamera()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->getOrientationEventListener()Lexpo/modules/camera/ExpoCameraView$orientationEventListener$2$1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->disable()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->cancelCoroutineScope()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->cameraProvider:LY/k;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, LY/k;->f()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->glSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final getAnimateShutter()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->animateShutter:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getAutoFocus()Lexpo/modules/camera/records/FocusMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->autoFocus:Lexpo/modules/camera/records/FocusMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAvailablePictureSizes()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Ly/i;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-interface {v0}, Ly/i;->d()Ly/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-static {v0}, Lx/h;->a(Ly/q;)Lx/h;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lx/h;->b(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/16 v1, 0x100

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    new-instance v1, Ljava/util/ArrayList;

    .line 34
    .line 35
    array-length v2, v0

    .line 36
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    .line 38
    .line 39
    array-length v2, v0

    .line 40
    const/4 v3, 0x0

    .line 41
    :goto_0
    if-ge v3, v2, :cond_1

    .line 42
    .line 43
    aget-object v4, v0, v3

    .line 44
    .line 45
    invoke-virtual {v4}, Landroid/util/Size;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v5, "toString(...)"

    .line 50
    .line 51
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/4 v1, 0x0

    .line 61
    :cond_1
    if-nez v1, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    return-object v1

    .line 65
    :cond_3
    :goto_1
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0
.end method

.method public final getCamera()Ly/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Ly/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCameraMode()Lexpo/modules/camera/records/CameraMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->cameraMode:Lexpo/modules/camera/records/CameraMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEnableTorch()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->enableTorch$delegate:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/camera/ExpoCameraView;->$$delegatedProperties:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final getFlashMode()Lexpo/modules/camera/records/FlashMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->flashMode:Lexpo/modules/camera/records/FlashMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLensFacing()Lexpo/modules/camera/records/CameraType;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->lensFacing:Lexpo/modules/camera/records/CameraType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMirror()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->mirror:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getMute()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->mute:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getPictureSize()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->pictureSize:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPreviewSizeAsArray()[I
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    filled-new-array {v0, v1}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public final getRatio()Lexpo/modules/camera/records/CameraRatio;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->ratio:Lexpo/modules/camera/records/CameraRatio;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVideoEncodingBitrate()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->videoEncodingBitrate:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVideoQuality()Lexpo/modules/camera/records/VideoQuality;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->videoQuality:Lexpo/modules/camera/records/VideoQuality;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVideoStabilizationMode()Lexpo/modules/camera/records/VideoStabilizationMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->videoStabilizationMode:Lexpo/modules/camera/records/VideoStabilizationMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getZoom()F
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/camera/ExpoCameraView;->zoom:F

    .line 2
    .line 3
    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    sub-int/2addr p4, p2

    .line 2
    sub-int/2addr p5, p3

    .line 3
    iget p1, p0, Lexpo/modules/camera/ExpoCameraView;->lastWidth:I

    .line 4
    .line 5
    if-ne p4, p1, :cond_1

    .line 6
    .line 7
    iget p1, p0, Lexpo/modules/camera/ExpoCameraView;->lastHeight:I

    .line 8
    .line 9
    if-eq p5, p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    :goto_0
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->glSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    invoke-virtual {p1, p4, p5}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 24
    .line 25
    .line 26
    :cond_2
    iput p4, p0, Lexpo/modules/camera/ExpoCameraView;->lastWidth:I

    .line 27
    .line 28
    iput p5, p0, Lexpo/modules/camera/ExpoCameraView;->lastHeight:I

    .line 29
    .line 30
    return-void
.end method

.method protected onMeasure(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0, p2}, Landroid/view/View;->resolveSize(II)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final onPictureSaved(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->getOnPictureSaved()Lexpo/modules/kotlin/viewevent/ViewEventCallback;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lexpo/modules/camera/common/PictureSavedEvent;

    .line 11
    .line 12
    const-string v2, "id"

    .line 13
    .line 14
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const-string v3, "data"

    .line 19
    .line 20
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, v2, p1}, Lexpo/modules/camera/common/PictureSavedEvent;-><init>(ILandroid/os/Bundle;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1}, Lexpo/modules/kotlin/viewevent/ViewEventCallback;->invoke(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onViewAdded(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->bringToFront()V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final pausePreview()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->previewPaused:Z

    .line 3
    .line 4
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->cameraProvider:LY/k;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, LY/k;->f()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final record(Lexpo/modules/camera/RecordingOptions;Lexpo/modules/kotlin/Promise;Ljava/io/File;)V
    .locals 4

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "promise"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "cacheDirectory"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lexpo/modules/camera/utils/FileSystemUtils;->INSTANCE:Lexpo/modules/camera/utils/FileSystemUtils;

    .line 17
    .line 18
    const-string v1, "Camera"

    .line 19
    .line 20
    const-string v2, ".mp4"

    .line 21
    .line 22
    invoke-virtual {v0, p3, v1, v2}, Lexpo/modules/camera/utils/FileSystemUtils;->generateOutputFile(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    new-instance v0, LZ/q$a;

    .line 27
    .line 28
    invoke-direct {v0, p3}, LZ/q$a;-><init>(Ljava/io/File;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lexpo/modules/camera/RecordingOptions;->getMaxFileSize()I

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    int-to-long v1, p3

    .line 36
    invoke-virtual {v0, v1, v2}, LZ/q$a;->b(J)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    check-cast p3, LZ/q$a;

    .line 41
    .line 42
    invoke-virtual {p1}, Lexpo/modules/camera/RecordingOptions;->getMaxDuration()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    int-to-long v0, p1

    .line 47
    const/16 p1, 0x3e8

    .line 48
    .line 49
    int-to-long v2, p1

    .line 50
    mul-long/2addr v0, v2

    .line 51
    invoke-virtual {p3, v0, v1}, LZ/q$a;->a(J)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, LZ/q$a;

    .line 56
    .line 57
    invoke-virtual {p1}, LZ/q$a;->c()LZ/q;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string p3, "build(...)"

    .line 62
    .line 63
    invoke-static {p1, p3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object p3, p0, Lexpo/modules/camera/ExpoCameraView;->recorder:LZ/S;

    .line 67
    .line 68
    const/4 v0, 0x0

    .line 69
    if-eqz p3, :cond_2

    .line 70
    .line 71
    iget-boolean v1, p0, Lexpo/modules/camera/ExpoCameraView;->mute:Z

    .line 72
    .line 73
    if-nez v1, :cond_0

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const-string v2, "android.permission.RECORD_AUDIO"

    .line 80
    .line 81
    invoke-static {v1, v2}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_0

    .line 86
    .line 87
    new-instance p1, Lexpo/modules/kotlin/exception/Exceptions$MissingPermissions;

    .line 88
    .line 89
    filled-new-array {v2}, [Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    invoke-direct {p1, p3}, Lexpo/modules/kotlin/exception/Exceptions$MissingPermissions;-><init>([Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-interface {p2, p1}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {p3, v1, p1}, LZ/S;->g0(Landroid/content/Context;LZ/q;)LZ/u;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iget-boolean p3, p0, Lexpo/modules/camera/ExpoCameraView;->mute:Z

    .line 109
    .line 110
    if-nez p3, :cond_1

    .line 111
    .line 112
    const/4 p3, 0x0

    .line 113
    const/4 v1, 0x1

    .line 114
    invoke-static {p1, p3, v1, v0}, LZ/u;->k(LZ/u;ZILjava/lang/Object;)LZ/u;

    .line 115
    .line 116
    .line 117
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    invoke-static {p3}, Landroidx/core/content/a;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    const-string v0, "getMainExecutor(...)"

    .line 126
    .line 127
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    new-instance v0, Lexpo/modules/camera/h;

    .line 131
    .line 132
    invoke-direct {v0, p0, p2}, Lexpo/modules/camera/h;-><init>(Lexpo/modules/camera/ExpoCameraView;Lexpo/modules/kotlin/Promise;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, p3, v0}, LZ/u;->i(Ljava/util/concurrent/Executor;LH0/a;)LZ/b0;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->activeRecording:LZ/b0;

    .line 140
    .line 141
    return-void

    .line 142
    :cond_2
    const-string p1, "E_RECORDING_FAILED"

    .line 143
    .line 144
    const-string p3, "Starting video recording failed - could not create video file."

    .line 145
    .line 146
    invoke-interface {p2, p1, p3, v0}, Lexpo/modules/kotlin/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method public final recreateCamera()V
    .locals 6

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->scope:LR8/N;

    .line 2
    .line 3
    new-instance v3, Lexpo/modules/camera/ExpoCameraView$recreateCamera$1;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v3, p0, v1}, Lexpo/modules/camera/ExpoCameraView$recreateCamera$1;-><init>(Lexpo/modules/camera/ExpoCameraView;Ln7/f;)V

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static/range {v0 .. v5}, LR8/i;->d(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LR8/A0;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final resumePreview()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->previewPaused:Z

    .line 6
    .line 7
    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView;->scope:LR8/N;

    .line 8
    .line 9
    new-instance v4, Lexpo/modules/camera/ExpoCameraView$resumePreview$1;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {v4, p0, v0}, Lexpo/modules/camera/ExpoCameraView$resumePreview$1;-><init>(Lexpo/modules/camera/ExpoCameraView;Ln7/f;)V

    .line 13
    .line 14
    .line 15
    const/4 v5, 0x3

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-static/range {v1 .. v6}, LR8/i;->d(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LR8/A0;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final setAnimateShutter(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->animateShutter:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setAutoFocus(Lexpo/modules/camera/records/FocusMode;)V
    .locals 2

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->autoFocus:Lexpo/modules/camera/records/FocusMode;

    .line 7
    .line 8
    iget-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Ly/i;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-interface {p1}, Ly/i;->b()Ly/j;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->autoFocus:Lexpo/modules/camera/records/FocusMode;

    .line 19
    .line 20
    sget-object v1, Lexpo/modules/camera/records/FocusMode;->OFF:Lexpo/modules/camera/records/FocusMode;

    .line 21
    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    invoke-interface {p1}, Ly/j;->f()Lm5/a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-direct {p0}, Lexpo/modules/camera/ExpoCameraView;->startFocusMetering()V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public final setBarcodeScannerSettings(Lexpo/modules/camera/records/BarcodeSettings;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lexpo/modules/camera/records/BarcodeSettings;->getBarcodeTypes()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    :cond_0
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_1
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->barcodeFormats:Ljava/util/List;

    .line 14
    .line 15
    return-void
.end method

.method public final setCamera(Ly/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->camera:Ly/i;

    .line 2
    .line 3
    return-void
.end method

.method public final setCameraFlashMode(Lexpo/modules/camera/records/FlashMode;)V
    .locals 3

    .line 1
    const-string v0, "mode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lexpo/modules/camera/records/FlashMode;->SCREEN:Lexpo/modules/camera/records/FlashMode;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView;->lensFacing:Lexpo/modules/camera/records/CameraType;

    .line 11
    .line 12
    sget-object v2, Lexpo/modules/camera/records/CameraType;->FRONT:Lexpo/modules/camera/records/CameraType;

    .line 13
    .line 14
    if-eq v1, v2, :cond_0

    .line 15
    .line 16
    sget-object p1, Lexpo/modules/camera/records/FlashMode;->ON:Lexpo/modules/camera/records/FlashMode;

    .line 17
    .line 18
    :cond_0
    if-ne p1, v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lexpo/modules/kotlin/views/ExpoView;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getCurrentActivity()Landroid/app/Activity;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Landroidx/camera/view/m;->setScreenFlashWindow(Landroid/view/Window;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->imageCaptureUseCase:Ly/V;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object v1, p0, Lexpo/modules/camera/ExpoCameraView;->previewView:Landroidx/camera/view/m;

    .line 46
    .line 47
    invoke-virtual {v1}, Landroidx/camera/view/m;->getScreenFlash()Ly/V$i;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ly/V;->N0(Ly/V$i;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->imageCaptureUseCase:Ly/V;

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-virtual {p1}, Lexpo/modules/camera/records/FlashMode;->mapToLens()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-virtual {v0, p1}, Ly/V;->M0(I)V

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void
.end method

.method public final setCameraMode(Lexpo/modules/camera/records/CameraMode;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->cameraMode:Lexpo/modules/camera/records/CameraMode;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    .line 10
    .line 11
    return-void
.end method

.method public final setEnableTorch(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->enableTorch$delegate:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/camera/ExpoCameraView;->$$delegatedProperties:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setFlashMode(Lexpo/modules/camera/records/FlashMode;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->flashMode:Lexpo/modules/camera/records/FlashMode;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->setCameraFlashMode(Lexpo/modules/camera/records/FlashMode;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setLensFacing(Lexpo/modules/camera/records/CameraType;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->lensFacing:Lexpo/modules/camera/records/CameraType;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    .line 10
    .line 11
    return-void
.end method

.method public final setMirror(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->mirror:Z

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    .line 5
    .line 6
    return-void
.end method

.method public final setMute(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->mute:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setPictureSize(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->pictureSize:Ljava/lang/String;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    .line 10
    .line 11
    return-void
.end method

.method public setPreviewTexture(Landroid/graphics/SurfaceTexture;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->glSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->scope:LR8/N;

    .line 7
    .line 8
    new-instance v3, Lexpo/modules/camera/ExpoCameraView$setPreviewTexture$1;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {v3, p0, p1}, Lexpo/modules/camera/ExpoCameraView$setPreviewTexture$1;-><init>(Lexpo/modules/camera/ExpoCameraView;Ln7/f;)V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x3

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static/range {v0 .. v5}, LR8/i;->d(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LR8/A0;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final setRatio(Lexpo/modules/camera/records/CameraRatio;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->ratio:Lexpo/modules/camera/records/CameraRatio;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    .line 5
    .line 6
    return-void
.end method

.method public final setShouldScanBarcodes(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldScanBarcodes:Z

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    .line 5
    .line 6
    return-void
.end method

.method public final setVideoEncodingBitrate(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->videoEncodingBitrate:Ljava/lang/Integer;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    .line 5
    .line 6
    return-void
.end method

.method public final setVideoQuality(Lexpo/modules/camera/records/VideoQuality;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->videoQuality:Lexpo/modules/camera/records/VideoQuality;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    .line 10
    .line 11
    return-void
.end method

.method public final setVideoStabilizationMode(Lexpo/modules/camera/records/VideoStabilizationMode;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/camera/ExpoCameraView;->videoStabilizationMode:Lexpo/modules/camera/records/VideoStabilizationMode;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lexpo/modules/camera/ExpoCameraView;->shouldCreateCamera:Z

    .line 10
    .line 11
    return-void
.end method

.method public final setZoom(F)V
    .locals 0

    .line 1
    iput p1, p0, Lexpo/modules/camera/ExpoCameraView;->zoom:F

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lexpo/modules/camera/ExpoCameraView;->setCameraZoom(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final stopRecording()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lexpo/modules/camera/ExpoCameraView;->isRecording:Z

    .line 3
    .line 4
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->activeRecording:LZ/b0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, LZ/b0;->close()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final takePicture(Lexpo/modules/camera/PictureOptions;Lexpo/modules/kotlin/Promise;Ljava/io/File;Lexpo/modules/kotlin/runtime/Runtime;)V
    .locals 10

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "promise"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "cacheDirectory"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "runtimeContext"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "audio"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "null cannot be cast to non-null type android.media.AudioManager"

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    check-cast v0, Landroid/media/AudioManager;

    .line 37
    .line 38
    const/4 v1, 0x3

    .line 39
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {p1}, Lexpo/modules/camera/PictureOptions;->getShutterSound()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->imageCaptureUseCase:Ly/V;

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1}, Landroidx/core/content/a;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    new-instance v2, Lexpo/modules/camera/ExpoCameraView$takePicture$1;

    .line 60
    .line 61
    move-object v5, p0

    .line 62
    move-object v6, p1

    .line 63
    move-object v7, p2

    .line 64
    move-object v8, p3

    .line 65
    move-object v9, p4

    .line 66
    invoke-direct/range {v2 .. v9}, Lexpo/modules/camera/ExpoCameraView$takePicture$1;-><init>(ZILexpo/modules/camera/ExpoCameraView;Lexpo/modules/camera/PictureOptions;Lexpo/modules/kotlin/Promise;Ljava/io/File;Lexpo/modules/kotlin/runtime/Runtime;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1, v2}, Ly/V;->S0(Ljava/util/concurrent/Executor;Ly/V$e;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    return-void
.end method

.method public final toggleRecording()V
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/ExpoCameraView;->activeRecording:LZ/b0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v1, p0, Lexpo/modules/camera/ExpoCameraView;->isRecording:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, LZ/b0;->r()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {v0}, LZ/b0;->s()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method
