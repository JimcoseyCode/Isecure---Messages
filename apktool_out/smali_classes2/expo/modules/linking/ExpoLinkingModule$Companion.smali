.class public final Lexpo/modules/linking/ExpoLinkingModule$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/linking/ExpoLinkingModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR6\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\r0\u000c0\u000b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lexpo/modules/linking/ExpoLinkingModule$Companion;",
        "",
        "<init>",
        "()V",
        "Landroid/net/Uri;",
        "initialURL",
        "Landroid/net/Uri;",
        "getInitialURL",
        "()Landroid/net/Uri;",
        "setInitialURL",
        "(Landroid/net/Uri;)V",
        "",
        "Lkotlin/Function1;",
        "Li7/B;",
        "onURLReceivedObservers",
        "Ljava/util/Set;",
        "getOnURLReceivedObservers",
        "()Ljava/util/Set;",
        "setOnURLReceivedObservers",
        "(Ljava/util/Set;)V",
        "expo-linking_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/linking/ExpoLinkingModule$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInitialURL()Landroid/net/Uri;
    .locals 1

    .line 1
    invoke-static {}, Lexpo/modules/linking/ExpoLinkingModule;->access$getInitialURL$cp()Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getOnURLReceivedObservers()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lkotlin/jvm/functions/Function1;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lexpo/modules/linking/ExpoLinkingModule;->access$getOnURLReceivedObservers$cp()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final setInitialURL(Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lexpo/modules/linking/ExpoLinkingModule;->access$setInitialURL$cp(Landroid/net/Uri;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setOnURLReceivedObservers(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lkotlin/jvm/functions/Function1;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lexpo/modules/linking/ExpoLinkingModule;->access$setOnURLReceivedObservers$cp(Ljava/util/Set;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
