.class public final Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J;\u0010\r\u001a\u00020\u000c\"\u0006\u0008\u0000\u0010\u0008\u0018\u00012\u001e\u0008\u0004\u0010\u000b\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJI\u0010\r\u001a\u00020\u0011\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u00012$\u0008\u0004\u0010\u000b\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u0012JW\u0010\r\u001a\u00020\u0011\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u00012*\u0008\u0004\u0010\u000b\u001a$\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u0015Je\u0010\r\u001a\u00020\u0011\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u000120\u0008\u0004\u0010\u000b\u001a*\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u0018Js\u0010\r\u001a\u00020\u0011\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u0001\"\u0006\u0008\u0004\u0010\u0019\u0018\u000126\u0008\u0004\u0010\u000b\u001a0\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aH\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u001bJ\u0081\u0001\u0010\r\u001a\u00020\u0011\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u0001\"\u0006\u0008\u0004\u0010\u0019\u0018\u0001\"\u0006\u0008\u0005\u0010\u001c\u0018\u00012<\u0008\u0004\u0010\u000b\u001a6\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dH\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u001eJ\u008f\u0001\u0010\r\u001a\u00020\u0011\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u0001\"\u0006\u0008\u0004\u0010\u0019\u0018\u0001\"\u0006\u0008\u0005\u0010\u001c\u0018\u0001\"\u0006\u0008\u0006\u0010\u001f\u0018\u00012B\u0008\u0004\u0010\u000b\u001a<\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010 H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010!J\u009d\u0001\u0010\r\u001a\u00020\u0011\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u0001\"\u0006\u0008\u0004\u0010\u0019\u0018\u0001\"\u0006\u0008\u0005\u0010\u001c\u0018\u0001\"\u0006\u0008\u0006\u0010\u001f\u0018\u0001\"\u0006\u0008\u0007\u0010\"\u0018\u00012H\u0008\u0004\u0010\u000b\u001aB\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010#H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010$J\u00ab\u0001\u0010\r\u001a\u00020\u0011\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u0001\"\u0006\u0008\u0004\u0010\u0019\u0018\u0001\"\u0006\u0008\u0005\u0010\u001c\u0018\u0001\"\u0006\u0008\u0006\u0010\u001f\u0018\u0001\"\u0006\u0008\u0007\u0010\"\u0018\u0001\"\u0006\u0008\u0008\u0010%\u0018\u00012N\u0008\u0004\u0010\u000b\u001aH\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u0008\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010&H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\'J%\u0010-\u001a\u00020*2\u0010\u0008\u0004\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010(H\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008+\u0010,J+\u0010-\u001a\u00020*\"\u0006\u0008\u0000\u0010\u0008\u0018\u00012\u000e\u0008\u0004\u0010)\u001a\u0008\u0012\u0004\u0012\u00028\u00000(H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010,J9\u0010-\u001a\u00020*\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u00012\u0014\u0008\u0004\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\tH\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010.JG\u0010-\u001a\u00020*\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u00012\u001a\u0008\u0004\u0010)\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010/J?\u0010-\u001a\u00020*\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u00012\u001a\u0008\u0004\u0010)\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000\u0010H\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u0010/JU\u0010-\u001a\u00020*\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u00012 \u0008\u0004\u0010)\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u00102JM\u0010-\u001a\u00020*\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u00012 \u0008\u0004\u0010)\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000\u0014H\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u00102Jc\u0010-\u001a\u00020*\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u0001\"\u0006\u0008\u0004\u0010\u0019\u0018\u00012&\u0008\u0004\u0010)\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000\u0017H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u00103J[\u0010-\u001a\u00020*\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u00012&\u0008\u0004\u0010)\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000\u0017H\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u00103Jq\u0010-\u001a\u00020*\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u0001\"\u0006\u0008\u0004\u0010\u0019\u0018\u0001\"\u0006\u0008\u0005\u0010\u001c\u0018\u00012,\u0008\u0004\u0010)\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u00104Ji\u0010-\u001a\u00020*\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u0001\"\u0006\u0008\u0004\u0010\u0019\u0018\u00012,\u0008\u0004\u0010)\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000\u001aH\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u00104J\u007f\u0010-\u001a\u00020*\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u0001\"\u0006\u0008\u0004\u0010\u0019\u0018\u0001\"\u0006\u0008\u0005\u0010\u001c\u0018\u0001\"\u0006\u0008\u0006\u0010\u001f\u0018\u000122\u0008\u0004\u0010)\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000\u001dH\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u00105Jw\u0010-\u001a\u00020*\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u0001\"\u0006\u0008\u0004\u0010\u0019\u0018\u0001\"\u0006\u0008\u0005\u0010\u001c\u0018\u000122\u0008\u0004\u0010)\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000\u001dH\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u00105J\u008d\u0001\u0010-\u001a\u00020*\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u0001\"\u0006\u0008\u0004\u0010\u0019\u0018\u0001\"\u0006\u0008\u0005\u0010\u001c\u0018\u0001\"\u0006\u0008\u0006\u0010\u001f\u0018\u0001\"\u0006\u0008\u0007\u0010\"\u0018\u000128\u0008\u0004\u0010)\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00000 H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u00106J\u0085\u0001\u0010-\u001a\u00020*\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u0001\"\u0006\u0008\u0004\u0010\u0019\u0018\u0001\"\u0006\u0008\u0005\u0010\u001c\u0018\u0001\"\u0006\u0008\u0006\u0010\u001f\u0018\u000128\u0008\u0004\u0010)\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000 H\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u00106J\u009b\u0001\u0010-\u001a\u00020*\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u0001\"\u0006\u0008\u0004\u0010\u0019\u0018\u0001\"\u0006\u0008\u0005\u0010\u001c\u0018\u0001\"\u0006\u0008\u0006\u0010\u001f\u0018\u0001\"\u0006\u0008\u0007\u0010\"\u0018\u0001\"\u0006\u0008\u0008\u0010%\u0018\u00012>\u0008\u0004\u0010)\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u0008\u0012\u0004\u0012\u00028\u00000#H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u00107J\u0093\u0001\u0010-\u001a\u00020*\"\u0006\u0008\u0000\u0010\u0008\u0018\u0001\"\u0006\u0008\u0001\u0010\u000f\u0018\u0001\"\u0006\u0008\u0002\u0010\u0013\u0018\u0001\"\u0006\u0008\u0003\u0010\u0016\u0018\u0001\"\u0006\u0008\u0004\u0010\u0019\u0018\u0001\"\u0006\u0008\u0005\u0010\u001c\u0018\u0001\"\u0006\u0008\u0006\u0010\u001f\u0018\u0001\"\u0006\u0008\u0007\u0010\"\u0018\u00012>\u0008\u0004\u0010)\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000#H\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u00107J\u000f\u0010:\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u00088\u00109R \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010;\u0012\u0004\u0008>\u0010?\u001a\u0004\u0008<\u0010=R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010@\u0012\u0004\u0008C\u0010?\u001a\u0004\u0008A\u0010BR*\u0010D\u001a\u0004\u0018\u00010\u000c8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008D\u0010E\u0012\u0004\u0008I\u0010?\u001a\u0004\u0008F\u00109\"\u0004\u0008G\u0010H\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006J"
    }
    d2 = {
        "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;",
        "",
        "",
        "name",
        "Lexpo/modules/kotlin/types/TypeConverterProvider;",
        "converters",
        "<init>",
        "(Ljava/lang/String;Lexpo/modules/kotlin/types/TypeConverterProvider;)V",
        "R",
        "Lkotlin/Function1;",
        "Ln7/f;",
        "block",
        "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;",
        "SuspendBody",
        "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;",
        "P0",
        "Lkotlin/Function2;",
        "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "P1",
        "Lkotlin/Function3;",
        "(Lw7/o;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "P2",
        "Lkotlin/Function4;",
        "(Lw7/p;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "P3",
        "Lkotlin/Function5;",
        "(Lw7/q;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "P4",
        "Lkotlin/Function6;",
        "(Lw7/r;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "P5",
        "Lkotlin/Function7;",
        "(Lw7/s;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "P6",
        "Lkotlin/Function8;",
        "(Lw7/t;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "P7",
        "Lkotlin/Function9;",
        "(Lw7/u;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "Lkotlin/Function0;",
        "body",
        "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;",
        "AsyncBodyWithoutArgs",
        "(Lw7/a;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;",
        "AsyncBody",
        "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;",
        "(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;",
        "Lexpo/modules/kotlin/Promise;",
        "AsyncFunctionWithPromise",
        "(Lw7/o;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;",
        "(Lw7/p;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;",
        "(Lw7/q;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;",
        "(Lw7/r;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;",
        "(Lw7/s;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;",
        "(Lw7/t;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;",
        "build$expo_modules_core_release",
        "()Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;",
        "build",
        "Ljava/lang/String;",
        "getName",
        "()Ljava/lang/String;",
        "getName$annotations",
        "()V",
        "Lexpo/modules/kotlin/types/TypeConverterProvider;",
        "getConverters",
        "()Lexpo/modules/kotlin/types/TypeConverterProvider;",
        "getConverters$annotations",
        "asyncFunctionComponent",
        "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;",
        "getAsyncFunctionComponent",
        "setAsyncFunctionComponent",
        "(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V",
        "getAsyncFunctionComponent$annotations",
        "expo-modules-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private asyncFunctionComponent:Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;

.field private final converters:Lexpo/modules/kotlin/types/TypeConverterProvider;

.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lexpo/modules/kotlin/types/TypeConverterProvider;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->name:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->converters:Lexpo/modules/kotlin/types/TypeConverterProvider;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    return-void
.end method

.method public static synthetic getAsyncFunctionComponent$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getConverters$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getName$annotations()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final synthetic AsyncBody(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    .line 16
    const-string v1, "P0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 17
    invoke-virtual {p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 19
    sget-object v4, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 20
    new-instance v5, Lkotlin/Pair;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v6, Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v8, 0x3

    invoke-static {v8, v1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v9, 0x0

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-direct {v5, v7, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    invoke-virtual {v4}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_0

    .line 22
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$1;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$1;

    .line 23
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 24
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    .line 25
    invoke-static {v8, v1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 26
    invoke-direct {v7, v10, v9, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 27
    invoke-direct {v5, v7, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 28
    :cond_0
    filled-new-array {v4}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 29
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$6;

    invoke-direct {v3, p1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$6;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 30
    const-string p1, "R"

    invoke-static {v8, p1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 31
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 32
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v6, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 33
    new-instance p1, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {p1, v2, v1, v3}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 34
    :cond_1
    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v6, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 35
    new-instance p1, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {p1, v2, v1, v3}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 36
    :cond_2
    sget-object p1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v6, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 37
    new-instance p1, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {p1, v2, v1, v3}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 38
    :cond_3
    sget-object p1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v6, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 39
    new-instance p1, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {p1, v2, v1, v3}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 40
    :cond_4
    const-class p1, Ljava/lang/String;

    invoke-static {v6, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 41
    new-instance p1, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {p1, v2, v1, v3}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 42
    :cond_5
    new-instance p1, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {p1, v2, v1, v3}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 43
    :goto_0
    invoke-virtual {p0, p1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object p1
.end method

.method public final synthetic AsyncBody(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function2;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v1

    const/4 v2, 0x4

    .line 45
    const-string v3, "P0"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 46
    const-string v4, "P1"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 47
    sget-object v5, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 48
    new-instance v6, Lkotlin/Pair;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v7, Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v9, 0x3

    invoke-static {v9, v3}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v10, 0x0

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-direct {v6, v8, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    invoke-virtual {v5}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_0

    .line 50
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v6, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$2;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$2;

    .line 51
    new-instance v8, Lexpo/modules/kotlin/types/AnyType;

    .line 52
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    .line 53
    invoke-static {v9, v3}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 54
    invoke-direct {v12, v13, v10, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 55
    invoke-direct {v8, v12, v1}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v8

    .line 56
    :cond_0
    new-instance v3, Lkotlin/Pair;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    invoke-static {v9, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v8, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    invoke-virtual {v5}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_1

    .line 58
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$3;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$3;

    .line 59
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 60
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    .line 61
    invoke-static {v9, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 62
    invoke-direct {v8, v11, v10, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 63
    invoke-direct {v5, v8, v1}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v3, v5

    .line 64
    :cond_1
    filled-new-array {v6, v3}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 65
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$8;

    invoke-direct {v3, p1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$8;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 66
    const-string p1, "R"

    invoke-static {v9, p1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 67
    invoke-static {v2, p1}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 68
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v7, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 69
    new-instance p1, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {p1, v0, v1, v3}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 70
    :cond_2
    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v7, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 71
    new-instance p1, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {p1, v0, v1, v3}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 72
    :cond_3
    sget-object p1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v7, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 73
    new-instance p1, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {p1, v0, v1, v3}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 74
    :cond_4
    sget-object p1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v7, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 75
    new-instance p1, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {p1, v0, v1, v3}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 76
    :cond_5
    const-class p1, Ljava/lang/String;

    invoke-static {v7, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 77
    new-instance p1, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {p1, v0, v1, v3}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 78
    :cond_6
    new-instance p1, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {p1, v0, v1, v3}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 79
    :goto_0
    invoke-virtual {p0, p1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object p1
.end method

.method public final synthetic AsyncBody(Lw7/a;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/a;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lexpo/modules/kotlin/types/AnyType;

    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    new-instance v2, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$3;

    invoke-direct {v2, p1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$3;-><init>(Lw7/a;)V

    const/4 p1, 0x3

    .line 2
    const-string v3, "R"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 p1, 0x4

    .line 3
    invoke-static {p1, v3}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 4
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/Object;

    invoke-static {v3, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    new-instance p1, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {p1, v0, v1, v2}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v3, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 7
    new-instance p1, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {p1, v0, v1, v2}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 8
    :cond_1
    sget-object p1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v3, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 9
    new-instance p1, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {p1, v0, v1, v2}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 10
    :cond_2
    sget-object p1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v3, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 11
    new-instance p1, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {p1, v0, v1, v2}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 12
    :cond_3
    const-class p1, Ljava/lang/String;

    invoke-static {v3, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 13
    new-instance p1, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {p1, v0, v1, v2}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 14
    :cond_4
    new-instance p1, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {p1, v0, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 15
    :goto_0
    invoke-virtual {p0, p1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object p1
.end method

.method public final synthetic AsyncBody(Lw7/o;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/o;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "body"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v2

    const/4 v3, 0x4

    .line 81
    const-string v4, "P0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 82
    const-string v5, "P1"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 83
    const-string v6, "P2"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 84
    sget-object v7, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 85
    new-instance v8, Lkotlin/Pair;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v9, Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    const/4 v11, 0x3

    invoke-static {v11, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-direct {v8, v10, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_0

    .line 87
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v8, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$5;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$5;

    .line 88
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 89
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    .line 90
    invoke-static {v11, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 91
    invoke-direct {v14, v15, v12, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 92
    invoke-direct {v10, v14, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v10

    .line 93
    :cond_0
    new-instance v4, Lkotlin/Pair;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-static {v11, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v10, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1

    .line 95
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$6;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$6;

    .line 96
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 97
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    .line 98
    invoke-static {v11, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 99
    invoke-direct {v14, v15, v12, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 100
    invoke-direct {v10, v14, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v10

    .line 101
    :cond_1
    new-instance v5, Lkotlin/Pair;

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v10, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_2

    .line 103
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$7;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$7;

    .line 104
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 105
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    .line 106
    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 107
    invoke-direct {v10, v13, v12, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 108
    invoke-direct {v7, v10, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v7

    .line 109
    :cond_2
    filled-new-array {v8, v4, v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    .line 110
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    new-instance v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$12;

    invoke-direct {v4, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$12;-><init>(Lw7/o;)V

    .line 111
    const-string v0, "R"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 112
    invoke-static {v3, v0}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 113
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v9, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 114
    new-instance v0, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v4}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_0
    move-object/from16 v1, p0

    goto :goto_1

    .line 115
    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v9, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 116
    new-instance v0, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v4}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 117
    :cond_4
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v9, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 118
    new-instance v0, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v4}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 119
    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v9, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 120
    new-instance v0, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v4}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 121
    :cond_6
    const-class v0, Ljava/lang/String;

    invoke-static {v9, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 122
    new-instance v0, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v4}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 123
    :cond_7
    new-instance v0, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v4}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 124
    :goto_1
    invoke-virtual {v1, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v0
.end method

.method public final synthetic AsyncBody(Lw7/p;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/p;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "body"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v2

    const/4 v3, 0x4

    .line 126
    const-string v4, "P0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 127
    const-string v5, "P1"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 128
    const-string v6, "P2"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 129
    const-string v7, "P3"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 130
    sget-object v8, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 131
    new-instance v9, Lkotlin/Pair;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v10, Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v12, 0x3

    invoke-static {v12, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v13, 0x0

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-direct {v9, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 132
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_0

    .line 133
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v9, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$10;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$10;

    .line 134
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 135
    new-instance v15, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    .line 136
    invoke-static {v12, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 137
    invoke-direct {v15, v3, v13, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 138
    invoke-direct {v11, v15, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v11

    .line 139
    :cond_0
    new-instance v3, Lkotlin/Pair;

    const/4 v4, 0x4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v12, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 140
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_1

    .line 141
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$11;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$11;

    .line 142
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 143
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v15, 0x4

    invoke-static {v15, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    .line 144
    invoke-static {v12, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 145
    invoke-direct {v11, v15, v13, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 146
    invoke-direct {v4, v11, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v3, v4

    .line 147
    :cond_1
    new-instance v4, Lkotlin/Pair;

    const/4 v15, 0x4

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 148
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_2

    .line 149
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$12;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$12;

    .line 150
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 151
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v15, 0x4

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    .line 152
    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 153
    invoke-direct {v11, v15, v13, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 154
    invoke-direct {v5, v11, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 155
    :cond_2
    new-instance v5, Lkotlin/Pair;

    const/4 v15, 0x4

    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v12, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v6, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_3

    .line 157
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$13;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$13;

    .line 158
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 159
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v15, 0x4

    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    .line 160
    invoke-static {v12, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 161
    invoke-direct {v8, v11, v13, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 162
    invoke-direct {v6, v8, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 163
    :cond_3
    filled-new-array {v9, v3, v4, v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    .line 164
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$16;

    invoke-direct {v3, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$16;-><init>(Lw7/p;)V

    .line 165
    const-string v0, "R"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v15, 0x4

    .line 166
    invoke-static {v15, v0}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 167
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v10, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 168
    new-instance v0, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_0
    move-object/from16 v1, p0

    goto :goto_1

    .line 169
    :cond_4
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v10, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 170
    new-instance v0, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 171
    :cond_5
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v10, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 172
    new-instance v0, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 173
    :cond_6
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v10, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 174
    new-instance v0, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 175
    :cond_7
    const-class v0, Ljava/lang/String;

    invoke-static {v10, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 176
    new-instance v0, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 177
    :cond_8
    new-instance v0, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 178
    :goto_1
    invoke-virtual {v1, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v0
.end method

.method public final synthetic AsyncBody(Lw7/q;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            "P4:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/q;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "body"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v2

    const/4 v3, 0x4

    .line 180
    const-string v4, "P0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 181
    const-string v5, "P1"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 182
    const-string v6, "P2"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 183
    const-string v7, "P3"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 184
    const-string v8, "P4"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 185
    sget-object v9, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 186
    new-instance v10, Lkotlin/Pair;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v11, Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v13, 0x3

    invoke-static {v13, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v14, 0x0

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-direct {v10, v12, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 187
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_0

    .line 188
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v10, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$17;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$17;

    .line 189
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 190
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    .line 191
    invoke-static {v13, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v4, 0x0

    .line 192
    invoke-direct {v14, v3, v4, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 193
    invoke-direct {v12, v14, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v12

    .line 194
    :cond_0
    new-instance v3, Lkotlin/Pair;

    const/4 v4, 0x4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v13, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 195
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_1

    .line 196
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$18;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$18;

    .line 197
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 198
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    .line 199
    invoke-static {v13, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v5, 0x0

    .line 200
    invoke-direct {v12, v14, v5, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 201
    invoke-direct {v4, v12, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v3, v4

    .line 202
    :cond_1
    new-instance v4, Lkotlin/Pair;

    const/4 v14, 0x4

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 203
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_2

    .line 204
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$19;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$19;

    .line 205
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 206
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    .line 207
    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 208
    invoke-direct {v12, v14, v6, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 209
    invoke-direct {v5, v12, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 210
    :cond_2
    new-instance v5, Lkotlin/Pair;

    const/4 v14, 0x4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v6, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 211
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_3

    .line 212
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$20;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$20;

    .line 213
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 214
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    .line 215
    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 216
    invoke-direct {v12, v14, v7, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 217
    invoke-direct {v6, v12, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 218
    :cond_3
    new-instance v6, Lkotlin/Pair;

    const/4 v14, 0x4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v6, v7, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 219
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_4

    .line 220
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v6, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$21;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$21;

    .line 221
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 222
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    .line 223
    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 224
    invoke-direct {v9, v12, v8, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 225
    invoke-direct {v7, v9, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 226
    :cond_4
    filled-new-array {v10, v3, v4, v5, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    .line 227
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$20;

    invoke-direct {v3, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$20;-><init>(Lw7/q;)V

    .line 228
    const-string v0, "R"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v14, 0x4

    .line 229
    invoke-static {v14, v0}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 230
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v11, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 231
    new-instance v0, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_0
    move-object/from16 v1, p0

    goto :goto_1

    .line 232
    :cond_5
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v11, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 233
    new-instance v0, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 234
    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v11, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 235
    new-instance v0, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 236
    :cond_7
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v11, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 237
    new-instance v0, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 238
    :cond_8
    const-class v0, Ljava/lang/String;

    invoke-static {v11, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 239
    new-instance v0, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 240
    :cond_9
    new-instance v0, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    .line 241
    :goto_1
    invoke-virtual {v1, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v0
.end method

.method public final synthetic AsyncBody(Lw7/r;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            "P4:",
            "Ljava/lang/Object;",
            "P5:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/r;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "body"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v2

    const/4 v3, 0x4

    .line 243
    const-string v4, "P0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 244
    const-string v5, "P1"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 245
    const-string v6, "P2"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 246
    const-string v7, "P3"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 247
    const-string v8, "P4"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 248
    const-string v9, "P5"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 249
    sget-object v10, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 250
    new-instance v11, Lkotlin/Pair;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v12, Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v14, 0x3

    invoke-static {v14, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-direct {v11, v13, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 251
    invoke-virtual {v10}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_0

    .line 252
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v11, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$26;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$26;

    .line 253
    new-instance v13, Lexpo/modules/kotlin/types/AnyType;

    .line 254
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    move-object/from16 v17, v10

    const/4 v10, 0x3

    .line 255
    invoke-static {v10, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v4, v16

    .line 256
    invoke-direct {v14, v3, v4, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 257
    invoke-direct {v13, v14, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v18, v13

    goto :goto_0

    :cond_0
    move-object/from16 v17, v10

    move v10, v14

    move-object/from16 v18, v11

    .line 258
    :goto_0
    new-instance v3, Lkotlin/Pair;

    const/4 v4, 0x4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v10, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 259
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_1

    .line 260
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$27;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$27;

    .line 261
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 262
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v14, 0x3

    .line 263
    invoke-static {v14, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v5, 0x0

    .line 264
    invoke-direct {v10, v13, v5, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 265
    invoke-direct {v4, v10, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v19, v4

    goto :goto_1

    :cond_1
    const/4 v11, 0x4

    const/4 v14, 0x3

    move-object/from16 v19, v3

    .line 266
    :goto_1
    new-instance v3, Lkotlin/Pair;

    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 267
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_2

    .line 268
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$28;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$28;

    .line 269
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 270
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    const/4 v14, 0x3

    .line 271
    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 272
    invoke-direct {v5, v10, v6, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 273
    invoke-direct {v4, v5, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v20, v4

    goto :goto_2

    :cond_2
    const/4 v11, 0x4

    const/4 v14, 0x3

    move-object/from16 v20, v3

    .line 274
    :goto_2
    new-instance v3, Lkotlin/Pair;

    invoke-static {v11, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 275
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_3

    .line 276
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$29;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$29;

    .line 277
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 278
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v14, 0x3

    .line 279
    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 280
    invoke-direct {v5, v6, v7, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 281
    invoke-direct {v4, v5, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v21, v4

    goto :goto_3

    :cond_3
    const/4 v11, 0x4

    const/4 v14, 0x3

    move-object/from16 v21, v3

    .line 282
    :goto_3
    new-instance v3, Lkotlin/Pair;

    invoke-static {v11, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 283
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_4

    .line 284
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$30;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$30;

    .line 285
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 286
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v14, 0x3

    .line 287
    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 288
    invoke-direct {v5, v6, v7, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 289
    invoke-direct {v4, v5, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v22, v4

    goto :goto_4

    :cond_4
    const/4 v11, 0x4

    const/4 v14, 0x3

    move-object/from16 v22, v3

    .line 290
    :goto_4
    new-instance v3, Lkotlin/Pair;

    invoke-static {v11, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 291
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_5

    .line 292
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$31;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$31;

    .line 293
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 294
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v14, 0x3

    .line 295
    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 296
    invoke-direct {v5, v6, v7, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 297
    invoke-direct {v4, v5, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v23, v4

    goto :goto_5

    :cond_5
    const/4 v14, 0x3

    move-object/from16 v23, v3

    .line 298
    :goto_5
    filled-new-array/range {v18 .. v23}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    .line 299
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$24;

    invoke-direct {v3, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$24;-><init>(Lw7/r;)V

    .line 300
    const-string v0, "R"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v11, 0x4

    .line 301
    invoke-static {v11, v0}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 302
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v12, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 303
    new-instance v0, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_6
    move-object/from16 v1, p0

    goto :goto_7

    .line 304
    :cond_6
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v12, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 305
    new-instance v0, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    .line 306
    :cond_7
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v12, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 307
    new-instance v0, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    .line 308
    :cond_8
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v12, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 309
    new-instance v0, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    .line 310
    :cond_9
    const-class v0, Ljava/lang/String;

    invoke-static {v12, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 311
    new-instance v0, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    .line 312
    :cond_a
    new-instance v0, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    .line 313
    :goto_7
    invoke-virtual {v1, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v0
.end method

.method public final synthetic AsyncBody(Lw7/s;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            "P4:",
            "Ljava/lang/Object;",
            "P5:",
            "Ljava/lang/Object;",
            "P6:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/s;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "body"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 314
    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v2

    const/4 v3, 0x4

    .line 315
    const-string v4, "P0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 316
    const-string v5, "P1"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 317
    const-string v6, "P2"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 318
    const-string v7, "P3"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 319
    const-string v8, "P4"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 320
    const-string v9, "P5"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 321
    const-string v10, "P6"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 322
    sget-object v11, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 323
    new-instance v12, Lkotlin/Pair;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v13, Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x3

    invoke-static {v15, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-direct {v12, v14, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 324
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lexpo/modules/kotlin/types/AnyType;

    if-nez v12, :cond_0

    .line 325
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v12, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$37;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$37;

    .line 326
    new-instance v14, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v17, v11

    .line 327
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    move-object/from16 v18, v1

    const/4 v1, 0x3

    .line 328
    invoke-static {v1, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v4, v16

    .line 329
    invoke-direct {v11, v3, v4, v12}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 330
    invoke-direct {v14, v11, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v19, v14

    goto :goto_0

    :cond_0
    move-object/from16 v18, v1

    move-object/from16 v17, v11

    const/4 v1, 0x3

    move-object/from16 v19, v12

    .line 331
    :goto_0
    new-instance v3, Lkotlin/Pair;

    const/4 v4, 0x4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v1, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 332
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_1

    .line 333
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$38;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$38;

    .line 334
    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    .line 335
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v14, 0x3

    .line 336
    invoke-static {v14, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v5, 0x0

    .line 337
    invoke-direct {v4, v12, v5, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 338
    invoke-direct {v3, v4, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v20, v3

    goto :goto_1

    :cond_1
    const/4 v11, 0x4

    const/4 v14, 0x3

    move-object/from16 v20, v1

    .line 339
    :goto_1
    new-instance v1, Lkotlin/Pair;

    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v3, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 340
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_2

    .line 341
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$39;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$39;

    .line 342
    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    .line 343
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    const/4 v14, 0x3

    .line 344
    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 345
    invoke-direct {v4, v5, v6, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 346
    invoke-direct {v3, v4, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v21, v3

    goto :goto_2

    :cond_2
    const/4 v11, 0x4

    const/4 v14, 0x3

    move-object/from16 v21, v1

    .line 347
    :goto_2
    new-instance v1, Lkotlin/Pair;

    invoke-static {v11, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v3, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 348
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_3

    .line 349
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$40;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$40;

    .line 350
    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    .line 351
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    const/4 v14, 0x3

    .line 352
    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 353
    invoke-direct {v4, v5, v6, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 354
    invoke-direct {v3, v4, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v22, v3

    goto :goto_3

    :cond_3
    const/4 v11, 0x4

    const/4 v14, 0x3

    move-object/from16 v22, v1

    .line 355
    :goto_3
    new-instance v1, Lkotlin/Pair;

    invoke-static {v11, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v3, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 356
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_4

    .line 357
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$41;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$41;

    .line 358
    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    .line 359
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    const/4 v14, 0x3

    .line 360
    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 361
    invoke-direct {v4, v5, v6, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 362
    invoke-direct {v3, v4, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v23, v3

    goto :goto_4

    :cond_4
    const/4 v11, 0x4

    const/4 v14, 0x3

    move-object/from16 v23, v1

    .line 363
    :goto_4
    new-instance v1, Lkotlin/Pair;

    invoke-static {v11, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v3, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 364
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_5

    .line 365
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$42;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$42;

    .line 366
    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    .line 367
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    const/4 v14, 0x3

    .line 368
    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 369
    invoke-direct {v4, v5, v6, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 370
    invoke-direct {v3, v4, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v24, v3

    goto :goto_5

    :cond_5
    const/4 v11, 0x4

    const/4 v14, 0x3

    move-object/from16 v24, v1

    .line 371
    :goto_5
    new-instance v1, Lkotlin/Pair;

    invoke-static {v11, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v3, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 372
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_6

    .line 373
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$43;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$43;

    .line 374
    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    .line 375
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    const/4 v14, 0x3

    .line 376
    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 377
    invoke-direct {v4, v5, v6, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 378
    invoke-direct {v3, v4, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v25, v3

    goto :goto_6

    :cond_6
    const/4 v14, 0x3

    move-object/from16 v25, v1

    .line 379
    :goto_6
    filled-new-array/range {v19 .. v25}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 380
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    new-instance v2, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$28;

    invoke-direct {v2, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$28;-><init>(Lw7/s;)V

    .line 381
    const-string v0, "R"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v11, 0x4

    .line 382
    invoke-static {v11, v0}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 383
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v13, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 384
    new-instance v0, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    move-object/from16 v3, v18

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_7
    move-object/from16 v1, p0

    goto :goto_8

    :cond_7
    move-object/from16 v3, v18

    .line 385
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v13, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 386
    new-instance v0, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 387
    :cond_8
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v13, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 388
    new-instance v0, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 389
    :cond_9
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v13, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 390
    new-instance v0, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 391
    :cond_a
    const-class v0, Ljava/lang/String;

    invoke-static {v13, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 392
    new-instance v0, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 393
    :cond_b
    new-instance v0, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 394
    :goto_8
    invoke-virtual {v1, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v0
.end method

.method public final synthetic AsyncBody(Lw7/t;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            "P4:",
            "Ljava/lang/Object;",
            "P5:",
            "Ljava/lang/Object;",
            "P6:",
            "Ljava/lang/Object;",
            "P7:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/t;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "body"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 395
    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v2

    const/4 v3, 0x4

    .line 396
    const-string v4, "P0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 397
    const-string v5, "P1"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 398
    const-string v6, "P2"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 399
    const-string v7, "P3"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 400
    const-string v8, "P4"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 401
    const-string v9, "P5"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 402
    const-string v10, "P6"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 403
    const-string v11, "P7"

    invoke-static {v3, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 404
    sget-object v12, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 405
    new-instance v13, Lkotlin/Pair;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v14, Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    const/4 v3, 0x3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v13, v15, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 406
    invoke-virtual {v12}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v15

    invoke-interface {v15, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lexpo/modules/kotlin/types/AnyType;

    if-nez v13, :cond_0

    .line 407
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v13, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$50;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$50;

    .line 408
    new-instance v15, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v17, v12

    .line 409
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v18, v1

    const/4 v1, 0x4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v1

    move-object/from16 v19, v14

    const/4 v14, 0x3

    .line 410
    invoke-static {v14, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v4, v16

    .line 411
    invoke-direct {v12, v1, v4, v13}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 412
    invoke-direct {v15, v12, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v20, v15

    goto :goto_0

    :cond_0
    move-object/from16 v18, v1

    move-object/from16 v17, v12

    move-object/from16 v19, v14

    const/4 v14, 0x3

    move-object/from16 v20, v13

    .line 413
    :goto_0
    new-instance v1, Lkotlin/Pair;

    const/4 v4, 0x4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v14, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 414
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_1

    .line 415
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51;

    .line 416
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 417
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x3

    .line 418
    invoke-static {v15, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v5, 0x0

    .line 419
    invoke-direct {v12, v14, v5, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 420
    invoke-direct {v4, v12, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v21, v4

    goto :goto_1

    :cond_1
    const/4 v13, 0x4

    const/4 v15, 0x3

    move-object/from16 v21, v1

    .line 421
    :goto_1
    new-instance v1, Lkotlin/Pair;

    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 422
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_2

    .line 423
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$52;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$52;

    .line 424
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 425
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v14, 0x3

    .line 426
    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 427
    invoke-direct {v5, v12, v6, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 428
    invoke-direct {v4, v5, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v22, v4

    goto :goto_2

    :cond_2
    const/4 v13, 0x4

    const/4 v14, 0x3

    move-object/from16 v22, v1

    .line 429
    :goto_2
    new-instance v1, Lkotlin/Pair;

    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 430
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_3

    .line 431
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$53;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$53;

    .line 432
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 433
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v14, 0x3

    .line 434
    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 435
    invoke-direct {v5, v6, v7, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 436
    invoke-direct {v4, v5, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v23, v4

    goto :goto_3

    :cond_3
    const/4 v13, 0x4

    const/4 v14, 0x3

    move-object/from16 v23, v1

    .line 437
    :goto_3
    new-instance v1, Lkotlin/Pair;

    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 438
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_4

    .line 439
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$54;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$54;

    .line 440
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 441
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v14, 0x3

    .line 442
    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 443
    invoke-direct {v5, v6, v7, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 444
    invoke-direct {v4, v5, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v24, v4

    goto :goto_4

    :cond_4
    const/4 v13, 0x4

    const/4 v14, 0x3

    move-object/from16 v24, v1

    .line 445
    :goto_4
    new-instance v1, Lkotlin/Pair;

    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 446
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_5

    .line 447
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$55;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$55;

    .line 448
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 449
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v14, 0x3

    .line 450
    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 451
    invoke-direct {v5, v6, v7, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 452
    invoke-direct {v4, v5, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v25, v4

    goto :goto_5

    :cond_5
    const/4 v13, 0x4

    const/4 v14, 0x3

    move-object/from16 v25, v1

    .line 453
    :goto_5
    new-instance v1, Lkotlin/Pair;

    invoke-static {v13, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 454
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_6

    .line 455
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$56;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$56;

    .line 456
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 457
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v14, 0x3

    .line 458
    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 459
    invoke-direct {v5, v6, v7, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 460
    invoke-direct {v4, v5, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v26, v4

    goto :goto_6

    :cond_6
    const/4 v13, 0x4

    const/4 v14, 0x3

    move-object/from16 v26, v1

    .line 461
    :goto_6
    new-instance v1, Lkotlin/Pair;

    invoke-static {v13, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v14, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 462
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_7

    .line 463
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$57;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$57;

    .line 464
    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    .line 465
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    const/4 v14, 0x3

    .line 466
    invoke-static {v14, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 467
    invoke-direct {v4, v5, v7, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 468
    invoke-direct {v3, v4, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v27, v3

    goto :goto_7

    :cond_7
    const/4 v14, 0x3

    move-object/from16 v27, v1

    .line 469
    :goto_7
    filled-new-array/range {v20 .. v27}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 470
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    new-instance v2, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$32;

    invoke-direct {v2, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$32;-><init>(Lw7/t;)V

    .line 471
    const-string v0, "R"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v13, 0x4

    .line 472
    invoke-static {v13, v0}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 473
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    move-object/from16 v3, v19

    invoke-static {v3, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 474
    new-instance v0, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    move-object/from16 v4, v18

    invoke-direct {v0, v4, v1, v2}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_8
    move-object/from16 v1, p0

    goto :goto_9

    :cond_8
    move-object/from16 v4, v18

    .line 475
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v3, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 476
    new-instance v0, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v0, v4, v1, v2}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 477
    :cond_9
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v3, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 478
    new-instance v0, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v0, v4, v1, v2}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 479
    :cond_a
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v3, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 480
    new-instance v0, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v0, v4, v1, v2}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 481
    :cond_b
    const-class v0, Ljava/lang/String;

    invoke-static {v3, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 482
    new-instance v0, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v0, v4, v1, v2}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 483
    :cond_c
    new-instance v0, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v0, v4, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 484
    :goto_9
    invoke-virtual {v1, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v0
.end method

.method public final AsyncBodyWithoutArgs(Lw7/a;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/a;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    .line 1
    const-string v0, "body"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    new-array v1, v1, [Lexpo/modules/kotlin/types/AnyType;

    .line 12
    .line 13
    new-instance v2, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$1;

    .line 14
    .line 15
    invoke-direct {v2, p1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$1;-><init>(Lw7/a;)V

    .line 16
    .line 17
    .line 18
    new-instance p1, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 19
    .line 20
    invoke-direct {p1, v0, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public final synthetic AsyncFunctionWithPromise(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function2;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    invoke-virtual {p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v2

    const/4 v3, 0x4

    .line 2
    const-string v4, "P0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 3
    sget-object v5, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 4
    new-instance v6, Lkotlin/Pair;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v7, Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v9, 0x3

    invoke-static {v9, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v10, 0x0

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-direct {v6, v8, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 5
    invoke-virtual {v5}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_0

    .line 6
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$4;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$4;

    .line 7
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 8
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    .line 9
    invoke-static {v9, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 10
    invoke-direct {v8, v3, v10, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 11
    invoke-direct {v6, v8, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 12
    :cond_0
    filled-new-array {v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    .line 13
    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$10;

    invoke-direct {v3, p1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$10;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 14
    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 15
    invoke-virtual {p0, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v0
.end method

.method public final synthetic AsyncFunctionWithPromise(Lw7/o;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/o;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "body"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    new-instance v1, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    const/4 v4, 0x4

    .line 17
    const-string v5, "P0"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 18
    const-string v6, "P1"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 19
    sget-object v7, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 20
    new-instance v8, Lkotlin/Pair;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v9, Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    const/4 v11, 0x3

    invoke-static {v11, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-direct {v8, v10, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_0

    .line 22
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v8, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$8;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$8;

    .line 23
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 24
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    .line 25
    invoke-static {v11, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 26
    invoke-direct {v14, v15, v12, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 27
    invoke-direct {v10, v14, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v10

    .line 28
    :cond_0
    new-instance v5, Lkotlin/Pair;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v10, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_1

    .line 30
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$9;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$9;

    .line 31
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 32
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    .line 33
    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 34
    invoke-direct {v10, v4, v12, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 35
    invoke-direct {v7, v10, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v7

    .line 36
    :cond_1
    filled-new-array {v8, v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 37
    new-instance v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$14;

    invoke-direct {v4, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$14;-><init>(Lw7/o;)V

    .line 38
    invoke-direct {v1, v2, v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    move-object/from16 v0, p0

    .line 39
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v1
.end method

.method public final synthetic AsyncFunctionWithPromise(Lw7/p;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/p;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "body"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    new-instance v1, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    const/4 v4, 0x4

    .line 41
    const-string v5, "P0"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 42
    const-string v6, "P1"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 43
    const-string v7, "P2"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 44
    sget-object v8, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 45
    new-instance v9, Lkotlin/Pair;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v10, Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v12, 0x3

    invoke-static {v12, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v13, 0x0

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-direct {v9, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_0

    .line 47
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v9, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$14;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$14;

    .line 48
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 49
    new-instance v15, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    .line 50
    invoke-static {v12, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 51
    invoke-direct {v15, v4, v13, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 52
    invoke-direct {v11, v15, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v11

    .line 53
    :cond_0
    new-instance v4, Lkotlin/Pair;

    const/4 v5, 0x4

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1

    .line 55
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$15;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$15;

    .line 56
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 57
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v15, 0x4

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    .line 58
    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 59
    invoke-direct {v11, v15, v13, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 60
    invoke-direct {v5, v11, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 61
    :cond_1
    new-instance v5, Lkotlin/Pair;

    const/4 v15, 0x4

    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v12, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v6, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_2

    .line 63
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$16;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$16;

    .line 64
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 65
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v15, 0x4

    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    .line 66
    invoke-static {v12, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 67
    invoke-direct {v8, v10, v13, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 68
    invoke-direct {v6, v8, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 69
    :cond_2
    filled-new-array {v9, v4, v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 70
    new-instance v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$18;

    invoke-direct {v4, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$18;-><init>(Lw7/p;)V

    .line 71
    invoke-direct {v1, v2, v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    move-object/from16 v0, p0

    .line 72
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v1
.end method

.method public final synthetic AsyncFunctionWithPromise(Lw7/q;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/q;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "body"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    new-instance v1, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    const/4 v4, 0x4

    .line 74
    const-string v5, "P0"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 75
    const-string v6, "P1"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 76
    const-string v7, "P2"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 77
    const-string v8, "P3"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 78
    sget-object v9, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 79
    new-instance v10, Lkotlin/Pair;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v11, Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v13, 0x3

    invoke-static {v13, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v14, 0x0

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-direct {v10, v12, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_0

    .line 81
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v10, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$22;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$22;

    .line 82
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 83
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    .line 84
    invoke-static {v13, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v5, 0x0

    .line 85
    invoke-direct {v14, v4, v5, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 86
    invoke-direct {v12, v14, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v12

    .line 87
    :cond_0
    new-instance v4, Lkotlin/Pair;

    const/4 v5, 0x4

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1

    .line 89
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$23;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$23;

    .line 90
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 91
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    .line 92
    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 93
    invoke-direct {v12, v14, v6, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 94
    invoke-direct {v5, v12, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 95
    :cond_1
    new-instance v5, Lkotlin/Pair;

    const/4 v14, 0x4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v6, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_2

    .line 97
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$24;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$24;

    .line 98
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 99
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    .line 100
    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 101
    invoke-direct {v12, v14, v7, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 102
    invoke-direct {v6, v12, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 103
    :cond_2
    new-instance v6, Lkotlin/Pair;

    const/4 v14, 0x4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v6, v7, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 104
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_3

    .line 105
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v6, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$25;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$25;

    .line 106
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 107
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    .line 108
    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 109
    invoke-direct {v9, v11, v8, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 110
    invoke-direct {v7, v9, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 111
    :cond_3
    filled-new-array {v10, v4, v5, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 112
    new-instance v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$22;

    invoke-direct {v4, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$22;-><init>(Lw7/q;)V

    .line 113
    invoke-direct {v1, v2, v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    move-object/from16 v0, p0

    .line 114
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v1
.end method

.method public final synthetic AsyncFunctionWithPromise(Lw7/r;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            "P4:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/r;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "body"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    new-instance v1, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    const/4 v4, 0x4

    .line 116
    const-string v5, "P0"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 117
    const-string v6, "P1"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 118
    const-string v7, "P2"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 119
    const-string v8, "P3"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 120
    const-string v9, "P4"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 121
    sget-object v10, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 122
    new-instance v11, Lkotlin/Pair;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v12, Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v14, 0x3

    invoke-static {v14, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-direct {v11, v13, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 123
    invoke-virtual {v10}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_0

    .line 124
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v11, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$32;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$32;

    .line 125
    new-instance v13, Lexpo/modules/kotlin/types/AnyType;

    .line 126
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    move-object/from16 v17, v10

    const/4 v10, 0x3

    .line 127
    invoke-static {v10, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v5, v16

    .line 128
    invoke-direct {v14, v4, v5, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 129
    invoke-direct {v13, v14, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v13

    goto :goto_0

    :cond_0
    move-object/from16 v17, v10

    move v10, v14

    .line 130
    :goto_0
    new-instance v4, Lkotlin/Pair;

    const/4 v5, 0x4

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v10, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1

    .line 132
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$33;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$33;

    .line 133
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 134
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v13, 0x3

    .line 135
    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 136
    invoke-direct {v10, v14, v6, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 137
    invoke-direct {v5, v10, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    goto :goto_1

    :cond_1
    const/4 v13, 0x3

    .line 138
    :goto_1
    new-instance v5, Lkotlin/Pair;

    const/4 v6, 0x4

    invoke-static {v6, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v6, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_2

    .line 140
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$34;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$34;

    .line 141
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 142
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v13, 0x3

    .line 143
    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 144
    invoke-direct {v10, v14, v7, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 145
    invoke-direct {v6, v10, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    goto :goto_2

    :cond_2
    const/4 v13, 0x3

    .line 146
    :goto_2
    new-instance v6, Lkotlin/Pair;

    const/4 v7, 0x4

    invoke-static {v7, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v6, v7, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 147
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_3

    .line 148
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v6, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$35;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$35;

    .line 149
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 150
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v13, 0x3

    .line 151
    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 152
    invoke-direct {v10, v14, v8, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 153
    invoke-direct {v7, v10, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    goto :goto_3

    :cond_3
    const/4 v13, 0x3

    .line 154
    :goto_3
    new-instance v7, Lkotlin/Pair;

    const/4 v8, 0x4

    invoke-static {v8, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v7, v8, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 155
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_4

    .line 156
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v7, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$36;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$36;

    .line 157
    new-instance v8, Lexpo/modules/kotlin/types/AnyType;

    .line 158
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v13, 0x3

    .line 159
    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v9, 0x0

    .line 160
    invoke-direct {v10, v12, v9, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 161
    invoke-direct {v8, v10, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v8

    .line 162
    :cond_4
    filled-new-array {v11, v4, v5, v6, v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 163
    new-instance v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$26;

    invoke-direct {v4, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$26;-><init>(Lw7/r;)V

    .line 164
    invoke-direct {v1, v2, v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    move-object/from16 v0, p0

    .line 165
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v1
.end method

.method public final synthetic AsyncFunctionWithPromise(Lw7/s;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            "P4:",
            "Ljava/lang/Object;",
            "P5:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/s;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "body"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    new-instance v1, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    const/4 v4, 0x4

    .line 167
    const-string v5, "P0"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 168
    const-string v6, "P1"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 169
    const-string v7, "P2"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 170
    const-string v8, "P3"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 171
    const-string v9, "P4"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 172
    const-string v10, "P5"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 173
    sget-object v11, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 174
    new-instance v12, Lkotlin/Pair;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v13, Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x3

    invoke-static {v15, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-direct {v12, v14, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 175
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lexpo/modules/kotlin/types/AnyType;

    if-nez v12, :cond_0

    .line 176
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v12, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$44;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$44;

    .line 177
    new-instance v14, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v17, v11

    .line 178
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    move-object/from16 v18, v13

    const/4 v13, 0x3

    .line 179
    invoke-static {v13, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v5, v16

    .line 180
    invoke-direct {v11, v4, v5, v12}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 181
    invoke-direct {v14, v11, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v19, v14

    goto :goto_0

    :cond_0
    move-object/from16 v17, v11

    move-object/from16 v18, v13

    const/4 v13, 0x3

    move-object/from16 v19, v12

    .line 182
    :goto_0
    new-instance v4, Lkotlin/Pair;

    const/4 v5, 0x4

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 183
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1

    .line 184
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$45;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$45;

    .line 185
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 186
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v12, 0x4

    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v14, 0x3

    .line 187
    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 188
    invoke-direct {v11, v13, v6, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 189
    invoke-direct {v5, v11, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v20, v5

    goto :goto_1

    :cond_1
    const/4 v12, 0x4

    const/4 v14, 0x3

    move-object/from16 v20, v4

    .line 190
    :goto_1
    new-instance v4, Lkotlin/Pair;

    invoke-static {v12, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 191
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_2

    .line 192
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$46;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$46;

    .line 193
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 194
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v12, 0x4

    invoke-static {v12, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v14, 0x3

    .line 195
    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 196
    invoke-direct {v6, v11, v7, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 197
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v21, v5

    goto :goto_2

    :cond_2
    const/4 v12, 0x4

    const/4 v14, 0x3

    move-object/from16 v21, v4

    .line 198
    :goto_2
    new-instance v4, Lkotlin/Pair;

    invoke-static {v12, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 199
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_3

    .line 200
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$47;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$47;

    .line 201
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 202
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v12, 0x4

    invoke-static {v12, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v14, 0x3

    .line 203
    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 204
    invoke-direct {v6, v7, v8, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 205
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v22, v5

    goto :goto_3

    :cond_3
    const/4 v12, 0x4

    const/4 v14, 0x3

    move-object/from16 v22, v4

    .line 206
    :goto_3
    new-instance v4, Lkotlin/Pair;

    invoke-static {v12, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 207
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_4

    .line 208
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$48;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$48;

    .line 209
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 210
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v12, 0x4

    invoke-static {v12, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v14, 0x3

    .line 211
    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 212
    invoke-direct {v6, v7, v8, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 213
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v23, v5

    goto :goto_4

    :cond_4
    const/4 v12, 0x4

    const/4 v14, 0x3

    move-object/from16 v23, v4

    .line 214
    :goto_4
    new-instance v4, Lkotlin/Pair;

    invoke-static {v12, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 215
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_5

    .line 216
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$49;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$49;

    .line 217
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 218
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v12, 0x4

    invoke-static {v12, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v14, 0x3

    .line 219
    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 220
    invoke-direct {v6, v7, v8, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 221
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v24, v5

    goto :goto_5

    :cond_5
    move-object/from16 v24, v4

    .line 222
    :goto_5
    filled-new-array/range {v19 .. v24}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 223
    new-instance v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$30;

    invoke-direct {v4, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$30;-><init>(Lw7/s;)V

    .line 224
    invoke-direct {v1, v2, v3, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    move-object/from16 v0, p0

    .line 225
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v1
.end method

.method public final synthetic AsyncFunctionWithPromise(Lw7/t;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            "P4:",
            "Ljava/lang/Object;",
            "P5:",
            "Ljava/lang/Object;",
            "P6:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/t;",
            ")",
            "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "body"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    new-instance v1, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    const/4 v4, 0x4

    .line 227
    const-string v5, "P0"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 228
    const-string v6, "P1"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 229
    const-string v7, "P2"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 230
    const-string v8, "P3"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 231
    const-string v9, "P4"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 232
    const-string v10, "P5"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 233
    const-string v11, "P6"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 234
    sget-object v12, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 235
    new-instance v13, Lkotlin/Pair;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v14, Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    const/4 v4, 0x3

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-direct {v13, v15, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 236
    invoke-virtual {v12}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v15

    invoke-interface {v15, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lexpo/modules/kotlin/types/AnyType;

    if-nez v13, :cond_0

    .line 237
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v13, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$58;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$58;

    .line 238
    new-instance v15, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v17, v12

    .line 239
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v18, v14

    const/4 v14, 0x4

    invoke-static {v14, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    move-object/from16 v19, v1

    const/4 v1, 0x3

    .line 240
    invoke-static {v1, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v5, v16

    .line 241
    invoke-direct {v12, v14, v5, v13}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 242
    invoke-direct {v15, v12, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v20, v15

    goto :goto_0

    :cond_0
    move-object/from16 v19, v1

    move-object/from16 v17, v12

    move-object/from16 v18, v14

    const/4 v1, 0x3

    move-object/from16 v20, v13

    .line 243
    :goto_0
    new-instance v5, Lkotlin/Pair;

    const/4 v14, 0x4

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-static {v1, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v12, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 244
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_1

    .line 245
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$59;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$59;

    .line 246
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 247
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x3

    .line 248
    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 249
    invoke-direct {v12, v13, v6, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 250
    invoke-direct {v5, v12, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v21, v5

    goto :goto_1

    :cond_1
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v21, v1

    .line 251
    :goto_1
    new-instance v1, Lkotlin/Pair;

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 252
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_2

    .line 253
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$60;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$60;

    .line 254
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 255
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x3

    .line 256
    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 257
    invoke-direct {v6, v12, v7, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 258
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v22, v5

    goto :goto_2

    :cond_2
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v22, v1

    .line 259
    :goto_2
    new-instance v1, Lkotlin/Pair;

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v15, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 260
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_3

    .line 261
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$61;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$61;

    .line 262
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 263
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x3

    .line 264
    invoke-static {v15, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 265
    invoke-direct {v6, v7, v8, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 266
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v23, v5

    goto :goto_3

    :cond_3
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v23, v1

    .line 267
    :goto_3
    new-instance v1, Lkotlin/Pair;

    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v15, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 268
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_4

    .line 269
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$62;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$62;

    .line 270
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 271
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x3

    .line 272
    invoke-static {v15, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 273
    invoke-direct {v6, v7, v8, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 274
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v24, v5

    goto :goto_4

    :cond_4
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v24, v1

    .line 275
    :goto_4
    new-instance v1, Lkotlin/Pair;

    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v15, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 276
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_5

    .line 277
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$63;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$63;

    .line 278
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 279
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x3

    .line 280
    invoke-static {v15, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 281
    invoke-direct {v6, v7, v8, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 282
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v25, v5

    goto :goto_5

    :cond_5
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v25, v1

    .line 283
    :goto_5
    new-instance v1, Lkotlin/Pair;

    invoke-static {v14, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v15, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 284
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_6

    .line 285
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$64;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$64;

    .line 286
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 287
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 288
    invoke-static {v15, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 289
    invoke-direct {v5, v6, v8, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 290
    invoke-direct {v4, v5, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v26, v4

    goto :goto_6

    :cond_6
    move-object/from16 v26, v1

    .line 291
    :goto_6
    filled-new-array/range {v20 .. v26}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 292
    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$34;

    invoke-direct {v3, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$AsyncBody$34;-><init>(Lw7/t;)V

    move-object/from16 v0, v19

    .line 293
    invoke-direct {v0, v2, v1, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    move-object/from16 v1, p0

    .line 294
    invoke-virtual {v1, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v0
.end method

.method public final synthetic SuspendBody(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lexpo/modules/kotlin/types/AnyType;

    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$1;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$1;-><init>(Lkotlin/jvm/functions/Function1;Ln7/f;)V

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 2
    invoke-virtual {p0, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v0
.end method

.method public final synthetic SuspendBody(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function2;",
            ")",
            "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v2

    const/4 v3, 0x4

    .line 4
    const-string v4, "P0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 5
    sget-object v5, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 6
    new-instance v6, Lkotlin/Pair;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v7, Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v9, 0x3

    invoke-static {v9, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v10, 0x0

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-direct {v6, v8, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    invoke-virtual {v5}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_0

    .line 8
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$1;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$1;

    .line 9
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 10
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    .line 11
    invoke-static {v9, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 12
    invoke-direct {v8, v3, v10, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 13
    invoke-direct {v6, v8, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 14
    :cond_0
    filled-new-array {v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    .line 15
    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$3;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$3;-><init>(Lkotlin/jvm/functions/Function2;Ln7/f;)V

    .line 16
    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 17
    invoke-virtual {p0, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v0
.end method

.method public final synthetic SuspendBody(Lw7/o;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/o;",
            ")",
            "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "block"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v1, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    const/4 v4, 0x4

    .line 19
    const-string v5, "P0"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 20
    const-string v6, "P1"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 21
    sget-object v7, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 22
    new-instance v8, Lkotlin/Pair;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v9, Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    const/4 v11, 0x3

    invoke-static {v11, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-direct {v8, v10, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_0

    .line 24
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v8, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$2;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$2;

    .line 25
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 26
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    .line 27
    invoke-static {v11, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 28
    invoke-direct {v14, v15, v12, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 29
    invoke-direct {v10, v14, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v10

    .line 30
    :cond_0
    new-instance v5, Lkotlin/Pair;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v10, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_1

    .line 32
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$3;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$3;

    .line 33
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 34
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    .line 35
    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 36
    invoke-direct {v10, v4, v12, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 37
    invoke-direct {v7, v10, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v7

    .line 38
    :cond_1
    filled-new-array {v8, v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 39
    new-instance v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$5;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$5;-><init>(Lw7/o;Ln7/f;)V

    .line 40
    invoke-direct {v1, v2, v3, v4}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    move-object/from16 v0, p0

    .line 41
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v1
.end method

.method public final synthetic SuspendBody(Lw7/p;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/p;",
            ")",
            "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "block"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    new-instance v1, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    const/4 v4, 0x4

    .line 43
    const-string v5, "P0"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 44
    const-string v6, "P1"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 45
    const-string v7, "P2"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 46
    sget-object v8, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 47
    new-instance v9, Lkotlin/Pair;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v10, Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v12, 0x3

    invoke-static {v12, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v13, 0x0

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-direct {v9, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_0

    .line 49
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v9, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$4;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$4;

    .line 50
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 51
    new-instance v15, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    .line 52
    invoke-static {v12, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 53
    invoke-direct {v15, v4, v13, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 54
    invoke-direct {v11, v15, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v11

    .line 55
    :cond_0
    new-instance v4, Lkotlin/Pair;

    const/4 v5, 0x4

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1

    .line 57
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$5;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$5;

    .line 58
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 59
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v15, 0x4

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    .line 60
    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 61
    invoke-direct {v11, v15, v13, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 62
    invoke-direct {v5, v11, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 63
    :cond_1
    new-instance v5, Lkotlin/Pair;

    const/4 v15, 0x4

    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v12, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v6, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_2

    .line 65
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$6;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$6;

    .line 66
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 67
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v15, 0x4

    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    .line 68
    invoke-static {v12, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 69
    invoke-direct {v8, v10, v13, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 70
    invoke-direct {v6, v8, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 71
    :cond_2
    filled-new-array {v9, v4, v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 72
    new-instance v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$7;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$7;-><init>(Lw7/p;Ln7/f;)V

    .line 73
    invoke-direct {v1, v2, v3, v4}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    move-object/from16 v0, p0

    .line 74
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v1
.end method

.method public final synthetic SuspendBody(Lw7/q;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/q;",
            ")",
            "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "block"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    new-instance v1, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    const/4 v4, 0x4

    .line 76
    const-string v5, "P0"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 77
    const-string v6, "P1"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 78
    const-string v7, "P2"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 79
    const-string v8, "P3"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 80
    sget-object v9, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 81
    new-instance v10, Lkotlin/Pair;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v11, Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v13, 0x3

    invoke-static {v13, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v14, 0x0

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-direct {v10, v12, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_0

    .line 83
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v10, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$7;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$7;

    .line 84
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 85
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    .line 86
    invoke-static {v13, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v5, 0x0

    .line 87
    invoke-direct {v14, v4, v5, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 88
    invoke-direct {v12, v14, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v12

    .line 89
    :cond_0
    new-instance v4, Lkotlin/Pair;

    const/4 v5, 0x4

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1

    .line 91
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$8;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$8;

    .line 92
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 93
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    .line 94
    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 95
    invoke-direct {v12, v14, v6, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 96
    invoke-direct {v5, v12, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 97
    :cond_1
    new-instance v5, Lkotlin/Pair;

    const/4 v14, 0x4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v6, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_2

    .line 99
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$9;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$9;

    .line 100
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 101
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    .line 102
    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 103
    invoke-direct {v12, v14, v7, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 104
    invoke-direct {v6, v12, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 105
    :cond_2
    new-instance v6, Lkotlin/Pair;

    const/4 v14, 0x4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v6, v7, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_3

    .line 107
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v6, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$10;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$10;

    .line 108
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 109
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    .line 110
    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 111
    invoke-direct {v9, v11, v8, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 112
    invoke-direct {v7, v9, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 113
    :cond_3
    filled-new-array {v10, v4, v5, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 114
    new-instance v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$9;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$9;-><init>(Lw7/q;Ln7/f;)V

    .line 115
    invoke-direct {v1, v2, v3, v4}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    move-object/from16 v0, p0

    .line 116
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v1
.end method

.method public final synthetic SuspendBody(Lw7/r;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            "P4:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/r;",
            ")",
            "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "block"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    new-instance v1, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    const/4 v4, 0x4

    .line 118
    const-string v5, "P0"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 119
    const-string v6, "P1"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 120
    const-string v7, "P2"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 121
    const-string v8, "P3"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 122
    const-string v9, "P4"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 123
    sget-object v10, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 124
    new-instance v11, Lkotlin/Pair;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v12, Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v14, 0x3

    invoke-static {v14, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-direct {v11, v13, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 125
    invoke-virtual {v10}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_0

    .line 126
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v11, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$11;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$11;

    .line 127
    new-instance v13, Lexpo/modules/kotlin/types/AnyType;

    .line 128
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    move-object/from16 v17, v10

    const/4 v10, 0x3

    .line 129
    invoke-static {v10, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v5, v16

    .line 130
    invoke-direct {v14, v4, v5, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 131
    invoke-direct {v13, v14, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v13

    goto :goto_0

    :cond_0
    move-object/from16 v17, v10

    move v10, v14

    .line 132
    :goto_0
    new-instance v4, Lkotlin/Pair;

    const/4 v5, 0x4

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v10, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 133
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1

    .line 134
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$12;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$12;

    .line 135
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 136
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v13, 0x3

    .line 137
    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 138
    invoke-direct {v10, v14, v6, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 139
    invoke-direct {v5, v10, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    goto :goto_1

    :cond_1
    const/4 v13, 0x3

    .line 140
    :goto_1
    new-instance v5, Lkotlin/Pair;

    const/4 v6, 0x4

    invoke-static {v6, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v6, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_2

    .line 142
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$13;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$13;

    .line 143
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 144
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v13, 0x3

    .line 145
    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 146
    invoke-direct {v10, v14, v7, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 147
    invoke-direct {v6, v10, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    goto :goto_2

    :cond_2
    const/4 v13, 0x3

    .line 148
    :goto_2
    new-instance v6, Lkotlin/Pair;

    const/4 v7, 0x4

    invoke-static {v7, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v6, v7, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_3

    .line 150
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v6, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$14;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$14;

    .line 151
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 152
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v13, 0x3

    .line 153
    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 154
    invoke-direct {v10, v14, v8, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 155
    invoke-direct {v7, v10, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    goto :goto_3

    :cond_3
    const/4 v13, 0x3

    .line 156
    :goto_3
    new-instance v7, Lkotlin/Pair;

    const/4 v8, 0x4

    invoke-static {v8, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v7, v8, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 157
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_4

    .line 158
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v7, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$15;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$15;

    .line 159
    new-instance v8, Lexpo/modules/kotlin/types/AnyType;

    .line 160
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v13, 0x3

    .line 161
    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v9, 0x0

    .line 162
    invoke-direct {v10, v12, v9, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 163
    invoke-direct {v8, v10, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v8

    .line 164
    :cond_4
    filled-new-array {v11, v4, v5, v6, v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 165
    new-instance v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$11;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$11;-><init>(Lw7/r;Ln7/f;)V

    .line 166
    invoke-direct {v1, v2, v3, v4}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    move-object/from16 v0, p0

    .line 167
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v1
.end method

.method public final synthetic SuspendBody(Lw7/s;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            "P4:",
            "Ljava/lang/Object;",
            "P5:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/s;",
            ")",
            "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "block"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    new-instance v1, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    const/4 v4, 0x4

    .line 169
    const-string v5, "P0"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 170
    const-string v6, "P1"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 171
    const-string v7, "P2"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 172
    const-string v8, "P3"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 173
    const-string v9, "P4"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 174
    const-string v10, "P5"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 175
    sget-object v11, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 176
    new-instance v12, Lkotlin/Pair;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v13, Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x3

    invoke-static {v15, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-direct {v12, v14, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lexpo/modules/kotlin/types/AnyType;

    if-nez v12, :cond_0

    .line 178
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v12, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$16;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$16;

    .line 179
    new-instance v14, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v17, v11

    .line 180
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    move-object/from16 v18, v13

    const/4 v13, 0x3

    .line 181
    invoke-static {v13, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v5, v16

    .line 182
    invoke-direct {v11, v4, v5, v12}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 183
    invoke-direct {v14, v11, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v19, v14

    goto :goto_0

    :cond_0
    move-object/from16 v17, v11

    move-object/from16 v18, v13

    const/4 v13, 0x3

    move-object/from16 v19, v12

    .line 184
    :goto_0
    new-instance v4, Lkotlin/Pair;

    const/4 v5, 0x4

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1

    .line 186
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$17;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$17;

    .line 187
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 188
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v12, 0x4

    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v14, 0x3

    .line 189
    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 190
    invoke-direct {v11, v13, v6, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 191
    invoke-direct {v5, v11, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v20, v5

    goto :goto_1

    :cond_1
    const/4 v12, 0x4

    const/4 v14, 0x3

    move-object/from16 v20, v4

    .line 192
    :goto_1
    new-instance v4, Lkotlin/Pair;

    invoke-static {v12, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 193
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_2

    .line 194
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$18;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$18;

    .line 195
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 196
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v12, 0x4

    invoke-static {v12, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v14, 0x3

    .line 197
    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 198
    invoke-direct {v6, v11, v7, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 199
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v21, v5

    goto :goto_2

    :cond_2
    const/4 v12, 0x4

    const/4 v14, 0x3

    move-object/from16 v21, v4

    .line 200
    :goto_2
    new-instance v4, Lkotlin/Pair;

    invoke-static {v12, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 201
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_3

    .line 202
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$19;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$19;

    .line 203
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 204
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v12, 0x4

    invoke-static {v12, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v14, 0x3

    .line 205
    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 206
    invoke-direct {v6, v7, v8, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 207
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v22, v5

    goto :goto_3

    :cond_3
    const/4 v12, 0x4

    const/4 v14, 0x3

    move-object/from16 v22, v4

    .line 208
    :goto_3
    new-instance v4, Lkotlin/Pair;

    invoke-static {v12, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 209
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_4

    .line 210
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$20;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$20;

    .line 211
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 212
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v12, 0x4

    invoke-static {v12, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v14, 0x3

    .line 213
    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 214
    invoke-direct {v6, v7, v8, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 215
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v23, v5

    goto :goto_4

    :cond_4
    const/4 v12, 0x4

    const/4 v14, 0x3

    move-object/from16 v23, v4

    .line 216
    :goto_4
    new-instance v4, Lkotlin/Pair;

    invoke-static {v12, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 217
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_5

    .line 218
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$21;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$21;

    .line 219
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 220
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v12, 0x4

    invoke-static {v12, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v14, 0x3

    .line 221
    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 222
    invoke-direct {v6, v7, v8, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 223
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v24, v5

    goto :goto_5

    :cond_5
    move-object/from16 v24, v4

    .line 224
    :goto_5
    filled-new-array/range {v19 .. v24}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 225
    new-instance v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$13;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$13;-><init>(Lw7/s;Ln7/f;)V

    .line 226
    invoke-direct {v1, v2, v3, v4}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    move-object/from16 v0, p0

    .line 227
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v1
.end method

.method public final synthetic SuspendBody(Lw7/t;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            "P4:",
            "Ljava/lang/Object;",
            "P5:",
            "Ljava/lang/Object;",
            "P6:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/t;",
            ")",
            "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "block"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    new-instance v1, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    const/4 v4, 0x4

    .line 229
    const-string v5, "P0"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 230
    const-string v6, "P1"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 231
    const-string v7, "P2"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 232
    const-string v8, "P3"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 233
    const-string v9, "P4"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 234
    const-string v10, "P5"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 235
    const-string v11, "P6"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 236
    sget-object v12, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 237
    new-instance v13, Lkotlin/Pair;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v14, Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    const/4 v4, 0x3

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-direct {v13, v15, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 238
    invoke-virtual {v12}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v15

    invoke-interface {v15, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lexpo/modules/kotlin/types/AnyType;

    if-nez v13, :cond_0

    .line 239
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v13, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$22;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$22;

    .line 240
    new-instance v15, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v17, v12

    .line 241
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v18, v14

    const/4 v14, 0x4

    invoke-static {v14, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    move-object/from16 v19, v1

    const/4 v1, 0x3

    .line 242
    invoke-static {v1, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v5, v16

    .line 243
    invoke-direct {v12, v14, v5, v13}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 244
    invoke-direct {v15, v12, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v20, v15

    goto :goto_0

    :cond_0
    move-object/from16 v19, v1

    move-object/from16 v17, v12

    move-object/from16 v18, v14

    const/4 v1, 0x3

    move-object/from16 v20, v13

    .line 245
    :goto_0
    new-instance v5, Lkotlin/Pair;

    const/4 v14, 0x4

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-static {v1, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v12, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 246
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_1

    .line 247
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$23;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$23;

    .line 248
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 249
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x3

    .line 250
    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 251
    invoke-direct {v12, v13, v6, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 252
    invoke-direct {v5, v12, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v21, v5

    goto :goto_1

    :cond_1
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v21, v1

    .line 253
    :goto_1
    new-instance v1, Lkotlin/Pair;

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 254
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_2

    .line 255
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$24;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$24;

    .line 256
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 257
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x3

    .line 258
    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 259
    invoke-direct {v6, v12, v7, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 260
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v22, v5

    goto :goto_2

    :cond_2
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v22, v1

    .line 261
    :goto_2
    new-instance v1, Lkotlin/Pair;

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v15, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 262
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_3

    .line 263
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$25;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$25;

    .line 264
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 265
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x3

    .line 266
    invoke-static {v15, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 267
    invoke-direct {v6, v7, v8, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 268
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v23, v5

    goto :goto_3

    :cond_3
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v23, v1

    .line 269
    :goto_3
    new-instance v1, Lkotlin/Pair;

    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v15, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 270
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_4

    .line 271
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$26;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$26;

    .line 272
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 273
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x3

    .line 274
    invoke-static {v15, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 275
    invoke-direct {v6, v7, v8, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 276
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v24, v5

    goto :goto_4

    :cond_4
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v24, v1

    .line 277
    :goto_4
    new-instance v1, Lkotlin/Pair;

    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v15, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 278
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_5

    .line 279
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$27;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$27;

    .line 280
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 281
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x3

    .line 282
    invoke-static {v15, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 283
    invoke-direct {v6, v7, v8, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 284
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v25, v5

    goto :goto_5

    :cond_5
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v25, v1

    .line 285
    :goto_5
    new-instance v1, Lkotlin/Pair;

    invoke-static {v14, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v15, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 286
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_6

    .line 287
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$28;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$28;

    .line 288
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 289
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 290
    invoke-static {v15, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 291
    invoke-direct {v5, v6, v8, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 292
    invoke-direct {v4, v5, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v26, v4

    goto :goto_6

    :cond_6
    move-object/from16 v26, v1

    .line 293
    :goto_6
    filled-new-array/range {v20 .. v26}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 294
    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$15;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$15;-><init>(Lw7/t;Ln7/f;)V

    move-object/from16 v0, v19

    .line 295
    invoke-direct {v0, v2, v1, v3}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    move-object/from16 v1, p0

    .line 296
    invoke-virtual {v1, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v0
.end method

.method public final synthetic SuspendBody(Lw7/u;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            "P4:",
            "Ljava/lang/Object;",
            "P5:",
            "Ljava/lang/Object;",
            "P6:",
            "Ljava/lang/Object;",
            "P7:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/u;",
            ")",
            "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "block"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    new-instance v1, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    const/4 v4, 0x4

    .line 298
    const-string v5, "P0"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 299
    const-string v6, "P1"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 300
    const-string v7, "P2"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 301
    const-string v8, "P3"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 302
    const-string v9, "P4"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 303
    const-string v10, "P5"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 304
    const-string v11, "P6"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 305
    const-string v12, "P7"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 306
    sget-object v13, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 307
    new-instance v14, Lkotlin/Pair;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v15, Ljava/lang/Object;

    invoke-static {v15}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    move-object/from16 v16, v13

    const/4 v13, 0x3

    invoke-static {v13, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v17, 0x0

    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-direct {v14, v4, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 308
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_0

    .line 309
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$29;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$29;

    .line 310
    new-instance v14, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v18, v15

    .line 311
    new-instance v15, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v19, v1

    const/4 v1, 0x4

    invoke-static {v1, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v1

    move-object/from16 v20, v2

    const/4 v2, 0x3

    .line 312
    invoke-static {v2, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v5, v17

    .line 313
    invoke-direct {v15, v1, v5, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 314
    invoke-direct {v14, v15, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v21, v14

    goto :goto_0

    :cond_0
    move-object/from16 v19, v1

    move-object/from16 v20, v2

    move-object/from16 v18, v15

    const/4 v2, 0x3

    move-object/from16 v21, v4

    .line 315
    :goto_0
    new-instance v1, Lkotlin/Pair;

    const/4 v4, 0x4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v2, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v4, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 316
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_1

    .line 317
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$30;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$30;

    .line 318
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 319
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v5, 0x4

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x3

    .line 320
    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 321
    invoke-direct {v4, v14, v6, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 322
    invoke-direct {v2, v4, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v22, v2

    goto :goto_1

    :cond_1
    const/4 v5, 0x4

    const/4 v15, 0x3

    move-object/from16 v22, v1

    .line 323
    :goto_1
    new-instance v1, Lkotlin/Pair;

    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v2, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 324
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_2

    .line 325
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$31;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$31;

    .line 326
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 327
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v5, 0x4

    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 328
    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 329
    invoke-direct {v4, v6, v7, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 330
    invoke-direct {v2, v4, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v23, v2

    goto :goto_2

    :cond_2
    const/4 v5, 0x4

    const/4 v15, 0x3

    move-object/from16 v23, v1

    .line 331
    :goto_2
    new-instance v1, Lkotlin/Pair;

    invoke-static {v5, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v2, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 332
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_3

    .line 333
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$32;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$32;

    .line 334
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 335
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v5, 0x4

    invoke-static {v5, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 336
    invoke-static {v15, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 337
    invoke-direct {v4, v6, v7, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 338
    invoke-direct {v2, v4, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v24, v2

    goto :goto_3

    :cond_3
    const/4 v5, 0x4

    const/4 v15, 0x3

    move-object/from16 v24, v1

    .line 339
    :goto_3
    new-instance v1, Lkotlin/Pair;

    invoke-static {v5, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v2, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 340
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_4

    .line 341
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$33;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$33;

    .line 342
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 343
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v5, 0x4

    invoke-static {v5, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 344
    invoke-static {v15, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 345
    invoke-direct {v4, v6, v7, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 346
    invoke-direct {v2, v4, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v25, v2

    goto :goto_4

    :cond_4
    const/4 v5, 0x4

    const/4 v15, 0x3

    move-object/from16 v25, v1

    .line 347
    :goto_4
    new-instance v1, Lkotlin/Pair;

    invoke-static {v5, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v2, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 348
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_5

    .line 349
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$34;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$34;

    .line 350
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 351
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v5, 0x4

    invoke-static {v5, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 352
    invoke-static {v15, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 353
    invoke-direct {v4, v6, v7, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 354
    invoke-direct {v2, v4, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v26, v2

    goto :goto_5

    :cond_5
    const/4 v5, 0x4

    const/4 v15, 0x3

    move-object/from16 v26, v1

    .line 355
    :goto_5
    new-instance v1, Lkotlin/Pair;

    invoke-static {v5, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v2, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 356
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_6

    .line 357
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$35;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$35;

    .line 358
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 359
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v5, 0x4

    invoke-static {v5, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 360
    invoke-static {v15, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 361
    invoke-direct {v4, v6, v7, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 362
    invoke-direct {v2, v4, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v27, v2

    goto :goto_6

    :cond_6
    const/4 v5, 0x4

    const/4 v15, 0x3

    move-object/from16 v27, v1

    .line 363
    :goto_6
    new-instance v1, Lkotlin/Pair;

    invoke-static {v5, v12}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v12}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v1, v2, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 364
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_7

    .line 365
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v1, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$36;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$36;

    .line 366
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 367
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v5, 0x4

    invoke-static {v5, v12}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    const/4 v15, 0x3

    .line 368
    invoke-static {v15, v12}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 369
    invoke-direct {v4, v5, v7, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 370
    invoke-direct {v2, v4, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v28, v2

    goto :goto_7

    :cond_7
    move-object/from16 v28, v1

    .line 371
    :goto_7
    filled-new-array/range {v21 .. v28}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 372
    new-instance v2, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$17;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$17;-><init>(Lw7/u;Ln7/f;)V

    move-object/from16 v0, v19

    move-object/from16 v3, v20

    .line 373
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    move-object/from16 v1, p0

    .line 374
    invoke-virtual {v1, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v0
.end method

.method public final build$expo_modules_core_release()Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->asyncFunctionComponent:Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v1, "Required value was null."

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final getAsyncFunctionComponent()Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->asyncFunctionComponent:Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->converters:Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->asyncFunctionComponent:Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;

    .line 2
    .line 3
    return-void
.end method
