.class public final Lexpo/modules/sharing/SharingSingleton;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lexpo/modules/sharing/SharingSingleton;",
        "",
        "<init>",
        "()V",
        "intent",
        "Landroid/content/Intent;",
        "getIntent",
        "()Landroid/content/Intent;",
        "setIntent",
        "(Landroid/content/Intent;)V",
        "expo-sharing_release"
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
.field public static final INSTANCE:Lexpo/modules/sharing/SharingSingleton;

.field private static intent:Landroid/content/Intent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/sharing/SharingSingleton;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/sharing/SharingSingleton;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/sharing/SharingSingleton;->INSTANCE:Lexpo/modules/sharing/SharingSingleton;

    .line 7
    .line 8
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
.method public final getIntent()Landroid/content/Intent;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/sharing/SharingSingleton;->intent:Landroid/content/Intent;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    sput-object p1, Lexpo/modules/sharing/SharingSingleton;->intent:Landroid/content/Intent;

    .line 2
    .line 3
    return-void
.end method
