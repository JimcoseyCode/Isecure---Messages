.class public final Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/common/mapbuffer/MapBuffer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;",
        "",
        "<init>",
        "()V",
        "LB7/c;",
        "KEY_RANGE",
        "LB7/c;",
        "getKEY_RANGE$ReactAndroid_release",
        "()LB7/c;",
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
.field static final synthetic $$INSTANCE:Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;

.field private static final KEY_RANGE:LB7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;->$$INSTANCE:Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;

    .line 7
    .line 8
    new-instance v0, LB7/c;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const v2, 0xffff

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, LB7/c;-><init>(II)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;->KEY_RANGE:LB7/c;

    .line 18
    .line 19
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


# virtual methods
.method public final getKEY_RANGE$ReactAndroid_release()LB7/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/common/mapbuffer/MapBuffer$Companion;->KEY_RANGE:LB7/c;

    .line 2
    .line 3
    return-object v0
.end method
